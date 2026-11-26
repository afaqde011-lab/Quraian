package y4;

import java.util.Objects;

public final class b {

    public final Object f16603a;

    public final Object f16604b;

    public b(Object obj, Object obj2) {
        this.f16603a = obj;
        this.f16604b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f16603a, this.f16603a) && Objects.equals(bVar.f16604b, this.f16604b);
    }

    public final int hashCode() {
        Object obj = this.f16603a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f16604b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f16603a + " " + this.f16604b + "}";
    }
}
