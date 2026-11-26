package s10;

public final class i1 {
    public static final i1 A;
    public static final i1 B;
    public static final i1 C;
    public static final i1[] D;

    static {
        i1 i1Var = new i1("WARNING", 0);
        A = i1Var;
        i1 i1Var2 = new i1("ERROR", 1);
        B = i1Var2;
        i1 i1Var3 = new i1("HIDDEN", 2);
        C = i1Var3;
        i1[] i1VarArr = {i1Var, i1Var2, i1Var3};
        D = i1VarArr;
        f50.c.v(i1VarArr);
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) D.clone();
    }
}
