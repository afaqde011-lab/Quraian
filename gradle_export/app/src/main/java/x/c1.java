package x;

public final class c1 implements i {

    public final i f16269a;

    public final long f16270b;

    public c1(y yVar, long j9) {
        this.f16269a = yVar;
        this.f16270b = j9;
    }

    @Override
    public final s1 a(r1 r1Var) {
        return new d1(this.f16269a.a(r1Var), this.f16270b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return c1Var.f16270b == this.f16270b && kotlin.jvm.internal.m.a(c1Var.f16269a, this.f16269a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f16270b) + (this.f16269a.hashCode() * 31);
    }
}
