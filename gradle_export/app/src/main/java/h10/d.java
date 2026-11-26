package h10;

public final class d {
    public static final hb.f A;
    public static final d[] B;

    d EF5;

    static {
        d[] dVarArr = {new d("Function", 0), new d("SuspendFunction", 1), new d("KFunction", 2), new d("KSuspendFunction", 3), new d("UNKNOWN", 4)};
        B = dVarArr;
        f50.c.v(dVarArr);
        A = new hb.f();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) B.clone();
    }
}
