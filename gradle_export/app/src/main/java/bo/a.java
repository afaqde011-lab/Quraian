package bo;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class a {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;

    public a(int i, String language, int i2, String label, int i3, long j, String audioPath, String str, long j2, long j3) {
        m.e(language, "language");
        m.e(label, "label");
        m.e(audioPath, "audioPath");
        this.a = i;
        this.b = language;
        this.c = i2;
        this.d = label;
        this.e = i3;
        this.f = j;
        this.g = audioPath;
        this.h = str;
        this.i = j2;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && m.a(this.b, aVar.b) && this.c == aVar.c && m.a(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && m.a(this.g, aVar.g) && m.a(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j;
    }

    public final int hashCode() {
        int iE = x5.e(w.c.f(w.c.d(this.e, x5.e(w.c.d(this.c, x5.e(Integer.hashCode(this.a) * 31, this.b, 31), 31), this.d, 31), 31), this.f, 31), this.g, 31);
        String str = this.h;
        return Long.hashCode(this.j) + w.c.f((iE + (str == null ? 0 : str.hashCode())) * 31, this.i, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStoryDownloadData(episodeId=", this.a, ", language=", this.b, ", storyId=");
        sbM.append(this.c);
        sbM.append(", label=");
        sbM.append(this.d);
        sbM.append(", version=");
        sbM.append(this.e);
        sbM.append(", durationMs=");
        sbM.append(this.f);
        a1.b.z(sbM, ", audioPath=", this.g, ", transcriptPath=", this.h);
        sbM.append(", sizeBytes=");
        sbM.append(this.i);
        sbM.append(", downloadedAt=");
        return a1.b.k(this.j, ")", sbM);
    }
}
