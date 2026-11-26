package bo;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class b {
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final long h;
    public final Long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final int m;
    public final String n;
    public final String o;
    public final long p;
    public final int q;

    public b(long j, String eventId, String sessionId, int i, int i2, String language, String eventType, long j2, Long l, int i3, int i4, boolean z, int i5, String occurredAt, String str, long j3, int i6) {
        m.e(eventId, "eventId");
        m.e(sessionId, "sessionId");
        m.e(language, "language");
        m.e(eventType, "eventType");
        m.e(occurredAt, "occurredAt");
        this.a = j;
        this.b = eventId;
        this.c = sessionId;
        this.d = i;
        this.e = i2;
        this.f = language;
        this.g = eventType;
        this.h = j2;
        this.i = l;
        this.j = i3;
        this.k = i4;
        this.l = z;
        this.m = i5;
        this.n = occurredAt;
        this.o = str;
        this.p = j3;
        this.q = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.a(this.b, bVar.b) && m.a(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && m.a(this.f, bVar.f) && m.a(this.g, bVar.g) && this.h == bVar.h && m.a(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && this.m == bVar.m && m.a(this.n, bVar.n) && m.a(this.o, bVar.o) && this.p == bVar.p && this.q == bVar.q;
    }

    public final int hashCode() {
        int iF = w.c.f(x5.e(x5.e(w.c.d(this.e, w.c.d(this.d, x5.e(x5.e(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31), 31), this.f, 31), this.g, 31), this.h, 31);
        Long l = this.i;
        int iE = x5.e(w.c.d(this.m, w.c.e(w.c.d(this.k, w.c.d(this.j, (iF + (l == null ? 0 : l.hashCode())) * 31, 31), 31), 31, this.l), 31), this.n, 31);
        String str = this.o;
        return Integer.hashCode(this.q) + w.c.f((iE + (str != null ? str.hashCode() : 0)) * 31, this.p, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStoryEventData(id=");
        sb.append(this.a);
        sb.append(", eventId=");
        sb.append(this.b);
        sb.append(", sessionId=");
        sb.append(this.c);
        sb.append(", storyId=");
        sb.append(this.d);
        sb.append(", episodeId=");
        sb.append(this.e);
        sb.append(", language=");
        sb.append(this.f);
        sb.append(", eventType=");
        sb.append(this.g);
        sb.append(", positionMs=");
        sb.append(this.h);
        sb.append(", seekFromMs=");
        sb.append(this.i);
        w.c.v(sb, ", listenedMs=", this.j, ", playbackRateTimes100=", this.k);
        sb.append(", isOffline=");
        sb.append(this.l);
        sb.append(", utcOffsetMinutes=");
        sb.append(this.m);
        a1.b.z(sb, ", occurredAt=", this.n, ", source=", this.o);
        sb.append(", recordedElapsedMs=");
        sb.append(this.p);
        sb.append(", bootCount=");
        return g4.c.g(this.q, ")", sb);
    }
}
