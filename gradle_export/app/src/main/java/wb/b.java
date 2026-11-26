package wb;

public final class b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    public final boolean A;
    public final boolean B;

    static {
        f50.c.v(bVarArr);
    }

    public b(boolean z10, boolean z11) {
        super(str, i);
        this.A = z10;
        this.B = z11;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) E.clone();
    }
}
