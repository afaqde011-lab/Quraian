package ry;

public final class e {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e[] D;

    static {
        e eVar = new e("PHONE", 0);
        A = eVar;
        e eVar2 = new e("TABLET", 1);
        B = eVar2;
        e eVar3 = new e("COMPUTER", 2);
        C = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        D = eVarArr;
        f50.c.v(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) D.clone();
    }
}
