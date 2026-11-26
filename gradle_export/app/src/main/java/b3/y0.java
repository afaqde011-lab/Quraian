package b3;

import androidx.compose.ui.node.Owner;

public final class y0 extends z2.l1 implements z2.v0, b, f1 {
    public final q0 F;
    public boolean G;
    public boolean K;
    public boolean L;
    public y3.a M;
    public u00.k O;
    public l2.b P;
    public boolean U;
    public Object X;

    public boolean f2145b0;
    public int H = Integer.MAX_VALUE;
    public int I = Integer.MAX_VALUE;
    public h0 J = h0.C;
    public long N = 0;
    public w0 Q = w0.C;
    public final m0 R = new m0(this, 1);
    public final m1.e S = new m1.e(0, new y0[16]);
    public boolean T = true;
    public final x0 V = new x0(this, 0);
    public boolean W = true;
    public long Y = y3.b.b(0, 0, 0, 0, 15);
    public final x0 Z = new x0(this, 2);

    public final x0 f2144a0 = new x0(this, 1);

    public y0(q0 q0Var) {
        this.F = q0Var;
        this.X = q0Var.f2122p.R;
    }

    public final void C0(boolean z10) {
        if (z10 && y0()) {
            return;
        }
        if (z10 || y0()) {
            this.Q = w0.C;
            m1.e eVarB = this.F.f2109a.B();
            Object[] objArr = eVarB.A;
            int i10 = eVarB.C;
            for (int i11 = 0; i11 < i10; i11++) {
                y0 y0Var = ((l0) objArr[i11]).f2060h0.f2123q;
                kotlin.jvm.internal.m.b(y0Var);
                y0Var.C0(true);
            }
        }
    }

    @Override
    public final int D(int i10) {
        J0();
        v0 v0VarX1 = this.F.a().x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        return v0VarX1.D(i10);
    }

    public final void E0() {
        w0 w0Var = this.Q;
        q0 q0Var = this.F;
        boolean z10 = q0Var.f2111c;
        l0 l0Var = q0Var.f2109a;
        if (z10) {
            this.Q = w0.B;
        } else {
            this.Q = w0.A;
        }
        if (w0Var != w0.A && q0Var.f2113e) {
            l0.V(l0Var, true, 6);
        }
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            y0 y0Var = l0Var2.f2060h0.f2123q;
            if (y0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (y0Var.I != Integer.MAX_VALUE) {
                y0Var.E0();
                l0.Y(l0Var2);
            }
        }
    }

    public final void H0() {
        q0 q0Var = this.F;
        if (q0Var.f2121o > 0) {
            m1.e eVarB = q0Var.f2109a.B();
            Object[] objArr = eVarB.A;
            int i10 = eVarB.C;
            for (int i11 = 0; i11 < i10; i11++) {
                l0 l0Var = (l0) objArr[i11];
                q0 q0Var2 = l0Var.f2060h0;
                if ((q0Var2.m || q0Var2.f2120n) && !q0Var2.f2114f) {
                    l0Var.U(false);
                }
                y0 y0Var = q0Var2.f2123q;
                if (y0Var != null) {
                    y0Var.H0();
                }
            }
        }
    }

    public final void J0() {
        h0 h0Var;
        q0 q0Var = this.F;
        l0.V(q0Var.f2109a, false, 7);
        l0 l0Var = q0Var.f2109a;
        l0 l0VarX = l0Var.x();
        if (l0VarX == null || l0Var.f2056d0 != h0.C) {
            return;
        }
        int iOrdinal = l0VarX.f2060h0.f2112d.ordinal();
        if (iOrdinal != 0) {
            h0Var = iOrdinal != 2 ? l0VarX.f2056d0 : h0.B;
        } else {
            h0Var = h0.A;
        }
        l0Var.f2056d0 = h0Var;
    }

    public final void N0() {
        f0 f0Var;
        this.f2145b0 = true;
        q0 q0Var = this.F;
        l0 l0VarX = q0Var.f2109a.x();
        w0 w0Var = this.Q;
        if ((w0Var != w0.A && !q0Var.f2111c) || (w0Var != w0.B && q0Var.f2111c)) {
            E0();
            if (this.G && l0VarX != null) {
                l0VarX.U(false);
            }
        }
        if (l0VarX != null) {
            q0 q0Var2 = l0VarX.f2060h0;
            if (!this.G && ((f0Var = q0Var2.f2112d) == f0.C || f0Var == f0.D)) {
                if (this.I != Integer.MAX_VALUE) {
                    y2.a.c("Place was called on a node which was placed already");
                }
                int i10 = q0Var2.f2116h;
                this.I = i10;
                q0Var2.f2116h = i10 + 1;
            }
        } else {
            this.I = 0;
        }
        a0();
    }

