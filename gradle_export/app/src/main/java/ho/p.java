package ho;

public final class p {
    public final a a;
    public final g b;
    public final boolean c;
    public final long d;
    public final long e;
    public final float f;
    public final ru.d g;
    public final boolean h;

    public p(a aVar, g gVar, boolean z, long j, long j2, float f, ru.d sleepTimer, boolean z2) {
        kotlin.jvm.internal.m.e(sleepTimer, "sleepTimer");
        this.a = aVar;
        this.b = gVar;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = sleepTimer;
        this.h = z2;
    }

    public static p a(p pVar, a aVar, g gVar, boolean z, long j, long j2, float f, ru.d dVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            aVar = pVar.a;
        }
        a aVar2 = aVar;
        if ((i & 2) != 0) {
            gVar = pVar.b;
        }
        g gVar2 = gVar;
        if ((i & 4) != 0) {
            z = pVar.c;
        }
        boolean z3 = z;
        long j3 = (i & 8) != 0 ? pVar.d : j;
        long j4 = (i & 16) != 0 ? pVar.e : j2;
        float f2 = (i & 32) != 0 ? pVar.f : f;
        ru.d sleepTimer = (i & 64) != 0 ? pVar.g : dVar;
        boolean z4 = (i & 128) != 0 ? pVar.h : z2;
        pVar.getClass();
        kotlin.jvm.internal.m.e(sleepTimer, "sleepTimer");
        return new p(aVar2, gVar2, z3, j3, j4, f2, sleepTimer, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.a, pVar.a) && kotlin.jvm.internal.m.a(this.b, pVar.b) && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && Float.compare(this.f, pVar.f) == 0 && this.g == pVar.g && this.h == pVar.h;
    }

    public final int hashCode() {
        a aVar = this.a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        g gVar = this.b;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + w.c.c(this.f, w.c.f(w.c.f(w.c.e((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.c), this.d, 31), this.e, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStoryPlaybackState(story=");
        sb.append(this.a);
        sb.append(", episode=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        sb.append(this.c);
        sb.append(", positionMs=");
        sb.append(this.d);
        sb.append(", durationMs=");
        sb.append(this.e);
        sb.append(", speed=");
        sb.append(this.f);
        sb.append(", sleepTimer=");
        sb.append(this.g);
        sb.append(", isRecordingBlocked=");
        return g4.c.l(sb, this.h, ")");
    }
}
