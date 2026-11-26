package c40;

public final class a {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a[] D;

    static {
        a aVar = new a("SUSPEND", 0);
        A = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        B = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        C = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        D = aVarArr;
        f50.c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) D.clone();
    }
}
