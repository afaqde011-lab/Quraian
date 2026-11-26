package s20;

public final class n {
    public static final n[] A;

    n EF5;

    static {
        n[] nVarArr = {new n("COMMON_SUPER_TYPE", 0), new n("INTERSECTION_TYPE", 1)};
        A = nVarArr;
        f50.c.v(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) A.clone();
    }
}
