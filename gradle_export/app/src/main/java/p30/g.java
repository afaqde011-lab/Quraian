package p30;

public final class g implements u00.a {
    public final int A;
    public final i B;

    public g(i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                i iVar = this.B;
                return iVar.B(iVar.B);
            default:
                return this.B;
        }
    }
}
