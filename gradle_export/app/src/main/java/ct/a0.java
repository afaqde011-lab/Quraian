package ct;

public final class a0 implements u00.n {
    public final int A;
    public final b2.r B;
    public final float C;

    public a0(float f, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.C = f;
        this.B = rVar;
    }

    public a0(b2.r rVar, float f, int i, int i2) {
        this.A = i2;
        this.B = rVar;
        this.C = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c0.c(this.C, l1.q.K(1), this.B, jVar);
                break;
            case 1:
                es.a.a(this.C, l1.q.K(1), this.B, jVar);
                break;
            case 2:
                kx.a.b(this.C, l1.q.K(1), this.B, jVar);
                break;
            case 3:
                kz.f.a(this.C, 4, l1.q.K(1), this.B, jVar);
                break;
            case 4:
                ox.a.a(this.C, l1.q.K(1), this.B, jVar);
                break;
            case 5:
                ro.f.l(this.C, l1.q.K(55), this.B, jVar);
                break;
            case 6:
                rx.a.e(this.C, l1.q.K(1), this.B, jVar);
                break;
            default:
                wr.k.z(this.C, l1.q.K(1), this.B, jVar);
                break;
        }
        return g00.b0.a;
    }
}
