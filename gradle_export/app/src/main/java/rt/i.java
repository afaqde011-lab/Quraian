package rt;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class i {
    public final ot.d a;
    public final boolean b;
    public final String c;
    public final Integer d;
    public final boolean e;

    public i(ot.d verseScript, boolean z, String appliedId, Integer num, boolean z2) {
        m.e(verseScript, "verseScript");
        m.e(appliedId, "appliedId");
        this.a = verseScript;
        this.b = z;
        this.c = appliedId;
        this.d = num;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && m.a(this.c, iVar.c) && m.a(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        int iE = x5.e(w.c.e(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranscriptionReloadKey(verseScript=");
        sb.append(this.a);
        sb.append(", isQuranVisible=");
        sb.append(this.b);
        sb.append(", appliedId=");
        sb.append(this.c);
        sb.append(", surahNumber=");
        sb.append(this.d);
        sb.append(", isLyricsAvailable=");
        return g4.c.l(sb, this.e, ")");
    }
}
