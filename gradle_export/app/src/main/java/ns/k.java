package ns;

public final class k {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k[] D;

    static {
        k kVar = new k("NONE", 0);
        A = kVar;
        k kVar2 = new k("DELAYED", 1);
        B = kVar2;
        k kVar3 = new k("NOW", 2);
        C = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        D = kVarArr;
        f50.c.v(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) D.clone();
    }
}
