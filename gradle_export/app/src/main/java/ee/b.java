package ee;

public final class b {

    public final long f5363a;

    public final xd.i f5364b;

    public final xd.h f5365c;

    public b(long j9, xd.i iVar, xd.h hVar) {
        this.f5363a = j9;
        this.f5364b = iVar;
        this.f5365c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5363a == bVar.f5363a && this.f5364b.equals(bVar.f5364b) && this.f5365c.equals(bVar.f5365c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f5363a;
        return this.f5365c.hashCode() ^ ((((((int) ((j9 >>> 32) ^ j9)) ^ 1000003) * 1000003) ^ this.f5364b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f5363a + ", transportContext=" + this.f5364b + ", event=" + this.f5365c + "}";
    }
}
