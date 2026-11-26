package ba;

public final class f0 {
    public static final f0 A;
    public static final f0[] B;

    static {
        f0 f0Var = new f0("ALLOW", 0);
        A = f0Var;
        B = new f0[]{f0Var, new f0("PREVENT_WHEN_EMPTY", 1), new f0("PREVENT", 2)};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) B.clone();
    }
}
