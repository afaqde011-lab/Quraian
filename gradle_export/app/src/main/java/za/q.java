package za;

public final class q extends t {

    public final g f17395a;

    public q() {
        this(g.f17367b);
    }

    public q(g gVar) {
        this.f17395a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return this.f17395a.equals(((q) obj).f17395a);
    }

    public final int hashCode() {
        return this.f17395a.hashCode() + (q.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f17395a + '}';
    }
}
