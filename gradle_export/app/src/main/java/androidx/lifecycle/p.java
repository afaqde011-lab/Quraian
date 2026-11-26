package androidx.lifecycle;

public final class p {
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p D;
    public static final p E;
    public static final p[] F;

    static {
        p pVar = new p("DESTROYED", 0);
        A = pVar;
        p pVar2 = new p("INITIALIZED", 1);
        B = pVar2;
        p pVar3 = new p("CREATED", 2);
        C = pVar3;
        p pVar4 = new p("STARTED", 3);
        D = pVar4;
        p pVar5 = new p("RESUMED", 4);
        E = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
        F = pVarArr;
        f50.c.v(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) F.clone();
    }
}
