package k9;

public final class w3 {

    public final androidx.media3.common.q0 f9539a;

    public final long f9540b;

    public final long f9541c;

    public w3(androidx.media3.common.q0 q0Var, long j9, long j10) {
        this.f9539a = q0Var;
        this.f9540b = j9;
        this.f9541c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return this.f9540b == w3Var.f9540b && this.f9539a.equals(w3Var.f9539a) && this.f9541c == w3Var.f9541c;
    }

    public final int hashCode() {
        long j9 = this.f9540b;
        int iHashCode = (this.f9539a.hashCode() + ((217 + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31;
        long j10 = this.f9541c;
        return iHashCode + ((int) ((j10 >>> 32) ^ j10));
    }
}
