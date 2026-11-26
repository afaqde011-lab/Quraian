package d00;

public final class y0 {
    public static final y0 A;
    public static final y0 B;
    public static final y0[] C;

    static {
        y0 y0Var = new y0("Effect", 0);
        A = y0Var;
        y0 y0Var2 = new y0("Source", 1);
        B = y0Var2;
        y0[] y0VarArr = {y0Var, y0Var2};
        C = y0VarArr;
        f50.c.v(y0VarArr);
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) C.clone();
    }
}
