package wj;

public final class j implements dj.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    public final int A;

    static {
        f50.c.v(jVarArr);
    }

    public j(int i10) {
        super(str, i);
        this.A = i10;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) E.clone();
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
