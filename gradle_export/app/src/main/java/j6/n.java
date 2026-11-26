package j6;

import h00.x;
import java.util.List;

public final class n {

    public final float f8188a;

    public final List f8189b;

    static {
        new n(0.0f, 3);
    }

    public n(float f3, int i10) {
        this((i10 & 1) != 0 ? 0 : f3, (List) x.A);
    }

    public n(float f3, List list) {
        this.f8188a = f3;
        this.f8189b = list;
    }

    public final n a(n nVar) {
        return new n(this.f8188a + nVar.f8188a, h00.q.Y0(nVar.f8189b, this.f8189b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return y3.f.b(this.f8188a, nVar.f8188a) && kotlin.jvm.internal.m.a(this.f8189b, nVar.f8189b);
    }

    public final int hashCode() {
        return this.f8189b.hashCode() + (Float.hashCode(this.f8188a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingDimension(dp=");
        w.c.r(this.f8188a, sb2, ", resourceIds=");
        return oi.k.n(sb2, this.f8189b, ')');
    }
}
