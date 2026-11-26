package d10;

public final class f1 {
    public static final f1 A;
    public static final f1 B;
    public static final f1[] C;

    static {
        f1 f1Var = new f1("DECLARED", 0);
        A = f1Var;
        f1 f1Var2 = new f1("INHERITED", 1);
        B = f1Var2;
        f1[] f1VarArr = {f1Var, f1Var2};
        C = f1VarArr;
        f50.c.v(f1VarArr);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) C.clone();
    }
}
