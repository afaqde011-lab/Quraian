package bk;

import java.io.IOException;

public final class z extends a0 {

    public final a0 f2570a;

    public z(a0 a0Var) {
        this.f2570a = a0Var;
    }

    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() != 9) {
            return this.f2570a.b(aVar);
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.G();
        } else {
            this.f2570a.c(bVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f2570a + "]";
    }
}
