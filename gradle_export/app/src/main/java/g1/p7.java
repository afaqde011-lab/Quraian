package g1;

import kotlin.NoWhenBranchMatchedException;

public final class p7 implements u00.n {
    public final u.v A;
    public final h B;
    public final boolean C;

    public p7(u.v vVar, h hVar, boolean z10) {
        this.A = vVar;
        this.B = hVar;
        this.C = z10;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        b2.o oVar;
        h hVar;
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            g0Var.c0(1866272144);
            u.v vVar = this.A;
            int i10 = vVar.f14904b;
            int i11 = 0;
            while (true) {
                oVar = b2.o.A;
                hVar = this.B;
                if (i11 >= i10) {
                    break;
                }
                int iC = (!hVar.f5807a.f() || hVar.f5807a.e() == 1) ? vVar.c(i11) : vVar.c(i11) % 12;
                boolean zE = g0Var.e(i11);
                Object objN = g0Var.N();
                if (zE || objN == l1.i.f9868a) {
                    objN = new s1(i11, 1);
                    g0Var.n0(objN);
                }
                z7.d(j3.q.c(oVar, false, (u00.k) objN), hVar, iC, this.C, jVar, 0);
                i11++;
            }
            g0Var.r(false);
            if (hVar.f5807a.e() == 0 && hVar.f5807a.f()) {
                g0Var.c0(2020585964);
                z7.a(z.n.f(h0.z1.m(z2.d0.m(oVar, s3.B), k1.d0.f8590b), i2.t.f7166f, p0.f.f12243a), z7.f6047b, v1.d.d(-1385767514, new o7(hVar, this.C), jVar), jVar, 432);
                g0Var.r(false);
            } else {
                g0Var.c0(2021505641);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
