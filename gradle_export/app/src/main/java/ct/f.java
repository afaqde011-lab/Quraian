package ct;

public final class f implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final Object E;

    public f(Integer num, boolean z, boolean z2, int i) {
        this.E = num;
        this.B = z;
        this.C = z2;
        this.D = i;
    }

    public f(boolean z, boolean z2, ot.n nVar, int i) {
        this.B = z;
        this.C = z2;
        this.E = nVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).intValue();
                int iK = l1.q.K(this.D | 1);
                i.d((Integer) this.E, this.B, this.C, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(this.D | 1);
                qt.a.f(this.B, this.C, (ot.n) this.E, (l1.j) obj, iK2);
                break;
        }
        return g00.b0.a;
    }
}
