package ss;

public final class f {
    PROGRESS("progress"),
    PAUSE("pause"),
    STOP("stop"),
    SEEK("seek"),
    TRACK_CHANGE("track_change"),
    AUDIO_END("audio_end");

    public static final n00.b I;
    public final String A;

    static {
        I = f50.c.v(fVarArr);
    }

    public f(String str) {
        super(str, i);
        this.A = str;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) H.clone();
    }
}
