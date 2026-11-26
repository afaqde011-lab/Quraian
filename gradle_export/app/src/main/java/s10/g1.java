package s10;

public final class g1 {
    public static final g1 A;
    public static final g1 B;
    public static final g1 C;
    public static final g1[] D;

    static {
        g1 g1Var = new g1("INVARIANT", 0);
        A = g1Var;
        g1 g1Var2 = new g1("IN", 1);
        B = g1Var2;
        g1 g1Var3 = new g1("OUT", 2);
        C = g1Var3;
        g1[] g1VarArr = {g1Var, g1Var2, g1Var3};
        D = g1VarArr;
        f50.c.v(g1VarArr);
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) D.clone();
    }
}
