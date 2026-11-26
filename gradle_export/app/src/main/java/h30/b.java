package h30;

public final class b {
    public static final b A;
    public static final b[] B;

    static {
        b bVar = new b("FOR_SUBTYPING", 0);
        A = bVar;
        b[] bVarArr = {bVar, new b("FOR_INCORPORATION", 1), new b("FROM_EXPRESSION", 2)};
        B = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) B.clone();
    }
}
