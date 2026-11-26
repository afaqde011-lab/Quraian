package vn;

public final class d0 {
    public static final d0 A;
    public static final d0 B;
    public static final d0 C;
    public static final d0[] D;

    static {
        d0 d0Var = new d0("SENT", 0);
        A = d0Var;
        d0 d0Var2 = new d0("REJECTED", 1);
        B = d0Var2;
        d0 d0Var3 = new d0("FAILED", 2);
        C = d0Var3;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3};
        D = d0VarArr;
        f50.c.v(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) D.clone();
    }
}
