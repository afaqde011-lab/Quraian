package q0;

public final class z0 {
    public static final z0 A;
    public static final z0 B;
    public static final z0 C;
    public static final z0[] D;

    static {
        z0 z0Var = new z0("None", 0);
        A = z0Var;
        z0 z0Var2 = new z0("Selection", 1);
        B = z0Var2;
        z0 z0Var3 = new z0("Cursor", 2);
        C = z0Var3;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3};
        D = z0VarArr;
        f50.c.v(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) D.clone();
    }
}
