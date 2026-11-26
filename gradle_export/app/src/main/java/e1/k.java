package e1;

public final class k {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k[] E;

    static {
        k kVar = new k("Up", 0);
        A = kVar;
        k kVar2 = new k("Drag", 1);
        B = kVar2;
        k kVar3 = new k("Timeout", 2);
        C = kVar3;
        k kVar4 = new k("Cancel", 3);
        D = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        E = kVarArr;
        f50.c.v(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) E.clone();
    }
}
