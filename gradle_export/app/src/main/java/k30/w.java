package k30;

public final class w extends n {
    public final int c = 1;
    public final int d;

    public w() {
        super("must have exactly 2 value parameters", 1);
        this.d = 2;
    }

    public w(int i) {
        StringBuilder sbQ = oi.k.q("must have at least ", i, " value parameter");
        sbQ.append(i > 1 ? "s" : "");
        super(sbQ.toString(), 1);
        this.d = i;
    }

    @Override
    public final boolean a(z10.e eVar) {
        switch (this.c) {
            case 0:
                return eVar.O().size() >= this.d;
            default:
                return eVar.O().size() == this.d;
        }
    }
}
