package k30;

public final class x extends n {
    public static final x d = new x("must have no value parameters", 0);
    public static final x e = new x("must have a single value parameter", 1);
    public final int c;

    public x(String str, int i) {
        super(str, 1);
        this.c = i;
    }

    @Override
    public final boolean a(z10.e eVar) {
        switch (this.c) {
            case 0:
                return eVar.O().isEmpty();
            default:
                return eVar.O().size() == 1;
        }
    }
}
