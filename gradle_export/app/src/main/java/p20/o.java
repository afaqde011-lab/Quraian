package p20;

public final class o {
    public static final o A;
    public static final o B;
    public static final o[] C;

    static {
        o oVar = new o("RENDER_OVERRIDE", 0);
        A = oVar;
        o oVar2 = new o("RENDER_OPEN", 1);
        B = oVar2;
        o[] oVarArr = {oVar, oVar2, new o("RENDER_OPEN_OVERRIDE", 2)};
        C = oVarArr;
        f50.c.v(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) C.clone();
    }
}
