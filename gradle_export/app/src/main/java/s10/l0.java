package s10;

public final class l0 extends e0 {
    public final short a;

    public l0(short s) {
        this.a = s;
    }

    @Override
    public final Object a() {
        return new g00.z(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.a == ((l0) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
