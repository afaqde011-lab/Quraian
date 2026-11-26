package k30;

public final class m extends n {
    public static final m d = new m("must be a member function", 0);
    public static final m e = new m("must be a member or an extension function", 1);
    public final int c;

    public m(String str, int i) {
        super(str, 0);
        this.c = i;
    }

    @Override
    public final boolean a(z10.e eVar) {
        switch (this.c) {
            case 0:
                return eVar.K != null;
            default:
                return (eVar.K == null && eVar.J == null) ? false : true;
        }
    }
}
