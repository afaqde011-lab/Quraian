package e30;

import java.util.List;

public abstract class w implements k10.a, h30.g {
    public int A;

    public abstract x20.n N();

    public abstract List e0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (t0() == wVar.t0()) {
            return c.z(f30.m.A, y0(), wVar.y0());
        }
        return false;
    }

    @Override
    public final k10.h getAnnotations() {
        return h.a(k0());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.A;
        if (i != 0) {
            return i;
        }
        if (c.k(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (t0() ? 1 : 0) + ((e0().hashCode() + (m0().hashCode() * 31)) * 31);
        }
        this.A = iHashCode;
        return iHashCode;
    }

    public abstract h0 k0();

    public abstract m0 m0();

    public abstract boolean t0();

    public abstract w w0(f30.f fVar);

    public abstract z0 y0();
}
