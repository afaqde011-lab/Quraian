package nb;

public final class e {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e D;
    public static final e[] E;

    static {
        e eVar = new e("MEMORY_CACHE", 0);
        A = eVar;
        e eVar2 = new e("MEMORY", 1);
        B = eVar2;
        e eVar3 = new e("DISK", 2);
        C = eVar3;
        e eVar4 = new e("NETWORK", 3);
        D = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        E = eVarArr;
        f50.c.v(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) E.clone();
    }
}
