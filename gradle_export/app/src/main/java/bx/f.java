package bx;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class f {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public f(int i, long j, String str, String str2, String str3) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && m.a(this.c, fVar.c) && m.a(this.d, fVar.d) && m.a(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x5.e(x5.e(w.c.d(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Surah(surahId=");
        sb.append(this.a);
        sb.append(", surahNumber=");
        sb.append(this.b);
        a1.b.z(sb, ", transcription=", this.c, ", translation=", this.d);
        return w.c.l(sb, ", originalName=", this.e, ")");
    }
}
