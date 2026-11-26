package i10;

public final class h {
    public static final h[] A;

    h EF5;

    static {
        h[] hVarArr = {new h("FROM_DEPENDENCIES", 0), new h("FROM_CLASS_LOADER", 1), new h("FALLBACK", 2)};
        A = hVarArr;
        f50.c.v(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) A.clone();
    }
}
