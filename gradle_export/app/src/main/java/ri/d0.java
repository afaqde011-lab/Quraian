package ri;

import java.util.List;

public final class d0 extends p1 {

    public final int f13308a;

    public final String f13309b;

    public final int f13310c;

    public final int f13311d;

    public final long f13312e;

    public final long f13313f;

    public final long f13314g;

    public final String f13315h;

    public final List f13316i;

    public d0(int i10, String str, int i11, int i12, long j9, long j10, long j11, String str2, List list) {
        this.f13308a = i10;
        this.f13309b = str;
        this.f13310c = i11;
        this.f13311d = i12;
        this.f13312e = j9;
        this.f13313f = j10;
        this.f13314g = j11;
        this.f13315h = str2;
        this.f13316i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            d0 d0Var = (d0) ((p1) obj);
            List list2 = d0Var.f13316i;
            String str2 = d0Var.f13315h;
            if (this.f13308a == d0Var.f13308a && this.f13309b.equals(d0Var.f13309b) && this.f13310c == d0Var.f13310c && this.f13311d == d0Var.f13311d && this.f13312e == d0Var.f13312e && this.f13313f == d0Var.f13313f && this.f13314g == d0Var.f13314g && ((str = this.f13315h) != null ? str.equals(str2) : str2 == null) && ((list = this.f13316i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13308a ^ 1000003) * 1000003) ^ this.f13309b.hashCode()) * 1000003) ^ this.f13310c) * 1000003) ^ this.f13311d) * 1000003;
        long j9 = this.f13312e;
        int i10 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f13313f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f13314g;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f13315h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f13316i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f13308a + ", processName=" + this.f13309b + ", reasonCode=" + this.f13310c + ", importance=" + this.f13311d + ", pss=" + this.f13312e + ", rss=" + this.f13313f + ", timestamp=" + this.f13314g + ", traceFile=" + this.f13315h + ", buildIdMappingForArch=" + this.f13316i + "}";
    }
}
