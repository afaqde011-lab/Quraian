package b3;

import androidx.compose.ui.node.Owner;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class c1 extends z2.l1 implements z2.v0, b, f1 {
    public final q0 F;
    public boolean G;
    public boolean J;
    public boolean K;
    public u00.k N;
    public l2.b O;
    public float P;
    public Object R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    public boolean f2011a0;

    public float f2015e0;

    public boolean f2016f0;

    public u00.k f2017g0;

    public l2.b f2018h0;

    public float f2020j0;

    public boolean f2022l0;
    public int H = Integer.MAX_VALUE;
    public int I = Integer.MAX_VALUE;
    public h0 L = h0.C;
    public long M = 0;
    public boolean Q = true;
    public final m0 X = new m0(this, 0);
    public final m1.e Y = new m1.e(0, new c1[16]);
    public boolean Z = true;

    public long f2012b0 = y3.b.b(0, 0, 0, 0, 15);

    public final b1 f2013c0 = new b1(this, 1);

    public final b1 f2014d0 = new b1(this, 0);

    public long f2019i0 = 0;

    public final b1 f2021k0 = new b1(this, 2);

    public c1(q0 q0Var) {
        this.F = q0Var;
    }

    public final void C0() {
        boolean z10 = this.S;
        this.S = true;
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        a1.n nVar = l0Var.f2059g0;
        if (!z10) {
            ((u) nVar.D).K1();
            ((c3.z) p0.a(l0Var)).getRectManager().e(q0Var.f2109a);
            if (l0Var.r()) {
                l0.X(l0Var, true, 6);
            } else if (l0Var.f2060h0.f2113e) {
                l0.V(l0Var, true, 6);
            }
        }
        p1 p1Var = ((u) nVar.D).R;
        for (p1 p1Var2 = (p1) nVar.E; !kotlin.jvm.internal.m.a(p1Var2, p1Var) && p1Var2 != null; p1Var2 = p1Var2.R) {
            if (p1Var2.f2106m0) {
                p1Var2.G1();
            }
        }
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if (l0Var2.y() != Integer.MAX_VALUE) {
                l0Var2.f2060h0.f2122p.C0();
                l0.Y(l0Var2);
            }
        }
    }

    @Override
    public final int D(int i10) {
        q0 q0Var = this.F;
        if (!m.s(q0Var.f2109a)) {
            H0();
            return q0Var.a().D(i10);
        }
        y0 y0Var = q0Var.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        return y0Var.D(i10);
    }

    public final void E0() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.S) {
            this.S = false;
            q0 q0Var = this.F;
            l0 l0Var = q0Var.f2109a;
            l0 l0Var2 = q0Var.f2109a;
            ((c3.z) p0.a(l0Var)).getRectManager().f(l0Var2);
            a1.n nVar = l0Var2.f2059g0;
            p1 p1Var = ((u) nVar.D).R;
            for (p1 p1Var2 = (p1) nVar.E; !kotlin.jvm.internal.m.a(p1Var2, p1Var) && p1Var2 != null; p1Var2 = p1Var2.R) {
                p1Var2.M1();
                p1Var2.R1();
            }
            m1.e eVarB = l0Var2.B();
            Object[] objArr = eVarB.A;
            int i10 = eVarB.C;
            for (int i11 = 0; i11 < i10; i11++) {
                ((l0) objArr[i11]).f2060h0.f2122p.E0();
            }
        }
    }

    public final void H0() {
        h0 h0Var;
        q0 q0Var = this.F;
        l0.X(q0Var.f2109a, false, 7);
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

    public final void J0() {
        this.f2016f0 = true;
        q0 q0Var = this.F;
        l0 l0VarX = q0Var.f2109a.x();
        float f3 = g().f2096c0;
        l0 l0Var = q0Var.f2109a;
        a1.n nVar = l0Var.f2059g0;
        p1 p1Var = (p1) nVar.E;
        u uVar = (u) nVar.D;
        while (p1Var != uVar) {
            kotlin.jvm.internal.m.c(p1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            b0 b0Var = (b0) p1Var;
            f3 += b0Var.f2096c0;
            p1Var = b0Var.R;
        }
        if (f3 != this.f2015e0) {
            this.f2015e0 = f3;
            if (l0VarX != null) {
                l0VarX.Q();
            }
            if (l0VarX != null) {
                l0VarX.E();
            }
        }
        if (!g().K) {
            boolean z10 = this.S;
            if (!z10 || this.X.d()) {
                C0();
            }
            if (z10) {
                ((u) l0Var.f2059g0.D).K1();
            } else {
                if (l0VarX != null) {
                    l0VarX.E();
                }
                if (this.G && l0VarX != null) {
                    l0VarX.W(false);
                }
            }
        }
        if (l0VarX != null) {
            q0 q0Var2 = l0VarX.f2060h0;
            if (!this.G && q0Var2.f2112d == f0.C) {
                if (this.I != Integer.MAX_VALUE) {
                    y2.a.c("Place was called on a node which was placed already");
                }
                int i10 = q0Var2.f2117i;
                this.I = i10;
                q0Var2.f2117i = i10 + 1;
            }
        } else {
            this.I = 0;
        }
        a0();
    }

    public final void N0(long j9, float f3, u00.k kVar, l2.b bVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        l0 l0Var2 = q0Var.f2109a;
        if (l0Var.f2070r0) {
            y2.a.a("place is called on a deactivated node");
        }
        q0Var.f2112d = f0.C;
        this.M = j9;
        this.P = f3;
        this.N = kVar;
        this.O = bVar;
        this.f2016f0 = false;
        Owner ownerA = p0.a(l0Var2);
        if (this.V || !this.S) {
            this.X.f2078g = false;
            q0Var.f(false);
            this.f2017g0 = kVar;
            this.f2019i0 = j9;
            this.f2020j0 = f3;
            this.f2018h0 = bVar;
            b2 snapshotObserver = ((c3.z) ownerA).getSnapshotObserver();
            snapshotObserver.f2003a.d(l0Var2, snapshotObserver.f2008f, this.f2021k0);
        } else {
            p1 p1VarA = q0Var.a();
            p1VarA.P1(y3.j.d(j9, p1VarA.E), f3, kVar, bVar);
            J0();
        }
        q0Var.f2112d = f0.E;
        if (q0Var.a().K && (q0Var.f2119k || q0Var.f2118j)) {
            requestLayout();
        }
        this.K = true;
    }

    @Override
    public final z2.l1 O(long j9) {
        h0 h0Var;
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        h0 h0Var2 = l0Var.f2056d0;
        h0 h0Var3 = h0.C;
        if (h0Var2 == h0Var3) {
            l0Var.e();
        }
        if (m.s(q0Var.f2109a)) {
            y0 y0Var = q0Var.f2123q;
            kotlin.jvm.internal.m.b(y0Var);
            y0Var.J = h0Var3;
            y0Var.O(j9);
        }
        l0 l0Var2 = q0Var.f2109a;
        l0 l0VarX = l0Var2.x();
        if (l0VarX != null) {
            q0 q0Var2 = l0VarX.f2060h0;
            if (this.L != h0Var3 && !l0Var2.f2058f0) {
                y2.a.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = q0Var2.f2112d.ordinal();
            if (iOrdinal == 0) {
                h0Var = h0.A;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + q0Var2.f2112d);
                }
                h0Var = h0.B;
            }
            this.L = h0Var;
        } else {
            this.L = h0Var3;
        }
        V0(j9);
        return this;
    }

    public final void O0(long j9, float f3, u00.k kVar, l2.b bVar) {
        z2.k1 placementScope;
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        l0 l0Var2 = q0Var.f2109a;
        try {
            this.T = true;
            if (!y3.j.b(j9, this.M) || kVar != this.N || this.f2022l0) {
                if (q0Var.f2119k || q0Var.f2118j || this.f2022l0) {
                    this.V = true;
                    this.f2022l0 = false;
                }
            }
            y0 y0Var = q0Var.f2123q;
            if (y0Var != null) {
                q0 q0Var2 = y0Var.F;
                if (y0Var.Q == w0.C && !m.s(q0Var2.f2109a)) {
                    q0Var2.f2111c = true;
                }
            }
            y0 y0Var2 = q0Var.f2123q;
            if (y0Var2 != null && y0Var2.y0()) {
                p1 p1Var = q0Var.a().S;
                if (p1Var == null || (placementScope = p1Var.L) == null) {
                    placementScope = ((c3.z) p0.a(l0Var2)).getPlacementScope();
                }
                y0 y0Var3 = q0Var.f2123q;
                kotlin.jvm.internal.m.b(y0Var3);
                l0 l0VarX = l0Var2.x();
                if (l0VarX != null) {
                    l0VarX.f2060h0.f2116h = 0;
                }
                y0Var3.I = Integer.MAX_VALUE;
                placementScope.h(y0Var3, (int) (j9 >> 32), (int) (4294967295L & j9), 0.0f);
            }
            y0 y0Var4 = q0Var.f2123q;
            if (y0Var4 != null && !y0Var4.K) {
                y2.a.c("Error: Placement happened before lookahead.");
            }
            N0(j9, f3, kVar, bVar);
        } catch (Throwable th2) {
            l0Var.a0(th2);
            throw null;
        }
    }

    @Override
    public final Object U() {
        return this.R;
    }

    public final boolean V0(long j9) {
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        l0 l0Var2 = q0Var.f2109a;
        try {
            if (l0Var.f2070r0) {
                y2.a.a("measure is called on a deactivated node");
            }
            Owner ownerA = p0.a(l0Var2);
            l0 l0VarX = l0Var2.x();
            boolean z10 = true;
            l0Var2.f2058f0 = l0Var2.f2058f0 || (l0VarX != null && l0VarX.f2058f0);
            if (!l0Var2.r() && y3.a.b(this.D, j9)) {
                ((c3.z) ownerA).j(l0Var2, false);
                l0Var2.Z();
                return false;
            }
            this.X.f2077f = false;
            m1.e eVarB = l0Var2.B();
            Object[] objArr = eVarB.A;
            int i10 = eVarB.C;
            for (int i11 = 0; i11 < i10; i11++) {
                ((l0) objArr[i11]).f2060h0.f2122p.X.f2074c = false;
            }
            this.J = true;
            long j10 = q0Var.a().C;
            x0(j9);
            f0 f0Var = q0Var.f2112d;
            f0 f0Var2 = f0.E;
            if (f0Var != f0Var2) {
                y2.a.c("layout state is not idle before measure starts");
            }
            this.f2012b0 = j9;
            f0 f0Var3 = f0.A;
            q0Var.f2112d = f0Var3;
            this.U = false;
            b2 snapshotObserver = ((c3.z) p0.a(l0Var2)).getSnapshotObserver();
            snapshotObserver.f2003a.d(l0Var2, snapshotObserver.f2005c, this.f2013c0);
            if (q0Var.f2112d == f0Var3) {
                this.V = true;
                this.W = true;
                q0Var.f2112d = f0Var2;
            }
            if (y3.l.b(q0Var.a().C, j10) && q0Var.a().A == this.A && q0Var.a().B == this.B) {
                z10 = false;
            }
            v0((((long) q0Var.a().B) & 4294967295L) | (((long) q0Var.a().A) << 32));
            return z10;
        } catch (Throwable th2) {
            l0Var.a0(th2);
            throw null;
        }
    }

    public final void W0() {
        q0 q0Var = this.F;
        l0 l0Var = q0Var.f2109a;
        l0 l0Var2 = q0Var.f2109a;
        if (!l0Var.K() || q0Var.l <= 0) {
            return;
        }
        q0 q0Var2 = l0Var2.f2060h0;
        if ((q0Var2.f2118j || q0Var2.f2119k) && !q0Var2.f2122p.V) {
            l0Var2.W(false);
        }
        m1.e eVarB = l0Var2.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((l0) objArr[i11]).f2060h0.f2122p.W0();
        }
    }

    @Override
    public final void X(boolean z10) {
        q0 q0Var = this.F;
        if (z10 != q0Var.a().I) {
            q0Var.a().I = z10;
            this.f2022l0 = true;
        }
    }

    @Override
    public final void Y(a aVar) throws Exception {
        m1.e eVarB = this.F.f2109a.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar.invoke(((l0) objArr[i11]).f2060h0.f2122p);
        }
    }

    @Override
    public final m0 a() {
        return this.X;
    }

    @Override
    public final void a0() {
        boolean zV0;
        this.f2011a0 = true;
        m0 m0Var = this.X;
        m0Var.h();
        boolean z10 = this.V;
        q0 q0Var = this.F;
        if (z10) {
            m1.e eVarB = q0Var.f2109a.B();
            Object[] objArr = eVarB.A;
            int i10 = eVarB.C;
            for (int i11 = 0; i11 < i10; i11++) {
                l0 l0Var = (l0) objArr[i11];
                boolean zR = l0Var.r();
                q0 q0Var2 = l0Var.f2060h0;
                if (zR && l0Var.s() == h0.A) {
                    c1 c1Var = q0Var2.f2122p;
                    y3.a aVar = c1Var.J ? new y3.a(c1Var.D) : null;
                    if (aVar != null) {
                        if (l0Var.f2056d0 == h0.C) {
                            l0Var.e();
                        }
                        zV0 = q0Var2.f2122p.V0(aVar.f16587a);
                    } else {
                        zV0 = false;
                    }
                    if (zV0) {
                        l0.X(q0Var.f2109a, false, 7);
                    }
                }
            }
        }
        if (this.W || (!g().K && this.V)) {
            this.V = false;
            f0 f0Var = q0Var.f2112d;
            q0Var.f2112d = f0.C;
            q0Var.g(false);
            l0 l0Var2 = q0Var.f2109a;
            b2 snapshotObserver = ((c3.z) p0.a(l0Var2)).getSnapshotObserver();
            snapshotObserver.f2003a.d(l0Var2, snapshotObserver.f2007e, this.f2014d0);
            q0Var.f2112d = f0Var;
            this.W = false;
        }
        if (m0Var.f2075d) {
            m0Var.f2076e = true;
        }
        if (m0Var.f2073b && m0Var.e()) {
            m0Var.g();
        }
        this.f2011a0 = false;
    }

    @Override
    public final int d(int i10) {
        q0 q0Var = this.F;
        if (!m.s(q0Var.f2109a)) {
            H0();
            return q0Var.a().d(i10);
        }
        y0 y0Var = q0Var.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        return y0Var.d(i10);
    }

    @Override
    public final void e0() {
        l0.X(this.F.f2109a, false, 7);
    }

    @Override
    public final int f0(int i10) {
        q0 q0Var = this.F;
        if (!m.s(q0Var.f2109a)) {
            H0();
            return q0Var.a().f0(i10);
        }
        y0 y0Var = q0Var.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        return y0Var.f0(i10);
    }

    @Override
    public final u g() {
        return (u) this.F.f2109a.f2059g0.D;
    }

    @Override
    public final int i0() {
        return this.F.a().i0();
    }

    @Override
    public final b j() {
        q0 q0Var;
        l0 l0VarX = this.F.f2109a.x();
        if (l0VarX == null || (q0Var = l0VarX.f2060h0) == null) {
            return null;
        }
        return q0Var.f2122p;
    }

    @Override
    public final int j0() {
        return this.F.a().j0();
    }

    @Override
    public final void q0(long j9, float f3, l2.b bVar) {
        O0(j9, f3, null, bVar);
    }

    @Override
    public final void r0(long j9, float f3, u00.k kVar) {
        O0(j9, f3, kVar, null);
    }

    @Override
    public final void requestLayout() {
        this.F.f2109a.W(false);
    }

    @Override
    public final int s(int i10) {
        q0 q0Var = this.F;
        if (!m.s(q0Var.f2109a)) {
            H0();
            return q0Var.a().s(i10);
        }
        y0 y0Var = q0Var.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        return y0Var.s(i10);
    }

    public final List y0() {
        q0 q0Var = this.F;
        q0Var.f2109a.h0();
        boolean z10 = this.Z;
        m1.e eVar = this.Y;
        if (!z10) {
            return eVar.f();
        }
        l0 l0Var = q0Var.f2109a;
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if (eVar.C <= i11) {
                eVar.b(l0Var2.f2060h0.f2122p);
            } else {
                c1 c1Var = l0Var2.f2060h0.f2122p;
                Object[] objArr2 = eVar.A;
                Object obj = objArr2[i11];
                objArr2[i11] = c1Var;
            }
        }
        eVar.l(((m1.e) ((m1.b) l0Var.o()).B).C, eVar.C);
        this.Z = false;
        return eVar.f();
    }

    @Override
    public final int z() {
        return this.I;
    }
}
