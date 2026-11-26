package ee;

import com.google.android.gms.cast.MediaError;

public final class a {

    public static final a f5357f = new a(10485760, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, 10000, 604800000, 81920);

    public final long f5358a;

    public final int f5359b;

    public final int f5360c;

    public final long f5361d;

    public final int f5362e;

    public a(long j9, int i10, int i11, long j10, int i12) {
        this.f5358a = j9;
        this.f5359b = i10;
        this.f5360c = i11;
        this.f5361d = j10;
        this.f5362e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5358a == aVar.f5358a && this.f5359b == aVar.f5359b && this.f5360c == aVar.f5360c && this.f5361d == aVar.f5361d && this.f5362e == aVar.f5362e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f5358a;
        int i10 = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f5359b) * 1000003) ^ this.f5360c) * 1000003;
        long j10 = this.f5361d;
        return this.f5362e ^ ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f5358a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f5359b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f5360c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f5361d);
        sb2.append(", maxBlobByteSizePerRow=");
        return g4.c.g(this.f5362e, "}", sb2);
    }
}
