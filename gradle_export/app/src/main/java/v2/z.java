package v2;

public final class z {

    public final int f15428a;

    public z(int i10) {
        this.f15428a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f15428a == ((z) obj).f15428a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15428a);
    }

    public final String toString() {
        return oi.k.h("PointerKeyboardModifiers(packedValue=", this.f15428a, ')');
    }
}
