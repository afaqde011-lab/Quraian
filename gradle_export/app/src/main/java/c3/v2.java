package c3;

public final class v2 {
    public static final v2 A;
    public static final v2[] B;

    v2 EF0;

    static {
        v2 v2Var = new v2("Shown", 0);
        v2 v2Var2 = new v2("Hidden", 1);
        A = v2Var2;
        v2[] v2VarArr = {v2Var, v2Var2};
        B = v2VarArr;
        f50.c.v(v2VarArr);
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) B.clone();
    }
}
