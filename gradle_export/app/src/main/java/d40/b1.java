package d40;

public final class b1 implements a40.o0 {
    public final d1 A;
    public final long B;
    public final Object C;
    public final a40.k D;

    public b1(d1 d1Var, long j, Object obj, a40.k kVar) {
        this.A = d1Var;
        this.B = j;
        this.C = obj;
        this.D = kVar;
    }

    @Override
    public final void dispose() {
        d1 d1Var = this.A;
        synchronized (d1Var) {
            if (this.B < d1Var.o()) {
                return;
            }
            Object[] objArr = d1Var.H;
            kotlin.jvm.internal.m.b(objArr);
            long j = this.B;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            o.f(objArr, j, o.c);
            d1Var.j();
        }
    }
}
