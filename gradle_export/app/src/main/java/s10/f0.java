package s10;

public final class f0 extends e0 {
    public final long a;

    public f0(long j) {
        this.a = j;
    }

    @Override
    public final Object a() {
        return Long.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a == ((f0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
