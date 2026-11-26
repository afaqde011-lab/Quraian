package c6;

public final class d {

    public final c f2889a;

    public final Number f2890b;

    public d(c cVar, Number number) {
        this.f2889a = cVar;
        this.f2890b = number;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2889a.equals(dVar.f2889a) && this.f2890b.equals(dVar.f2890b);
    }

    public final int hashCode() {
        return this.f2890b.hashCode() + this.f2889a.f2888a.hashCode();
    }

    public final String toString() {
        return "(" + this.f2889a.f2888a + ", " + this.f2890b + ')';
    }
}
