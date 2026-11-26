package i2;

public final class k0 extends l0 {

    public final h2.d f7142a;

    public final g f7143b;

    public k0(h2.d dVar) {
        g gVarA;
        this.f7142a = dVar;
        if (c7.i.M(dVar)) {
            gVarA = null;
        } else {
            gVarA = j.a();
            g.c(gVarA, dVar);
        }
        this.f7143b = gVarA;
    }

    @Override
    public final h2.c a() {
        h2.d dVar = this.f7142a;
        return new h2.c(dVar.f6550a, dVar.f6551b, dVar.f6552c, dVar.f6553d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return kotlin.jvm.internal.m.a(this.f7142a, ((k0) obj).f7142a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7142a.hashCode();
    }
}
