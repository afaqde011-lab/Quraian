package b3;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class b0 extends p1 {

    public static final i2.e f1998y0;

    public y f1999u0;

    public y3.a f2000v0;

    public z f2001w0;

    public z2.i f2002x0;

    static {
        i2.e eVarG = i2.b0.g();
        eVarG.e(i2.t.f7165e);
        eVarG.l(1.0f);
        eVarG.m(1);
        f1998y0 = eVarG;
    }

    public b0(l0 l0Var, y yVar) {
        super(l0Var);
        this.f1999u0 = yVar;
        this.f2001w0 = l0Var.I != null ? new z(this) : null;
        this.f2002x0 = (((b2.q) yVar).A.C & 512) != 0 ? new z2.i(this, (w.f1) yVar) : null;
    }

    @Override
    public final int C0(z2.a aVar) {
        z zVar = this.f2001w0;
        if (zVar == null) {
            return m.c(this, aVar);
        }
        u.c0 c0Var = zVar.T;
        int iD = c0Var.d(aVar);
        if (iD >= 0) {
            return c0Var.f14833c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final int D(int i10) {
        z2.i iVar = this.f2002x0;
        if (iVar == null) {
            y yVar = this.f1999u0;
            p1 p1Var = this.R;
            kotlin.jvm.internal.m.b(p1Var);
            return yVar.T(this, p1Var, i10);
        }
        w.f1 f1Var = iVar.B;
        p1 p1Var2 = this.R;
        kotlin.jvm.internal.m.b(p1Var2);
        p1 p1Var3 = f1Var.A.H;
        kotlin.jvm.internal.m.b(p1Var3);
        v0 v0VarX1 = p1Var3.x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        if (!v0VarX1.V0()) {
            return p1Var2.D(i10);
        }
        return f1Var.B1(new z2.g(iVar, iVar.getLayoutDirection()), new r1(p1Var2, t1.B, u1.A, 0), y3.b.b(0, 0, 0, i10, 7)).d();
    }

    @Override
    public final z2.l1 O(long j9) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        z2.x0 x0VarE;
        y3.a aVar;
        if (this.Q) {
            y3.a aVar2 = this.f2000v0;
            if (aVar2 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j9 = aVar2.f16587a;
        }
        x0(j9);
        z2.i iVar = this.f2002x0;
        if (iVar != null) {
            w.f1 f1Var = iVar.B;
            z zVar = iVar.A.f2001w0;
            kotlin.jvm.internal.m.b(zVar);
            z2.x0 x0VarZ0 = zVar.Z0();
            x0VarZ0.d();
            x0VarZ0.c();
            boolean z10 = false;
            boolean z11 = (f1Var.Q.h() && f1Var.Q.e().a() && f1Var.Q.e().f15781b.b()) || (aVar = this.f2000v0) == null || j9 != aVar.f16587a;
            iVar.C = z11;
            if (!z11) {
                p1 p1Var = this.R;
                kotlin.jvm.internal.m.b(p1Var);
                p1Var.Q = true;
            }
            p1 p1Var2 = this.R;
            kotlin.jvm.internal.m.b(p1Var2);
            x0VarE = f1Var.B1(iVar, p1Var2, j9);
            p1 p1Var3 = this.R;
            kotlin.jvm.internal.m.b(p1Var3);
            p1Var3.Q = false;
            int iD = x0VarE.d();
            z zVar2 = this.f2001w0;
            kotlin.jvm.internal.m.b(zVar2);
            if (iD == zVar2.A) {
                int iC = x0VarE.c();
                z zVar3 = this.f2001w0;
                kotlin.jvm.internal.m.b(zVar3);
                if (iC == zVar3.B) {
                    z10 = true;
                }
            }
            if (!iVar.C) {
                p1 p1Var4 = this.R;
                kotlin.jvm.internal.m.b(p1Var4);
                long j10 = p1Var4.C;
                p1 p1Var5 = this.R;
                kotlin.jvm.internal.m.b(p1Var5);
                v0 v0VarX1 = p1Var5.x1();
                if (y3.l.a(v0VarX1 != null ? new y3.l(v0VarX1.p1()) : null, j10) && !z10) {
                    x0VarE = new a0(x0VarE, this);
                }
            }
        } else {
            y yVar = this.f1999u0;
            p1 p1Var6 = this.R;
            kotlin.jvm.internal.m.b(p1Var6);
            x0VarE = yVar.e(this, p1Var6, j9);
        }
        S1(x0VarE);
        J1();
        return this;
    }

    @Override
    public final void O1(i2.s sVar, l2.b bVar) throws NoWhenBranchMatchedException {
        p1 p1Var;
        p1 p1Var2 = this.R;
        kotlin.jvm.internal.m.b(p1Var2);
        p1Var2.s1(sVar, bVar);
        if (!((c3.z) p0.a(this.O)).getShowLayoutBounds() || (p1Var = this.R) == null) {
            return;
        }
        if (y3.l.b(this.C, p1Var.C) && y3.j.b(p1Var.f2095b0, 0L)) {
            return;
        }
        long j9 = this.C;
        sVar.a(0.5f, 0.5f, ((int) (j9 >> 32)) - 0.5f, ((int) (j9 & 4294967295L)) - 0.5f, f1998y0);
    }

    public final void b2() {
        boolean z10;
        if (this.J) {
            return;
        }
        K1();
        p1 p1Var = this.R;
        kotlin.jvm.internal.m.b(p1Var);
        z2.i iVar = this.f2002x0;
        if (iVar != null) {
            kotlin.jvm.internal.m.b(this.f2001w0);
            if (iVar.C) {
                z10 = false;
            } else {
                long j9 = this.C;
                z zVar = this.f2001w0;
                if (y3.l.a(zVar != null ? new y3.l(zVar.p1()) : null, j9)) {
                    long j10 = p1Var.C;
                    v0 v0VarX1 = p1Var.x1();
                    if (y3.l.a(v0VarX1 != null ? new y3.l(v0VarX1.p1()) : null, j10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            p1Var.P = z10;
        }
        p1Var.K = this.K;
        Z0().b();
        p1Var.K = false;
        p1Var.P = false;
    }

    public final void c2(y yVar) {
        if (!yVar.equals(this.f1999u0)) {
            if ((((b2.q) yVar).A.C & 512) != 0) {
                w.f1 f1Var = (w.f1) yVar;
                z2.i iVar = this.f2002x0;
                if (iVar != null) {
                    iVar.B = f1Var;
                } else {
                    iVar = new z2.i(this, f1Var);
                }
                this.f2002x0 = iVar;
            } else {
                this.f2002x0 = null;
            }
        }
        this.f1999u0 = yVar;
    }

    @Override
    public final int d(int i10) {
        z2.i iVar = this.f2002x0;
        if (iVar == null) {
            y yVar = this.f1999u0;
            p1 p1Var = this.R;
            kotlin.jvm.internal.m.b(p1Var);
            return yVar.d0(this, p1Var, i10);
        }
        w.f1 f1Var = iVar.B;
        p1 p1Var2 = this.R;
        kotlin.jvm.internal.m.b(p1Var2);
        p1 p1Var3 = f1Var.A.H;
        kotlin.jvm.internal.m.b(p1Var3);
        v0 v0VarX1 = p1Var3.x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        if (!v0VarX1.V0()) {
            return p1Var2.d(i10);
        }
        return f1Var.B1(new z2.g(iVar, iVar.getLayoutDirection()), new r1(p1Var2, t1.B, u1.B, 0), y3.b.b(0, i10, 0, 0, 13)).c();
    }

    @Override
    public final int f0(int i10) {
        z2.i iVar = this.f2002x0;
        if (iVar == null) {
            y yVar = this.f1999u0;
            p1 p1Var = this.R;
            kotlin.jvm.internal.m.b(p1Var);
            return yVar.z(this, p1Var, i10);
        }
        w.f1 f1Var = iVar.B;
        p1 p1Var2 = this.R;
        kotlin.jvm.internal.m.b(p1Var2);
        p1 p1Var3 = f1Var.A.H;
        kotlin.jvm.internal.m.b(p1Var3);
        v0 v0VarX1 = p1Var3.x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        if (!v0VarX1.V0()) {
            return p1Var2.f0(i10);
        }
        return f1Var.B1(new z2.g(iVar, iVar.getLayoutDirection()), new r1(p1Var2, t1.A, u1.B, 0), y3.b.b(0, i10, 0, 0, 13)).c();
    }

    @Override
    public final void q0(long j9, float f3, l2.b bVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        b0 b0Var;
        if (this.P) {
            v0 v0VarX1 = x1();
            kotlin.jvm.internal.m.b(v0VarX1);
            b0Var = this;
            b0Var.P1(v0VarX1.P, f3, null, bVar);
        } else {
            b0Var = this;
            b0Var.P1(j9, f3, null, bVar);
        }
        b0Var.b2();
    }

    @Override
    public final void r0(long j9, float f3, u00.k kVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.P) {
            v0 v0VarX1 = x1();
            kotlin.jvm.internal.m.b(v0VarX1);
            P1(v0VarX1.P, f3, kVar, null);
        } else {
            P1(j9, f3, kVar, null);
        }
        b2();
    }

    @Override
    public final int s(int i10) {
        z2.i iVar = this.f2002x0;
        if (iVar == null) {
            y yVar = this.f1999u0;
            p1 p1Var = this.R;
            kotlin.jvm.internal.m.b(p1Var);
            return yVar.G(this, p1Var, i10);
        }
        w.f1 f1Var = iVar.B;
        p1 p1Var2 = this.R;
        kotlin.jvm.internal.m.b(p1Var2);
        p1 p1Var3 = f1Var.A.H;
        kotlin.jvm.internal.m.b(p1Var3);
        v0 v0VarX1 = p1Var3.x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        if (!v0VarX1.V0()) {
            return p1Var2.s(i10);
        }
        return f1Var.B1(new z2.g(iVar, iVar.getLayoutDirection()), new r1(p1Var2, t1.A, u1.A, 0), y3.b.b(0, 0, 0, i10, 7)).d();
    }

    @Override
    public final void u1() {
        if (this.f2001w0 == null) {
            this.f2001w0 = new z(this);
        }
    }

    @Override
    public final v0 x1() {
        return this.f2001w0;
    }

    @Override
    public final b2.q z1() {
        return ((b2.q) this.f1999u0).A;
    }
}
