package b3;

public final class v {
    public static final v A;
    public static final v B;
    public static final v C;
    public static final v D;
    public static final v[] E;

    static {
        v vVar = new v("LookaheadMeasurement", 0);
        A = vVar;
        v vVar2 = new v("LookaheadPlacement", 1);
        B = vVar2;
        v vVar3 = new v("Measurement", 2);
        C = vVar3;
        v vVar4 = new v("Placement", 3);
        D = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        E = vVarArr;
        f50.c.v(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) E.clone();
    }
}
