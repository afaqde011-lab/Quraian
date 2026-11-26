package g1;

public final class n6 {
    public static final n6 A;
    public static final n6 B;
    public static final n6 C;
    public static final n6[] D;

    static {
        n6 n6Var = new n6("Hidden", 0);
        A = n6Var;
        n6 n6Var2 = new n6("Expanded", 1);
        B = n6Var2;
        n6 n6Var3 = new n6("PartiallyExpanded", 2);
        C = n6Var3;
        n6[] n6VarArr = {n6Var, n6Var2, n6Var3};
        D = n6VarArr;
        f50.c.v(n6VarArr);
    }

    public static n6 valueOf(String str) {
        return (n6) Enum.valueOf(n6.class, str);
    }

    public static n6[] values() {
        return (n6[]) D.clone();
    }
}
