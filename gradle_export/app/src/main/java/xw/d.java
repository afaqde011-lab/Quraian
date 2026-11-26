package xw;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import bt.y1;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import d40.o;
import d40.p1;
import g00.b0;
import h00.q;
import h00.x;
import java.util.List;
import java.util.Locale;
import ri.t1;

public final class d {
    public final zw.a a;
    public final DataStore b;
    public final LocaleManager c;
    public final SharedPreferences d;
    public final y1 f;
    public final j40.c e = j40.d.a();
    public final p1 g = o.c(x.A);

    public d(uw.f fVar, zw.a aVar, DataStore dataStore, uw.b bVar, LocaleManager localeManager, SharedPreferences sharedPreferences) {
        this.a = aVar;
        this.b = dataStore;
        this.c = localeManager;
        this.d = sharedPreferences;
        this.f = new y1(dataStore.getData(), bVar, 26);
    }

    public final Object a(int i, m00.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.D = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objU = aVar.B;
        l00.a aVar2 = l00.a.A;
        int i3 = aVar.D;
        b0 b0Var = b0.a;
        if (i3 == 0) {
            t1.O(objU);
            aVar.A = i;
            aVar.D = 1;
            objU = o.u(this.f, aVar);
            if (objU != aVar2) {
            }
            return aVar2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objU);
            return b0Var;
        }
        i = aVar.A;
        t1.O(objU);
        List list = (List) objU;
        if (list != null) {
            tq.b bVar = new tq.b(q.o1(list), i, null, 2);
            aVar.A = i;
            aVar.D = 2;
            if (this.b.updateData(bVar, aVar) == aVar2) {
                return aVar2;
            }
        }
        return b0Var;
    }

    public final Object b(boolean z, m00.c cVar) throws Throwable {
        b bVar;
        j40.a aVar;
        boolean z2;
        int i;
        j40.a aVar2;
        b0 b0Var;
        p1 p1Var;
        j40.a aVar3;
        long j;
        boolean z3;
        int i2;
        long j2;
        int i3;
        b0 b0Var2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i4 = bVar.I;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.I = i4 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.G;
        l00.a aVar4 = l00.a.A;
        int i5 = bVar.I;
        b0 b0Var3 = b0.a;
        p1 p1Var2 = this.g;
        SharedPreferences sharedPreferences = this.d;
        try {
            if (i5 == 0) {
                t1.O(obj);
                aVar = this.e;
                bVar.B = aVar;
                z2 = z;
                bVar.A = z2;
                bVar.C = 0;
                bVar.I = 1;
                if (aVar.l(bVar) != aVar4) {
                    i = 0;
                }
                return aVar4;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    long j3 = bVar.F;
                    j2 = bVar.E;
                    i3 = bVar.D;
                    i2 = bVar.C;
                    z3 = bVar.A;
                    aVar3 = bVar.B;
                    try {
                        t1.O(obj);
                        b0Var = b0Var3;
                        p1Var = p1Var2;
                        j = j3;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong("KEY_COLLECTION_FETCHED_AT", jCurrentTimeMillis);
                        editorEdit.putString("KEY_COLLECTION_LAST_SAVED_LANG", c());
                        editorEdit.apply();
                        List listX = uw.f.X((vw.b) obj);
                        bVar.B = aVar3;
                        bVar.A = z3;
                        bVar.C = i2;
                        bVar.D = i3;
                        bVar.E = j2;
                        bVar.F = j;
                        bVar.I = 3;
                        p1Var.emit(listX, bVar);
                        b0Var2 = b0Var;
                        if (b0Var2 != aVar4) {
                            aVar2 = aVar3;
                        }
                        return aVar4;
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = aVar3;
                        aVar2.i(null);
                        throw th;
                    }
                }
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = bVar.B;
                try {
                    t1.O(obj);
                    b0Var2 = b0Var3;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.i(null);
                    throw th;
                }
                aVar = aVar2;
                aVar.i(null);
                return b0Var2;
            }
            int i6 = bVar.C;
            boolean z4 = bVar.A;
            j40.a aVar5 = bVar.B;
            t1.O(obj);
            i = i6;
            z2 = z4;
            aVar = aVar5;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j4 = sharedPreferences.getLong("KEY_COLLECTION_FETCHED_AT", 0L);
            String strC = c();
            b0Var = b0Var3;
            p1Var = p1Var2;
            String string = sharedPreferences.getString("KEY_COLLECTION_LAST_SAVED_LANG", null);
            if (z2 || jCurrentTimeMillis2 - j4 >= HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS || ((List) p1Var.getValue()).isEmpty() || !strC.equals(string)) {
                zw.a aVar6 = this.a;
                String strC2 = c();
                bVar.B = aVar;
                bVar.A = z2;
                bVar.C = i;
                bVar.D = 0;
                bVar.E = jCurrentTimeMillis2;
                bVar.F = j4;
                bVar.I = 2;
                Object objA = aVar6.a(strC2, bVar);
                if (objA != aVar4) {
                    aVar3 = aVar;
                    obj = objA;
                    j = j4;
                    z3 = z2;
                    i2 = i;
                    j2 = jCurrentTimeMillis2;
                    i3 = 0;
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.putLong("KEY_COLLECTION_FETCHED_AT", jCurrentTimeMillis3);
                    editorEdit2.putString("KEY_COLLECTION_LAST_SAVED_LANG", c());
                    editorEdit2.apply();
                    List listX2 = uw.f.X((vw.b) obj);
                    bVar.B = aVar3;
                    bVar.A = z3;
                    bVar.C = i2;
                    bVar.D = i3;
                    bVar.E = j2;
                    bVar.F = j;
                    bVar.I = 3;
                    p1Var.emit(listX2, bVar);
                    b0Var2 = b0Var;
                    if (b0Var2 != aVar4) {
                        aVar2 = aVar3;
                        aVar = aVar2;
                    }
                }
                return aVar4;
            }
            b0Var2 = b0Var;
            aVar.i(null);
            return b0Var2;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    public final String c() {
        String language;
        LocaleManager localeManager = this.c;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        return (locale == null || (language = locale.getLanguage()) == null) ? "en" : language;
    }
}
