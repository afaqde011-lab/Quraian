package androidx.media3.common;

public final class u1 {

    public final Object f1656a;

    public final long f1657b;

    public final c f1658c;

    public final boolean f1659d;

    public u1(t1 t1Var) {
        this.f1656a = t1Var.f1651a;
        this.f1657b = t1Var.f1652b;
        this.f1658c = t1Var.f1653c;
        this.f1659d = t1Var.f1654d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f1656a.equals(u1Var.f1656a) && this.f1657b == u1Var.f1657b && this.f1658c.equals(u1Var.f1658c) && this.f1659d == u1Var.f1659d;
    }

    public final int hashCode() {
        int iHashCode = (this.f1656a.hashCode() + 217) * 31;
        long j9 = this.f1657b;
        return ((this.f1658c.hashCode() + ((iHashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31) + (this.f1659d ? 1 : 0);
    }
}
