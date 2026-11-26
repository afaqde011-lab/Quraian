package ft;

import kotlin.jvm.internal.m;

public final class f {
    public final String a;
    public final int b;

    public f(String translationId, int i) {
        m.e(translationId, "translationId");
        this.a = translationId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.a, fVar.a) && this.b == fVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TafsirCacheKey(translationId=" + this.a + ", contentVersion=" + this.b + ")";
    }
}
