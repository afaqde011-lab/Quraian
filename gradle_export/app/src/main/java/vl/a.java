package vl;

public final class a {
    APP_LINK("app_link"),
    SCHEME("scheme");

    public final String A;

    static {
        f50.c.v(aVarArr);
    }

    public a(String str) {
        super(str, i);
        this.A = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) D.clone();
    }
}
