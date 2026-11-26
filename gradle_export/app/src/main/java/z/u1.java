package z;

import d0.t2;

public final class u1 implements h1 {

    public final h1 f16967a;

    public final b3.k f16968b = new b3.h1(1);

    public u1(h1 h1Var) {
        this.f16967a = h1Var;
    }

    @Override
    public final long a(long j9, int i10, u00.k kVar) {
        return this.f16967a.a(j9, i10, kVar);
    }

    @Override
    public final Object b(long j9, t2 t2Var, k00.c cVar) {
        Object objB = this.f16967a.b(j9, t2Var, cVar);
        return objB == l00.a.A ? objB : g00.b0.a;
    }

    @Override
    public final b3.k c() {
        return this.f16968b;
    }

    @Override
    public final boolean d() {
        return this.f16967a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && this.f16967a.equals(((u1) obj).f16967a);
    }

    public final int hashCode() {
        return this.f16967a.hashCode() + w.c.e(Boolean.hashCode(false) * 31, 31, true);
    }
}
