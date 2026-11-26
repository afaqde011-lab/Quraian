package h0;

public final class p2 extends b2.q implements b3.y {
    public z O;
    public boolean P;
    public u00.n Q;

    @Override
    public final z2.x0 e(final z2.y0 y0Var, z2.v0 v0Var, long j9) {
        z zVar = this.O;
        z zVar2 = z.A;
        int iJ = zVar != zVar2 ? 0 : y3.a.j(j9);
        z zVar3 = this.O;
        z zVar4 = z.B;
        final z2.l1 l1VarO = v0Var.O(y3.b.a(iJ, (this.O == zVar2 || !this.P) ? y3.a.h(j9) : Integer.MAX_VALUE, zVar3 == zVar4 ? y3.a.i(j9) : 0, (this.O == zVar4 || !this.P) ? y3.a.g(j9) : Integer.MAX_VALUE));
        final int iY = ab.a0.y(l1VarO.A, y3.a.j(j9), y3.a.h(j9));
        final int iY2 = ab.a0.y(l1VarO.B, y3.a.i(j9), y3.a.g(j9));
        return y0Var.o0(iY, iY2, h00.y.A, new u00.k() {
            public final Object invoke(Object obj) {
                u00.n nVar = this.A.Q;
                z2.l1 l1Var = l1VarO;
                z2.k1.j((z2.k1) obj, l1Var, ((y3.j) nVar.invoke(new y3.l((((long) (iY - l1Var.A)) << 32) | (((long) (iY2 - l1Var.B)) & 4294967295L)), y0Var.getLayoutDirection())).f16590a);
                return g00.b0.a;
            }
        });
    }
}
