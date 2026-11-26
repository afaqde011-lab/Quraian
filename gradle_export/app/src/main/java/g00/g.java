package g00;

public final class g implements Comparable {
    public static final g E = new g(2, 3, 21);
    public final int A;
    public final int B;
    public final int C;
    public final int D;

    public g(int i, int i2, int i3) {
        this.A = i;
        this.B = i2;
        this.C = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.D = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override
    public final int compareTo(Object obj) {
        g other = (g) obj;
        kotlin.jvm.internal.m.e(other, "other");
        return this.D - other.D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.D == gVar.D;
    }

    public final int hashCode() {
        return this.D;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A);
        sb.append('.');
        sb.append(this.B);
        sb.append('.');
        sb.append(this.C);
        return sb.toString();
    }
}
