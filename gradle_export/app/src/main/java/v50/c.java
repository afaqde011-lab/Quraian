package v50;

public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c[] D;

    static {
        c cVar = new c("Singleton", 0);
        A = cVar;
        c cVar2 = new c("Factory", 1);
        B = cVar2;
        c cVar3 = new c("Scoped", 2);
        C = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        D = cVarArr;
        f50.c.v(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) D.clone();
    }
}
