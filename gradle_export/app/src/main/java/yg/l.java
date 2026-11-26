package yg;

public final class l {

    public final long f16886a;

    public l(long j9) {
        this.f16886a = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof l) && this.f16886a == ((l) obj).f16886a;
    }

    public final int hashCode() {
        long j9 = this.f16886a;
        return (((int) ((j9 >>> 32) ^ j9)) ^ 1000003) * (-721379959);
    }

    public final String toString() {
        return a1.b.k(this.f16886a, ", webViewRequestMode=0, sessionId=null}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
