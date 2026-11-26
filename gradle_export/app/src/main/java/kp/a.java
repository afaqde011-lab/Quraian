package kp;

import f50.c;

public final class a {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a[] G;

    static {
        a aVar = new a("EMAIL", 0);
        A = aVar;
        a aVar2 = new a("ENTER_PASSWORD", 1);
        B = aVar2;
        a aVar3 = new a("ENTER_CODE", 2);
        C = aVar3;
        a aVar4 = new a("CREATE_PASSWORD", 3);
        D = aVar4;
        a aVar5 = new a("ENTER_DETAILS", 4);
        E = aVar5;
        a aVar6 = new a("NEW_PASSWORD", 5);
        F = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        G = aVarArr;
        c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) G.clone();
    }
}
