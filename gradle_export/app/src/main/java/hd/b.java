package hd;

public final class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b[] F;

    static {
        b bVar = new b("Before", 0);
        A = bVar;
        b bVar2 = new b("Enrichment", 1);
        B = bVar2;
        b bVar3 = new b("Destination", 2);
        C = bVar3;
        b bVar4 = new b("Utility", 3);
        D = bVar4;
        b bVar5 = new b("Observe", 4);
        E = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        F = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) F.clone();
    }
}
