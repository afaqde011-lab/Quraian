package androidx.media3.common;

public final class c1 {

    public final r f1141a;

    public c1(r rVar) {
        this.f1141a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            return this.f1141a.equals(((c1) obj).f1141a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1141a.f1465a.hashCode();
    }
}
