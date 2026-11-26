package d40;

public final class e1 extends e40.c {
    public long a;
    public a40.k b;

    @Override
    public final boolean a(e40.a aVar) {
        d1 d1Var = (d1) aVar;
        if (this.a >= 0) {
            return false;
        }
        long j = d1Var.I;
        if (j < d1Var.J) {
            d1Var.J = j;
        }
        this.a = j;
        return true;
    }

    @Override
    public final k00.c[] b(e40.a aVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((d1) aVar).u(j);
    }
}
