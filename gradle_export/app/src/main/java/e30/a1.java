package e30;

public final class a1 {
    C("", true),
    D("in", false),
    E("out", true);

    public final String A;
    public final boolean B;

    static {
        f50.c.v(a1VarArr);
    }

    public a1(String str, boolean z) {
        super(str, i);
        this.A = str;
        this.B = z;
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) F.clone();
    }

    @Override
    public final String toString() {
        return this.A;
    }
}
