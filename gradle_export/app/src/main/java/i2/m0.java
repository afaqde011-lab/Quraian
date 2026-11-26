package i2;

public final class m0 {
    public static final m0[] A;

    m0 EF5;

    static {
        m0[] m0VarArr = {new m0("CounterClockwise", 0), new m0("Clockwise", 1)};
        A = m0VarArr;
        f50.c.v(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) A.clone();
    }
}
