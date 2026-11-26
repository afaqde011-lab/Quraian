package cy;

public final class c implements d {
    public final int a;
    public final Integer b;
    public final String c;

    public c(int i, Integer num) {
        this.a = i;
        this.b = num;
        this.c = w.c.h(i, num != null ? num.intValue() : 0, "surah-", "-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && kotlin.jvm.internal.m.a(this.b, cVar.b);
    }

    @Override
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Surah(surahNumber=" + this.a + ", ayahNumber=" + this.b + ")";
    }
}
