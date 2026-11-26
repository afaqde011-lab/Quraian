package bd;

public final class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b[] G;

    static {
        b bVar = new b("Created", 0);
        A = bVar;
        b bVar2 = new b("Started", 1);
        B = bVar2;
        b bVar3 = new b("Resumed", 2);
        C = bVar3;
        b bVar4 = new b("Paused", 3);
        D = bVar4;
        b bVar5 = new b("Stopped", 4);
        E = bVar5;
        b bVar6 = new b("Destroyed", 5);
        F = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        G = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) G.clone();
    }
}
