package s10;

public final class c0 extends e0 {
    public final int a;

    public c0(int i) {
        this.a = i;
    }

    @Override
    public final Object a() {
        return Integer.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.a == ((c0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
