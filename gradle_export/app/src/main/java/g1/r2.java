package g1;

import kotlin.NoWhenBranchMatchedException;

public final class r2 implements u00.n {
    public final j0.v A;
    public final z00.e B;
    public final h1.t C;
    public final h1.w D;
    public final u00.k E;
    public final h1.s F;
    public final Long G;
    public final r1 H;
    public final d6 I;
    public final h1 J;

    public r2(j0.v vVar, z00.e eVar, h1.t tVar, h1.w wVar, u00.k kVar, h1.s sVar, Long l, r1 r1Var, d6 d6Var, h1 h1Var) {
        this.A = vVar;
        this.B = eVar;
        this.C = tVar;
        this.D = wVar;
        this.E = kVar;
        this.F = sVar;
        this.G = l;
        this.H = r1Var;
        this.I = d6Var;
        this.J = h1Var;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = new e6.c(22);
                g0Var.n0(objN);
            }
            b2.r rVarC = j3.q.c(b2.o.A, false, (u00.k) objN);
            l1 l1Var = l1.f5852a;
            x.t tVar = new x.t(new gg.e(4));
            x.b1 b1VarP = x5.p(k1.q.C, jVar);
            boolean zG = g0Var.g(tVar);
            j0.v vVar = this.A;
            boolean zG2 = zG | g0Var.g(vVar);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                k1 k1Var = new k1(new e0.c(vVar, e0.n.f4951b));
                float f3 = e0.l.f4950a;
                objN2 = new e0.h(k1Var, tVar, b1VarP);
                g0Var.n0(objN2);
            }
            e0.h hVar = (e0.h) objN2;
            boolean zI = g0Var.i(this.B) | g0Var.i(this.C) | g0Var.g(this.D) | g0Var.g(this.E);
            h1.s sVar = this.F;
            boolean zG3 = zI | g0Var.g(sVar) | g0Var.g(this.G) | g0Var.i(this.H) | g0Var.g(this.I);
            h1 h1Var = this.J;
            boolean zG4 = zG3 | g0Var.g(h1Var);
            Object objN3 = g0Var.N();
            if (zG4 || objN3 == cVar) {
                p2 p2Var = new p2(this.B, this.C, this.D, this.E, sVar, this.G, this.H, this.I, h1Var, 0);
                g0Var.n0(p2Var);
                objN3 = p2Var;
            }
            k00.f.e(rVarC, vVar, (h0.n1) null, (h0.e) null, (b2.h) null, hVar, false, (z.h1) null, (u00.k) objN3, jVar, 0, 444);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
