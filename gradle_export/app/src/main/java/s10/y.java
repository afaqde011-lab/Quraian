package s10;

public final class y extends e0 {
    public final char a;

    public y(char c) {
        this.a = c;
    }

    @Override
    public final Object a() {
        return Character.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.a == ((y) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }
}
