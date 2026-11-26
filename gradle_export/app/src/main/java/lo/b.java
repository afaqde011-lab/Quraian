package lo;

import com.google.android.gms.internal.measurement.x5;

public final class b {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final e e;
    public final s f;
    public final i g;
    public final boolean h;

    public b(int i, String str, String str2, String str3, e eVar, s sVar, i iVar, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = eVar;
        this.f = sVar;
        this.g = iVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && kotlin.jvm.internal.m.a(this.b, bVar.b) && kotlin.jvm.internal.m.a(this.c, bVar.c) && kotlin.jvm.internal.m.a(this.d, bVar.d) && kotlin.jvm.internal.m.a(this.e, bVar.e) && this.f == bVar.f && kotlin.jvm.internal.m.a(this.g, bVar.g) && this.h == bVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + x5.e(x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31)) * 31)) * 31;
        i iVar = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStoryCardDvo(id=", this.a, ", slug=", this.b, ", title=");
        a1.b.z(sbM, this.c, ", description=", this.d, ", cover=");
        sbM.append(this.e);
        sbM.append(", playButton=");
        sbM.append(this.f);
        sbM.append(", download=");
        sbM.append(this.g);
        sbM.append(", hasDownloadedEpisode=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }
}
