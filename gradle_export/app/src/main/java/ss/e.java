package ss;

import com.google.android.gms.internal.measurement.x5;

public final class e {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Long l;
    public final Integer m;

    public e(String eventId, String sessionId, long j, long j2, int i, int i2, String occurredAt, String str, Integer num, Integer num2, Integer num3, Long l, Integer num4) {
        kotlin.jvm.internal.m.e(eventId, "eventId");
        kotlin.jvm.internal.m.e(sessionId, "sessionId");
        kotlin.jvm.internal.m.e(occurredAt, "occurredAt");
        this.a = eventId;
        this.b = sessionId;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
        this.g = occurredAt;
        this.h = str;
        this.i = num;
        this.j = num2;
        this.k = num3;
        this.l = l;
        this.m = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.a, eVar.a) && kotlin.jvm.internal.m.a(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && kotlin.jvm.internal.m.a(this.g, eVar.g) && kotlin.jvm.internal.m.a(this.h, eVar.h) && kotlin.jvm.internal.m.a(this.i, eVar.i) && kotlin.jvm.internal.m.a(this.j, eVar.j) && kotlin.jvm.internal.m.a(this.k, eVar.k) && kotlin.jvm.internal.m.a(this.l, eVar.l) && kotlin.jvm.internal.m.a(this.m, eVar.m);
    }

    public final int hashCode() {
        int iE = x5.e(w.c.d(this.f, w.c.d(this.e, w.c.f(w.c.f(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31), this.g, 31);
        String str = this.h;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.l;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.m;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("ListeningEventFields(eventId=", this.a, ", sessionId=", this.b, ", trackId=");
        sbS.append(this.c);
        sbS.append(", positionMs=");
        sbS.append(this.d);
        sbS.append(", listenedMs=");
        w.c.u(sbS, this.e, ", utcOffsetMinutes=", this.f, ", occurredAt=");
        a1.b.z(sbS, this.g, ", backgroundSoundId=", this.h, ", backgroundVolumeTimes1000=");
        sbS.append(this.i);
        sbS.append(", reciterId=");
        sbS.append(this.j);
        sbS.append(", surahNumber=");
        sbS.append(this.k);
        sbS.append(", recordedElapsedMs=");
        sbS.append(this.l);
        sbS.append(", bootCount=");
        sbS.append(this.m);
        sbS.append(")");
        return sbS.toString();
    }
}
