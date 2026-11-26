package k0;

import java.util.ArrayList;

public final class b implements c {

    public final int f8457a;

    public b(int i10) {
        this.f8457a = i10;
        if (i10 > 0) {
            return;
        }
        g0.a.a("Provided count should be larger than zero");
    }

    @Override
    public final ArrayList a(y3.c cVar, int i10, int i11) {
        return kh.n.w(i10, this.f8457a, i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f8457a == ((b) obj).f8457a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f8457a;
    }
}
