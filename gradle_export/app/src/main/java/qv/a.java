package qv;

import f50.c;

public final class a {
    public static final a A;
    public static final a B;
    public static final a[] C;

    static {
        a aVar = new a("LIST", 0);
        A = aVar;
        a aVar2 = new a("GRID", 1);
        B = aVar2;
        a[] aVarArr = {aVar, aVar2};
        C = aVarArr;
        c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) C.clone();
    }
}
