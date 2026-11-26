package cy;

import com.google.android.gms.internal.measurement.x5;

public final class l extends n {
    public final m b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public l(m mVar, String str, String str2, String str3, String surahNumberText, String ayahCountText) {
        kotlin.jvm.internal.m.e(surahNumberText, "surahNumberText");
        kotlin.jvm.internal.m.e(ayahCountText, "ayahCountText");
        this.b = mVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = surahNumberText;
        this.g = ayahCountText;
        this.h = g4.c.f(mVar.a, "surah-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.b, lVar.b) && kotlin.jvm.internal.m.a(this.c, lVar.c) && kotlin.jvm.internal.m.a(this.d, lVar.d) && kotlin.jvm.internal.m.a(this.e, lVar.e) && kotlin.jvm.internal.m.a(this.f, lVar.f) && kotlin.jvm.internal.m.a(this.g, lVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + x5.e(x5.e(x5.e(x5.e(this.b.hashCode() * 31, this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurahItem(surah=");
        sb.append(this.b);
        sb.append(", normalizedTranscription=");
        sb.append(this.c);
        sb.append(", normalizedTranslation=");
        a1.b.z(sb, this.d, ", normalizedOriginalName=", this.e, ", surahNumberText=");
        return oi.k.m(sb, this.f, ", ayahCountText=", this.g, ")");
    }
}
