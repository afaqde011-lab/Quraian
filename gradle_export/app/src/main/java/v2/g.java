package v2;

public final class g {

    public final long f15366a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f15366a == ((g) obj).f15366a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15366a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f15366a + ')';
    }
}
