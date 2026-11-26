package a10;

public final class n {
    public static final n A;
    public static final n B;
    public static final n C;
    public static final n D;
    public static final n[] E;

    static {
        n nVar = new n("INSTANCE", 0);
        A = nVar;
        n nVar2 = new n("CONTEXT", 1);
        B = nVar2;
        n nVar3 = new n("EXTENSION_RECEIVER", 2);
        C = nVar3;
        n nVar4 = new n("VALUE", 3);
        D = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        E = nVarArr;
        f50.c.v(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) E.clone();
    }
}
