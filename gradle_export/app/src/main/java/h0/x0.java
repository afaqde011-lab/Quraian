package h0;

public final class x0 {
    public static final x0 A;
    public static final x0 B;
    public static final x0[] C;

    static {
        x0 x0Var = new x0("Min", 0);
        A = x0Var;
        x0 x0Var2 = new x0("Max", 1);
        B = x0Var2;
        x0[] x0VarArr = {x0Var, x0Var2};
        C = x0VarArr;
        f50.c.v(x0VarArr);
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) C.clone();
    }
}
