package ss;

public final class l {
    public static final l A;
    public static final l B;
    public static final l[] C;

    static {
        l lVar = new l("MERGE", 0);
        A = lVar;
        l lVar2 = new l("DELETE_LOCAL", 1);
        B = lVar2;
        l[] lVarArr = {lVar, lVar2};
        C = lVarArr;
        f50.c.v(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) C.clone();
    }
}
