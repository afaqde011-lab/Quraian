package a8;

public final class e0 {

    public static final e0 f252c = new e0(0, 0);

    public final long f253a;

    public final long f254b;

    public e0(long j9, long j10) {
        this.f253a = j9;
        this.f254b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f253a == e0Var.f253a && this.f254b == e0Var.f254b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f253a) * 31) + ((int) this.f254b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f253a);
        sb2.append(", position=");
        return a1.b.k(this.f254b, "]", sb2);
    }
}
