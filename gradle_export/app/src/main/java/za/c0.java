package za;

public final class c0 {
    public static final c0 A;
    public static final c0 B;
    public static final c0[] C;

    static {
        c0 c0Var = new c0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        A = c0Var;
        c0 c0Var2 = new c0("DROP_WORK_REQUEST", 1);
        B = c0Var2;
        c0[] c0VarArr = {c0Var, c0Var2};
        C = c0VarArr;
        f50.c.v(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) C.clone();
    }
}
