package h1;

public final class f1 {
    public static final f1[] A;

    f1 EF5;

    static {
        f1[] f1VarArr = {new f1("Filled", 0), new f1("Outlined", 1)};
        A = f1VarArr;
        f50.c.v(f1VarArr);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) A.clone();
    }
}
