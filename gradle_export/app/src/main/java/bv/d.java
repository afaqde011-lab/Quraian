package bv;

public final class d implements g1 {
    public final yu.g a;

    public d(yu.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnBottomSheetLayoutModeChanged(layoutModel=" + this.a + ")";
    }
}
