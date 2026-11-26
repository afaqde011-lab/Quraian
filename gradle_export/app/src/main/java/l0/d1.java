package l0;

public final class d1 implements u00.k {
    public final int A;
    public final f1 B;

    public d1(f1 f1Var, int i10) {
        this.A = i10;
        this.B = f1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                j0 j0Var = (j0) this.B.O.invoke();
                int iA = j0Var.a();
                int i10 = 0;
                while (i10 < iA) {
                    if (j0Var.b(i10).equals(obj)) {
                        return Integer.valueOf(i10);
                    }
                    i10++;
                }
                i10 = -1;
                return Integer.valueOf(i10);
            default:
                int iIntValue = ((Integer) obj).intValue();
                f1 f1Var = this.B;
                j0 j0Var2 = (j0) f1Var.O.invoke();
                if (iIntValue < 0 || iIntValue >= j0Var2.a()) {
                    StringBuilder sbQ = oi.k.q("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
                    sbQ.append(j0Var2.a());
                    sbQ.append(')');
                    g0.a.a(sbQ.toString());
                }
                a40.c0.y(f1Var.p1(), (k00.i) null, (a40.a0) null, new a1.p1(f1Var, iIntValue, (k00.c) null, 7), 3);
                return Boolean.TRUE;
        }
    }
}
