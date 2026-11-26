package i7;

public final class i1 {

    public static final i1 f7372c = new i1(0, false);

    public final int f7373a;

    public final boolean f7374b;

    public i1(int i10, boolean z10) {
        this.f7373a = i10;
        this.f7374b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i1.class == obj.getClass()) {
            i1 i1Var = (i1) obj;
            if (this.f7373a == i1Var.f7373a && this.f7374b == i1Var.f7374b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7373a << 1) + (this.f7374b ? 1 : 0);
    }
}
