package wj;

public final class v implements dj.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    public final int A;

    static {
        f50.c.v(vVarArr);
    }

    public v(int i10) {
        super(str, i);
        this.A = i10;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) C.clone();
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
