package d0;

public final class q1 {
    public static final q1 A;
    public static final q1 B;
    public static final q1[] C;

    static {
        q1 q1Var = new q1("Vertical", 0);
        A = q1Var;
        q1 q1Var2 = new q1("Horizontal", 1);
        B = q1Var2;
        q1[] q1VarArr = {q1Var, q1Var2};
        C = q1VarArr;
        f50.c.v(q1VarArr);
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) C.clone();
    }
}
