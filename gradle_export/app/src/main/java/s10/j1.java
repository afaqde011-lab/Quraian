package s10;

public final class j1 {
    public static final j1 A;
    public static final j1 B;
    public static final j1 C;
    public static final j1 D;
    public static final j1[] E;

    static {
        j1 j1Var = new j1("LANGUAGE_VERSION", 0);
        A = j1Var;
        j1 j1Var2 = new j1("COMPILER_VERSION", 1);
        B = j1Var2;
        j1 j1Var3 = new j1("API_VERSION", 2);
        C = j1Var3;
        j1 j1Var4 = new j1("UNKNOWN", 3);
        D = j1Var4;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3, j1Var4};
        E = j1VarArr;
        f50.c.v(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) E.clone();
    }
}
