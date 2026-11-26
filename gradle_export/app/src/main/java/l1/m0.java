package l1;

public final class m0 {
    public static final m0 A;
    public static final m0 B;
    public static final m0 C;
    public static final m0 D;
    public static final m0[] E;

    static {
        m0 m0Var = new m0("IGNORED", 0);
        A = m0Var;
        m0 m0Var2 = new m0("SCHEDULED", 1);
        B = m0Var2;
        m0 m0Var3 = new m0("DEFERRED", 2);
        C = m0Var3;
        m0 m0Var4 = new m0("IMMINENT", 3);
        D = m0Var4;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3, m0Var4};
        E = m0VarArr;
        f50.c.v(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) E.clone();
    }
}