    @Override
    public final z2.l1 O(long j9) {
        h0 h0Var;
        q0 q0Var = this.F;
        l0 l0VarX = q0Var.f2109a.x();
        if ((l0VarX != null ? l0VarX.f2060h0.f2112d : null) == f0.B) {
            q0Var.f2110b = false;
        } else {
            l0 l0VarX2 = q0Var.f2109a.x();
            if ((l0VarX2 != null ? l0VarX2.f2060h0.f2112d : null) == f0.D) {
                q0Var.f2110b = false;
            }
        }
        l0 l0Var = q0Var.f2109a;
        l0 l0VarX3 = l0Var.x();
        if (l0VarX3 != null) {
            q0 q0Var2 = l0VarX3.f2060h0;
            if (this.J != h0.C && !l0Var.f2058f0) {
                y2.a.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = q0Var2.f2112d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                h0Var = h0.A;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + q0Var2.f2112d);
                }
                h0Var = h0.B;
            }
            this.J = h0Var;
        } else {
            this.J = h0.C;
        }
        l0 l0Var2 = q0Var.f2109a;
        if (l0Var2.f2056d0 == h0.C) {
            l0Var2.e();
        }
        V0(j9);
        return this;
    }

    public final void O0(long j9, l2.b bVar, u00.k kVar) {
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        l0 l0Var2 = q0Var.f2109a;
        try {
            l0 l0VarX = l0Var.x();
            f0 f0Var = l0VarX != null ? l0VarX.f2060h0.f2112d : null;
            f0 f0Var2 = f0.D;
            if (f0Var == f0Var2) {
                q0Var.f2111c = false;
            }
            if (l0Var2.f2070r0) {
                y2.a.a("place is called on a deactivated node");
            }
            q0Var.f2112d = f0Var2;
            boolean z10 = true;
            this.K = true;
            this.f2145b0 = false;
            if (!y3.j.b(j9, this.N)) {
                if (q0Var.f2120n || q0Var.m) {
                    q0Var.f2114f = true;
                }
                H0();
            }
            Owner ownerA = p0.a(l0Var2);
            this.N = j9;
            if (q0Var.f2114f) {
                q0Var.h(false);
                this.R.f2078g = false;
                b2 snapshotObserver = ((c3.z) ownerA).getSnapshotObserver();
                snapshotObserver.f2003a.d(l0Var2, snapshotObserver.f2009g, this.f2144a0);
            } else {
                if (this.Q == w0.C) {
                    z10 = false;
                }
                if (z10) {
                    v0 v0VarX1 = q0Var.a().x1();
                    kotlin.jvm.internal.m.b(v0VarX1);
                    v0VarX1.r1(y3.j.d(j9, v0VarX1.E));
                    N0();
                } else {
                    q0Var.h(false);
                    this.R.f2078g = false;
                    b2 snapshotObserver2 = ((c3.z) ownerA).getSnapshotObserver();
                    snapshotObserver2.f2003a.d(l0Var2, snapshotObserver2.f2009g, this.f2144a0);
                }
            }
            this.O = kVar;
            this.P = bVar;
            q0Var.f2112d = f0.E;
        } catch (Throwable th2) {
            l0Var.a0(th2);
            throw null;
        }
    }

    @Override
    public final Object U() {
        return this.X;
    }

    public final boolean V0(long j9) {
        long j10;
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        l0 l0Var2 = q0Var.f2109a;
        try {
            if (l0Var.f2070r0) {
                y2.a.a("measure is called on a deactivated node");
            }
            l0 l0VarX = l0Var2.x();
            l0Var2.f2058f0 = l0Var2.f2058f0 || (l0VarX != null && l0VarX.f2058f0);
            if (!l0Var2.f2060h0.f2113e) {
                y3.a aVar = this.M;
                if (aVar == null ? false : y3.a.b(aVar.f16587a, j9)) {
                    Owner owner = l0Var2.O;
                    if (owner != null) {
                        ((c3.z) owner).j(l0Var2, true);
                    }
                    l0Var2.Z();
                    return false;
                }
            }
            this.M = new y3.a(j9);
            x0(j9);
            this.R.f2077f = false;
            m1.e eVarB = l0Var2.B();
            Object[] objArr = eVarB.A;
            int i10 = eVarB.C;
            for (int i11 = 0; i11 < i10; i11++) {
                y0 y0Var = ((l0) objArr[i11]).f2060h0.f2123q;
                kotlin.jvm.internal.m.b(y0Var);
                y0Var.R.f2074c = false;
            }
            if (this.L) {
                j10 = this.C;
            } else {
                long j11 = Integer.MIN_VALUE;
                j10 = (j11 & 4294967295L) | (j11 << 32);
            }
            this.L = true;
            v0 v0VarX1 = q0Var.a().x1();
            if (!(v0VarX1 != null)) {
                y2.a.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            q0Var.c(j9);
            v0((((long) v0VarX1.B) & 4294967295L) | (((long) v0VarX1.A) << 32));
            return (((int) (j10 >> 32)) == v0VarX1.A && ((int) (j10 & 4294967295L)) == v0VarX1.B) ? false : true;
        } catch (Throwable th2) {
            l0Var.a0(th2);
            throw null;
        }
    }

    @Override
    public final void X(boolean z10) {
        v0 v0VarX1;
        q0 q0Var = this.F;
        v0 v0VarX2 = q0Var.a().x1();
        if (Boolean.valueOf(z10).equals(v0VarX2 != null ? Boolean.valueOf(v0VarX2.I) : null) || (v0VarX1 = q0Var.a().x1()) == null) {
            return;
        }
        v0VarX1.I = z10;
    }

    @Override
    public final void Y(a aVar) throws Exception {
        m1.e eVarB = this.F.f2109a.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            y0 y0Var = ((l0) objArr[i11]).f2060h0.f2123q;
            kotlin.jvm.internal.m.b(y0Var);
            aVar.invoke(y0Var);
        }
    }

    @Override
    public final m0 a() {
        return this.R;
    }

    @Override
    public final void a0() {
        this.U = true;
        m0 m0Var = this.R;
        m0Var.h();
        q0 q0Var = this.F;
        boolean z10 = q0Var.f2114f;
        l0 l0Var = q0Var.f2109a;
        if (z10) {
            m1.e eVarB = l0Var.B();
            Object[] objArr = eVarB.A;
            int i10 = eVarB.C;
            for (int i11 = 0; i11 < i10; i11++) {
                l0 l0Var2 = (l0) objArr[i11];
                q0 q0Var2 = l0Var2.f2060h0;
                if (q0Var2.f2113e && l0Var2.t() == h0.A) {
                    y0 y0Var = q0Var2.f2123q;
                    kotlin.jvm.internal.m.b(y0Var);
                    y0 y0Var2 = q0Var2.f2123q;
                    y3.a aVar = y0Var2 != null ? y0Var2.M : null;
                    kotlin.jvm.internal.m.b(aVar);
                    if (y0Var.V0(aVar.f16587a)) {
                        l0.V(l0Var, false, 7);
                    }
                }
            }
        }
        t tVar = g().f2134v0;
        kotlin.jvm.internal.m.b(tVar);
        if (q0Var.f2115g || (!tVar.K && q0Var.f2114f)) {
            q0Var.f2114f = false;
            f0 f0Var = q0Var.f2112d;
            q0Var.f2112d = f0.D;
            q0Var.i(false);
            b2 snapshotObserver = ((c3.z) p0.a(l0Var)).getSnapshotObserver();
            snapshotObserver.f2003a.d(l0Var, snapshotObserver.f2010h, this.V);
            q0Var.f2112d = f0Var;
            if (q0Var.m && tVar.K) {
                requestLayout();
            }
            q0Var.f2115g = false;
        }
        if (m0Var.f2075d) {
            m0Var.f2076e = true;
        }
        if (m0Var.f2073b && m0Var.e()) {
            m0Var.g();
        }
        this.U = false;
    }

    @Override
    public final int d(int i10) {
        J0();
        v0 v0VarX1 = this.F.a().x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        return v0VarX1.d(i10);
    }

    @Override
    public final void e0() {
        l0.V(this.F.f2109a, false, 7);
    }

    @Override
    public final int f0(int i10) {
        J0();
        v0 v0VarX1 = this.F.a().x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        return v0VarX1.f0(i10);
    }

    @Override
    public final u g() {
        return (u) this.F.f2109a.f2059g0.D;
    }

    @Override
    public final int i0() {
        v0 v0VarX1 = this.F.a().x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        return v0VarX1.i0();
    }

    @Override
    public final b j() {
        q0 q0Var;
        l0 l0VarX = this.F.f2109a.x();
        if (l0VarX == null || (q0Var = l0VarX.f2060h0) == null) {
            return null;
        }
        return q0Var.f2123q;
    }

    @Override
    public final int j0() {
        v0 v0VarX1 = this.F.a().x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        return v0VarX1.j0();
    }

    @Override
    public final void q0(long j9, float f3, l2.b bVar) {
        O0(j9, bVar, null);
    }

    @Override
    public final void r0(long j9, float f3, u00.k kVar) {
        O0(j9, null, kVar);
    }

    @Override
    public final void requestLayout() {
        this.F.f2109a.U(false);
    }

    @Override
    public final int s(int i10) {
        J0();
        v0 v0VarX1 = this.F.a().x1();
        kotlin.jvm.internal.m.b(v0VarX1);
        return v0VarX1.s(i10);
    }

    public final boolean y0() {
        q0 q0Var = this.F;
        return m.s(q0Var.f2109a) || q0Var.f2111c;
    }

    @Override
    public final int z() {
        return this.I;
    }
}
