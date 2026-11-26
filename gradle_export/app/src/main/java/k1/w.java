package k1;

public final class w {
    public static final w A;
    public static final w B;
    public static final w C;
    public static final w D;
    public static final w E;
    public static final w F;
    public static final w[] G;

    w EF0;

    static {
        w wVar = new w("CornerExtraExtraLarge", 0);
        w wVar2 = new w("CornerExtraLarge", 1);
        A = wVar2;
        w wVar3 = new w("CornerExtraLargeIncreased", 2);
        w wVar4 = new w("CornerExtraLargeTop", 3);
        B = wVar4;
        w wVar5 = new w("CornerExtraSmall", 4);
        C = wVar5;
        w wVar6 = new w("CornerExtraSmallTop", 5);
        w wVar7 = new w("CornerFull", 6);
        D = wVar7;
        w wVar8 = new w("CornerLarge", 7);
        w wVar9 = new w("CornerLargeEnd", 8);
        w wVar10 = new w("CornerLargeIncreased", 9);
        w wVar11 = new w("CornerLargeStart", 10);
        w wVar12 = new w("CornerLargeTop", 11);
        w wVar13 = new w("CornerMedium", 12);
        E = wVar13;
        w wVar14 = new w("CornerNone", 13);
        w wVar15 = new w("CornerSmall", 14);
        F = wVar15;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, wVar15};
        G = wVarArr;
        f50.c.v(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) G.clone();
    }
}
