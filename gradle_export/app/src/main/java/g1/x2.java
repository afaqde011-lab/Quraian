package g1;

import java.util.Arrays;

public final class x2 implements u00.p {
    public final z00.e A;
    public final h1.t B;
    public final int C;
    public final int D;
    public final u00.k E;
    public final d6 F;
    public final h1 G;

    public x2(z00.e eVar, h1.t tVar, int i10, int i11, u00.k kVar, d6 d6Var, h1 h1Var) {
        this.A = eVar;
        this.B = tVar;
        this.C = i10;
        this.D = i11;
        this.E = kVar;
        this.F = d6Var;
        this.G = h1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        l1.j jVar = (l1.j) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= ((l1.g0) jVar).e(iIntValue) ? 32 : 16;
        }
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            int i10 = iIntValue + ((z00.c) this.A).A;
            String strA = y.a(i10, this.B.f6528a, 7);
            b2.r rVarJ = h0.z1.j(b2.o.A, k1.h.f8763z, k1.h.f8762y);
            boolean z10 = i10 == this.C;
            boolean z11 = i10 == this.D;
            u00.k kVar = this.E;
            boolean zG = g0Var.g(kVar) | g0Var.e(i10);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new eq.d(i10, 2, kVar);
                g0Var.n0(objN);
            }
            a3.m(strA, rVarJ, z10, z11, (u00.a) objN, this.F.b(i10), String.format(h1.f.l(jVar, 2131886665), Arrays.copyOf(new Object[]{strA}, 1)), this.G, jVar, 48);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
