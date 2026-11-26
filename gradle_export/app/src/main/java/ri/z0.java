package ri;

public final class z0 extends c2 {

    public final String f13581a;

    public final int f13582b;

    public final int f13583c;

    public final boolean f13584d;

    public z0(int i10, int i11, String str, boolean z10) {
        this.f13581a = str;
        this.f13582b = i10;
        this.f13583c = i11;
        this.f13584d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            z0 z0Var = (z0) ((c2) obj);
            if (this.f13581a.equals(z0Var.f13581a) && this.f13582b == z0Var.f13582b && this.f13583c == z0Var.f13583c && this.f13584d == z0Var.f13584d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13584d ? 1231 : 1237) ^ ((((((this.f13581a.hashCode() ^ 1000003) * 1000003) ^ this.f13582b) * 1000003) ^ this.f13583c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f13581a);
        sb2.append(", pid=");
        sb2.append(this.f13582b);
        sb2.append(", importance=");
        sb2.append(this.f13583c);
        sb2.append(", defaultProcess=");
        return g4.c.l(sb2, this.f13584d, "}");
    }
}
