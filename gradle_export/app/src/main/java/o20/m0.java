package o20;

public enum m0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(e.A),
    ENUM(null),
    MESSAGE(null);

    public final Object A;

    m0(Object obj) {
        this.A = obj;
    }
}
