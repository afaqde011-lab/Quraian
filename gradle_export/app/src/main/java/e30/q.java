package e30;

import java.util.List;

public abstract class q extends z0 implements h30.f {
    public final a0 B;
    public final a0 C;

    public q(a0 lowerBound, a0 upperBound) {
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        this.B = lowerBound;
        this.C = upperBound;
    }

    public abstract a0 C0();

    public abstract String D0(p20.h hVar, p20.h hVar2);

    @Override
    public x20.n N() {
        return C0().N();
    }

    @Override
    public final List e0() {
        return C0().e0();
    }

    @Override
    public final h0 k0() {
        return C0().k0();
    }

    @Override
    public final m0 m0() {
        return C0().m0();
    }

    @Override
    public final boolean t0() {
        return C0().t0();
    }

    public String toString() {
        return p20.h.e.X(this);
    }
}
