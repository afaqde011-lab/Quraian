package h1;

public final class h1 implements p0 {

    public final b2.h f6512a;

    public final int f6513b;

    public h1(b2.h hVar, int i10) {
        this.f6512a = hVar;
        this.f6513b = i10;
    }

    @Override
    public final int a(y3.k kVar, long j9, int i10) {
        int i11 = (int) (j9 & 4294967295L);
        int i12 = this.f6513b;
        if (i10 < i11 - (i12 * 2)) {
            return ab.a0.y(this.f6512a.a(i10, i11), i12, (i11 - i12) - i10);
        }
        return Math.round((1 + 0.0f) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f6512a.equals(h1Var.f6512a) && this.f6513b == h1Var.f6513b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6513b) + (Float.hashCode(this.f6512a.f1981a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f6512a);
        sb2.append(", margin=");
        return oi.k.l(sb2, this.f6513b, ')');
    }
}
