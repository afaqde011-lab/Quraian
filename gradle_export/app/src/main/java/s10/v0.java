package s10;

public final class v0 {
    public static final v0 A;
    public static final v0 B;
    public static final v0 C;
    public static final v0[] D;

    static {
        v0 v0Var = new v0("RETURNS_CONSTANT", 0);
        A = v0Var;
        v0 v0Var2 = new v0("CALLS", 1);
        B = v0Var2;
        v0 v0Var3 = new v0("RETURNS_NOT_NULL", 2);
        C = v0Var3;
        v0[] v0VarArr = {v0Var, v0Var2, v0Var3};
        D = v0VarArr;
        f50.c.v(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) D.clone();
    }
}
