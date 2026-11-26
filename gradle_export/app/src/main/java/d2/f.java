package d2;

public final class f {
    public static final f A;
    public static final f B;
    public static final f[] C;

    static {
        f fVar = new f("VIEW_APPEAR", 0);
        A = fVar;
        f fVar2 = new f("VIEW_DISAPPEAR", 1);
        B = fVar2;
        f[] fVarArr = {fVar, fVar2};
        C = fVarArr;
        f50.c.v(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) C.clone();
    }
}
