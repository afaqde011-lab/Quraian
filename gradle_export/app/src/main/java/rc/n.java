package rc;

public final class n {

    public final float f13198a;

    public final float f13199b;

    public final long f13200c;

    public n(float f3, float f10, long j9) {
        this.f13198a = f3;
        this.f13199b = f10;
        this.f13200c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f13198a, nVar.f13198a) == 0 && Float.compare(this.f13199b, nVar.f13199b) == 0 && this.f13200c == nVar.f13200c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13200c) + w.c.c(this.f13199b, Float.hashCode(this.f13198a) * 31, 31);
    }

    public final String toString() {
        return "ClickInfo(x=" + this.f13198a + ", y=" + this.f13199b + ", timestamp=" + this.f13200c + ')';
    }
}
