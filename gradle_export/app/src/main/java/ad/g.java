package ad;

public final class g {
    public static final g[] A;

    g EF5;

    static {
        g[] gVarArr = {new g("V3", 0)};
        A = gVarArr;
        f50.c.v(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) A.clone();
    }
}
