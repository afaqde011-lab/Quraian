package s10;

public final class g0 extends e0 {
    public final short a;

    public g0(short s) {
        this.a = s;
    }

    @Override
    public final Object a() {
        return Short.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.a == ((g0) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
