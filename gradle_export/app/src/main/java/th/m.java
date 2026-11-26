package th;

import java.util.Objects;

public final class m {

    public final Class f14806a;

    public final Class f14807b;

    public m(Class cls, Class cls2) {
        this.f14806a = cls;
        this.f14807b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f14806a.equals(this.f14806a) && mVar.f14807b.equals(this.f14807b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14806a, this.f14807b);
    }

    public final String toString() {
        return this.f14806a.getSimpleName() + " with primitive type: " + this.f14807b.getSimpleName();
    }
}
