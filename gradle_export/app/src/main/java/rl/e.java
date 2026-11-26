package rl;

public final class e {
    public static final e A;
    public static final e[] B;

    static {
        e eVar = new e("Above", 0);
        A = eVar;
        e[] eVarArr = {eVar, new e("Below", 1)};
        B = eVarArr;
        f50.c.v(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) B.clone();
    }
}
