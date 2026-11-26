package x3;

public final class q {

    public static final q f16426c = new q(kh.o.z(0), kh.o.z(0));

    public final long f16427a;

    public final long f16428b;

    public q(long j9, long j10) {
        this.f16427a = j9;
        this.f16428b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return y3.o.a(this.f16427a, qVar.f16427a) && y3.o.a(this.f16428b, qVar.f16428b);
    }

    public final int hashCode() {
        y3.p[] pVarArr = y3.o.f16598b;
        return Long.hashCode(this.f16428b) + (Long.hashCode(this.f16427a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) y3.o.d(this.f16427a)) + ", restLine=" + ((Object) y3.o.d(this.f16428b)) + ')';
    }
}
