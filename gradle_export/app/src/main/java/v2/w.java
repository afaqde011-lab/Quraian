package v2;

public final class w {
    public static final w A;
    public static final w B;
    public static final w C;
    public static final w[] D;

    static {
        w wVar = new w("Unknown", 0);
        A = wVar;
        w wVar2 = new w("Dispatching", 1);
        B = wVar2;
        w wVar3 = new w("NotDispatching", 2);
        C = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        D = wVarArr;
        f50.c.v(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) D.clone();
    }
}
