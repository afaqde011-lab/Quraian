package q0;

import a1.q2;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class d2 extends b2.q implements b3.j, b3.y {
    public final m3.r0 O;
    public q3.h0 P;
    public jk.l Q;

    public d2(m3.r0 r0Var) {
        this.O = r0Var;
    }

    public final void B1(m3.r0 r0Var, q3.h hVar) {
        m3.i0 i0Var = r0Var.f10522a;
        q3.i iVar = i0Var.f10462f;
        q3.u uVar = i0Var.f10459c;
        if (uVar == null) {
            uVar = q3.u.J;
        }
        q3.o oVar = i0Var.f10460d;
        int i10 = oVar != null ? oVar.f12746a : 0;
        q3.p pVar = i0Var.f10461e;
        this.P = ((q3.j) hVar).b(iVar, uVar, i10, pVar != null ? pVar.f12747a : 65535);
        b3.m.n(this);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) throws KotlinNothingValueException {
        jk.l lVar = this.Q;
        if (lVar == null) {
            throw g4.c.o("Min size state is not set.");
        }
        l1.i1 i1Var = (l1.i1) lVar.f8325g;
        q3.h0 h0Var = this.P;
        if (h0Var == null) {
            throw g4.c.o("Font resolution state is not set.");
        }
        Object value = h0Var.getValue();
        if (!kotlin.jvm.internal.m.a(value, lVar.f8324f)) {
            lVar.f8324f = value;
            i1Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) i1Var.getValue()).booleanValue()) {
            lVar.f8320b = u1.a((m3.r0) lVar.f8323e, (y3.c) lVar.f8321c, (q3.h) lVar.f8322d, u1.f12702a, 1);
            i1Var.setValue(Boolean.FALSE);
        }
        long j10 = lVar.f8320b;
        z2.l1 l1VarO = v0Var.O(y3.b.e(j9, y3.b.b((int) (j10 >> 32), 0, (int) (j10 & 4294967295L), 0, 10)));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 18));
    }

    @Override
    public final void h() {
        jk.l lVar = this.Q;
        if (lVar != null) {
            jk.l.a(lVar, null, b3.m.y(this).Z, null, 29);
        }
        b3.m.n(this);
    }

    @Override
    public final void j0() {
        jk.l lVar = this.Q;
        if (lVar != null) {
            jk.l.a(lVar, b3.m.y(this).f2053a0, null, null, 30);
        }
        b3.m.n(this);
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        m3.r0 r0VarJ = m3.h0.j(this.O, b3.m.y(this).f2053a0);
        q3.h hVar = (q3.h) b3.m.h(this, c3.o1.f2737k);
        B1(r0VarJ, hVar);
        y3.m mVar = b3.m.y(this).f2053a0;
        y3.c cVar = b3.m.y(this).Z;
        q3.h0 h0Var = this.P;
        if (h0Var == null) {
            throw g4.c.o("Font resolution state is not set.");
        }
        this.Q = new jk.l(mVar, cVar, hVar, r0VarJ, h0Var.getValue());
    }

    @Override
    public final void u1() {
        this.P = null;
        this.Q = null;
    }
}
