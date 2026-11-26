package no;

import com.google.android.gms.internal.measurement.x5;

public final class h {
    public final int a;
    public final int b;
    public final String c;

    public h(int i, String str, int i2) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && kotlin.jvm.internal.m.a(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w.c.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return x5.n(oi.k.p(this.a, this.b, "AudioStoryTrack(storyId=", ", episodeId=", ", language="), this.c, ")");
    }
}
