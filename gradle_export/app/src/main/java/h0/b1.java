package h0;

public final class b1 {
    public static final b1 A;
    public static final b1[] B;

    static {
        b1 b1Var = new b1("Horizontal", 0);
        A = b1Var;
        b1[] b1VarArr = {b1Var, new b1("Vertical", 1)};
        B = b1VarArr;
        f50.c.v(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) B.clone();
    }
}
