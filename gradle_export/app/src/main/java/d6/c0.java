package d6;

public final class c0 implements b6.l {

    public final o6.b f4621a;

    public c0(o6.b bVar) {
        this.f4621a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f4621a.equals(((c0) obj).f4621a);
    }

    public final int hashCode() {
        return this.f4621a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f4621a + ')';
    }
}
