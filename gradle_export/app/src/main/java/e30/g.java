package e30;

public final class g {
    public final k10.h a;

    public g(k10.h annotations) {
        kotlin.jvm.internal.m.e(annotations, "annotations");
        this.a = annotations;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.m.a(((g) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
