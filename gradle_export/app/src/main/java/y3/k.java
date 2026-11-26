package y3;

public final class k {

    public static final k f16591e = new k(0, 0, 0, 0);

    public final int f16592a;

    public final int f16593b;

    public final int f16594c;

    public final int f16595d;

    public k(int i10, int i11, int i12, int i13) {
        this.f16592a = i10;
        this.f16593b = i11;
        this.f16594c = i12;
        this.f16595d = i13;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.f16593b)) & 4294967295L) | (((long) ((d() / 2) + this.f16592a)) << 32);
    }

    public final int b() {
        return this.f16595d - this.f16593b;
    }

    public final long c() {
        return (((long) this.f16592a) << 32) | (((long) this.f16593b) & 4294967295L);
    }

    public final int d() {
        return this.f16594c - this.f16592a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f16592a == kVar.f16592a && this.f16593b == kVar.f16593b && this.f16594c == kVar.f16594c && this.f16595d == kVar.f16595d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16595d) + w.c.d(this.f16594c, w.c.d(this.f16593b, Integer.hashCode(this.f16592a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f16592a);
        sb2.append(", ");
        sb2.append(this.f16593b);
        sb2.append(", ");
        sb2.append(this.f16594c);
        sb2.append(", ");
        return oi.k.l(sb2, this.f16595d, ')');
    }
}
