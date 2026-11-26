package f7;

import androidx.media3.common.u0;

public final class g implements u0 {

    public final long f5496a;

    public final long f5497b;

    public final long f5498c;

    public g(long j9, long j10, long j11) {
        this.f5496a = j9;
        this.f5497b = j10;
        this.f5498c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5496a == gVar.f5496a && this.f5497b == gVar.f5497b && this.f5498c == gVar.f5498c;
    }

    public final int hashCode() {
        return c7.i.G(this.f5498c) + ((c7.i.G(this.f5497b) + ((c7.i.G(this.f5496a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f5496a + ", modification time=" + this.f5497b + ", timescale=" + this.f5498c;
    }
}
