package e30;

import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

public final class d {
    public static final d a = new d();

    public static final boolean b(h30.o c, h30.h hVar) {
        kotlin.jvm.internal.m.e(c, "c");
        if (!c.T(hVar)) {
            if (!(hVar instanceof h30.d)) {
                return false;
            }
            h30.c cVarW = c.w((h30.d) hVar);
            kotlin.jvm.internal.m.e(cVarW, "<this>");
            h30.g gVarW = b5.w(c, c.k(cVarW));
            if (gVarW == null || !c.T(c.v0(gVarW))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(h30.o c, l0 l0Var, h30.h hVar, h30.h hVar2, boolean z) {
        kotlin.jvm.internal.m.e(c, "c");
        Collection<h30.g> collectionG = c.G(hVar);
        if ((collectionG instanceof Collection) && collectionG.isEmpty()) {
            return false;
        }
        for (h30.g gVar : collectionG) {
            if (kotlin.jvm.internal.m.a(b5.R(c, gVar), b5.S(c, hVar2))) {
                return true;
            }
            if (z && n(a, l0Var, hVar2, gVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(l0 l0Var, h30.o c, h30.h hVar, h30.l lVar) {
        c cVarM;
        k0 k0Var = k0.c;
        kotlin.jvm.internal.m.e(c, "c");
        c.s0(hVar, lVar);
        if (c.o(lVar) || !c.y(hVar)) {
            if (!c.q(lVar)) {
                n30.f fVar = new n30.f();
                l0Var.c();
                h30.o oVar = l0Var.c;
                ArrayDeque arrayDeque = l0Var.g;
                kotlin.jvm.internal.m.b(arrayDeque);
                n30.i iVar = l0Var.h;
                kotlin.jvm.internal.m.b(iVar);
                arrayDeque.push(hVar);
                while (!arrayDeque.isEmpty()) {
                    h30.h hVar2 = (h30.h) arrayDeque.pop();
                    kotlin.jvm.internal.m.b(hVar2);
                    if (iVar.add(hVar2)) {
                        h30.b bVar = h30.b.A;
                        h30.h hVarF0 = c.F0(hVar2);
                        if (hVarF0 == null) {
                            hVarF0 = hVar2;
                        }
                        if (c.b0(b5.S(c, hVarF0), lVar)) {
                            fVar.add(hVarF0);
                            cVarM = k0Var;
                        } else {
                            cVarM = c.A(hVarF0) == 0 ? k0.b : oVar.m(hVarF0);
                        }
                        if (cVarM.equals(k0Var)) {
                            cVarM = null;
                        }
                        if (cVarM != null) {
                            Iterator it = oVar.t0(oVar.X(hVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(cVarM.F(l0Var, (h30.g) it.next()));
                            }
                        }
                    }
                }
                l0Var.a();
                return fVar;
            }
            if (c.b0(b5.S(c, hVar), lVar)) {
                h30.b bVar2 = h30.b.A;
                h30.h hVarF1 = c.F0(hVar);
                if (hVarF1 != null) {
                    hVar = hVarF1;
                }
                return va.a.R(hVar);
            }
        }
        return h00.x.A;
    }

    public static List e(l0 l0Var, h30.o oVar, h30.h hVar, h30.l lVar) {
        List listD = d(l0Var, oVar, hVar, lVar);
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                h30.j jVarK = b5.k(oVar, (h30.h) obj);
                int iE = oVar.E(jVarK);
                int i = 0;
                while (true) {
                    if (i >= iE) {
                        arrayList.add(obj);
                        break;
                    }
                    h30.g gVarW = b5.w(oVar, oVar.V(jVarK, i));
                    if ((gVarW != null ? oVar.I(gVarW) : null) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    public static boolean h(l0 l0Var, h30.g a2, h30.g b) {
        kotlin.jvm.internal.m.e(a2, "a");
        kotlin.jvm.internal.m.e(b, "b");
        h30.o oVar = l0Var.c;
        if (a2 == b) {
            return true;
        }
        if (l(oVar, a2) && l(oVar, b)) {
            z0 z0VarD = l0Var.d(l0Var.e(a2));
            z0 z0VarD2 = l0Var.d(l0Var.e(b));
            h30.h hVarY0 = oVar.y0(z0VarD);
            if (!oVar.b0(oVar.K(z0VarD), oVar.K(z0VarD2))) {
                return false;
            }
            if (oVar.A(hVarY0) == 0) {
                return oVar.A0(z0VarD) || oVar.A0(z0VarD2) || oVar.e(hVarY0) == oVar.e(oVar.y0(z0VarD2));
            }
        }
        d dVar = a;
        return n(dVar, l0Var, a2, b) && n(dVar, l0Var, b, a2);
    }

    public static h30.m k(h30.o c, h30.g gVar, h30.h hVar) {
        h30.g gVarW;
        kotlin.jvm.internal.m.e(c, "c");
        int iA = c.A(gVar);
        int i = 0;
        while (true) {
            if (i >= iA) {
                return null;
            }
            h30.k kVarQ = c.Q(gVar, i);
            kotlin.jvm.internal.m.e(kVarQ, "<this>");
            h30.k kVar = c.g0(kVarQ) ? null : kVarQ;
            if (kVar != null && (gVarW = b5.w(c, kVar)) != null) {
                boolean z = c.r(b5.C(c, gVarW)) && c.r(b5.C(c, hVar));
                if (gVarW.equals(hVar) || (z && kotlin.jvm.internal.m.a(b5.R(c, gVarW), b5.R(c, hVar)))) {
                    h30.l lVarR = b5.R(c, gVar);
                    kotlin.jvm.internal.m.e(lVarR, "<this>");
                    return c.R(lVarR, i);
                }
                h30.m mVarK = k(c, gVarW, hVar);
                if (mVarK != null) {
                    return mVarK;
                }
            }
            i++;
        }
    }

    public static boolean l(h30.o oVar, h30.g gVar) {
        h30.l lVarR = b5.R(oVar, gVar);
        kotlin.jvm.internal.m.e(lVarR, "<this>");
        if (!oVar.p0(lVarR)) {
            return false;
        }
        oVar.q0(gVar);
        return (oVar.i0(gVar) || oVar.f(gVar) || oVar.W(gVar)) ? false : true;
    }

    public static boolean m(l0 l0Var, h30.o c, h30.j capturedSubArguments, h30.h hVar) {
        boolean zN;
        kotlin.jvm.internal.m.e(c, "c");
        kotlin.jvm.internal.m.e(capturedSubArguments, "capturedSubArguments");
        h30.l lVarS = b5.S(c, hVar);
        int iE = c.E(capturedSubArguments);
        int iH = b5.H(c, lVarS);
        if (iE == iH && iE == c.A(hVar)) {
            for (int i = 0; i < iH; i++) {
                h30.k kVarQ = c.Q(hVar, i);
                h30.g gVarW = b5.w(c, kVarQ);
                if (gVarW != null) {
                    h30.k kVarV = c.V(capturedSubArguments, i);
                    kotlin.jvm.internal.m.e(kVarV, "<this>");
                    c.C0(kVarV);
                    h30.p pVar = h30.p.INV;
                    h30.g gVarW2 = b5.w(c, kVarV);
                    kotlin.jvm.internal.m.b(gVarW2);
                    h30.p pVarD = c.D(c.R(lVarS, i));
                    h30.p pVarC0 = c.C0(kVarQ);
                    if (pVarD == pVar) {
                        pVarD = pVarC0;
                    } else if (pVarC0 != pVar && pVarD != pVarC0) {
                        pVarD = null;
                    }
                    if (pVarD == null) {
                        return l0Var.a;
                    }
                    if (pVarD == pVar) {
                        o(c, gVarW2, gVarW);
                        o(c, gVarW, gVarW2);
                    }
                    int i2 = l0Var.f;
                    if (i2 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + gVarW2).toString());
                    }
                    l0Var.f = i2 + 1;
                    int iOrdinal = pVarD.ordinal();
                    d dVar = a;
                    if (iOrdinal == 0) {
                        zN = n(dVar, l0Var, gVarW, gVarW2);
                    } else if (iOrdinal == 1) {
                        zN = n(dVar, l0Var, gVarW2, gVarW);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zN = h(l0Var, gVarW2, gVarW);
                    }
                    l0Var.f--;
                    if (!zN) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean n(d dVar, l0 l0Var, h30.g subType, h30.g superType) {
        kotlin.jvm.internal.m.e(subType, "subType");
        kotlin.jvm.internal.m.e(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (!l0Var.b(subType, superType)) {
            return false;
        }
        return a.f(l0Var, l0Var.c, subType, superType);
    }

    public static void o(h30.o oVar, h30.g gVar, h30.g gVar2) {
        h30.h hVarL = b5.l(oVar, gVar);
        if (hVarL instanceof h30.d) {
            h30.d dVar = (h30.d) hVarL;
            if (oVar.r0(dVar)) {
                return;
            }
            h30.c cVarW = oVar.w(dVar);
            kotlin.jvm.internal.m.e(cVarW, "<this>");
            h30.k kVarK = oVar.k(cVarW);
            kotlin.jvm.internal.m.e(kVarK, "<this>");
            if (oVar.g0(kVarK) && oVar.j(dVar) == h30.b.A) {
                b5.R(oVar, gVar2);
            }
        }
    }

    public static l p(z0 type, boolean z) {
        boolean zE;
        kotlin.jvm.internal.m.e(type, "type");
        if (type instanceof l) {
            return (l) type;
        }
        type.m0();
        if ((type.m0().g() instanceof j10.r0) || (type instanceof f30.h)) {
            j10.h hVarG = type.m0().g();
            m10.p0 p0Var = hVarG instanceof m10.p0 ? (m10.p0) hVarG : null;
            zE = true;
            if (p0Var == null || p0Var.M) {
                zE = (z && (type.m0().g() instanceof j10.r0)) ? x0.e(type) : true ^ c.h(f30.m.A.l(), c.m(type), k0.b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (type instanceof q) {
            q qVar = (q) type;
            kotlin.jvm.internal.m.a(qVar.B.m0(), qVar.C.m0());
        }
        return new l(c.m(type).z0(false), z);
    }

    public void a(k10.h hVar, k10.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((k10.b) it.next()).a());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((k10.b) it2.next()).a());
        }
    }

    public boolean f(l0 l0Var, h30.o oVar, h30.g gVar, h30.g gVar2) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z;
        List<h30.h> listD;
        k0 k0Var;
        ArrayList<h30.h> arrayList;
        int i;
        int size;
        h30.l lVarS;
        h30.l lVarS2;
        ArrayDeque arrayDeque;
        n30.i iVar;
        h30.h hVar;
        k0 k0Var2;
        Iterator it;
        h30.h hVarF;
        h30.l lVarS3;
        h30.a aVar;
        int iH;
        boolean z2;
        ?? r7;
        boolean zM;
        boolean z3;
        int i2;
        boolean z4;
        h30.k kVarL0;
        h30.g gVarW;
        h30.h hVarL;
        h30.l lVarS4;
        h30.l lVarS5;
        h30.m mVarK;
        Collection collectionT0;
        Iterator it2;
        Collection collectionT1;
        Iterator it3;
        boolean z5;
        z0 z0VarD = l0Var.d(l0Var.e(gVar));
        z0 z0VarD2 = l0Var.d(l0Var.e(gVar2));
        h30.h hVarC = b5.C((h30.o) oVar, z0VarD);
        kotlin.jvm.internal.m.e(z0VarD2, "<this>");
        h30.h hVarV0 = oVar.v0(z0VarD2);
        boolean z6 = false;
        boolean z7 = true;
        if (!oVar.t(hVarC) && !oVar.t(hVarV0)) {
            oVar.i(hVarC);
            oVar.F(hVarC);
            oVar.F(hVarV0);
            h30.d dVarU = oVar.u(hVarV0);
            h30.g gVarH = dVarU != null ? oVar.h(dVarU) : null;
            if (dVarU == null || gVarH == null) {
                lVarS4 = b5.S((h30.o) oVar, hVarV0);
                kotlin.jvm.internal.m.e(lVarS4, "<this>");
                if (oVar.v(lVarS4)) {
                    b5.y((h30.o) oVar, hVarV0);
                    collectionT1 = oVar.t0(lVarS4);
                    if (!(collectionT1 instanceof Collection) && collectionT1.isEmpty()) {
                        z5 = true;
                        break;
                    }
                    it3 = collectionT1.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z5 = true;
                            break;
                        }
                        if (!n(a, l0Var, hVarC, (h30.g) it3.next())) {
                            z5 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z5);
                } else {
                    lVarS5 = b5.S((h30.o) oVar, hVarC);
                    if (hVarC instanceof h30.d) {
                        mVarK = k(oVar, hVarV0, hVarC);
                        if (mVarK == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        kotlin.jvm.internal.m.e(lVarS5, "<this>");
                        if (oVar.v(lVarS5)) {
                            collectionT0 = oVar.t0(lVarS5);
                            if ((collectionT0 instanceof Collection) || !collectionT0.isEmpty()) {
                                it2 = collectionT0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        mVarK = k(oVar, hVarV0, hVarC);
                                        if (mVarK == null && oVar.z(mVarK, b5.S((h30.o) oVar, hVarV0))) {
                                            boolValueOf = Boolean.TRUE;
                                        }
                                    } else if (!(((h30.g) it2.next()) instanceof h30.d)) {
                                    }
                                }
                            } else {
                                mVarK = k(oVar, hVarV0, hVarC);
                                if (mVarK == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (b5.y((h30.o) oVar, hVarV0)) {
                    gVarH = oVar.x(gVarH);
                } else if (oVar.H(hVarV0)) {
                    gVarH = oVar.s(gVarH);
                }
                i0[] i0VarArr = i0.A;
                if (n(this, l0Var, hVarC, gVarH)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    lVarS4 = b5.S((h30.o) oVar, hVarV0);
                    kotlin.jvm.internal.m.e(lVarS4, "<this>");
                    if (oVar.v(lVarS4)) {
                        b5.y((h30.o) oVar, hVarV0);
                        collectionT1 = oVar.t0(lVarS4);
                        if (!(collectionT1 instanceof Collection)) {
                            it3 = collectionT1.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z5 = true;
                                    break;
                                }
                                if (!n(a, l0Var, hVarC, (h30.g) it3.next())) {
                                    z5 = false;
                                    break;
                                }
                            }
                        } else {
                            it3 = collectionT1.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z5 = true;
                                    break;
                                }
                                if (!n(a, l0Var, hVarC, (h30.g) it3.next())) {
                                    z5 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z5);
                    } else {
                        lVarS5 = b5.S((h30.o) oVar, hVarC);
                        if (hVarC instanceof h30.d) {
                            kotlin.jvm.internal.m.e(lVarS5, "<this>");
                            if (oVar.v(lVarS5)) {
                                collectionT0 = oVar.t0(lVarS5);
                                if (collectionT0 instanceof Collection) {
                                    it2 = collectionT0.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            mVarK = k(oVar, hVarV0, hVarC);
                                            if (mVarK == null) {
                                            }
                                        } else if (!(((h30.g) it2.next()) instanceof h30.d)) {
                                        }
                                    }
                                } else {
                                    it2 = collectionT0.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            mVarK = k(oVar, hVarV0, hVarC);
                                            if (mVarK == null) {
                                            }
                                        } else if (!(((h30.g) it2.next()) instanceof h30.d)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        } else {
                            mVarK = k(oVar, hVarV0, hVarC);
                            if (mVarK == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        }
                    }
                }
            }
        } else if (l0Var.a) {
            boolValueOf = Boolean.TRUE;
        } else {
            boolValueOf = (!b5.y((h30.o) oVar, hVarC) || b5.y((h30.o) oVar, hVarV0)) ? Boolean.valueOf(c.z(oVar, oVar.b(hVarC), oVar.b(hVarV0))) : Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        h30.h hVarC2 = b5.C((h30.o) oVar, z0VarD);
        h30.h hVarV1 = oVar.v0(z0VarD2);
        k0 k0Var3 = k0.c;
        k0 k0Var4 = k0.b;
        h30.o oVar2 = l0Var.c;
        if (!oVar2.e(hVarV1) && !oVar2.f(hVarC2) && !oVar2.H(hVarC2) && ((!(hVarC2 instanceof h30.d) || !oVar2.k0((h30.d) hVarC2)) && !c.h(l0Var, hVarC2, k0Var4))) {
            if (oVar2.H(hVarV1) || c.h(l0Var, hVarV1, k0.d) || oVar2.y(hVarC2)) {
                return false;
            }
            h30.l end = oVar2.X(hVarV1);
            kotlin.jvm.internal.m.e(end, "end");
            if (!c.j(l0Var, hVarC2, end)) {
                l0Var.c();
                ArrayDeque arrayDeque2 = l0Var.g;
                kotlin.jvm.internal.m.b(arrayDeque2);
                n30.i iVar2 = l0Var.h;
                kotlin.jvm.internal.m.b(iVar2);
                arrayDeque2.push(hVarC2);
                loop0: while (true) {
                    if (arrayDeque2.isEmpty()) {
                        l0Var.a();
                        return false;
                    }
                    h30.h hVar2 = (h30.h) arrayDeque2.pop();
                    kotlin.jvm.internal.m.b(hVar2);
                    if (iVar2.add(hVar2)) {
                        k0 k0Var5 = oVar2.e(hVar2) ? k0Var3 : k0Var4;
                        if (k0Var5.equals(k0Var3)) {
                            k0Var5 = null;
                        }
                        if (k0Var5 == null) {
                            continue;
                        } else {
                            Iterator it4 = oVar2.t0(oVar2.X(hVar2)).iterator();
                            while (it4.hasNext()) {
                                h30.h hVarF2 = k0Var5.F(l0Var, (h30.g) it4.next());
                                if (c.j(l0Var, hVarF2, end)) {
                                    l0Var.a();
                                    break loop0;
                                }
                                arrayDeque2.add(hVarF2);
                            }
                        }
                    }
                }
            }
        }
        if (!oVar.T(hVarC2) && !oVar.T(hVarV1)) {
            bool = null;
        } else if (b(oVar, hVarC2) && b(oVar, hVarV1)) {
            bool = Boolean.TRUE;
        } else if (oVar.T(hVarC2)) {
            if (c(oVar, l0Var, hVarC2, hVarV1, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (oVar.T(hVarV1)) {
            h30.l lVarS6 = b5.S((h30.o) oVar, hVarC2);
            if (lVarS6 instanceof v) {
                Collection collectionT2 = oVar.t0(lVarS6);
                if (!(collectionT2 instanceof Collection) || !collectionT2.isEmpty()) {
                    Iterator it5 = collectionT2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            h30.h hVarL2 = b5.l((h30.o) oVar, (h30.g) it5.next());
                            if (hVarL2 == null || !oVar.T(hVarL2)) {
                            }
                        } else if (!c(oVar, l0Var, hVarV1, hVarC2, true)) {
                            bool = null;
                        }
                    }
                } else if (!c(oVar, l0Var, hVarV1, hVarC2, true)) {
                    bool = null;
                }
            } else if (!c(oVar, l0Var, hVarV1, hVarC2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        h30.l superConstructor = b5.S((h30.o) oVar, hVarV1);
        if (!oVar.b0(b5.S((h30.o) oVar, hVarC2), superConstructor) || b5.H((h30.o) oVar, superConstructor) != 0) {
            h30.l lVarS7 = b5.S((h30.o) oVar, hVarV1);
            kotlin.jvm.internal.m.e(lVarS7, "<this>");
            if (!oVar.J(lVarS7)) {
                kotlin.jvm.internal.m.e(superConstructor, "superConstructor");
                if (!oVar2.y(hVarC2)) {
                    if (oVar2.o(superConstructor) || oVar2.C(superConstructor)) {
                        n30.f<h30.h> fVar = new n30.f();
                        l0Var.c();
                        ArrayDeque arrayDeque3 = l0Var.g;
                        kotlin.jvm.internal.m.b(arrayDeque3);
                        n30.i iVar3 = l0Var.h;
                        kotlin.jvm.internal.m.b(iVar3);
                        arrayDeque3.push(hVarC2);
                        while (!arrayDeque3.isEmpty()) {
                            h30.h hVar3 = (h30.h) arrayDeque3.pop();
                            kotlin.jvm.internal.m.b(hVar3);
                            if (iVar3.add(hVar3)) {
                                if (oVar2.y(hVar3)) {
                                    fVar.add(hVar3);
                                    k0Var = k0Var3;
                                } else {
                                    k0Var = k0Var4;
                                }
                                if (k0Var.equals(k0Var3)) {
                                    k0Var = null;
                                }
                                if (k0Var != null) {
                                    Iterator it6 = oVar2.t0(oVar2.X(hVar3)).iterator();
                                    while (it6.hasNext()) {
                                        arrayDeque3.add(k0Var.F(l0Var, (h30.g) it6.next()));
                                        z6 = z6;
                                    }
                                }
                            }
                        }
                        z = z6;
                        l0Var.a();
                        ArrayList arrayList2 = new ArrayList();
                        for (h30.h hVar4 : fVar) {
                            kotlin.jvm.internal.m.b(hVar4);
                            h00.v.u0(e(l0Var, oVar2, hVar4, superConstructor), arrayList2);
                        }
                        listD = arrayList2;
                    } else {
                        listD = d(l0Var, oVar2, hVarC2, superConstructor);
                    }
                    listD.size();
                    i = 10;
                    arrayList = new ArrayList(h00.r.q0(listD, 10));
                    for (h30.h hVar5 : listD) {
                        hVarL = b5.l((h30.o) oVar, l0Var.d(hVar5));
                        if (hVarL == null) {
                            hVar5 = hVarL;
                        }
                        arrayList.add(hVar5);
                    }
                    size = arrayList.size();
                    if (size != 0) {
                        lVarS = b5.S((h30.o) oVar, hVarC2);
                        kotlin.jvm.internal.m.e(lVarS, "<this>");
                        if (oVar.o(lVarS)) {
                            return oVar.j0(lVarS);
                        }
                        lVarS2 = b5.S((h30.o) oVar, hVarC2);
                        kotlin.jvm.internal.m.e(lVarS2, "<this>");
                        if (oVar.j0(lVarS2)) {
                            return true;
                        }
                        l0Var.c();
                        arrayDeque = l0Var.g;
                        kotlin.jvm.internal.m.b(arrayDeque);
                        iVar = l0Var.h;
                        kotlin.jvm.internal.m.b(iVar);
                        arrayDeque.push(hVarC2);
                        while (!arrayDeque.isEmpty()) {
                            hVar = (h30.h) arrayDeque.pop();
                            kotlin.jvm.internal.m.b(hVar);
                            if (!iVar.add(hVar)) {
                                if (oVar.y(hVar)) {
                                    k0Var2 = k0Var3;
                                } else {
                                    k0Var2 = k0Var4;
                                }
                                if (k0Var2.equals(k0Var3)) {
                                    k0Var2 = null;
                                }
                                if (k0Var2 == null) {
                                    continue;
                                } else {
                                    it = oVar2.t0(oVar2.X(hVar)).iterator();
                                    while (it.hasNext()) {
                                        hVarF = k0Var2.F(l0Var, (h30.g) it.next());
                                        lVarS3 = b5.S((h30.o) oVar, hVarF);
                                        kotlin.jvm.internal.m.e(lVarS3, "<this>");
                                        if (oVar.j0(lVarS3)) {
                                            l0Var.a();
                                            return true;
                                        }
                                        arrayDeque.add(hVarF);
                                    }
                                }
                            }
                        }
                        l0Var.a();
                        return z;
                    }
                    if (size != 1) {
                        return m(l0Var, oVar, b5.k((h30.o) oVar, (h30.h) h00.q.K0(arrayList)), hVarV1);
                    }
                    aVar = new h30.a(b5.H((h30.o) oVar, superConstructor));
                    iH = b5.H((h30.o) oVar, superConstructor);
                    boolean z8 = z;
                    z2 = z8;
                    r7 = z8;
                    while (r7 < iH) {
                        if (z2 && oVar.D(oVar.R(superConstructor, r7)) == h30.p.OUT) {
                            z3 = z;
                        } else {
                            z3 = z7;
                        }
                        if (z3) {
                            i2 = iH;
                            z4 = z7;
                        } else {
                            ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList, i));
                            for (h30.h hVar6 : arrayList) {
                                kotlin.jvm.internal.m.e(hVar6, "<this>");
                                boolean z9 = z7;
                                kVarL0 = oVar.l0(hVar6, r7);
                                if (kVarL0 != null) {
                                    int i3 = iH;
                                    if (oVar.C0(kVarL0) != h30.p.INV) {
                                        kVarL0 = null;
                                    }
                                    if (kVarL0 == null && (gVarW = b5.w((h30.o) oVar, kVarL0)) != null) {
                                        arrayList3.add(gVarW);
                                        z7 = z9;
                                        iH = i3;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + hVar6 + ", subType: " + hVarC2 + ", superType: " + hVarV1).toString());
                            }
                            i2 = iH;
                            z4 = z7;
                            h30.g gVarZ = oVar.Z(arrayList3);
                            kotlin.jvm.internal.m.e(gVarZ, "<this>");
                            aVar.add(oVar.D0(gVarZ));
                        }
                        z7 = z4;
                        iH = i2;
                        i = 10;
                        r7++;
                        z2 = z3;
                    }
                    boolean z11 = z7;
                    if (z2 && m(l0Var, oVar, aVar, hVarV1)) {
                        return z11;
                    }
                    zM = z;
                    for (h30.h hVar7 : arrayList) {
                        if (zM) {
                            zM = m(l0Var, oVar, b5.k((h30.o) oVar, hVar7), hVarV1);
                        }
                    }
                    return zM;
                }
                listD = e(l0Var, oVar2, hVarC2, superConstructor);
                z = false;
                listD.size();
                i = 10;
                arrayList = new ArrayList(h00.r.q0(listD, 10));
                while (r11.hasNext()) {
                    hVarL = b5.l((h30.o) oVar, l0Var.d(hVar5));
                    if (hVarL == null) {
                        hVar5 = hVarL;
                    }
                    arrayList.add(hVar5);
                }
                size = arrayList.size();
                if (size != 0) {
                    lVarS = b5.S((h30.o) oVar, hVarC2);
                    kotlin.jvm.internal.m.e(lVarS, "<this>");
                    if (oVar.o(lVarS)) {
                        return oVar.j0(lVarS);
                    }
                    lVarS2 = b5.S((h30.o) oVar, hVarC2);
                    kotlin.jvm.internal.m.e(lVarS2, "<this>");
                    if (oVar.j0(lVarS2)) {
                        return true;
                    }
                    l0Var.c();
                    arrayDeque = l0Var.g;
                    kotlin.jvm.internal.m.b(arrayDeque);
                    iVar = l0Var.h;
                    kotlin.jvm.internal.m.b(iVar);
                    arrayDeque.push(hVarC2);
                    while (!arrayDeque.isEmpty()) {
                        hVar = (h30.h) arrayDeque.pop();
                        kotlin.jvm.internal.m.b(hVar);
                        if (!iVar.add(hVar)) {
                            if (oVar.y(hVar)) {
                                k0Var2 = k0Var3;
                            } else {
                                k0Var2 = k0Var4;
                            }
                            if (k0Var2.equals(k0Var3)) {
                                k0Var2 = null;
                            }
                            if (k0Var2 == null) {
                                continue;
                            } else {
                                it = oVar2.t0(oVar2.X(hVar)).iterator();
                                while (it.hasNext()) {
                                    hVarF = k0Var2.F(l0Var, (h30.g) it.next());
                                    lVarS3 = b5.S((h30.o) oVar, hVarF);
                                    kotlin.jvm.internal.m.e(lVarS3, "<this>");
                                    if (oVar.j0(lVarS3)) {
                                        l0Var.a();
                                        return true;
                                    }
                                    arrayDeque.add(hVarF);
                                }
                            }
                        }
                    }
                    l0Var.a();
                    return z;
                }
                if (size != 1) {
                    return m(l0Var, oVar, b5.k((h30.o) oVar, (h30.h) h00.q.K0(arrayList)), hVarV1);
                }
                aVar = new h30.a(b5.H((h30.o) oVar, superConstructor));
                iH = b5.H((h30.o) oVar, superConstructor);
                boolean z12 = z;
                z2 = z12;
                r7 = z12;
                while (r7 < iH) {
                    if (z2) {
                        z3 = z7;
                    } else {
                        z3 = z7;
                    }
                    if (z3) {
                        ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayList, i));
                        while (r14.hasNext()) {
                            kotlin.jvm.internal.m.e(hVar6, "<this>");
                            boolean z13 = z7;
                            kVarL0 = oVar.l0(hVar6, r7);
                            if (kVarL0 != null) {
                                int i4 = iH;
                                if (oVar.C0(kVarL0) != h30.p.INV) {
                                    kVarL0 = null;
                                }
                                if (kVarL0 == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + hVar6 + ", subType: " + hVarC2 + ", superType: " + hVarV1).toString());
                        }
                        i2 = iH;
                        z4 = z7;
                        h30.g gVarZ2 = oVar.Z(arrayList4);
                        kotlin.jvm.internal.m.e(gVarZ2, "<this>");
                        aVar.add(oVar.D0(gVarZ2));
                    } else {
                        i2 = iH;
                        z4 = z7;
                    }
                    z7 = z4;
                    iH = i2;
                    i = 10;
                    r7++;
                    z2 = z3;
                }
                boolean z14 = z7;
                if (z2) {
                }
                zM = z;
                while (r2.hasNext()) {
                    if (zM) {
                        zM = m(l0Var, oVar, b5.k((h30.o) oVar, hVar7), hVarV1);
                    }
                }
                return zM;
            }
        }
        return true;
    }

    public s0 g(m0 typeConstructor, List arguments) {
        kotlin.jvm.internal.m.e(typeConstructor, "typeConstructor");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        List parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
        j10.r0 r0Var = (j10.r0) h00.q.U0(parameters);
        if (r0Var == null || !r0Var.Z()) {
            return new t((j10.r0[]) parameters.toArray(new j10.r0[0]), (p0[]) arguments.toArray(new p0[0]), false);
        }
        List parameters2 = typeConstructor.getParameters();
        kotlin.jvm.internal.m.d(parameters2, "getParameters(...)");
        ArrayList arrayList = new ArrayList(h00.r.q0(parameters2, 10));
        Iterator it = parameters2.iterator();
        while (it.hasNext()) {
            arrayList.add(((j10.r0) it.next()).f());
        }
        return new g0(h00.d0.Y(h00.q.t1(arrayList, arguments)), 1);
    }

    public a0 i(oj.q qVar, h0 h0Var, boolean z, int i, boolean z2) {
        h0 h0VarE;
        a1 a1Var = a1.C;
        j10.q0 q0Var = (j10.q0) qVar.C;
        p0 p0VarJ = j(new f0(((c30.u) q0Var).a1(), a1Var), qVar, null, i);
        w wVarB = p0VarJ.b();
        kotlin.jvm.internal.m.d(wVarB, "getType(...)");
        a0 a0VarB = c.b(wVarB);
        if (c.k(a0VarB)) {
            return a0VarB;
        }
        p0VarJ.a();
        a(a0VarB.getAnnotations(), h.a(h0Var));
        if (!c.k(a0VarB)) {
            if (c.k(a0VarB)) {
                h0VarE = a0VarB.k0();
            } else {
                h0 other = a0VarB.k0();
                l9.f0 f0Var = h0.B;
                kotlin.jvm.internal.m.e(other, "other");
                if (h0Var.isEmpty() && other.isEmpty()) {
                    h0VarE = h0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) f0Var.B).values();
                    kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        g gVar = (g) h0Var.A.get(iIntValue);
                        g gVar2 = (g) other.A.get(iIntValue);
                        if (gVar != null) {
                            if (gVar2 != null) {
                                gVar = new g(va.a.m(gVar.a, gVar2.a));
                            }
                            gVar2 = gVar;
                        } else if (gVar2 == null) {
                            gVar2 = null;
                        } else if (gVar != null) {
                            gVar2 = new g(va.a.m(gVar2.a, gVar.a));
                        }
                        n30.l.a(arrayList, gVar2);
                    }
                    h0VarE = l9.f0.e(arrayList);
                }
            }
            a0VarB = c.r(a0VarB, null, h0VarE, 1);
        }
        a0 a0VarI = x0.i(a0VarB, z);
        if (!z2) {
            return a0VarI;
        }
        m10.e eVar = ((m10.f) q0Var).I;
        kotlin.jvm.internal.m.d(eVar, "getTypeConstructor(...)");
        return c.H(a0VarI, c.v(h0Var, eVar, (List) qVar.D, x20.m.b, z));
    }

    public p0 j(p0 p0Var, oj.q qVar, j10.r0 r0Var, int i) {
        a1 a1VarF;
        a1 a1Var;
        a1 a1Var2;
        k10.a aVar = (j10.q0) qVar.C;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((m10.m) aVar).getName());
        }
        if (p0Var.c()) {
            kotlin.jvm.internal.m.b(r0Var);
            return x0.j(r0Var);
        }
        w wVarB = p0Var.b();
        kotlin.jvm.internal.m.d(wVarB, "getType(...)");
        m0 constructor = wVarB.m0();
        kotlin.jvm.internal.m.e(constructor, "constructor");
        j10.h hVarG = constructor.g();
        p0 p0Var2 = hVarG instanceof j10.r0 ? (p0) ((Map) qVar.E).get(hVarG) : null;
        if (p0Var2 != null) {
            if (p0Var2.c()) {
                kotlin.jvm.internal.m.b(r0Var);
                return x0.j(r0Var);
            }
            z0 z0VarY0 = p0Var2.b().y0();
            a1 a1VarA = p0Var2.a();
            kotlin.jvm.internal.m.d(a1VarA, "getProjectionKind(...)");
            a1 a1VarA2 = p0Var.a();
            kotlin.jvm.internal.m.d(a1VarA2, "getProjectionKind(...)");
            if (a1VarA2 != a1VarA && a1VarA2 != (a1Var2 = a1.C) && a1VarA == a1Var2) {
                a1VarA = a1VarA2;
            }
            if (r0Var == null || (a1VarF = r0Var.F()) == null) {
                a1VarF = a1.C;
            }
            if (a1VarF != a1VarA && a1VarF != (a1Var = a1.C) && a1VarA == a1Var) {
                a1VarA = a1Var;
            }
            a(wVarB.getAnnotations(), z0VarY0.getAnnotations());
            a0 a0VarI = x0.i(c.b(z0VarY0), wVarB.t0());
            h0 h0VarK0 = wVarB.k0();
            if (!c.k(a0VarI)) {
                if (c.k(a0VarI)) {
                    h0VarK0 = a0VarI.k0();
                } else {
                    h0 other = a0VarI.k0();
                    h0VarK0.getClass();
                    l9.f0 f0Var = h0.B;
                    kotlin.jvm.internal.m.e(other, "other");
                    if (!h0VarK0.isEmpty() || !other.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Collection collectionValues = ((ConcurrentHashMap) f0Var.B).values();
                        kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            g gVar = (g) h0VarK0.A.get(iIntValue);
                            g gVar2 = (g) other.A.get(iIntValue);
                            if (gVar != null) {
                                if (gVar2 != null) {
                                    gVar = new g(va.a.m(gVar.a, gVar2.a));
                                }
                                gVar2 = gVar;
                            } else if (gVar2 == null) {
                                gVar2 = null;
                            } else if (gVar != null) {
                                gVar2 = new g(va.a.m(gVar2.a, gVar.a));
                            }
                            n30.l.a(arrayList, gVar2);
                        }
                        h0VarK0 = l9.f0.e(arrayList);
                    }
                }
                a0VarI = c.r(a0VarI, null, h0VarK0, 1);
            }
            return new f0(a0VarI, a1VarA);
        }
        a0 a0VarB = c.b(p0Var.b().y0());
        if (!c.k(a0VarB) && x0.c(a0VarB, i30.a.C, null)) {
            m0 m0VarM0 = a0VarB.m0();
            j10.h hVarG2 = m0VarM0.g();
            m0VarM0.getParameters().size();
            a0VarB.e0().size();
            if (!(hVarG2 instanceof j10.r0)) {
                int i2 = 0;
                if (!(hVarG2 instanceof j10.q0)) {
                    a0 a0VarQ = q(a0VarB, qVar, i);
                    u0.d(a0VarQ);
                    for (Object obj : a0VarQ.e0()) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            va.a.k0();
                            throw null;
                        }
                        p0 p0Var3 = (p0) obj;
                        if (!p0Var3.c()) {
                            w wVarB2 = p0Var3.b();
                            kotlin.jvm.internal.m.d(wVarB2, "getType(...)");
                            if (!x0.c(wVarB2, i30.a.B, null)) {
                            }
                        }
                        i2 = i3;
                    }
                    return new f0(a0VarQ, p0Var.a());
                }
                j10.q0 q0Var = (j10.q0) hVarG2;
                if (qVar.O(q0Var)) {
                    a1 a1Var3 = a1.C;
                    g30.k kVar = g30.k.F;
                    String str = ((m10.m) q0Var).getName().A;
                    kotlin.jvm.internal.m.d(str, "toString(...)");
                    return new f0(g30.l.c(kVar, str), a1Var3);
                }
                List listE0 = a0VarB.e0();
                ArrayList arrayList2 = new ArrayList(h00.r.q0(listE0, 10));
                for (Object obj2 : listE0) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        va.a.k0();
                        throw null;
                    }
                    arrayList2.add(j((p0) obj2, qVar, (j10.r0) m0VarM0.getParameters().get(i2), i + 1));
                    i2 = i4;
                }
                List parameters = ((m10.f) q0Var).I.getParameters();
                ArrayList arrayList3 = new ArrayList(h00.r.q0(parameters, 10));
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((j10.r0) it2.next()).a());
                }
                return new f0(c.H(i(new oj.q(qVar, q0Var, arrayList2, h00.d0.Y(h00.q.t1(arrayList3, arrayList2)), 11), a0VarB.k0(), a0VarB.t0(), i + 1, false), q(a0VarB, qVar, i)), p0Var.a());
            }
        }
        return p0Var;
    }

    public a0 q(a0 a0Var, oj.q qVar, int i) {
        m0 m0VarM0 = a0Var.m0();
        List listE0 = a0Var.e0();
        ArrayList arrayList = new ArrayList(h00.r.q0(listE0, 10));
        int i2 = 0;
        for (Object obj : listE0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                va.a.k0();
                throw null;
            }
            p0 p0Var = (p0) obj;
            p0 p0VarJ = j(p0Var, qVar, (j10.r0) m0VarM0.getParameters().get(i2), i + 1);
            if (!p0VarJ.c()) {
                p0VarJ = new f0(x0.h(p0VarJ.b(), p0Var.b().t0()), p0VarJ.a());
            }
            arrayList.add(p0VarJ);
            i2 = i3;
        }
        return c.r(a0Var, arrayList, null, 2);
    }
}
