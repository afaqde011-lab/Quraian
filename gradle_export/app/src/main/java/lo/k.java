package lo;

import com.google.android.gms.internal.measurement.x5;

public final class k {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final e e;
    public final a f;
    public final u30.b g;
    public final s h;
    public final i i;

    public k(int i, String str, String str2, String str3, e eVar, a aVar, u30.b episodes, s sVar, i iVar) {
        kotlin.jvm.internal.m.e(episodes, "episodes");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = eVar;
        this.f = aVar;
        this.g = episodes;
        this.h = sVar;
        this.i = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && kotlin.jvm.internal.m.a(this.b, kVar.b) && kotlin.jvm.internal.m.a(this.c, kVar.c) && kotlin.jvm.internal.m.a(this.d, kVar.d) && kotlin.jvm.internal.m.a(this.e, kVar.e) && kotlin.jvm.internal.m.a(this.f, kVar.f) && kotlin.jvm.internal.m.a(this.g, kVar.g) && this.h == kVar.h && kotlin.jvm.internal.m.a(this.i, kVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + x5.e(x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31)) * 31;
        a aVar = this.f;
        return this.i.hashCode() + ((this.h.hashCode() + g4.c.c(this.g, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStoryDvo(id=", this.a, ", slug=", this.b, ", title=");
        a1.b.z(sbM, this.c, ", description=", this.d, ", cover=");
        sbM.append(this.e);
        sbM.append(", author=");
        sbM.append(this.f);
        sbM.append(", episodes=");
        sbM.append(this.g);
        sbM.append(", playButton=");
        sbM.append(this.h);
        sbM.append(", download=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
