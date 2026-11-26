package k9;

import java.util.List;

public final class b2 {

    public final fh.t0 f9232a;

    public final int f9233b;

    public final long f9234c;

    public b2(List list, int i10, long j9) {
        this.f9232a = fh.t0.o(list);
        this.f9233b = i10;
        this.f9234c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f9232a.equals(b2Var.f9232a) && this.f9233b == b2Var.f9233b && this.f9234c == b2Var.f9234c;
    }

    public final int hashCode() {
        return c7.i.G(this.f9234c) + (((this.f9232a.hashCode() * 31) + this.f9233b) * 31);
    }
}
