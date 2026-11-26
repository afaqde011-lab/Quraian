package b2;

import com.google.protobuf.RuntimeVersion;

public final class k implements r {
    public final r A;
    public final r B;

    public k(r rVar, r rVar2) {
        this.A = rVar;
        this.B = rVar2;
    }

    @Override
    public final Object a(Object obj, u00.n nVar) {
        return this.B.a(this.A.a(obj, nVar), nVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.A, kVar.A) && kotlin.jvm.internal.m.a(this.B, kVar.B);
    }

    @Override
    public final boolean g(u00.k kVar) {
        return this.A.g(kVar) && this.B.g(kVar);
    }

    public final int hashCode() {
        return (this.B.hashCode() * 31) + this.A.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("["), (String) a(RuntimeVersion.SUFFIX, j.A), ']');
    }
}
