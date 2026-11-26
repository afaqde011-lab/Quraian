package d6;

public final class y {

    public final int f4715a;

    public y(int i10) {
        this.f4715a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f4715a == ((y) obj).f4715a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4715a);
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("ContainerInfo(layoutId="), this.f4715a, ')');
    }
}
