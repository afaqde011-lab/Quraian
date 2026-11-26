package m3;

public final class j {
    public static final j A;
    public static final j B;
    public static final j C;
    public static final j D;
    public static final j E;
    public static final j F;
    public static final j G;
    public static final j[] H;

    static {
        j jVar = new j("Paragraph", 0);
        A = jVar;
        j jVar2 = new j("Span", 1);
        B = jVar2;
        j jVar3 = new j("VerbatimTts", 2);
        C = jVar3;
        j jVar4 = new j("Url", 3);
        D = jVar4;
        j jVar5 = new j("Link", 4);
        E = jVar5;
        j jVar6 = new j("Clickable", 5);
        F = jVar6;
        j jVar7 = new j("String", 6);
        G = jVar7;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        H = jVarArr;
        f50.c.v(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) H.clone();
    }
}
