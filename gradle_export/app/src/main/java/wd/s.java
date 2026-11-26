package wd;

import java.util.Arrays;

public final class s extends e0 {

    public final long f16049a;

    public final Integer f16050b;

    public final a0 f16051c;

    public final long f16052d;

    public final byte[] f16053e;

    public final String f16054f;

    public final long f16055g;

    public final i0 f16056h;

    public final b0 f16057i;

    public s(long j9, Integer num, a0 a0Var, long j10, byte[] bArr, String str, long j11, i0 i0Var, b0 b0Var) {
        this.f16049a = j9;
        this.f16050b = num;
        this.f16051c = a0Var;
        this.f16052d = j10;
        this.f16053e = bArr;
        this.f16054f = str;
        this.f16055g = j11;
        this.f16056h = i0Var;
        this.f16057i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.f16057i;
            i0 i0Var2 = sVar.f16056h;
            String str2 = sVar.f16054f;
            a0 a0Var2 = sVar.f16051c;
            Integer num2 = sVar.f16050b;
            if (this.f16049a == sVar.f16049a && ((num = this.f16050b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f16051c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.f16052d == sVar.f16052d) {
                if (Arrays.equals(this.f16053e, e0Var instanceof s ? ((s) e0Var).f16053e : sVar.f16053e) && ((str = this.f16054f) != null ? str.equals(str2) : str2 == null) && this.f16055g == sVar.f16055g && ((i0Var = this.f16056h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f16057i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f16049a;
        int i10 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f16050b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f16051c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j10 = this.f16052d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f16053e)) * 1000003;
        String str = this.f16054f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f16055g;
        int i11 = (iHashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        i0 i0Var = this.f16056h;
        int iHashCode5 = (i11 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.f16057i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f16049a + ", eventCode=" + this.f16050b + ", complianceData=" + this.f16051c + ", eventUptimeMs=" + this.f16052d + ", sourceExtension=" + Arrays.toString(this.f16053e) + ", sourceExtensionJsonProto3=" + this.f16054f + ", timezoneOffsetSeconds=" + this.f16055g + ", networkConnectionInfo=" + this.f16056h + ", experimentIds=" + this.f16057i + "}";
    }
}
