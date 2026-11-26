package z2;

public final class a1 {
    public static final a1 A;
    public static final a1 B;
    public static final a1[] C;

    static {
        a1 a1Var = new a1("Width", 0);
        A = a1Var;
        a1 a1Var2 = new a1("Height", 1);
        B = a1Var2;
        a1[] a1VarArr = {a1Var, a1Var2};
        C = a1VarArr;
        f50.c.v(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) C.clone();
    }
}
