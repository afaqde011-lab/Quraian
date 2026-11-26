package gm;

import f50.c;
import kotlin.NoWhenBranchMatchedException;

public final class a {
    public static final a A;
    public static final a B;
    public static final a[] C;

    static {
        a aVar = new a("PORTRAIT", 0);
        A = aVar;
        a aVar2 = new a("LANDSCAPE", 1);
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

    public final float a() {
        int i;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            i = 16;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 24;
        }
        return i;
    }
}
