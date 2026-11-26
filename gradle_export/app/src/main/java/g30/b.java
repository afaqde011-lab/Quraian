package g30;

public final class b {
    public static final b[] A;

    b EF5;

    static {
        b[] bVarArr = {new b("ERROR_CLASS", 0), new b("ERROR_FUNCTION", 1), new b("ERROR_SCOPE", 2), new b("ERROR_MODULE", 3), new b("ERROR_PROPERTY", 4), new b("ERROR_TYPE", 5), new b("PARENT_OF_ERROR_SCOPE", 6)};
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
