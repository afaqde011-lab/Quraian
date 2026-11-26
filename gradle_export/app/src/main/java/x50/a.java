package x50;

import f50.c;

public final class a {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a[] F;

    static {
        a aVar = new a("DEBUG", 0);
        A = aVar;
        a aVar2 = new a("INFO", 1);
        B = aVar2;
        a aVar3 = new a("WARNING", 2);
        C = aVar3;
        a aVar4 = new a("ERROR", 3);
        D = aVar4;
        a aVar5 = new a("NONE", 4);
        E = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        F = aVarArr;
        c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) F.clone();
    }
}
