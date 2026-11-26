package e30;

public final class i0 {
    public static final i0[] A;

    i0 EF5;

    static {
        i0[] i0VarArr = {new i0("CHECK_ONLY_LOWER", 0), new i0("CHECK_SUBTYPE_AND_LOWER", 1), new i0("SKIP_LOWER", 2)};
        A = i0VarArr;
        f50.c.v(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) A.clone();
    }
}
