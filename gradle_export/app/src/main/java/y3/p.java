package y3;

public final class p {

    public final long f16601a;

    public static final boolean a(long j9, long j10) {
        return j9 == j10;
    }

    public static String b(long j9) {
        if (a(j9, 0L)) {
            return "Unspecified";
        }
        if (a(j9, 4294967296L)) {
            return "Sp";
        }
        return a(j9, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f16601a == ((p) obj).f16601a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16601a);
    }

    public final String toString() {
        return b(this.f16601a);
    }
}
