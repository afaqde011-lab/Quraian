package i2;

import b3.j2;
import b3.p1;
import z2.l1;
import z2.x0;
import z2.y0;

public final class o extends b2.q implements b3.y, j2 {
    public u00.k O;

    public o(u00.k kVar) {
        this.O = kVar;
    }

    @Override
    public final x0 e(y0 y0Var, z2.v0 v0Var, long j9) {
        l1 l1VarO = v0Var.O(j9);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new b2.v(l1VarO, this, 9));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        t0 t0Var;
        boolean z10;
        p1 p1VarV = b3.m.v(this, 2);
        if (p1VarV.f2101h0) {
            t0Var = p1VarV.f2099f0;
            z10 = p1VarV.f2100g0;
        } else {
            q0 q0Var = b0.f7110a;
            if (q0Var == null) {
                b0.f7110a = new q0();
            } else {
                q0Var.a();
            }
            q0 q0Var2 = b0.f7110a;
            kotlin.jvm.internal.m.b(q0Var2);
            q0Var2.Q = p1VarV.O.Z;
            q0Var2.P = kh.n.m0(p1VarV.C);
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                this.O.invoke(q0Var2);
                z1.q.n(fVarF, fVarK, kVarE);
                t0Var = q0Var2.M;
                z10 = q0Var2.N;
            } catch (Throwable th2) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th2;
            }
        }
        if (z10) {
            j3.y.m(a0Var, t0Var);
        }
    }

    @Override
    public final boolean q1() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.O + ')';
    }
}
