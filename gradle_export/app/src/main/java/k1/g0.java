package k1;

public final class g0 {
    public static final g0 A;
    public static final g0 B;
    public static final g0 C;
    public static final g0 D;
    public static final g0 E;
    public static final g0 F;
    public static final g0[] G;

    static {
        g0 g0Var = new g0("BodyLarge", 0);
        A = g0Var;
        g0 g0Var2 = new g0("BodyMedium", 1);
        g0 g0Var3 = new g0("BodySmall", 2);
        B = g0Var3;
        g0 g0Var4 = new g0("DisplayLarge", 3);
        C = g0Var4;
        g0 g0Var5 = new g0("DisplayMedium", 4);
        D = g0Var5;
        g0 g0Var6 = new g0("DisplaySmall", 5);
        g0 g0Var7 = new g0("HeadlineLarge", 6);
        E = g0Var7;
        g0 g0Var8 = new g0("HeadlineMedium", 7);
        g0 g0Var9 = new g0("HeadlineSmall", 8);
        g0 g0Var10 = new g0("LabelLarge", 9);
        F = g0Var10;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10, new g0("LabelMedium", 10), new g0("LabelSmall", 11), new g0("TitleLarge", 12), new g0("TitleMedium", 13), new g0("TitleSmall", 14), new g0("BodyLargeEmphasized", 15), new g0("BodyMediumEmphasized", 16), new g0("BodySmallEmphasized", 17), new g0("DisplayLargeEmphasized", 18), new g0("DisplayMediumEmphasized", 19), new g0("DisplaySmallEmphasized", 20), new g0("HeadlineLargeEmphasized", 21), new g0("HeadlineMediumEmphasized", 22), new g0("HeadlineSmallEmphasized", 23), new g0("LabelLargeEmphasized", 24), new g0("LabelMediumEmphasized", 25), new g0("LabelSmallEmphasized", 26), new g0("TitleLargeEmphasized", 27), new g0("TitleMediumEmphasized", 28), new g0("TitleSmallEmphasized", 29)};
        G = g0VarArr;
        f50.c.v(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) G.clone();
    }
}
