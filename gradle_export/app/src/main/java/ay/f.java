package ay;

import kotlin.jvm.internal.m;

public final class f {
    public final int a;
    public final Integer b;

    public f(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && m.a(this.b, fVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SurahAyahReference(surahNumber=" + this.a + ", ayahNumber=" + this.b + ")";
    }
}
