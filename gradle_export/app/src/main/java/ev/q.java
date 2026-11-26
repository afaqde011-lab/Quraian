package ev;

public final class q implements u00.a {
    public final int A;
    public final u00.k B;
    public final bx.c C;

    public q(u00.k kVar, bx.c cVar, int i) {
        this.A = i;
        this.B = kVar;
        this.C = cVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.invoke(new h(this.C.a));
                break;
            case 1:
                this.B.invoke(Integer.valueOf(this.C.a));
                break;
            case 2:
                this.B.invoke(Integer.valueOf(this.C.a));
                break;
            case 3:
                this.B.invoke(new qx.c(this.C.a));
                break;
            default:
                this.B.invoke(Integer.valueOf(this.C.a));
                break;
        }
        return g00.b0.a;
    }
}
