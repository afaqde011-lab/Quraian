package g2;

public final class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b[] D;

    static {
        b bVar = new b("None", 0);
        A = bVar;
        b bVar2 = new b("Cancelled", 1);
        B = bVar2;
        b bVar3 = new b("Redirected", 2);
        C = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
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
