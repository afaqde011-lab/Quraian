package cy;

import com.google.android.gms.internal.measurement.x5;

public final class m {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public m(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && kotlin.jvm.internal.m.a(this.b, mVar.b) && kotlin.jvm.internal.m.a(this.c, mVar.c) && kotlin.jvm.internal.m.a(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + x5.e(x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("SearchableSurah(surahNumber=", this.a, ", transcription=", this.b, ", translation=");
        a1.b.z(sbM, this.c, ", originalName=", this.d, ", ayahCount=");
        return g4.c.g(this.e, ")", sbM);
    }
}
