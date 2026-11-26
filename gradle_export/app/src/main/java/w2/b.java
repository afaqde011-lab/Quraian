package w2;

public final class b {
    public static final b A;
    public static final b B;
    public static final b[] C;

    static {
        b bVar = new b("Lsq2", 0);
        A = bVar;
        b bVar2 = new b("Impulse", 1);
        B = bVar2;
        b[] bVarArr = {bVar, bVar2};
        C = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) C.clone();
    }
}
