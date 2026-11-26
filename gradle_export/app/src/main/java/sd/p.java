package sd;

public final class p {
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p D;
    public static final p E;
    public static final p F;
    public static final p G;
    public static final p H;
    public static final p I;
    public static final p J;
    public static final p[] K;

    static {
        p pVar = new p("none", 0);
        A = pVar;
        p pVar2 = new p("xMinYMin", 1);
        B = pVar2;
        p pVar3 = new p("xMidYMin", 2);
        C = pVar3;
        p pVar4 = new p("xMaxYMin", 3);
        D = pVar4;
        p pVar5 = new p("xMinYMid", 4);
        E = pVar5;
        p pVar6 = new p("xMidYMid", 5);
        F = pVar6;
        p pVar7 = new p("xMaxYMid", 6);
        G = pVar7;
        p pVar8 = new p("xMinYMax", 7);
        H = pVar8;
        p pVar9 = new p("xMidYMax", 8);
        I = pVar9;
        p pVar10 = new p("xMaxYMax", 9);
        J = pVar10;
        K = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) K.clone();
    }
}
