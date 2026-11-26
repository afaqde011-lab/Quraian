package g2;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import b3.l0;
import b3.l2;
import b3.n0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import u.d0;

public final class n implements l {

    public final c3.z f6071a;

    public final c3.z f6072b;

    public final i f6074d;

    public u.a0 f6076f;

    public a0 f6078h;

    public final a0 f6073c = new a0(2, null, 14);

    public final m f6075e = new m(this);

    public final d0 f6077g = new d0(1);

    public n(c3.z zVar, c3.z zVar2) {
        this.f6071a = zVar;
        this.f6072b = zVar2;
        this.f6074d = new i(this, zVar2);
    }

    public final boolean b(boolean z10) {
        a1.n nVar;
        if (g() != null) {
            a0 a0VarG = g();
            j(null);
            if (a0VarG != null) {
                a0VarG.C1(y.A, y.C);
                if (!a0VarG.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                b2.q qVar = a0VarG.A.E;
                l0 l0VarY = b3.m.y(a0VarG);
                while (l0VarY != null) {
                    if ((((b2.q) l0VarY.f2059g0.G).D & 1024) != 0) {
                        while (qVar != null) {
                            if ((qVar.C & 1024) != 0) {
                                b2.q qVarE = qVar;
                                m1.e eVar = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof a0) {
                                        ((a0) qVarE).C1(y.B, y.C);
                                    } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                        int i10 = 0;
                                        for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                            if ((qVar2.C & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    qVarE = qVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new m1.e(0, new b2.q[16]);
                                                    }
                                                    if (qVarE != null) {
                                                        eVar.b(qVarE);
                                                        qVarE = null;
                                                    }
                                                    eVar.b(qVar2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    qVarE = b3.m.e(eVar);
                                }
                            }
                            qVar = qVar.E;
                        }
                    }
                    l0VarY = l0VarY.x();
                    qVar = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
                }
            }
        }
        return true;
    }

    public final boolean c(int i10, boolean z10, boolean z11) {
        int iOrdinal;
        boolean z12 = true;
        if (z10 || (iOrdinal = d.t(this.f6073c, i10).ordinal()) == 0) {
            b(z10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = false;
        }
        if (z12 && z11) {
            d();
        }
        return z12;
    }

    public final void d() {
        c3.z zVar = this.f6071a;
        if (zVar.isFocused() || zVar.hasFocus()) {
            zVar.clearFocus();
        } else if (zVar.hasFocus()) {
            View viewFindFocus = zVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            zVar.clearFocus();
        }
    }

    public final boolean e(KeyEvent keyEvent, u00.a aVar) {
        b2.q qVar;
        l0 l0VarY;
        b3.k kVar;
        b3.k kVar2;
        b2.q qVar2;
        a1.n nVar;
        b2.q qVarE;
        m1.e eVar;
        b2.q qVar3;
        l0 l0VarY2;
        b3.k kVar3;
        b3.k kVar4;
        a1.n nVar2;
        m1.e eVar2;
        b2.q qVarE2;
        int size;
        a1.n nVar3;
        boolean z10;
        a0 a0Var = this.f6073c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f6074d.f6070e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            long jB = t2.d.b(keyEvent);
            int iC = t2.d.c(keyEvent);
            if (iC == 2) {
                u.a0 a0Var2 = this.f6076f;
                if (a0Var2 == null) {
                    a0Var2 = new u.a0(3);
                    this.f6076f = a0Var2;
                }
                a0Var2.d(jB);
            } else if (iC == 1) {
                u.a0 a0Var3 = this.f6076f;
                if (a0Var3 == null || !a0Var3.a(jB)) {
                    Trace.endSection();
                    return false;
                }
                u.a0 a0Var4 = this.f6076f;
                if (a0Var4 != null) {
                    a0Var4.e(jB);
                }
            }
            a0 a0VarF = d.f(a0Var);
            if (a0VarF != null) {
                if (!a0VarF.A.N) {
                    y2.a.c("visitLocalDescendants called on an unattached node");
                }
                b2.q qVar4 = a0VarF.A;
                if ((qVar4.D & 9216) != 0) {
                    qVar2 = null;
                    for (b2.q qVar5 = qVar4.F; qVar5 != null; qVar5 = qVar5.F) {
                        int i10 = qVar5.C;
                        if ((i10 & 9216) != 0) {
                            if ((i10 & 1024) != 0) {
                                break;
                            }
                            qVar2 = qVar5;
                        }
                    }
                } else {
                    qVar2 = null;
                }
                if (qVar2 == null) {
                    if (a0VarF == null) {
                        if (!a0Var.A.N) {
                            y2.a.c("visitAncestors called on an unattached node");
                        }
                        qVar = a0Var.A.E;
                        l0VarY = b3.m.y(a0Var);
                        loop15: while (true) {
                            if (l0VarY != null) {
                                kVar = null;
                                break;
                            }
                            if ((((b2.q) l0VarY.f2059g0.G).D & 8192) != 0) {
                                while (qVar != null) {
                                    if ((qVar.C & 8192) != 0) {
                                        qVarE = qVar;
                                        eVar = null;
                                        while (qVarE != null) {
                                            if (qVarE instanceof t2.e) {
                                                kVar = qVarE;
                                                break loop15;
                                            }
                                            if ((qVarE.C & 8192) == 0) {
                                            }
                                            qVarE = b3.m.e(eVar);
                                        }
                                    }
                                    qVar = qVar.E;
                                }
                            }
                            l0VarY = l0VarY.x();
                            if (l0VarY != null) {
                            }
                        }
                        kVar2 = (t2.e) kVar;
                        if (kVar2 != null) {
                            qVar2 = ((b2.q) kVar2).A;
                        } else {
                            qVar2 = null;
                        }
                    } else {
                        if (!a0VarF.A.N) {
                            y2.a.c("visitAncestors called on an unattached node");
                        }
                        qVar3 = a0VarF.A;
                        l0VarY2 = b3.m.y(a0VarF);
                        loop11: while (true) {
                            if (l0VarY2 != null) {
                                kVar3 = null;
                                break;
                            }
                            if ((((b2.q) l0VarY2.f2059g0.G).D & 8192) != 0) {
                                while (qVar3 != null) {
                                    if ((qVar3.C & 8192) != 0) {
                                        eVar2 = null;
                                        qVarE2 = qVar3;
                                        while (qVarE2 != null) {
                                            if (qVarE2 instanceof t2.e) {
                                                kVar3 = qVarE2;
                                                break loop11;
                                            }
                                            if ((qVarE2.C & 8192) == 0) {
                                            }
                                            qVarE2 = b3.m.e(eVar2);
                                        }
                                    }
                                    qVar3 = qVar3.E;
                                }
                            }
                            l0VarY2 = l0VarY2.x();
                            if (l0VarY2 != null) {
                            }
                        }
                        kVar4 = (t2.e) kVar3;
                        if (kVar4 != null) {
                            qVar2 = ((b2.q) kVar4).A;
                        } else {
                            if (!a0Var.A.N) {
                                y2.a.c("visitAncestors called on an unattached node");
                            }
                            qVar = a0Var.A.E;
                            l0VarY = b3.m.y(a0Var);
                            loop15: while (true) {
                                if (l0VarY != null) {
                                    kVar = null;
                                    break;
                                }
                                if ((((b2.q) l0VarY.f2059g0.G).D & 8192) != 0) {
                                    while (qVar != null) {
                                        if ((qVar.C & 8192) != 0) {
                                            qVarE = qVar;
                                            eVar = null;
                                            while (qVarE != null) {
                                                if (qVarE instanceof t2.e) {
                                                    kVar = qVarE;
                                                    break loop15;
                                                }
                                                if ((qVarE.C & 8192) == 0) {
                                                }
                                                qVarE = b3.m.e(eVar);
                                            }
                                        }
                                        qVar = qVar.E;
                                    }
                                }
                                l0VarY = l0VarY.x();
                                if (l0VarY != null) {
                                }
                            }
                            kVar2 = (t2.e) kVar;
                            if (kVar2 != null) {
                                qVar2 = ((b2.q) kVar2).A;
                            } else {
                                qVar2 = null;
                            }
                        }
                    }
                }
            } else if (a0VarF == null) {
                if (!a0Var.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                qVar = a0Var.A.E;
                l0VarY = b3.m.y(a0Var);
                loop15: while (true) {
                    if (l0VarY != null) {
                        kVar = null;
                        break;
                    }
                    if ((((b2.q) l0VarY.f2059g0.G).D & 8192) != 0) {
                        while (qVar != null) {
                            if ((qVar.C & 8192) != 0) {
                                qVarE = qVar;
                                eVar = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof t2.e) {
                                        kVar = qVarE;
                                        break loop15;
                                    }
                                    if ((qVarE.C & 8192) == 0 && (qVarE instanceof b3.l)) {
                                        b2.q qVar6 = ((b3.l) qVarE).P;
                                        int i11 = 0;
                                        qVarE = qVarE;
                                        eVar = eVar;
                                        while (qVar6 != null) {
                                            if ((qVar6.C & 8192) != 0) {
                                                i11++;
                                                eVar = eVar;
                                                if (i11 == 1) {
                                                    qVarE = qVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new m1.e(0, new b2.q[16]);
                                                    }
                                                    if (qVarE != null) {
                                                        eVar.b(qVarE);
                                                        qVarE = null;
                                                    }
                                                    eVar.b(qVar6);
                                                }
                                            }
                                            qVar6 = qVar6.F;
                                            qVarE = qVarE;
                                            eVar = eVar;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    qVarE = b3.m.e(eVar);
                                }
                            }
                            qVar = qVar.E;
                        }
                    }
                    l0VarY = l0VarY.x();
                    qVar = (l0VarY != null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
                }
                kVar2 = (t2.e) kVar;
                if (kVar2 != null) {
                    qVar2 = ((b2.q) kVar2).A;
                } else {
                    qVar2 = null;
                }
            } else {
                if (!a0VarF.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                qVar3 = a0VarF.A;
                l0VarY2 = b3.m.y(a0VarF);
                loop11: while (true) {
                    if (l0VarY2 != null) {
                        kVar3 = null;
                        break;
                    }
                    if ((((b2.q) l0VarY2.f2059g0.G).D & 8192) != 0) {
                        while (qVar3 != null) {
                            if ((qVar3.C & 8192) != 0) {
                                eVar2 = null;
                                qVarE2 = qVar3;
                                while (qVarE2 != null) {
                                    if (qVarE2 instanceof t2.e) {
                                        kVar3 = qVarE2;
                                        break loop11;
                                    }
                                    if ((qVarE2.C & 8192) == 0 && (qVarE2 instanceof b3.l)) {
                                        b2.q qVar7 = ((b3.l) qVarE2).P;
                                        int i12 = 0;
                                        qVarE2 = qVarE2;
                                        eVar2 = eVar2;
                                        while (qVar7 != null) {
                                            if ((qVar7.C & 8192) != 0) {
                                                i12++;
                                                eVar2 = eVar2;
                                                if (i12 == 1) {
                                                    qVarE2 = qVar7;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new m1.e(0, new b2.q[16]);
                                                    }
                                                    if (qVarE2 != null) {
                                                        eVar2.b(qVarE2);
                                                        qVarE2 = null;
                                                    }
                                                    eVar2.b(qVar7);
                                                }
                                            }
                                            qVar7 = qVar7.F;
                                            qVarE2 = qVarE2;
                                            eVar2 = eVar2;
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    qVarE2 = b3.m.e(eVar2);
                                }
                            }
                            qVar3 = qVar3.E;
                        }
                    }
                    l0VarY2 = l0VarY2.x();
                    qVar3 = (l0VarY2 != null || (nVar2 = l0VarY2.f2059g0) == null) ? null : (l2) nVar2.F;
                }
                kVar4 = (t2.e) kVar3;
                if (kVar4 != null) {
                    qVar2 = ((b2.q) kVar4).A;
                } else {
                    if (!a0Var.A.N) {
                        y2.a.c("visitAncestors called on an unattached node");
                    }
                    qVar = a0Var.A.E;
                    l0VarY = b3.m.y(a0Var);
                    loop15: while (true) {
                        if (l0VarY != null) {
                            kVar = null;
                            break;
                        }
                        if ((((b2.q) l0VarY.f2059g0.G).D & 8192) != 0) {
                            while (qVar != null) {
                                if ((qVar.C & 8192) != 0) {
                                    qVarE = qVar;
                                    eVar = null;
                                    while (qVarE != null) {
                                        if (qVarE instanceof t2.e) {
                                            kVar = qVarE;
                                            break loop15;
                                        }
                                        if ((qVarE.C & 8192) == 0) {
                                        }
                                        qVarE = b3.m.e(eVar);
                                    }
                                }
                                qVar = qVar.E;
                            }
                        }
                        l0VarY = l0VarY.x();
                        if (l0VarY != null) {
                        }
                    }
                    kVar2 = (t2.e) kVar;
                    if (kVar2 != null) {
                        qVar2 = ((b2.q) kVar2).A;
                    } else {
                        qVar2 = null;
                    }
                }
            }
            if (qVar2 != null) {
                if (!qVar2.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                b2.q qVar8 = qVar2.A.E;
                l0 l0VarY3 = b3.m.y(qVar2);
                ArrayList arrayList = null;
                while (l0VarY3 != null) {
                    if ((((b2.q) l0VarY3.f2059g0.G).D & 8192) != 0) {
                        while (qVar8 != null) {
                            if ((qVar8.C & 8192) != 0) {
                                b2.q qVarE3 = qVar8;
                                m1.e eVar3 = null;
                                while (qVarE3 != null) {
                                    if (qVarE3 instanceof t2.e) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(qVarE3);
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10 && (qVarE3.C & 8192) != 0 && (qVarE3 instanceof b3.l)) {
                                        int i13 = 0;
                                        for (b2.q qVar9 = ((b3.l) qVarE3).P; qVar9 != null; qVar9 = qVar9.F) {
                                            if ((qVar9.C & 8192) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    qVarE3 = qVar9;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new m1.e(0, new b2.q[16]);
                                                    }
                                                    if (qVarE3 != null) {
                                                        eVar3.b(qVarE3);
                                                        qVarE3 = null;
                                                    }
                                                    eVar3.b(qVar9);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    qVarE3 = b3.m.e(eVar3);
                                }
                            }
                            qVar8 = qVar8.E;
                        }
                    }
                    l0VarY3 = l0VarY3.x();
                    qVar8 = (l0VarY3 == null || (nVar3 = l0VarY3.f2059g0) == null) ? null : (l2) nVar3.F;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i14 = size - 1;
                        if (((t2.e) arrayList.get(size)).k(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i14 < 0) {
                            break;
                        }
                        size = i14;
                    }
                }
                ?? E = qVar2.A;
                ?? eVar4 = 0;
                while (E != 0) {
                    if (E instanceof t2.e) {
                        if (((t2.e) E).k(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E.C & 8192) != 0 && (E instanceof b3.l)) {
                        b2.q qVar10 = ((b3.l) E).P;
                        int i15 = 0;
                        eVar4 = eVar4;
                        E = E;
                        while (qVar10 != null) {
                            if ((qVar10.C & 8192) != 0) {
                                i15++;
                                eVar4 = eVar4;
                                if (i15 == 1) {
                                    E = qVar10;
                                } else {
                                    if (eVar4 == 0) {
                                        eVar4 = new m1.e(0, new b2.q[16]);
                                    }
                                    if (E != 0) {
                                        eVar4.b(E);
                                        E = 0;
                                    }
                                    eVar4.b(qVar10);
                                }
                            }
                            qVar10 = qVar10.F;
                            eVar4 = eVar4;
                            E = E;
                        }
                        if (i15 == 1) {
                        }
                    }
                    E = b3.m.e(eVar4);
                }
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? E2 = qVar2.A;
                ?? eVar5 = 0;
                while (E2 != 0) {
                    if (E2 instanceof t2.e) {
                        if (((t2.e) E2).O(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E2.C & 8192) != 0 && (E2 instanceof b3.l)) {
                        b2.q qVar11 = ((b3.l) E2).P;
                        int i16 = 0;
                        E2 = E2;
                        eVar5 = eVar5;
                        while (qVar11 != null) {
                            if ((qVar11.C & 8192) != 0) {
                                i16++;
                                eVar5 = eVar5;
                                if (i16 == 1) {
                                    E2 = qVar11;
                                } else {
                                    if (eVar5 == 0) {
                                        eVar5 = new m1.e(0, new b2.q[16]);
                                    }
                                    if (E2 != 0) {
                                        eVar5.b(E2);
                                        E2 = 0;
                                    }
                                    eVar5.b(qVar11);
                                }
                            }
                            qVar11 = qVar11.F;
                            E2 = E2;
                            eVar5 = eVar5;
                        }
                        if (i16 == 1) {
                        }
                    }
                    E2 = b3.m.e(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        if (((t2.e) arrayList.get(i17)).O(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final Boolean f(int i10, h2.c cVar, u00.k kVar) {
        boolean zA;
        boolean z10;
        a0 a0Var;
        a1.n nVar;
        boolean z11;
        a0 a0Var2 = this.f6073c;
        a0 a0VarF = d.f(a0Var2);
        int i11 = 4;
        c3.z zVar = this.f6072b;
        if (a0VarF != null) {
            y3.m layoutDirection = zVar.getLayoutDirection();
            r rVarD1 = a0VarF.D1();
            t tVar = rVarD1.f6087h;
            t tVar2 = rVarD1.f6088i;
            if (i10 == 1) {
                tVar = rVarD1.f6081b;
            } else if (i10 == 2) {
                tVar = rVarD1.f6082c;
            } else if (i10 == 5) {
                tVar = rVarD1.f6083d;
            } else if (i10 == 6) {
                tVar = rVarD1.f6084e;
            } else if (i10 == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVar = tVar2;
                }
                if (tVar == t.f6091b) {
                    tVar = null;
                }
                if (tVar == null) {
                    tVar = rVarD1.f6085f;
                }
            } else if (i10 == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    tVar = tVar2;
                } else if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (tVar == t.f6091b) {
                    tVar = null;
                }
                if (tVar == null) {
                    tVar = rVarD1.f6086g;
                }
            } else {
                if (i10 != 7 && i10 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                a aVar = new a(i10);
                n nVar2 = (n) ((c3.z) b3.m.z(a0VarF)).getFocusOwner();
                a0 a0VarG = nVar2.g();
                if (i10 == 7) {
                    rVarD1.f6089j.invoke(aVar);
                } else {
                    rVarD1.f6090k.invoke(aVar);
                }
                tVar = aVar.f6062b ? t.f6092c : a0VarG != nVar2.g() ? t.f6093d : t.f6091b;
            }
            t tVar3 = t.f6092c;
            if (!kotlin.jvm.internal.m.a(tVar, tVar3)) {
                if (kotlin.jvm.internal.m.a(tVar, t.f6093d)) {
                    a0 a0VarF2 = d.f(a0Var2);
                    if (a0VarF2 != null) {
                        return (Boolean) kVar.invoke(a0VarF2);
                    }
                } else {
                    t tVar4 = t.f6091b;
                    if (!kotlin.jvm.internal.m.a(tVar, tVar4)) {
                        if (tVar == tVar4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (tVar == tVar3) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        m1.e eVar = tVar.f6094a;
                        int i12 = eVar.C;
                        if (i12 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z11 = false;
                        } else {
                            Object[] objArr = eVar.A;
                            boolean z12 = false;
                            for (int i13 = 0; i13 < i12; i13++) {
                                b2.q qVar = (b2.q) ((v) objArr[i13]);
                                if (!qVar.A.N) {
                                    y2.a.c("visitChildren called on an unattached node");
                                }
                                m1.e eVar2 = new m1.e(0, new b2.q[16]);
                                b2.q qVar2 = qVar.A;
                                b2.q qVar3 = qVar2.F;
                                if (qVar3 == null) {
                                    b3.m.b(eVar2, qVar2);
                                } else {
                                    eVar2.b(qVar3);
                                }
                                while (true) {
                                    int i14 = eVar2.C;
                                    if (i14 == 0) {
                                        break;
                                    }
                                    b2.q qVarE = (b2.q) eVar2.k(i14 - 1);
                                    if ((qVarE.D & 1024) == 0) {
                                        b3.m.b(eVar2, qVarE);
                                    } else {
                                        while (qVarE != null) {
                                            if ((qVarE.C & 1024) != 0) {
                                                m1.e eVar3 = null;
                                                while (qVarE != null) {
                                                    if (qVarE instanceof a0) {
                                                        if (((Boolean) kVar.invoke((a0) qVarE)).booleanValue()) {
                                                            z12 = true;
                                                            break;
                                                        }
                                                    } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                                        m1.e eVar4 = eVar3;
                                                        int i15 = 0;
                                                        for (b2.q qVar4 = ((b3.l) qVarE).P; qVar4 != null; qVar4 = qVar4.F) {
                                                            if ((qVar4.C & 1024) != 0) {
                                                                i15++;
                                                                if (i15 == 1) {
                                                                    qVarE = qVar4;
                                                                } else {
                                                                    if (eVar4 == null) {
                                                                        eVar4 = new m1.e(0, new b2.q[16]);
                                                                    }
                                                                    if (qVarE != null) {
                                                                        eVar4.b(qVarE);
                                                                        qVarE = null;
                                                                    }
                                                                    eVar4.b(qVar4);
                                                                }
                                                            }
                                                        }
                                                        if (i15 == 1) {
                                                            eVar3 = eVar4;
                                                        } else {
                                                            eVar3 = eVar4;
                                                        }
                                                    }
                                                    qVarE = b3.m.e(eVar3);
                                                }
                                                break;
                                            }
                                            qVarE = qVarE.F;
                                        }
                                    }
                                }
                            }
                            z11 = z12;
                        }
                        return Boolean.valueOf(z11);
                    }
                }
            }
            return null;
        }
        a0VarF = null;
        y3.m layoutDirection2 = zVar.getLayoutDirection();
        n0 n0Var = new n0(a0VarF, this, kVar);
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                zA = d.k(a0Var2, n0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = d.a(a0Var2, n0Var);
            }
            return Boolean.valueOf(zA);
        }
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return d.C(i10, n0Var, a0Var2, cVar);
        }
        if (i10 == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = 3;
            }
            a0 a0VarF3 = d.f(a0Var2);
            if (a0VarF3 != null) {
                return d.C(i11, n0Var, a0VarF3, cVar);
            }
            return null;
        }
        if (i10 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) f.a(i10))).toString());
        }
        a0 a0VarF4 = d.f(a0Var2);
        if (a0VarF4 != null) {
            if (!a0VarF4.A.N) {
                y2.a.c("visitAncestors called on an unattached node");
            }
            b2.q qVar5 = a0VarF4.A.E;
            l0 l0VarY = b3.m.y(a0VarF4);
            loop5: while (true) {
                if (l0VarY == null) {
                    a0Var = null;
                    break;
                }
                if ((((b2.q) l0VarY.f2059g0.G).D & 1024) != 0) {
                    while (qVar5 != null) {
                        if ((qVar5.C & 1024) != 0) {
                            b2.q qVarE2 = qVar5;
                            m1.e eVar5 = null;
                            while (qVarE2 != null) {
                                if (qVarE2 instanceof a0) {
                                    a0 a0Var3 = (a0) qVarE2;
                                    if (a0Var3.D1().f6080a) {
                                        a0Var = a0Var3;
                                        break loop5;
                                    }
                                } else if ((qVarE2.C & 1024) != 0 && (qVarE2 instanceof b3.l)) {
                                    int i16 = 0;
                                    for (b2.q qVar6 = ((b3.l) qVarE2).P; qVar6 != null; qVar6 = qVar6.F) {
                                        if ((qVar6.C & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                qVarE2 = qVar6;
                                            } else {
                                                if (eVar5 == null) {
                                                    eVar5 = new m1.e(0, new b2.q[16]);
                                                }
                                                if (qVarE2 != null) {
                                                    eVar5.b(qVarE2);
                                                    qVarE2 = null;
                                                }
                                                eVar5.b(qVar6);
                                            }
                                        }
                                    }
                                    if (i16 != 1) {
                                        qVarE2 = b3.m.e(eVar5);
                                    }
                                }
                                qVarE2 = b3.m.e(eVar5);
                            }
                        }
                        qVar5 = qVar5.E;
                    }
                }
                l0VarY = l0VarY.x();
                qVar5 = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
            }
            z10 = false;
        } else {
            z10 = false;
            a0Var = null;
        }
        return Boolean.valueOf((a0Var == null || a0Var.equals(a0Var2)) ? z10 : ((Boolean) n0Var.invoke(a0Var)).booleanValue());
    }

    public final a0 g() {
        a0 a0Var = this.f6078h;
        if (a0Var == null || !a0Var.N) {
            return null;
        }
        return a0Var;
    }

    public final boolean h(int i10, boolean z10) {
        a0 a0VarG = g();
        c3.z zVar = this.f6071a;
        if (a0VarG == null || !a0VarG.O || !zVar.v(i10)) {
            kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
            zVar2.A = Boolean.FALSE;
            a0 a0VarG2 = g();
            Boolean boolF = f(i10, zVar.getEmbeddedViewFocusRect(), new gc.d(zVar2, i10, 2));
            if (!kotlin.jvm.internal.m.a(boolF, Boolean.TRUE) || a0VarG2 == g()) {
                if (boolF != null && zVar2.A != null) {
                    if (!boolF.booleanValue() || !((Boolean) zVar2.A).booleanValue()) {
                        if ((i10 == 1 || i10 == 2) && z10 && c(i10, false, false)) {
                            Boolean boolF2 = f(i10, null, new c3.w(i10, 3));
                            if (boolF2 != null ? boolF2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i10) {
        if (!c(i10, false, false)) {
            return false;
        }
        Boolean boolF = f(i10, null, new c3.w(i10, 2));
        boolean zBooleanValue = boolF != null ? boolF.booleanValue() : false;
        if (!zBooleanValue) {
            d();
        }
        return zBooleanValue;
    }

    public final void j(a0 a0Var) {
        a0 a0Var2 = this.f6078h;
        this.f6078h = a0Var;
        d0 d0Var = this.f6077g;
        Object[] objArr = d0Var.f14837a;
        int i10 = d0Var.f14838b;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j) objArr[i11]).b(a0Var2, a0Var);
        }
    }
}
