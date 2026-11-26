package jc;

import fc.f;
import fc.m;
import java.util.List;

public final class c implements e {
    public final b A;
    public final b B;

    public c(b bVar, b bVar2) {
        this.A = bVar;
        this.B = bVar2;
    }

    @Override
    public final fc.e m0() {
        return new m((f) this.A.m0(), (f) this.B.m0());
    }

    @Override
    public final List t0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override
    public final boolean w0() {
        return this.A.w0() && this.B.w0();
    }
}
