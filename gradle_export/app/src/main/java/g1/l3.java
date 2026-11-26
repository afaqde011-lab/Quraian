package g1;

public final class l3 {

    public final long f5855a;

    public final long f5856b;

    public final long f5857c;

    public final long f5858d;

    public l3(long j9, long j10, long j11, long j12) {
        this.f5855a = j9;
        this.f5856b = j10;
        this.f5857c = j11;
        this.f5858d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return i2.t.c(this.f5855a, l3Var.f5855a) && i2.t.c(this.f5856b, l3Var.f5856b) && i2.t.c(this.f5857c, l3Var.f5857c) && i2.t.c(this.f5858d, l3Var.f5858d);
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.f5858d) + w.c.f(w.c.f(Long.hashCode(this.f5855a) * 31, this.f5856b, 31), this.f5857c, 31);
    }
}
