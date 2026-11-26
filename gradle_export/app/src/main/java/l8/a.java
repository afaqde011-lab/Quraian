package l8;

import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.u0;
import androidx.media3.common.x0;
import java.util.Arrays;
import java.util.Objects;

public final class a implements u0 {

    public static final t f10113g;

    public static final t f10114h;

    public final String f10115a;

    public final String f10116b;

    public final long f10117c;

    public final long f10118d;

    public final byte[] f10119e;

    public int f10120f;

    static {
        s sVar = new s();
        sVar.m = x0.n("application/id3");
        f10113g = new t(sVar);
        s sVar2 = new s();
        sVar2.m = x0.n("application/x-scte35");
        f10114h = new t(sVar2);
    }

    public a(String str, String str2, long j9, long j10, byte[] bArr) {
        this.f10115a = str;
        this.f10116b = str2;
        this.f10117c = j9;
        this.f10118d = j10;
        this.f10119e = bArr;
    }

    @Override
    public final t a() {
        String str = this.f10115a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f10114h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f10113g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f10119e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10117c == aVar.f10117c && this.f10118d == aVar.f10118d && Objects.equals(this.f10115a, aVar.f10115a) && Objects.equals(this.f10116b, aVar.f10116b) && Arrays.equals(this.f10119e, aVar.f10119e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10120f == 0) {
            String str = this.f10115a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f10116b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j9 = this.f10117c;
            int i10 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f10118d;
            this.f10120f = Arrays.hashCode(this.f10119e) + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f10120f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f10115a + ", id=" + this.f10118d + ", durationMs=" + this.f10117c + ", value=" + this.f10116b;
    }
}
