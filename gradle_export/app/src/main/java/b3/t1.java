package b3;

public final class t1 {
    public static final t1 A;
    public static final t1 B;
    public static final t1[] C;

    static {
        t1 t1Var = new t1("Min", 0);
        A = t1Var;
        t1 t1Var2 = new t1("Max", 1);
        B = t1Var2;
        t1[] t1VarArr = {t1Var, t1Var2};
        C = t1VarArr;
        f50.c.v(t1VarArr);
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) C.clone();
    }
}
