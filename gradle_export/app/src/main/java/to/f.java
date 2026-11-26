package to;

import com.google.android.gms.internal.measurement.x5;

public final class f {
    public final lo.e a;
    public final int b;
    public final String c;
    public final boolean d;
    public final float e;
    public final ru.d f;
    public final boolean g;

    public f(lo.e eVar, int i, String str, boolean z, float f, ru.d sleepTimer, boolean z2) {
        kotlin.jvm.internal.m.e(sleepTimer, "sleepTimer");
        this.a = eVar;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = f;
        this.f = sleepTimer;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.a, fVar.a) && this.b == fVar.b && kotlin.jvm.internal.m.a(this.c, fVar.c) && this.d == fVar.d && Float.compare(this.e, fVar.e) == 0 && this.f == fVar.f && this.g == fVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + w.c.c(this.e, w.c.e(x5.e(w.c.d(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStoryMiniPlayerState(cover=");
        sb.append(this.a);
        sb.append(", episodeOrder=");
        sb.append(this.b);
        sb.append(", storyTitle=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        sb.append(this.d);
        sb.append(", speed=");
        sb.append(this.e);
        sb.append(", sleepTimer=");
        sb.append(this.f);
        sb.append(", hasText=");
        return g4.c.l(sb, this.g, ")");
    }
}
