package xj;

public final class d {
    public static final d A;
    public static final d B;
    public static final d[] C;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        A = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        B = dVar2;
        d[] dVarArr = {dVar, dVar2, new d("MATT_SAYS_HI", 2)};
        C = dVarArr;
        f50.c.v(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) C.clone();
    }
}
