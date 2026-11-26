package pa;

public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c[] F;

    static {
        c cVar = new c("END", 0);
        A = cVar;
        c cVar2 = new c("ROLLBACK", 1);
        B = cVar2;
        c cVar3 = new c("BEGIN_EXCLUSIVE", 2);
        C = cVar3;
        c cVar4 = new c("BEGIN_IMMEDIATE", 3);
        D = cVar4;
        c cVar5 = new c("BEGIN_DEFERRED", 4);
        E = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        F = cVarArr;
        f50.c.v(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) F.clone();
    }
}
