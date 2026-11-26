package x;

public final class p0 {
    public static final p0 A;
    public static final p0 B;
    public static final p0[] C;

    static {
        p0 p0Var = new p0("Restart", 0);
        A = p0Var;
        p0 p0Var2 = new p0("Reverse", 1);
        B = p0Var2;
        p0[] p0VarArr = {p0Var, p0Var2};
        C = p0VarArr;
        f50.c.v(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) C.clone();
    }
}
