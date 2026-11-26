package l0;

public final class c extends b2.q {
    public k3.d O;
    public final d P;

    public c(d dVar) {
        this.P = dVar;
    }

    public final void B1() {
        h1.v0 v0Var = new h1.v0(this, this.P, 17);
        b3.l0 l0VarY = b3.m.y(this);
        int i10 = l0VarY.B;
        k3.b rectManager = ((c3.z) b3.p0.a(l0VarY)).getRectManager();
        k3.e eVar = rectManager.f8933c;
        eVar.getClass();
        u.w wVar = eVar.f8957a;
        k3.d dVar = new k3.d(eVar, i10, this, v0Var);
        Object objB = wVar.b(i10);
        if (objB == null) {
            wVar.i(i10, dVar);
            objB = dVar;
        }
        k3.d dVar2 = (k3.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                k3.d dVar3 = dVar2.f8952d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.f8952d = dVar;
        }
        if (b3.m.y(this.A).G) {
            rectManager.f8932b.D(i10, true);
        }
        rectManager.f8935e = true;
        rectManager.h();
        this.O = dVar;
    }

    @Override
    public final void t1() {
        d dVar = this.P;
        dVar.B = this;
        if (dVar.C != null) {
            B1();
        }
    }

    @Override
    public final void u1() {
        d dVar = this.P;
        if (dVar.B == this) {
            dVar.B = null;
        }
        k3.d dVar2 = this.O;
        if (dVar2 != null) {
            dVar2.b();
        }
        this.O = null;
    }
}
