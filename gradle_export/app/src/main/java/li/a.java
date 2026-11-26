package li;

import android.util.Log;
import de.g;
import ii.n;
import java.util.concurrent.atomic.AtomicReference;
import k7.t;
import ri.k1;

public final class a {

    public static final c f10292c = new c();

    public final n f10293a;

    public final AtomicReference f10294b = new AtomicReference(null);

    public a(n nVar) {
        this.f10293a = nVar;
        nVar.a(new t(this, 10));
    }

    public final c a(String str) {
        a aVar = (a) this.f10294b.get();
        return aVar == null ? f10292c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f10294b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f10294b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j9, k1 k1Var) {
        String strO = a1.b.o("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strO, null);
        }
        this.f10293a.a(new g(str, j9, k1Var));
    }
}
