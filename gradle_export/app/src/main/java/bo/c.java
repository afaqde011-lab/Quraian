package bo;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class c {
    public final int a;
    public final String b;
    public final long c;
    public final boolean d;
    public final long e;
    public final boolean f;

    public c(int i, String language, long j, boolean z, long j2, boolean z2) {
        m.e(language, "language");
        this.a = i;
        this.b = language;
        this.c = j;
        this.d = z;
        this.e = j2;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && m.a(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + w.c.f(w.c.e(w.c.f(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStoryProgressData(episodeId=", this.a, ", language=", this.b, ", positionMs=");
        sbM.append(this.c);
        sbM.append(", isCompleted=");
        sbM.append(this.d);
        sbM.append(", updatedAt=");
        sbM.append(this.e);
        sbM.append(", needsUpload=");
        return g4.c.l(sbM, this.f, ")");
    }
}
