package gs;

import kotlin.jvm.internal.m;

public final class e {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final long f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Long n;
    public final Integer o;

    public e(long j, String eventId, String sessionId, long j2, String eventType, long j3, int i, int i2, String occurredAt, String str, Integer num, Integer num2, Integer num3, Long l, Integer num4) {
        m.e(eventId, "eventId");
        m.e(sessionId, "sessionId");
        m.e(eventType, "eventType");
        m.e(occurredAt, "occurredAt");
        this.a = j;
        this.b = eventId;
        this.c = sessionId;
        this.d = j2;
        this.e = eventType;
        this.f = j3;
        this.g = i;
        this.h = i2;
        this.i = occurredAt;
        this.j = str;
        this.k = num;
        this.l = num2;
        this.m = num3;
        this.n = l;
        this.o = num4;
    }
}
