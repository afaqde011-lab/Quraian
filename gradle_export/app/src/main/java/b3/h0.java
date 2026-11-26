package b3;

public final class h0 {
    public static final h0 A;
    public static final h0 B;
    public static final h0 C;
    public static final h0[] D;

    static {
        h0 h0Var = new h0("InMeasureBlock", 0);
        A = h0Var;
        h0 h0Var2 = new h0("InLayoutBlock", 1);
        B = h0Var2;
        h0 h0Var3 = new h0("NotUsed", 2);
        C = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        D = h0VarArr;
        f50.c.v(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) D.clone();
    }
}
