package j1;

import g00.b0;
import g1.v5;
import h0.z1;
import l1.g0;

public final class f implements u00.o {
    public final long A;
    public final r B;

    public f(long j9, r rVar) {
        this.A = j9;
        this.B = rVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((g0) jVar).h(zBooleanValue) ? 4 : 2;
        }
        g0 g0Var = (g0) jVar;
        if (!g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            g0Var.V();
        } else if (zBooleanValue) {
            g0Var.c0(-499784343);
            v5.a(z1.m(b2.o.A, k.f7847c), this.A, k.f7845a, 0L, 0, 0.0f, jVar, 390, 56);
            g0Var.r(false);
        } else {
            g0Var.c0(-499540745);
            final r rVar = this.B;
            boolean zG = g0Var.g(rVar);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new h1.g0() {
                    @Override
                    public final float invoke() {
                        return ((Number) rVar.f7852a.d()).floatValue();
                    }
                };
                g0Var.n0(objN);
            }
            k.a((h1.g0) objN, this.A, jVar, 0);
            g0Var.r(false);
        }
        return b0.a;
    }
}
