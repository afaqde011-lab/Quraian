package ho;

import com.google.android.gms.internal.measurement.x5;

public final class k {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final l f;
    public final long g;
    public final Long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final String m;
    public final o n;
    public final long o;
    public final int p;

    public k(String str, String sessionId, int i, int i2, String str2, l lVar, long j, Long l, int i3, int i4, boolean z, int i5, String str3, o oVar, long j2, int i6) {
        kotlin.jvm.internal.m.e(sessionId, "sessionId");
        this.a = str;
        this.b = sessionId;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = lVar;
        this.g = j;
        this.h = l;
        this.i = i3;
        this.j = i4;
        this.k = z;
        this.l = i5;
        this.m = str3;
        this.n = oVar;
        this.o = j2;
        this.p = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.a, kVar.a) && kotlin.jvm.internal.m.a(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && kotlin.jvm.internal.m.a(this.e, kVar.e) && this.f == kVar.f && this.g == kVar.g && kotlin.jvm.internal.m.a(this.h, kVar.h) && this.i == kVar.i && this.j == kVar.j && this.k == kVar.k && this.l == kVar.l && kotlin.jvm.internal.m.a(this.m, kVar.m) && this.n == kVar.n && this.o == kVar.o && this.p == kVar.p;
    }

    public final int hashCode() {
        int iF = w.c.f((this.f.hashCode() + x5.e(w.c.d(this.d, w.c.d(this.c, x5.e(this.a.hashCode() * 31, this.b, 31), 31), 31), this.e, 31)) * 31, this.g, 31);
        Long l = this.h;
        int iE = x5.e(w.c.d(this.l, w.c.e(w.c.d(this.j, w.c.d(this.i, (iF + (l == null ? 0 : l.hashCode())) * 31, 31), 31), 31, this.k), 31), this.m, 31);
        o oVar = this.n;
        return Integer.hashCode(this.p) + w.c.f((iE + (oVar != null ? oVar.hashCode() : 0)) * 31, this.o, 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("AudioStoryEvent(eventId=", this.a, ", sessionId=", this.b, ", storyId=");
        w.c.u(sbS, this.c, ", episodeId=", this.d, ", language=");
        sbS.append(this.e);
        sbS.append(", type=");
        sbS.append(this.f);
        sbS.append(", positionMs=");
        sbS.append(this.g);
        sbS.append(", seekFromMs=");
        sbS.append(this.h);
        w.c.v(sbS, ", listenedMs=", this.i, ", playbackRateTimes100=", this.j);
        sbS.append(", isOffline=");
        sbS.append(this.k);
        sbS.append(", utcOffsetMinutes=");
        sbS.append(this.l);
        sbS.append(", occurredAt=");
        sbS.append(this.m);
        sbS.append(", source=");
        sbS.append(this.n);
        sbS.append(", recordedElapsedMs=");
        sbS.append(this.o);
        sbS.append(", bootCount=");
        return g4.c.g(this.p, ")", sbS);
    }
}
