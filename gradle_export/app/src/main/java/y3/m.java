package y3;

public final class m {
    public static final m A;
    public static final m B;
    public static final m[] C;

    static {
        m mVar = new m("Ltr", 0);
        A = mVar;
        m mVar2 = new m("Rtl", 1);
        B = mVar2;
        m[] mVarArr = {mVar, mVar2};
        C = mVarArr;
        f50.c.v(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) C.clone();
    }
}
