package ep;

public final class e {
    public static final Object A;
    public static final e B;
    public static final e C;
    public static final d Companion;
    public static final e D;
    public static final e[] E;

    static {
        e eVar = new e("APPLE", 0);
        B = eVar;
        e eVar2 = new e("GOOGLE", 1);
        C = eVar2;
        e eVar3 = new e("EMAIL", 2);
        D = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        E = eVarArr;
        f50.c.v(eVarArr);
        Companion = new d();
        A = rd.a.I(g00.i.B, new e00.g(6));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) E.clone();
    }
}
