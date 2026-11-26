package d00;

public final class u0 {
    public static final u0 A;
    public static final u0 B;
    public static final u0 C;
    public static final u0[] D;

    static {
        u0 u0Var = new u0("Local", 0);
        A = u0Var;
        u0 u0Var2 = new u0("Screen", 1);
        B = u0Var2;
        u0 u0Var3 = new u0("Auto", 2);
        C = u0Var3;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3};
        D = u0VarArr;
        f50.c.v(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) D.clone();
    }
}
