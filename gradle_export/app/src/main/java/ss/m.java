package ss;

public final class m {
    public static final m A;
    public static final m B;
    public static final m C;
    public static final m D;
    public static final m[] E;

    static {
        m mVar = new m("ACCEPTED", 0);
        A = mVar;
        m mVar2 = new m("CONFLICT", 1);
        B = mVar2;
        m mVar3 = new m("REJECTED", 2);
        C = mVar3;
        m mVar4 = new m("FORBIDDEN", 3);
        D = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        E = mVarArr;
        f50.c.v(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) E.clone();
    }
}
