package b1;

public final class k0 {
    public static final k0 A;
    public static final k0 B;
    public static final k0 C;
    public static final k0[] D;

    static {
        k0 k0Var = new k0("None", 0);
        A = k0Var;
        k0 k0Var2 = new k0("Cursor", 1);
        B = k0Var2;
        k0 k0Var3 = new k0("Selection", 2);
        C = k0Var3;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3};
        D = k0VarArr;
        f50.c.v(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) D.clone();
    }
}
