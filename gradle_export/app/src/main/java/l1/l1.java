package l1;

public final class l1 {
    public static final l1 A;
    public static final l1 B;
    public static final l1 C;
    public static final l1 D;
    public static final l1 E;
    public static final l1 F;
    public static final l1 G;
    public static final l1[] H;

    static {
        l1 l1Var = new l1("Invalid", 0);
        A = l1Var;
        l1 l1Var2 = new l1("Cancelled", 1);
        B = l1Var2;
        l1 l1Var3 = new l1("InitialPending", 2);
        C = l1Var3;
        l1 l1Var4 = new l1("RecomposePending", 3);
        D = l1Var4;
        l1 l1Var5 = new l1("Recomposing", 4);
        E = l1Var5;
        l1 l1Var6 = new l1("ApplyPending", 5);
        F = l1Var6;
        l1 l1Var7 = new l1("Applied", 6);
        G = l1Var7;
        l1[] l1VarArr = {l1Var, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6, l1Var7};
        H = l1VarArr;
        f50.c.v(l1VarArr);
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) H.clone();
    }
}
