package yt;

import java.util.UUID;
import kotlin.jvm.internal.m;

public final class a {
    public final UUID a;
    public final int b;
    public final long c;
    public final int d;
    public final Integer e;
    public final String f;
    public final Float g;

    public a(UUID workerId, int i, long j, int i2, Integer num, String str, Float f) {
        m.e(workerId, "workerId");
        this.a = workerId;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.e = num;
        this.f = str;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && m.a(this.e, aVar.e) && m.a(this.f, aVar.f) && m.a(this.g, aVar.g);
    }

    public final int hashCode() {
        int iD = w.c.d(this.d, w.c.f(w.c.d(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31);
        Integer num = this.e;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.g;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "DownloadProgress(workerId=" + this.a + ", reciterId=" + this.b + ", surahId=" + this.c + ", surahNumber=" + this.d + ", collectionId=" + this.e + ", url=" + this.f + ", progress=" + this.g + ")";
    }
}
