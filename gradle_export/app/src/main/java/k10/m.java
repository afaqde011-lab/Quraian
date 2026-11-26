package k10;

public final class m {
    public static final m A;
    public static final m B;
    public static final m C;
    public static final m[] D;

    static {
        m mVar = new m("RUNTIME", 0);
        A = mVar;
        m mVar2 = new m("BINARY", 1);
        B = mVar2;
        m mVar3 = new m("SOURCE", 2);
        C = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        D = mVarArr;
        f50.c.v(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) D.clone();
    }
}
