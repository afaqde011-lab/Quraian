package e30;

public final class v0 {
    public static final v0 A;
    public static final v0 B;
    public static final v0[] C;

    static {
        v0 v0Var = new v0("SUPERTYPE", 0);
        A = v0Var;
        v0 v0Var2 = new v0("COMMON", 1);
        B = v0Var2;
        v0[] v0VarArr = {v0Var, v0Var2};
        C = v0VarArr;
        f50.c.v(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) C.clone();
    }
}
