package g1;

public final class o0 extends b3.l implements b3.e2, b3.j, b3.x {
    public h Q;
    public boolean R;
    public int S;
    public x.b1 T;
    public float U;
    public float V;
    public final l1.i1 W = l1.q.z(new y3.j(0));
    public final v2.j0 X;
    public final v2.j0 Y;

    public o0(h hVar, boolean z10, int i10, x.b1 b1Var) {
        this.Q = hVar;
        this.R = z10;
        this.S = i10;
        this.T = b1Var;
        v2.j0 j0VarA = v2.f0.a(new n0(this, 1));
        B1(j0VarA);
        this.X = j0VarA;
        v2.j0 j0VarA2 = v2.f0.a(new n0(this, 0));
        B1(j0VarA2);
        this.Y = j0VarA2;
    }

    public static final float E1(o0 o0Var) {
        y3.c cVar = b3.m.y(o0Var).Z;
        return (cVar.A0(z7.f6053h) * cVar.R0(o0Var.Q.i())) / cVar.R0(k1.d0.f8590b);
    }

    @Override
    public final void A(v2.k kVar, v2.l lVar, long j9) {
        this.X.A(kVar, lVar, j9);
        this.Y.A(kVar, lVar, j9);
    }

    @Override
    public final void X() {
        this.X.X();
        this.Y.X();
    }

    @Override
    public final void d(long j9) {
        this.W.setValue(new y3.j(kh.n.I(j9)));
        this.Q.f5809c.setValue(new y3.f(b3.m.y(this).Z.h0((int) (j9 >> 32))));
    }
}
