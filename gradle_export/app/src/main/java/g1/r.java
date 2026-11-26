package g1;

public final class r {

    public final long f5944a;

    public final long f5945b;

    public final long f5946c;

    public final long f5947d;

    public r(long j9, long j10, long j11, long j12) {
        this.f5944a = j9;
        this.f5945b = j10;
        this.f5946c = j11;
        this.f5947d = j12;
    }

    public final r a(long j9, long j10, long j11, long j12) {
        return new r(j9 != 16 ? j9 : this.f5944a, j10 != 16 ? j10 : this.f5945b, j11 != 16 ? j11 : this.f5946c, j12 != 16 ? j12 : this.f5947d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return i2.t.c(this.f5944a, rVar.f5944a) && i2.t.c(this.f5945b, rVar.f5945b) && i2.t.c(this.f5946c, rVar.f5946c) && i2.t.c(this.f5947d, rVar.f5947d);
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.f5947d) + w.c.f(w.c.f(Long.hashCode(this.f5944a) * 31, this.f5945b, 31), this.f5946c, 31);
    }
}
