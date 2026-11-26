package b3;

import android.os.Trace;
import kotlin.NoWhenBranchMatchedException;

public final class a1 {

    public final l0 f1989a;

    public boolean f1991c;

    public boolean f1992d;

    public y3.a f1997i;

    public final a1.i f1990b = new a1.i(3);

    public final a1.u0 f1993e = new a1.u0(7);

    public final m1.e f1994f = new m1.e(0, new l0[16]);

    public final long f1995g = 1;

    public final m1.e f1996h = new m1.e(0, new z0[16]);

    public a1(l0 l0Var) {
        this.f1989a = l0Var;
    }

    public static final boolean a(a1 a1Var, l0 l0Var, boolean z10) {
        y3.a aVar;
        z2.k1 placementScope;
        u uVar;
        l0 l0VarX;
        l0 l0Var2 = a1Var.f1989a;
        boolean z11 = l0Var.f2070r0;
        q0 q0Var = l0Var.f2060h0;
        boolean zD = false;
        if (!z11 && l(l0Var)) {
            if (l0Var == l0Var2) {
                aVar = a1Var.f1997i;
                kotlin.jvm.internal.m.b(aVar);
            } else {
                aVar = null;
            }
            if (z10) {
                zD = q0Var.f2113e ? d(l0Var, aVar) : false;
                if ((zD || q0Var.f2114f) && kotlin.jvm.internal.m.a(l0Var.L(), Boolean.TRUE)) {
                    l0Var.M();
                }
            } else {
                boolean zE = l0Var.r() ? e(l0Var, aVar) : false;
                if (l0Var.q() && (l0Var == l0Var2 || ((l0VarX = l0Var.x()) != null && l0VarX.K() && q0Var.f2122p.T))) {
                    if (l0Var == l0Var2) {
                        if (l0Var.f2056d0 == h0.C) {
                            l0Var.f();
                        }
                        l0 l0VarX2 = l0Var.x();
                        if (l0VarX2 == null || (uVar = (u) l0VarX2.f2059g0.D) == null || (placementScope = uVar.L) == null) {
                            placementScope = ((c3.z) p0.a(l0Var)).getPlacementScope();
                        }
                        z2.k1.k(placementScope, q0Var.f2122p, 0, 0);
                    } else {
                        l0Var.T();
                    }
                    a1.u0 u0Var = a1Var.f1993e;
                    u0Var.getClass();
                    if (l0Var.f2069q0 > 0) {
                        ((m1.e) u0Var.B).b(l0Var);
                        l0Var.f2068p0 = true;
                    }
                }
                zD = zE;
            }
            a1Var.f();
        }
        return zD;
    }

    public static boolean d(l0 l0Var, y3.a aVar) {
        boolean zV0;
        l0 l0Var2 = l0Var.I;
        q0 q0Var = l0Var.f2060h0;
        if (l0Var2 == null) {
            return false;
        }
        if (aVar == null) {
            y0 y0Var = q0Var.f2123q;
            y3.a aVar2 = y0Var != null ? y0Var.M : null;
            if (aVar2 == null || l0Var2 == null) {
                zV0 = false;
            } else {
                kotlin.jvm.internal.m.b(y0Var);
                zV0 = y0Var.V0(aVar2.f16587a);
            }
        } else if (l0Var2 != null) {
            y0 y0Var2 = q0Var.f2123q;
            kotlin.jvm.internal.m.b(y0Var2);
            zV0 = y0Var2.V0(aVar.f16587a);
        } else {
            zV0 = false;
        }
        l0 l0VarX = l0Var.x();
        if (zV0 && l0VarX != null) {
            if (l0VarX.I == null) {
                l0.X(l0VarX, false, 3);
                return zV0;
            }
            if (l0Var.t() == h0.A) {
                l0.V(l0VarX, false, 3);
                return zV0;
            }
            if (l0Var.t() == h0.B) {
                l0VarX.U(false);
            }
        }
        return zV0;
    }

    public static boolean e(l0 l0Var, y3.a aVar) {
        boolean zV0;
        if (aVar != null) {
            if (l0Var.f2056d0 == h0.C) {
                l0Var.e();
            }
            zV0 = l0Var.f2060h0.f2122p.V0(aVar.f16587a);
        } else {
            c1 c1Var = l0Var.f2060h0.f2122p;
            y3.a aVar2 = c1Var.J ? new y3.a(c1Var.D) : null;
            if (aVar2 != null) {
                if (l0Var.f2056d0 == h0.C) {
                    l0Var.e();
                }
                zV0 = l0Var.f2060h0.f2122p.V0(aVar2.f16587a);
            } else {
                l0Var.getClass();
                zV0 = false;
            }
        }
        l0 l0VarX = l0Var.x();
        if (zV0 && l0VarX != null) {
            if (l0Var.s() == h0.A) {
                l0.X(l0VarX, false, 3);
                return zV0;
            }
            if (l0Var.s() == h0.B) {
                l0VarX.W(false);
            }
        }
        return zV0;
    }

