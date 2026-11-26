package q0;

import a1.q2;
import kotlin.KotlinNothingValueException;

public final class c1 extends b2.q implements b3.j, b3.y, b3.v1 {
    public m3.r0 O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public int T;
    public m3.r0 U;
    public q3.h0 V;

    public final m3.r0 B1() throws KotlinNothingValueException {
        m3.r0 r0Var = this.U;
        if (r0Var != null) {
            return r0Var;
        }
        throw g4.c.o("Resolved style is not set.");
    }

    @Override
    public final void J0() {
        if (this.V != null) {
            b3.m.t(this, new b1(this, 1));
        }
        this.R = true;
        b3.m.n(this);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) throws KotlinNothingValueException {
        if (this.R) {
            m3.r0 r0VarB1 = B1();
            q3.h hVar = (q3.h) b3.m.h(this, c3.o1.f2737k);
            String str = u1.f12702a;
            int iA = (int) (u1.a(r0VarB1, y0Var, hVar, str, 1) & 4294967295L);
            int iA2 = ((int) (u1.a(r0VarB1, y0Var, hVar, str + '\n' + str, 2) & 4294967295L)) - iA;
            int i10 = this.P;
            this.S = i10 == 1 ? -1 : ((i10 - 1) * iA2) + iA;
            int i11 = this.Q;
            this.T = i11 == Integer.MAX_VALUE ? -1 : ((i11 - 1) * iA2) + iA;
            this.R = false;
        }
        int i12 = this.S;
        int iY = i12 != -1 ? ab.a0.y(i12, y3.a.i(j9), y3.a.g(j9)) : y3.a.i(j9);
        int i13 = this.T;
        z2.l1 l1VarO = v0Var.O(y3.a.a(j9, 0, 0, iY, i13 != -1 ? ab.a0.y(i13, y3.a.i(j9), y3.a.g(j9)) : y3.a.g(j9), 3));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 17));
    }

    @Override
    public final void h() {
        this.R = true;
        b3.m.n(this);
    }

    @Override
    public final void j0() {
        this.U = m3.h0.j(this.O, b3.m.y(this).f2053a0);
        this.R = true;
        b3.m.n(this);
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        q3.h hVar = (q3.h) b3.m.h(this, c3.o1.f2737k);
        this.U = m3.h0.j(this.O, b3.m.y(this).f2053a0);
        q3.i iVar = B1().f10522a.f10462f;
        q3.u uVar = B1().f10522a.f10459c;
        if (uVar == null) {
            uVar = q3.u.J;
        }
        q3.o oVar = B1().f10522a.f10460d;
        int i10 = oVar != null ? oVar.f12746a : 0;
        q3.p pVar = B1().f10522a.f10461e;
        this.V = ((q3.j) hVar).b(iVar, uVar, i10, pVar != null ? pVar.f12747a : 65535);
        b3.m.t(this, new b1(this, 0));
        this.R = true;
    }

    @Override
    public final void u1() {
        this.U = null;
        this.V = null;
        this.R = false;
    }
}
