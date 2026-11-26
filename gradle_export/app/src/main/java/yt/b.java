package yt;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class b {
    public final int a;
    public final long b;
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final long g;

    public b(int i, long j, boolean z, Integer num, Integer num2, String str, long j2) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = num;
        this.e = num2;
        this.f = str;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && m.a(this.d, bVar.d) && m.a(this.e, bVar.e) && m.a(this.f, bVar.f) && this.g == bVar.g;
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.f(Integer.hashCode(this.a) * 31, this.b, 31), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return Long.hashCode(this.g) + x5.e((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, this.f, 31);
    }

    public final String toString() {
        return "DownloadedSurah(reciterId=" + this.a + ", surahId=" + this.b + ", hasMigrated=" + this.c + ", surahNumber=" + this.d + ", collectionId=" + this.e + ", uri=" + this.f + ", surahSize=" + this.g + ")";
    }
}
