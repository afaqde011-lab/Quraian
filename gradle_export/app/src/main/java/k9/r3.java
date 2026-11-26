package k9;

import java.util.Objects;

public final class r3 {

    public static final r3 f9408c = new r3(false, false);

    public static final String f9409d;

    public static final String f9410e;

    public final boolean f9411a;

    public final boolean f9412b;

    static {
        String str = e7.i0.f5136a;
        f9409d = Integer.toString(0, 36);
        f9410e = Integer.toString(1, 36);
    }

    public r3(boolean z10, boolean z11) {
        this.f9411a = z10;
        this.f9412b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return this.f9411a == r3Var.f9411a && this.f9412b == r3Var.f9412b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f9411a), Boolean.valueOf(this.f9412b));
    }
}
