package wj;

public final class n implements dj.f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    public final int A;

    static {
        f50.c.v(nVarArr);
    }

    public n(int i10) {
        super(str, i);
        this.A = i10;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) C.clone();
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
