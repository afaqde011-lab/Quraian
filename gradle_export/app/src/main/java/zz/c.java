package zz;

public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c[] E;

    static {
        c cVar = new c("READY", 0);
        A = cVar;
        c cVar2 = new c("NOT_CACHED", 1);
        B = cVar2;
        c cVar3 = new c("LOADING", 2);
        C = cVar3;
        c cVar4 = new c("FAILED", 3);
        D = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        E = cVarArr;
        f50.c.v(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) E.clone();
    }
}
