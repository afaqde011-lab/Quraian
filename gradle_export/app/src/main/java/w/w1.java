package w;

public final class w1 extends kotlin.jvm.internal.n implements u00.o {
    public final int A;
    public final Object B;

    public w1(Object obj, int i10) {
        super(3);
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                z2.t0 t0Var = (z2.t0) obj;
                l1.j jVar = (l1.j) obj2;
                ((Number) obj3).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                Object objN = g0Var.N();
                l1.c cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = l1.q.o(jVar);
                    g0Var.n0(objN);
                }
                a40.z zVar = (a40.z) objN;
                Object objN2 = g0Var.N();
                if (objN2 == cVar) {
                    objN2 = new u1(t0Var, zVar);
                    g0Var.n0(objN2);
                }
                u1 u1Var = (u1) objN2;
                ((v1.c) this.B).invoke(u1Var, new y1(u1Var), jVar, 6);
                return g00.b0.a;
            case 1:
                z2.l1 l1VarO = ((z2.v0) obj2).O(((y3.a) obj3).f16587a);
                return ((z2.y0) obj).o0(l1VarO.A, l1VarO.B, h00.y.A, new b2.v(l1VarO, (j0) this.B, 13));
            default:
                ((Number) obj3).intValue();
                l1.g0 g0Var2 = (l1.g0) ((l1.j) obj2);
                g0Var2.c0(955869654);
                x.y yVar = (x.y) this.B;
                g0Var2.r(false);
                return yVar;
        }
    }
}
