package ol;

public final class c {
    public static final c A;
    public static final c B;
    public static final c[] C;

    static {
        c cVar = new c("Success", 0);
        A = cVar;
        c cVar2 = new c("Error", 1);
        B = cVar2;
        c[] cVarArr = {cVar, cVar2};
        C = cVarArr;
        f50.c.v(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) C.clone();
    }
}
