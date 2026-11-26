package j6;

public final class a {

    public final int f8170a;

    public a(int i10) {
        this.f8170a = i10;
    }

    public static final a a(int i10) {
        return new a(i10);
    }

    public static String b(int i10) {
        return oi.k.h("Horizontal(value=", i10, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f8170a == ((a) obj).f8170a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8170a);
    }

    public final String toString() {
        return b(this.f8170a);
    }
}
