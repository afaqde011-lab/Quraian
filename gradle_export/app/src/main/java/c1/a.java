package c1;

public final class a {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a[] E;

    static {
        a aVar = new a("Start", 0);
        A = aVar;
        a aVar2 = new a("End", 1);
        B = aVar2;
        a aVar3 = new a("Inner", 2);
        C = aVar3;
        a aVar4 = new a("NotByUser", 3);
        D = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        E = aVarArr;
        f50.c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) E.clone();
    }
}
