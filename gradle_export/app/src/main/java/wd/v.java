package wd;

public final class v extends i0 {

    public final h0 f16065a;

    public final g0 f16066b;

    public v(h0 h0Var, g0 g0Var) {
        this.f16065a = h0Var;
        this.f16066b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f16065a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f16065a) : ((v) i0Var).f16065a == null) {
                g0 g0Var = this.f16066b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f16066b) : ((v) i0Var).f16066b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f16065a;
        int iHashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f16066b;
        return iHashCode ^ (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f16065a + ", mobileSubtype=" + this.f16066b + "}";
    }
}
