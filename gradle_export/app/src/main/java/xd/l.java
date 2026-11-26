package xd;

import java.util.Arrays;

public final class l {

    public final ud.c f16550a;

    public final byte[] f16551b;

    public l(ud.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f16550a = cVar;
        this.f16551b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f16550a.equals(lVar.f16550a)) {
            return Arrays.equals(this.f16551b, lVar.f16551b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16551b) ^ ((this.f16550a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f16550a + ", bytes=[...]}";
    }
}
