package th;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import s10.w0;

public final class h {

    public static final h f14798b = new h();

    public final AtomicReference f14799a = new AtomicReference(new n(new w0(7)));

    public final Class a(Class cls) {
        HashMap map = ((n) this.f14799a.get()).f14809b;
        if (map.containsKey(cls)) {
            return ((mh.l) map.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(l lVar) {
        w0 w0Var = new w0((n) this.f14799a.get());
        w0Var.q(lVar);
        this.f14799a.set(new n(w0Var));
    }
}
