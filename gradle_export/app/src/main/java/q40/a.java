package q40;

public final class a {
    public static final a A;
    public static final a B;
    public static final a[] C;

    static {
        a aVar = new a("NONE", 0);
        A = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        B = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        C = aVarArr;
        f50.c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) C.clone();
    }
}
