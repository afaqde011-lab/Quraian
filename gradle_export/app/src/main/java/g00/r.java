package g00;

public final class r implements Comparable {
    public final byte A;

    public r(byte b) {
        this.A = b;
    }

    @Override
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.f(this.A & 255, ((r) obj).A & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.A == ((r) obj).A;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 255);
    }
}
