package rc;

public final class k extends m {

    public final gd.a f13196a;

    public k(gd.a aVar) {
        this.f13196a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.f13196a, ((k) obj).f13196a);
    }

    public final int hashCode() {
        return this.f13196a.hashCode();
    }

    public final String toString() {
        return "Event(event=" + this.f13196a + ')';
    }
}
