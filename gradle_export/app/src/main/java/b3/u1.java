package b3;

public final class u1 {
    public static final u1 A;
    public static final u1 B;
    public static final u1[] C;

    static {
        u1 u1Var = new u1("Width", 0);
        A = u1Var;
        u1 u1Var2 = new u1("Height", 1);
        B = u1Var2;
        u1[] u1VarArr = {u1Var, u1Var2};
        C = u1VarArr;
        f50.c.v(u1VarArr);
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) C.clone();
    }
}
