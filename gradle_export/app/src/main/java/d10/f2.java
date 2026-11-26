package d10;

public final class f2 {
    public static final f2 A;
    public static final f2 B;
    public static final f2[] C;

    static {
        f2 f2Var = new f2("NOT_NULL", 0);
        A = f2Var;
        f2 f2Var2 = new f2("NULLABLE", 1);
        f2 f2Var3 = new f2("FLEXIBLE", 2);
        B = f2Var3;
        f2[] f2VarArr = {f2Var, f2Var2, f2Var3};
        C = f2VarArr;
        f50.c.v(f2VarArr);
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) C.clone();
    }
}
