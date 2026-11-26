package yu;

public final class g {
    public static final g A;
    public static final g B;
    public static final g C;
    public static final g D;
    public static final g[] E;

    static {
        g gVar = new g("TRACKS_TOP", 0);
        A = gVar;
        g gVar2 = new g("TRACKS_TOP_WITH_CONTROLS", 1);
        B = gVar2;
        g gVar3 = new g("TRACKS_RIGHT", 2);
        C = gVar3;
        g gVar4 = new g("TRACKS_LEFT", 3);
        D = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        E = gVarArr;
        f50.c.v(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) E.clone();
    }
}
