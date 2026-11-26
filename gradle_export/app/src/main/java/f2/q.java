package f2;

import b3.o0;
import b3.v1;
import i2.t0;

public final class q extends b2.q implements b3.o, v1 {
    public t0 O;
    public n2.d P;
    public n2.b Q;

    @Override
    public final void J0() {
        this.Q = null;
        b3.m.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.O, qVar.O) && kotlin.jvm.internal.m.a(this.P, qVar.P);
    }

    public final int hashCode() {
        return this.P.hashCode() + (this.O.hashCode() * 31);
    }

    @Override
    public final void i(o0 o0Var) {
        n2.b bVar;
        n2.b bVar2 = this.Q;
        if (bVar2 == null) {
            h1.l lVarB = b3.m.w(this).b();
            t0 t0Var = this.O;
            n2.d dVar = this.P;
            lVarB.getClass();
            n2.b bVar3 = new n2.b(t0Var, dVar, lVarB);
            this.Q = bVar3;
            bVar = bVar3;
        } else {
            bVar = bVar2;
        }
        bVar.g(o0Var, o0Var.A.b(), 1.0f, null);
        o0Var.a();
    }
}
