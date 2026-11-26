package r5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import b3.k0;
import bt.g2;
import d6.w0;
import g00.b0;
import g00.p;
import h00.q;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import ri.t1;

public final class c implements DataMigration {

    public final w0 f13116a;

    public final g2 f13117b;

    public final Context f13118c;

    public final String f13119d;

    public final p f13120e;

    public final Set f13121f;

    public c(Context context, String str, Set set, w0 w0Var, g2 g2Var) {
        m.e(context, "context");
        m.e(str, "sharedPreferencesName");
        m.e(set, "keysToMigrate");
        k0 k0Var = new k0(context, str, 21);
        this.f13116a = w0Var;
        this.f13117b = g2Var;
        this.f13118c = context;
        this.f13119d = str;
        this.f13120e = rd.a.J(k0Var);
        this.f13121f = set == d.f13122a ? null : q.q1(set);
    }

    @Override
    public final Object cleanUp(k00.c cVar) throws IOException {
        Context context;
        String str;
        p pVar = this.f13120e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) pVar.getValue()).edit();
        Set set = this.f13121f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) pVar.getValue()).getAll().isEmpty() && (context = this.f13118c) != null && (str = this.f13119d) != null) {
            a.a(context, str);
        }
        if (set != null) {
            set.clear();
        }
        return b0.a;
    }

    @Override
    public final Object migrate(Object obj, k00.c cVar) {
        return this.f13117b.invoke(new e((SharedPreferences) this.f13120e.getValue(), this.f13121f), obj, cVar);
    }

    @Override
    public final Object shouldMigrate(Object obj, k00.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.D = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objInvoke = bVar.B;
        l00.a aVar = l00.a.A;
        int i11 = bVar.D;
        boolean z10 = true;
        if (i11 == 0) {
            t1.O(objInvoke);
            bVar.A = this;
            bVar.D = 1;
            objInvoke = this.f13116a.invoke(obj, bVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = bVar.A;
            t1.O(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = this.f13121f;
        p pVar = this.f13120e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) pVar.getValue()).getAll();
            m.d(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) pVar.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z10 = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
