package c3;

public final class c1 {

    public final int f2636a;

    public c1(int i10) {
        this.f2636a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            return this.f2636a == ((c1) obj).f2636a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2636a);
    }

    public final String toString() {
        return oi.k.h("AutoClearFocusBehavior(value=", this.f2636a, ')');
    }
}
