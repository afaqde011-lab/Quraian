package g1;

public final class j5 implements u00.o {
    public final String A;
    public final boolean B;
    public final boolean C;
    public final r3.e0 D;
    public final f0.i E;
    public final boolean F;
    public final u00.n G;
    public final t6 H;
    public final i2.t0 I;

    public j5(String str, boolean z10, boolean z11, r3.e0 e0Var, f0.i iVar, boolean z12, u00.n nVar, t6 t6Var, i2.t0 t0Var) {
        this.A = str;
        this.B = z10;
        this.C = z11;
        this.D = e0Var;
        this.E = iVar;
        this.F = z12;
        this.G = nVar;
        this.H = t6Var;
        this.I = t0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u00.n nVar = (u00.n) obj;
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.g0) jVar).i(nVar) ? 4 : 2;
        }
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            c5 c5Var = c5.f5746a;
            i2.t0 t0Var = this.I;
            boolean z10 = this.B;
            boolean z11 = this.F;
            f0.i iVar = this.E;
            t6 t6Var = this.H;
            c5Var.b(this.A, nVar, z10, this.C, this.D, iVar, z11, null, this.G, null, t6Var, null, v1.d.d(-656940872, new h5(z10, z11, iVar, t6Var, t0Var, 1), jVar), jVar, (iIntValue << 3) & 112, 14155776, 32768);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
