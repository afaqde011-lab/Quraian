package e00;

public final class k implements m {
    public final long a;
    public final int b;

    public k(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override
    public final boolean a() {
        return this.a != 16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i2.t.c(this.a, kVar.a) && this.b == kVar.b;
    }

    public final int hashCode() {
        int i = i2.t.h;
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a1.b.q("TintColor(color=", i2.t.i(this.a), ", blendMode=", i2.l.a(this.b), ")");
    }
}
