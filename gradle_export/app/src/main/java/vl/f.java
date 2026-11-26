package vl;

public final class f implements k {
    public final r a;
    public final e b;

    public f(r source, e eVar) {
        kotlin.jvm.internal.m.e(source, "source");
        this.a = source;
        this.b = eVar;
    }

    @Override
    public final String a() {
        return "not_found";
    }

    @Override
    public final String b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.a, fVar.a) && this.b == fVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotFound(source=" + this.a + ", reason=" + this.b + ")";
    }
}
