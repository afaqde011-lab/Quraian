package c4;

import com.google.protobuf.RuntimeVersion;

public final class v {

    public final boolean f2846a;

    public final boolean f2847b;

    public final d0 f2848c;

    public final boolean f2849d;

    public final boolean f2850e;

    public final String f2851f;

    public final int f2852g;

    public v(int i10, boolean z10) {
        this((i10 & 1) != 0, (i10 & 2) != 0, (i10 & 4) != 0 ? true : z10);
    }

    public v(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, true, 224);
        d0 d0Var = d0.A;
    }

    public v(boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        d0 d0Var = d0.A;
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        this.f2846a = z10;
        this.f2847b = z11;
        this.f2848c = d0Var;
        this.f2849d = z12;
        this.f2850e = z13;
        this.f2851f = RuntimeVersion.SUFFIX;
        this.f2852g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f2846a == vVar.f2846a && this.f2847b == vVar.f2847b && this.f2848c == vVar.f2848c && this.f2849d == vVar.f2849d && this.f2850e == vVar.f2850e && this.f2852g == vVar.f2852g;
    }

    public final int hashCode() {
        return (w.c.e(w.c.e((this.f2848c.hashCode() + w.c.e(Boolean.hashCode(this.f2846a) * 31, 31, this.f2847b)) * 31, 31, this.f2849d), 31, this.f2850e) + this.f2852g) * 31;
    }
}
