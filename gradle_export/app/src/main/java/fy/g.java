package fy;

public final class g implements k {
    public final int a;
    public final Integer b;

    public g(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && kotlin.jvm.internal.m.a(this.b, gVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OnRecentSurahClicked(surahNumber=" + this.a + ", ayahNumber=" + this.b + ")";
    }
}
