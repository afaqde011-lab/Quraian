package g1;

public final class u6 implements i2.u, kotlin.jvm.internal.g {
    public final f40.h A;

    public u6(f40.h hVar) {
        this.A = hVar;
    }

    @Override
    public final long a() {
        return ((i2.t) this.A.get()).f7169a;
    }

    public final g00.e b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2.u) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.A.equals(((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
