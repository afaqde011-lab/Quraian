package vl;

public final class e {
    public static final e A;
    public static final e B;
    public static final e[] C;

    static {
        e eVar = new e("MISSING", 0);
        A = eVar;
        e eVar2 = new e("OFFLINE", 1);
        B = eVar2;
        e[] eVarArr = {eVar, eVar2};
        C = eVarArr;
        f50.c.v(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) C.clone();
    }
}
