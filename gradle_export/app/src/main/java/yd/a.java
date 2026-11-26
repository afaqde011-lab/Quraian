package yd;

import e4.f;

public final class a {

    public final int f16852a;

    public final long f16853b;

    public a(int i10, long j9) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f16852a = i10;
        this.f16853b = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.a(this.f16852a, aVar.f16852a) && this.f16853b == aVar.f16853b;
    }

    public final int hashCode() {
        int iB = (f.b(this.f16852a) ^ 1000003) * 1000003;
        long j9 = this.f16853b;
        return ((int) ((j9 >>> 32) ^ j9)) ^ iB;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f16852a;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return a1.b.k(this.f16853b, "}", sb2);
    }
}
