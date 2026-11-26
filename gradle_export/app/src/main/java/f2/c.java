package f2;

import b3.k0;
import b3.o0;
import b3.v1;
import kotlin.KotlinNothingValueException;

public final class c extends b2.q implements v1, b, b3.o {
    public final d O;
    public boolean P;
    public u00.k Q;

    public c(d dVar, u00.k kVar) {
        this.O = dVar;
        this.Q = kVar;
        dVar.A = this;
    }

    public final void B1() {
        this.P = false;
        this.O.B = null;
        b3.m.m(this);
    }

    @Override
    public final void J0() {
        B1();
    }

    @Override
    public final long b() {
        return kh.n.m0(b3.m.v(this, 4).C);
    }

    @Override
    public final y3.c c() {
        return b3.m.y(this).Z;
    }

    @Override
    public final void e0() {
        B1();
    }

    @Override
    public final y3.m getLayoutDirection() {
        return b3.m.y(this).f2053a0;
    }

    @Override
    public final void h() {
        B1();
    }

    @Override
    public final void i(o0 o0Var) throws KotlinNothingValueException {
        boolean z10 = this.P;
        d dVar = this.O;
        if (!z10) {
            dVar.B = null;
            b3.m.t(this, new k0(this, dVar, 7));
            if (dVar.B == null) {
                throw a1.b.u("DrawResult not defined, did you forget to call onDraw?");
            }
            this.P = true;
        }
        me.i iVar = dVar.B;
        kotlin.jvm.internal.m.b(iVar);
        ((u00.k) iVar.B).invoke(o0Var);
    }

    @Override
    public final void j0() {
        B1();
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void v1() {
        B1();
    }
}
