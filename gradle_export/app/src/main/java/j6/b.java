package j6;

public final class b {

    public final int f8171a;

    public b(int i10) {
        this.f8171a = i10;
    }

    public static final b a(int i10) {
        return new b(i10);
    }

    public static String b(int i10) {
        return oi.k.h("Vertical(value=", i10, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f8171a == ((b) obj).f8171a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8171a);
    }

    public final String toString() {
        return b(this.f8171a);
    }
}
