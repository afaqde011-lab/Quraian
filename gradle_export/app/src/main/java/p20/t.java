package p20;

public abstract class t {
    public static final s A;
    public static final r B;
    public static final t[] C;

    static {
        s sVar = new s();
        A = sVar;
        r rVar = new r();
        B = rVar;
        t[] tVarArr = {sVar, rVar};
        C = tVarArr;
        f50.c.v(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) C.clone();
    }

    public abstract String a(String str);
}
