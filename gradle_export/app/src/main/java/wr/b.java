package wr;

public final class b implements u00.n {
    public final int A;
    public final u30.b B;
    public final u00.a C;
    public final u00.a D;

    public b(u30.b bVar, u00.a aVar, u00.a aVar2, int i, int i2) {
        this.A = i2;
        this.B = bVar;
        this.C = aVar;
        this.D = aVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g.b(this.B, this.C, this.D, jVar, l1.q.K(1));
                break;
            case 1:
                g.a(this.B, this.C, this.D, jVar, l1.q.K(1));
                break;
            default:
                g.j(this.B, this.C, this.D, jVar, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
