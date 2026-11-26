package tc;

public final class b {
    public static final b[] A;

    b EF5;

    static {
        b[] bVarArr = {new b("Clickable", 0)};
        A = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) A.clone();
    }
}
