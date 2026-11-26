package th;

import java.util.Objects;

public final class r {

    public final Class f14813a;

    public final Class f14814b;

    public r(Class cls, Class cls2) {
        this.f14813a = cls;
        this.f14814b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f14813a.equals(this.f14813a) && rVar.f14814b.equals(this.f14814b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14813a, this.f14814b);
    }

    public final String toString() {
        return this.f14813a.getSimpleName() + " with serialization type: " + this.f14814b.getSimpleName();
    }
}
