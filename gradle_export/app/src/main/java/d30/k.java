package d30;

public final class k {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k[] D;

    static {
        k kVar = new k("NOT_COMPUTED", 0);
        A = kVar;
        k kVar2 = new k("COMPUTING", 1);
        B = kVar2;
        k kVar3 = new k("RECURSION_WAS_DETECTED", 2);
        C = kVar3;
        D = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) D.clone();
    }
}
