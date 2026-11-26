package s7;

public final class n0 {
    public static final n0 A;
    public static final n0 B;
    public static final n0 C;
    public static final n0[] D;

    static {
        n0 n0Var = new n0("PASS_THROUGH", 0);
        A = n0Var;
        n0 n0Var2 = new n0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        B = n0Var2;
        n0 n0Var3 = new n0("DISCARDING", 2);
        C = n0Var3;
        D = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) D.clone();
    }
}
