package gv;

public final class c1 implements u00.n {
    public final int A;
    public final ot.e B;
    public final u00.a C;

    public c1(ot.e eVar, u00.a aVar) {
        this.A = 0;
        this.B = eVar;
        this.C = aVar;
    }

    public c1(ot.e eVar, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = eVar;
        this.C = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        l1.g0 g0Var = (l1.j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                int iIntValue = num.intValue();
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p.E(this.B, this.C, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                num.getClass();
                p.F(this.B, this.C, g0Var, l1.q.K(1));
                break;
            default:
                num.getClass();
                p.E(this.B, this.C, g0Var, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
