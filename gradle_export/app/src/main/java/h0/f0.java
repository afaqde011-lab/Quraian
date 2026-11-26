package h0;

public final class f0 {
    public static final f0 A;
    public static final f0[] B;

    f0 EF0;

    static {
        f0 f0Var = new f0("Visible", 0);
        f0 f0Var2 = new f0("Clip", 1);
        A = f0Var2;
        f0[] f0VarArr = {f0Var, f0Var2, new f0("ExpandIndicator", 2), new f0("ExpandOrCollapseIndicator", 3)};
        B = f0VarArr;
        f50.c.v(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) B.clone();
    }
}
