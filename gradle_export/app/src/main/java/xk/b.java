package xk;

public final class b {
    public static final b[] A;

    b EF5;

    static {
        b[] bVarArr = {new b("LEFT", 0), new b("RIGHT", 1), new b("LEFT_THEN_RIGHT", 2), new b("RIGHT_THEN_LEFT", 3)};
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
