package xb;

import kotlin.jvm.internal.m;

public final class e implements h {
    public final g A;

    public e(g gVar) {
        this.A = gVar;
    }

    @Override
    public final Object d(lb.h hVar) {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return m.a(this.A, ((e) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
