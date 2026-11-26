package a10;

public final class b0 {
    public static final b0 A;
    public static final b0 B;
    public static final b0 C;
    public static final b0 D;
    public static final b0[] E;

    static {
        b0 b0Var = new b0("PUBLIC", 0);
        A = b0Var;
        b0 b0Var2 = new b0("PROTECTED", 1);
        B = b0Var2;
        b0 b0Var3 = new b0("INTERNAL", 2);
        C = b0Var3;
        b0 b0Var4 = new b0("PRIVATE", 3);
        D = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        E = b0VarArr;
        f50.c.v(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) E.clone();
    }
}
