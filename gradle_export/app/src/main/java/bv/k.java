package bv;

public final class k implements g1 {
    public final boolean a;

    public k(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.j("OnCinematicModeSelected(isCinematic=", ")", this.a);
    }
}
