package m3;

public final class s0 implements c {

    public final String f10532a;

    public s0(String str) {
        this.f10532a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return kotlin.jvm.internal.m.a(this.f10532a, ((s0) obj).f10532a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10532a.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("UrlAnnotation(url="), this.f10532a, ')');
    }
}
