package s10;

public final class k0 extends e0 {
    public final long a;

    public k0(long j) {
        this.a = j;
    }

    @Override
    public final Object a() {
        return new g00.w(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.a == ((k0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
