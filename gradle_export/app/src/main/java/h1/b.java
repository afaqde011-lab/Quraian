package h1;

public final class b implements p0 {

    public final b2.h f6491a;

    public final b2.h f6492b;

    public final int f6493c;

    public b(b2.h hVar, b2.h hVar2, int i10) {
        this.f6491a = hVar;
        this.f6492b = hVar2;
        this.f6493c = i10;
    }

    @Override
    public final int a(y3.k kVar, long j9, int i10) {
        int iA = this.f6492b.a(0, kVar.b());
        return kVar.f16593b + iA + (-this.f6491a.a(0, i10)) + this.f6493c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6491a.equals(bVar.f6491a) && this.f6492b.equals(bVar.f6492b) && this.f6493c == bVar.f6493c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6493c) + w.c.c(this.f6492b.f1981a, Float.hashCode(this.f6491a.f1981a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f6491a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f6492b);
        sb2.append(", offset=");
        return oi.k.l(sb2, this.f6493c, ')');
    }
}
