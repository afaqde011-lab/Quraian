package z1;

public final class k implements u00.k {
    public final int A;
    public final u00.k B;
    public final u00.k C;

    public k(u00.k kVar, u00.k kVar2, int i10) {
        this.A = i10;
        this.B = kVar;
        this.C = kVar2;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                this.B.invoke(obj);
                this.C.invoke(obj);
                break;
            default:
                this.B.invoke(obj);
                this.C.invoke(obj);
                break;
        }
        return g00.b0.a;
    }
}
