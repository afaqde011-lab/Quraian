package al;

import ab.a0;
import i2.g0;
import i2.t;
import java.util.List;
import x.d0;

public final class n {
    public final long a;
    public final d0 b;
    public final List c;

    public n(long j, d0 d0Var) {
        this.a = j;
        this.b = d0Var;
        this.c = va.a.S(new t[]{new t(t.b(0.0f, j)), new t(j), new t(t.b(0.0f, j))});
    }

    public final g0 a(float f, long j) {
        int i = (int) (j >> 32);
        float fX = (a0.x(f, 0.0f, 1.0f) - 1.0f) * Float.intBitsToFloat(i);
        return sg.f.L(this.c, fX, Float.intBitsToFloat(i) + fX, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return t.c(this.a, nVar.a) && this.b.equals(nVar.b) && Float.compare(0.6f, 0.6f) == 0;
    }

    public final int hashCode() {
        int i = t.h;
        return Float.hashCode(0.6f) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Shimmer(highlightColor=" + t.i(this.a) + ", animationSpec=" + this.b + ", progressForMaxAlpha=0.6)";
    }
}
