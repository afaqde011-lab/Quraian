package ho;

public final class l {
    PLAY_START("play_start"),
    PROGRESS("progress"),
    PAUSE("pause"),
    RESUME("resume"),
    SEEK("seek"),
    STOP("stop"),
    AUDIO_END("audio_end"),
    APP_BACKGROUND("app_background"),
    PREVIEW_LIMIT_REACHED("preview_limit_reached"),
    LANGUAGE_CHANGE("language_change"),
    RATE_CHANGE("rate_change");

    public final String A;

    static {
        f50.c.v(lVarArr);
    }

    public l(String str) {
        super(str, i);
        this.A = str;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) M.clone();
    }
}
