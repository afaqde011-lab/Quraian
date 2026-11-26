package ca;

public final class a0 {
    public static final a0 A;
    public static final a0 B;
    public static final a0[] C;

    static {
        a0 a0Var = new a0("DEFERRED", 0);
        A = a0Var;
        a0 a0Var2 = new a0("IMMEDIATE", 1);
        B = a0Var2;
        a0[] a0VarArr = {a0Var, a0Var2, new a0("EXCLUSIVE", 2)};
        C = a0VarArr;
        f50.c.v(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) C.clone();
    }
}
