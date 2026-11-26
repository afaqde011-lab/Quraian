package za;

public final class l {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l D;
    public static final l[] E;

    static {
        l lVar = new l("REPLACE", 0);
        A = lVar;
        l lVar2 = new l("KEEP", 1);
        B = lVar2;
        l lVar3 = new l("APPEND", 2);
        C = lVar3;
        l lVar4 = new l("APPEND_OR_REPLACE", 3);
        D = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        E = lVarArr;
        f50.c.v(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) E.clone();
    }
}
