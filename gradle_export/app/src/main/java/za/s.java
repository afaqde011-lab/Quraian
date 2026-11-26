package za;

public final class s extends t {

    public final g f17396a;

    public s(g gVar) {
        this.f17396a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return this.f17396a.equals(((s) obj).f17396a);
    }

    public final int hashCode() {
        return this.f17396a.hashCode() + (s.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f17396a + '}';
    }
}
