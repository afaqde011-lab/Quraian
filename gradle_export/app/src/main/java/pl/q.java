package pl;

public final class q {
    public final h2.c a;
    public final boolean b;

    public q(h2.c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    public final boolean a(long j) {
        h2.c cVar = this.a;
        if (!cVar.a(j)) {
            return false;
        }
        if (!this.b) {
            return true;
        }
        float fMin = Math.min(cVar.c - cVar.a, cVar.d - cVar.b) / 2.0f;
        long jC = cVar.c();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (jC >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (jC & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat) <= fMin * fMin;
    }

    public final float b() {
        boolean z = this.b;
        h2.c cVar = this.a;
        if (z) {
            float fMin = Math.min(cVar.c - cVar.a, cVar.d - cVar.b) / 2.0f;
            return 3.1415927f * fMin * fMin;
        }
        return (cVar.d - cVar.b) * (cVar.c - cVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.a, qVar.a) && this.b == qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SpoilerRegionSpec(bounds=" + this.a + ", isCircle=" + this.b + ")";
    }
}
