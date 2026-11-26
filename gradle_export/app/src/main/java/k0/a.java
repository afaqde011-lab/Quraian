package k0;

import java.util.ArrayList;

public final class a implements c {

    public final float f8455a;

    public a(float f3) {
        this.f8455a = f3;
        if (y3.f.a(f3, 0) > 0) {
            return;
        }
        g0.a.a("Provided min size should be larger than zero.");
    }

    @Override
    public final ArrayList a(y3.c cVar, int i10, int i11) {
        return kh.n.w(i10, Math.max((i10 + i11) / (cVar.R0(this.f8455a) + i11), 1), i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return y3.f.b(this.f8455a, ((a) obj).f8455a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8455a);
    }
}
