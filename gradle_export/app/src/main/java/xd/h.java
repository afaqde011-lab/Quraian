package xd;

import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class h {

    public final String f16537a;

    public final Integer f16538b;

    public final l f16539c;

    public final long f16540d;

    public final long f16541e;

    public final Map f16542f;

    public final Integer f16543g;

    public final String f16544h;

    public final byte[] f16545i;

    public final byte[] f16546j;

    public h(String str, Integer num, l lVar, long j9, long j10, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f16537a = str;
        this.f16538b = num;
        this.f16539c = lVar;
        this.f16540d = j9;
        this.f16541e = j10;
        this.f16542f = map;
        this.f16543g = num2;
        this.f16544h = str2;
        this.f16545i = bArr;
        this.f16546j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f16542f.get(str);
        return str2 == null ? RuntimeVersion.SUFFIX : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f16542f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a1.n c() {
        a1.n nVar = new a1.n();
        String str = this.f16537a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        nVar.B = str;
        nVar.C = this.f16538b;
        nVar.H = this.f16543g;
        nVar.I = this.f16544h;
        nVar.J = this.f16545i;
        nVar.K = this.f16546j;
        l lVar = this.f16539c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        nVar.D = lVar;
        nVar.E = Long.valueOf(this.f16540d);
        nVar.F = Long.valueOf(this.f16541e);
        nVar.G = new HashMap(this.f16542f);
        return nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str2 = hVar.f16544h;
            Integer num3 = hVar.f16543g;
            Integer num4 = hVar.f16538b;
            if (this.f16537a.equals(hVar.f16537a) && ((num = this.f16538b) != null ? num.equals(num4) : num4 == null) && this.f16539c.equals(hVar.f16539c) && this.f16540d == hVar.f16540d && this.f16541e == hVar.f16541e && this.f16542f.equals(hVar.f16542f) && ((num2 = this.f16543g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f16544h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f16545i, hVar.f16545i) && Arrays.equals(this.f16546j, hVar.f16546j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f16537a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f16538b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16539c.hashCode()) * 1000003;
        long j9 = this.f16540d;
        int i10 = (iHashCode2 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f16541e;
        int iHashCode3 = (((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f16542f.hashCode()) * 1000003;
        Integer num2 = this.f16543g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f16544h;
        return Arrays.hashCode(this.f16546j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f16545i)) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f16537a + ", code=" + this.f16538b + ", encodedPayload=" + this.f16539c + ", eventMillis=" + this.f16540d + ", uptimeMillis=" + this.f16541e + ", autoMetadata=" + this.f16542f + ", productId=" + this.f16543g + ", pseudonymousId=" + this.f16544h + ", experimentIdsClear=" + Arrays.toString(this.f16545i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f16546j) + "}";
    }
}
