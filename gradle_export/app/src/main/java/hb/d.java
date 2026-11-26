package hb;

public final class d {

    public final String f6967a;

    public final Long f6968b;

    public d(String str, Long l) {
        this.f6967a = str;
        this.f6968b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f6967a, dVar.f6967a) && kotlin.jvm.internal.m.a(this.f6968b, dVar.f6968b);
    }

    public final int hashCode() {
        int iHashCode = this.f6967a.hashCode() * 31;
        Long l = this.f6968b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f6967a + ", value=" + this.f6968b + ')';
    }
}
