package w;

public final class i extends kotlin.jvm.internal.n implements u00.o {
    public final z1.p A;
    public final Object B;
    public final v C;
    public final v1.c D;

    public i(z1.p pVar, Object obj, v vVar, v1.c cVar) {
        super(3);
        this.A = pVar;
        this.B = obj;
        this.C = vVar;
        this.D = cVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d0 d0Var = (d0) obj;
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((l1.g0) jVar).g(d0Var) : ((l1.g0) jVar).i(d0Var) ? 4 : 2;
        }
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            z1.p pVar = this.A;
            boolean zG = g0Var.g(pVar);
            Object obj4 = this.B;
            boolean zI = zG | g0Var.i(obj4);
            v vVar = this.C;
            boolean zI2 = zI | g0Var.i(vVar);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zI2 || objN == cVar) {
                objN = new b3.n0(pVar, obj4, vVar, 5);
                g0Var.n0(objN);
            }
            l1.q.e(d0Var, (u00.k) objN, jVar);
            u.i0 i0Var = vVar.f15815d;
            kotlin.jvm.internal.m.c(d0Var, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            i0Var.m(obj4, ((e0) d0Var).f15755b);
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new p(d0Var);
                g0Var.n0(objN2);
            }
            this.D.invoke((p) objN2, obj4, jVar, 0);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
