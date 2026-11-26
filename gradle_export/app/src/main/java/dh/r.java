package dh;

public final class r {

    public final int f4891a;

    public final long f4892b;

    public r(int i10, long j9) {
        this.f4891a = i10;
        this.f4892b = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f4891a == rVar.f4891a && this.f4892b == rVar.f4892b;
    }

    public final int hashCode() {
        long j9 = this.f4892b;
        return ((this.f4891a ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f4891a);
        sb2.append(", eventTimestamp=");
        return a1.b.k(this.f4892b, "}", sb2);
    }
}
