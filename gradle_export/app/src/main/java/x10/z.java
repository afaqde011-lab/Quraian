package x10;

public final class z {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public final String A;

    static {
        f50.c.v(zVarArr);
    }

    public z(String str) {
        super(str, i);
        this.A = str;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) E.clone();
    }
}
