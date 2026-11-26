package h1;

public final class d1 implements g0, kotlin.jvm.internal.g {
    public final f40.h A;

    public d1(f40.h hVar) {
        this.A = hVar;
    }

    public final g00.e b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.A.equals(((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final float invoke() {
        return ((Number) this.A.get()).floatValue();
    }
}
