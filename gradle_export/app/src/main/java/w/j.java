package w;

public final class j extends kotlin.jvm.internal.n implements u00.n {
    public final x.n1 A;
    public final Object B;
    public final u00.k C;
    public final v D;
    public final z1.p E;
    public final v1.c F;

    public j(x.n1 n1Var, Object obj, u00.k kVar, v vVar, z1.p pVar, v1.c cVar) {
        super(2);
        this.A = n1Var;
        this.B = obj;
        this.C = kVar;
        this.D = vVar;
        this.E = pVar;
        this.F = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objN = g0Var.N();
            u00.k kVar = this.C;
            v vVar = this.D;
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = (j0) kVar.invoke(vVar);
                g0Var.n0(objN);
            }
            j0 j0Var = (j0) objN;
            x.n1 n1Var = this.A;
            x.k1 k1VarF = n1Var.f();
            l1.i1 i1Var = n1Var.f16326d;
            Object objC = k1VarF.c();
            Object obj3 = this.B;
            boolean zH = g0Var.h(kotlin.jvm.internal.m.a(objC, obj3));
            Object objN2 = g0Var.N();
            if (zH || objN2 == cVar) {
                objN2 = kotlin.jvm.internal.m.a(n1Var.f().c(), obj3) ? y0.f15822b : ((j0) kVar.invoke(vVar)).f15777b;
                g0Var.n0(objN2);
            }
            y0 y0Var = (y0) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                objN3 = new q(kotlin.jvm.internal.m.a(obj3, i1Var.getValue()));
                g0Var.n0(objN3);
            }
            q qVar = (q) objN3;
            x0 x0Var = j0Var.f15776a;
            boolean zI = g0Var.i(j0Var);
            Object objN4 = g0Var.N();
            if (zI || objN4 == cVar) {
                objN4 = new w1(j0Var, 1);
                g0Var.n0(objN4);
            }
            b2.r rVarL = z2.d0.l(b2.o.A, (u00.o) objN4);
            qVar.A.setValue(Boolean.valueOf(kotlin.jvm.internal.m.a(obj3, i1Var.getValue())));
            b2.r rVarV = rVarL.V(qVar);
            boolean zI2 = g0Var.i(obj3);
            Object objN5 = g0Var.N();
            if (zI2 || objN5 == cVar) {
                objN5 = new g(obj3, 0);
                g0Var.n0(objN5);
            }
            u00.k kVar2 = (u00.k) objN5;
            boolean zG = g0Var.g(y0Var);
            Object objN6 = g0Var.N();
            if (zG || objN6 == cVar) {
                objN6 = new h(y0Var);
                g0Var.n0(objN6);
            }
            c0.a(n1Var, kVar2, rVarV, x0Var, y0Var, (u00.n) objN6, v1.d.d(-143346359, new i(this.E, obj3, vVar, this.F), jVar), jVar, 12582912);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
