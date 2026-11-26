package e1;

import com.google.android.gms.internal.measurement.x5;

public final class f0 {

    public final q0.y0 f4958a;

    public final long f4959b;

    public final e0 f4960c;

    public final boolean f4961d;

    public f0(q0.y0 y0Var, long j9, e0 e0Var, boolean z10) {
        this.f4958a = y0Var;
        this.f4959b = j9;
        this.f4960c = e0Var;
        this.f4961d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f4958a == f0Var.f4958a && h2.b.b(this.f4959b, f0Var.f4959b) && this.f4960c == f0Var.f4960c && this.f4961d == f0Var.f4961d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4961d) + ((this.f4960c.hashCode() + w.c.f(this.f4958a.hashCode() * 31, this.f4959b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f4958a);
        sb2.append(", position=");
        sb2.append((Object) h2.b.h(this.f4959b));
        sb2.append(", anchor=");
        sb2.append(this.f4960c);
        sb2.append(", visible=");
        return x5.o(sb2, this.f4961d, ')');
    }
}
