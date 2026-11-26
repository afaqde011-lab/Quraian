package w;

public final class l0 {
    public static final l0 A;
    public static final l0 B;
    public static final l0 C;
    public static final l0[] D;

    static {
        l0 l0Var = new l0("PreEnter", 0);
        A = l0Var;
        l0 l0Var2 = new l0("Visible", 1);
        B = l0Var2;
        l0 l0Var3 = new l0("PostExit", 2);
        C = l0Var3;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        D = l0VarArr;
        f50.c.v(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) D.clone();
    }
}
