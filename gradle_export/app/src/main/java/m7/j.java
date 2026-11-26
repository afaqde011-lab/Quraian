package m7;

import com.google.protobuf.RuntimeVersion;

public final class j {

    public final long f10615a;

    public final long f10616b;

    public final String f10617c;

    public int f10618d;

    public j(long j9, long j10, String str) {
        this.f10617c = str == null ? RuntimeVersion.SUFFIX : str;
        this.f10615a = j9;
        this.f10616b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j9;
        String strI = e7.d.i(str, this.f10617c);
        if (jVar != null) {
            long j10 = jVar.f10616b;
            if (strI.equals(e7.d.i(str, jVar.f10617c))) {
                long j11 = this.f10616b;
                if (j11 != -1) {
                    j9 = j10;
                    long j12 = this.f10615a;
                    jVar2 = null;
                    if (j12 + j11 == jVar.f10615a) {
                        return new j(j12, j9 != -1 ? j11 + j9 : -1L, strI);
                    }
                } else {
                    jVar2 = null;
                    j9 = j10;
                }
                if (j9 == -1) {
                    return jVar2;
                }
                long j13 = jVar.f10615a;
                if (j13 + j9 == this.f10615a) {
                    return new j(j13, j11 != -1 ? j9 + j11 : -1L, strI);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10615a == jVar.f10615a && this.f10616b == jVar.f10616b && this.f10617c.equals(jVar.f10617c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10618d == 0) {
            this.f10618d = this.f10617c.hashCode() + ((((527 + ((int) this.f10615a)) * 31) + ((int) this.f10616b)) * 31);
        }
        return this.f10618d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f10617c);
        sb2.append(", start=");
        sb2.append(this.f10615a);
        sb2.append(", length=");
        return a1.b.k(this.f10616b, ")", sb2);
    }
}
