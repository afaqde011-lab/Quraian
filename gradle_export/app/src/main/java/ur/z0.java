package ur;

public final class z0 implements u00.n {
    public final int A = 1;
    public final h1 B;
    public final u00.k C;

    public z0(h1 h1Var, u00.k kVar) {
        this.B = h1Var;
        this.C = kVar;
    }

    public z0(h1 h1Var, u00.k kVar, int i) {
        this.B = h1Var;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                g1.a(this.B, this.C, (l1.j) obj, l1.q.K(1));
                break;
            default:
                l1.g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h1 h1Var = this.B;
                    u30.b bVar = h1Var.N;
                    u30.b bVar2 = h1Var.h;
                    u00.k kVar = this.C;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    Object obj3 = l1.i.a;
                    if (zG || objN == obj3) {
                        objN = new rx.c(5, kVar);
                        g0Var2.n0(objN);
                    }
                    u00.k kVar2 = (u00.k) objN;
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == obj3) {
                        objN2 = new qt.h(26, kVar);
                        g0Var2.n0(objN2);
                    }
                    u00.a aVar = (u00.a) objN2;
                    boolean zG3 = g0Var2.g(kVar);
                    Object objN3 = g0Var2.N();
                    if (zG3 || objN3 == obj3) {
                        objN3 = new qt.h(27, kVar);
                        g0Var2.n0(objN3);
                    }
                    yr.a.h(bVar, bVar2, kVar2, aVar, (u00.a) objN3, g0Var, 8);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
