package g1;

public final class o implements u00.n {
    public final float A;
    public final float B;

    public o(float f3, float f10) {
        this.A = f3;
        this.B = f10;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            h0.o.a(h0.z1.n(b2.o.A, this.A, this.B), jVar, 0);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
