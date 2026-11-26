package e1;

public final class t {

    public final x3.j f4997a;

    public final int f4998b;

    public final long f4999c;

    public t(x3.j jVar, int i10, long j9) {
        this.f4997a = jVar;
        this.f4998b = i10;
        this.f4999c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f4997a == tVar.f4997a && this.f4998b == tVar.f4998b && this.f4999c == tVar.f4999c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4999c) + w.c.d(this.f4998b, this.f4997a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f4997a + ", offset=" + this.f4998b + ", selectableId=" + this.f4999c + ')';
    }
}
