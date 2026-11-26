package wj;

public final class k {

    public final j f16184a;

    public final j f16185b;

    public final double f16186c;

    public k(j jVar, j jVar2, double d3) {
        this.f16184a = jVar;
        this.f16185b = jVar2;
        this.f16186c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f16184a == kVar.f16184a && this.f16185b == kVar.f16185b && Double.compare(this.f16186c, kVar.f16186c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f16186c) + ((this.f16185b.hashCode() + (this.f16184a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f16184a + ", crashlytics=" + this.f16185b + ", sessionSamplingRate=" + this.f16186c + ')';
    }
}
