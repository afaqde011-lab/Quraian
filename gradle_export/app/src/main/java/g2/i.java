package g2;

import u.d0;
import u.j0;
import u.r0;

public final class i {

    public final n f6066a;

    public final c3.z f6067b;

    public final j0 f6068c;

    public final j0 f6069d;

    public boolean f6070e;

    public i(n nVar, c3.z zVar) {
        this.f6066a = nVar;
        this.f6067b = zVar;
        j0 j0Var = r0.f14890a;
        this.f6068c = new j0();
        this.f6069d = new j0();
    }

    public final void a() {
        if (this.f6070e) {
            return;
        }
        av.k kVar = new av.k(0, this, i.class, "invalidateNodes", "invalidateNodes()V", 0, 11);
        d0 d0Var = this.f6067b.Y0;
        if (d0Var.g(kVar) < 0) {
            d0Var.a(kVar);
        }
        this.f6070e = true;
    }
}
