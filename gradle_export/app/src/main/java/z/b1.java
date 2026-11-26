package z;

public final class b1 {
    public static final b1 A;
    public static final b1 B;
    public static final b1 C;
    public static final b1[] D;

    static {
        b1 b1Var = new b1("Default", 0);
        A = b1Var;
        b1 b1Var2 = new b1("UserInput", 1);
        B = b1Var2;
        b1 b1Var3 = new b1("PreventUserInput", 2);
        C = b1Var3;
        b1[] b1VarArr = {b1Var, b1Var2, b1Var3};
        D = b1VarArr;
        f50.c.v(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) D.clone();
    }
}
