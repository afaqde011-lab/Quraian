package d6;

public final class m1 {

    public final int f4678a;

    public m1(int i10) {
        this.f4678a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && this.f4678a == ((m1) obj).f4678a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4678a);
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("LayoutInfo(layoutId="), this.f4678a, ')');
    }
}
