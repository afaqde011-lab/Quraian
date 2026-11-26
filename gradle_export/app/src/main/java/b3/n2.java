package b3;

public final class n2 {
    public static final n2 A;
    public static final n2 B;
    public static final n2 C;
    public static final n2[] D;

    static {
        n2 n2Var = new n2("ContinueTraversal", 0);
        A = n2Var;
        n2 n2Var2 = new n2("SkipSubtreeAndContinueTraversal", 1);
        B = n2Var2;
        n2 n2Var3 = new n2("CancelTraversal", 2);
        C = n2Var3;
        n2[] n2VarArr = {n2Var, n2Var2, n2Var3};
        D = n2VarArr;
        f50.c.v(n2VarArr);
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) D.clone();
    }
}
