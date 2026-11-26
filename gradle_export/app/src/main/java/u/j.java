package u;

public final class j {

    public final long f14863a;

    public j(long j9) {
        this.f14863a = j9;
    }

    public static long a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f14863a == ((j) obj).f14863a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14863a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j9 = this.f14863a;
        sb2.append((int) (j9 >> 32));
        sb2.append(", ");
        return oi.k.l(sb2, (int) (j9 & 4294967295L), ')');
    }
}
