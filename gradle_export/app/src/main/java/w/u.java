package w;

public final class u extends h0.y0 {
    public x.j1 P;
    public l1.z0 Q;
    public v R;
    public long S;

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        long j10;
        z2.l1 l1VarO = v0Var.O(j9);
        if (y0Var.w0()) {
            j10 = (((long) l1VarO.A) << 32) | (((long) l1VarO.B) & 4294967295L);
        } else {
            x.j1 j1Var = this.P;
            if (j1Var == null) {
                j10 = (((long) l1VarO.A) << 32) | (((long) l1VarO.B) & 4294967295L);
                this.S = j10;
            } else {
                long j11 = (((long) l1VarO.B) & 4294967295L) | (((long) l1VarO.A) << 32);
                x.i1 i1VarA = j1Var.a(new t(this, j11, 0), new t(this, j11, 1));
                this.R.getClass();
                j10 = ((y3.l) i1VarA.getValue()).f16596a;
                this.S = ((y3.l) i1VarA.getValue()).f16596a;
            }
        }
        return y0Var.o0((int) (j10 >> 32), (int) (4294967295L & j10), h00.y.A, new s(this, l1VarO, j10));
    }

    @Override
    public final void v1() {
        this.S = m.f15790a;
    }
}
