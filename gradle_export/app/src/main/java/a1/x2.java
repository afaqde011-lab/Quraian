package a1;

public final class x2 {
    public static final x2 A;
    public static final x2 B;
    public static final x2[] C;

    static {
        x2 x2Var = new x2("Start", 0);
        A = x2Var;
        x2 x2Var2 = new x2("End", 1);
        B = x2Var2;
        x2[] x2VarArr = {x2Var, x2Var2};
        C = x2VarArr;
        f50.c.v(x2VarArr);
    }

    public static x2 valueOf(String str) {
        return (x2) Enum.valueOf(x2.class, str);
    }

    public static x2[] values() {
        return (x2[]) C.clone();
    }
}
