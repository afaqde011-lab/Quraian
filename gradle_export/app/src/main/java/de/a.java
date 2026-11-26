package de;

import java.util.HashMap;

public final class a {

    public final ge.a f4869a;

    public final HashMap f4870b;

    public a(ge.a aVar, HashMap map) {
        this.f4869a = aVar;
        this.f4870b = map;
    }

    public final long a(ud.d dVar, long j9, int i10) {
        long jH = j9 - this.f4869a.h();
        b bVar = (b) this.f4870b.get(dVar);
        long j10 = bVar.f4871a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11)))), jH), bVar.f4872b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4869a.equals(aVar.f4869a) && this.f4870b.equals(aVar.f4870b);
    }

    public final int hashCode() {
        return this.f4870b.hashCode() ^ ((this.f4869a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4869a + ", values=" + this.f4870b + "}";
    }
}
