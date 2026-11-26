package jj;

public final class a {

    public final String f8290a;

    public final long f8291b;

    public final long f8292c;

    public a(long j9, long j10, String str) {
        this.f8290a = str;
        this.f8291b = j9;
        this.f8292c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f8290a.equals(aVar.f8290a) && this.f8291b == aVar.f8291b && this.f8292c == aVar.f8292c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8290a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f8291b;
        long j10 = this.f8292c;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f8290a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f8291b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.b.k(this.f8292c, "}", sb2);
    }
}
