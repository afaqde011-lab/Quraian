package ho;

public final class o {
    HOME("home"),
    CATALOG("catalog"),
    STORY_SCREEN("story_screen"),
    CONTINUE("continue"),
    AUTOPLAY_NEXT("autoplay_next");

    public final String A;

    static {
        f50.c.v(oVarArr);
    }

    public o(String str) {
        super(str, i);
        this.A = str;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) G.clone();
    }
}
