package g1;

import kotlin.NoWhenBranchMatchedException;

public final class l implements u00.n {
    public final b2.r A;
    public final x.k0 B;
    public final l1.z0 C;
    public final z.p1 D;
    public final i2.t0 E;
    public final long F;
    public final float G;
    public final float H;
    public final v1.c I;

    public l(b2.r rVar, x.k0 k0Var, l1.z0 z0Var, z.p1 p1Var, i2.t0 t0Var, long j9, float f3, float f10, v1.c cVar) {
        this.A = rVar;
        this.B = k0Var;
        this.C = z0Var;
        this.D = p1Var;
        this.E = t0Var;
        this.F = j9;
        this.G = f3;
        this.H = f10;
        this.I = cVar;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            z3.a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, jVar, 384);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
