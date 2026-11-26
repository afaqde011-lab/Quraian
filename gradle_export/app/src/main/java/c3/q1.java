package c3;

public final class q1 {

    public static final q1 f2752c = new q1(0, 0);

    public final long f2753a;

    public final long f2754b;

    public q1(long j9, long j10) {
        this.f2753a = j9;
        this.f2754b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            return y3.l.b(this.f2753a, q1Var.f2753a) && this.f2754b == q1Var.f2754b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2754b) + (Long.hashCode(this.f2753a) * 31);
    }
}
