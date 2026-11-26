package lo;

import com.google.android.gms.internal.measurement.x5;

public final class j {
    public final int a;
    public final String b;
    public final e c;
    public final int d;
    public final long e;

    public j(int i, String str, e eVar, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = eVar;
        this.d = i2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && kotlin.jvm.internal.m.a(this.b, jVar.b) && kotlin.jvm.internal.m.a(this.c, jVar.c) && this.d == jVar.d && this.e == jVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + w.c.d(this.d, (this.c.hashCode() + x5.e(Integer.hashCode(this.a) * 31, this.b, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStoryDownloadsDvo(storyId=", this.a, ", title=", this.b, ", cover=");
        sbM.append(this.c);
        sbM.append(", episodeCount=");
        sbM.append(this.d);
        sbM.append(", sizeBytes=");
        return a1.b.k(this.e, ")", sbM);
    }
}
