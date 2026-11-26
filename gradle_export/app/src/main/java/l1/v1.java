package l1;

public final class v1 {
    public static final v1 A;
    public static final v1 B;
    public static final v1 C;
    public static final v1 D;
    public static final v1 E;
    public static final v1 F;
    public static final v1[] G;

    static {
        v1 v1Var = new v1("ShutDown", 0);
        A = v1Var;
        v1 v1Var2 = new v1("ShuttingDown", 1);
        B = v1Var2;
        v1 v1Var3 = new v1("Inactive", 2);
        C = v1Var3;
        v1 v1Var4 = new v1("InactivePendingWork", 3);
        D = v1Var4;
        v1 v1Var5 = new v1("Idle", 4);
        E = v1Var5;
        v1 v1Var6 = new v1("PendingWork", 5);
        F = v1Var6;
        v1[] v1VarArr = {v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6};
        G = v1VarArr;
        f50.c.v(v1VarArr);
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) G.clone();
    }
}
