package p20;

public final class a {
    NO_ARGUMENTS(3),
    UNLESS_EMPTY(2),
    ALWAYS_PARENTHESIZED(true, true);

    public final boolean A;
    public final boolean B;

    static {
        f50.c.v(aVarArr);
    }

    public a(int i) {
        this((i & 1) == 0, false);
    }

    public a(boolean z, boolean z2) {
        super(str, i);
        this.A = z;
        this.B = z2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) D.clone();
    }
}
