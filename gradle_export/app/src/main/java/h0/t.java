package h0;

public final class t implements r {

    public final y3.c f6460a;

    public final long f6461b;

    public t(z2.w1 w1Var, long j9) {
        this.f6460a = w1Var;
        this.f6461b = j9;
    }

    @Override
    public final b2.r a(b2.r rVar, b2.d dVar) {
        return rVar.V(new l(dVar, false));
    }

    public final float b() {
        long j9 = this.f6461b;
        if (!y3.a.c(j9)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f6460a.h0(y3.a.g(j9));
    }

    public final float c() {
        long j9 = this.f6461b;
        if (!y3.a.d(j9)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f6460a.h0(y3.a.h(j9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.f6460a, tVar.f6460a) && y3.a.b(this.f6461b, tVar.f6461b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6461b) + (this.f6460a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f6460a + ", constraints=" + ((Object) y3.a.k(this.f6461b)) + ')';
    }
}
