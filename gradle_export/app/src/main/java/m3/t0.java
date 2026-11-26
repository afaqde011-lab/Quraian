package m3;

public final class t0 implements c {

    public final String f10536a;

    public t0(String str) {
        this.f10536a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return kotlin.jvm.internal.m.a(this.f10536a, ((t0) obj).f10536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10536a.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f10536a, ')');
    }
}
