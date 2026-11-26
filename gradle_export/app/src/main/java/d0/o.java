package d0;

public final class o {
    public static final o A;
    public static final o B;
    public static final o C;
    public static final o[] D;

    static {
        o oVar = new o("Yes", 0);
        A = oVar;
        o oVar2 = new o("No", 1);
        B = oVar2;
        o oVar3 = new o("NotInitialized", 2);
        C = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        D = oVarArr;
        f50.c.v(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) D.clone();
    }
}
