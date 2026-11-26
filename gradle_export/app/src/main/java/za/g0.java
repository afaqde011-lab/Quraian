package za;

public final class g0 {
    public static final g0 A;
    public static final g0 B;
    public static final g0 C;
    public static final g0 D;
    public static final g0 E;
    public static final g0 F;
    public static final g0[] G;

    static {
        g0 g0Var = new g0("ENQUEUED", 0);
        A = g0Var;
        g0 g0Var2 = new g0("RUNNING", 1);
        B = g0Var2;
        g0 g0Var3 = new g0("SUCCEEDED", 2);
        C = g0Var3;
        g0 g0Var4 = new g0("FAILED", 3);
        D = g0Var4;
        g0 g0Var5 = new g0("BLOCKED", 4);
        E = g0Var5;
        g0 g0Var6 = new g0("CANCELLED", 5);
        F = g0Var6;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6};
        G = g0VarArr;
        f50.c.v(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) G.clone();
    }

    public final boolean a() {
        return this == C || this == D || this == F;
    }
}
