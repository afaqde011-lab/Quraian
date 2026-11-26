package mr;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class h {
    public final int a;
    public final String b;
    public final String c;

    public h(String translation, int i, String originalName) {
        m.e(translation, "translation");
        m.e(originalName, "originalName");
        this.a = i;
        this.b = translation;
        this.c = originalName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && m.a(this.b, hVar.b) && m.a(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return x5.n(g4.c.m("SurahTranslation(surahNumber=", this.a, ", translation=", this.b, ", originalName="), this.c, ")");
    }
}
