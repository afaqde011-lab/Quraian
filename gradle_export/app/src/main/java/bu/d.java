package bu;

public final class d {
    public static final d A;
    public static final d B;
    public static final d[] C;

    static {
        d dVar = new d("Annual", 0);
        A = dVar;
        d dVar2 = new d("Monthly", 1);
        B = dVar2;
        d[] dVarArr = {dVar, dVar2};
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
