package dw;

import com.google.android.gms.internal.measurement.x5;
import h00.q;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.k;

public final class a {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final List h;
    public final u30.b i;

    public a(int i, String str, String str2, String str3, String str4, String str5, boolean z, List titleOtherLanguages, u30.b surahs) {
        m.e(titleOtherLanguages, "titleOtherLanguages");
        m.e(surahs, "surahs");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = titleOtherLanguages;
        this.i = surahs;
    }

    public final String a() {
        b bVar;
        c cVar;
        if (!this.g || (bVar = (b) q.N0(this.i)) == null || (cVar = bVar.f) == null) {
            return null;
        }
        return cVar.b;
    }

    public final String b() {
        b bVar;
        c cVar;
        String str;
        if (!this.g || (bVar = (b) q.N0(this.i)) == null || (cVar = bVar.f) == null || (str = cVar.c) == null || k.L0(str)) {
            return null;
        }
        return str;
    }

    public final boolean c() {
        return m.a(this.b, "favourites");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && m.a(this.b, aVar.b) && m.a(this.c, aVar.c) && m.a(this.d, aVar.d) && m.a(this.e, aVar.e) && m.a(this.f, aVar.f) && this.g == aVar.g && m.a(this.h, aVar.h) && m.a(this.i, aVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + g4.c.a(w.c.e(x5.e(x5.e(x5.e(x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("Playlist(id=", this.a, ", slug=", this.b, ", title=");
        a1.b.z(sbM, this.c, ", subtitle=", this.d, ", description=");
        a1.b.z(sbM, this.e, ", coverUrl=", this.f, ", isSpecial=");
        sbM.append(this.g);
        sbM.append(", titleOtherLanguages=");
        sbM.append(this.h);
        sbM.append(", surahs=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
