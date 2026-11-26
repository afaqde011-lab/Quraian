package d6;

public final class p1 {
    public static final p1 A;
    public static final p1 B;
    public static final p1 C;
    public static final p1 D;
    public static final p1[] E;

    static {
        p1 p1Var = new p1("Wrap", 0);
        A = p1Var;
        p1 p1Var2 = new p1("Fixed", 1);
        B = p1Var2;
        p1 p1Var3 = new p1("Expand", 2);
        C = p1Var3;
        p1 p1Var4 = new p1("MatchParent", 3);
        D = p1Var4;
        p1[] p1VarArr = {p1Var, p1Var2, p1Var3, p1Var4};
        E = p1VarArr;
        f50.c.v(p1VarArr);
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) E.clone();
    }
}
