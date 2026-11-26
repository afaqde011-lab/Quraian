package r3;

public final class c0 {

    public final m3.h f13065a;

    public final p f13066b;

    public c0(m3.h hVar, p pVar) {
        this.f13065a = hVar;
        this.f13066b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f13065a, c0Var.f13065a) && kotlin.jvm.internal.m.a(this.f13066b, c0Var.f13066b);
    }

    public final int hashCode() {
        return this.f13066b.hashCode() + (this.f13065a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f13065a) + ", offsetMapping=" + this.f13066b + ')';
    }
}
