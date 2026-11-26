package q20;

public final class l {
    public static final l A;
    public static final l[] B;

    static {
        l lVar = new l("MustUse", 0);
        A = lVar;
        l[] lVarArr = {lVar, new l("ExplicitlyIgnorable", 1), new l("Unspecified", 2)};
        B = lVarArr;
        f50.c.v(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) B.clone();
    }
}
