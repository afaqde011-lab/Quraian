package g00;

public final class u implements Comparable {
    public final int A;

    public u(int i) {
        this.A = i;
    }

    public static String a(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @Override
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.f(this.A ^ Integer.MIN_VALUE, ((u) obj).A ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.A == ((u) obj).A;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return a(this.A);
    }
}
