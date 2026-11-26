package g2;

import kotlin.NoWhenBranchMatchedException;

public final class y implements x {
    public static final y A;
    public static final y B;
    public static final y C;
    public static final y[] D;

    static {
        y yVar = new y("Active", 0);
        A = yVar;
        y yVar2 = new y("ActiveParent", 1);
        B = yVar2;
        y yVar3 = new y("Captured", 2);
        y yVar4 = new y("Inactive", 3);
        C = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        D = yVarArr;
        f50.c.v(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) D.clone();
    }

    public final boolean a() throws NoWhenBranchMatchedException {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
