package zu;

import android.content.SharedPreferences;
import d40.o;
import d40.p1;
import g00.s;
import gz.e1;
import kotlin.jvm.internal.m;
import n00.b;

public final class a {
    public final SharedPreferences a;
    public final p1 b = o.c(ru.a.A);
    public final p1 c;
    public e1 d;

    public a(SharedPreferences sharedPreferences) {
        ru.a aVar;
        this.a = sharedPreferences;
        Object obj = null;
        String string = sharedPreferences.getString("playback_last_owner", null);
        if (string != null) {
            b bVar = ru.a.D;
            bVar.getClass();
            s sVar = new s(bVar, 4);
            while (sVar.hasNext()) {
                Object next = sVar.next();
                if (m.a(((ru.a) next).name(), string)) {
                    obj = next;
                    break;
                }
            }
            aVar = (ru.a) obj;
            aVar = aVar == null ? ru.a.A : aVar;
        }
        this.c = o.c(aVar);
    }

    public final boolean a() {
        return this.b.getValue() == ru.a.A;
    }

    public final void b(ru.a aVar) {
        p1 p1Var = this.c;
        if (p1Var.getValue() != aVar) {
            p1Var.getClass();
            p1Var.k(null, aVar);
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putString("playback_last_owner", aVar.name());
            editorEdit.apply();
        }
        p1 p1Var2 = this.b;
        if (p1Var2.getValue() == aVar) {
            return;
        }
        p1Var2.getClass();
        p1Var2.k(null, aVar);
        e1 e1Var = this.d;
        if (e1Var != null) {
            e1Var.invoke(aVar);
        }
    }
}
