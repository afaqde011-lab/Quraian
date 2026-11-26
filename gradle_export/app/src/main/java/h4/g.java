package h4;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class g {

    public static final b f6587a = new b();

    public static boolean a(g4.e eVar) {
        int[] iArr = eVar.f6150o0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        g4.e eVar2 = eVar.S;
        g4.f fVar = eVar2 != null ? (g4.f) eVar2 : null;
        if (fVar != null) {
            int i12 = fVar.f6150o0[0];
        }
        if (fVar != null) {
            int i13 = fVar.f6150o0[1];
        }
        boolean z10 = i10 == 1 || eVar.x() || i10 == 2 || (i10 == 3 && eVar.f6152q == 0 && eVar.V == 0.0f && eVar.q(0)) || (i10 == 3 && eVar.f6152q == 1 && eVar.r(0, eVar.n()));
        boolean z11 = i11 == 1 || eVar.y() || i11 == 2 || (i11 == 3 && eVar.f6153r == 0 && eVar.V == 0.0f && eVar.q(1)) || (i10 == 3 && eVar.f6153r == 1 && eVar.r(1, eVar.k()));
        return (eVar.V > 0.0f && (z10 || z11)) || (z10 && z11);
    }

    public static m b(g4.e eVar, int i10, ArrayList arrayList, m mVar) {
        int i11;
        int i12 = i10 == 0 ? eVar.f6146m0 : eVar.f6148n0;
        if (i12 != -1 && (mVar == null || i12 != mVar.f6594b)) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                m mVar2 = (m) arrayList.get(i13);
                if (mVar2.f6594b == i12) {
                    if (mVar != null) {
                        mVar.c(i10, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                    break;
                }
            }
        } else if (i12 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (eVar instanceof g4.j) {
                g4.j jVar = (g4.j) eVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= jVar.f6206q0) {
                        i11 = -1;
                        break;
                    }
                    g4.e eVar2 = jVar.f6205p0[i14];
                    if ((i10 == 0 && (i11 = eVar2.f6146m0) != -1) || (i10 == 1 && (i11 = eVar2.f6148n0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        m mVar3 = (m) arrayList.get(i15);
                        if (mVar3.f6594b == i11) {
                            mVar = mVar3;
                            break;
                        }
                    }
                }
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f6593a = new ArrayList();
                mVar.f6596d = null;
                mVar.f6597e = -1;
                int i16 = m.f6592f;
                m.f6592f = i16 + 1;
                mVar.f6594b = i16;
                mVar.f6595c = i10;
            }
            arrayList.add(mVar);
        }
        int i17 = mVar.f6594b;
        ArrayList arrayList2 = mVar.f6593a;
        if (arrayList2.contains(eVar)) {
            return mVar;
        }
        arrayList2.add(eVar);
        if (eVar instanceof g4.i) {
            g4.i iVar = (g4.i) eVar;
            iVar.f6202s0.c(iVar.f6203t0 == 0 ? 1 : 0, mVar, arrayList);
        }
        if (i10 == 0) {
            eVar.f6146m0 = i17;
            eVar.H.c(i10, mVar, arrayList);
            eVar.J.c(i10, mVar, arrayList);
        } else {
            eVar.f6148n0 = i17;
            eVar.I.c(i10, mVar, arrayList);
            eVar.L.c(i10, mVar, arrayList);
            eVar.K.c(i10, mVar, arrayList);
        }
        eVar.O.c(i10, mVar, arrayList);
        return mVar;
    }

    public static void c(int i10, g4.e eVar, j4.f fVar, boolean z10) {
        g4.d dVar;
        g4.d dVar2;
        char c10;
        g4.d dVar3;
        g4.d dVar4;
        g4.d dVar5;
        if (eVar.l) {
            return;
        }
        if (!(eVar instanceof g4.f) && eVar.w() && a(eVar)) {
            g4.f.Q(eVar, fVar, new b());
        }
        g4.d dVarI = eVar.i(2);
        g4.d dVarI2 = eVar.i(4);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet<g4.d> hashSet = dVarI.f6114a;
        if (hashSet != null && dVarI.f6116c) {
            for (g4.d dVar6 : hashSet) {
                g4.e eVar2 = dVar6.f6117d;
                int i11 = i10 + 1;
                boolean zA = a(eVar2);
                g4.d dVar7 = eVar2.H;
                g4.d dVar8 = eVar2.J;
                if (eVar2.w() && zA) {
                    c10 = 0;
                    g4.f.Q(eVar2, fVar, new b());
                } else {
                    c10 = 0;
                }
                int i12 = eVar2.f6150o0[c10];
                if (i12 != 3 || zA) {
                    if (!eVar2.w()) {
                        if (dVar6 == dVar7 && dVar8.f6119f == null) {
                            int iE = dVar7.e() + iD;
                            eVar2.E(iE, eVar2.n() + iE);
                            c(i11, eVar2, fVar, z10);
                        } else if (dVar6 == dVar8 && dVar7.f6119f == null) {
                            int iE2 = iD - dVar8.e();
                            eVar2.E(iE2 - eVar2.n(), iE2);
                            c(i11, eVar2, fVar, z10);
                        } else if (dVar6 == dVar7 && (dVar3 = dVar8.f6119f) != null && dVar3.f6116c && !eVar2.u()) {
                            d(i11, eVar2, fVar, z10);
                        }
                    }
                } else if (i12 == 3 && eVar2.f6156u >= 0 && eVar2.f6155t >= 0 && (eVar2.f6134f0 == 8 || (eVar2.f6152q == 0 && eVar2.V == 0.0f))) {
                    if (!eVar2.u() && !eVar2.E && ((dVar6 == dVar7 && (dVar5 = dVar8.f6119f) != null && dVar5.f6116c) || (dVar6 == dVar8 && (dVar4 = dVar7.f6119f) != null && dVar4.f6116c))) {
                        if (!eVar2.u()) {
                            e(i11, eVar, fVar, eVar2, z10);
                        }
                    }
                }
            }
        }
        if (eVar instanceof g4.i) {
            return;
        }
        HashSet<g4.d> hashSet2 = dVarI2.f6114a;
        if (hashSet2 != null && dVarI2.f6116c) {
            for (g4.d dVar9 : hashSet2) {
                g4.e eVar3 = dVar9.f6117d;
                int i13 = i10 + 1;
                boolean zA2 = a(eVar3);
                g4.d dVar10 = eVar3.H;
                g4.d dVar11 = eVar3.J;
                if (eVar3.w() && zA2) {
                    g4.f.Q(eVar3, fVar, new b());
                }
                boolean z11 = (dVar9 == dVar10 && (dVar2 = dVar11.f6119f) != null && dVar2.f6116c) || (dVar9 == dVar11 && (dVar = dVar10.f6119f) != null && dVar.f6116c);
                int i14 = eVar3.f6150o0[0];
                if (i14 != 3 || zA2) {
                    if (!eVar3.w()) {
                        if (dVar9 == dVar10 && dVar11.f6119f == null) {
                            int iE3 = dVar10.e() + iD2;
                            eVar3.E(iE3, eVar3.n() + iE3);
                            c(i13, eVar3, fVar, z10);
                        } else if (dVar9 == dVar11 && dVar10.f6119f == null) {
                            int iE4 = iD2 - dVar11.e();
                            eVar3.E(iE4 - eVar3.n(), iE4);
                            c(i13, eVar3, fVar, z10);
                        } else if (z11 && !eVar3.u()) {
                            d(i13, eVar3, fVar, z10);
                        }
                    }
                } else if (i14 == 3 && eVar3.f6156u >= 0 && eVar3.f6155t >= 0 && (eVar3.f6134f0 == 8 || (eVar3.f6152q == 0 && eVar3.V == 0.0f))) {
                    if (!eVar3.u() && !eVar3.E && z11 && !eVar3.u()) {
                        e(i13, eVar, fVar, eVar3, z10);
                    }
                }
            }
        }
        eVar.l = true;
    }

    public static void d(int i10, g4.e eVar, j4.f fVar, boolean z10) {
        float f3 = eVar.f6128c0;
        g4.d dVar = eVar.H;
        int iD = dVar.f6119f.d();
        g4.d dVar2 = eVar.J;
        int iD2 = dVar2.f6119f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f3 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = eVar.n();
        int i11 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i11 = (iD - iD2) - iN;
        }
        int i12 = ((int) (i11 > 0 ? (f3 * i11) + 0.5f : f3 * i11)) + iD;
        int i13 = i12 + iN;
        if (iD > iD2) {
            i13 = i12 - iN;
        }
        eVar.E(i12, i13);
        c(i10 + 1, eVar, fVar, z10);
    }

    public static void e(int i10, g4.e eVar, j4.f fVar, g4.e eVar2, boolean z10) {
        float f3 = eVar2.f6128c0;
        g4.d dVar = eVar2.H;
        int iE = dVar.e() + dVar.f6119f.d();
        g4.d dVar2 = eVar2.J;
        int iD = dVar2.f6119f.d() - dVar2.e();
        if (iD >= iE) {
            int iN = eVar2.n();
            if (eVar2.f6134f0 != 8) {
                int i11 = eVar2.f6152q;
                if (i11 == 2) {
                    iN = (int) (eVar2.f6128c0 * 0.5f * (eVar instanceof g4.f ? eVar.n() : eVar.S.n()));
                } else if (i11 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(eVar2.f6155t, iN);
                int i12 = eVar2.f6156u;
                if (i12 > 0) {
                    iN = Math.min(i12, iN);
                }
            }
            int i13 = iE + ((int) ((f3 * ((iD - iE) - iN)) + 0.5f));
            eVar2.E(i13, iN + i13);
            c(i10 + 1, eVar2, fVar, z10);
        }
    }

    public static void f(int i10, g4.e eVar, j4.f fVar) {
        float f3 = eVar.f6130d0;
        g4.d dVar = eVar.I;
        int iD = dVar.f6119f.d();
        g4.d dVar2 = eVar.K;
        int iD2 = dVar2.f6119f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f3 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = eVar.k();
        int i11 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i11 = (iD - iD2) - iK;
        }
        int i12 = (int) (i11 > 0 ? (f3 * i11) + 0.5f : f3 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iK;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iK;
        }
        eVar.F(i13, i14);
        i(i10 + 1, eVar, fVar);
    }

    public static void g(int i10, g4.e eVar, j4.f fVar, g4.e eVar2) {
        float f3 = eVar2.f6130d0;
        g4.d dVar = eVar2.I;
        int iE = dVar.e() + dVar.f6119f.d();
        g4.d dVar2 = eVar2.K;
        int iD = dVar2.f6119f.d() - dVar2.e();
        if (iD >= iE) {
            int iK = eVar2.k();
            if (eVar2.f6134f0 != 8) {
                int i11 = eVar2.f6153r;
                if (i11 == 2) {
                    iK = (int) (f3 * 0.5f * (eVar instanceof g4.f ? eVar.k() : eVar.S.k()));
                } else if (i11 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(eVar2.f6158w, iK);
                int i12 = eVar2.f6159x;
                if (i12 > 0) {
                    iK = Math.min(i12, iK);
                }
            }
            int i13 = iE + ((int) ((f3 * ((iD - iE) - iK)) + 0.5f));
            eVar2.F(i13, iK + i13);
            i(i10 + 1, eVar2, fVar);
        }
    }

    public static boolean h(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }

    public static void i(int i10, g4.e eVar, j4.f fVar) {
        g4.d dVar;
        g4.d dVar2;
        float f3;
        g4.d dVar3;
        g4.d dVar4;
        g4.d dVar5;
        if (eVar.m) {
            return;
        }
        if (!(eVar instanceof g4.f) && eVar.w() && a(eVar)) {
            g4.f.Q(eVar, fVar, new b());
        }
        g4.d dVarI = eVar.i(3);
        g4.d dVarI2 = eVar.i(5);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet<g4.d> hashSet = dVarI.f6114a;
        if (hashSet != null && dVarI.f6116c) {
            for (g4.d dVar6 : hashSet) {
                g4.e eVar2 = dVar6.f6117d;
                int i11 = i10 + 1;
                boolean zA = a(eVar2);
                g4.d dVar7 = eVar2.I;
                g4.d dVar8 = eVar2.K;
                if (eVar2.w() && zA) {
                    f3 = 0.0f;
                    g4.f.Q(eVar2, fVar, new b());
                } else {
                    f3 = 0.0f;
                }
                int i12 = eVar2.f6150o0[1];
                if (i12 != 3 || zA) {
                    if (!eVar2.w()) {
                        if (dVar6 == dVar7 && dVar8.f6119f == null) {
                            int iE = dVar7.e() + iD;
                            eVar2.F(iE, eVar2.k() + iE);
                            i(i11, eVar2, fVar);
                        } else if (dVar6 == dVar8 && dVar8.f6119f == null) {
                            int iE2 = iD - dVar8.e();
                            eVar2.F(iE2 - eVar2.k(), iE2);
                            i(i11, eVar2, fVar);
                        } else if (dVar6 == dVar7 && (dVar3 = dVar8.f6119f) != null && dVar3.f6116c) {
                            f(i11, eVar2, fVar);
                        }
                    }
                } else if (i12 == 3 && eVar2.f6159x >= 0 && eVar2.f6158w >= 0 && (eVar2.f6134f0 == 8 || (eVar2.f6153r == 0 && eVar2.V == f3))) {
                    if (!eVar2.v() && !eVar2.E && ((dVar6 == dVar7 && (dVar5 = dVar8.f6119f) != null && dVar5.f6116c) || (dVar6 == dVar8 && (dVar4 = dVar7.f6119f) != null && dVar4.f6116c))) {
                        if (!eVar2.v()) {
                            g(i11, eVar, fVar, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof g4.i) {
            return;
        }
        HashSet<g4.d> hashSet2 = dVarI2.f6114a;
        if (hashSet2 != null && dVarI2.f6116c) {
            for (g4.d dVar9 : hashSet2) {
                g4.e eVar3 = dVar9.f6117d;
                int i13 = i10 + 1;
                boolean zA2 = a(eVar3);
                g4.d dVar10 = eVar3.I;
                g4.d dVar11 = eVar3.K;
                if (eVar3.w() && zA2) {
                    g4.f.Q(eVar3, fVar, new b());
                }
                boolean z10 = (dVar9 == dVar10 && (dVar2 = dVar11.f6119f) != null && dVar2.f6116c) || (dVar9 == dVar11 && (dVar = dVar10.f6119f) != null && dVar.f6116c);
                int i14 = eVar3.f6150o0[1];
                if (i14 != 3 || zA2) {
                    if (!eVar3.w()) {
                        if (dVar9 == dVar10 && dVar11.f6119f == null) {
                            int iE3 = dVar10.e() + iD2;
                            eVar3.F(iE3, eVar3.k() + iE3);
                            i(i13, eVar3, fVar);
                        } else if (dVar9 == dVar11 && dVar10.f6119f == null) {
                            int iE4 = iD2 - dVar11.e();
                            eVar3.F(iE4 - eVar3.k(), iE4);
                            i(i13, eVar3, fVar);
                        } else if (z10 && !eVar3.v()) {
                            f(i13, eVar3, fVar);
                        }
                    }
                } else if (i14 == 3 && eVar3.f6159x >= 0 && eVar3.f6158w >= 0 && (eVar3.f6134f0 == 8 || (eVar3.f6153r == 0 && eVar3.V == 0.0f))) {
                    if (!eVar3.v() && !eVar3.E && z10 && !eVar3.v()) {
                        g(i13, eVar, fVar, eVar3);
                    }
                }
            }
        }
        g4.d dVarI3 = eVar.i(6);
        if (dVarI3.f6114a != null && dVarI3.f6116c) {
            int iD3 = dVarI3.d();
            for (g4.d dVar12 : dVarI3.f6114a) {
                g4.e eVar4 = dVar12.f6117d;
                int i15 = i10 + 1;
                boolean zA3 = a(eVar4);
                g4.d dVar13 = eVar4.L;
                if (eVar4.w() && zA3) {
                    g4.f.Q(eVar4, fVar, new b());
                }
                if (eVar4.f6150o0[1] != 3 || zA3) {
                    if (!eVar4.w() && dVar12 == dVar13) {
                        int iE5 = dVar12.e() + iD3;
                        if (eVar4.D) {
                            int i16 = iE5 - eVar4.Z;
                            int i17 = eVar4.U + i16;
                            eVar4.Y = i16;
                            eVar4.I.l(i16);
                            eVar4.K.l(i17);
                            dVar13.l(iE5);
                            eVar4.f6143k = true;
                        }
                        i(i15, eVar4, fVar);
                    }
                }
            }
        }
        eVar.m = true;
    }
}
