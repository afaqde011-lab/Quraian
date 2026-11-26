package p20;

public final class p {
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p[] D;

    static {
        p pVar = new p("ALL", 0);
        A = pVar;
        p pVar2 = new p("ONLY_NON_SYNTHESIZED", 1);
        B = pVar2;
        p pVar3 = new p("NONE", 2);
        C = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        D = pVarArr;
        f50.c.v(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) D.clone();
    }
}
