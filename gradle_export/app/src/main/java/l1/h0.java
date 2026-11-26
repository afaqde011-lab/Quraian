package l1;

public final class h0 implements a2.d {
    public final m A;

    public h0(m mVar) {
        this.A = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return kotlin.jvm.internal.m.a(this.A, ((h0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() * 31;
    }
}
