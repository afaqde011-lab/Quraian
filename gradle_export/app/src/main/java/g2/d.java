package g2;

import b3.j0;
import b3.l0;
import b3.l2;
import b3.n0;
import b3.p1;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import z2.d0;

public abstract class d {
    public static final boolean A(int i10, n0 n0Var, a0 a0Var, h2.c cVar) {
        a0 a0VarG;
        m1.e eVar = new m1.e(0, new a0[16]);
        if (!a0Var.A.N) {
            y2.a.c("visitChildren called on an unattached node");
        }
        m1.e eVar2 = new m1.e(0, new b2.q[16]);
        b2.q qVar = a0Var.A;
        b2.q qVar2 = qVar.F;
        if (qVar2 == null) {
            b3.m.b(eVar2, qVar);
        } else {
            eVar2.b(qVar2);
        }
        while (true) {
            int i11 = eVar2.C;
            if (i11 == 0) {
                break;
            }
            b2.q qVarE = (b2.q) eVar2.k(i11 - 1);
            if ((qVarE.D & 1024) == 0) {
                b3.m.b(eVar2, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.C & 1024) != 0) {
                        m1.e eVar3 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof a0) {
                                a0 a0Var2 = (a0) qVarE;
                                if (a0Var2.N) {
                                    eVar.b(a0Var2);
                                }
                            } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                int i12 = 0;
                                for (b2.q qVar3 = ((b3.l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                    if ((qVar3.C & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar3.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar3.b(qVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
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
        while (eVar.C != 0 && (a0VarG = g(eVar, cVar, i10)) != null) {
            if (a0VarG.D1().f6080a) {
                return ((Boolean) n0Var.invoke(a0VarG)).booleanValue();
            }
            if (l(i10, n0Var, a0VarG, cVar)) {
                return true;
            }
            eVar.j(a0VarG);
        }
        return false;
    }

    public static final boolean B(a0 a0Var, a0 a0Var2, int i10, n0 n0Var) {
        b2.q qVar;
        b2.q qVar2;
        l0 l0VarY;
        a1.n nVar;
        b2.q qVarE;
        m1.e eVar;
        if (a0Var.G1() != y.B) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new a0[16];
        if (!a0Var.A.N) {
            y2.a.c("visitChildren called on an unattached node");
        }
        m1.e eVar2 = new m1.e(0, new b2.q[16]);
        b2.q qVar3 = a0Var.A;
        b2.q qVar4 = qVar3.F;
        if (qVar4 == null) {
            b3.m.b(eVar2, qVar3);
        } else {
            eVar2.b(qVar4);
        }
        int i11 = 0;
        while (true) {
            int i12 = eVar2.C;
            qVar = null;
            if (i12 == 0) {
                break;
            }
            b2.q qVarE2 = (b2.q) eVar2.k(i12 - 1);
            if ((qVarE2.D & 1024) == 0) {
                b3.m.b(eVar2, qVarE2);
            } else {
                while (qVarE2 != null) {
                    if ((qVarE2.C & 1024) != 0) {
                        m1.e eVar3 = null;
                        while (qVarE2 != null) {
                            if (qVarE2 instanceof a0) {
                                a0 a0Var3 = (a0) qVarE2;
                                int i13 = i11 + 1;
                                if (objArr.length < i13) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i11] = a0Var3;
                                i11 = i13;
                            } else if ((qVarE2.C & 1024) != 0 && (qVarE2 instanceof b3.l)) {
                                int i14 = 0;
                                for (b2.q qVar5 = ((b3.l) qVarE2).P; qVar5 != null; qVar5 = qVar5.F) {
                                    if ((qVar5.C & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            qVarE2 = qVar5;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE2 != null) {
                                                eVar3.b(qVarE2);
                                                qVarE2 = null;
                                            }
                                            eVar3.b(qVar5);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            qVarE2 = b3.m.e(eVar3);
                        }
                        break;
                    }
                    qVarE2 = qVarE2.F;
                }
            }
        }
        Arrays.sort(objArr, 0, i11, b0.A);
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            z00.e eVarI0 = ab.a0.I0(0, i11);
            int i15 = ((z00.c) eVarI0).A;
            int i16 = ((z00.c) eVarI0).B;
            if (i15 <= i16) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        a0 a0Var4 = (a0) objArr[i16];
                        if (r(a0Var4) && a(a0Var4, n0Var)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.m.a(objArr[i16], a0Var2)) {
                        z10 = true;
                    }
                    if (i16 == i15) {
                        break;
                    }
                    i16--;
                }
            }
            if (i10 != 1) {
                if (!a0Var.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                qVar2 = a0Var.A.E;
                l0VarY = b3.m.y(a0Var);
                loop5: while (l0VarY != null) {
                    if ((((b2.q) l0VarY.f2059g0.G).D & 1024) != 0) {
                        while (qVar2 != null) {
                            if ((qVar2.C & 1024) != 0) {
                                qVarE = qVar2;
                                eVar = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof a0) {
                                        qVar = qVarE;
                                        break loop5;
                                    }
                                    if ((qVarE.C & 1024) == 0) {
                                    }
                                    qVarE = b3.m.e(eVar);
                                }
                            }
                            qVar2 = qVar2.E;
                        }
                    }
                    l0VarY = l0VarY.x();
                    if (l0VarY != null) {
                    }
                }
                if (qVar != null) {
                    return ((Boolean) n0Var.invoke(a0Var)).booleanValue();
                }
            }
            return false;
        }
        z00.e eVarI1 = ab.a0.I0(0, i11);
        int i17 = ((z00.c) eVarI1).A;
        int i18 = ((z00.c) eVarI1).B;
        if (i17 <= i18) {
            boolean z11 = false;
            while (true) {
                if (z11) {
                    a0 a0Var5 = (a0) objArr[i17];
                    if (r(a0Var5) && k(a0Var5, n0Var)) {
                        return true;
                    }
                }
                if (kotlin.jvm.internal.m.a(objArr[i17], a0Var2)) {
                    z11 = true;
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        if (i10 != 1 && a0Var.D1().f6080a) {
            if (!a0Var.A.N) {
                y2.a.c("visitAncestors called on an unattached node");
            }
            qVar2 = a0Var.A.E;
            l0VarY = b3.m.y(a0Var);
            loop5: while (l0VarY != null) {
                if ((((b2.q) l0VarY.f2059g0.G).D & 1024) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.C & 1024) != 0) {
                            qVarE = qVar2;
                            eVar = null;
                            while (qVarE != null) {
                                if (qVarE instanceof a0) {
                                    qVar = qVarE;
                                    break loop5;
                                }
                                if ((qVarE.C & 1024) == 0 && (qVarE instanceof b3.l)) {
                                    int i19 = 0;
                                    for (b2.q qVar6 = ((b3.l) qVarE).P; qVar6 != null; qVar6 = qVar6.F) {
                                        if ((qVar6.C & 1024) != 0) {
                                            i19++;
                                            if (i19 == 1) {
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
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                qVarE = b3.m.e(eVar);
                            }
                        }
                        qVar2 = qVar2.E;
                    }
                }
                l0VarY = l0VarY.x();
                qVar2 = (l0VarY != null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
            }
            if (qVar != null) {
                return ((Boolean) n0Var.invoke(a0Var)).booleanValue();
            }
        }
        return false;
    }

    public static final Boolean C(int i10, n0 n0Var, a0 a0Var, h2.c cVar) throws NoWhenBranchMatchedException {
        int iOrdinal = a0Var.G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                a0 a0VarN = n(a0Var);
                if (a0VarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = a0VarN.G1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolC = C(i10, n0Var, a0VarN, cVar);
                        if (!kotlin.jvm.internal.m.a(boolC, Boolean.FALSE)) {
                            return boolC;
                        }
                        if (cVar == null) {
                            if (a0VarN.G1() != y.B) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            a0 a0VarF = f(a0VarN);
                            if (a0VarF == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = i(a0VarF);
                        }
                        return Boolean.valueOf(l(i10, n0Var, a0Var, cVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = i(a0VarN);
                }
                return Boolean.valueOf(l(i10, n0Var, a0Var, cVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (a0Var.D1().f6080a) {
                    return (Boolean) n0Var.invoke(a0Var);
                }
                return cVar == null ? Boolean.valueOf(h(a0Var, i10, n0Var)) : Boolean.valueOf(A(i10, n0Var, a0Var, cVar));
            }
        }
        return Boolean.valueOf(h(a0Var, i10, n0Var));
    }

    public static final boolean a(a0 a0Var, n0 n0Var) throws NoWhenBranchMatchedException {
        int iOrdinal = a0Var.G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                a0 a0VarN = n(a0Var);
                if (a0VarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = a0VarN.G1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (a(a0VarN, n0Var) || m(a0Var, a0VarN, 2, n0Var) || (a0VarN.D1().f6080a && ((Boolean) n0Var.invoke(a0VarN)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return m(a0Var, a0VarN, 2, n0Var);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!x(a0Var, n0Var)) {
                    if (!(a0Var.D1().f6080a ? ((Boolean) n0Var.invoke(a0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return x(a0Var, n0Var);
    }

    public static final boolean b(h2.c r18, h2.c r19, h2.c r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: g2.d.b(h2.c, h2.c, h2.c, int):boolean");
    }

    public static final boolean c(int i10, h2.c cVar, h2.c cVar2) {
        if (i10 == 3 || i10 == 4) {
            return cVar.f6549d > cVar2.f6547b && cVar.f6547b < cVar2.f6549d;
        }
        if (i10 == 5 || i10 == 6) {
            return cVar.f6548c > cVar2.f6546a && cVar.f6546a < cVar2.f6548c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean d(a0 a0Var, boolean z10) {
        int iOrdinal = a0Var.G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                a0 a0VarN = n(a0Var);
                if (!(a0VarN != null ? d(a0VarN, z10) : true)) {
                    return false;
                }
                a0Var.C1(y.B, y.C);
                return true;
            }
            if (iOrdinal == 2) {
                return z10;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static final void e(a0 a0Var, m1.e eVar) {
        if (!a0Var.A.N) {
            y2.a.c("visitChildren called on an unattached node");
        }
        m1.e eVar2 = new m1.e(0, new b2.q[16]);
        b2.q qVar = a0Var.A;
        b2.q qVar2 = qVar.F;
        if (qVar2 == null) {
            b3.m.b(eVar2, qVar);
        } else {
            eVar2.b(qVar2);
        }
        while (true) {
            int i10 = eVar2.C;
            if (i10 == 0) {
                return;
            }
            b2.q qVarE = (b2.q) eVar2.k(i10 - 1);
            if ((qVarE.D & 1024) == 0) {
                b3.m.b(eVar2, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.C & 1024) != 0) {
                        m1.e eVar3 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof a0) {
                                a0 a0Var2 = (a0) qVarE;
                                if (a0Var2.N && !b3.m.y(a0Var2).f2070r0) {
                                    if (a0Var2.D1().f6080a) {
                                        eVar.b(a0Var2);
                                    } else {
                                        e(a0Var2, eVar);
                                    }
                                }
                            } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                int i11 = 0;
                                for (b2.q qVar3 = ((b3.l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                    if ((qVar3.C & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar3.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar3.b(qVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
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

    public static final a0 f(a0 a0Var) {
        a0 a0VarG = ((n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).g();
        if (a0VarG == null || !a0VarG.N) {
            return null;
        }
        return a0VarG;
    }

    public static final a0 g(m1.e eVar, h2.c cVar, int i10) {
        h2.c cVarI;
        if (i10 == 3) {
            cVarI = cVar.i((cVar.f6548c - cVar.f6546a) + 1, 0.0f);
        } else if (i10 == 4) {
            cVarI = cVar.i(-((cVar.f6548c - cVar.f6546a) + 1), 0.0f);
        } else if (i10 == 5) {
            cVarI = cVar.i(0.0f, (cVar.f6549d - cVar.f6547b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarI = cVar.i(0.0f, -((cVar.f6549d - cVar.f6547b) + 1));
        }
        Object[] objArr = eVar.A;
        int i11 = eVar.C;
        a0 a0Var = null;
        for (int i12 = 0; i12 < i11; i12++) {
            a0 a0Var2 = (a0) objArr[i12];
            if (r(a0Var2)) {
                h2.c cVarI2 = i(a0Var2);
                if (o(cVarI2, cVarI, cVar, i10)) {
                    a0Var = a0Var2;
                    cVarI = cVarI2;
                }
            }
        }
        return a0Var;
    }

    public static final boolean h(a0 a0Var, int i10, u00.k kVar) {
        h2.c cVar;
        m1.e eVar = new m1.e(0, new a0[16]);
        e(a0Var, eVar);
        int i11 = eVar.C;
        if (i11 <= 1) {
            a0 a0Var2 = (a0) (i11 == 0 ? null : eVar.A[0]);
            if (a0Var2 != null) {
                return ((Boolean) kVar.invoke(a0Var2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                h2.c cVarI = i(a0Var);
                float f3 = cVarI.f6546a;
                float f10 = cVarI.f6547b;
                cVar = new h2.c(f3, f10, f3, f10);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                h2.c cVarI2 = i(a0Var);
                float f11 = cVarI2.f6548c;
                float f12 = cVarI2.f6549d;
                cVar = new h2.c(f11, f12, f11, f12);
            }
            a0 a0VarG = g(eVar, cVar, i10);
            if (a0VarG != null) {
                return ((Boolean) kVar.invoke(a0VarG)).booleanValue();
            }
        }
        return false;
    }

    public static final h2.c i(a0 a0Var) {
        p1 p1Var;
        if (a0Var.N && (p1Var = a0Var.H) != null) {
            z2.a0 a0VarI = d0.i(p1Var);
            if (!a0VarI.A()) {
                a0VarI = null;
            }
            if (a0VarI != null) {
                return a0Var.E1(a0VarI);
            }
        }
        return h2.c.f6545e;
    }

    public static final b2.r j(b2.r rVar, t tVar) {
        return rVar.V(new u(tVar));
    }

    public static final boolean k(a0 a0Var, n0 n0Var) throws NoWhenBranchMatchedException {
        int iOrdinal = a0Var.G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                a0 a0VarN = n(a0Var);
                if (a0VarN != null) {
                    return k(a0VarN, n0Var) || m(a0Var, a0VarN, 1, n0Var);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return a0Var.D1().f6080a ? ((Boolean) n0Var.invoke(a0Var)).booleanValue() : y(a0Var, n0Var);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return y(a0Var, n0Var);
    }

    public static final boolean l(int i10, n0 n0Var, a0 a0Var, h2.c cVar) {
        if (A(i10, n0Var, a0Var, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(a0Var, i10, new c0(((n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).g(), a0Var, cVar, i10, n0Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(a0 a0Var, a0 a0Var2, int i10, n0 n0Var) {
        if (B(a0Var, a0Var2, i10, n0Var)) {
            return true;
        }
        Boolean bool = (Boolean) z(a0Var, i10, new c0(((n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).g(), a0Var, a0Var2, i10, n0Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final a0 n(a0 a0Var) throws NoWhenBranchMatchedException {
        boolean z10 = a0Var.A.N;
        if (z10) {
            if (!z10) {
                y2.a.c("visitChildren called on an unattached node");
            }
            m1.e eVar = new m1.e(0, new b2.q[16]);
            b2.q qVar = a0Var.A;
            b2.q qVar2 = qVar.F;
            if (qVar2 == null) {
                b3.m.b(eVar, qVar);
            } else {
                eVar.b(qVar2);
            }
            while (true) {
                int i10 = eVar.C;
                if (i10 == 0) {
                    break;
                }
                b2.q qVarE = (b2.q) eVar.k(i10 - 1);
                if ((qVarE.D & 1024) == 0) {
                    b3.m.b(eVar, qVarE);
                } else {
                    while (qVarE != null) {
                        if ((qVarE.C & 1024) != 0) {
                            m1.e eVar2 = null;
                            while (qVarE != null) {
                                if (qVarE instanceof a0) {
                                    a0 a0Var2 = (a0) qVarE;
                                    if (a0Var2.A.N) {
                                        int iOrdinal = a0Var2.G1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return a0Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                    int i11 = 0;
                                    for (b2.q qVar3 = ((b3.l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                        if ((qVar3.C & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qVarE = qVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new m1.e(0, new b2.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    eVar2.b(qVarE);
                                                    qVarE = null;
                                                }
                                                eVar2.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                qVarE = b3.m.e(eVar2);
                            }
                            break;
                        }
                        qVarE = qVarE.F;
                    }
                }
            }
        }
        return null;
    }

    public static final boolean o(h2.c cVar, h2.c cVar2, h2.c cVar3, int i10) {
        if (!p(i10, cVar, cVar3)) {
            return false;
        }
        if (p(i10, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i10)) {
            return !b(cVar3, cVar2, cVar, i10) && q(i10, cVar3, cVar) < q(i10, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean p(int i10, h2.c cVar, h2.c cVar2) {
        if (i10 == 3) {
            float f3 = cVar2.f6548c;
            float f10 = cVar2.f6546a;
            float f11 = cVar.f6548c;
            return (f3 > f11 || f10 >= f11) && f10 > cVar.f6546a;
        }
        if (i10 == 4) {
            float f12 = cVar2.f6546a;
            float f13 = cVar2.f6548c;
            float f14 = cVar.f6546a;
            return (f12 < f14 || f13 <= f14) && f13 < cVar.f6548c;
        }
        if (i10 == 5) {
            float f15 = cVar2.f6549d;
            float f16 = cVar2.f6547b;
            float f17 = cVar.f6549d;
            return (f15 > f17 || f16 >= f17) && f16 > cVar.f6547b;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f18 = cVar2.f6547b;
        float f19 = cVar2.f6549d;
        float f20 = cVar.f6547b;
        return (f18 < f20 || f19 <= f20) && f19 < cVar.f6549d;
    }

    public static final long q(int i10, h2.c cVar, h2.c cVar2) {
        float f3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (i10 == 3) {
            f3 = cVar.f6546a;
            f10 = cVar2.f6548c;
        } else if (i10 == 4) {
            f3 = cVar2.f6546a;
            f10 = cVar.f6548c;
        } else if (i10 == 5) {
            f3 = cVar.f6547b;
            f10 = cVar2.f6549d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f3 = cVar2.f6547b;
            f10 = cVar.f6549d;
        }
        float f15 = f3 - f10;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        long j9 = (long) f15;
        if (i10 == 3 || i10 == 4) {
            float f16 = cVar.f6547b;
            f11 = 2;
            f12 = ((cVar.f6549d - f16) / f11) + f16;
            f13 = cVar2.f6547b;
            f14 = cVar2.f6549d;
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f17 = cVar.f6546a;
            f11 = 2;
            f12 = ((cVar.f6548c - f17) / f11) + f17;
            f13 = cVar2.f6546a;
            f14 = cVar2.f6548c;
        }
        long j10 = (long) (f12 - (((f14 - f13) / f11) + f13));
        return (j10 * j10) + (((long) 13) * j9 * j9);
    }

    public static final boolean r(a0 a0Var) {
        l0 l0Var;
        p1 p1Var;
        l0 l0Var2;
        p1 p1Var2 = a0Var.H;
        return (p1Var2 == null || (l0Var = p1Var2.O) == null || !l0Var.K() || (p1Var = a0Var.H) == null || (l0Var2 = p1Var.O) == null || !l0Var2.J()) ? false : true;
    }

    public static final b2.r s(b2.r rVar, u00.k kVar) {
        return rVar.V(new c(kVar));
    }

    public static final b t(a0 a0Var, int i10) throws NoWhenBranchMatchedException {
        int iOrdinal = a0Var.G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                a0 a0VarN = n(a0Var);
                if (a0VarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                b bVarT = t(a0VarN, i10);
                b bVar = b.A;
                if (bVarT == bVar) {
                    bVarT = null;
                }
                if (bVarT != null) {
                    return bVarT;
                }
                if (a0Var.Q) {
                    return bVar;
                }
                a0Var.Q = true;
                try {
                    r rVarD1 = a0Var.D1();
                    a aVar = new a(i10);
                    n nVar = (n) ((c3.z) b3.m.z(a0Var)).getFocusOwner();
                    a0 a0VarG = nVar.g();
                    rVarD1.f6090k.invoke(aVar);
                    a0 a0VarG2 = nVar.g();
                    if (aVar.f6062b) {
                        t tVar = t.f6091b;
                        return b.B;
                    }
                    if (a0VarG == a0VarG2 || a0VarG2 == null) {
                        return bVar;
                    }
                    return t.f6093d == t.f6092c ? b.B : b.C;
                } finally {
                    a0Var.Q = false;
                }
            }
            if (iOrdinal == 2) {
                return b.B;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b.A;
    }

    public static final b u(a0 a0Var, int i10) {
        if (!a0Var.R) {
            a0Var.R = true;
            try {
                r rVarD1 = a0Var.D1();
                a aVar = new a(i10);
                n nVar = (n) ((c3.z) b3.m.z(a0Var)).getFocusOwner();
                a0 a0VarG = nVar.g();
                rVarD1.f6089j.invoke(aVar);
                a0 a0VarG2 = nVar.g();
                if (aVar.f6062b) {
                    t tVar = t.f6091b;
                    return b.B;
                }
                if (a0VarG != a0VarG2 && a0VarG2 != null) {
                    return t.f6093d == t.f6092c ? b.B : b.C;
                }
            } finally {
                a0Var.R = false;
            }
        }
        return b.A;
    }

    public static final b v(a0 a0Var, int i10) throws NoWhenBranchMatchedException {
        b2.q qVarE;
        a1.n nVar;
        int iOrdinal = a0Var.G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                a0 a0VarN = n(a0Var);
                if (a0VarN != null) {
                    return t(a0VarN, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!a0Var.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                b2.q qVar = a0Var.A.E;
                l0 l0VarY = b3.m.y(a0Var);
                loop0: while (true) {
                    if (l0VarY == null) {
                        qVarE = null;
                        break;
                    }
                    if ((((b2.q) l0VarY.f2059g0.G).D & 1024) != 0) {
                        while (qVar != null) {
                            if ((qVar.C & 1024) != 0) {
                                qVarE = qVar;
                                m1.e eVar = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof a0) {
                                        break loop0;
                                    }
                                    if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                        int i11 = 0;
                                        for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                            if ((qVar2.C & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
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
                    qVar = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
                }
                a0 a0Var2 = (a0) qVarE;
                if (a0Var2 == null) {
                    return b.A;
                }
                int iOrdinal2 = a0Var2.G1().ordinal();
                if (iOrdinal2 == 0) {
                    return u(a0Var2, i10);
                }
                if (iOrdinal2 == 1) {
                    return v(a0Var2, i10);
                }
                if (iOrdinal2 == 2) {
                    return b.B;
                }
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVarV = v(a0Var2, i10);
                b bVar = bVarV != b.A ? bVarV : null;
                return bVar == null ? u(a0Var2, i10) : bVar;
            }
        }
        return b.A;
    }

    public static final boolean w(a0 a0Var) throws NoWhenBranchMatchedException {
        m1.e eVar;
        int i10;
        a0 a0Var2;
        y yVar;
        a1.n nVar;
        boolean z10;
        a1.n nVar2;
        n nVar3 = (n) ((c3.z) b3.m.z(a0Var)).getFocusOwner();
        a0 a0VarG = nVar3.g();
        y yVarG1 = a0Var.G1();
        if (a0VarG == a0Var) {
            a0Var.C1(yVarG1, yVarG1);
            return true;
        }
        if ((a0VarG == null || a0VarG.O) && !a0Var.O && !((n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).f6071a.E()) {
            return false;
        }
        if (a0VarG != null) {
            eVar = new m1.e(0, new a0[16]);
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
                            m1.e eVar2 = null;
                            while (qVarE != null) {
                                if (qVarE instanceof a0) {
                                    eVar.b((a0) qVarE);
                                } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                    int i11 = 0;
                                    for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                        if ((qVar2.C & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qVarE = qVar2;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new m1.e(0, new b2.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    eVar2.b(qVarE);
                                                    qVarE = null;
                                                }
                                                eVar2.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                qVarE = b3.m.e(eVar2);
                            }
                        }
                        qVar = qVar.E;
                    }
                }
                l0VarY = l0VarY.x();
                qVar = (l0VarY == null || (nVar2 = l0VarY.f2059g0) == null) ? null : (l2) nVar2.F;
            }
        } else {
            eVar = null;
        }
        Object[] objArr = new a0[16];
        Object[] objArr2 = new a0[16];
        if (!a0Var.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar3 = a0Var.A.E;
        l0 l0VarY2 = b3.m.y(a0Var);
        boolean z11 = true;
        int i12 = 0;
        int i13 = 0;
        while (l0VarY2 != null) {
            if ((((b2.q) l0VarY2.f2059g0.G).D & 1024) != 0) {
                while (qVar3 != null) {
                    if ((qVar3.C & 1024) != 0) {
                        b2.q qVarE2 = qVar3;
                        m1.e eVar3 = null;
                        while (qVarE2 != null) {
                            if (qVarE2 instanceof a0) {
                                a0 a0Var3 = (a0) qVarE2;
                                if (kotlin.jvm.internal.m.a(eVar != null ? Boolean.valueOf(eVar.j(a0Var3)) : null, Boolean.TRUE)) {
                                    int i14 = i12 + 1;
                                    if (objArr.length < i14) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i14, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i12] = a0Var3;
                                    i12 = i14;
                                } else {
                                    nVar3 = nVar3;
                                    int i15 = i13 + 1;
                                    if (objArr2.length < i15) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i15, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i13] = a0Var3;
                                    i13 = i15;
                                }
                                if (a0Var3 == a0VarG) {
                                    z11 = false;
                                }
                                z10 = false;
                            } else {
                                nVar3 = nVar3;
                                z10 = true;
                            }
                            if (z10 && (qVarE2.C & 1024) != 0 && (qVarE2 instanceof b3.l)) {
                                int i16 = 0;
                                for (b2.q qVar4 = ((b3.l) qVarE2).P; qVar4 != null; qVar4 = qVar4.F) {
                                    if ((qVar4.C & 1024) != 0) {
                                        int i17 = i16 + 1;
                                        if (i17 == 1) {
                                            qVarE2 = qVar4;
                                            i17 = i17;
                                        } else {
                                            m1.e eVar4 = eVar3 == null ? new m1.e(0, new b2.q[16]) : eVar3;
                                            if (qVarE2 != null) {
                                                eVar4.b(qVarE2);
                                                qVarE2 = null;
                                            }
                                            eVar4.b(qVar4);
                                            eVar3 = eVar4;
                                        }
                                        i16 = i17;
                                    }
                                }
                                if (i16 != 1) {
                                    qVarE2 = b3.m.e(eVar3);
                                }
                            } else {
                                qVarE2 = b3.m.e(eVar3);
                            }
                        }
                    }
                    qVar3 = qVar3.E;
                    nVar3 = nVar3;
                }
            }
            n nVar4 = nVar3;
            l0VarY2 = l0VarY2.x();
            qVar3 = (l0VarY2 == null || (nVar = l0VarY2.f2059g0) == null) ? null : (l2) nVar.F;
            nVar3 = nVar4;
        }
        n nVar5 = nVar3;
        if (!z11 || a0VarG == null || d(a0VarG, false)) {
            b3.m.t(a0Var, new j0(a0Var, 11));
            int iOrdinal = a0Var.G1().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ((n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).j(a0Var);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).j(a0Var);
                }
            }
            if (z11 && a0VarG != null) {
                a0VarG.C1(y.A, y.C);
            }
            if (eVar != null) {
                int i18 = eVar.C - 1;
                Object[] objArr5 = eVar.A;
                if (i18 < objArr5.length) {
                    while (i18 >= 0) {
                        a0 a0Var4 = (a0) objArr5[i18];
                        if (nVar5.g() == a0Var) {
                            a0Var4.C1(y.B, y.C);
                            i18--;
                        }
                    }
                    i10 = i13 - 1;
                    if (i10 < objArr2.length) {
                        while (i10 >= 0) {
                            a0Var2 = (a0) objArr2[i10];
                            if (nVar5.g() == a0Var) {
                                if (a0Var2 == a0VarG) {
                                    yVar = y.A;
                                } else {
                                    yVar = y.C;
                                }
                                a0Var2.C1(yVar, y.B);
                                i10--;
                            }
                        }
                        if (nVar5.g() == a0Var) {
                            a0Var.C1(yVarG1, y.A);
                            if (nVar5.g() != a0Var) {
                                return true;
                            }
                        }
                    } else if (nVar5.g() == a0Var) {
                        a0Var.C1(yVarG1, y.A);
                        if (nVar5.g() != a0Var) {
                            return true;
                        }
                    }
                } else {
                    i10 = i13 - 1;
                    if (i10 < objArr2.length) {
                        while (i10 >= 0) {
                            a0Var2 = (a0) objArr2[i10];
                            if (nVar5.g() == a0Var) {
                                if (a0Var2 == a0VarG) {
                                    yVar = y.A;
                                } else {
                                    yVar = y.C;
                                }
                                a0Var2.C1(yVar, y.B);
                                i10--;
                            }
                        }
                        if (nVar5.g() == a0Var) {
                            a0Var.C1(yVarG1, y.A);
                            if (nVar5.g() != a0Var) {
                                return true;
                            }
                        }
                    } else if (nVar5.g() == a0Var) {
                        a0Var.C1(yVarG1, y.A);
                        if (nVar5.g() != a0Var) {
                            return true;
                        }
                    }
                }
            } else {
                i10 = i13 - 1;
                if (i10 < objArr2.length) {
                    while (i10 >= 0) {
                        a0Var2 = (a0) objArr2[i10];
                        if (nVar5.g() == a0Var) {
                            if (a0Var2 == a0VarG) {
                                yVar = y.A;
                            } else {
                                yVar = y.C;
                            }
                            a0Var2.C1(yVar, y.B);
                            i10--;
                        }
                    }
                    if (nVar5.g() == a0Var) {
                        a0Var.C1(yVarG1, y.A);
                        if (nVar5.g() != a0Var) {
                            return true;
                        }
                    }
                } else if (nVar5.g() == a0Var) {
                    a0Var.C1(yVarG1, y.A);
                    if (nVar5.g() != a0Var) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean x(a0 a0Var, n0 n0Var) {
        Object[] objArr = new a0[16];
        if (!a0Var.A.N) {
            y2.a.c("visitChildren called on an unattached node");
        }
        m1.e eVar = new m1.e(0, new b2.q[16]);
        b2.q qVar = a0Var.A;
        b2.q qVar2 = qVar.F;
        if (qVar2 == null) {
            b3.m.b(eVar, qVar);
        } else {
            eVar.b(qVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.C;
            if (i11 == 0) {
                break;
            }
            b2.q qVarE = (b2.q) eVar.k(i11 - 1);
            if ((qVarE.D & 1024) == 0) {
                b3.m.b(eVar, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.C & 1024) != 0) {
                        m1.e eVar2 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof a0) {
                                a0 a0Var2 = (a0) qVarE;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = a0Var2;
                                i10 = i12;
                            } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                int i13 = 0;
                                for (b2.q qVar3 = ((b3.l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                    if ((qVar3.C & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar2.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar2.b(qVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            qVarE = b3.m.e(eVar2);
                        }
                        break;
                    }
                    qVarE = qVarE.F;
                }
            }
        }
        Arrays.sort(objArr, 0, i10, b0.A);
        int i14 = i10 - 1;
        if (i14 < objArr.length) {
            while (i14 >= 0) {
                a0 a0Var3 = (a0) objArr[i14];
                if (r(a0Var3) && a(a0Var3, n0Var)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    public static final boolean y(a0 a0Var, n0 n0Var) {
        Object[] objArr = new a0[16];
        if (!a0Var.A.N) {
            y2.a.c("visitChildren called on an unattached node");
        }
        m1.e eVar = new m1.e(0, new b2.q[16]);
        b2.q qVar = a0Var.A;
        b2.q qVar2 = qVar.F;
        if (qVar2 == null) {
            b3.m.b(eVar, qVar);
        } else {
            eVar.b(qVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.C;
            if (i11 == 0) {
                break;
            }
            b2.q qVarE = (b2.q) eVar.k(i11 - 1);
            if ((qVarE.D & 1024) == 0) {
                b3.m.b(eVar, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.C & 1024) != 0) {
                        m1.e eVar2 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof a0) {
                                a0 a0Var2 = (a0) qVarE;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = a0Var2;
                                i10 = i12;
                            } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                int i13 = 0;
                                for (b2.q qVar3 = ((b3.l) qVarE).P; qVar3 != null; qVar3 = qVar3.F) {
                                    if ((qVar3.C & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar2.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar2.b(qVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            qVarE = b3.m.e(eVar2);
                        }
                        break;
                    }
                    qVarE = qVarE.F;
                }
            }
        }
        Arrays.sort(objArr, 0, i10, b0.A);
        for (int i14 = 0; i14 < i10; i14++) {
            a0 a0Var3 = (a0) objArr[i14];
            if (r(a0Var3) && k(a0Var3, n0Var)) {
                return true;
            }
        }
        return false;
    }

    public static final Object z(a0 a0Var, int i10, u00.k kVar) {
        int i11;
        int i12;
        Object objInvoke;
        b2.q qVarE;
        l0.t tVarF1;
        a1.n nVar;
        if (!a0Var.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar = a0Var.A.E;
        l0 l0VarY = b3.m.y(a0Var);
        loop0: while (true) {
            i11 = 0;
            i12 = 1;
            objInvoke = null;
            if (l0VarY == null) {
                qVarE = null;
                break;
            }
            if ((((b2.q) l0VarY.f2059g0.G).D & 1024) != 0) {
                while (qVar != null) {
                    if ((qVar.C & 1024) != 0) {
                        qVarE = qVar;
                        m1.e eVar = null;
                        while (qVarE != null) {
                            if (qVarE instanceof a0) {
                                break loop0;
                            }
                            if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                int i13 = 0;
                                for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                    if ((qVar2.C & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
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
        a0 a0Var2 = (a0) qVarE;
        if ((a0Var2 != null && kotlin.jvm.internal.m.a(a0Var2.F1(), a0Var.F1())) || (tVarF1 = a0Var.F1()) == null) {
            return null;
        }
        int i14 = 5;
        if (i10 == 5) {
            i12 = i14;
        } else {
            i14 = 6;
            if (i10 == 6) {
                i12 = i14;
            } else {
                i14 = 3;
                if (i10 == 3) {
                    i12 = i14;
                } else {
                    i14 = 4;
                    if (i10 == 4) {
                        i12 = i14;
                    } else if (i10 == 1) {
                        i12 = 2;
                    } else if (i10 != 2) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
        }
        if (tVarF1.O.a() <= 0 || !tVarF1.O.d() || !tVarF1.N) {
            return kVar.invoke(l0.t.R);
        }
        int iB = tVarF1.C1(i12) ? tVarF1.O.b() : tVarF1.O.e();
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        hf.c cVar = tVarF1.P;
        cVar.getClass();
        l0.o oVar = new l0.o(iB, iB);
        ((m1.e) cVar.B).b(oVar);
        zVar.A = oVar;
        int iC = tVarF1.O.c() * 2;
        int iA = tVarF1.O.a();
        if (iC > iA) {
            iC = iA;
        }
        while (objInvoke == null && tVarF1.B1((l0.o) zVar.A, i12) && i11 < iC) {
            l0.o oVar2 = (l0.o) zVar.A;
            int i15 = oVar2.f9780a;
            int i16 = oVar2.f9781b;
            if (tVarF1.C1(i12)) {
                i16++;
            } else {
                i15--;
            }
            hf.c cVar2 = tVarF1.P;
            cVar2.getClass();
            l0.o oVar3 = new l0.o(i15, i16);
            ((m1.e) cVar2.B).b(oVar3);
            ((m1.e) tVarF1.P.B).j((l0.o) zVar.A);
            zVar.A = oVar3;
            i11++;
            b3.m.y(tVarF1).l();
            objInvoke = kVar.invoke(new l0.s(tVarF1, zVar, i12));
        }
        ((m1.e) tVarF1.P.B).j((l0.o) zVar.A);
        b3.m.y(tVarF1).l();
        return objInvoke;
    }
}
