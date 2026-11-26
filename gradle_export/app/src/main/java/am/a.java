package am;

public final class a {
    CONTENT_NOT_FOUND(2131886401),
    NEEDS_INTERNET(2131886402);

    public final int A;

    static {
        f50.c.v(aVarArr);
    }

    public a(int i) {
        super(str, i);
        this.A = i;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) D.clone();
    }
}
