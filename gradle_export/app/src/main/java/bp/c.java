package bp;

import ep.k;
import wo.c0;

public final class c {
    public final c0 a;
    public final a b;
    public final nm.b c;
    public final rw.a d;

    public c(c0 c0Var, a aVar, nm.b bVar, rw.a aVar2) {
        this.a = c0Var;
        this.b = aVar;
        this.c = bVar;
        this.d = aVar2;
    }

    public final void a(k kVar) {
        if (this.a.a.isAuthorized()) {
            this.b.a();
            this.c.b(kVar, "FORCED_LOGOUT_NAVIGATION_KEY");
            this.d.a();
        }
    }
}
