package g1;

public final class m5 implements u00.n {
    public final b2.r A;
    public final u00.n B;
    public final boolean C;
    public final t6 D;
    public final r3.w E;
    public final u00.k F;
    public final boolean G;
    public final m3.r0 H;
    public final q0.i1 I;
    public final q0.h1 J;
    public final boolean K;
    public final int L;
    public final int M;
    public final r3.e0 N;
    public final f0.i O;
    public final u00.n P;
    public final u00.n Q;
    public final i2.t0 R;

    public m5(b2.r rVar, u00.n nVar, boolean z10, t6 t6Var, r3.w wVar, u00.k kVar, boolean z11, m3.r0 r0Var, q0.i1 i1Var, q0.h1 h1Var, boolean z12, int i10, int i11, r3.e0 e0Var, f0.i iVar, u00.n nVar2, u00.n nVar3, i2.t0 t0Var) {
        this.A = rVar;
        this.B = nVar;
        this.C = z10;
        this.D = t6Var;
        this.E = wVar;
        this.F = kVar;
        this.G = z11;
        this.H = r0Var;
        this.I = i1Var;
        this.J = h1Var;
        this.K = z12;
        this.L = i10;
        this.M = i11;
        this.N = e0Var;
        this.O = iVar;
        this.P = nVar2;
        this.Q = nVar3;
        this.R = t0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            u00.n nVar = this.B;
            b2.r rVarG = b2.o.A;
            if (nVar != null) {
                g0Var.c0(-1901539802);
                Object objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = new e6.c(18);
                    g0Var.n0(objN);
                }
                rVarG = h0.c.G(j3.q.c(rVarG, true, (u00.k) objN), 0.0f, h1.e1.f(jVar), 0.0f, 0.0f, 13);
                g0Var.r(false);
            } else {
                g0Var.c0(-1901156115);
                g0Var.r(false);
            }
            b2.r rVarV = this.A.V(rVarG);
            String strL = h1.f.l(jVar, 2131886403);
            boolean z10 = this.C;
            b2.r rVarA = h0.z1.a(h1.e1.d(rVarV, z10, strL), c5.f5748c, c5.f5747b);
            t6 t6Var = this.D;
            i2.v0 v0Var = new i2.v0(z10 ? t6Var.f5978j : t6Var.f5977i);
            u00.n nVar2 = this.Q;
            i2.t0 t0Var = this.R;
            r3.w wVar = this.E;
            boolean z11 = this.G;
            boolean z12 = this.K;
            r3.e0 e0Var = this.N;
            f0.i iVar = this.O;
            q0.c0.b(wVar, this.F, rVarA, z11, this.H, this.I, this.J, z12, this.L, this.M, e0Var, null, iVar, v0Var, v1.d.d(674541106, new l5(wVar, z11, z12, e0Var, iVar, this.C, this.B, this.P, nVar2, t6Var, t0Var), jVar), jVar, 0, 196608, 4096);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
