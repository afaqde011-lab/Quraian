package c2;

public final class d {

    public final int f2610a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f2610a == ((d) obj).f2610a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2610a);
    }

    public final String toString() {
        return oi.k.h("AndroidContentDataType(androidAutofillType=", this.f2610a, ')');
    }
}
