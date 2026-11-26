package q3;

public final class x extends i {
    public final o10.b F;

    public x(o10.b bVar) {
        this.F = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.F.equals(((x) obj).F);
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.F + ')';
    }
}
