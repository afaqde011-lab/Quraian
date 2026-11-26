package n2;

import h2.e;
import i2.t0;
import y3.m;

public final class a {

    public t0 f11001a;

    public long f11002b;

    public m f11003c;

    public float f11004d;

    public d f11005e;

    public a(t0 t0Var, long j9, m mVar, float f3, d dVar) {
        this.f11001a = t0Var;
        this.f11002b = j9;
        this.f11003c = mVar;
        this.f11004d = f3;
        this.f11005e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f11001a, aVar.f11001a) && e.a(this.f11002b, aVar.f11002b) && this.f11003c == aVar.f11003c && Float.compare(this.f11004d, aVar.f11004d) == 0 && kotlin.jvm.internal.m.a(this.f11005e, aVar.f11005e);
    }

    public final int hashCode() {
        int iC = w.c.c(this.f11004d, (this.f11003c.hashCode() + w.c.f(this.f11001a.hashCode() * 31, this.f11002b, 31)) * 31, 31);
        d dVar = this.f11005e;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.f11001a + ", size=" + ((Object) e.h(this.f11002b)) + ", layoutDirection=" + this.f11003c + ", density=" + this.f11004d + ", shadow=" + this.f11005e + ')';
    }
}
