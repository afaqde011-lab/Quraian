package e1;

public final class e0 {
    public static final e0 A;
    public static final e0 B;
    public static final e0 C;
    public static final e0[] D;

    static {
        e0 e0Var = new e0("Left", 0);
        A = e0Var;
        e0 e0Var2 = new e0("Middle", 1);
        B = e0Var2;
        e0 e0Var3 = new e0("Right", 2);
        C = e0Var3;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3};
        D = e0VarArr;
        f50.c.v(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) D.clone();
    }
}
