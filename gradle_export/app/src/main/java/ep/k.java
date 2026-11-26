package ep;

import kotlin.NoWhenBranchMatchedException;

public final class k {
    public static final gj.e A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;
    public static final k G;
    public static final k[] H;

    static {
        k kVar = new k("DEVICE_LIMIT", 0);
        B = kVar;
        k kVar2 = new k("LOGOUT", 1);
        C = kVar2;
        k kVar3 = new k("PASSWORD_CHANGED", 2);
        D = kVar3;
        k kVar4 = new k("ACCOUNT_DELETED", 3);
        E = kVar4;
        k kVar5 = new k("EXPIRED", 4);
        F = kVar5;
        k kVar6 = new k("UNKNOWN", 5);
        G = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        H = kVarArr;
        f50.c.v(kVarArr);
        A = new gj.e(11);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) H.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 2131886179;
        }
        if (iOrdinal == 1) {
            return 2131886182;
        }
        if (iOrdinal == 2) {
            return 2131886181;
        }
        if (iOrdinal == 3) {
            return 2131886178;
        }
        if (iOrdinal == 4 || iOrdinal == 5) {
            return 2131886180;
        }
        throw new NoWhenBranchMatchedException();
    }
}
