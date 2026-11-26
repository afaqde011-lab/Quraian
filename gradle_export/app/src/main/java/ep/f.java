package ep;

public final class f {
    public static final f A;
    public static final f B;
    public static final f C;
    public static final f[] D;
    public static final n00.b E;

    static {
        f fVar = new f("MALE", 0);
        A = fVar;
        f fVar2 = new f("FEMALE", 1);
        B = fVar2;
        f fVar3 = new f("OTHER", 2);
        C = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        D = fVarArr;
        E = f50.c.v(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) D.clone();
    }
}
