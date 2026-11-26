package su;

public final class e {
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FORTY(40),
    EIGHTY(80),
    UNLIMITED(null);

    public static final rp.m B = new rp.m(1);
    public static final e C = new e(2);
    public static final n00.b E;
    public final Integer A;

    static {
        E = f50.c.v(new e[]{r0, new e(5), new e(10), new e(20), new e(40), new e(80), new e(null)});
    }

    public e(Integer num) {
        super(str, i);
        this.A = num;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) D.clone();
    }
}
