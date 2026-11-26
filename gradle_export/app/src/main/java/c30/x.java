package c30;

import java.util.List;

public final class x {
    public final boolean a;
    public final List b = h00.x.A;

    public x(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && kotlin.jvm.internal.m.a(this.b, xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreReleaseInfo(isInvisible=");
        sb.append(this.a);
        sb.append(", poisoningFeatures=");
        return oi.k.n(sb, this.b, ')');
    }
}
