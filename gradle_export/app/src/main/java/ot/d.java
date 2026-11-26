package ot;

public final class d {
    public static final d A;
    public static final d B;
    public static final d[] C;
    public static final n00.b D;

    static {
        d dVar = new d("ARABIC", 0);
        A = dVar;
        d dVar2 = new d("TRANSCRIPTION", 1);
        B = dVar2;
        d[] dVarArr = {dVar, dVar2};
        C = dVarArr;
        D = f50.c.v(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) C.clone();
    }
}
