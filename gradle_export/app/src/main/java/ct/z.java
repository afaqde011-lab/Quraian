package ct;

public final class z implements u00.n {
    public final int A;
    public final boolean B;
    public final int C;
    public final Object D;

    public z(Object obj, boolean z, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.B = z;
        this.C = i;
    }

    public z(String str, int i, boolean z) {
        this.A = 2;
        this.D = str;
        this.B = z;
        this.C = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).intValue();
                int iK = l1.q.K(this.C | 1);
                c0.a((ys.e) this.D, this.B, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iK2 = l1.q.K(this.C | 1);
                ro.f.q((lo.l) this.D, this.B, (l1.j) obj, iK2);
                break;
            default:
                ((Integer) obj2).getClass();
                up.d.a(l1.q.K(this.C | 1), b2.o.A, (String) this.D, (l1.j) obj, this.B);
                break;
        }
        return g00.b0.a;
    }
}
