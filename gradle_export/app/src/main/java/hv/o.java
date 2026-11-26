package hv;

import com.google.android.gms.internal.measurement.x5;

public final class o {
    public final String a;
    public final boolean b;
    public final String c;

    public o(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.a, oVar.a) && this.b == oVar.b && kotlin.jvm.internal.m.a(this.c, oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w.c.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LyricAyahTexts(ayahText=");
        sb.append(this.a);
        sb.append(", isTranscription=");
        sb.append(this.b);
        sb.append(", tafsirText=");
        return x5.n(sb, this.c, ")");
    }
}
