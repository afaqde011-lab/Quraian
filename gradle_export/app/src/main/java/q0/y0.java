package q0;

public final class y0 {
    public static final y0 A;
    public static final y0 B;
    public static final y0 C;
    public static final y0[] D;

    static {
        y0 y0Var = new y0("Cursor", 0);
        A = y0Var;
        y0 y0Var2 = new y0("SelectionStart", 1);
        B = y0Var2;
        y0 y0Var3 = new y0("SelectionEnd", 2);
        C = y0Var3;
        y0[] y0VarArr = {y0Var, y0Var2, y0Var3};
        D = y0VarArr;
        f50.c.v(y0VarArr);
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) D.clone();
    }
}
