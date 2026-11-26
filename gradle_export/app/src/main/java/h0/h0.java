package h0;

public final class h0 {
    public final void a(z2.v0 v0Var, z2.v0 v0Var2, long j9) {
        long jP = c.p(j9, b1.A);
        if (v0Var != null) {
            int iS = v0Var.s(y3.a.g(jP));
            new u.j(u.j.a(iS, v0Var.f0(iS)));
        }
        if (v0Var2 != null) {
            int iS2 = v0Var2.s(y3.a.g(jP));
            new u.j(u.j.a(iS2, v0Var2.f0(iS2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        f0 f0Var = f0.A;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + w.c.d(0, f0.A.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + f0.A + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
