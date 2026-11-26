package h1;

public final class a implements o0 {

    public final b2.g f6485a;

    public final b2.g f6486b;

    public final int f6487c;

    public a(b2.g gVar, b2.g gVar2, int i10) {
        this.f6485a = gVar;
        this.f6486b = gVar2;
        this.f6487c = i10;
    }

    @Override
    public final int a(y3.k kVar, long j9, int i10, y3.m mVar) {
        int iA = this.f6486b.a(0, kVar.d(), mVar);
        int i11 = -this.f6485a.a(0, i10, mVar);
        y3.m mVar2 = y3.m.A;
        int i12 = this.f6487c;
        if (mVar != mVar2) {
            i12 = -i12;
        }
        return kVar.f16592a + iA + i11 + i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6485a.equals(aVar.f6485a) && this.f6486b.equals(aVar.f6486b) && this.f6487c == aVar.f6487c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6487c) + w.c.c(this.f6486b.f1980a, Float.hashCode(this.f6485a.f1980a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.f6485a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f6486b);
        sb2.append(", offset=");
        return oi.k.l(sb2, this.f6487c, ')');
    }
}
