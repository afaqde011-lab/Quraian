package ry;

public final class d {
    APP_VERSION(2131886122),
    ANDROID_VERSION(2131886115),
    DEVICE_NAME(2131886414);

    public static final n00.b C;
    public final int A;

    static {
        C = f50.c.v(dVarArr);
    }

    public d(int i) {
        super(str, i);
        this.A = i;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) B.clone();
    }
}
