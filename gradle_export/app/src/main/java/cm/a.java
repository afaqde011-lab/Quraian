package cm;

import sg.f;

public final class a {
    public static final f A;
    public static final a B;
    public static final a C;
    public static final a[] D;

    static {
        a aVar = new a("TABLET", 0);
        B = aVar;
        a aVar2 = new a("PHONE", 1);
        C = aVar2;
        a[] aVarArr = {aVar, aVar2};
        D = aVarArr;
        f50.c.v(aVarArr);
        A = new f();
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) D.clone();
    }
}
