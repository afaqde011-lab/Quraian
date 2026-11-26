package b6;

import com.google.protobuf.RuntimeVersion;

public final class f implements m {

    public final m f2166a;

    public final m f2167b;

    public f(m mVar, m mVar2) {
        this.f2166a = mVar;
        this.f2167b = mVar2;
    }

    @Override
    public final Object a(Object obj, u00.n nVar) {
        return this.f2167b.a(this.f2166a.a(obj, nVar), nVar);
    }

    @Override
    public final boolean b(bw.b bVar) {
        return this.f2166a.b(bVar) && this.f2167b.b(bVar);
    }

    @Override
    public final boolean c(u00.k kVar) {
        return this.f2166a.c(kVar) || this.f2167b.c(kVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f2166a, fVar.f2166a) && kotlin.jvm.internal.m.a(this.f2167b, fVar.f2167b);
    }

    public final int hashCode() {
        return (this.f2167b.hashCode() * 31) + this.f2166a.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("["), (String) a(RuntimeVersion.SUFFIX, new ax.c(11)), ']');
    }
}
