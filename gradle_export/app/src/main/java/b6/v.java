package b6;

public final class v {
    public static final v A;
    public static final v[] B;

    static {
        v vVar = new v("Visible", 0);
        A = vVar;
        v[] vVarArr = {vVar, new v("Invisible", 1), new v("Gone", 2)};
        B = vVarArr;
        f50.c.v(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) B.clone();
    }
}
