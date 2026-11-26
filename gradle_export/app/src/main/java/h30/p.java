package h30;

public final class p {
    IN("in"),
    OUT("out"),
    INV("");

    public final String A;

    static {
        f50.c.v(pVarArr);
    }

    public p(String str) {
        super(str, i);
        this.A = str;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) E.clone();
    }

    @Override
    public final String toString() {
        return this.A;
    }
}
