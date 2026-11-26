package g00;

public final class z implements Comparable {
    public final short A;

    public z(short s) {
        this.A = s;
    }

    @Override
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.f(this.A & 65535, ((z) obj).A & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.A == ((z) obj).A;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 65535);
    }
}
