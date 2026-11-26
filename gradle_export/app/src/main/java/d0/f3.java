package d0;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.NoWhenBranchMatchedException;

public abstract class f3 {

    public static final q0 f4430a = new q0(3, null, 2);

    public static final java.lang.Object a(v2.i0 r5, boolean r6, v2.l r7, m00.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: d0.f3.a(v2.i0, boolean, v2.l, m00.a):java.lang.Object");
    }

    public static Object b(v2.i0 i0Var, m00.a aVar, int i10) {
        v2.l lVar = v2.l.A;
        boolean z10 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            lVar = v2.l.B;
        }
        return a(i0Var, z10, lVar, aVar);
    }

    public static final java.lang.Object c(v2.i0 r8, m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: d0.f3.c(v2.i0, m00.c):java.lang.Object");
    }

    public static Object d(v2.v vVar, u00.o oVar, u00.k kVar, k00.c cVar, int i10) {
        if ((i10 & 4) != 0) {
            oVar = f4430a;
        }
        Object objK = a40.c0.k(new androidx.lifecycle.n0(vVar, (Object) null, (Object) null, oVar, kVar, (k00.c) null, 1), cVar);
        return objK == l00.a.A ? objK : g00.b0.a;
    }

    public static boolean e(v2.k kVar, boolean z10) {
        ?? r4 = kVar.f15387a;
        int size = r4.size();
        for (int i10 = 0; i10 < size; i10++) {
            v2.s sVar = (v2.s) r4.get(i10);
            if (!(z10 ? v2.r.a(sVar) : v2.r.b(sVar))) {
                return false;
            }
        }
        return true;
    }

    public static a40.u1 f(a40.z zVar, a40.e1 e1Var, u00.n nVar) {
        return a40.c0.y(zVar, (k00.i) null, a40.a0.D, new a1.e2(e1Var, nVar, (k00.c) null), 1);
    }

    public static final Object g(v2.i0 i0Var, a40.z zVar, t1 t1Var, u00.k kVar, u00.k kVar2, u00.o oVar, u00.k kVar3, m00.a aVar) throws NoWhenBranchMatchedException {
        b3 b3Var;
        u00.k kVar4;
        u00.k kVar5;
        v2.i0 i0Var2;
        u00.k kVar6;
        a40.z zVar2;
        t1 t1Var2;
        u00.o oVar2;
        v2.s sVar;
        g00.b0 b0Var;
        k00.c cVar;
        a40.e1 e1VarY;
        t1 t1Var3;
        u00.o oVar3;
        Object objH;
        u00.k kVar7;
        a40.e1 e1Var;
        v2.i0 i0Var3;
        u00.k kVar8;
        Object objI;
        u00.k kVar9;
        t1 t1Var4;
        u00.o oVar4;
        u00.k kVar10;
        u00.k kVar11;
        k00.c cVar2;
        t1 t1Var5;
        a40.e1 e1VarF;
        u00.k kVar12;
        Object objJ;
        k00.c cVar3;
        u00.k kVar13;
        u00.k kVar14;
        u00.k kVar15;
        u00.o oVar5;
        g1 g1Var;
        t1 t1Var6;
        a40.z zVar3;
        v2.s sVar2;
        a40.e1 e1VarY2;
        t1 t1Var7;
        Object objH2;
        a40.e1 e1Var2;
        v2.s sVar3;
        u00.k kVar16;
        t1 t1Var8;
        u00.k kVar17;
        v2.i0 i0Var4;
        u00.k kVar18;
        a40.z zVar4;
        k00.c cVar4;
        g1 g1Var2;
        a40.e1 e1Var3;
        t1 t1Var9;
        a40.z zVar5;
        if (aVar instanceof b3) {
            b3Var = (b3) aVar;
            int i10 = b3Var.K;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b3Var.K = i10 - Integer.MIN_VALUE;
            } else {
                b3Var = new b3(aVar);
            }
        } else {
            b3Var = new b3(aVar);
        }
        Object objI2 = b3Var.J;
        l00.a aVar2 = l00.a.A;
        int i11 = b3Var.K;
        f1 f1Var = f1.f4429a;
        q0 q0Var = f4430a;
        g00.b0 b0Var2 = g00.b0.a;
        switch (i11) {
            case 0:
                ri.t1.O(objI2);
                b3Var.A = i0Var;
                b3Var.B = zVar;
                b3Var.C = t1Var;
                kVar4 = kVar;
                b3Var.D = kVar4;
                kVar5 = kVar2;
                b3Var.E = kVar5;
                b3Var.F = oVar;
                b3Var.G = kVar3;
                b3Var.K = 1;
                Object objB = b(i0Var, b3Var, 3);
                if (objB != aVar2) {
                    i0Var2 = i0Var;
                    kVar6 = kVar3;
                    zVar2 = zVar;
                    objI2 = objB;
                    t1Var2 = t1Var;
                    oVar2 = oVar;
                    v2.s sVar4 = (v2.s) objI2;
                    sVar4.a();
                    sVar = sVar4;
                    b0Var = b0Var2;
                    cVar = null;
                    e1VarY = a40.c0.y(zVar2, (k00.i) null, a40.a0.D, new z2(t1Var2, cVar, 1), 1);
                    if (oVar2 != q0Var) {
                        u00.o oVar6 = oVar2;
                        t1 t1Var10 = t1Var2;
                        oVar3 = oVar6;
                        t1Var3 = t1Var10;
                        f(zVar2, e1VarY, new c3(oVar6, t1Var10, sVar, cVar, 0));
                    } else {
                        t1Var3 = t1Var2;
                        oVar3 = oVar2;
                    }
                    if (kVar5 == null) {
                        b3Var.A = i0Var2;
                        b3Var.B = zVar2;
                        b3Var.C = t1Var3;
                        b3Var.D = kVar4;
                        b3Var.E = kVar5;
                        b3Var.F = oVar3;
                        b3Var.G = kVar6;
                        b3Var.H = e1VarY;
                        b3Var.K = 2;
                        objI = i(i0Var2, v2.l.B, b3Var);
                        if (objI != aVar2) {
                            kVar9 = kVar6;
                            e1Var = e1VarY;
                            objI2 = objI;
                            u00.o oVar7 = oVar3;
                            t1Var4 = t1Var3;
                            oVar4 = oVar7;
                            u00.k kVar19 = kVar5;
                            kVar10 = kVar4;
                            kVar11 = kVar19;
                            cVar2 = (v2.s) objI2;
                            i0Var3 = i0Var2;
                            t1Var5 = t1Var4;
                            oVar3 = oVar4;
                            if (cVar2 == null) {
                                e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 3));
                            } else {
                                cVar2.a();
                                e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 4));
                            }
                            if (cVar2 != null) {
                                if (kVar10 == null) {
                                    b3Var.A = i0Var3;
                                    b3Var.B = zVar2;
                                    b3Var.C = t1Var5;
                                    b3Var.D = kVar10;
                                    b3Var.E = kVar11;
                                    b3Var.F = oVar3;
                                    b3Var.G = kVar9;
                                    b3Var.H = cVar2;
                                    b3Var.I = e1VarF;
                                    b3Var.K = 5;
                                    kVar12 = kVar9;
                                    objJ = i0Var3.j(i0Var3.f().a(), new w2(cVar2, cVar), b3Var);
                                    if (objJ != aVar2) {
                                        cVar3 = cVar2;
                                        objI2 = objJ;
                                        kVar13 = kVar12;
                                        kVar14 = kVar11;
                                        kVar15 = kVar10;
                                        oVar5 = oVar3;
                                        sVar2 = (v2.s) objI2;
                                        if (sVar2 != null) {
                                            e1VarY2 = a40.c0.y(zVar2, cVar, a40.a0.D, new i2(e1VarF, t1Var5, cVar, 1), 1);
                                            if (oVar5 != q0Var) {
                                                u00.o oVar8 = oVar5;
                                                t1 t1Var11 = t1Var5;
                                                t1Var7 = t1Var11;
                                                f(zVar2, e1VarY2, new c3(oVar8, t1Var11, sVar2, cVar, 1));
                                            } else {
                                                t1Var7 = t1Var5;
                                            }
                                            if (kVar14 == null) {
                                                b3Var.A = zVar2;
                                                b3Var.B = t1Var7;
                                                b3Var.C = kVar15;
                                                b3Var.D = kVar13;
                                                b3Var.E = e1VarY2;
                                                b3Var.F = cVar3;
                                                b3Var.G = cVar;
                                                b3Var.H = cVar;
                                                b3Var.I = cVar;
                                                b3Var.K = 6;
                                                objI2 = i(i0Var3, v2.l.B, b3Var);
                                                if (objI2 != aVar2) {
                                                    e1Var2 = e1VarY2;
                                                    cVar3 = cVar3;
                                                    kVar16 = kVar13;
                                                    kVar18 = kVar15;
                                                    zVar4 = zVar2;
                                                    cVar4 = (v2.s) objI2;
                                                    if (cVar4 != null) {
                                                        cVar4.a();
                                                        f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                        kVar18.invoke(new h2.b(cVar4.f15401c));
                                                        return b0Var;
                                                    }
                                                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                    if (kVar16 != null) {
                                                        kVar16.invoke(new h2.b(cVar3.f15401c));
                                                        return b0Var;
                                                    }
                                                }
                                            } else {
                                                b3Var.A = i0Var3;
                                                b3Var.B = zVar2;
                                                b3Var.C = t1Var7;
                                                b3Var.D = kVar15;
                                                b3Var.E = kVar14;
                                                b3Var.F = kVar13;
                                                b3Var.G = e1VarY2;
                                                b3Var.H = cVar3;
                                                b3Var.I = r22;
                                                b3Var.K = 7;
                                                objH2 = h(i0Var3, v2.l.B, b3Var);
                                                if (objH2 != aVar2) {
                                                    u00.k kVar20 = kVar13;
                                                    e1Var2 = e1VarY2;
                                                    sVar3 = sVar2;
                                                    objI2 = objH2;
                                                    kVar16 = kVar20;
                                                    t1Var8 = t1Var7;
                                                    kVar17 = kVar15;
                                                    i0Var4 = i0Var3;
                                                    g1Var2 = (g1) objI2;
                                                    if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                                                        kVar14.invoke(new h2.b(sVar3.f15401c));
                                                        b3Var.A = zVar2;
                                                        b3Var.B = t1Var8;
                                                        b3Var.C = e1Var2;
                                                        b3Var.D = cVar;
                                                        b3Var.E = cVar;
                                                        b3Var.F = cVar;
                                                        b3Var.G = cVar;
                                                        b3Var.H = cVar;
                                                        b3Var.I = cVar;
                                                        b3Var.K = 8;
                                                        if (c(i0Var4, b3Var) != aVar2) {
                                                            e1Var3 = e1Var2;
                                                            t1Var9 = t1Var8;
                                                            zVar5 = zVar2;
                                                            f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                                                            return b0Var;
                                                        }
                                                    } else {
                                                        if (g1Var2 instanceof e1) {
                                                            cVar4 = ((e1) g1Var2).f4422a;
                                                        } else {
                                                            if (g1Var2 instanceof d1) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            cVar4 = cVar;
                                                        }
                                                        kVar18 = kVar17;
                                                        t1Var7 = t1Var8;
                                                        zVar4 = zVar2;
                                                        if (cVar4 != null) {
                                                            cVar4.a();
                                                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                            kVar18.invoke(new h2.b(cVar4.f15401c));
                                                            return b0Var;
                                                        }
                                                        f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                        if (kVar16 != null) {
                                                            kVar16.invoke(new h2.b(cVar3.f15401c));
                                                            return b0Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (kVar13 != null) {
                                            kVar13.invoke(new h2.b(cVar3.f15401c));
                                            return b0Var;
                                        }
                                    }
                                } else if (kVar9 != null) {
                                    kVar9.invoke(new h2.b(cVar2.f15401c));
                                    return b0Var;
                                }
                            }
                            return b0Var;
                        }
                    } else {
                        b3Var.A = i0Var2;
                        b3Var.B = zVar2;
                        b3Var.C = t1Var3;
                        b3Var.D = kVar4;
                        b3Var.E = kVar5;
                        b3Var.F = oVar3;
                        b3Var.G = kVar6;
                        b3Var.H = sVar;
                        b3Var.I = e1VarY;
                        b3Var.K = 3;
                        objH = h(i0Var2, v2.l.B, b3Var);
                        if (objH != aVar2) {
                            u00.k kVar21 = kVar4;
                            kVar7 = kVar6;
                            e1Var = e1VarY;
                            objI2 = objH;
                            i0Var3 = i0Var2;
                            kVar8 = kVar21;
                            g1Var = (g1) objI2;
                            if (!kotlin.jvm.internal.m.a(g1Var, f1Var)) {
                                if (g1Var instanceof e1) {
                                    cVar2 = ((e1) g1Var).f4422a;
                                } else {
                                    if (!(g1Var instanceof d1)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar2 = cVar;
                                }
                                kVar9 = kVar7;
                                kVar11 = kVar5;
                                kVar10 = kVar8;
                                t1Var5 = t1Var3;
                                if (cVar2 == null) {
                                    e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 3));
                                } else {
                                    cVar2.a();
                                    e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 4));
                                }
                                if (cVar2 != null) {
                                    if (kVar10 == null) {
                                        b3Var.A = i0Var3;
                                        b3Var.B = zVar2;
                                        b3Var.C = t1Var5;
                                        b3Var.D = kVar10;
                                        b3Var.E = kVar11;
                                        b3Var.F = oVar3;
                                        b3Var.G = kVar9;
                                        b3Var.H = cVar2;
                                        b3Var.I = e1VarF;
                                        b3Var.K = 5;
                                        kVar12 = kVar9;
                                        objJ = i0Var3.j(i0Var3.f().a(), new w2(cVar2, cVar), b3Var);
                                        if (objJ != aVar2) {
                                            cVar3 = cVar2;
                                            objI2 = objJ;
                                            kVar13 = kVar12;
                                            kVar14 = kVar11;
                                            kVar15 = kVar10;
                                            oVar5 = oVar3;
                                            sVar2 = (v2.s) objI2;
                                            if (sVar2 != null) {
                                                e1VarY2 = a40.c0.y(zVar2, cVar, a40.a0.D, new i2(e1VarF, t1Var5, cVar, 1), 1);
                                                if (oVar5 != q0Var) {
                                                    u00.o oVar9 = oVar5;
                                                    t1 t1Var12 = t1Var5;
                                                    t1Var7 = t1Var12;
                                                    f(zVar2, e1VarY2, new c3(oVar9, t1Var12, sVar2, cVar, 1));
                                                } else {
                                                    t1Var7 = t1Var5;
                                                }
                                                if (kVar14 == null) {
                                                    b3Var.A = zVar2;
                                                    b3Var.B = t1Var7;
                                                    b3Var.C = kVar15;
                                                    b3Var.D = kVar13;
                                                    b3Var.E = e1VarY2;
                                                    b3Var.F = cVar3;
                                                    b3Var.G = cVar;
                                                    b3Var.H = cVar;
                                                    b3Var.I = cVar;
                                                    b3Var.K = 6;
                                                    objI2 = i(i0Var3, v2.l.B, b3Var);
                                                    if (objI2 != aVar2) {
                                                        e1Var2 = e1VarY2;
                                                        cVar3 = cVar3;
                                                        kVar16 = kVar13;
                                                        kVar18 = kVar15;
                                                        zVar4 = zVar2;
                                                        cVar4 = (v2.s) objI2;
                                                        if (cVar4 != null) {
                                                            cVar4.a();
                                                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                            kVar18.invoke(new h2.b(cVar4.f15401c));
                                                            return b0Var;
                                                        }
                                                        f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                        if (kVar16 != null) {
                                                            kVar16.invoke(new h2.b(cVar3.f15401c));
                                                            return b0Var;
                                                        }
                                                    }
                                                } else {
                                                    b3Var.A = i0Var3;
                                                    b3Var.B = zVar2;
                                                    b3Var.C = t1Var7;
                                                    b3Var.D = kVar15;
                                                    b3Var.E = kVar14;
                                                    b3Var.F = kVar13;
                                                    b3Var.G = e1VarY2;
                                                    b3Var.H = cVar3;
                                                    b3Var.I = r22;
                                                    b3Var.K = 7;
                                                    objH2 = h(i0Var3, v2.l.B, b3Var);
                                                    if (objH2 != aVar2) {
                                                        u00.k kVar22 = kVar13;
                                                        e1Var2 = e1VarY2;
                                                        sVar3 = sVar2;
                                                        objI2 = objH2;
                                                        kVar16 = kVar22;
                                                        t1Var8 = t1Var7;
                                                        kVar17 = kVar15;
                                                        i0Var4 = i0Var3;
                                                        g1Var2 = (g1) objI2;
                                                        if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                                                            kVar14.invoke(new h2.b(sVar3.f15401c));
                                                            b3Var.A = zVar2;
                                                            b3Var.B = t1Var8;
                                                            b3Var.C = e1Var2;
                                                            b3Var.D = cVar;
                                                            b3Var.E = cVar;
                                                            b3Var.F = cVar;
                                                            b3Var.G = cVar;
                                                            b3Var.H = cVar;
                                                            b3Var.I = cVar;
                                                            b3Var.K = 8;
                                                            if (c(i0Var4, b3Var) != aVar2) {
                                                                e1Var3 = e1Var2;
                                                                t1Var9 = t1Var8;
                                                                zVar5 = zVar2;
                                                                f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                                                                return b0Var;
                                                            }
                                                        } else {
                                                            if (g1Var2 instanceof e1) {
                                                                cVar4 = ((e1) g1Var2).f4422a;
                                                            } else {
                                                                if (g1Var2 instanceof d1) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                cVar4 = cVar;
                                                            }
                                                            kVar18 = kVar17;
                                                            t1Var7 = t1Var8;
                                                            zVar4 = zVar2;
                                                            if (cVar4 != null) {
                                                                cVar4.a();
                                                                f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                                kVar18.invoke(new h2.b(cVar4.f15401c));
                                                                return b0Var;
                                                            }
                                                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                            if (kVar16 != null) {
                                                                kVar16.invoke(new h2.b(cVar3.f15401c));
                                                                return b0Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (kVar13 != null) {
                                                kVar13.invoke(new h2.b(cVar3.f15401c));
                                                return b0Var;
                                            }
                                        }
                                    } else if (kVar9 != null) {
                                        kVar9.invoke(new h2.b(cVar2.f15401c));
                                        return b0Var;
                                    }
                                }
                                return b0Var;
                            }
                            kVar5.invoke(new h2.b(sVar.f15401c));
                            b3Var.A = zVar2;
                            b3Var.B = t1Var3;
                            b3Var.C = e1Var;
                            b3Var.D = cVar;
                            b3Var.E = cVar;
                            b3Var.F = cVar;
                            b3Var.G = cVar;
                            b3Var.H = cVar;
                            b3Var.I = cVar;
                            b3Var.K = 4;
                            if (c(i0Var3, b3Var) != aVar2) {
                                t1Var6 = t1Var3;
                                zVar3 = zVar2;
                                f(zVar3, e1Var, new y2(t1Var6, cVar, 2));
                                return b0Var;
                            }
                        }
                    }
                }
                return aVar2;
            case 1:
                kVar6 = (u00.k) b3Var.G;
                oVar2 = (u00.o) b3Var.F;
                u00.k kVar23 = (u00.k) b3Var.E;
                u00.k kVar24 = b3Var.D;
                t1Var2 = (t1) b3Var.C;
                zVar2 = (a40.z) b3Var.B;
                i0Var2 = (v2.i0) b3Var.A;
                ri.t1.O(objI2);
                kVar5 = kVar23;
                kVar4 = kVar24;
                v2.s sVar5 = (v2.s) objI2;
                sVar5.a();
                sVar = sVar5;
                b0Var = b0Var2;
                cVar = null;
                e1VarY = a40.c0.y(zVar2, (k00.i) null, a40.a0.D, new z2(t1Var2, cVar, 1), 1);
                if (oVar2 != q0Var) {
                    u00.o oVar10 = oVar2;
                    t1 t1Var13 = t1Var2;
                    oVar3 = oVar10;
                    t1Var3 = t1Var13;
                    f(zVar2, e1VarY, new c3(oVar10, t1Var13, sVar, cVar, 0));
                } else {
                    t1Var3 = t1Var2;
                    oVar3 = oVar2;
                }
                if (kVar5 == null) {
                    b3Var.A = i0Var2;
                    b3Var.B = zVar2;
                    b3Var.C = t1Var3;
                    b3Var.D = kVar4;
                    b3Var.E = kVar5;
                    b3Var.F = oVar3;
                    b3Var.G = kVar6;
                    b3Var.H = e1VarY;
                    b3Var.K = 2;
                    objI = i(i0Var2, v2.l.B, b3Var);
                    if (objI != aVar2) {
                        kVar9 = kVar6;
                        e1Var = e1VarY;
                        objI2 = objI;
                        u00.o oVar11 = oVar3;
                        t1Var4 = t1Var3;
                        oVar4 = oVar11;
                        u00.k kVar110 = kVar5;
                        kVar10 = kVar4;
                        kVar11 = kVar110;
                        cVar2 = (v2.s) objI2;
                        i0Var3 = i0Var2;
                        t1Var5 = t1Var4;
                        oVar3 = oVar4;
                        if (cVar2 == null) {
                            e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 3));
                        } else {
                            cVar2.a();
                            e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 4));
                        }
                        if (cVar2 != null) {
                            if (kVar10 == null) {
                                b3Var.A = i0Var3;
                                b3Var.B = zVar2;
                                b3Var.C = t1Var5;
                                b3Var.D = kVar10;
                                b3Var.E = kVar11;
                                b3Var.F = oVar3;
                                b3Var.G = kVar9;
                                b3Var.H = cVar2;
                                b3Var.I = e1VarF;
                                b3Var.K = 5;
                                kVar12 = kVar9;
                                objJ = i0Var3.j(i0Var3.f().a(), new w2(cVar2, cVar), b3Var);
                                if (objJ != aVar2) {
                                    cVar3 = cVar2;
                                    objI2 = objJ;
                                    kVar13 = kVar12;
                                    kVar14 = kVar11;
                                    kVar15 = kVar10;
                                    oVar5 = oVar3;
                                    sVar2 = (v2.s) objI2;
                                    if (sVar2 != null) {
                                        e1VarY2 = a40.c0.y(zVar2, cVar, a40.a0.D, new i2(e1VarF, t1Var5, cVar, 1), 1);
                                        if (oVar5 != q0Var) {
                                            u00.o oVar12 = oVar5;
                                            t1 t1Var14 = t1Var5;
                                            t1Var7 = t1Var14;
                                            f(zVar2, e1VarY2, new c3(oVar12, t1Var14, sVar2, cVar, 1));
                                        } else {
                                            t1Var7 = t1Var5;
                                        }
                                        if (kVar14 == null) {
                                            b3Var.A = zVar2;
                                            b3Var.B = t1Var7;
                                            b3Var.C = kVar15;
                                            b3Var.D = kVar13;
                                            b3Var.E = e1VarY2;
                                            b3Var.F = cVar3;
                                            b3Var.G = cVar;
                                            b3Var.H = cVar;
                                            b3Var.I = cVar;
                                            b3Var.K = 6;
                                            objI2 = i(i0Var3, v2.l.B, b3Var);
                                            if (objI2 != aVar2) {
                                                e1Var2 = e1VarY2;
                                                cVar3 = cVar3;
                                                kVar16 = kVar13;
                                                kVar18 = kVar15;
                                                zVar4 = zVar2;
                                                cVar4 = (v2.s) objI2;
                                                if (cVar4 != null) {
                                                    cVar4.a();
                                                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                    kVar18.invoke(new h2.b(cVar4.f15401c));
                                                    return b0Var;
                                                }
                                                f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                if (kVar16 != null) {
                                                    kVar16.invoke(new h2.b(cVar3.f15401c));
                                                    return b0Var;
                                                }
                                            }
                                        } else {
                                            b3Var.A = i0Var3;
                                            b3Var.B = zVar2;
                                            b3Var.C = t1Var7;
                                            b3Var.D = kVar15;
                                            b3Var.E = kVar14;
                                            b3Var.F = kVar13;
                                            b3Var.G = e1VarY2;
                                            b3Var.H = cVar3;
                                            b3Var.I = r22;
                                            b3Var.K = 7;
                                            objH2 = h(i0Var3, v2.l.B, b3Var);
                                            if (objH2 != aVar2) {
                                                u00.k kVar25 = kVar13;
                                                e1Var2 = e1VarY2;
                                                sVar3 = sVar2;
                                                objI2 = objH2;
                                                kVar16 = kVar25;
                                                t1Var8 = t1Var7;
                                                kVar17 = kVar15;
                                                i0Var4 = i0Var3;
                                                g1Var2 = (g1) objI2;
                                                if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                                                    kVar14.invoke(new h2.b(sVar3.f15401c));
                                                    b3Var.A = zVar2;
                                                    b3Var.B = t1Var8;
                                                    b3Var.C = e1Var2;
                                                    b3Var.D = cVar;
                                                    b3Var.E = cVar;
                                                    b3Var.F = cVar;
                                                    b3Var.G = cVar;
                                                    b3Var.H = cVar;
                                                    b3Var.I = cVar;
                                                    b3Var.K = 8;
                                                    if (c(i0Var4, b3Var) != aVar2) {
                                                        e1Var3 = e1Var2;
                                                        t1Var9 = t1Var8;
                                                        zVar5 = zVar2;
                                                        f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                                                        return b0Var;
                                                    }
                                                } else {
                                                    if (g1Var2 instanceof e1) {
                                                        cVar4 = ((e1) g1Var2).f4422a;
                                                    } else {
                                                        if (g1Var2 instanceof d1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        cVar4 = cVar;
                                                    }
                                                    kVar18 = kVar17;
                                                    t1Var7 = t1Var8;
                                                    zVar4 = zVar2;
                                                    if (cVar4 != null) {
                                                        cVar4.a();
                                                        f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                        kVar18.invoke(new h2.b(cVar4.f15401c));
                                                        return b0Var;
                                                    }
                                                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                    if (kVar16 != null) {
                                                        kVar16.invoke(new h2.b(cVar3.f15401c));
                                                        return b0Var;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (kVar13 != null) {
                                        kVar13.invoke(new h2.b(cVar3.f15401c));
                                        return b0Var;
                                    }
                                }
                            } else if (kVar9 != null) {
                                kVar9.invoke(new h2.b(cVar2.f15401c));
                                return b0Var;
                            }
                        }
                        return b0Var;
                    }
                } else {
                    b3Var.A = i0Var2;
                    b3Var.B = zVar2;
                    b3Var.C = t1Var3;
                    b3Var.D = kVar4;
                    b3Var.E = kVar5;
                    b3Var.F = oVar3;
                    b3Var.G = kVar6;
                    b3Var.H = sVar;
                    b3Var.I = e1VarY;
                    b3Var.K = 3;
                    objH = h(i0Var2, v2.l.B, b3Var);
                    if (objH != aVar2) {
                        u00.k kVar26 = kVar4;
                        kVar7 = kVar6;
                        e1Var = e1VarY;
                        objI2 = objH;
                        i0Var3 = i0Var2;
                        kVar8 = kVar26;
                        g1Var = (g1) objI2;
                        if (!kotlin.jvm.internal.m.a(g1Var, f1Var)) {
                            if (g1Var instanceof e1) {
                                cVar2 = ((e1) g1Var).f4422a;
                            } else {
                                if (!(g1Var instanceof d1)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2 = cVar;
                            }
                            kVar9 = kVar7;
                            kVar11 = kVar5;
                            kVar10 = kVar8;
                            t1Var5 = t1Var3;
                            if (cVar2 == null) {
                                e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 3));
                            } else {
                                cVar2.a();
                                e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 4));
                            }
                            if (cVar2 != null) {
                                if (kVar10 == null) {
                                    b3Var.A = i0Var3;
                                    b3Var.B = zVar2;
                                    b3Var.C = t1Var5;
                                    b3Var.D = kVar10;
                                    b3Var.E = kVar11;
                                    b3Var.F = oVar3;
                                    b3Var.G = kVar9;
                                    b3Var.H = cVar2;
                                    b3Var.I = e1VarF;
                                    b3Var.K = 5;
                                    kVar12 = kVar9;
                                    objJ = i0Var3.j(i0Var3.f().a(), new w2(cVar2, cVar), b3Var);
                                    if (objJ != aVar2) {
                                        cVar3 = cVar2;
                                        objI2 = objJ;
                                        kVar13 = kVar12;
                                        kVar14 = kVar11;
                                        kVar15 = kVar10;
                                        oVar5 = oVar3;
                                        sVar2 = (v2.s) objI2;
                                        if (sVar2 != null) {
                                            e1VarY2 = a40.c0.y(zVar2, cVar, a40.a0.D, new i2(e1VarF, t1Var5, cVar, 1), 1);
                                            if (oVar5 != q0Var) {
                                                u00.o oVar13 = oVar5;
                                                t1 t1Var15 = t1Var5;
                                                t1Var7 = t1Var15;
                                                f(zVar2, e1VarY2, new c3(oVar13, t1Var15, sVar2, cVar, 1));
                                            } else {
                                                t1Var7 = t1Var5;
                                            }
                                            if (kVar14 == null) {
                                                b3Var.A = zVar2;
                                                b3Var.B = t1Var7;
                                                b3Var.C = kVar15;
                                                b3Var.D = kVar13;
                                                b3Var.E = e1VarY2;
                                                b3Var.F = cVar3;
                                                b3Var.G = cVar;
                                                b3Var.H = cVar;
                                                b3Var.I = cVar;
                                                b3Var.K = 6;
                                                objI2 = i(i0Var3, v2.l.B, b3Var);
                                                if (objI2 != aVar2) {
                                                    e1Var2 = e1VarY2;
                                                    cVar3 = cVar3;
                                                    kVar16 = kVar13;
                                                    kVar18 = kVar15;
                                                    zVar4 = zVar2;
                                                    cVar4 = (v2.s) objI2;
                                                    if (cVar4 != null) {
                                                        cVar4.a();
                                                        f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                        kVar18.invoke(new h2.b(cVar4.f15401c));
                                                        return b0Var;
                                                    }
                                                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                    if (kVar16 != null) {
                                                        kVar16.invoke(new h2.b(cVar3.f15401c));
                                                        return b0Var;
                                                    }
                                                }
                                            } else {
                                                b3Var.A = i0Var3;
                                                b3Var.B = zVar2;
                                                b3Var.C = t1Var7;
                                                b3Var.D = kVar15;
                                                b3Var.E = kVar14;
                                                b3Var.F = kVar13;
                                                b3Var.G = e1VarY2;
                                                b3Var.H = cVar3;
                                                b3Var.I = r22;
                                                b3Var.K = 7;
                                                objH2 = h(i0Var3, v2.l.B, b3Var);
                                                if (objH2 != aVar2) {
                                                    u00.k kVar27 = kVar13;
                                                    e1Var2 = e1VarY2;
                                                    sVar3 = sVar2;
                                                    objI2 = objH2;
                                                    kVar16 = kVar27;
                                                    t1Var8 = t1Var7;
                                                    kVar17 = kVar15;
                                                    i0Var4 = i0Var3;
                                                    g1Var2 = (g1) objI2;
                                                    if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                                                        kVar14.invoke(new h2.b(sVar3.f15401c));
                                                        b3Var.A = zVar2;
                                                        b3Var.B = t1Var8;
                                                        b3Var.C = e1Var2;
                                                        b3Var.D = cVar;
                                                        b3Var.E = cVar;
                                                        b3Var.F = cVar;
                                                        b3Var.G = cVar;
                                                        b3Var.H = cVar;
                                                        b3Var.I = cVar;
                                                        b3Var.K = 8;
                                                        if (c(i0Var4, b3Var) != aVar2) {
                                                            e1Var3 = e1Var2;
                                                            t1Var9 = t1Var8;
                                                            zVar5 = zVar2;
                                                            f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                                                            return b0Var;
                                                        }
                                                    } else {
                                                        if (g1Var2 instanceof e1) {
                                                            cVar4 = ((e1) g1Var2).f4422a;
                                                        } else {
                                                            if (g1Var2 instanceof d1) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            cVar4 = cVar;
                                                        }
                                                        kVar18 = kVar17;
                                                        t1Var7 = t1Var8;
                                                        zVar4 = zVar2;
                                                        if (cVar4 != null) {
                                                            cVar4.a();
                                                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                            kVar18.invoke(new h2.b(cVar4.f15401c));
                                                            return b0Var;
                                                        }
                                                        f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                        if (kVar16 != null) {
                                                            kVar16.invoke(new h2.b(cVar3.f15401c));
                                                            return b0Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (kVar13 != null) {
                                            kVar13.invoke(new h2.b(cVar3.f15401c));
                                            return b0Var;
                                        }
                                    }
                                } else if (kVar9 != null) {
                                    kVar9.invoke(new h2.b(cVar2.f15401c));
                                    return b0Var;
                                }
                            }
                            return b0Var;
                        }
                        kVar5.invoke(new h2.b(sVar.f15401c));
                        b3Var.A = zVar2;
                        b3Var.B = t1Var3;
                        b3Var.C = e1Var;
                        b3Var.D = cVar;
                        b3Var.E = cVar;
                        b3Var.F = cVar;
                        b3Var.G = cVar;
                        b3Var.H = cVar;
                        b3Var.I = cVar;
                        b3Var.K = 4;
                        if (c(i0Var3, b3Var) != aVar2) {
                            t1Var6 = t1Var3;
                            zVar3 = zVar2;
                            f(zVar3, e1Var, new y2(t1Var6, cVar, 2));
                            return b0Var;
                        }
                    }
                }
                return aVar2;
            case 2:
                e1Var = (a40.e1) b3Var.H;
                kVar9 = (u00.k) b3Var.G;
                oVar4 = (u00.o) b3Var.F;
                kVar11 = (u00.k) b3Var.E;
                kVar10 = b3Var.D;
                t1Var4 = (t1) b3Var.C;
                zVar2 = (a40.z) b3Var.B;
                i0Var2 = (v2.i0) b3Var.A;
                ri.t1.O(objI2);
                b0Var = b0Var2;
                cVar = null;
                cVar2 = (v2.s) objI2;
                i0Var3 = i0Var2;
                t1Var5 = t1Var4;
                oVar3 = oVar4;
                if (cVar2 == null) {
                    e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 3));
                } else {
                    cVar2.a();
                    e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 4));
                }
                if (cVar2 != null) {
                    if (kVar10 == null) {
                        b3Var.A = i0Var3;
                        b3Var.B = zVar2;
                        b3Var.C = t1Var5;
                        b3Var.D = kVar10;
                        b3Var.E = kVar11;
                        b3Var.F = oVar3;
                        b3Var.G = kVar9;
                        b3Var.H = cVar2;
                        b3Var.I = e1VarF;
                        b3Var.K = 5;
                        kVar12 = kVar9;
                        objJ = i0Var3.j(i0Var3.f().a(), new w2(cVar2, cVar), b3Var);
                        if (objJ != aVar2) {
                            cVar3 = cVar2;
                            objI2 = objJ;
                            kVar13 = kVar12;
                            kVar14 = kVar11;
                            kVar15 = kVar10;
                            oVar5 = oVar3;
                            sVar2 = (v2.s) objI2;
                            if (sVar2 != null) {
                                e1VarY2 = a40.c0.y(zVar2, cVar, a40.a0.D, new i2(e1VarF, t1Var5, cVar, 1), 1);
                                if (oVar5 != q0Var) {
                                    u00.o oVar14 = oVar5;
                                    t1 t1Var16 = t1Var5;
                                    t1Var7 = t1Var16;
                                    f(zVar2, e1VarY2, new c3(oVar14, t1Var16, sVar2, cVar, 1));
                                } else {
                                    t1Var7 = t1Var5;
                                }
                                if (kVar14 == null) {
                                    b3Var.A = zVar2;
                                    b3Var.B = t1Var7;
                                    b3Var.C = kVar15;
                                    b3Var.D = kVar13;
                                    b3Var.E = e1VarY2;
                                    b3Var.F = cVar3;
                                    b3Var.G = cVar;
                                    b3Var.H = cVar;
                                    b3Var.I = cVar;
                                    b3Var.K = 6;
                                    objI2 = i(i0Var3, v2.l.B, b3Var);
                                    if (objI2 != aVar2) {
                                        e1Var2 = e1VarY2;
                                        cVar3 = cVar3;
                                        kVar16 = kVar13;
                                        kVar18 = kVar15;
                                        zVar4 = zVar2;
                                        cVar4 = (v2.s) objI2;
                                        if (cVar4 != null) {
                                            cVar4.a();
                                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                            kVar18.invoke(new h2.b(cVar4.f15401c));
                                            return b0Var;
                                        }
                                        f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                        if (kVar16 != null) {
                                            kVar16.invoke(new h2.b(cVar3.f15401c));
                                            return b0Var;
                                        }
                                    }
                                } else {
                                    b3Var.A = i0Var3;
                                    b3Var.B = zVar2;
                                    b3Var.C = t1Var7;
                                    b3Var.D = kVar15;
                                    b3Var.E = kVar14;
                                    b3Var.F = kVar13;
                                    b3Var.G = e1VarY2;
                                    b3Var.H = cVar3;
                                    b3Var.I = r22;
                                    b3Var.K = 7;
                                    objH2 = h(i0Var3, v2.l.B, b3Var);
                                    if (objH2 != aVar2) {
                                        u00.k kVar28 = kVar13;
                                        e1Var2 = e1VarY2;
                                        sVar3 = sVar2;
                                        objI2 = objH2;
                                        kVar16 = kVar28;
                                        t1Var8 = t1Var7;
                                        kVar17 = kVar15;
                                        i0Var4 = i0Var3;
                                        g1Var2 = (g1) objI2;
                                        if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                                            kVar14.invoke(new h2.b(sVar3.f15401c));
                                            b3Var.A = zVar2;
                                            b3Var.B = t1Var8;
                                            b3Var.C = e1Var2;
                                            b3Var.D = cVar;
                                            b3Var.E = cVar;
                                            b3Var.F = cVar;
                                            b3Var.G = cVar;
                                            b3Var.H = cVar;
                                            b3Var.I = cVar;
                                            b3Var.K = 8;
                                            if (c(i0Var4, b3Var) != aVar2) {
                                                e1Var3 = e1Var2;
                                                t1Var9 = t1Var8;
                                                zVar5 = zVar2;
                                                f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                                                return b0Var;
                                            }
                                        } else {
                                            if (g1Var2 instanceof e1) {
                                                cVar4 = ((e1) g1Var2).f4422a;
                                            } else {
                                                if (g1Var2 instanceof d1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                cVar4 = cVar;
                                            }
                                            kVar18 = kVar17;
                                            t1Var7 = t1Var8;
                                            zVar4 = zVar2;
                                            if (cVar4 != null) {
                                                cVar4.a();
                                                f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                kVar18.invoke(new h2.b(cVar4.f15401c));
                                                return b0Var;
                                            }
                                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                            if (kVar16 != null) {
                                                kVar16.invoke(new h2.b(cVar3.f15401c));
                                                return b0Var;
                                            }
                                        }
                                    }
                                }
                            } else if (kVar13 != null) {
                                kVar13.invoke(new h2.b(cVar3.f15401c));
                                return b0Var;
                            }
                        }
                        return aVar2;
                    }
                    if (kVar9 != null) {
                        kVar9.invoke(new h2.b(cVar2.f15401c));
                        return b0Var;
                    }
                }
                return b0Var;
            case 3:
                e1Var = (a40.e1) b3Var.I;
                sVar = (v2.s) b3Var.H;
                u00.k kVar29 = (u00.k) b3Var.G;
                u00.o oVar15 = (u00.o) b3Var.F;
                kVar5 = (u00.k) b3Var.E;
                u00.k kVar30 = b3Var.D;
                t1 t1Var17 = (t1) b3Var.C;
                a40.z zVar6 = (a40.z) b3Var.B;
                i0Var3 = (v2.i0) b3Var.A;
                ri.t1.O(objI2);
                kVar7 = kVar29;
                t1Var3 = t1Var17;
                zVar2 = zVar6;
                kVar8 = kVar30;
                oVar3 = oVar15;
                b0Var = b0Var2;
                cVar = null;
                g1Var = (g1) objI2;
                if (!kotlin.jvm.internal.m.a(g1Var, f1Var)) {
                    if (g1Var instanceof e1) {
                        cVar2 = ((e1) g1Var).f4422a;
                    } else {
                        if (!(g1Var instanceof d1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar2 = cVar;
                    }
                    kVar9 = kVar7;
                    kVar11 = kVar5;
                    kVar10 = kVar8;
                    t1Var5 = t1Var3;
                    if (cVar2 == null) {
                        e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 3));
                    } else {
                        cVar2.a();
                        e1VarF = f(zVar2, e1Var, new y2(t1Var5, cVar, 4));
                    }
                    if (cVar2 != null) {
                        if (kVar10 == null) {
                            b3Var.A = i0Var3;
                            b3Var.B = zVar2;
                            b3Var.C = t1Var5;
                            b3Var.D = kVar10;
                            b3Var.E = kVar11;
                            b3Var.F = oVar3;
                            b3Var.G = kVar9;
                            b3Var.H = cVar2;
                            b3Var.I = e1VarF;
                            b3Var.K = 5;
                            kVar12 = kVar9;
                            objJ = i0Var3.j(i0Var3.f().a(), new w2(cVar2, cVar), b3Var);
                            if (objJ != aVar2) {
                                cVar3 = cVar2;
                                objI2 = objJ;
                                kVar13 = kVar12;
                                kVar14 = kVar11;
                                kVar15 = kVar10;
                                oVar5 = oVar3;
                                sVar2 = (v2.s) objI2;
                                if (sVar2 != null) {
                                    e1VarY2 = a40.c0.y(zVar2, cVar, a40.a0.D, new i2(e1VarF, t1Var5, cVar, 1), 1);
                                    if (oVar5 != q0Var) {
                                        u00.o oVar16 = oVar5;
                                        t1 t1Var18 = t1Var5;
                                        t1Var7 = t1Var18;
                                        f(zVar2, e1VarY2, new c3(oVar16, t1Var18, sVar2, cVar, 1));
                                    } else {
                                        t1Var7 = t1Var5;
                                    }
                                    if (kVar14 == null) {
                                        b3Var.A = zVar2;
                                        b3Var.B = t1Var7;
                                        b3Var.C = kVar15;
                                        b3Var.D = kVar13;
                                        b3Var.E = e1VarY2;
                                        b3Var.F = cVar3;
                                        b3Var.G = cVar;
                                        b3Var.H = cVar;
                                        b3Var.I = cVar;
                                        b3Var.K = 6;
                                        objI2 = i(i0Var3, v2.l.B, b3Var);
                                        if (objI2 != aVar2) {
                                            e1Var2 = e1VarY2;
                                            cVar3 = cVar3;
                                            kVar16 = kVar13;
                                            kVar18 = kVar15;
                                            zVar4 = zVar2;
                                            cVar4 = (v2.s) objI2;
                                            if (cVar4 != null) {
                                                cVar4.a();
                                                f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                kVar18.invoke(new h2.b(cVar4.f15401c));
                                                return b0Var;
                                            }
                                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                            if (kVar16 != null) {
                                                kVar16.invoke(new h2.b(cVar3.f15401c));
                                                return b0Var;
                                            }
                                        }
                                    } else {
                                        b3Var.A = i0Var3;
                                        b3Var.B = zVar2;
                                        b3Var.C = t1Var7;
                                        b3Var.D = kVar15;
                                        b3Var.E = kVar14;
                                        b3Var.F = kVar13;
                                        b3Var.G = e1VarY2;
                                        b3Var.H = cVar3;
                                        b3Var.I = r22;
                                        b3Var.K = 7;
                                        objH2 = h(i0Var3, v2.l.B, b3Var);
                                        if (objH2 != aVar2) {
                                            u00.k kVar210 = kVar13;
                                            e1Var2 = e1VarY2;
                                            sVar3 = sVar2;
                                            objI2 = objH2;
                                            kVar16 = kVar210;
                                            t1Var8 = t1Var7;
                                            kVar17 = kVar15;
                                            i0Var4 = i0Var3;
                                            g1Var2 = (g1) objI2;
                                            if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                                                kVar14.invoke(new h2.b(sVar3.f15401c));
                                                b3Var.A = zVar2;
                                                b3Var.B = t1Var8;
                                                b3Var.C = e1Var2;
                                                b3Var.D = cVar;
                                                b3Var.E = cVar;
                                                b3Var.F = cVar;
                                                b3Var.G = cVar;
                                                b3Var.H = cVar;
                                                b3Var.I = cVar;
                                                b3Var.K = 8;
                                                if (c(i0Var4, b3Var) != aVar2) {
                                                    e1Var3 = e1Var2;
                                                    t1Var9 = t1Var8;
                                                    zVar5 = zVar2;
                                                    f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                                                    return b0Var;
                                                }
                                            } else {
                                                if (g1Var2 instanceof e1) {
                                                    cVar4 = ((e1) g1Var2).f4422a;
                                                } else {
                                                    if (g1Var2 instanceof d1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    cVar4 = cVar;
                                                }
                                                kVar18 = kVar17;
                                                t1Var7 = t1Var8;
                                                zVar4 = zVar2;
                                                if (cVar4 != null) {
                                                    cVar4.a();
                                                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                                    kVar18.invoke(new h2.b(cVar4.f15401c));
                                                    return b0Var;
                                                }
                                                f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                                if (kVar16 != null) {
                                                    kVar16.invoke(new h2.b(cVar3.f15401c));
                                                    return b0Var;
                                                }
                                            }
                                        }
                                    }
                                } else if (kVar13 != null) {
                                    kVar13.invoke(new h2.b(cVar3.f15401c));
                                    return b0Var;
                                }
                            }
                        } else if (kVar9 != null) {
                            kVar9.invoke(new h2.b(cVar2.f15401c));
                            return b0Var;
                        }
                    }
                    return b0Var;
                }
                kVar5.invoke(new h2.b(sVar.f15401c));
                b3Var.A = zVar2;
                b3Var.B = t1Var3;
                b3Var.C = e1Var;
                b3Var.D = cVar;
                b3Var.E = cVar;
                b3Var.F = cVar;
                b3Var.G = cVar;
                b3Var.H = cVar;
                b3Var.I = cVar;
                b3Var.K = 4;
                if (c(i0Var3, b3Var) != aVar2) {
                    t1Var6 = t1Var3;
                    zVar3 = zVar2;
                    f(zVar3, e1Var, new y2(t1Var6, cVar, 2));
                    return b0Var;
                }
                return aVar2;
            case 4:
                e1Var = (a40.e1) b3Var.C;
                t1Var6 = (t1) b3Var.B;
                zVar3 = (a40.z) b3Var.A;
                ri.t1.O(objI2);
                b0Var = b0Var2;
                cVar = null;
                f(zVar3, e1Var, new y2(t1Var6, cVar, 2));
                return b0Var;
            case 5:
                e1VarF = (a40.e1) b3Var.I;
                cVar3 = (v2.s) b3Var.H;
                kVar13 = (u00.k) b3Var.G;
                oVar5 = (u00.o) b3Var.F;
                u00.k kVar31 = (u00.k) b3Var.E;
                u00.k kVar32 = b3Var.D;
                t1Var5 = (t1) b3Var.C;
                a40.z zVar7 = (a40.z) b3Var.B;
                v2.i0 i0Var5 = (v2.i0) b3Var.A;
                ri.t1.O(objI2);
                i0Var3 = i0Var5;
                kVar15 = kVar32;
                zVar2 = zVar7;
                b0Var = b0Var2;
                kVar14 = kVar31;
                cVar = null;
                sVar2 = (v2.s) objI2;
                if (sVar2 != null) {
                    e1VarY2 = a40.c0.y(zVar2, cVar, a40.a0.D, new i2(e1VarF, t1Var5, cVar, 1), 1);
                    if (oVar5 != q0Var) {
                        u00.o oVar17 = oVar5;
                        t1 t1Var19 = t1Var5;
                        t1Var7 = t1Var19;
                        f(zVar2, e1VarY2, new c3(oVar17, t1Var19, sVar2, cVar, 1));
                    } else {
                        t1Var7 = t1Var5;
                    }
                    if (kVar14 == null) {
                        b3Var.A = zVar2;
                        b3Var.B = t1Var7;
                        b3Var.C = kVar15;
                        b3Var.D = kVar13;
                        b3Var.E = e1VarY2;
                        b3Var.F = cVar3;
                        b3Var.G = cVar;
                        b3Var.H = cVar;
                        b3Var.I = cVar;
                        b3Var.K = 6;
                        objI2 = i(i0Var3, v2.l.B, b3Var);
                        if (objI2 != aVar2) {
                            e1Var2 = e1VarY2;
                            cVar3 = cVar3;
                            kVar16 = kVar13;
                            kVar18 = kVar15;
                            zVar4 = zVar2;
                            cVar4 = (v2.s) objI2;
                            if (cVar4 != null) {
                                cVar4.a();
                                f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                kVar18.invoke(new h2.b(cVar4.f15401c));
                                return b0Var;
                            }
                            f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                            if (kVar16 != null) {
                                kVar16.invoke(new h2.b(cVar3.f15401c));
                                return b0Var;
                            }
                        }
                    } else {
                        b3Var.A = i0Var3;
                        b3Var.B = zVar2;
                        b3Var.C = t1Var7;
                        b3Var.D = kVar15;
                        b3Var.E = kVar14;
                        b3Var.F = kVar13;
                        b3Var.G = e1VarY2;
                        b3Var.H = cVar3;
                        b3Var.I = r22;
                        b3Var.K = 7;
                        objH2 = h(i0Var3, v2.l.B, b3Var);
                        if (objH2 != aVar2) {
                            u00.k kVar211 = kVar13;
                            e1Var2 = e1VarY2;
                            sVar3 = sVar2;
                            objI2 = objH2;
                            kVar16 = kVar211;
                            t1Var8 = t1Var7;
                            kVar17 = kVar15;
                            i0Var4 = i0Var3;
                            g1Var2 = (g1) objI2;
                            if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                                kVar14.invoke(new h2.b(sVar3.f15401c));
                                b3Var.A = zVar2;
                                b3Var.B = t1Var8;
                                b3Var.C = e1Var2;
                                b3Var.D = cVar;
                                b3Var.E = cVar;
                                b3Var.F = cVar;
                                b3Var.G = cVar;
                                b3Var.H = cVar;
                                b3Var.I = cVar;
                                b3Var.K = 8;
                                if (c(i0Var4, b3Var) != aVar2) {
                                    e1Var3 = e1Var2;
                                    t1Var9 = t1Var8;
                                    zVar5 = zVar2;
                                    f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                                    return b0Var;
                                }
                            } else {
                                if (g1Var2 instanceof e1) {
                                    cVar4 = ((e1) g1Var2).f4422a;
                                } else {
                                    if (g1Var2 instanceof d1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar4 = cVar;
                                }
                                kVar18 = kVar17;
                                t1Var7 = t1Var8;
                                zVar4 = zVar2;
                                if (cVar4 != null) {
                                    cVar4.a();
                                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                                    kVar18.invoke(new h2.b(cVar4.f15401c));
                                    return b0Var;
                                }
                                f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                                if (kVar16 != null) {
                                    kVar16.invoke(new h2.b(cVar3.f15401c));
                                    return b0Var;
                                }
                            }
                        }
                    }
                    return aVar2;
                }
                if (kVar13 != null) {
                    kVar13.invoke(new h2.b(cVar3.f15401c));
                    return b0Var;
                }
                return b0Var;
            case 6:
                cVar3 = (v2.s) b3Var.F;
                e1Var2 = (a40.e1) b3Var.E;
                kVar16 = b3Var.D;
                kVar18 = (u00.k) b3Var.C;
                t1Var7 = (t1) b3Var.B;
                zVar4 = (a40.z) b3Var.A;
                ri.t1.O(objI2);
                b0Var = b0Var2;
                cVar = null;
                cVar4 = (v2.s) objI2;
                if (cVar4 != null) {
                    cVar4.a();
                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                    kVar18.invoke(new h2.b(cVar4.f15401c));
                    return b0Var;
                }
                f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                if (kVar16 != null) {
                    kVar16.invoke(new h2.b(cVar3.f15401c));
                    return b0Var;
                }
                return b0Var;
            case 7:
                sVar3 = (v2.s) b3Var.I;
                cVar3 = (v2.s) b3Var.H;
                e1Var2 = (a40.e1) b3Var.G;
                kVar16 = (u00.k) b3Var.F;
                kVar14 = (u00.k) b3Var.E;
                kVar17 = b3Var.D;
                t1Var8 = (t1) b3Var.C;
                zVar2 = (a40.z) b3Var.B;
                i0Var4 = (v2.i0) b3Var.A;
                ri.t1.O(objI2);
                b0Var = b0Var2;
                cVar = null;
                g1Var2 = (g1) objI2;
                if (kotlin.jvm.internal.m.a(g1Var2, f1Var)) {
                    kVar14.invoke(new h2.b(sVar3.f15401c));
                    b3Var.A = zVar2;
                    b3Var.B = t1Var8;
                    b3Var.C = e1Var2;
                    b3Var.D = cVar;
                    b3Var.E = cVar;
                    b3Var.F = cVar;
                    b3Var.G = cVar;
                    b3Var.H = cVar;
                    b3Var.I = cVar;
                    b3Var.K = 8;
                    if (c(i0Var4, b3Var) != aVar2) {
                        e1Var3 = e1Var2;
                        t1Var9 = t1Var8;
                        zVar5 = zVar2;
                        f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                        return b0Var;
                    }
                    return aVar2;
                }
                if (g1Var2 instanceof e1) {
                    cVar4 = ((e1) g1Var2).f4422a;
                } else {
                    if (g1Var2 instanceof d1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar4 = cVar;
                }
                kVar18 = kVar17;
                t1Var7 = t1Var8;
                zVar4 = zVar2;
                if (cVar4 != null) {
                    cVar4.a();
                    f(zVar4, e1Var2, new y2(t1Var7, cVar, 5));
                    kVar18.invoke(new h2.b(cVar4.f15401c));
                    return b0Var;
                }
                f(zVar4, e1Var2, new y2(t1Var7, cVar, 6));
                if (kVar16 != null) {
                    kVar16.invoke(new h2.b(cVar3.f15401c));
                    return b0Var;
                }
                return b0Var;
            case 8:
                e1Var3 = (a40.e1) b3Var.C;
                t1Var9 = (t1) b3Var.B;
                zVar5 = (a40.z) b3Var.A;
                ri.t1.O(objI2);
                b0Var = b0Var2;
                cVar = null;
                f(zVar5, e1Var3, new y2(t1Var9, cVar, 7));
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Object h(v2.i0 i0Var, v2.l lVar, m00.c cVar) {
        d3 d3Var;
        kotlin.jvm.internal.z zVar;
        if (cVar instanceof d3) {
            d3Var = (d3) cVar;
            int i10 = d3Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d3Var.C = i10 - Integer.MIN_VALUE;
            } else {
                d3Var = new d3(cVar);
            }
        } else {
            d3Var = new d3(cVar);
        }
        Object obj = d3Var.B;
        l00.a aVar = l00.a.A;
        int i11 = d3Var.C;
        try {
            if (i11 == 0) {
                ri.t1.O(obj);
                kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                zVar2.A = d1.f4419a;
                long jB = i0Var.f().b();
                v0 v0Var = new v0(lVar, zVar2, (k00.c) null);
                d3Var.A = zVar2;
                d3Var.C = 1;
                if (i0Var.i(jB, v0Var, d3Var) == aVar) {
                    return aVar;
                }
                zVar = zVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar = d3Var.A;
                ri.t1.O(obj);
            }
            return zVar.A;
        } catch (PointerEventTimeoutCancellationException unused) {
            return f1.f4429a;
        }
    }

    public static final java.lang.Object i(v2.i0 r13, v2.l r14, m00.a r15) {
        throw new UnsupportedOperationException("Method not decompiled: d0.f3.i(v2.i0, v2.l, m00.a):java.lang.Object");
    }
}
