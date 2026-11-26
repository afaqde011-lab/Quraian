package jk;

import android.graphics.RenderEffect;
import b2.q;
import b3.o;
import b3.o0;
import b3.p;
import b3.p1;
import b3.v1;
import b3.y;
import g1.l0;
import kotlin.jvm.internal.m;
import l1.e1;
import l1.i1;
import u00.n;
import z2.a0;
import z2.l1;
import z2.v0;
import z2.x0;
import z2.y0;

public final class g extends q implements y, o, p, v1 {
    public a O;
    public l P;
    public u00.k Q;
    public u00.k R;
    public n S;
    public u00.k T;
    public final f U;
    public l2.b V;
    public final e W;
    public final i1 X;
    public final e1 Y;
    public final e Z;

    public final e f8316a0;

    public g(a aVar, l lVar, u00.k kVar, u00.k kVar2, n nVar, u00.k kVar3) {
        m.e(aVar, "backdrop");
        m.e(kVar, "effects");
        this.O = aVar;
        this.P = lVar;
        this.Q = kVar;
        this.R = kVar2;
        this.S = nVar;
        this.T = kVar3;
        this.U = new f(this);
        this.W = new e(this, 0);
        this.X = new i1(null, l1.c.D);
        this.Y = new e1(0.0f);
        this.Z = new e(this, 1);
        this.f8316a0 = new e(this, 2);
    }

    public final void B1() {
        u00.k kVar = this.Q;
        f fVar = this.U;
        fVar.getClass();
        m.e(kVar, "effects");
        fVar.E = 0.0f;
        fVar.F = null;
        kVar.invoke(fVar);
        l2.b bVar = this.V;
        if (bVar != null) {
            RenderEffect renderEffect = fVar.F;
            bVar.j(renderEffect != null ? new i2.k(renderEffect) : null);
        }
        this.Y.i(fVar.E);
    }

    @Override
    public final void J0() {
        b3.m.t(this, new l0(this, 13));
    }

    @Override
    public final void W(p1 p1Var) {
        if (p1Var.z1().N) {
            boolean zA = this.O.a();
            i1 i1Var = this.X;
            if (zA) {
                i1Var.setValue(p1Var);
            } else if (((a0) i1Var.getValue()) != null) {
                i1Var.setValue(null);
            }
        }
    }

    @Override
    public final x0 e(y0 y0Var, v0 v0Var, long j9) {
        m.e(v0Var, "measurable");
        l1 l1VarO = v0Var.O(j9);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new h1.v0(l1VarO, this, 10));
    }

    @Override
    public final void i(o0 o0Var) {
        f fVar = this.U;
        fVar.getClass();
        k2.b bVar = o0Var.A;
        float fC = bVar.c();
        float fT0 = bVar.t0();
        long jB = bVar.b();
        y3.m layoutDirection = o0Var.getLayoutDirection();
        boolean z10 = (fC == fVar.A && fT0 == fVar.B && h2.e.a(jB, fVar.C) && layoutDirection == fVar.D) ? false : true;
        if (z10) {
            fVar.A = fC;
            fVar.B = fT0;
            fVar.C = jB;
            m.e(layoutDirection, "<set-?>");
            fVar.D = layoutDirection;
        }
        if (z10) {
            B1();
        }
        this.f8316a0.invoke(o0Var);
        u00.k kVar = this.T;
        if (kVar != null) {
            kVar.invoke(o0Var);
        }
        o0Var.a();
    }

    @Override
    public final void t1() {
        this.V = b3.m.w(this).c();
        b3.m.t(this, new l0(this, 13));
    }

    @Override
    public final void u1() {
        i2.y yVarW = b3.m.w(this);
        l2.b bVar = this.V;
        if (bVar != null) {
            yVarW.a(bVar);
            this.V = null;
        }
        f fVar = this.U;
        fVar.A = 1.0f;
        fVar.B = 1.0f;
        fVar.C = 9205357640488583168L;
        fVar.D = y3.m.A;
        fVar.E = 0.0f;
        fVar.F = null;
        fVar.G.A.clear();
        this.X.setValue(null);
    }
}
