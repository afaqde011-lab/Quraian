package s10;

public final class j0 extends e0 {
    public final int a;

    public j0(int i) {
        this.a = i;
    }

    @Override
    public final Object a() {
        return new g00.u(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.a == ((j0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
