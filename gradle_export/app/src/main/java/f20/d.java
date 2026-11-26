package f20;

import a1.v2;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.x5;
import e30.a0;
import e30.a1;
import e30.f0;
import e30.h0;
import e30.m0;
import e30.p0;
import e30.w;
import e30.x0;
import e30.z0;
import e7.l0;
import h00.x;
import j10.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m10.i0;
import m10.u;
import qd.j0;
import v2.b0;
import x10.z;

public final class d {
    public static c7.g c(a0 a0Var, v2 v2Var, int i, q qVar, boolean z, boolean z2) {
        j10.h hVarG;
        j10.e eVarA;
        Boolean bool;
        m0 m0VarM0;
        Boolean bool2;
        j0 j0Var;
        f0 f0VarJ;
        q qVar2 = q.C;
        ?? r4 = 0;
        boolean z3 = qVar != qVar2;
        boolean z4 = (z2 && z) ? false : true;
        Object obj = null;
        if ((z3 || !a0Var.e0().isEmpty()) && (hVarG = a0Var.m0().g()) != null) {
            e eVar = (e) v2Var.invoke(Integer.valueOf(i));
            k10.i iVar = t.a;
            if (qVar == qVar2 || !(hVarG instanceof j10.e)) {
                eVarA = null;
            } else if (eVar.b == f.A && qVar == q.A) {
                j10.e eVar2 = (j10.e) hVarG;
                String str = i10.d.a;
                n20.d dVarF = q20.d.f(eVar2);
                HashMap map = i10.d.j;
                if (map.containsKey(dVarF)) {
                    n20.c cVar = (n20.c) map.get(q20.d.f(eVar2));
                    if (cVar == null) {
                        throw new IllegalArgumentException("Given class " + eVar2 + " is not a mutable collection");
                    }
                    eVarA = u20.d.e(eVar2).j(cVar);
                } else if (eVar.b == f.B) {
                    eVarA = null;
                } else {
                    eVarA = null;
                }
            } else if (eVar.b == f.B || qVar != q.B) {
                eVarA = null;
            } else {
                j10.e eVar3 = (j10.e) hVarG;
                String str2 = i10.d.a;
                if (i10.d.k.containsKey(q20.d.f(eVar3))) {
                    eVarA = i10.e.a(eVar3);
                } else {
                    eVarA = null;
                }
            }
            if (qVar == qVar2) {
                bool = null;
            } else {
                h hVar = eVar.a;
                int i2 = hVar == null ? -1 : s.a[hVar.ordinal()];
                if (i2 == 1) {
                    bool = Boolean.TRUE;
                } else if (i2 != 2) {
                    bool = null;
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (eVarA == null || (m0VarM0 = eVarA.f()) == null) {
                m0VarM0 = a0Var.m0();
            }
            int i3 = i + 1;
            List listE0 = a0Var.e0();
            List parameters = m0VarM0.getParameters();
            kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
            Iterator it = listE0.iterator();
            Iterator it2 = parameters.iterator();
            ArrayList arrayList = new ArrayList(Math.min(h00.r.q0(listE0, 10), h00.r.q0(parameters, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                r0 r0Var = (r0) it2.next();
                p0 p0Var = (p0) next;
                if (z4) {
                    bool2 = bool;
                    if (!p0Var.c()) {
                        j0Var = d(p0Var.b().y0(), v2Var, i3, z2);
                    } else if (((e) v2Var.invoke(Integer.valueOf(i3))).a == h.A) {
                        z0 z0VarY0 = p0Var.b().y0();
                        j0Var = new j0(e30.c.f(e30.c.m(z0VarY0).z0(r4), e30.c.G(z0VarY0).z0(true)), 1, 5);
                    } else {
                        j0Var = new j0((Object) null, 1, 5);
                    }
                } else {
                    bool2 = bool;
                    j0Var = new j0(obj, (int) r4, 5);
                }
                i3 += j0Var.B;
                w wVar = (w) j0Var.C;
                if (wVar != null) {
                    a1 a1VarA = p0Var.a();
                    kotlin.jvm.internal.m.d(a1VarA, "getProjectionKind(...)");
                    f0VarJ = ab.a0.I(wVar, a1VarA, r0Var);
                } else if (eVarA == null || p0Var.c()) {
                    f0VarJ = eVarA != null ? x0.j(r0Var) : null;
                } else {
                    w wVarB = p0Var.b();
                    kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                    a1 a1VarA2 = p0Var.a();
                    kotlin.jvm.internal.m.d(a1VarA2, "getProjectionKind(...)");
                    f0VarJ = ab.a0.I(wVarB, a1VarA2, r0Var);
                }
                arrayList.add(f0VarJ);
                bool = bool2;
                r4 = 0;
                obj = null;
            }
            Boolean bool3 = bool;
            int i4 = i3 - i;
            if (eVarA == null && bool3 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (((p0) it3.next()) == null);
                }
                return new c7.g((a0) null, i4, false);
            }
            k10.h annotations = a0Var.getAnnotations();
            k10.i iVar2 = t.b;
            if (eVarA == null) {
                iVar2 = null;
            }
            List listC0 = h00.n.C0(new k10.h[]{annotations, iVar2, bool3 != null ? t.a : null});
            int size = ((ArrayList) listC0).size();
            if (size == 0) {
                throw new IllegalStateException("At least one Annotations object expected");
            }
            h0 h0VarE = e30.c.E(size != 1 ? new k10.i(1, h00.q.n1(listC0)) : (k10.h) h00.q.d1(listC0));
            List listE1 = a0Var.e0();
            Iterator it4 = arrayList.iterator();
            Iterator it5 = listE1.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(h00.r.q0(arrayList, 10), h00.r.q0(listE1, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                p0 p0Var2 = (p0) it5.next();
                p0 p0Var3 = (p0) next2;
                if (p0Var3 != null) {
                    p0Var2 = p0Var3;
                }
                arrayList2.add(p0Var2);
            }
            a0 a0VarU = e30.c.u(h0VarE, m0VarM0, arrayList2, bool3 != null ? bool3.booleanValue() : a0Var.t0());
            if (eVar.c) {
                a0VarU = new g(a0VarU);
            }
            return new c7.g(a0VarU, i4, bool3 != null && eVar.d);
        }
        return new c7.g((a0) null, 1, false);
    }

    public static j0 d(z0 z0Var, v2 v2Var, int i, boolean z) {
        z0 z0VarF;
        Object objI = null;
        if (e30.c.k(z0Var)) {
            return new j0((Object) null, 1, 5);
        }
        if (!(z0Var instanceof e30.q)) {
            if (!(z0Var instanceof a0)) {
                throw new NoWhenBranchMatchedException();
            }
            c7.g gVarC = c((a0) z0Var, v2Var, i, q.C, false, z);
            z0 z0VarI = (a0) gVarC.c;
            if (gVarC.b) {
                z0VarI = e30.c.I(z0Var, z0VarI);
            }
            return new j0(z0VarI, gVarC.a, 5);
        }
        boolean z2 = z0Var instanceof c20.i;
        e30.q qVar = (e30.q) z0Var;
        a0 a0Var = qVar.C;
        a0 a0Var2 = qVar.B;
        c7.g gVarC2 = c(a0Var2, v2Var, i, q.A, z2, z);
        c7.g gVarC3 = c(qVar.C, v2Var, i, q.B, z2, z);
        a0 a0Var3 = (a0) gVarC3.c;
        a0 a0Var4 = (a0) gVarC2.c;
        if (a0Var4 != null || a0Var3 != null) {
            if (gVarC2.b) {
                if (a0Var3 != null) {
                    if (a0Var4 == null) {
                        a0Var4 = a0Var3;
                    }
                    z0VarF = e30.c.f(a0Var4, a0Var3);
                } else {
                    kotlin.jvm.internal.m.b(a0Var4);
                    z0VarF = a0Var4;
                }
                objI = e30.c.I(z0Var, z0VarF);
            } else {
                a0 a0Var5 = a0Var4;
                if (gVarC3.b) {
                    if (a0Var3 != null) {
                        if (a0Var4 == null) {
                            a0Var4 = a0Var3;
                        }
                        z0VarF = e30.c.f(a0Var4, a0Var3);
                    } else {
                        kotlin.jvm.internal.m.b(a0Var4);
                        z0VarF = a0Var4;
                    }
                    objI = e30.c.I(z0Var, z0VarF);
                } else if (z2) {
                    a0 a0Var6 = a0Var4;
                    if (a0Var4 == null) {
                        a0Var6 = a0Var2;
                    }
                    if (a0Var3 != null) {
                        a0Var = a0Var3;
                    }
                    objI = new c20.i(a0Var6, a0Var);
                } else {
                    if (a0Var4 == null) {
                        a0Var5 = a0Var2;
                    }
                    if (a0Var3 != null) {
                        a0Var = a0Var3;
                    }
                    objI = e30.c.f(a0Var5, a0Var);
                }
            }
        }
        return new j0(objI, gVarC2.a, 5);
    }

    public w a(l0 l0Var, w wVar, List list, r rVar, boolean z) {
        boolean z2;
        r0 r0VarV;
        ArrayList arrayList;
        oj.q qVar;
        ArrayList arrayList2;
        i iVar;
        i iVarB;
        e eVar;
        boolean z3;
        f fVar;
        k10.h annotations;
        e30.q qVarG;
        boolean z4;
        ArrayList<e> arrayList3;
        Iterator it;
        boolean z5;
        boolean z6;
        h hVar;
        ArrayList arrayList4;
        Set setR1;
        h hVar2;
        h hVar3;
        h hVar4;
        ArrayList arrayList5;
        Iterator it2;
        boolean z7;
        boolean z8;
        Iterator it3;
        e eVar2;
        f fVar2;
        ArrayList arrayList6;
        Iterator it4;
        Set setR2;
        h hVar5;
        h hVar6;
        b bVar;
        Object eVar3;
        h30.g gVar;
        h hVarD;
        a0 a0VarH;
        a0 a0VarH2;
        f fVar3;
        h30.p pVarQ;
        k10.a aVar = (k10.a) l0Var.c;
        oj.q qVar2 = (oj.q) l0Var.d;
        boolean z9 = l0Var.a;
        kotlin.jvm.internal.m.e(wVar, "<this>");
        ArrayList arrayListG = l0Var.g(wVar);
        ArrayList arrayList7 = new ArrayList(h00.r.q0(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList7.add(l0Var.g((h30.g) it5.next()));
        }
        if (!z9 || list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z2 = false;
                break;
            }
            h30.g other = (h30.g) it6.next();
            kotlin.jvm.internal.m.e(other, "other");
            if (!((f30.l) ((a20.b) qVar2.B).u).a(wVar, (w) other)) {
                z2 = true;
                break;
            }
        }
        int size = arrayListG.size();
        e[] eVarArr = new e[size];
        int i = 0;
        while (i < size) {
            g00.h hVarI = rd.a.I(g00.i.C, new a30.r(l0Var, arrayListG, i, 2));
            e eVar4 = e.e;
            if (i <= 0 || !z2) {
                b bVar2 = (b) arrayListG.get(i);
                x10.m mVar = (x10.m) hVarI.getValue();
                h30.g gVar2 = bVar2.a;
                h30.m mVar2 = bVar2.c;
                if (gVar2 == null) {
                    if (mVar2 == null) {
                        pVarQ = null;
                    } else {
                        if (!(mVar2 instanceof r0)) {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(mVar2);
                            sb.append(", ");
                            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, mVar2.getClass(), sb).toString());
                        }
                        a1 a1VarF = ((r0) mVar2).F();
                        kotlin.jvm.internal.m.d(a1VarF, "getVariance(...)");
                        pVarQ = f50.c.q(a1VarF);
                    }
                    if (pVarQ == h30.p.IN) {
                        qVar = qVar2;
                        arrayList = arrayListG;
                        arrayList2 = arrayList7;
                        eVar = eVar4;
                        iVar = null;
                    }
                    z4 = eVar.d;
                    arrayList3 = new ArrayList();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        bVar = (b) h00.q.O0(i, (List) it.next());
                        if (bVar != null || (gVar = bVar.a) == null) {
                            eVar3 = iVar;
                        } else {
                            h hVarD2 = l0.d(gVar);
                            if (hVarD2 == null) {
                                w wVarG = e30.c.g((w) gVar);
                                hVarD = wVarG != null ? l0.d(wVarG) : iVar;
                            } else {
                                hVarD = hVarD2;
                            }
                            String str = i10.d.a;
                            e30.q qVarG2 = f30.g.g(gVar);
                            if (qVarG2 == null || (a0VarH = f30.g.R(qVarG2)) == null) {
                                a0VarH = f30.g.h(gVar);
                                kotlin.jvm.internal.m.b(a0VarH);
                            }
                            if (i10.d.k.containsKey(l0.c(a0VarH))) {
                                fVar3 = f.A;
                            } else {
                                e30.q qVarG3 = f30.g.g(gVar);
                                if (qVarG3 == null || (a0VarH2 = f30.g.c0(qVarG3)) == null) {
                                    a0VarH2 = f30.g.h(gVar);
                                    kotlin.jvm.internal.m.b(a0VarH2);
                                }
                                fVar3 = i10.d.j.containsKey(l0.c(a0VarH2)) ? f.B : iVar;
                            }
                            a0 a0VarH3 = f30.g.h(gVar);
                            eVar3 = new e(hVarD, fVar3, ((a0VarH3 != null ? f30.g.f(a0VarH3) : iVar) != null) || (((w) gVar).y0() instanceof g), hVarD != hVarD2);
                        }
                        if (eVar3 != null) {
                            arrayList3.add(eVar3);
                        }
                    }
                    if (i == 0 || !z9) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (i == 0 || !(aVar instanceof m10.r0) || ((m10.r0) aVar).K == null) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    hVar = eVar.a;
                    arrayList4 = new ArrayList();
                    for (e eVar5 : arrayList3) {
                        if (eVar5.d) {
                            hVar6 = null;
                        } else {
                            hVar6 = eVar5.a;
                        }
                        if (hVar6 != null) {
                            arrayList4.add(hVar6);
                        }
                    }
                    setR1 = h00.q.r1(arrayList4);
                    if (z4) {
                        hVar2 = null;
                    } else {
                        hVar2 = hVar;
                    }
                    hVar3 = h.A;
                    if (hVar2 != hVar3) {
                        hVar3 = (h) b5.L(setR1, h.C, h.B, hVar2, z5);
                    }
                    if (hVar3 == null) {
                        arrayList6 = new ArrayList();
                        it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            hVar5 = ((e) it4.next()).a;
                            if (hVar5 != null) {
                                arrayList6.add(hVar5);
                            }
                        }
                        setR2 = h00.q.r1(arrayList6);
                        hVar4 = h.A;
                        if (hVar != hVar4) {
                            hVar4 = (h) b5.L(setR2, h.C, h.B, hVar, z5);
                        }
                    } else {
                        hVar4 = hVar3;
                    }
                    arrayList5 = new ArrayList();
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        fVar2 = ((e) it2.next()).b;
                        if (fVar2 != null) {
                            arrayList5.add(fVar2);
                        }
                    }
                    f fVar4 = (f) b5.L(h00.q.r1(arrayList5), f.B, f.A, eVar.b, z5);
                    if (hVar4 != null || z || (z6 && hVar4 == h.B)) {
                        hVar4 = null;
                    }
                    if (hVar4 == null && hVar3 == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (hVar4 != h.C) {
                        z8 = false;
                    } else {
                        if (z4 == z7 || !eVar.c) {
                            if (!arrayList3.isEmpty()) {
                                it3 = arrayList3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        eVar2 = (e) it3.next();
                                        if (eVar2.d == z7 || !eVar2.c) {
                                        }
                                    }
                                }
                            }
                            z8 = false;
                        }
                        z8 = true;
                    }
                    eVar4 = new e(hVar4, fVar4, z8, z7);
                } else {
                    z9 = z9;
                }
                boolean z11 = mVar2 == null;
                x xVar = x.A;
                Iterable annotations2 = gVar2 != null ? ((w) gVar2).getAnnotations() : xVar;
                if (gVar2 == null) {
                    r0VarV = null;
                } else {
                    a0 a0VarH4 = f30.g.h(gVar2);
                    if (a0VarH4 == null && ((qVarG = f30.g.g(gVar2)) == null || (a0VarH4 = f30.g.R(qVarG)) == null)) {
                        a0 a0VarH5 = f30.g.h(gVar2);
                        kotlin.jvm.internal.m.b(a0VarH5);
                        a0VarH4 = a0VarH5;
                    }
                    m0 m0VarA0 = f30.g.a0(a0VarH4);
                    if (m0VarA0 != null) {
                        r0VarV = f30.g.v(m0VarA0);
                    } else {
                        r0VarV = null;
                    }
                }
                boolean z12 = z11;
                boolean z13 = ((x10.a) l0Var.e) == x10.a.TYPE_PARAMETER_BOUNDS;
                if (z12) {
                    if (!z13) {
                        ((a20.b) qVar2.B).t.getClass();
                    }
                    annotations2 = h00.q.W0((aVar == null || (annotations = aVar.getAnnotations()) == null) ? xVar : annotations, annotations2);
                }
                ((a20.b) qVar2.B).q.getClass();
                Iterator it7 = annotations2.iterator();
                f fVar5 = null;
                while (true) {
                    if (!it7.hasNext()) {
                        arrayList = arrayListG;
                        break;
                    }
                    Iterator it8 = it7;
                    n20.c cVarD = x10.b.d(it7.next());
                    arrayList = arrayListG;
                    if (h00.q.F0(x10.w.n, cVarD)) {
                        fVar = f.A;
                    } else {
                        if (h00.q.F0(x10.w.o, cVarD)) {
                            fVar = f.B;
                        } else {
                            continue;
                        }
                        it7 = it8;
                        arrayListG = arrayList;
                    }
                    if (fVar5 != null && fVar5 != fVar) {
                        fVar5 = null;
                        break;
                    }
                    fVar5 = fVar;
                    it7 = it8;
                    arrayListG = arrayList;
                }
                x10.b bVar3 = ((a20.b) qVar2.B).q;
                qVar = qVar2;
                v2 v2Var = new v2(l0Var, bVar2, 12);
                bVar3.getClass();
                Iterator it9 = annotations2.iterator();
                i iVar2 = null;
                while (true) {
                    if (!it9.hasNext()) {
                        arrayList2 = arrayList7;
                        iVar = null;
                        break;
                    }
                    Object next = it9.next();
                    Iterator it10 = it9;
                    i iVarG = bVar3.g(next, ((Boolean) v2Var.invoke(next)).booleanValue());
                    if (iVarG != null) {
                        arrayList2 = arrayList7;
                    } else {
                        Object objI = bVar3.i(next);
                        if (objI == null) {
                            arrayList2 = arrayList7;
                        } else {
                            z zVarH = bVar3.h(next);
                            if (zVarH == null) {
                                zVarH = ((x10.t) bVar3.a.C).a;
                            }
                            arrayList2 = arrayList7;
                            if (zVarH == z.IGNORE) {
                                iVarG = null;
                            } else {
                                i iVarG2 = bVar3.g(objI, ((Boolean) v2Var.invoke(objI)).booleanValue());
                                if (iVarG2 != null) {
                                    boolean z14 = zVarH == z.WARN;
                                    bVar3 = bVar3;
                                    iVar = null;
                                    iVarG = i.a(iVarG2, null, z14, 1);
                                }
                            }
                            if (iVar2 == null) {
                                iVar2 = iVarG;
                            } else {
                                boolean z15 = iVar2.b;
                                if (iVarG == null && !iVarG.equals(iVar2) && (!(z3 = iVarG.b) || z15)) {
                                    if (z3 || !z15) {
                                        iVar2 = iVar;
                                        break;
                                    }
                                    iVar2 = iVarG;
                                }
                            }
                            bVar3 = bVar3;
                            arrayList7 = arrayList2;
                            it9 = it10;
                        }
                        bVar3 = bVar3;
                        iVar = null;
                        iVarG = null;
                        if (iVar2 == null) {
                            iVar2 = iVarG;
                        } else {
                            boolean z16 = iVar2.b;
                            if (iVarG == null) {
                                continue;
                            }
                        }
                        bVar3 = bVar3;
                        arrayList7 = arrayList2;
                        it9 = it10;
                    }
                    iVar = null;
                    if (iVar2 == null) {
                        iVar2 = iVarG;
                    } else {
                        boolean z17 = iVar2.b;
                        if (iVarG == null) {
                            continue;
                        }
                    }
                    bVar3 = bVar3;
                    arrayList7 = arrayList2;
                    it9 = it10;
                }
                if (iVar2 != null) {
                    h hVar7 = iVar2.a;
                    eVar = new e(hVar7, fVar5, hVar7 == h.C && r0VarV != null, iVar2.b);
                } else {
                    i iVarB2 = r0VarV != null ? l0Var.b(r0VarV) : iVar;
                    i iVarA = iVarB2 != null ? i.a(iVarB2, h.C, false, 2) : mVar != null ? mVar.a : iVar;
                    boolean z18 = (iVarB2 != null ? iVarB2.a : iVar) == h.C || !(r0VarV == null || mVar == null || !mVar.c);
                    if (mVar2 == null || (iVarB = l0Var.b(mVar2)) == null) {
                        iVarB = iVar;
                    } else if (iVarB.a == h.B) {
                        iVarB = i.a(iVarB, h.A, false, 2);
                    }
                    if (iVarB != null) {
                        h hVar8 = iVarB.a;
                        if (iVarA == null) {
                            iVarA = iVarB;
                        } else {
                            h hVar9 = iVarA.a;
                            boolean z19 = iVarA.b;
                            boolean z21 = iVarB.b;
                            if ((!z21 || z19) && ((!z21 && z19) || (hVar8.compareTo(hVar9) >= 0 && hVar8.compareTo(hVar9) > 0))) {
                                iVarA = iVarB;
                            }
                        }
                    }
                    eVar = new e(iVarA != null ? iVarA.a : iVar, fVar5, z18, iVarA != null && iVarA.b);
                }
                z4 = eVar.d;
                arrayList3 = new ArrayList();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    bVar = (b) h00.q.O0(i, (List) it.next());
                    if (bVar != null) {
                        eVar3 = iVar;
                    } else {
                        eVar3 = iVar;
                    }
                    if (eVar3 != null) {
                        arrayList3.add(eVar3);
                    }
                }
                if (i == 0) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (i == 0) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                hVar = eVar.a;
                arrayList4 = new ArrayList();
                while (r13.hasNext()) {
                    if (eVar5.d) {
                        hVar6 = null;
                    } else {
                        hVar6 = eVar5.a;
                    }
                    if (hVar6 != null) {
                        arrayList4.add(hVar6);
                    }
                }
                setR1 = h00.q.r1(arrayList4);
                if (z4) {
                    hVar2 = null;
                } else {
                    hVar2 = hVar;
                }
                hVar3 = h.A;
                if (hVar2 != hVar3) {
                    hVar3 = (h) b5.L(setR1, h.C, h.B, hVar2, z5);
                }
                if (hVar3 == null) {
                    arrayList6 = new ArrayList();
                    it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        hVar5 = ((e) it4.next()).a;
                        if (hVar5 != null) {
                            arrayList6.add(hVar5);
                        }
                    }
                    setR2 = h00.q.r1(arrayList6);
                    hVar4 = h.A;
                    if (hVar != hVar4) {
                        hVar4 = (h) b5.L(setR2, h.C, h.B, hVar, z5);
                    }
                } else {
                    hVar4 = hVar3;
                }
                arrayList5 = new ArrayList();
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    fVar2 = ((e) it2.next()).b;
                    if (fVar2 != null) {
                        arrayList5.add(fVar2);
                    }
                }
                f fVar6 = (f) b5.L(h00.q.r1(arrayList5), f.B, f.A, eVar.b, z5);
                if (hVar4 != null) {
                    hVar4 = null;
                } else {
                    hVar4 = null;
                }
                if (hVar4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (hVar4 != h.C) {
                    z8 = false;
                } else if (z4 == z7) {
                    if (!arrayList3.isEmpty()) {
                        it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                eVar2 = (e) it3.next();
                                if (eVar2.d == z7) {
                                }
                            }
                        }
                    }
                    z8 = false;
                } else {
                    if (!arrayList3.isEmpty()) {
                        it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                eVar2 = (e) it3.next();
                                if (eVar2.d == z7) {
                                }
                            }
                        }
                    }
                    z8 = false;
                }
                eVar4 = new e(hVar4, fVar6, z8, z7);
            } else {
                qVar = qVar2;
                z9 = z9;
                arrayList = arrayListG;
                arrayList2 = arrayList7;
            }
            eVarArr[i] = eVar4;
            i++;
            z9 = z9;
            qVar2 = qVar;
            arrayList7 = arrayList2;
            arrayListG = arrayList;
            aVar = aVar;
        }
        return (w) d(wVar.y0(), new v2(rVar, eVarArr, 13), 0, l0Var.b).C;
    }

    public w b(z10.a aVar, j10.b bVar, boolean z, oj.q qVar, x10.a aVar2, r rVar, boolean z2, u00.k kVar) {
        l0 l0Var = new l0(bVar, z, qVar, aVar2, false);
        w wVar = (w) kVar.invoke(aVar);
        Collection collectionM = aVar.m();
        kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
        Collection<j10.c> collection = collectionM;
        ArrayList arrayList = new ArrayList(h00.r.q0(collection, 10));
        for (j10.c cVar : collection) {
            kotlin.jvm.internal.m.b(cVar);
            arrayList.add((w) kVar.invoke(cVar));
        }
        return a(l0Var, wVar, arrayList, rVar, z2);
    }

    public ArrayList e(oj.q c, Collection collection) {
        k10.h annotations;
        w type;
        n nVar;
        boolean z;
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        j10.l0 l0Var;
        boolean z2;
        x10.a aVar;
        r rVar;
        boolean z3;
        int i;
        w wVarB;
        w returnType;
        boolean z4;
        g00.k kVar;
        ArrayList arrayList3;
        int i2;
        int i3;
        w type2;
        u uVarX;
        Iterator it;
        boolean z5;
        u uVarX2;
        boolean zC;
        List listO;
        Iterator it2;
        w type3;
        boolean z6;
        r rVar2;
        oj.q qVarX;
        List list;
        m10.j0 j0Var;
        o oVar = o.E;
        kotlin.jvm.internal.m.e(c, "c");
        Collection<f5.c> collection2 = collection;
        int i4 = 10;
        ArrayList arrayList4 = new ArrayList(h00.r.q0(collection2, 10));
        for (f5.c cVarR0 : collection2) {
            if (!(cVarR0 instanceof z10.a)) {
                i2 = i4;
            } else if (cVarR0.getKind() == 2 && cVarR0.a().m().size() == 1) {
                i2 = 10;
            } else {
                j10.h hVarG = j10.w.g(cVarR0);
                if (hVarG == null) {
                    annotations = cVarR0.getAnnotations();
                } else {
                    b20.i iVar = hVarG instanceof b20.i ? (b20.i) hVarG : null;
                    List list2 = iVar != null ? (List) iVar.K.getValue() : null;
                    if (list2 == null || list2.isEmpty()) {
                        annotations = cVarR0.getAnnotations();
                    } else {
                        ArrayList arrayList5 = new ArrayList(h00.r.q0(list2, i4));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(new b20.f(c, (p10.e) it3.next(), true));
                        }
                        ArrayList arrayListW0 = h00.q.W0(cVarR0.getAnnotations(), arrayList5);
                        annotations = arrayListW0.isEmpty() ? k10.g.a : new k10.i(0, arrayListW0);
                    }
                }
                oj.q qVarX2 = c7.i.x(c, annotations);
                ?? r11 = (!(cVarR0 instanceof z10.f) || (j0Var = ((i0) cVarR0).X) == null || j0Var.F) ? cVarR0 : j0Var;
                if (cVarR0.X() != null) {
                    j10.u uVar = r11 instanceof j10.u ? (j10.u) r11 : null;
                    m10.r0 r0Var = uVar != null ? (m10.r0) uVar.q0(z10.e.g0) : null;
                    type = b((z10.a) cVarR0, r0Var, false, r0Var != null ? c7.i.x(qVarX2, r0Var.getAnnotations()) : qVarX2, x10.a.VALUE_PARAMETER, null, false, o.B);
                } else {
                    type = null;
                }
                z10.e eVar = cVarR0 instanceof z10.e ? (z10.e) cVarR0 : null;
                if (eVar != null) {
                    j10.k kVarL = eVar.l();
                    kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String strQ = bi.b.Q((j10.e) kVarL, c7.i.u(eVar, 3));
                    if (strQ == null || (nVar = (n) m.d.get(strQ)) == null) {
                        nVar = null;
                    } else {
                        String str3 = nVar.c;
                        if (str3 != null && !r30.r.x0(str3, "2.", false)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (str3 != null) {
                            nVar = nVar.d;
                        }
                    }
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.b.size();
                    ((z10.e) cVarR0).O().size();
                }
                f4 javaTypeEnhancementState = ((a20.b) c.B).v;
                kotlin.jvm.internal.m.e(javaTypeEnhancementState, "javaTypeEnhancementState");
                if (((b0) javaTypeEnhancementState.D).invoke(x10.q.a) == z.STRICT) {
                    if ((cVarR0 instanceof j10.u) && kotlin.jvm.internal.m.a(cVarR0.q0(z10.e.h0), Boolean.TRUE)) {
                        z = true;
                    }
                    List<m10.r0> listO2 = r11.O();
                    str = "getValueParameters(...)";
                    kotlin.jvm.internal.m.d(listO2, "getValueParameters(...)");
                    arrayList = new ArrayList(h00.r.q0(listO2, i4));
                    for (m10.r0 r0Var2 : listO2) {
                        if (nVar != null || (list = nVar.b) == null) {
                            rVar2 = null;
                        } else {
                            rVar2 = (r) h00.q.O0(r0Var2.G, list);
                        }
                        a20.d dVar = new a20.d(r0Var2, 15);
                        ArrayList arrayList6 = arrayList;
                        z10.a aVar2 = (z10.a) cVarR0;
                        if (r0Var2 != null) {
                            qVarX = c7.i.x(qVarX2, r0Var2.getAnnotations());
                        } else {
                            qVarX = qVarX2;
                        }
                        arrayList6.add(b(aVar2, r0Var2, false, qVarX, x10.a.VALUE_PARAMETER, rVar2, z, dVar));
                        str = str;
                        arrayList = arrayList6;
                    }
                    str2 = str;
                    arrayList2 = arrayList;
                    if (cVarR0 instanceof j10.l0) {
                        l0Var = (j10.l0) cVarR0;
                    } else {
                        l0Var = null;
                    }
                    if (l0Var != null) {
                        z2 = true;
                        if (rd.a.H(l0Var)) {
                            aVar = x10.a.FIELD;
                        }
                        x10.a aVar3 = aVar;
                        if (nVar != null) {
                            rVar = nVar.a;
                        } else {
                            rVar = null;
                        }
                        z3 = z2;
                        z10.a aVar4 = (z10.a) cVarR0;
                        i = 0;
                        wVarB = b(aVar4, r11, true, qVarX2, aVar3, rVar, false, o.C);
                        returnType = cVarR0.getReturnType();
                        kotlin.jvm.internal.m.b(returnType);
                        if (x0.c(returnType, oVar, null)) {
                            z4 = z3;
                        } else {
                            uVarX2 = cVarR0.X();
                            if (uVarX2 != null) {
                                zC = x0.c(uVarX2.getType(), oVar, null);
                            } else {
                                zC = false;
                            }
                            if (zC) {
                                z4 = z3;
                            } else {
                                listO = cVarR0.O();
                                kotlin.jvm.internal.m.d(listO, str2);
                                if (listO.isEmpty()) {
                                    z6 = false;
                                    break;
                                }
                                it2 = listO.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        z6 = false;
                                        break;
                                    }
                                    type3 = ((m10.r0) it2.next()).getType();
                                    kotlin.jvm.internal.m.d(type3, "getType(...)");
                                    if (x0.c(type3, oVar, null)) {
                                        z6 = z3;
                                        break;
                                    }
                                }
                                if (z6) {
                                    z4 = z3;
                                } else {
                                    z4 = false;
                                }
                            }
                        }
                        if (z4) {
                            kVar = new g00.k(t20.c.a, new x10.g());
                        } else {
                            kVar = null;
                        }
                        if (type == null && wVarB == null) {
                            if (arrayList2.isEmpty()) {
                                z3 = false;
                                break;
                            }
                            it = arrayList2.iterator();
                            do {
                                if (it.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                if (((w) it.next()) != null) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                            } while (!z5);
                            if (z3 && kVar == null) {
                                i2 = 10;
                            }
                        }
                        if (type == null) {
                            uVarX = cVarR0.X();
                            if (uVarX != null) {
                                type = uVarX.getType();
                            } else {
                                type = null;
                            }
                        }
                        i2 = 10;
                        arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
                        for (Object obj : arrayList2) {
                            i3 = i + 1;
                            if (i >= 0) {
                                va.a.k0();
                                throw null;
                            }
                            type2 = (w) obj;
                            if (type2 == null) {
                                type2 = ((m10.r0) cVarR0.O().get(i)).getType();
                                kotlin.jvm.internal.m.d(type2, "getType(...)");
                            }
                            arrayList3.add(type2);
                            i = i3;
                        }
                        if (wVarB == null) {
                            wVarB = cVarR0.getReturnType();
                            kotlin.jvm.internal.m.b(wVarB);
                        }
                        cVarR0 = aVar4.r0(type, arrayList3, wVarB, kVar);
                    } else {
                        z2 = true;
                    }
                    aVar = x10.a.METHOD_RETURN_TYPE;
                    x10.a aVar5 = aVar;
                    if (nVar != null) {
                        rVar = nVar.a;
                    } else {
                        rVar = null;
                    }
                    z3 = z2;
                    z10.a aVar6 = (z10.a) cVarR0;
                    i = 0;
                    wVarB = b(aVar6, r11, true, qVarX2, aVar5, rVar, false, o.C);
                    returnType = cVarR0.getReturnType();
                    kotlin.jvm.internal.m.b(returnType);
                    if (x0.c(returnType, oVar, null)) {
                        z4 = z3;
                    } else {
                        uVarX2 = cVarR0.X();
                        if (uVarX2 != null) {
                            zC = x0.c(uVarX2.getType(), oVar, null);
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            listO = cVarR0.O();
                            kotlin.jvm.internal.m.d(listO, str2);
                            if (listO.isEmpty()) {
                                z6 = false;
                                break;
                            }
                            it2 = listO.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    z6 = false;
                                    break;
                                }
                                type3 = ((m10.r0) it2.next()).getType();
                                kotlin.jvm.internal.m.d(type3, "getType(...)");
                                if (x0.c(type3, oVar, null)) {
                                    z6 = z3;
                                    break;
                                }
                            }
                            if (z6) {
                                z4 = z3;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z4 = z3;
                        }
                    }
                    if (z4) {
                        kVar = new g00.k(t20.c.a, new x10.g());
                    } else {
                        kVar = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z3 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z3 = false;
                                break;
                            }
                            if (((w) it.next()) != null) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                        } while (!z5);
                        if (z3) {
                        }
                    }
                    if (type == null) {
                        uVarX = cVarR0.X();
                        if (uVarX != null) {
                            type = uVarX.getType();
                        } else {
                            type = null;
                        }
                    }
                    i2 = 10;
                    arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
                    while (r7.hasNext()) {
                        i3 = i + 1;
                        if (i >= 0) {
                            va.a.k0();
                            throw null;
                        }
                        type2 = (w) obj;
                        if (type2 == null) {
                            type2 = ((m10.r0) cVarR0.O().get(i)).getType();
                            kotlin.jvm.internal.m.d(type2, "getType(...)");
                        }
                        arrayList3.add(type2);
                        i = i3;
                    }
                    if (wVarB == null) {
                        wVarB = cVarR0.getReturnType();
                        kotlin.jvm.internal.m.b(wVarB);
                    }
                    cVarR0 = aVar6.r0(type, arrayList3, wVarB, kVar);
                } else {
                    ((a20.b) qVarX2.B).t.getClass();
                }
                z = false;
                List<m10.r0> listO3 = r11.O();
                str = "getValueParameters(...)";
                kotlin.jvm.internal.m.d(listO3, "getValueParameters(...)");
                arrayList = new ArrayList(h00.r.q0(listO3, i4));
                while (r10.hasNext()) {
                    if (nVar != null) {
                        rVar2 = null;
                    } else {
                        rVar2 = null;
                    }
                    a20.d dVar2 = new a20.d(r0Var2, 15);
                    ArrayList arrayList7 = arrayList;
                    z10.a aVar7 = (z10.a) cVarR0;
                    if (r0Var2 != null) {
                        qVarX = c7.i.x(qVarX2, r0Var2.getAnnotations());
                    } else {
                        qVarX = qVarX2;
                    }
                    arrayList7.add(b(aVar7, r0Var2, false, qVarX, x10.a.VALUE_PARAMETER, rVar2, z, dVar2));
                    str = str;
                    arrayList = arrayList7;
                }
                str2 = str;
                arrayList2 = arrayList;
                if (cVarR0 instanceof j10.l0) {
                    l0Var = (j10.l0) cVarR0;
                } else {
                    l0Var = null;
                }
                if (l0Var != null) {
                    z2 = true;
                    if (rd.a.H(l0Var)) {
                        aVar = x10.a.FIELD;
                    }
                    x10.a aVar8 = aVar;
                    if (nVar != null) {
                        rVar = nVar.a;
                    } else {
                        rVar = null;
                    }
                    z3 = z2;
                    z10.a aVar9 = (z10.a) cVarR0;
                    i = 0;
                    wVarB = b(aVar9, r11, true, qVarX2, aVar8, rVar, false, o.C);
                    returnType = cVarR0.getReturnType();
                    kotlin.jvm.internal.m.b(returnType);
                    if (x0.c(returnType, oVar, null)) {
                        z4 = z3;
                    } else {
                        uVarX2 = cVarR0.X();
                        if (uVarX2 != null) {
                            zC = x0.c(uVarX2.getType(), oVar, null);
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            listO = cVarR0.O();
                            kotlin.jvm.internal.m.d(listO, str2);
                            if (listO.isEmpty()) {
                                z6 = false;
                                break;
                            }
                            it2 = listO.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    z6 = false;
                                    break;
                                }
                                type3 = ((m10.r0) it2.next()).getType();
                                kotlin.jvm.internal.m.d(type3, "getType(...)");
                                if (x0.c(type3, oVar, null)) {
                                    z6 = z3;
                                    break;
                                }
                            }
                            if (z6) {
                                z4 = z3;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z4 = z3;
                        }
                    }
                    if (z4) {
                        kVar = new g00.k(t20.c.a, new x10.g());
                    } else {
                        kVar = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z3 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z3 = false;
                                break;
                            }
                            if (((w) it.next()) != null) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                        } while (!z5);
                        if (z3) {
                        }
                    }
                    if (type == null) {
                        uVarX = cVarR0.X();
                        if (uVarX != null) {
                            type = uVarX.getType();
                        } else {
                            type = null;
                        }
                    }
                    i2 = 10;
                    arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
                    while (r7.hasNext()) {
                        i3 = i + 1;
                        if (i >= 0) {
                            va.a.k0();
                            throw null;
                        }
                        type2 = (w) obj;
                        if (type2 == null) {
                            type2 = ((m10.r0) cVarR0.O().get(i)).getType();
                            kotlin.jvm.internal.m.d(type2, "getType(...)");
                        }
                        arrayList3.add(type2);
                        i = i3;
                    }
                    if (wVarB == null) {
                        wVarB = cVarR0.getReturnType();
                        kotlin.jvm.internal.m.b(wVarB);
                    }
                    cVarR0 = aVar9.r0(type, arrayList3, wVarB, kVar);
                } else {
                    z2 = true;
                }
                aVar = x10.a.METHOD_RETURN_TYPE;
                x10.a aVar10 = aVar;
                if (nVar != null) {
                    rVar = nVar.a;
                } else {
                    rVar = null;
                }
                z3 = z2;
                z10.a aVar11 = (z10.a) cVarR0;
                i = 0;
                wVarB = b(aVar11, r11, true, qVarX2, aVar10, rVar, false, o.C);
                returnType = cVarR0.getReturnType();
                kotlin.jvm.internal.m.b(returnType);
                if (x0.c(returnType, oVar, null)) {
                    z4 = z3;
                } else {
                    uVarX2 = cVarR0.X();
                    if (uVarX2 != null) {
                        zC = x0.c(uVarX2.getType(), oVar, null);
                    } else {
                        zC = false;
                    }
                    if (zC) {
                        listO = cVarR0.O();
                        kotlin.jvm.internal.m.d(listO, str2);
                        if (listO.isEmpty()) {
                            z6 = false;
                            break;
                        }
                        it2 = listO.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                z6 = false;
                                break;
                            }
                            type3 = ((m10.r0) it2.next()).getType();
                            kotlin.jvm.internal.m.d(type3, "getType(...)");
                            if (x0.c(type3, oVar, null)) {
                                z6 = z3;
                                break;
                            }
                        }
                        if (z6) {
                            z4 = z3;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = z3;
                    }
                }
                if (z4) {
                    kVar = new g00.k(t20.c.a, new x10.g());
                } else {
                    kVar = null;
                }
                if (type == null) {
                    if (arrayList2.isEmpty()) {
                        z3 = false;
                        break;
                    }
                    it = arrayList2.iterator();
                    do {
                        if (it.hasNext()) {
                            z3 = false;
                            break;
                        }
                        if (((w) it.next()) != null) {
                            z5 = z3;
                        } else {
                            z5 = false;
                        }
                    } while (!z5);
                    if (z3) {
                    }
                }
                if (type == null) {
                    uVarX = cVarR0.X();
                    if (uVarX != null) {
                        type = uVarX.getType();
                    } else {
                        type = null;
                    }
                }
                i2 = 10;
                arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
                while (r7.hasNext()) {
                    i3 = i + 1;
                    if (i >= 0) {
                        va.a.k0();
                        throw null;
                    }
                    type2 = (w) obj;
                    if (type2 == null) {
                        type2 = ((m10.r0) cVarR0.O().get(i)).getType();
                        kotlin.jvm.internal.m.d(type2, "getType(...)");
                    }
                    arrayList3.add(type2);
                    i = i3;
                }
                if (wVarB == null) {
                    wVarB = cVarR0.getReturnType();
                    kotlin.jvm.internal.m.b(wVarB);
                }
                cVarR0 = aVar11.r0(type, arrayList3, wVarB, kVar);
            }
            arrayList4.add(cVarR0);
            i4 = i2;
        }
        return arrayList4;
    }
}
