package md;

public final class c {
    public static final c A;
    public static final c[] B;

    c EF0;

    static {
        c cVar = new c("GET", 0);
        c cVar2 = new c("POST", 1);
        A = cVar2;
        c[] cVarArr = {cVar, cVar2, new c("PUT", 2), new c("DELETE", 3), new c("PATCH", 4)};
        B = cVarArr;
        f50.c.v(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) B.clone();
    }
}
