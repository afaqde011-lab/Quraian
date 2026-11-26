package a1;

public final class t0 {
    public static final t0 A;
    public static final t0 B;
    public static final t0 C;
    public static final t0 D;
    public static final t0[] E;

    static {
        t0 t0Var = new t0("Untransformed", 0);
        A = t0Var;
        t0 t0Var2 = new t0("Insertion", 1);
        B = t0Var2;
        t0 t0Var3 = new t0("Replacement", 2);
        C = t0Var3;
        t0 t0Var4 = new t0("Deletion", 3);
        D = t0Var4;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3, t0Var4};
        E = t0VarArr;
        f50.c.v(t0VarArr);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) E.clone();
    }
}
