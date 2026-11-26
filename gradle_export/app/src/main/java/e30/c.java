package e30;

import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public abstract class c {
    public static boolean A(h30.o oVar, h30.g gVar, h30.g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        h30.h hVarS = oVar.S(gVar);
        h30.h hVarS2 = oVar.S(gVar2);
        if (hVarS != null && hVarS2 != null) {
            return y(oVar, hVarS, hVarS2);
        }
        h30.f fVarI = oVar.I(gVar);
        h30.f fVarI2 = oVar.I(gVar2);
        return fVarI != null && fVarI2 != null && y(oVar, oVar.c(fVarI), oVar.c(fVarI2)) && y(oVar, oVar.a(fVarI), oVar.a(fVarI2));
    }

    public static u0 B(List list, s0 s0Var, j10.k kVar, ArrayList arrayList) {
        if (s0Var == null) {
            a(1);
            throw null;
        }
        if (kVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        u0 u0VarC = C(list, s0Var, kVar, arrayList, null);
        if (u0VarC != null) {
            return u0VarC;
        }
        throw new AssertionError("Substitution failed");
    }

    public static u0 C(List list, s0 s0Var, j10.k kVar, List list2, boolean[] zArr) {
        if (s0Var == null) {
            a(6);
            throw null;
        }
        if (kVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            j10.r0 r0Var = (j10.r0) it.next();
            m10.p0 p0VarA1 = m10.p0.a1(kVar, r0Var.getAnnotations(), r0Var.A(), r0Var.F(), r0Var.getName(), i, r0Var.U());
            map.put(r0Var.f(), new f0(p0VarA1.n()));
            map2.put(r0Var, p0VarA1);
            list2.add(p0VarA1);
            i++;
        }
        g0 g0Var = new g0(map, 1);
        u0 u0VarE = u0.e(s0Var, g0Var);
        u0 u0VarE2 = u0.e(new r0(s0Var, 0), g0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            j10.r0 r0Var2 = (j10.r0) it2.next();
            m10.p0 p0Var = (m10.p0) map2.get(r0Var2);
            for (w wVar : r0Var2.getUpperBounds()) {
                j10.h hVarG = wVar.m0().g();
                w wVarI = (((hVarG instanceof j10.r0) && ab.a0.h0((j10.r0) hVarG, (m0) null, (Set) null)) ? u0VarE : u0VarE2).i(wVar, a1.E);
                if (wVarI == null) {
                    return null;
                }
                if (wVarI != wVar && zArr != null) {
                    zArr[0] = true;
                }
                if (p0Var.M) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + p0Var.c1());
                }
                if (!k(wVarI)) {
                    p0Var.L.add(wVarI);
                }
            }
            if (p0Var.M) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + p0Var.c1());
            }
            p0Var.M = true;
        }
        return u0VarE;
    }

    public static final h30.g D(h30.g gVar, h30.g gVar2) {
        q qVarG;
        a0 a0VarH = f30.g.h(gVar);
        if (a0VarH == null && ((qVarG = f30.g.g(gVar)) == null || (a0VarH = f30.g.R(qVarG)) == null)) {
            a0VarH = f30.g.h(gVar);
            kotlin.jvm.internal.m.b(a0VarH);
        }
        j10.r0 r0VarV = f30.g.v(f30.g.a0(a0VarH));
        f30.m mVar = f30.m.A;
        if (r0VarV != null) {
            return f30.g.L(gVar) ? mVar.g(gVar2) : gVar2;
        }
        h30.k kVar = (h30.k) h00.q.d1(f30.g.q(gVar));
        if (p.a[f30.g.w(kVar).ordinal()] == 1) {
            mVar.d();
            throw null;
        }
        z0 z0VarU = f30.g.u(mVar, kVar);
        kotlin.jvm.internal.m.b(z0VarU);
        h30.g componentType = D(z0VarU, gVar2);
        kotlin.jvm.internal.m.e(componentType, "componentType");
        if (componentType instanceof w) {
            mVar.d();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, mVar.getClass(), sb).toString());
    }

    public static final h0 E(k10.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        if (hVar.isEmpty()) {
            h0.B.getClass();
            return h0.C;
        }
        l9.f0 f0Var = h0.B;
        List listR = va.a.R(new g(hVar));
        f0Var.getClass();
        return l9.f0.e(listR);
    }

    public static final a0 G(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        z0 z0VarY0 = wVar.y0();
        if (z0VarY0 instanceof q) {
            return ((q) z0VarY0).C;
        }
        if (z0VarY0 instanceof a0) {
            return (a0) z0VarY0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final a0 H(a0 a0Var, a0 abbreviatedType) {
        kotlin.jvm.internal.m.e(a0Var, "<this>");
        kotlin.jvm.internal.m.e(abbreviatedType, "abbreviatedType");
        return k(a0Var) ? a0Var : new a(a0Var, abbreviatedType);
    }

    public static final z0 I(z0 z0Var, w wVar) {
        kotlin.jvm.internal.m.e(z0Var, "<this>");
        if (z0Var instanceof y0) {
            return I(((y0) z0Var).V(), wVar);
        }
        if (wVar == null || wVar.equals(z0Var)) {
            return z0Var;
        }
        if (z0Var instanceof a0) {
            return new d0((a0) z0Var, wVar);
        }
        if (z0Var instanceof q) {
            return new s((q) z0Var, wVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final a0 b(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        z0 z0VarY0 = wVar.y0();
        a0 a0Var = z0VarY0 instanceof a0 ? (a0) z0VarY0 : null;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + wVar).toString());
    }

    public static final h30.m c(h30.g gVar) {
        z0 z0VarY0;
        q qVarG;
        a0 a0VarH = f30.g.h(gVar);
        if (a0VarH == null && ((qVarG = f30.g.g(gVar)) == null || (a0VarH = f30.g.R(qVarG)) == null)) {
            a0VarH = f30.g.h(gVar);
            kotlin.jvm.internal.m.b(a0VarH);
        }
        j10.r0 r0VarV = f30.g.v(f30.g.a0(a0VarH));
        if (r0VarV != null) {
            return r0VarV;
        }
        if (!(gVar instanceof w)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(gVar);
            sb.append(", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, gVar.getClass(), sb).toString());
        }
        if (g10.i.z((w) gVar)) {
            h30.k receiver = (h30.k) h00.q.d1(f30.g.q(gVar));
            kotlin.jvm.internal.m.e(receiver, "$receiver");
            if (f30.g.O(receiver)) {
                z0VarY0 = null;
            } else {
                if (!(receiver instanceof p0)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(receiver);
                    sb2.append(", ");
                    throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb2).toString());
                }
                z0VarY0 = ((p0) receiver).b().y0();
            }
            if (z0VarY0 != null) {
                return c(z0VarY0);
            }
        }
        return null;
    }

    public static final w d(ArrayList arrayList, List list, g10.i iVar) {
        w wVarI = new u0(new g0(arrayList, 0)).i((w) h00.q.L0(list), a1.E);
        return wVarI == null ? iVar.n() : wVarI;
    }

    public static final h30.g e(h30.g receiver, HashSet hashSet) {
        h30.g gVarX;
        h30.g gVarE;
        f30.m mVar = f30.m.A;
        h30.l lVarK = mVar.K(receiver);
        if (hashSet.add(lVarK)) {
            j10.r0 r0VarV = f30.g.v(lVarK);
            int i = 0;
            if (r0VarV == null) {
                if (f30.g.G(lVarK)) {
                    List<h30.m> listS = f30.g.s(mVar.K(receiver));
                    List listQ = f30.g.q(receiver);
                    ArrayList arrayList = new ArrayList(h00.r.q0(listQ, 10));
                    for (Object obj : listQ) {
                        int i2 = i + 1;
                        if (i < 0) {
                            va.a.k0();
                            throw null;
                        }
                        k10.a aVarU = f30.g.u(mVar, (h30.k) obj);
                        if (aVarU == null) {
                            aVarU = f30.g.t((h30.m) listS.get(i));
                        }
                        arrayList.add(aVarU);
                        i = i2;
                    }
                    ArrayList arrayList2 = new ArrayList(h00.r.q0(listS, 10));
                    for (h30.m receiver2 : listS) {
                        kotlin.jvm.internal.m.e(receiver2, "$receiver");
                        if (!(receiver2 instanceof j10.r0)) {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(receiver2);
                            sb.append(", ");
                            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver2.getClass(), sb).toString());
                        }
                        m0 m0VarF = ((j10.r0) receiver2).f();
                        kotlin.jvm.internal.m.d(m0VarF, "getTypeConstructor(...)");
                        arrayList2.add(m0VarF);
                    }
                    Map mapY = h00.d0.Y(h00.q.t1(arrayList2, arrayList));
                    ArrayList arrayList3 = new ArrayList(mapY.size());
                    for (Map.Entry entry : mapY.entrySet()) {
                        h30.l lVar = (h30.l) entry.getKey();
                        h30.g gVar = (h30.g) entry.getValue();
                        kotlin.jvm.internal.m.c(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.types.TypeConstructor");
                        kotlin.jvm.internal.m.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                        arrayList3.add(new g00.k((m0) lVar, ab.a0.p((w) gVar)));
                    }
                    u0 u0Var = new u0(new g0(h00.d0.Y(arrayList3), 1));
                    kotlin.jvm.internal.m.e(receiver, "$receiver");
                    if (!(receiver instanceof w)) {
                        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb2.append(receiver);
                        sb2.append(", ");
                        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb2).toString());
                    }
                    a0 a0VarH = q20.f.h((w) receiver);
                    if (a0VarH == null) {
                        gVarX = null;
                    } else {
                        h30.m mVarC = c(a0VarH);
                        gVarX = mVarC == null ? f30.g.X(u0Var, a0VarH) : D(a0VarH, f30.g.X(u0Var, f30.g.t(mVarC)));
                    }
                    if (gVarX != null && (gVarE = e(gVarX, hashSet)) != null) {
                        if (!f30.g.L(receiver)) {
                            return gVarE;
                        }
                        if (!f30.g.L(gVarE) && (!(gVarE instanceof h30.i) || !f30.g.M((h30.i) gVarE))) {
                            return mVar.g(gVarE);
                        }
                    }
                }
                return receiver;
            }
            h30.g gVarT = f30.g.t(r0VarV);
            h30.g gVarE2 = e(gVarT, hashSet);
            if (gVarE2 != null) {
                if (f30.g.G(mVar.K(gVarT)) || ((gVarT instanceof h30.i) && f30.g.M((h30.i) gVarT))) {
                    i = 1;
                }
                if ((gVarE2 instanceof h30.i) && f30.g.M((h30.i) gVarE2) && f30.g.L(receiver) && i != 0) {
                    return mVar.g(gVarT);
                }
                return (f30.g.L(gVarE2) || !f30.g.J(receiver)) ? gVarE2 : mVar.g(gVarE2);
            }
        }
        return null;
    }

    public static final z0 f(a0 lowerBound, a0 upperBound) {
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new r(lowerBound, upperBound);
    }

    public static final w g(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        if (wVar instanceof y0) {
            return ((y0) wVar).t();
        }
        return null;
    }

    public static boolean h(l0 l0Var, h30.h type, c cVar) {
        k0 k0Var = k0.c;
        kotlin.jvm.internal.m.e(l0Var, "<this>");
        kotlin.jvm.internal.m.e(type, "type");
        h30.o oVar = l0Var.c;
        if ((oVar.y(type) && !oVar.e(type)) || oVar.H(type)) {
            return true;
        }
        l0Var.c();
        ArrayDeque arrayDeque = l0Var.g;
        kotlin.jvm.internal.m.b(arrayDeque);
        n30.i iVar = l0Var.h;
        kotlin.jvm.internal.m.b(iVar);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            h30.h hVar = (h30.h) arrayDeque.pop();
            kotlin.jvm.internal.m.b(hVar);
            if (iVar.add(hVar)) {
                c cVar2 = oVar.e(hVar) ? k0Var : cVar;
                if (cVar2.equals(k0Var)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    Iterator it = oVar.t0(oVar.X(hVar)).iterator();
                    while (it.hasNext()) {
                        h30.h hVarF = cVar2.F(l0Var, (h30.g) it.next());
                        if ((oVar.y(hVarF) && !oVar.e(hVarF)) || oVar.H(hVarF)) {
                            l0Var.a();
                            return true;
                        }
                        arrayDeque.add(hVarF);
                    }
                }
            }
        }
        l0Var.a();
        return false;
    }

    public static final z0 i(z0 z0Var, w origin) {
        kotlin.jvm.internal.m.e(z0Var, "<this>");
        kotlin.jvm.internal.m.e(origin, "origin");
        return I(z0Var, g(origin));
    }

    public static boolean j(l0 l0Var, h30.h hVar, h30.l lVar) {
        h30.o oVar = l0Var.c;
        if (oVar.d0(hVar)) {
            return true;
        }
        if (oVar.e(hVar)) {
            return false;
        }
        if (l0Var.b) {
            oVar.F(hVar);
        }
        return oVar.b0(oVar.X(hVar), lVar);
    }

    public static final boolean k(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        z0 z0VarY0 = wVar.y0();
        if (z0VarY0 instanceof g30.i) {
            return true;
        }
        return (z0VarY0 instanceof q) && (((q) z0VarY0).C0() instanceof g30.i);
    }

    public static final boolean l(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        return wVar.y0() instanceof q;
    }

    public static final a0 m(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        z0 z0VarY0 = wVar.y0();
        if (z0VarY0 instanceof q) {
            return ((q) z0VarY0).B;
        }
        if (z0VarY0 instanceof a0) {
            return (a0) z0VarY0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final z0 n(z0 z0Var, boolean z) {
        kotlin.jvm.internal.m.e(z0Var, "<this>");
        l lVarP = d.p(z0Var, z);
        if (lVarP != null) {
            return lVarP;
        }
        a0 a0VarO = o(z0Var);
        return a0VarO != null ? a0VarO : z0Var.z0(false);
    }

    public static final a0 o(z0 z0Var) {
        v vVar;
        m0 m0VarM0 = z0Var.m0();
        v vVar2 = m0VarM0 instanceof v ? (v) m0VarM0 : null;
        if (vVar2 != null) {
            LinkedHashSet<w> linkedHashSet = vVar2.B;
            ArrayList arrayList = new ArrayList(h00.r.q0(linkedHashSet, 10));
            boolean z = false;
            for (w wVarN : linkedHashSet) {
                if (x0.e(wVarN)) {
                    wVarN = n(wVarN.y0(), false);
                    z = true;
                }
                arrayList.add(wVarN);
            }
            if (z) {
                w wVarN2 = vVar2.A;
                if (wVarN2 == null) {
                    wVarN2 = null;
                } else if (x0.e(wVarN2)) {
                    wVarN2 = n(wVarN2.y0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                vVar = new v(linkedHashSet2);
                vVar.A = wVarN2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                return vVar.a();
            }
        }
        return null;
    }

    public static final a0 p(a0 a0Var, List newArguments, h0 newAttributes) {
        kotlin.jvm.internal.m.e(a0Var, "<this>");
        kotlin.jvm.internal.m.e(newArguments, "newArguments");
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == a0Var.k0()) {
            return a0Var;
        }
        if (newArguments.isEmpty()) {
            return a0Var.B0(newAttributes);
        }
        if (!(a0Var instanceof g30.i)) {
            return u(newAttributes, a0Var.m0(), newArguments, a0Var.t0());
        }
        g30.i iVar = (g30.i) a0Var;
        m0 m0Var = iVar.B;
        g30.g gVar = iVar.C;
        g30.k kVar = iVar.D;
        boolean z = iVar.F;
        String[] strArr = iVar.G;
        return new g30.i(m0Var, gVar, kVar, newArguments, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static w q(w wVar, List list, k10.h hVar, int i) {
        if ((i & 2) != 0) {
            hVar = wVar.getAnnotations();
        }
        kotlin.jvm.internal.m.e(wVar, "<this>");
        if ((list.isEmpty() || list == wVar.e0()) && hVar == wVar.getAnnotations()) {
            return wVar;
        }
        h0 h0VarK0 = wVar.k0();
        if ((hVar instanceof k10.l) && ((k10.l) hVar).isEmpty()) {
            hVar = k10.g.a;
        }
        h0 h0VarS = s(h0VarK0, hVar);
        z0 z0VarY0 = wVar.y0();
        if (z0VarY0 instanceof q) {
            q qVar = (q) z0VarY0;
            return f(p(qVar.B, list, h0VarS), p(qVar.C, list, h0VarS));
        }
        if (z0VarY0 instanceof a0) {
            return p((a0) z0VarY0, list, h0VarS);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static a0 r(a0 a0Var, List list, h0 h0Var, int i) {
        if ((i & 1) != 0) {
            list = a0Var.e0();
        }
        if ((i & 2) != 0) {
            h0Var = a0Var.k0();
        }
        return p(a0Var, list, h0Var);
    }

    public static final h0 s(h0 h0Var, k10.h hVar) {
        h0 h0VarE;
        kotlin.jvm.internal.m.e(h0Var, "<this>");
        if (h.a(h0Var) == hVar) {
            return h0Var;
        }
        g gVar = (g) h.b.g(h.a[0], h0Var);
        if (gVar != null) {
            if (h0Var.isEmpty()) {
                h0VarE = h0Var;
            } else {
                k30.a aVar = h0Var.A;
                ArrayList arrayList = new ArrayList();
                for (Object obj : aVar) {
                    if (!kotlin.jvm.internal.m.a((g) obj, gVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == h0Var.A.a()) {
                    h0VarE = h0Var;
                } else {
                    h0.B.getClass();
                    h0VarE = l9.f0.e(arrayList);
                }
            }
            if (h0VarE != null) {
                h0Var = h0VarE;
            }
        }
        if (hVar.iterator().hasNext() || !hVar.isEmpty()) {
            g gVar2 = new g(hVar);
            l9.f0 f0Var = h0.B;
            a10.d dVarB = kotlin.jvm.internal.a0.a.b(g.class);
            f0Var.getClass();
            String strM = dVarB.m();
            kotlin.jvm.internal.m.b(strM);
            if (h0Var.A.get(f0Var.j(strM)) == null) {
                return h0Var.isEmpty() ? new h0(va.a.R(gVar2)) : l9.f0.e(h00.q.Z0(gVar2, h00.q.n1(h0Var)));
            }
        }
        return h0Var;
    }

    public static final a0 t(h0 attributes, j10.e descriptor, List arguments) {
        kotlin.jvm.internal.m.e(attributes, "attributes");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        m0 m0VarF = descriptor.f();
        kotlin.jvm.internal.m.d(m0VarF, "getTypeConstructor(...)");
        return u(attributes, m0VarF, arguments, false);
    }

    public static a0 u(h0 attributes, m0 constructor, List arguments, boolean z) {
        x20.n nVarA;
        m10.y yVar;
        x20.n nVarT;
        x20.n nVar;
        x20.n nVarC;
        kotlin.jvm.internal.m.e(attributes, "attributes");
        kotlin.jvm.internal.m.e(constructor, "constructor");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z && constructor.g() != null) {
            j10.h hVarG = constructor.g();
            kotlin.jvm.internal.m.b(hVarG);
            a0 a0VarN = hVarG.n();
            kotlin.jvm.internal.m.d(a0VarN, "getDefaultType(...)");
            return a0VarN;
        }
        j10.h hVarG2 = constructor.g();
        if (hVarG2 instanceof j10.r0) {
            nVarA = ((j10.r0) hVarG2).n().N();
        } else {
            if (hVarG2 instanceof j10.e) {
                u20.d.i(u20.d.j(hVarG2));
                boolean zIsEmpty = arguments.isEmpty();
                f30.f fVar = f30.f.a;
                if (zIsEmpty) {
                    j10.e eVar = (j10.e) hVarG2;
                    yVar = eVar instanceof m10.y ? (m10.y) eVar : null;
                    if (yVar == null || (nVarC = yVar.C(fVar)) == null) {
                        nVarA = eVar.o0();
                        kotlin.jvm.internal.m.d(nVarA, "getUnsubstitutedMemberScope(...)");
                    } else {
                        nVar = nVarC;
                    }
                } else {
                    j10.e eVar2 = (j10.e) hVarG2;
                    s0 s0VarG = n0.b.g(constructor, arguments);
                    yVar = eVar2 instanceof m10.y ? (m10.y) eVar2 : null;
                    if (yVar == null || (nVarT = yVar.t(s0VarG, fVar)) == null) {
                        nVarA = eVar2.u0(s0VarG);
                        kotlin.jvm.internal.m.d(nVarA, "getMemberScope(...)");
                    } else {
                        nVar = nVarT;
                    }
                }
                return w(attributes, constructor, arguments, z, nVar, new x(attributes, constructor, arguments, z));
            }
            if (hVarG2 instanceof j10.q0) {
                g30.h hVar = g30.h.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((m10.m) ((j10.q0) hVarG2)).getName().A;
                kotlin.jvm.internal.m.d(str, "toString(...)");
                nVarA = g30.l.a(hVar, true, str);
            } else {
                if (!(constructor instanceof v)) {
                    throw new IllegalStateException("Unsupported classifier: " + hVarG2 + " for constructor: " + constructor);
                }
                nVarA = kh.n.A("member scope for intersection type", ((v) constructor).B);
            }
        }
        nVar = nVarA;
        return w(attributes, constructor, arguments, z, nVar, new x(attributes, constructor, arguments, z));
    }

    public static final a0 v(h0 attributes, m0 constructor, List arguments, x20.n memberScope, boolean z) {
        kotlin.jvm.internal.m.e(attributes, "attributes");
        kotlin.jvm.internal.m.e(constructor, "constructor");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        kotlin.jvm.internal.m.e(memberScope, "memberScope");
        b0 b0Var = new b0(constructor, arguments, z, memberScope, new x(attributes, constructor, arguments, memberScope, z));
        return attributes.isEmpty() ? b0Var : new c0(b0Var, attributes);
    }

    public static final a0 w(h0 attributes, m0 constructor, List arguments, boolean z, x20.n memberScope, u00.k kVar) {
        kotlin.jvm.internal.m.e(attributes, "attributes");
        kotlin.jvm.internal.m.e(constructor, "constructor");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        kotlin.jvm.internal.m.e(memberScope, "memberScope");
        b0 b0Var = new b0(constructor, arguments, z, memberScope, kVar);
        return attributes.isEmpty() ? b0Var : new c0(b0Var, attributes);
    }

    public static final w x(j10.r0 r0Var) {
        kotlin.jvm.internal.m.e(r0Var, "<this>");
        j10.k kVarL = r0Var.l();
        kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
        if (kVarL instanceof j10.i) {
            List parameters = ((j10.i) kVarL).f().getParameters();
            kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(h00.r.q0(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                m0 m0VarF = ((j10.r0) it.next()).f();
                kotlin.jvm.internal.m.d(m0VarF, "getTypeConstructor(...)");
                arrayList.add(m0VarF);
            }
            List upperBounds = r0Var.getUpperBounds();
            kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
            return d(arrayList, upperBounds, u20.d.e(r0Var));
        }
        if (!(kVarL instanceof j10.u)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((j10.u) kVarL).getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(h00.r.q0(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            m0 m0VarF2 = ((j10.r0) it2.next()).f();
            kotlin.jvm.internal.m.d(m0VarF2, "getTypeConstructor(...)");
            arrayList2.add(m0VarF2);
        }
        List upperBounds2 = r0Var.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds2, "getUpperBounds(...)");
        return d(arrayList2, upperBounds2, u20.d.e(r0Var));
    }

    public static boolean y(h30.o oVar, h30.h hVar, h30.h hVar2) {
        if (oVar.A(hVar) == oVar.A(hVar2) && oVar.e(hVar) == oVar.e(hVar2) && oVar.H(hVar) == oVar.H(hVar2) && oVar.b0(oVar.X(hVar), oVar.X(hVar2))) {
            if (oVar.Y(hVar, hVar2)) {
                return true;
            }
            int iA = oVar.A(hVar);
            for (int i = 0; i < iA; i++) {
                h30.k kVarQ = oVar.Q(hVar, i);
                h30.k kVarQ2 = oVar.Q(hVar2, i);
                if (oVar.g0(kVarQ) == oVar.g0(kVarQ2)) {
                    if (!oVar.g0(kVarQ)) {
                        if (oVar.C0(kVarQ) == oVar.C0(kVarQ2)) {
                            h30.g gVarE0 = oVar.E0(kVarQ);
                            kotlin.jvm.internal.m.b(gVarE0);
                            h30.g gVarE1 = oVar.E0(kVarQ2);
                            kotlin.jvm.internal.m.b(gVarE1);
                            if (!A(oVar, gVarE0, gVarE1)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(h30.o context, h30.g a, h30.g b) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(a, "a");
        kotlin.jvm.internal.m.e(b, "b");
        return A(context, a, b);
    }

    public abstract h30.h F(l0 l0Var, h30.g gVar);
}
