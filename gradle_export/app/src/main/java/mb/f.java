package mb;

public final class f extends h {

    public final m2.b f10808a;

    public f(m2.b bVar) {
        this.f10808a = bVar;
    }

    @Override
    public final m2.b a() {
        return this.f10808a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.f10808a, ((f) obj).f10808a);
    }

    public final int hashCode() {
        m2.b bVar = this.f10808a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f10808a + ')';
    }
}
