package i10;

public final class l {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l D;
    public static final l E;
    public static final l[] F;

    static {
        l lVar = new l("HIDDEN", 0);
        A = lVar;
        l lVar2 = new l("VISIBLE", 1);
        B = lVar2;
        l lVar3 = new l("DEPRECATED_LIST_METHODS", 2);
        C = lVar3;
        l lVar4 = new l("NOT_CONSIDERED", 3);
        D = lVar4;
        l lVar5 = new l("DROP", 4);
        E = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        F = lVarArr;
        f50.c.v(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) F.clone();
    }
}
