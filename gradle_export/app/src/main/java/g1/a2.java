package g1;

public final class a2 implements u00.a {
    public final int A;
    public final long B;
    public final Object C;

    public a2(Object obj, long j9, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = j9;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                ((u00.k) this.C).invoke(Long.valueOf(this.B));
                return g00.b0.a;
            case 1:
                return ((i2.r0) ((i2.q) this.C)).b(this.B);
            default:
                String str = (String) this.C;
                h00.x xVar = h00.x.A;
                return new z0.g(str, this.B, new q3.e0((c1.d) null, new c1.e(xVar, xVar, 100)));
        }
    }
}
