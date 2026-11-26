package bt;

public final class r0 implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final float C;
    public final int D;
    public final int E;
    public final Object F;
    public final Object G;

    public r0(ys.a aVar, boolean z, float f, b2.r rVar, int i, int i2) {
        this.F = aVar;
        this.B = z;
        this.C = f;
        this.G = rVar;
        this.D = i;
        this.E = i2;
    }

    public r0(boolean z, e6.d dVar, b6.m mVar, float f, int i, int i2) {
        this.B = z;
        this.F = dVar;
        this.G = mVar;
        this.C = f;
        this.D = i;
        this.E = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.a((ys.a) this.F, this.B, this.C, (b2.r) this.G, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                kh.n.t(this.B, (e6.d) this.F, (b6.m) this.G, this.C, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
        }
        return g00.b0.a;
    }
}
