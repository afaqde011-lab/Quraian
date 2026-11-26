package ho;

import com.google.android.gms.internal.measurement.x5;

public final class d {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final long i;

    public d(int i, String language, int i2, String label, int i3, long j, String str, String str2, long j2) {
        kotlin.jvm.internal.m.e(language, "language");
        kotlin.jvm.internal.m.e(label, "label");
        this.a = i;
        this.b = language;
        this.c = i2;
        this.d = label;
        this.e = i3;
        this.f = j;
        this.g = str;
        this.h = str2;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && kotlin.jvm.internal.m.a(this.b, dVar.b) && this.c == dVar.c && kotlin.jvm.internal.m.a(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && kotlin.jvm.internal.m.a(this.g, dVar.g) && kotlin.jvm.internal.m.a(this.h, dVar.h) && this.i == dVar.i;
    }

    public final int hashCode() {
        int iE = x5.e(w.c.f(w.c.d(this.e, x5.e(w.c.d(this.c, x5.e(Integer.hashCode(this.a) * 31, this.b, 31), 31), this.d, 31), 31), this.f, 31), this.g, 31);
        String str = this.h;
        return Long.hashCode(this.i) + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStoryDownload(episodeId=", this.a, ", language=", this.b, ", storyId=");
        sbM.append(this.c);
        sbM.append(", label=");
        sbM.append(this.d);
        sbM.append(", version=");
        sbM.append(this.e);
        sbM.append(", durationMs=");
        sbM.append(this.f);
        a1.b.z(sbM, ", audioUri=", this.g, ", transcriptUri=", this.h);
        sbM.append(", sizeBytes=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
