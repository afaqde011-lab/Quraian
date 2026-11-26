package gz;

public final class l0 implements m0 {
    public final zz.b a;

    public l0(zz.b quality) {
        kotlin.jvm.internal.m.e(quality, "quality");
        this.a = quality;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.a == ((l0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnVideoQualitySelected(quality=" + this.a + ")";
    }
}
