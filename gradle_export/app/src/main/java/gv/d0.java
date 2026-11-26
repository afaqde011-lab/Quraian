package gv;

public final class d0 implements u00.n {
    public final int A;
    public final boolean B;
    public final String C;
    public final u00.a D;

    public d0(String str, boolean z, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.C = str;
        this.B = z;
        this.D = aVar;
    }

    public d0(boolean z, String str, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = str;
        this.D = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p.l(l1.q.K(1), this.C, jVar, this.D, this.B);
                break;
            case 1:
                iz.d.e(l1.q.K(1), this.C, jVar, this.D, this.B);
                break;
            case 2:
                iz.d.e(l1.q.K(1), this.C, jVar, this.D, this.B);
                break;
            case 3:
                iz.d.j(l1.q.K(1), this.C, jVar, this.D, this.B);
                break;
            default:
                st.j.d(l1.q.K(1), this.C, jVar, this.D, this.B);
                break;
        }
        return g00.b0.a;
    }
}
