package f20;

public final class h {
    public static final h A;
    public static final h B;
    public static final h C;
    public static final h[] D;

    static {
        h hVar = new h("FORCE_FLEXIBILITY", 0);
        A = hVar;
        h hVar2 = new h("NULLABLE", 1);
        B = hVar2;
        h hVar3 = new h("NOT_NULL", 2);
        C = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        D = hVarArr;
        f50.c.v(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) D.clone();
    }
}
