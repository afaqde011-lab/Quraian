package xx;

import cy.d;
import kotlin.jvm.internal.m;

public final class a {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public a(String str, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        num3 = (i & 8) != 0 ? null : num3;
        num4 = (i & 16) != 0 ? null : num4;
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
    }

    public final d a() {
        Integer num;
        Integer num2;
        Integer num3;
        String str = this.a;
        int iHashCode = str.hashCode();
        if (iHashCode == 109803127) {
            if (str.equals("surah") && (num = this.d) != null) {
                return new cy.c(num.intValue(), this.e);
            }
            return null;
        }
        if (iHashCode == 1082420136) {
            if (str.equals("reciter") && (num2 = this.b) != null) {
                return new cy.b(num2.intValue());
            }
            return null;
        }
        if (iHashCode == 1879474642 && str.equals("playlist") && (num3 = this.c) != null) {
            return new cy.a(num3.intValue());
        }
        return null;
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && m.a(this.b, aVar.b) && m.a(this.c, aVar.c) && m.a(this.d, aVar.d) && m.a(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "StoredHistoryItem(type=" + this.a + ", reciterId=" + this.b + ", playlistId=" + this.c + ", surahNumber=" + this.d + ", ayahNumber=" + this.e + ")";
    }
}
