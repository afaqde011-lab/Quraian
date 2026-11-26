package tf;

public final class l3 {
    public static final l3 A;
    public static final l3 B;
    public static final l3[] C;

    static {
        l3 l3Var = new l3("CONSENT", 0);
        A = l3Var;
        l3 l3Var2 = new l3("LEGITIMATE_INTEREST", 1);
        l3 l3Var3 = new l3("FLEXIBLE_CONSENT", 2);
        l3 l3Var4 = new l3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        B = l3Var4;
        C = new l3[]{l3Var, l3Var2, l3Var3, l3Var4};
    }

    public static l3[] values() {
        return (l3[]) C.clone();
    }
}
