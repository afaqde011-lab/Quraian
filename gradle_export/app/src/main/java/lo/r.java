package lo;

import com.google.android.gms.internal.measurement.x5;

public final class r {
    public final String a;
    public final String b;
    public final boolean c;

    public r(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.a, rVar.a) && kotlin.jvm.internal.m.a(this.b, rVar.b) && this.c == rVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x5.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return g4.c.l(a1.b.s("AudioStoryLanguageDvo(code=", this.a, ", label=", this.b, ", isSelected="), this.c, ")");
    }
}
