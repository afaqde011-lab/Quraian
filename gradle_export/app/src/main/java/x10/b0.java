package x10;

public final class b0 {
    public static final b0 A;
    public static final b0 B;
    public static final b0 C;
    public static final b0[] D;

    static {
        b0 b0Var = new b0("ONE_COLLECTION_PARAMETER", 0);
        A = b0Var;
        b0 b0Var2 = new b0("OBJECT_PARAMETER_NON_GENERIC", 1);
        B = b0Var2;
        b0 b0Var3 = new b0("OBJECT_PARAMETER_GENERIC", 2);
        C = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3};
        D = b0VarArr;
        f50.c.v(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) D.clone();
    }
}
