package k10;

import ri.t1;

public final class d {
    ALL(null),
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    public final String A;

    static {
        f50.c.v(dVarArr);
    }

    public d(String str) {
        super(str, i);
        this.A = str == null ? t1.Q(name()) : str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) K.clone();
    }
}
