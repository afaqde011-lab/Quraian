package r00;

public final class h {
    public static final h A;
    public static final h[] B;

    h EF0;

    static {
        h hVar = new h("TOP_DOWN", 0);
        h hVar2 = new h("BOTTOM_UP", 1);
        A = hVar2;
        h[] hVarArr = {hVar, hVar2};
        B = hVarArr;
        f50.c.v(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) B.clone();
    }
}
