package a10;

public final class a0 {
    public static final a0 A;
    public static final a0 B;
    public static final a0 C;
    public static final a0[] D;

    static {
        a0 a0Var = new a0("INVARIANT", 0);
        A = a0Var;
        a0 a0Var2 = new a0("IN", 1);
        B = a0Var2;
        a0 a0Var3 = new a0("OUT", 2);
        C = a0Var3;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
        D = a0VarArr;
        f50.c.v(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) D.clone();
    }
}
