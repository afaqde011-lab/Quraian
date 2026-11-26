package c1;

public final class c {
    public static final c A;
    public static final c B;
    public static final c[] C;

    static {
        c cVar = new c("MergeIfPossible", 0);
        A = cVar;
        c cVar2 = new c("ClearHistory", 1);
        c cVar3 = new c("NeverMerge", 2);
        B = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
