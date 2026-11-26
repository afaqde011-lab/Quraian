package p10;

import java.util.Collection;

public final class y extends s implements e20.b {
    public final n20.c a;

    public y(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        this.a = fqName;
    }

    @Override
    public final e a(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return kotlin.jvm.internal.m.a(this.a, ((y) obj).a);
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        return h00.x.A;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return y.class.getName() + ": " + this.a;
    }
}
