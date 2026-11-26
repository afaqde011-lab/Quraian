package s7;

public final class r0 {

    public final int f13735a;

    public final boolean f13736b;

    public r0(int i10, boolean z10) {
        this.f13735a = i10;
        this.f13736b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f13735a == r0Var.f13735a && this.f13736b == r0Var.f13736b;
    }

    public final int hashCode() {
        return (this.f13735a * 31) + (this.f13736b ? 1 : 0);
    }
}