    public static boolean j(l0 l0Var) {
        y0 y0Var;
        m0 m0Var;
        if (l0Var.f2060h0.f2113e) {
            return (l0Var.t() == h0.C && ((y0Var = l0Var.f2060h0.f2123q) == null || (m0Var = y0Var.R) == null || !m0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean k(l0 l0Var) {
        if (!l0Var.r()) {
            return false;
        }
        do {
            if (l0Var.s() == h0.C && !l0Var.f2060h0.f2122p.X.e()) {
                l0 l0VarX = l0Var.x();
                if ((l0VarX != null ? l0VarX.f2060h0.f2112d : null) != f0.A) {
                    return false;
                }
            }
            l0Var = l0Var.x();
            if (l0Var == null) {
                return false;
            }
        } while (!l0Var.K());
        return true;
    }

    public static boolean l(l0 l0Var) {
        y0 y0Var;
        m0 m0Var;
        q0 q0Var = l0Var.f2060h0;
        return l0Var.K() || q0Var.f2122p.T || k(l0Var) || kotlin.jvm.internal.m.a(l0Var.L(), Boolean.TRUE) || j(l0Var) || q0Var.f2122p.X.e() || !((y0Var = q0Var.f2123q) == null || (m0Var = y0Var.R) == null || !m0Var.e());
    }

    public final void b() {
        b2.q qVar;
        m1.e eVar = this.f1994f;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            a1.n nVar = ((l0) objArr[i11]).f2059g0;
            u uVar = (u) nVar.D;
            boolean zG = q1.g(4194304);
            if (zG) {
                qVar = uVar.f2133u0;
            } else {
                qVar = uVar.f2133u0.E;
                if (qVar == null) {
                }
            }
            i2.q0 q0Var = p1.f2089p0;
            for (b2.q qVarB1 = uVar.B1(zG); qVarB1 != null && (qVarB1.D & 4194304) != 0; qVarB1 = qVarB1.F) {
                if ((qVarB1.C & 4194304) != 0) {
                    ?? E = qVarB1;
                    ?? eVar2 = 0;
                    while (E != 0) {
                        if (E instanceof x) {
                            ((x) E).c1((u) nVar.D);
                        } else if ((E.C & 4194304) != 0 && (E instanceof l)) {
                            b2.q qVar2 = ((l) E).P;
                            int i12 = 0;
                            E = E;
                            eVar2 = eVar2;
                            while (qVar2 != null) {
                                if ((qVar2.C & 4194304) != 0) {
                                    i12++;
                                    eVar2 = eVar2;
                                    if (i12 == 1) {
                                        E = qVar2;
                                    } else {
                                        if (eVar2 == 0) {
                                            eVar2 = new m1.e(0, new b2.q[16]);
                                        }
                                        if (E != 0) {
                                            eVar2.b(E);
                                            E = 0;
                                        }
                                        eVar2.b(qVar2);
                                    }
                                }
                                qVar2 = qVar2.F;
                                E = E;
                                eVar2 = eVar2;
                            }
                            if (i12 == 1) {
                            }
                        }
                        E = m.e(eVar2);
                    }
                }
                if (qVarB1 == qVar) {
                    break;
                }
            }
        }
        eVar.g();
    }

    public final void c(boolean z10) {
        a1.u0 u0Var = this.f1993e;
        if (z10) {
            m1.e eVar = (m1.e) u0Var.B;
            l0 l0Var = this.f1989a;
            if (l0Var.f2069q0 > 0) {
                eVar.g();
                eVar.b(l0Var);
                l0Var.f2068p0 = true;
            }
        }
        if (((m1.e) u0Var.B).C != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                u0Var.y();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void f() {
        m1.e eVar = this.f1996h;
        int i10 = eVar.C;
        if (i10 != 0) {
            Object[] objArr = eVar.A;
            for (int i11 = 0; i11 < i10; i11++) {
                z0 z0Var = (z0) objArr[i11];
                l0 l0Var = z0Var.f2146a;
                boolean z10 = z0Var.f2148c;
                l0 l0Var2 = z0Var.f2146a;
                if (l0Var.J()) {
                    if (z0Var.f2147b) {
                        l0.V(l0Var2, z10, 2);
                    } else {
                        l0.X(l0Var2, z10, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void g(l0 l0Var) {
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if (kotlin.jvm.internal.m.a(l0Var2.L(), Boolean.TRUE) && !l0Var2.f2070r0) {
                if (this.f1990b.l(l0Var2)) {
                    l0Var2.M();
                }
                g(l0Var2);
            }
        }
    }

    public final void h(l0 l0Var, boolean z10) {
        if (!this.f1991c) {
            y2.a.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? l0Var.f2060h0.f2113e : l0Var.r()) {
            y2.a.a("node not yet measured");
        }
        i(l0Var, z10);
    }

    public final void i(l0 l0Var, boolean z10) {
        y0 y0Var;
        m0 m0Var;
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if ((!z10 && (l0Var2.s() == h0.A || l0Var2.f2060h0.f2122p.X.e())) || (z10 && (l0Var2.t() == h0.A || ((y0Var = l0Var2.f2060h0.f2123q) != null && (m0Var = y0Var.R) != null && m0Var.e())))) {
                boolean zS = m.s(l0Var2);
                q0 q0Var = l0Var2.f2060h0;
                if (zS && !z10) {
                    if (q0Var.f2113e && this.f1990b.l(l0Var2)) {
                        p(l0Var2, true);
                    } else {
                        h(l0Var2, true);
                    }
                }
                if (z10 ? q0Var.f2113e : l0Var2.r()) {
                    p(l0Var2, z10);
                }
                if (!(z10 ? q0Var.f2113e : l0Var2.r())) {
                    i(l0Var2, z10);
                }
            }
        }
        if (z10 ? l0Var.f2060h0.f2113e : l0Var.r()) {
            p(l0Var, z10);
        }
    }

    public final boolean m(c3.q qVar) {
        boolean z10;
        boolean z11;
        l0 l0Var;
        boolean z12;
        boolean zP;
        a1.i iVar = this.f1990b;
        l0 l0Var2 = this.f1989a;
        if (!l0Var2.J()) {
            y2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!l0Var2.K()) {
            y2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1991c) {
            y2.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z13 = false;
        if (this.f1997i != null) {
            this.f1991c = true;
            this.f1992d = true;
            try {
                boolean zR = iVar.r();
                me.i iVar2 = (me.i) iVar.B;
                if (zR) {
                    z10 = false;
                    while (true) {
                        me.i iVar3 = (me.i) iVar.D;
                        me.i iVar4 = (me.i) iVar.C;
                        if (!((k2) iVar2.B).isEmpty()) {
                            l0Var = (l0) ((k2) iVar2.B).first();
                            iVar2.I(l0Var);
                            z12 = l0Var.I != null;
                            z11 = false;
                        } else if (!((k2) iVar4.B).isEmpty()) {
                            l0Var = (l0) ((k2) iVar4.B).first();
                            iVar4.I(l0Var);
                            z12 = l0Var.I != null;
                            z11 = true;
                        } else {
                            if (((k2) iVar3.B).isEmpty()) {
                                break;
                            }
                            l0 l0Var3 = (l0) ((k2) iVar3.B).first();
                            iVar3.I(l0Var3);
                            z11 = true;
                            l0Var = l0Var3;
                            z12 = false;
                        }
                        if (z11) {
                            zP = a(this, l0Var, z12);
                        } else {
                            zP = p(l0Var, z12);
                            if (l0Var.f2060h0.f2114f) {
                                iVar.a(l0Var, v.B);
                            }
                            if (l0Var.q()) {
                                iVar.a(l0Var, v.D);
                            }
                        }
                        if (l0Var == l0Var2 && zP) {
                            z10 = true;
                        }
                    }
                    if (qVar != null) {
                        qVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f1991c = false;
                this.f1992d = false;
                z13 = z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    this.f1991c = false;
                    this.f1992d = false;
                    throw th3;
                }
            }
        }
        b();
        return z13;
    }

    public final void n(l0 l0Var, long j9) {
        boolean z10 = l0Var.f2070r0;
        q0 q0Var = l0Var.f2060h0;
        if (z10) {
            return;
        }
        l0 l0Var2 = this.f1989a;
        if (l0Var.equals(l0Var2)) {
            y2.a.a("measureAndLayout called on root");
        }
        if (!l0Var2.J()) {
            y2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!l0Var2.K()) {
            y2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f1991c) {
            y2.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f1997i != null) {
            this.f1991c = true;
            this.f1992d = false;
            try {
                a1.i iVar = this.f1990b;
                ((me.i) iVar.B).I(l0Var);
                ((me.i) iVar.C).I(l0Var);
                ((me.i) iVar.D).I(l0Var);
                if (d(l0Var, new y3.a(j9)) || q0Var.f2114f) {
                    if (kotlin.jvm.internal.m.a(l0Var.L(), Boolean.TRUE)) {
                        l0Var.M();
                    }
                }
                g(l0Var);
                if (l0Var.f2056d0 == h0.C) {
                    l0Var.e();
                }
                boolean zV0 = q0Var.f2122p.V0(j9);
                l0 l0VarX = l0Var.x();
                if (zV0 && l0VarX != null) {
                    if (l0Var.s() == h0.A) {
                        l0.X(l0VarX, false, 3);
                    } else if (l0Var.s() == h0.B) {
                        l0VarX.W(false);
                    }
                }
                if (l0Var.q() && l0Var.K()) {
                    l0Var.T();
                    a1.u0 u0Var = this.f1993e;
                    u0Var.getClass();
                    if (l0Var.f2069q0 > 0) {
                        ((m1.e) u0Var.B).b(l0Var);
                        l0Var.f2068p0 = true;
                    }
                }
                f();
                this.f1991c = false;
                this.f1992d = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    this.f1991c = false;
                    this.f1992d = false;
                    throw th3;
                }
            }
        }
        b();
    }

    public final void o() {
        a1.i iVar = this.f1990b;
        if (iVar.r()) {
            l0 l0Var = this.f1989a;
            if (!l0Var.J()) {
                y2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!l0Var.K()) {
                y2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f1991c) {
                y2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f1997i != null) {
                this.f1991c = true;
                this.f1992d = false;
                try {
                    if ((((k2) ((me.i) iVar.D).B).isEmpty() || ((k2) ((me.i) iVar.B).B).isEmpty()) ? false : true) {
                        if (l0Var.I != null) {
                            r(l0Var, true);
                        } else {
                            q(l0Var);
                        }
                    }
                    r(l0Var, false);
                    this.f1991c = false;
                    this.f1992d = false;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        this.f1991c = false;
                        this.f1992d = false;
                        throw th3;
                    }
                }
            }
        }
    }

    public final boolean p(l0 l0Var, boolean z10) {
        y3.a aVar;
        boolean zE = false;
        if (!l0Var.f2070r0 && l(l0Var)) {
            if (l0Var == this.f1989a) {
                aVar = this.f1997i;
                kotlin.jvm.internal.m.b(aVar);
            } else {
                aVar = null;
            }
            if (z10) {
                if (l0Var.f2060h0.f2113e) {
                    zE = d(l0Var, aVar);
                }
            } else if (l0Var.r()) {
                zE = e(l0Var, aVar);
            }
            f();
        }
        return zE;
    }

    public final void q(l0 l0Var) {
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if (l0Var2.s() == h0.A || l0Var2.f2060h0.f2122p.X.e()) {
                if (m.s(l0Var2)) {
                    r(l0Var2, true);
                } else {
                    q(l0Var2);
                }
            }
        }
    }

    public final void r(l0 l0Var, boolean z10) {
        y3.a aVar;
        if (l0Var.f2070r0) {
            return;
        }
        if (l0Var == this.f1989a) {
            aVar = this.f1997i;
            kotlin.jvm.internal.m.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            d(l0Var, aVar);
        } else {
            e(l0Var, aVar);
        }
    }

    public final boolean s(l0 l0Var, boolean z10) {
        int iOrdinal = l0Var.f2060h0.f2112d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f1996h.b(new z0(l0Var, false, z10));
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!l0Var.r() || z10) {
                    l0Var.f2060h0.f2122p.U = true;
                    if (!l0Var.f2070r0 && (l0Var.K() || k(l0Var))) {
                        l0 l0VarX = l0Var.x();
                        if (l0VarX == null || !l0VarX.r()) {
                            this.f1990b.a(l0Var, v.C);
                        }
                        if (!this.f1992d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void t(long j9) throws NoWhenBranchMatchedException {
        y3.a aVar = this.f1997i;
        if (aVar == null ? false : y3.a.b(aVar.f16587a, j9)) {
            return;
        }
        if (this.f1991c) {
            y2.a.a("updateRootConstraints called while measuring");
        }
        this.f1997i = new y3.a(j9);
        l0 l0Var = this.f1989a;
        l0 l0Var2 = l0Var.I;
        q0 q0Var = l0Var.f2060h0;
        if (l0Var2 != null) {
            q0Var.f2113e = true;
        }
        q0Var.f2122p.U = true;
        this.f1990b.a(l0Var, l0Var2 != null ? v.A : v.C);
    }
}
