package g1;

public final class z {

    public final long f6032a;

    public final long f6033b;

    public final long f6034c;

    public final long f6035d;

    public z(long j9, long j10, long j11, long j12) {
        this.f6032a = j9;
        this.f6033b = j10;
        this.f6034c = j11;
        this.f6035d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return i2.t.c(this.f6032a, zVar.f6032a) && i2.t.c(this.f6033b, zVar.f6033b) && i2.t.c(this.f6034c, zVar.f6034c) && i2.t.c(this.f6035d, zVar.f6035d);
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.f6035d) + w.c.f(w.c.f(Long.hashCode(this.f6032a) * 31, this.f6033b, 31), this.f6034c, 31);
    }
}
