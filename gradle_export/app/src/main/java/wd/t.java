package wd;

import java.util.ArrayList;

public final class t extends f0 {

    public final long f16058a;

    public final long f16059b;

    public final n f16060c;

    public final Integer f16061d;

    public final String f16062e;

    public final ArrayList f16063f;

    public t(long j9, long j10, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.A;
        this.f16058a = j9;
        this.f16059b = j10;
        this.f16060c = nVar;
        this.f16061d = num;
        this.f16062e = str;
        this.f16063f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        Object obj2 = j0.A;
        ArrayList arrayList = tVar.f16063f;
        String str = tVar.f16062e;
        Integer num = tVar.f16061d;
        n nVar = tVar.f16060c;
        if (this.f16058a != tVar.f16058a || this.f16059b != tVar.f16059b || !this.f16060c.equals(nVar)) {
            return false;
        }
        Integer num2 = this.f16061d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f16062e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f16063f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j9 = this.f16058a;
        long j10 = this.f16059b;
        int iHashCode = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f16060c.hashCode()) * 1000003;
        Integer num = this.f16061d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f16062e;
        return ((this.f16063f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ j0.A.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f16058a + ", requestUptimeMs=" + this.f16059b + ", clientInfo=" + this.f16060c + ", logSource=" + this.f16061d + ", logSourceName=" + this.f16062e + ", logEvents=" + this.f16063f + ", qosTier=" + j0.A + "}";
    }
}
