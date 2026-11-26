package t20;

public final class a {
    public static final a A;
    public static final a[] B;

    a EF0;

    static {
        a aVar = new a("WARNING", 0);
        a aVar2 = new a("ERROR", 1);
        A = aVar2;
        a[] aVarArr = {aVar, aVar2, new a("HIDDEN", 2)};
        B = aVarArr;
        f50.c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) B.clone();
    }
}
