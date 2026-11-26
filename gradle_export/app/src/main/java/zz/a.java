package zz;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.core.compose.widgets.lce.ResourceText;
import kotlin.jvm.internal.m;
import oi.k;

public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final ResourceText d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public a(String str, String str2, String str3, ResourceText resourceText, String str4, boolean z, boolean z2, boolean z3, int i) {
        this(str, str2, str3, resourceText, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, z3, false, false);
    }

    public a(String code, String videoUrl, String soundUrl, ResourceText resourceText, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        m.e(code, "code");
        m.e(videoUrl, "videoUrl");
        m.e(soundUrl, "soundUrl");
        this.a = code;
        this.b = videoUrl;
        this.c = soundUrl;
        this.d = resourceText;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public static a a(a aVar, String str, String str2, boolean z, boolean z2, boolean z3, int i) {
        String code = aVar.a;
        if ((i & 2) != 0) {
            str = aVar.b;
        }
        String videoUrl = str;
        if ((i & 4) != 0) {
            str2 = aVar.c;
        }
        String soundUrl = str2;
        ResourceText resourceText = aVar.d;
        String str3 = aVar.e;
        boolean z4 = aVar.f;
        if ((i & 64) != 0) {
            z = aVar.g;
        }
        boolean z5 = aVar.h;
        m.e(code, "code");
        m.e(videoUrl, "videoUrl");
        m.e(soundUrl, "soundUrl");
        return new a(code, videoUrl, soundUrl, resourceText, str3, z4, z, z5, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && m.a(this.b, aVar.b) && m.a(this.c, aVar.c) && m.a(this.d, aVar.d) && m.a(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j;
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        ResourceText resourceText = this.d;
        int iHashCode = (iE + (resourceText == null ? 0 : resourceText.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.j) + w.c.e(w.c.e(w.c.e(w.c.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("SoundEffect(code=", this.a, ", videoUrl=", this.b, ", soundUrl=");
        sbS.append(this.c);
        sbS.append(", title=");
        sbS.append(this.d);
        sbS.append(", iconUrl=");
        sbS.append(this.e);
        sbS.append(", isNew=");
        sbS.append(this.f);
        sbS.append(", isPaid=");
        k.y(sbS, this.g, ", isBundled=", this.h, ", showNewBadge=");
        sbS.append(this.i);
        sbS.append(", showFreeBadge=");
        sbS.append(this.j);
        sbS.append(")");
        return sbS.toString();
    }
}
