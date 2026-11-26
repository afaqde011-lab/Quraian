package b3;

public final class w0 {
    public static final w0 A;
    public static final w0 B;
    public static final w0 C;
    public static final w0[] D;

    static {
        w0 w0Var = new w0("IsPlacedInLookahead", 0);
        A = w0Var;
        w0 w0Var2 = new w0("IsPlacedInApproach", 1);
        B = w0Var2;
        w0 w0Var3 = new w0("IsNotPlaced", 2);
        C = w0Var3;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3};
        D = w0VarArr;
        f50.c.v(w0VarArr);
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) D.clone();
    }
}
