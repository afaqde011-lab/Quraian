package g20;

public final class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b[] D;

    static {
        b bVar = new b("PROPERTY", 0);
        A = bVar;
        b bVar2 = new b("BACKING_FIELD", 1);
        B = bVar2;
        b bVar3 = new b("DELEGATE_FIELD", 2);
        C = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        D = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) D.clone();
    }
}
