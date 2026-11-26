package cy;

import com.google.android.gms.internal.measurement.x5;

public final class e {
    public final String a;
    public final f b;
    public final int c;
    public final bx.c d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final dw.a j;
    public final String k;

    public e(String id, f fVar, int i, bx.c cVar, Integer num, String str, String str2, String str3, Integer num2, dw.a aVar, String str4, int i2) {
        cVar = (i2 & 8) != 0 ? null : cVar;
        num = (i2 & 16) != 0 ? null : num;
        str = (i2 & 32) != 0 ? null : str;
        str2 = (i2 & 64) != 0 ? null : str2;
        str3 = (i2 & 128) != 0 ? null : str3;
        num2 = (i2 & 256) != 0 ? null : num2;
        aVar = (i2 & 512) != 0 ? null : aVar;
        str4 = (i2 & 1024) != 0 ? null : str4;
        kotlin.jvm.internal.m.e(id, "id");
        this.a = id;
        this.b = fVar;
        this.c = i;
        this.d = cVar;
        this.e = num;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = num2;
        this.j = aVar;
        this.k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && kotlin.jvm.internal.m.a(this.d, eVar.d) && kotlin.jvm.internal.m.a(this.e, eVar.e) && kotlin.jvm.internal.m.a(this.f, eVar.f) && kotlin.jvm.internal.m.a(this.g, eVar.g) && kotlin.jvm.internal.m.a(this.h, eVar.h) && kotlin.jvm.internal.m.a(this.i, eVar.i) && kotlin.jvm.internal.m.a(this.j, eVar.j) && kotlin.jvm.internal.m.a(this.k, eVar.k);
    }

    public final int hashCode() {
        int iD = w.c.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        bx.c cVar = this.d;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        dw.a aVar = this.j;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.k;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalSearchResult(id=");
        sb.append(this.a);
        sb.append(", kind=");
        sb.append(this.b);
        sb.append(", relevance=");
        sb.append(this.c);
        sb.append(", reciter=");
        sb.append(this.d);
        sb.append(", surahNumber=");
        sb.append(this.e);
        sb.append(", surahTranscription=");
        sb.append(this.f);
        sb.append(", surahTranslation=");
        a1.b.z(sb, this.g, ", surahOriginalName=", this.h, ", ayahNumber=");
        sb.append(this.i);
        sb.append(", playlist=");
        sb.append(this.j);
        sb.append(", subtitle=");
        return x5.n(sb, this.k, ")");
    }
}
