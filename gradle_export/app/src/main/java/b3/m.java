package b3;

import android.view.View;
import androidx.compose.ui.node.Owner;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public abstract class m {

    public static final x1 f2071a = new x1(1);

    public static final View A(k kVar) {
        if (!((b2.q) kVar).A.N) {
            y2.a.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) p0.a(y(kVar));
    }

    public static final void B(k kVar, Object obj, u00.k kVar2) {
        a1.n nVar;
        boolean z10;
        b2.q qVar = (b2.q) kVar;
        if (!qVar.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar2 = qVar.A.E;
        l0 l0VarY = y(kVar);
        while (l0VarY != null) {
            if ((((b2.q) l0VarY.f2059g0.G).D & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.C & 262144) != 0) {
                        b2.q qVarE = qVar2;
                        m1.e eVar = null;
                        while (qVarE != null) {
                            if (qVarE instanceof o2) {
                                o2 o2Var = (o2) qVarE;
                                if (!(obj.equals(o2Var.o()) ? ((Boolean) kVar2.invoke(o2Var)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                if (((qVarE.C & 262144) != 0) && (qVarE instanceof l)) {
                                    int i10 = 0;
                                    for (b2.q qVar3 = ((l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                        if ((qVar3.C & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVarE = qVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new m1.e(0, new b2.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    eVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                eVar.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            qVarE = e(eVar);
                        }
                    }
                    qVar2 = qVar2.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar2 = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
    }

    public static final void C(o2 o2Var, u00.k kVar) {
        a1.n nVar;
        boolean z10;
        b2.q qVar = (b2.q) o2Var;
        if (!qVar.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar2 = qVar.A.E;
        l0 l0VarY = y(o2Var);
        while (l0VarY != null) {
            if ((((b2.q) l0VarY.f2059g0.G).D & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.C & 262144) != 0) {
                        b2.q qVarE = qVar2;
                        m1.e eVar = null;
                        while (qVarE != null) {
                            if (qVarE instanceof o2) {
                                o2 o2Var2 = (o2) qVarE;
                                if (!((kotlin.jvm.internal.m.a(o2Var.o(), o2Var2.o()) && o2Var.getClass() == o2Var2.getClass()) ? ((Boolean) kVar.invoke(o2Var2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                if (((qVarE.C & 262144) != 0) && (qVarE instanceof l)) {
                                    int i10 = 0;
                                    for (b2.q qVar3 = ((l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                        if ((qVar3.C & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVarE = qVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new m1.e(0, new b2.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    eVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                eVar.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            qVarE = e(eVar);
                        }
                    }
                    qVar2 = qVar2.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar2 = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
    }

    public static final void D(b2.q qVar, String str, u00.k kVar) {
        if (!qVar.A.N) {
            y2.a.c("visitSubtreeIf called on an unattached node");
        }
        m1.e eVar = new m1.e(0, new b2.q[16]);
        b2.q qVar2 = qVar.A;
        b2.q qVar3 = qVar2.F;
        if (qVar3 == null) {
            b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i10 = eVar.C;
            if (i10 == 0) {
                return;
            }
            b2.q qVar4 = (b2.q) eVar.k(i10 - 1);
            if ((qVar4.D & 262144) != 0) {
                b2.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.N) {
                        if ((qVar5.C & 262144) != 0) {
                            ?? E = qVar5;
                            ?? eVar2 = 0;
                            while (E != 0) {
                                if (E instanceof o2) {
                                    o2 o2Var = (o2) E;
                                    n2 n2Var = str.equals(o2Var.o()) ? (n2) kVar.invoke(o2Var) : n2.A;
                                    if (n2Var != n2.C) {
                                        if (n2Var == n2.B) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.C & 262144) != 0 && (E instanceof l)) {
                                    b2.q qVar6 = ((l) E).P;
                                    int i11 = 0;
                                    E = E;
                                    eVar2 = eVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.C & 262144) != 0) {
                                            i11++;
                                            eVar2 = eVar2;
                                            if (i11 == 1) {
                                                E = qVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new m1.e(0, new b2.q[16]);
                                                }
                                                if (E != 0) {
                                                    eVar2.b(E);
                                                    E = 0;
                                                }
                                                eVar2.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.F;
                                        E = E;
                                        eVar2 = eVar2;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                E = e(eVar2);
                            }
                        }
                        qVar5 = qVar5.F;
                    }
                }
            }
            b(eVar, qVar4);
        }
    }

    public static final void E(o2 o2Var, u00.k kVar) {
        b2.q qVar = (b2.q) o2Var;
        if (!qVar.A.N) {
            y2.a.c("visitSubtreeIf called on an unattached node");
        }
        m1.e eVar = new m1.e(0, new b2.q[16]);
        b2.q qVar2 = qVar.A;
        b2.q qVar3 = qVar2.F;
        if (qVar3 == null) {
            b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i10 = eVar.C;
            if (i10 == 0) {
                return;
            }
            b2.q qVar4 = (b2.q) eVar.k(i10 - 1);
            if ((qVar4.D & 262144) != 0) {
                b2.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.N) {
                        if ((qVar5.C & 262144) != 0) {
                            ?? E = qVar5;
                            ?? eVar2 = 0;
                            while (E != 0) {
                                if (E instanceof o2) {
                                    o2 o2Var2 = (o2) E;
                                    n2 n2Var = (kotlin.jvm.internal.m.a(o2Var.o(), o2Var2.o()) && o2Var.getClass() == o2Var2.getClass()) ? (n2) kVar.invoke(o2Var2) : n2.A;
                                    if (n2Var != n2.C) {
                                        if (n2Var == n2.B) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.C & 262144) != 0 && (E instanceof l)) {
                                    b2.q qVar6 = ((l) E).P;
                                    int i11 = 0;
                                    E = E;
                                    eVar2 = eVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.C & 262144) != 0) {
                                            i11++;
                                            eVar2 = eVar2;
                                            if (i11 == 1) {
                                                E = qVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new m1.e(0, new b2.q[16]);
                                                }
                                                if (E != 0) {
                                                    eVar2.b(E);
                                                    E = 0;
                                                }
                                                eVar2.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.F;
                                        E = E;
                                        eVar2 = eVar2;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                E = e(eVar2);
                            }
                        }
                        qVar5 = qVar5.F;
                    }
                }
            }
            b(eVar, qVar4);
        }
    }

    public static final long a(float f3, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32);
    }

    public static final void b(m1.e eVar, b2.q qVar) {
        m1.e eVarB = y(qVar).B();
        int i10 = eVarB.C - 1;
        Object[] objArr = eVarB.A;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                eVar.b((b2.q) ((l0) objArr[i10]).f2059g0.G);
                i10--;
            }
        }
    }

    public static final int c(u0 u0Var, z2.a aVar) {
        u0 u0VarN0 = u0Var.N0();
        if (u0VarN0 == null) {
            y2.a.c("Child of " + u0Var + " cannot be null when calculating alignment line");
        }
        if (u0Var.Z0().a().containsKey(aVar)) {
            Integer num = (Integer) u0Var.Z0().a().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iJ0 = u0VarN0.J0(aVar);
            if (iJ0 != Integer.MIN_VALUE) {
                u0VarN0.J = true;
                u0Var.K = true;
                u0Var.m1();
                u0VarN0.J = false;
                u0Var.K = false;
                return iJ0 + ((int) (aVar instanceof z2.r ? u0VarN0.e1() & 4294967295L : u0VarN0.e1() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final b2.q d(k kVar, int i10) {
        b2.q qVar = ((b2.q) kVar).A.F;
        if (qVar == null || (qVar.D & i10) == 0) {
            return null;
        }
        while (qVar != null) {
            int i11 = qVar.C;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return qVar;
            }
            qVar = qVar.F;
        }
        return null;
    }

    public static final b2.q e(m1.e eVar) {
        int i10;
        if (eVar == null || (i10 = eVar.C) == 0) {
            return null;
        }
        return (b2.q) eVar.k(i10 - 1);
    }

    public static final y f(b2.q qVar) {
        if ((qVar.C & 2) != 0) {
            if (qVar instanceof y) {
                return (y) qVar;
            }
            if (qVar instanceof l) {
                b2.q qVar2 = ((l) qVar).P;
                while (qVar2 != 0) {
                    if (qVar2 instanceof y) {
                        return (y) qVar2;
                    }
                    qVar2 = (!(qVar2 instanceof l) || (qVar2.C & 2) == 0) ? qVar2.F : ((l) qVar2).P;
                }
            }
        }
        return null;
    }

    public static final int g(long j9, long j10) {
        boolean zQ = q(j9);
        if (zQ != q(j10)) {
            return zQ ? -1 : 1;
        }
        int iSignum = (int) Math.signum(l(j9) - l(j10));
        if (Math.min(l(j9), l(j10)) >= 0.0f && p(j9) != p(j10)) {
            return p(j9) ? -1 : 1;
        }
        return iSignum;
    }

    public static final Object h(j jVar, l1.p1 p1Var) {
        if (!((b2.q) jVar).A.N) {
            y2.a.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        v1.h hVar = (v1.h) y(jVar).f2055c0;
        hVar.getClass();
        return l1.q.D(hVar, p1Var);
    }

    public static final h2.c i(b2.q qVar, boolean z10, boolean z11) {
        if (!qVar.A.N) {
            return h2.c.f6545e;
        }
        if (z10) {
            return v(qVar, 8).V1();
        }
        p1 p1VarV = v(qVar, 8);
        return z2.d0.i(p1VarV).F(p1VarV, z11);
    }

    public static final o2 j(b2.q qVar, Object obj) {
        a1.n nVar;
        if (!qVar.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar2 = qVar.A.E;
        l0 l0VarY = y(qVar);
        while (l0VarY != null) {
            if ((((b2.q) l0VarY.f2059g0.G).D & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.C & 262144) != 0) {
                        b2.q qVarE = qVar2;
                        m1.e eVar = null;
                        while (qVarE != null) {
                            if (qVarE instanceof o2) {
                                o2 o2Var = (o2) qVarE;
                                if (obj.equals(o2Var.o())) {
                                    return o2Var;
                                }
                            }
                            if ((qVarE.C & 262144) != 0 && (qVarE instanceof l)) {
                                int i10 = 0;
                                for (b2.q qVar3 = ((l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                    if ((qVar3.C & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar.b(qVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            qVarE = e(eVar);
                        }
                    }
                    qVar2 = qVar2.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar2 = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
        return null;
    }

    public static final ArrayList k(z2.w wVar) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        l0 l0VarW0 = ((u0) wVar).W0();
        boolean zR = r(l0VarW0);
        m1.b bVar = (m1.b) l0VarW0.p();
        m1.e eVar = (m1.e) bVar.B;
        ArrayList arrayList = new ArrayList(eVar.C);
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var = (l0) bVar.get(i11);
            arrayList.add(zR ? l0Var.m() : l0Var.n());
        }
        return arrayList;
    }

    public static final float l(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final void m(o oVar) {
        if (((b2.q) oVar).A.N) {
            v(oVar, 1).G1();
        }
    }

    public static final void n(y yVar) {
        y(yVar).G();
    }

    public static final void o(j2 j2Var) {
        y(j2Var).H();
    }

    public static final boolean p(long j9) {
        return (j9 & 2) != 0;
    }

    public static final boolean q(long j9) {
        return (j9 & 1) != 0;
    }

    public static final boolean r(l0 l0Var) throws NoWhenBranchMatchedException {
        int iOrdinal = l0Var.f2060h0.f2112d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                l0 l0VarX = l0Var.x();
                if (l0VarX != null) {
                    return r(l0VarX);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final boolean s(l0 l0Var) {
        if (l0Var.I == null) {
            return false;
        }
        l0 l0VarX = l0Var.x();
        return (l0VarX != null ? l0VarX.I : null) == null || l0Var.f2060h0.f2110b;
    }

    public static final void t(b2.q qVar, u00.a aVar) {
        w1 w1Var = qVar.G;
        if (w1Var == null) {
            w1Var = new w1((v1) qVar);
            qVar.G = w1Var;
        }
        b2 snapshotObserver = ((c3.z) z(qVar)).getSnapshotObserver();
        snapshotObserver.f2003a.d(w1Var, e.F, aVar);
    }

    public static final void u(k kVar) {
        c2.c cVar;
        l0 l0VarY = y(kVar);
        if (l0VarY.U || (cVar = ((c3.z) p0.a(l0VarY)).f2811q0) == null) {
            return;
        }
        cVar.D.f8932b.F(l0VarY.B, new c2.b(cVar, l0VarY, 0));
    }

    public static final p1 v(k kVar, int i10) {
        p1 p1Var = ((b2.q) kVar).A.H;
        kotlin.jvm.internal.m.b(p1Var);
        if (p1Var.z1() != kVar || !q1.g(i10)) {
            return p1Var;
        }
        p1 p1Var2 = p1Var.R;
        kotlin.jvm.internal.m.b(p1Var2);
        return p1Var2;
    }

    public static final i2.y w(k kVar) {
        return ((c3.z) z(kVar)).getGraphicsContext();
    }

    public static final p1 x(k kVar) {
        if (!((b2.q) kVar).A.N) {
            y2.a.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        p1 p1VarV = v(kVar, 2);
        if (!p1VarV.z1().N) {
            y2.a.c("LayoutCoordinates is not attached.");
        }
        return p1VarV;
    }

    public static final l0 y(k kVar) {
        p1 p1Var = ((b2.q) kVar).A.H;
        if (p1Var != null) {
            return p1Var.O;
        }
        throw a1.b.u("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner z(k kVar) throws KotlinNothingValueException {
        Owner owner = y(kVar).O;
        if (owner != null) {
            return owner;
        }
        throw a1.b.u("This node does not have an owner.");
    }
}
