package za;

public final class i0 {
    public static final i0[] A;

    i0 EF5;

    static {
        i0[] i0VarArr = {new i0("NOT_APPLIED", 0), new i0("APPLIED_IMMEDIATELY", 1), new i0("APPLIED_FOR_NEXT_RUN", 2)};
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
