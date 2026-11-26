package d10;

public final class a2 implements u00.a {
    public final int A;
    public final String B;

    public a2(String str, int i) {
        this.A = i;
        this.B = str;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                String strK = g4.c.k(new StringBuilder(), g10.p.n.a.a, '.');
                if (!r30.r.x0(this.B, strK, false)) {
                    strK = null;
                }
                return strK == null ? "" : strK;
            default:
                String strK2 = g4.c.k(new StringBuilder(), g10.p.l.a.a, '.');
                if (!r30.r.x0(this.B, strK2, false)) {
                    strK2 = null;
                }
                return strK2 == null ? "" : strK2;
        }
    }
}
