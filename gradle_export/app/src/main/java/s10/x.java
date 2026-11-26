package s10;

public final class x extends e0 {
    public final byte a;

    public x(byte b) {
        this.a = b;
    }

    @Override
    public final Object a() {
        return Byte.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.a == ((x) obj).a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
