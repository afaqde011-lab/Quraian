package ns;

public final class l {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l[] D;

    static {
        l lVar = new l("SENT", 0);
        A = lVar;
        l lVar2 = new l("REJECTED", 1);
        B = lVar2;
        l lVar3 = new l("FAILED", 2);
        C = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        D = lVarArr;
        f50.c.v(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) D.clone();
    }
}
