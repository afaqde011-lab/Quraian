package eu;

public final class k implements u00.n {
    public final int A;
    public final String B;
    public final u00.a C;
    public final int D;

    public k(String str, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.C = aVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.i(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                yr.a.a(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
