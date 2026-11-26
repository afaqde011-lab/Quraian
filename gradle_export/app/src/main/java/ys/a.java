package ys;

public final class a {
    public final u30.b a;
    public final Integer b;

    public a(u30.b hourLevels, Integer num) {
        kotlin.jvm.internal.m.e(hourLevels, "hourLevels");
        this.a = hourLevels;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.a, aVar.a) && kotlin.jvm.internal.m.a(this.b, aVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "InsightsBestListeningTimeDvo(hourLevels=" + this.a + ", peakHour=" + this.b + ")";
    }
}
