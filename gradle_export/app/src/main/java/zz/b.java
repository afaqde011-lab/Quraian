package zz;

public final class b {
    FULL("full"),
    HD("hd");

    public static final n00.b E;
    public final String A;

    static {
        E = f50.c.v(bVarArr);
    }

    public b(String str) {
        super(str, i);
        this.A = str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) D.clone();
    }
}
