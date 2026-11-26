package oy;

public final class c {
    public static final c A;
    public static final c[] B;
    public static final n00.b C;

    c EF0;

    static {
        c cVar = new c("CANCELLED", 0);
        c cVar2 = new c("ALREADY_CANCELED", 1);
        c cVar3 = new c("MANAGE_IN_STORE", 2);
        c cVar4 = new c("UNKNOWN", 3);
        A = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        B = cVarArr;
        C = f50.c.v(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) B.clone();
    }
}
