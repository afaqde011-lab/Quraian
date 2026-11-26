package g1;

public final class w3 {

    public final long f6010a;

    public final long f6011b;

    public final long f6012c;

    public final long f6013d;

    public final long f6014e;

    public final long f6015f;

    public w3(long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f6010a = j9;
        this.f6011b = j10;
        this.f6012c = j11;
        this.f6013d = j12;
        this.f6014e = j13;
        this.f6015f = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return i2.t.c(this.f6010a, w3Var.f6010a) && i2.t.c(this.f6011b, w3Var.f6011b) && i2.t.c(this.f6012c, w3Var.f6012c) && i2.t.c(this.f6013d, w3Var.f6013d) && i2.t.c(this.f6014e, w3Var.f6014e) && i2.t.c(this.f6015f, w3Var.f6015f);
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.f6015f) + w.c.f(w.c.f(w.c.f(w.c.f(Long.hashCode(this.f6010a) * 31, this.f6011b, 31), this.f6012c, 31), this.f6013d, 31), this.f6014e, 31);
    }
}
