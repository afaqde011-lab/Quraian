package g10;

public final class j implements u00.a {
    public final int A;
    public final k B;

    public j(k kVar, int i) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return p.l.a(this.B.A);
            default:
                return p.l.a(this.B.B);
        }
    }
}
