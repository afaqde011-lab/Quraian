package b3;

public final class f0 {
    public static final f0 A;
    public static final f0 B;
    public static final f0 C;
    public static final f0 D;
    public static final f0 E;
    public static final f0[] F;

    static {
        f0 f0Var = new f0("Measuring", 0);
        A = f0Var;
        f0 f0Var2 = new f0("LookaheadMeasuring", 1);
        B = f0Var2;
        f0 f0Var3 = new f0("LayingOut", 2);
        C = f0Var3;
        f0 f0Var4 = new f0("LookaheadLayingOut", 3);
        D = f0Var4;
        f0 f0Var5 = new f0("Idle", 4);
        E = f0Var5;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5};
        F = f0VarArr;
        f50.c.v(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) F.clone();
    }
}
