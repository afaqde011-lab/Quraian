package m3;

public final class t {

    public final u3.c f10533a;

    public final int f10534b;

    public final int f10535c;

    public t(u3.c cVar, int i10, int i11) {
        this.f10533a = cVar;
        this.f10534b = i10;
        this.f10535c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f10533a.equals(tVar.f10533a) && this.f10534b == tVar.f10534b && this.f10535c == tVar.f10535c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10535c) + w.c.d(this.f10534b, this.f10533a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f10533a);
        sb2.append(", startIndex=");
        sb2.append(this.f10534b);
        sb2.append(", endIndex=");
        return oi.k.l(sb2, this.f10535c, ')');
    }
}
