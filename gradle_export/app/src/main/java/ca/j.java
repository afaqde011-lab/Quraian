package ca;

public final class j {
    public static final j A;
    public static final j B;
    public static final j C;
    public static final j[] D;

    static {
        j jVar = new j("NO_OP", 0);
        A = jVar;
        j jVar2 = new j("ADD", 1);
        B = jVar2;
        j jVar3 = new j("REMOVE", 2);
        C = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        D = jVarArr;
        f50.c.v(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) D.clone();
    }
}
