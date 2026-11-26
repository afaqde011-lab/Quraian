package x3;

public final class j {
    public static final j A;
    public static final j B;
    public static final j[] C;

    static {
        j jVar = new j("Ltr", 0);
        A = jVar;
        j jVar2 = new j("Rtl", 1);
        B = jVar2;
        j[] jVarArr = {jVar, jVar2};
        C = jVarArr;
        f50.c.v(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) C.clone();
    }
}
