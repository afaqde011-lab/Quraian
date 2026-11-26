package l1;

import java.util.Collection;

public final class e2 extends f5.c {
    public Object C;
    public Object D;
    public u.j0 E;
    public u.j0 F;
    public c40.w G;
    public final h00.a H;
    public final y8.g I;

    public e2() {
        super(5);
        this.H = new h00.a(this, 18);
        a1.y1 y1Var = new a1.y1(this, 29);
        z1.l.e(z1.l.f17036a);
        synchronized (z1.l.f17038c) {
            z1.l.f17043h = h00.q.Z0(y1Var, (Collection) z1.l.f17043h);
        }
        this.I = new y8.g(y1Var, 2);
    }

    @Override
    public final void B0(c40.w wVar) {
        this.D = null;
        this.F = null;
    }

    @Override
    public final void C0() {
        synchronized (this.B) {
            try {
                this.C = this.D;
                if (this.F == null) {
                    this.E = null;
                } else {
                    if (this.E == null) {
                        u.j0 j0Var = u.r0.f14890a;
                        this.E = new u.j0();
                    }
                    u.j0 j0Var2 = this.E;
                    this.E = this.F;
                    this.F = j0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void G0() {
        this.I.a();
        this.D = null;
        this.F = null;
        synchronized (this.B) {
            this.G = null;
            this.C = null;
            this.E = null;
        }
    }

    @Override
    public final u00.k P0(c40.w wVar) {
        c40.w wVar2 = this.G;
        if (wVar2 != null && !wVar2.equals(wVar)) {
            n1.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.G = wVar;
        return this.H;
    }
}
