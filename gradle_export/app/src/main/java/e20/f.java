package e20;

public final class f {
    public static final f[] A;

    f EF5;

    static {
        f[] fVarArr = {new f("SOURCE", 0), new f("BINARY", 1)};
        A = fVarArr;
        f50.c.v(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) A.clone();
    }
}
