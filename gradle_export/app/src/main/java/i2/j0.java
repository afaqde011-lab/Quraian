package i2;

public final class j0 extends l0 {

    public final h2.c f7140a;

    public j0(h2.c cVar) {
        this.f7140a = cVar;
    }

    @Override
    public final h2.c a() {
        return this.f7140a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return kotlin.jvm.internal.m.a(this.f7140a, ((j0) obj).f7140a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7140a.hashCode();
    }
}
