package zj;

import p40.o0;

public final class g {
    public static final f Companion = new f();

    public final Boolean f17515a;

    public final Double f17516b;

    public final Integer f17517c;

    public final Integer f17518d;

    public final Long f17519e;

    public g(int i10, Boolean bool, Double d3, Integer num, Integer num2, Long l) {
        if (31 != (i10 & 31)) {
            o0.g(i10, 31, e.f17514a.getDescriptor());
            throw null;
        }
        this.f17515a = bool;
        this.f17516b = d3;
        this.f17517c = num;
        this.f17518d = num2;
        this.f17519e = l;
    }

    public g(Boolean bool, Double d3, Integer num, Integer num2, Long l) {
        this.f17515a = bool;
        this.f17516b = d3;
        this.f17517c = num;
        this.f17518d = num2;
        this.f17519e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f17515a, gVar.f17515a) && kotlin.jvm.internal.m.a(this.f17516b, gVar.f17516b) && kotlin.jvm.internal.m.a(this.f17517c, gVar.f17517c) && kotlin.jvm.internal.m.a(this.f17518d, gVar.f17518d) && kotlin.jvm.internal.m.a(this.f17519e, gVar.f17519e);
    }

    public final int hashCode() {
        Boolean bool = this.f17515a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d3 = this.f17516b;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f17517c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17518d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f17519e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f17515a + ", sessionSamplingRate=" + this.f17516b + ", sessionTimeoutSeconds=" + this.f17517c + ", cacheDurationSeconds=" + this.f17518d + ", cacheUpdatedTimeSeconds=" + this.f17519e + ')';
    }
}
