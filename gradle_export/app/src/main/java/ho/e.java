package ho;

public final class e {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e D;
    public static final e E;
    public static final e[] F;
    public static final n00.b G;

    static {
        e eVar = new e("REMOVED", 0);
        A = eVar;
        e eVar2 = new e("UNAVAILABLE", 1);
        B = eVar2;
        e eVar3 = new e("NO_SPACE", 2);
        C = eVar3;
        e eVar4 = new e("MISMATCH", 3);
        D = eVar4;
        e eVar5 = new e("FAILED", 4);
        E = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        F = eVarArr;
        G = f50.c.v(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) F.clone();
    }
}
