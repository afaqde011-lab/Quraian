package th;

import java.util.Objects;

public final class q {

    public final Class f14811a;

    public final ai.a f14812b;

    public q(Class cls, ai.a aVar) {
        this.f14811a = cls;
        this.f14812b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f14811a.equals(this.f14811a) && qVar.f14812b.equals(this.f14812b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14811a, this.f14812b);
    }

    public final String toString() {
        return this.f14811a.getSimpleName() + ", object identifier: " + this.f14812b;
    }
}
