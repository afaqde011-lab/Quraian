package qr;

public final class r {
    public static final r A;
    public static final r[] B;
    public static final n00.b C;

    static {
        r rVar = new r("ALL", 0);
        A = rVar;
        r[] rVarArr = {rVar, new r("BY_SURAH", 1), new r("BY_RECITER", 2)};
        B = rVarArr;
        C = f50.c.v(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) B.clone();
    }
}
