package g00;

public final class d {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d[] D;

    static {
        d dVar = new d("WARNING", 0);
        A = dVar;
        d dVar2 = new d("ERROR", 1);
        B = dVar2;
        d dVar3 = new d("HIDDEN", 2);
        C = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        D = dVarArr;
        f50.c.v(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) D.clone();
    }
}
