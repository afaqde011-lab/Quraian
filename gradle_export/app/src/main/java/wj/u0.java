package wj;

public final class u0 {
    public static final u0 A;
    public static final u0 B;
    public static final u0[] C;

    static {
        u0 u0Var = new u0("GENERAL", 0);
        A = u0Var;
        u0 u0Var2 = new u0("FALLBACK", 1);
        B = u0Var2;
        u0[] u0VarArr = {u0Var, u0Var2};
        C = u0VarArr;
        f50.c.v(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) C.clone();
    }
}
