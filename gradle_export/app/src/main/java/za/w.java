package za;

public final class w {
    public static final w A;
    public static final w B;
    public static final w C;
    public static final w D;
    public static final w E;
    public static final w F;
    public static final w[] G;

    static {
        w wVar = new w("NOT_REQUIRED", 0);
        A = wVar;
        w wVar2 = new w("CONNECTED", 1);
        B = wVar2;
        w wVar3 = new w("UNMETERED", 2);
        C = wVar3;
        w wVar4 = new w("NOT_ROAMING", 3);
        D = wVar4;
        w wVar5 = new w("METERED", 4);
        E = wVar5;
        w wVar6 = new w("TEMPORARILY_UNMETERED", 5);
        F = wVar6;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
        G = wVarArr;
        f50.c.v(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) G.clone();
    }
}
