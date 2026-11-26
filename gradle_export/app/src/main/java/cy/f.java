package cy;

public final class f {
    public static final f A;
    public static final f B;
    public static final f C;
    public static final f[] D;

    static {
        f fVar = new f("RECITER", 0);
        A = fVar;
        f fVar2 = new f("SURAH", 1);
        B = fVar2;
        f fVar3 = new f("PLAYLIST", 2);
        C = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        D = fVarArr;
        f50.c.v(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) D.clone();
    }
}
