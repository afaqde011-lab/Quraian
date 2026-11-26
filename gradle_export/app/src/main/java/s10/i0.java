package s10;

public final class i0 extends e0 {
    public final byte a;

    public i0(byte b) {
        this.a = b;
    }

    @Override
    public final Object a() {
        return new g00.r(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.a == ((i0) obj).a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
