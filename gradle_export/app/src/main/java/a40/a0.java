package a40;

public final class a0 {
    public static final a0 A;
    public static final a0 B;
    public static final a0 C;
    public static final a0 D;
    public static final a0[] E;

    static {
        a0 a0Var = new a0("DEFAULT", 0);
        A = a0Var;
        a0 a0Var2 = new a0("LAZY", 1);
        B = a0Var2;
        a0 a0Var3 = new a0("ATOMIC", 2);
        C = a0Var3;
        a0 a0Var4 = new a0("UNDISPATCHED", 3);
        D = a0Var4;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        E = a0VarArr;
        f50.c.v(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) E.clone();
    }
}
