package b3;

import androidx.compose.ui.node.Owner;
import c3.c3;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class l0 implements l1.f, a2, i {

    public static final e0 f2050s0 = new e0("Undefined intrinsics block and it is required");

    public static final d0 f2051t0 = new d0();

    public static final c0 f2052u0 = new c0(0);
    public final boolean A;
    public int B;
    public boolean C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public l0 I;
    public int J;
    public final l9.f0 K;
    public m1.e L;
    public boolean M;
    public l0 N;
    public Owner O;
    public b4.z P;
    public int Q;
    public boolean R;
    public boolean S;
    public j3.o T;
    public boolean U;
    public final m1.e V;
    public boolean W;
    public z2.w0 X;
    public a1.u0 Y;
    public y3.c Z;

    public y3.m f2053a0;

    public c3 f2054b0;

    public l1.s f2055c0;

    public h0 f2056d0;

    public h0 f2057e0;

    public boolean f2058f0;

    public final a1.n f2059g0;

    public final q0 f2060h0;

    public z2.q0 f2061i0;

    public p1 f2062j0;

    public boolean f2063k0;

    public b2.r f2064l0;

    public b2.r f2065m0;

    public b4.d f2066n0;

    public b4.e f2067o0;

    public boolean f2068p0;

    public int f2069q0;

    public boolean f2070r0;

    public l0(int i10) {
        this(j3.q.f7964a.addAndGet(1), (i10 & 1) == 0);
    }

    public l0(int i10, boolean z10) {
        this.A = z10;
        this.B = i10;
        this.D = 9223372034707292159L;
        this.E = true;
        this.F = true;
        this.K = new l9.f0(new m1.e(0, new l0[16]), new j0(this, 0), 6);
        this.V = new m1.e(0, new l0[16]);
        this.W = true;
        this.X = f2050s0;
        this.Z = p0.f2088a;
        this.f2053a0 = y3.m.A;
        this.f2054b0 = f2051t0;
        l1.s.f9926o.getClass();
        this.f2055c0 = l1.r.f9917b;
        h0 h0Var = h0.C;
        this.f2056d0 = h0Var;
        this.f2057e0 = h0Var;
        this.f2059g0 = new a1.n(this);
        this.f2060h0 = new q0(this);
        this.f2063k0 = true;
        this.f2064l0 = b2.o.A;
    }

    public static void V(l0 l0Var, boolean z10, int i10) {
        l0 l0VarX;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (l0Var.I == null) {
            y2.a.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = l0Var.O;
        if (owner == null || l0Var.R || l0Var.A) {
            return;
        }
        ((c3.z) owner).z(l0Var, true, z10, z11);
        if (z12) {
            y0 y0Var = l0Var.f2060h0.f2123q;
            kotlin.jvm.internal.m.b(y0Var);
            q0 q0Var = y0Var.F;
            l0 l0VarX2 = q0Var.f2109a.x();
            h0 h0Var = q0Var.f2109a.f2056d0;
            if (l0VarX2 == null || h0Var == h0.C) {
                return;
            }
            while (l0VarX2.f2056d0 == h0Var && (l0VarX = l0VarX2.x()) != null) {
                l0VarX2 = l0VarX;
            }
            int iOrdinal = h0Var.ordinal();
            if (iOrdinal == 0) {
                if (l0VarX2.I != null) {
                    V(l0VarX2, z10, 6);
                    return;
                } else {
                    X(l0VarX2, z10, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (l0VarX2.I != null) {
                l0VarX2.U(z10);
            } else {
                l0VarX2.W(z10);
            }
        }
    }

    public static void X(l0 l0Var, boolean z10, int i10) {
        Owner owner;
        l0 l0VarX;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (l0Var.R || l0Var.A || (owner = l0Var.O) == null) {
            return;
        }
        ((c3.z) owner).z(l0Var, false, z10, z11);
        if (z12) {
            q0 q0Var = l0Var.f2060h0.f2122p.F;
            l0 l0VarX2 = q0Var.f2109a.x();
            h0 h0Var = q0Var.f2109a.f2056d0;
            if (l0VarX2 == null || h0Var == h0.C) {
                return;
            }
            while (l0VarX2.f2056d0 == h0Var && (l0VarX = l0VarX2.x()) != null) {
                l0VarX2 = l0VarX;
            }
            int iOrdinal = h0Var.ordinal();
            if (iOrdinal == 0) {
                X(l0VarX2, z10, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                l0VarX2.W(z10);
            }
        }
    }

    public static void Y(l0 l0Var) {
        q0 q0Var = l0Var.f2060h0;
        if (i0.f2043a[q0Var.f2112d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + q0Var.f2112d);
        }
        if (q0Var.f2113e) {
            V(l0Var, true, 6);
            return;
        }
        if (q0Var.f2114f) {
            l0Var.U(true);
        }
        if (l0Var.r()) {
            X(l0Var, true, 6);
        } else if (l0Var.q()) {
            l0Var.W(true);
        }
    }

    private final String k(l0 l0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(l0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        l0 l0Var2 = l0Var.N;
        sb2.append(l0Var2 != null ? l0Var2.g(0) : null);
        return sb2.toString();
    }

    public final m1.e A() {
        boolean z10 = this.W;
        m1.e eVar = this.V;
        if (z10) {
            eVar.g();
            eVar.d(eVar.C, B());
            eVar.n(f2052u0);
            this.W = false;
        }
        return eVar;
    }

    public final m1.e B() {
        h0();
        if (this.J == 0) {
            return (m1.e) this.K.B;
        }
        m1.e eVar = this.L;
        kotlin.jvm.internal.m.b(eVar);
        return eVar;
    }

    public final void C(long j9, s sVar, int i10, boolean z10) {
        a1.n nVar = this.f2059g0;
        p1 p1Var = (p1) nVar.E;
        i2.q0 q0Var = p1.f2089p0;
        ((p1) nVar.E).E1(p1.f2092s0, p1Var.w1(true, j9), sVar, i10, z10);
    }

    public final void D(int i10, l0 l0Var) {
        if (l0Var.N != null && l0Var.O != null) {
            y2.a.c(k(l0Var));
        }
        l0Var.N = this;
        l9.f0 f0Var = this.K;
        ((m1.e) f0Var.B).a(i10, l0Var);
        ((j0) f0Var.C).invoke();
        Q();
        if (l0Var.A) {
            this.J++;
        }
        I();
        Owner owner = this.O;
        if (owner != null) {
            l0Var.d(owner);
        }
        if (l0Var.f2060h0.l > 0) {
            q0 q0Var = this.f2060h0;
            q0Var.d(q0Var.l + 1);
        }
        if (l0Var.f2069q0 > 0) {
            c0(this.f2069q0 + 1);
        }
    }

    public final void E() {
        if (this.f2063k0) {
            a1.n nVar = this.f2059g0;
            p1 p1Var = (u) nVar.D;
            p1 p1Var2 = ((p1) nVar.E).S;
            this.f2062j0 = null;
            while (!kotlin.jvm.internal.m.a(p1Var, p1Var2)) {
                if ((p1Var != null ? p1Var.f2107n0 : null) != null) {
                    this.f2062j0 = p1Var;
                    break;
                }
                p1Var = p1Var != null ? p1Var.S : null;
            }
            this.f2063k0 = false;
        }
        p1 p1Var3 = this.f2062j0;
        if (p1Var3 != null && p1Var3.f2107n0 == null) {
            throw a1.b.u("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (p1Var3 != null) {
            p1Var3.G1();
            return;
        }
        l0 l0VarX = x();
        if (l0VarX != null) {
            l0VarX.E();
            return;
        }
        Owner owner = this.O;
        if (owner != null) {
            ((c3.z) owner).invalidate();
        }
    }

    public final void F() {
        a1.n nVar = this.f2059g0;
        p1 p1Var = (p1) nVar.E;
        u uVar = (u) nVar.D;
        while (p1Var != uVar) {
            kotlin.jvm.internal.m.c(p1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            b0 b0Var = (b0) p1Var;
            z1 z1Var = b0Var.f2107n0;
            if (z1Var != null) {
                ((c3.v1) z1Var).invalidate();
            }
            p1Var = b0Var.R;
        }
        z1 z1Var2 = ((u) nVar.D).f2107n0;
        if (z1Var2 != null) {
            ((c3.v1) z1Var2).invalidate();
        }
    }

    public final void G() {
        if (this.A) {
            l0 l0VarX = x();
            if (l0VarX != null) {
                l0VarX.G();
                return;
            }
            return;
        }
        if (this.I != null) {
            V(this, false, 7);
        } else {
            X(this, false, 7);
        }
    }

    public final void H() {
        if (this.U) {
            return;
        }
        if (((h1) this.f2059g0.C).F != null || this.f2065m0 != null) {
            this.S = true;
            return;
        }
        j3.o oVar = this.T;
        this.U = true;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        zVar.A = new j3.o();
        b2 snapshotObserver = ((c3.z) p0.a(this)).getSnapshotObserver();
        k0 k0Var = new k0(this, zVar, 0);
        snapshotObserver.f2003a.d(this, snapshotObserver.f2006d, k0Var);
        this.U = false;
        this.T = (j3.o) zVar.A;
        this.S = false;
        c3.z zVar2 = (c3.z) p0.a(this);
        zVar2.getSemanticsOwner().b(this, oVar);
        zVar2.B();
    }

    public final void I() {
        l0 l0Var;
        if (this.J > 0) {
            this.M = true;
        }
        if (!this.A || (l0Var = this.N) == null) {
            return;
        }
        l0Var.I();
    }

    public final boolean J() {
        return this.O != null;
    }

    public final boolean K() {
        return this.f2060h0.f2122p.S;
    }

    public final Boolean L() {
        y0 y0Var = this.f2060h0.f2123q;
        if (y0Var != null) {
            return Boolean.valueOf(y0Var.Q != w0.C);
        }
        return null;
    }

    public final void M() {
        l0 l0VarX;
        if (this.f2056d0 == h0.C) {
            f();
        }
        y0 y0Var = this.f2060h0.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        boolean z10 = true;
        try {
            y0Var.G = true;
            if (!y0Var.K) {
                y2.a.c("replace() called on item that was not placed");
            }
            y0Var.f2145b0 = false;
            if (y0Var.Q == w0.C) {
                z10 = false;
            }
            y0Var.O0(y0Var.N, y0Var.P, y0Var.O);
            if (z10 && !y0Var.f2145b0 && (l0VarX = y0Var.F.f2109a.x()) != null) {
                l0VarX.U(false);
            }
        } finally {
            y0Var.G = false;
        }
    }

    public final void N(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            l9.f0 f0Var = this.K;
            m1.e eVar = (m1.e) f0Var.B;
            j0 j0Var = (j0) f0Var.C;
            Object objK = eVar.k(i14);
            j0Var.invoke();
            ((m1.e) f0Var.B).a(i15, (l0) objK);
            j0Var.invoke();
        }
        Q();
        I();
        G();
    }

    public final void O(l0 l0Var) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (l0Var.f2060h0.l > 0) {
            q0 q0Var = this.f2060h0;
            q0Var.d(q0Var.l - 1);
        }
        if (this.O != null) {
            l0Var.h();
        }
        l0Var.N = null;
        if (l0Var.f2069q0 > 0) {
            c0(this.f2069q0 - 1);
        }
        ((p1) l0Var.f2059g0.E).S = null;
        if (l0Var.A) {
            this.J--;
            m1.e eVar = (m1.e) l0Var.K.B;
            Object[] objArr = eVar.A;
            int i10 = eVar.C;
            for (int i11 = 0; i11 < i10; i11++) {
                ((p1) ((l0) objArr[i11]).f2059g0.E).S = null;
            }
        }
        I();
        Q();
    }

    public final void P(p1 p1Var) {
        Owner owner = this.O;
        k3.b rectManager = owner != null ? ((c3.z) owner).getRectManager() : null;
        q0 q0Var = this.f2060h0;
        boolean z10 = q0Var.f2112d != f0.E || r() || q();
        if (this.G && rectManager != null) {
            if (p1Var == ((p1) this.f2059g0.E)) {
                this.F = true;
                if (!z10) {
                    rectManager.e(this);
                }
            } else {
                this.E = true;
                m1.e eVarB = B();
                Object[] objArr = eVarB.A;
                int i10 = eVarB.C;
                for (int i11 = 0; i11 < i10; i11++) {
                    l0 l0Var = (l0) objArr[i11];
                    l0Var.F = true;
                    if (!z10) {
                        rectManager.e(l0Var);
                    }
                }
                if (this.G) {
                    rectManager.f8935e = true;
                    c50.h hVar = rectManager.f8932b;
                    int i12 = this.B & 33554431;
                    long[] jArr = (long[]) hVar.C;
                    int i13 = hVar.B;
                    for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
                        int i15 = i14 + 2;
                        long j9 = jArr[i15];
                        if ((((int) j9) & 33554431) == i12) {
                            jArr[i15] = (((j9 >> 63) & 1) << 60) | j9;
                            break;
                        }
                    }
                }
                rectManager.h();
            }
        }
        q0Var.f2122p.W0();
    }

    public final void Q() {
        if (!this.A) {
            this.W = true;
            return;
        }
        l0 l0VarX = x();
        if (l0VarX != null) {
            l0VarX.Q();
        }
    }

    public final void R() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        l9.f0 f0Var = this.K;
        m1.e eVar = (m1.e) f0Var.B;
        m1.e eVar2 = (m1.e) f0Var.B;
        int i10 = eVar.C;
        while (true) {
            i10--;
            if (-1 >= i10) {
                eVar2.g();
                ((j0) f0Var.C).invoke();
                return;
            }
            O((l0) eVar2.A[i10]);
        }
    }

    public final void S(int i10, int i11) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (i11 < 0) {
            y2.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            l9.f0 f0Var = this.K;
            O((l0) ((m1.e) f0Var.B).A[i12]);
            Object objK = ((m1.e) f0Var.B).k(i12);
            ((j0) f0Var.C).invoke();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final void T() {
        l0 l0VarX;
        if (this.f2056d0 == h0.C) {
            f();
        }
        c1 c1Var = this.f2060h0.f2122p;
        q0 q0Var = c1Var.F;
        try {
            c1Var.G = true;
            if (!c1Var.K) {
                y2.a.c("replace called on unplaced item");
            }
            boolean z10 = c1Var.S;
            c1Var.N0(c1Var.M, c1Var.P, c1Var.N, c1Var.O);
            if (z10 && !c1Var.f2016f0 && (l0VarX = q0Var.f2109a.x()) != null) {
                l0VarX.W(false);
            }
            c1Var.G = false;
        } catch (Throwable th2) {
            try {
                q0Var.f2109a.a0(th2);
                throw null;
            } catch (Throwable th3) {
                c1Var.G = false;
                throw th3;
            }
        }
    }

    public final void U(boolean z10) {
        Owner owner;
        if (this.A || (owner = this.O) == null) {
            return;
        }
        ((c3.z) owner).A(this, true, z10);
    }

    public final void W(boolean z10) {
        Owner owner;
        if (this.A || (owner = this.O) == null) {
            return;
        }
        ((c3.z) owner).A(this, false, z10);
    }

    public final void Z() {
        m1.e eVarB = B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var = (l0) objArr[i11];
            h0 h0Var = l0Var.f2057e0;
            l0Var.f2056d0 = h0Var;
            if (h0Var != h0.C) {
                l0Var.Z();
            }
        }
    }

    @Override
    public final void a() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        b4.z zVar = this.P;
        if (zVar != null) {
            zVar.a();
        }
        z2.q0 q0Var = this.f2061i0;
        if (q0Var != null) {
            q0Var.a();
        }
        a1.n nVar = this.f2059g0;
        p1 p1Var = ((u) nVar.D).R;
        for (p1 p1Var2 = (p1) nVar.E; !kotlin.jvm.internal.m.a(p1Var2, p1Var) && p1Var2 != null; p1Var2 = p1Var2.R) {
            p1Var2.L1();
        }
    }

    public final void a0(Throwable th2) {
        l1.s sVar = this.f2055c0;
        l1.q2 q2Var = a2.g.f160a;
        v1.h hVar = (v1.h) sVar;
        hVar.getClass();
        a2.e eVar = (a2.e) l1.q.D(hVar, q2Var);
        if (eVar == null) {
            throw th2;
        }
        ab.a0.H0(th2, new a1.o1(eVar, this, 3));
        throw th2;
    }

    @Override
    public final void b() {
        c2.c cVar;
        b4.z zVar = this.P;
        if (zVar != null) {
            zVar.b();
        }
        z2.q0 q0Var = this.f2061i0;
        if (q0Var != null) {
            q0Var.j(true);
        }
        this.f2070r0 = true;
        b2.q qVar = (l2) this.f2059g0.F;
        for (b2.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.E) {
            if (qVar2.N) {
                qVar2.w1();
            }
        }
        for (b2.q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.E) {
            if (qVar3.N) {
                qVar3.y1();
            }
        }
        while (qVar != null) {
            if (qVar.N) {
                qVar.s1();
            }
            qVar = qVar.E;
        }
        if (J()) {
            this.T = null;
            this.S = false;
        }
        Owner owner = this.O;
        if (owner == null || (cVar = ((c3.z) owner).f2811q0) == null || !cVar.H.g(this.B)) {
            return;
        }
        cVar.A.G(cVar.C, this.B, false);
    }

    public final void b0(y3.c cVar) {
        if (kotlin.jvm.internal.m.a(this.Z, cVar)) {
            return;
        }
        this.Z = cVar;
        G();
        l0 l0VarX = x();
        if (l0VarX != null) {
            l0VarX.E();
        } else {
            Owner owner = this.O;
            if (owner != null) {
                ((c3.z) owner).invalidate();
            }
        }
        F();
        for (b2.q qVar = (b2.q) this.f2059g0.G; qVar != null; qVar = qVar.F) {
            qVar.h();
        }
    }

    public final void c(b2.r r20) {
        throw new UnsupportedOperationException("Method not decompiled: b3.l0.c(b2.r):void");
    }

    public final void c0(int i10) {
        l0 l0VarX;
        l0 l0VarX2;
        int i11 = this.f2069q0;
        if (i11 != i10) {
            if (i10 > 0 && i11 == 0 && (l0VarX2 = x()) != null) {
                l0VarX2.c0(l0VarX2.f2069q0 + 1);
            }
            if (i10 == 0 && this.f2069q0 > 0 && (l0VarX = x()) != null) {
                l0VarX.c0(l0VarX.f2069q0 - 1);
            }
            this.f2069q0 = i10;
        }
    }

    public final void d(Owner owner) {
        l0 l0Var;
        j3.o oVarZ;
        if (this.O != null) {
            y2.a.c("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        l0 l0Var2 = this.N;
        if (l0Var2 != null && !kotlin.jvm.internal.m.a(l0Var2.O, owner)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(owner);
            sb2.append(") than the parent's owner(");
            l0 l0VarX = x();
            sb2.append(l0VarX != null ? l0VarX.O : null);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            l0 l0Var3 = this.N;
            sb2.append(l0Var3 != null ? l0Var3.g(0) : null);
            y2.a.c(sb2.toString());
        }
        l0 l0VarX2 = x();
        q0 q0Var = this.f2060h0;
        if (l0VarX2 == null) {
            q0Var.f2122p.S = true;
            ((c3.z) owner).getRectManager().e(this);
            y0 y0Var = q0Var.f2123q;
            if (y0Var != null) {
                y0Var.Q = w0.A;
            }
        }
        a1.n nVar = this.f2059g0;
        ((p1) nVar.E).S = l0VarX2 != null ? (u) l0VarX2.f2059g0.D : null;
        this.O = owner;
        this.Q = (l0VarX2 != null ? l0VarX2.Q : -1) + 1;
        b2.r rVar = this.f2065m0;
        if (rVar != null) {
            c(rVar);
        }
        this.f2065m0 = null;
        c3.z zVar = (c3.z) owner;
        zVar.getLayoutNodes().i(this.B, this);
        if (this.H) {
            d0(this);
        } else {
            l0 l0Var4 = this.N;
            if (l0Var4 == null || (l0Var = l0Var4.I) == null) {
                l0Var = this.I;
            }
            d0(l0Var);
            if (this.I == null && nVar.j(512)) {
                d0(this);
            }
        }
        if (!this.f2070r0) {
            for (b2.q qVar = (b2.q) nVar.G; qVar != null; qVar = qVar.F) {
                qVar.r1();
            }
        }
        m1.e eVar = (m1.e) this.K.B;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((l0) objArr[i11]).d(owner);
        }
        if (!this.f2070r0) {
            nVar.k();
        }
        G();
        if (l0VarX2 != null) {
            l0VarX2.G();
        }
        b4.d dVar = this.f2066n0;
        if (dVar != null) {
            dVar.invoke(owner);
        }
        q0Var.j();
        if (!this.f2070r0 && nVar.j(8)) {
            H();
        }
        c2.c cVar = zVar.f2811q0;
        if (cVar == null || (oVarZ = z()) == null || !oVarZ.A.b(j3.w.f7993r)) {
            return;
        }
        cVar.H.a(this.B);
        cVar.A.G(cVar.C, this.B, true);
    }

    public final void d0(l0 l0Var) {
        if (kotlin.jvm.internal.m.a(l0Var, this.I)) {
            return;
        }
        this.I = l0Var;
        q0 q0Var = this.f2060h0;
        if (l0Var != null) {
            if (q0Var.f2123q == null) {
                q0Var.f2123q = new y0(q0Var);
            }
            a1.n nVar = this.f2059g0;
            p1 p1Var = ((u) nVar.D).R;
            for (p1 p1Var2 = (p1) nVar.E; !kotlin.jvm.internal.m.a(p1Var2, p1Var) && p1Var2 != null; p1Var2 = p1Var2.R) {
                p1Var2.u1();
            }
        } else {
            q0Var.f2123q = null;
            q0Var.f2114f = false;
            q0Var.f2113e = false;
        }
        G();
    }

    public final void e() {
        this.f2057e0 = this.f2056d0;
        this.f2056d0 = h0.C;
        m1.e eVarB = B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var = (l0) objArr[i11];
            if (l0Var.f2056d0 != h0.C) {
                l0Var.e();
            }
        }
    }

    public final void e0(z2.w0 w0Var) {
        if (kotlin.jvm.internal.m.a(this.X, w0Var)) {
            return;
        }
        this.X = w0Var;
        a1.u0 u0Var = this.Y;
        if (u0Var != null) {
            ((l1.i1) u0Var.C).setValue(w0Var);
        }
        G();
    }

    public final void f() {
        this.f2057e0 = this.f2056d0;
        this.f2056d0 = h0.C;
        m1.e eVarB = B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var = (l0) objArr[i11];
            if (l0Var.f2056d0 == h0.B) {
                l0Var.f();
            }
        }
    }

    public final void f0(b2.r rVar) {
        if (this.A && this.f2064l0 != b2.o.A) {
            y2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f2070r0) {
            y2.a.a("modifier is updated when deactivated");
        }
        if (!J()) {
            this.f2065m0 = rVar;
            return;
        }
        c(rVar);
        if (this.S) {
            H();
        }
    }

    public final String g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        m1.e eVarB = B();
        Object[] objArr = eVarB.A;
        int i12 = eVarB.C;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(((l0) objArr[i13]).g(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void g0(c3 c3Var) {
        if (kotlin.jvm.internal.m.a(this.f2054b0, c3Var)) {
            return;
        }
        this.f2054b0 = c3Var;
        b2.q qVar = (b2.q) this.f2059g0.G;
        if ((qVar.D & 16) != 0) {
            while (qVar != null) {
                if ((qVar.C & 16) != 0) {
                    ?? E = qVar;
                    ?? eVar = 0;
                    while (E != 0) {
                        if (E instanceof e2) {
                            ((e2) E).e1();
                        } else if ((E.C & 16) != 0 && (E instanceof l)) {
                            b2.q qVar2 = ((l) E).P;
                            int i10 = 0;
                            E = E;
                            eVar = eVar;
                            while (qVar2 != null) {
                                if ((qVar2.C & 16) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        E = qVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new m1.e(0, new b2.q[16]);
                                        }
                                        if (E != 0) {
                                            eVar.b(E);
                                            E = 0;
                                        }
                                        eVar.b(qVar2);
                                    }
                                }
                                qVar2 = qVar2.F;
                                E = E;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        E = m.e(eVar);
                    }
                }
                if ((qVar.D & 16) == 0) {
                    return;
                } else {
                    qVar = qVar.F;
                }
            }
        }
    }

    public final void h() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        m0 m0Var;
        Owner owner = this.O;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            l0 l0VarX = x();
            sb2.append(l0VarX != null ? l0VarX.g(0) : null);
            y2.a.d(sb2.toString());
            throw new KotlinNothingValueException();
        }
        l0 l0VarX2 = x();
        q0 q0Var = this.f2060h0;
        if (l0VarX2 != null) {
            l0VarX2.E();
            l0VarX2.G();
            c1 c1Var = q0Var.f2122p;
            h0 h0Var = h0.C;
            c1Var.L = h0Var;
            y0 y0Var = q0Var.f2123q;
            if (y0Var != null) {
                y0Var.J = h0Var;
            }
        }
        m0 m0Var2 = q0Var.f2122p.X;
        m0Var2.f2073b = true;
        m0Var2.f2074c = false;
        m0Var2.f2076e = false;
        m0Var2.f2075d = false;
        m0Var2.f2077f = false;
        m0Var2.f2078g = false;
        m0Var2.f2079h = null;
        y0 y0Var2 = q0Var.f2123q;
        if (y0Var2 != null && (m0Var = y0Var2.R) != null) {
            m0Var.f2073b = true;
            m0Var.f2074c = false;
            m0Var.f2076e = false;
            m0Var.f2075d = false;
            m0Var.f2077f = false;
            m0Var.f2078g = false;
            m0Var.f2079h = null;
        }
        a1.n nVar = this.f2059g0;
        b2.q qVar = (l2) nVar.F;
        p1 p1Var = ((u) nVar.D).R;
        for (p1 p1Var2 = (p1) nVar.E; !kotlin.jvm.internal.m.a(p1Var2, p1Var) && p1Var2 != null; p1Var2 = p1Var2.R) {
            p1Var2.R1();
            if (p1Var2.O.K()) {
                p1Var2.M1();
            }
        }
        b4.e eVar = this.f2067o0;
        if (eVar != null) {
            eVar.invoke(owner);
        }
        for (b2.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.E) {
            if (qVar2.N) {
                qVar2.y1();
            }
        }
        this.R = true;
        m1.e eVar2 = (m1.e) this.K.B;
        Object[] objArr = eVar2.A;
        int i10 = eVar2.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((l0) objArr[i11]).h();
        }
        this.R = false;
        while (qVar != null) {
            if (qVar.N) {
                qVar.s1();
            }
            qVar = qVar.E;
        }
        c3.z zVar = (c3.z) owner;
        zVar.getLayoutNodes().g(this.B);
        a1 a1Var = zVar.f2819y0;
        a1.i iVar = a1Var.f1990b;
        ((me.i) iVar.B).I(this);
        ((me.i) iVar.C).I(this);
        ((me.i) iVar.D).I(this);
        ((m1.e) a1Var.f1993e.B).j(this);
        zVar.f2812r0 = true;
        c2.c cVar = zVar.f2811q0;
        if (cVar != null && cVar.H.g(this.B)) {
            cVar.A.G(cVar.C, this.B, false);
        }
        zVar.getRectManager().f(this);
        this.O = null;
        d0(null);
        this.Q = 0;
        c1 c1Var2 = q0Var.f2122p;
        c1Var2.I = Integer.MAX_VALUE;
        c1Var2.H = Integer.MAX_VALUE;
        c1Var2.S = false;
        y0 y0Var3 = q0Var.f2123q;
        if (y0Var3 != null) {
            y0Var3.I = Integer.MAX_VALUE;
            y0Var3.H = Integer.MAX_VALUE;
            y0Var3.Q = w0.C;
        }
        if (nVar.j(8)) {
            j3.o oVar = this.T;
            this.T = null;
            this.S = false;
            zVar.getSemanticsOwner().b(this, oVar);
            zVar.B();
        }
    }

    public final void h0() {
        if (this.J <= 0 || !this.M) {
            return;
        }
        this.M = false;
        m1.e eVar = this.L;
        if (eVar == null) {
            eVar = new m1.e(0, new l0[16]);
            this.L = eVar;
        }
        eVar.g();
        m1.e eVar2 = (m1.e) this.K.B;
        Object[] objArr = eVar2.A;
        int i10 = eVar2.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var = (l0) objArr[i11];
            if (l0Var.A) {
                eVar.d(eVar.C, l0Var.B());
            } else {
                eVar.b(l0Var);
            }
        }
        q0 q0Var = this.f2060h0;
        q0Var.f2122p.Z = true;
        y0 y0Var = q0Var.f2123q;
        if (y0Var != null) {
            y0Var.T = true;
        }
    }

    @Override
    public final void i() {
        k3.b rectManager;
        c2.c cVar;
        k3.b rectManager2;
        if (!J()) {
            y2.a.a("onReuse is only expected on attached node");
        }
        b4.z zVar = this.P;
        if (zVar != null) {
            zVar.i();
        }
        z2.q0 q0Var = this.f2061i0;
        if (q0Var != null) {
            q0Var.j(false);
        }
        this.U = false;
        boolean z10 = this.f2070r0;
        a1.n nVar = this.f2059g0;
        if (z10) {
            this.f2070r0 = false;
        } else {
            b2.q qVar = (l2) nVar.F;
            for (b2.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.E) {
                if (qVar2.N) {
                    qVar2.w1();
                }
            }
            for (b2.q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.E) {
                if (qVar3.N) {
                    qVar3.y1();
                }
            }
            while (qVar != null) {
                if (qVar.N) {
                    qVar.s1();
                }
                qVar = qVar.E;
            }
        }
        int i10 = this.B;
        Owner owner = this.O;
        if (owner != null && (rectManager2 = ((c3.z) owner).getRectManager()) != null) {
            rectManager2.f(this);
        }
        this.B = j3.q.f7964a.addAndGet(1);
        Owner owner2 = this.O;
        if (owner2 != null) {
            c3.z zVar2 = (c3.z) owner2;
            zVar2.getLayoutNodes().g(i10);
            zVar2.getLayoutNodes().i(this.B, this);
        }
        for (b2.q qVar4 = (b2.q) nVar.G; qVar4 != null; qVar4 = qVar4.F) {
            qVar4.r1();
        }
        nVar.k();
        if (nVar.j(8)) {
            H();
        }
        Y(this);
        Owner owner3 = this.O;
        if (owner3 != null && (cVar = ((c3.z) owner3).f2811q0) != null) {
            c3.z zVar3 = cVar.C;
            me.i iVar = cVar.A;
            u.x xVar = cVar.H;
            if (xVar.g(i10)) {
                iVar.G(zVar3, i10, false);
            }
            j3.o oVarZ = z();
            if (oVarZ != null && oVarZ.A.b(j3.w.f7993r)) {
                xVar.a(this.B);
                iVar.G(zVar3, this.B, true);
            }
        }
        Owner owner4 = this.O;
        if (owner4 == null || (rectManager = ((c3.z) owner4).getRectManager()) == null) {
            return;
        }
        rectManager.e(this);
    }

    public final void j(i2.s sVar, l2.b bVar) {
        try {
            ((p1) this.f2059g0.E).s1(sVar, bVar);
        } catch (Throwable th2) {
            a0(th2);
            throw null;
        }
    }

    public final void l() {
        if (this.I != null) {
            V(this, false, 5);
        } else {
            X(this, false, 5);
        }
        c1 c1Var = this.f2060h0.f2122p;
        y3.a aVar = c1Var.J ? new y3.a(c1Var.D) : null;
        if (aVar != null) {
            Owner owner = this.O;
            if (owner != null) {
                ((c3.z) owner).u(this, aVar.f16587a);
                return;
            }
            return;
        }
        Owner owner2 = this.O;
        if (owner2 != null) {
            ((c3.z) owner2).t(true);
        }
    }

    public final List m() {
        y0 y0Var = this.f2060h0.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        m1.e eVar = y0Var.S;
        q0 q0Var = y0Var.F;
        q0Var.f2109a.o();
        if (!y0Var.T) {
            return eVar.f();
        }
        l0 l0Var = q0Var.f2109a;
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if (eVar.C <= i11) {
                y0 y0Var2 = l0Var2.f2060h0.f2123q;
                kotlin.jvm.internal.m.b(y0Var2);
                eVar.b(y0Var2);
            } else {
                y0 y0Var3 = l0Var2.f2060h0.f2123q;
                kotlin.jvm.internal.m.b(y0Var3);
                Object[] objArr2 = eVar.A;
                Object obj = objArr2[i11];
                objArr2[i11] = y0Var3;
            }
        }
        eVar.l(((m1.e) ((m1.b) l0Var.o()).B).C, eVar.C);
        y0Var.T = false;
        return eVar.f();
    }

    public final List n() {
        return this.f2060h0.f2122p.y0();
    }

    public final List o() {
        return B().f();
    }

    public final List p() {
        return ((m1.e) this.K.B).f();
    }

    public final boolean q() {
        return this.f2060h0.f2122p.V;
    }

    public final boolean r() {
        return this.f2060h0.f2122p.U;
    }

    public final h0 s() {
        return this.f2060h0.f2122p.L;
    }

    public final h0 t() {
        h0 h0Var;
        y0 y0Var = this.f2060h0.f2123q;
        return (y0Var == null || (h0Var = y0Var.J) == null) ? h0.C : h0Var;
    }

    public final String toString() {
        return c3.m0.w(this) + " children: " + ((m1.e) ((m1.b) o()).B).C + " measurePolicy: " + this.X + " deactivated: " + this.f2070r0;
    }

    @Override
    public final boolean u() {
        return J();
    }

    public final List v() {
        a1.n nVar = this.f2059g0;
        m1.e eVar = (m1.e) nVar.H;
        if (eVar == null) {
            return h00.x.A;
        }
        int i10 = 0;
        m1.e eVar2 = new m1.e(0, new z2.b1[eVar.C]);
        b2.q qVar = (b2.q) nVar.G;
        while (qVar != null) {
            l2 l2Var = (l2) nVar.F;
            if (qVar == l2Var) {
                break;
            }
            p1 p1Var = qVar.H;
            if (p1Var == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            z1 z1Var = p1Var.f2107n0;
            z1 z1Var2 = ((u) nVar.D).f2107n0;
            b2.q qVar2 = qVar.F;
            if (qVar2 != l2Var || p1Var == qVar2.H) {
                z1Var2 = null;
            }
            if (z1Var == null) {
                z1Var = z1Var2;
            }
            eVar2.b(new z2.b1((b2.r) eVar.A[i10], p1Var, z1Var));
            qVar = qVar.F;
            i10++;
        }
        return eVar2.f();
    }

    public final a1.u0 w() {
        a1.u0 u0Var = this.Y;
        if (u0Var != null) {
            return u0Var;
        }
        a1.u0 u0Var2 = new a1.u0(this, this.X);
        this.Y = u0Var2;
        return u0Var2;
    }

    public final l0 x() {
        l0 l0Var = this.N;
        while (l0Var != null && l0Var.A) {
            l0Var = l0Var.N;
        }
        return l0Var;
    }

    public final int y() {
        return this.f2060h0.f2122p.I;
    }

    public final j3.o z() {
        if (J() && !this.f2070r0 && this.f2059g0.j(8)) {
            return this.T;
        }
        return null;
    }
}
