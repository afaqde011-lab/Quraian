package x;

public final class l0 {
    public static final l0 A;
    public static final l0[] B;

    static {
        l0 l0Var = new l0("Default", 0);
        A = l0Var;
        l0[] l0VarArr = {l0Var, new l0("UserInput", 1), new l0("PreventUserInput", 2)};
        B = l0VarArr;
        f50.c.v(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) B.clone();
    }
}
