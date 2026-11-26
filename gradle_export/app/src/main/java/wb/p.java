package wb;

import android.graphics.drawable.Drawable;

public final class p extends j {

    public final Drawable f15975a;

    public final i f15976b;

    public final nb.e f15977c;

    public final ub.b f15978d;

    public final String f15979e;

    public final boolean f15980f;

    public final boolean f15981g;

    public p(Drawable drawable, i iVar, nb.e eVar, ub.b bVar, String str, boolean z10, boolean z11) {
        this.f15975a = drawable;
        this.f15976b = iVar;
        this.f15977c = eVar;
        this.f15978d = bVar;
        this.f15979e = str;
        this.f15980f = z10;
        this.f15981g = z11;
    }

    @Override
    public final Drawable a() {
        return this.f15975a;
    }

    @Override
    public final i b() {
        return this.f15976b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f15975a, pVar.f15975a) && kotlin.jvm.internal.m.a(this.f15976b, pVar.f15976b) && this.f15977c == pVar.f15977c && kotlin.jvm.internal.m.a(this.f15978d, pVar.f15978d) && kotlin.jvm.internal.m.a(this.f15979e, pVar.f15979e) && this.f15980f == pVar.f15980f && this.f15981g == pVar.f15981g;
    }

    public final int hashCode() {
        int iHashCode = (this.f15977c.hashCode() + ((this.f15976b.hashCode() + (this.f15975a.hashCode() * 31)) * 31)) * 31;
        ub.b bVar = this.f15978d;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f15979e;
        return Boolean.hashCode(this.f15981g) + w.c.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f15980f);
    }
}
