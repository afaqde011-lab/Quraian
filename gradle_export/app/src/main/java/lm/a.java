package lm;

import f50.c;

public final class a {
    public static final a A;
    public static final a[] B;

    static {
        a aVar = new a("Production", 0);
        A = aVar;
        a[] aVarArr = {aVar, new a("Staging", 1), new a("None", 2)};
        B = aVarArr;
        c.v(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) B.clone();
    }
}
