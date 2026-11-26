package ss;

public final class o {
    public static final o A;
    public static final o B;
    public static final o C;
    public static final o D;
    public static final o E;
    public static final o[] F;

    static {
        o oVar = new o("UPLOADING", 0);
        A = oVar;
        o oVar2 = new o("PENDING", 1);
        B = oVar2;
        o oVar3 = new o("COMPLETED", 2);
        C = oVar3;
        o oVar4 = new o("SKIPPED", 3);
        D = oVar4;
        o oVar5 = new o("FAILED", 4);
        E = oVar5;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5};
        F = oVarArr;
        f50.c.v(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) F.clone();
    }
}
