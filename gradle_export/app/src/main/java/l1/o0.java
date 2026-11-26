package l1;

public final class o0 implements y1, a40.x {
    public final k00.i A;
    public final u00.n B;
    public final f40.c C;
    public a40.u1 D;

    public o0(k00.i iVar, u00.n nVar) {
        this.A = iVar;
        this.B = nVar;
        this.C = a40.c0.c(iVar.plus(this));
    }

    @Override
    public final void b() {
        a40.u1 u1Var = this.D;
        if (u1Var != null) {
            u1Var.t(new b0(1));
        }
        this.D = null;
    }

    @Override
    public final void c() {
        a40.u1 u1Var = this.D;
        if (u1Var != null) {
            u1Var.t(new b0(1));
        }
        this.D = null;
    }

    @Override
    public final void d() {
        a40.u1 u1Var = this.D;
        if (u1Var != null) {
            u1Var.i(a40.c0.a("Old job was still running!", (Throwable) null));
        }
        this.D = a40.c0.y(this.C, (k00.i) null, (a40.a0) null, this.B, 3);
    }

    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    public final k00.h getKey() {
        return a40.w.A;
    }

    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }

    public final void v(Throwable th2, k00.i iVar) throws Throwable {
        a2.e eVar = (a2.e) iVar.get(a2.e.B);
        if (eVar != null) {
            ab.a0.H0(th2, new a1.o1(eVar, this, 3));
        }
        a40.x xVar = this.A.get(a40.w.A);
        if (xVar == null) {
            throw th2;
        }
        xVar.v(th2, iVar);
    }
}
