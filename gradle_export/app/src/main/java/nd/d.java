package nd;

public final class d {
    public static final d A;
    public static final d[] B;

    d EF0;

    static {
        d dVar = new d("EVENT", 0);
        d dVar2 = new d("IDENTIFY", 1);
        A = dVar2;
        d[] dVarArr = {dVar, dVar2};
        B = dVarArr;
        f50.c.v(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) B.clone();
    }
}
