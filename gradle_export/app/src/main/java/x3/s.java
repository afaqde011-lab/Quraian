package x3;

public final class s {

    public static final s f16430c = new s(2, false);

    public static final s f16431d = new s(1, true);

    public final int f16432a;

    public final boolean f16433b;

    public s(int i10, boolean z10) {
        this.f16432a = i10;
        this.f16433b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f16432a == sVar.f16432a && this.f16433b == sVar.f16433b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16433b) + (Integer.hashCode(this.f16432a) * 31);
    }

    public final String toString() {
        if (equals(f16430c)) {
            return "TextMotion.Static";
        }
        return equals(f16431d) ? "TextMotion.Animated" : "Invalid";
    }
}
