package wr;

public final class l implements u00.n {
    public final int A;
    public final boolean B;
    public final float C;
    public final int D;

    public l(boolean z, float f, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = f;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k.A(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                k.U(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
