package nb;

public final class k {
    public static final k A;
    public static final k[] B;

    k EF0;

    static {
        k kVar = new k("IGNORE", 0);
        k kVar2 = new k("RESPECT_PERFORMANCE", 1);
        A = kVar2;
        k[] kVarArr = {kVar, kVar2, new k("RESPECT_ALL", 2)};
        B = kVarArr;
        f50.c.v(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) B.clone();
    }
}
