package ri;

import java.util.List;

public final class r0 extends b2 {

    public final List f13512a;

    public final x1 f13513b;

    public final p1 f13514c;

    public final u0 f13515d;

    public final List f13516e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.f13512a = list;
        this.f13513b = t0Var;
        this.f13514c = p1Var;
        this.f13515d = u0Var;
        this.f13516e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        List list = this.f13512a;
        if (list == null) {
            if (((r0) b2Var).f13512a != null) {
                return false;
            }
        } else if (!list.equals(((r0) b2Var).f13512a)) {
            return false;
        }
        x1 x1Var = this.f13513b;
        if (x1Var == null) {
            if (((r0) b2Var).f13513b != null) {
                return false;
            }
        } else if (!x1Var.equals(((r0) b2Var).f13513b)) {
            return false;
        }
        p1 p1Var = this.f13514c;
        if (p1Var == null) {
            if (((r0) b2Var).f13514c != null) {
                return false;
            }
        } else if (!p1Var.equals(((r0) b2Var).f13514c)) {
            return false;
        }
        r0 r0Var = (r0) b2Var;
        return this.f13515d.equals(r0Var.f13515d) && this.f13516e.equals(r0Var.f13516e);
    }

    public final int hashCode() {
        List list = this.f13512a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.f13513b;
        int iHashCode2 = (iHashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.f13514c;
        return this.f13516e.hashCode() ^ (((((p1Var != null ? p1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f13515d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.f13512a + ", exception=" + this.f13513b + ", appExitInfo=" + this.f13514c + ", signal=" + this.f13515d + ", binaries=" + this.f13516e + "}";
    }
}
