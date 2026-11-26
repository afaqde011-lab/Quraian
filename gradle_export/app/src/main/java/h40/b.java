package h40;

public final class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b[] F;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        A = bVar;
        b bVar2 = new b("BLOCKING", 1);
        B = bVar2;
        b bVar3 = new b("PARKING", 2);
        C = bVar3;
        b bVar4 = new b("DORMANT", 3);
        D = bVar4;
        b bVar5 = new b("TERMINATED", 4);
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
