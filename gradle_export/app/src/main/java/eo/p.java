package eo;

import bv.t0;
import c30.u;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.auth.data.source.AppleAuthRedirectActivity;
import com.mchutov.quranify.push.data.service.QuranifyFirebaseMessagingService;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e30.a1;
import e30.p0;
import e30.s0;
import e30.u0;
import e30.w;
import h0.p1;
import h00.j0;
import h00.v;
import h00.x;
import h00.y;
import j10.m0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.a0;
import l1.g1;
import l1.i0;
import l1.n0;
import m10.d0;
import m10.o0;
import m10.q0;
import m10.t;
import vn.b0;
import wo.c0;
import x10.z;

public final class p implements u00.a {
    public final int A;
    public final Object B;

    public p(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final Object invoke() throws IllegalAccessException {
        m10.i iVarE;
        List list;
        u0 u0Var;
        u uVar;
        u0 u0Var2;
        ?? r6;
        Collection collection;
        s20.i iVar;
        k10.m mVar;
        s20.b bVarA;
        int i = this.A;
        x xVar = x.A;
        y yVar = y.A;
        int i2 = 0;
        u0 u0Var3 = null;
        Object obj = this.B;
        switch (i) {
            case 0:
                return x5.i(a0.a, vn.s.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 1:
                return x5.i(a0.a, b0.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 2:
                u00.a aVar = ((f30.i) obj).B;
                if (aVar != null) {
                    return (List) aVar.invoke();
                }
                return null;
            case 3:
                return x5.i(a0.a, pm.c.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 4:
                i10.j jVar = (i10.j) obj;
                g10.l lVar = jVar.f;
                if (lVar == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                i10.i iVar2 = (i10.i) lVar.invoke();
                jVar.f = null;
                return iVar2;
            case 5:
                return (x20.n) ((m0) obj).b.invoke(f30.f.a);
            case 6:
                k10.j jVar2 = (k10.j) obj;
                return jVar2.a.j(jVar2.b).n();
            case 7:
                ((u00.k) obj).invoke(t0.a);
                return g00.b0.a;
            case 8:
                ArrayList arrayList = ((i0) obj).a;
                u.i0 i0Var = new u.i0(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    o1.e eVar = (o1.e) arrayList.get(i3);
                    Object obj2 = eVar.b;
                    int i4 = eVar.a;
                    m1.a.a(i0Var, obj2 != null ? new n0(Integer.valueOf(i4), eVar.b) : Integer.valueOf(i4), eVar);
                }
                return new m1.a(i0Var);
            case 9:
                m10.f fVar = (m10.f) obj;
                u uVar2 = (u) fVar;
                j10.e eVarY0 = uVar2.Y0();
                if (eVarY0 == null) {
                    return xVar;
                }
                Collection<m10.i> collectionI = eVarY0.i();
                kotlin.jvm.internal.m.d(collectionI, "getConstructors(...)");
                ArrayList arrayList2 = new ArrayList();
                for (m10.i iVar3 : collectionI) {
                    d0 d0Var = o0.h0;
                    d30.o storageManager = fVar.F;
                    kotlin.jvm.internal.m.b(iVar3);
                    d0Var.getClass();
                    kotlin.jvm.internal.m.e(storageManager, "storageManager");
                    u0 u0VarD = uVar2.Y0() == null ? u0Var3 : u0.d(uVar2.Z0());
                    if (u0VarD == null || (iVarE = iVar3.e(u0VarD)) == null) {
                        uVar = uVar2;
                        u0Var2 = u0Var3;
                        r6 = u0Var3;
                    } else {
                        k10.h annotations = iVar3.getAnnotations();
                        m10.i iVar4 = iVar3;
                        int kind = iVar4.getKind();
                        g4.c.r(kind, "getKind(...)");
                        j10.n0 n0VarO = fVar.o();
                        kotlin.jvm.internal.m.d(n0VarO, "getSource(...)");
                        ?? o0Var = new o0(storageManager, fVar, iVarE, null, annotations, kind, n0VarO);
                        List listO = iVar4.O();
                        if (listO == null) {
                            ?? r25 = u0Var3;
                            t.y0(28);
                            throw r25;
                        }
                        u0 u0Var4 = u0VarD;
                        ArrayList arrayListC1 = t.c1(o0Var, listO, u0Var4, false, false, null);
                        if (arrayListC1 == null) {
                            uVar = uVar2;
                            u0Var2 = u0Var3;
                            r6 = u0Var3;
                        } else {
                            e30.a0 a0VarH = e30.c.H(e30.c.m(iVarE.H.y0()), uVar2.n());
                            m10.u uVar3 = iVar4.K;
                            k10.f fVar2 = k10.g.a;
                            ?? K = uVar3 != null ? q20.k.k(o0Var, u0Var4.g(uVar3.getType(), a1.C), fVar2) : u0Var3;
                            j10.e eVarY1 = uVar2.Y0();
                            if (eVarY1 != null) {
                                List listB0 = iVar4.b0();
                                kotlin.jvm.internal.m.d(listB0, "getContextReceiverParameters(...)");
                                ArrayList arrayList3 = new ArrayList(h00.r.q0(listB0, 10));
                                int i5 = i2;
                                u0 u0Var5 = u0Var3;
                                for (Object obj3 : listB0) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        ?? r26 = u0Var5;
                                        va.a.k0();
                                        throw r26;
                                    }
                                    m10.u uVar4 = (m10.u) obj3;
                                    u0 u0Var6 = u0Var5;
                                    w wVarG = u0Var4.g(uVar4.getType(), a1.C);
                                    y20.d dVarY0 = uVar4.Y0();
                                    kotlin.jvm.internal.m.c(dVarY0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                    u uVar5 = uVar2;
                                    y20.a aVar2 = new y20.a(eVarY1, wVarG, ((y20.a) dVarY0).W0());
                                    r30.j jVar3 = n20.f.a;
                                    arrayList3.add(new m10.u(eVarY1, aVar2, fVar2, n20.e.e(n20.f.b + '_' + i5)));
                                    uVar2 = uVar5;
                                    i5 = i6;
                                    u0Var5 = u0Var6;
                                }
                                list = arrayList3;
                                u0Var = u0Var5;
                            } else {
                                list = xVar;
                                u0Var = u0Var3;
                            }
                            uVar = uVar2;
                            u0Var2 = u0Var;
                            o0Var.d1(K, null, list, fVar.p(), arrayListC1, a0VarH, j10.y.B, fVar.G);
                            r6 = o0Var;
                        }
                    }
                    if (r6 != 0) {
                        arrayList2.add(r6);
                    }
                    uVar2 = uVar;
                    u0Var3 = u0Var2;
                    i2 = 0;
                }
                return arrayList2;
            case 10:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                a20.a aVar3 = (a20.a) obj;
                sb.append(((n20.e) aVar3.B).b());
                return kh.n.A(sb.toString(), ((m10.h) aVar3.C).getUpperBounds());
            case 11:
                m10.p pVar = (m10.p) obj;
                HashSet hashSet = new HashSet();
                for (n20.e eVar2 : (Set) pVar.e.I.invoke()) {
                    r10.c cVar = r10.c.F;
                    hashSet.addAll(pVar.d(eVar2, cVar));
                    hashSet.addAll(pVar.e(eVar2, cVar));
                }
                return hashSet;
            case 12:
                return (List) ((q0) obj).M.getValue();
            case 13:
                return x5.i(a0.a, mw.a.class, w50.c.M((QuranifyFirebaseMessagingService) obj), (b60.a) null, (a60.a) null);
            case 14:
                p20.l lVar2 = ((p20.h) obj).a;
                p20.l lVar3 = new p20.l();
                Field[] declaredFields = p20.l.class.getDeclaredFields();
                kotlin.jvm.internal.m.d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj4 = field.get(lVar2);
                        p20.k kVar = obj4 instanceof p20.k ? (p20.k) obj4 : null;
                        if (kVar != null) {
                            String name = field.getName();
                            kotlin.jvm.internal.m.d(name, "getName(...)");
                            r30.r.x0(name, "is", false);
                            a10.d dVarB = a0.a.b(p20.l.class);
                            field.getName();
                            String name2 = field.getName();
                            kotlin.jvm.internal.m.d(name2, "getName(...)");
                            if (name2.length() > 0) {
                                Character.toUpperCase(name2.charAt(0));
                                kotlin.jvm.internal.m.d(name2.substring(1), "substring(...)");
                            }
                            Object obj5 = kotlin.jvm.internal.c.NO_RECEIVER;
                            ((kotlin.jvm.internal.d) dVarB).v();
                            field.set(lVar3, new p20.k(kVar.a, lVar3));
                        }
                    }
                }
                p20.h hVar = p20.h.c;
                lVar3.g(j0.q0(lVar3.k(), va.a.S(new n20.c[]{g10.o.p, g10.o.q})));
                lVar3.a = true;
                return new p20.h(lVar3);
            case 15:
                p1 p1Var = po.m.a;
                return Long.valueOf(((g1) obj).h());
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return x5.i(a0.a, ns.c.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 17:
                w wVarB = ((p0) obj).b();
                kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                return wVarB;
            case 18:
                return x5.i(a0.a, nw.b.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 19:
                return x5.i(a0.a, ky.a.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 20:
                x10.t tVar = (x10.t) obj;
                i00.b bVarS = va.a.s();
                bVarS.add(tVar.a.A);
                z zVar = tVar.b;
                if (zVar != null) {
                    bVarS.add("under-migration:".concat(zVar.A));
                }
                for (Map.Entry entry : tVar.c.entrySet()) {
                    bVarS.add("@" + entry.getKey() + ':' + ((z) entry.getValue()).A);
                }
                return (String[]) va.a.k(bVarS).toArray(new String[0]);
            case 21:
                x20.h hVar2 = (x20.h) obj;
                List listH = hVar2.h();
                ArrayList arrayList4 = new ArrayList(3);
                m10.b bVar = hVar2.b;
                Collection collectionL = bVar.f().l();
                kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
                ArrayList arrayList5 = new ArrayList();
                Iterator it = collectionL.iterator();
                while (it.hasNext()) {
                    v.u0(k00.f.C(((w) it.next()).N(), null, 3), arrayList5);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : arrayList5) {
                    if (obj6 instanceof j10.c) {
                        arrayList6.add(obj6);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : arrayList6) {
                    n20.e name3 = ((j10.c) obj7).getName();
                    Object arrayList7 = linkedHashMap.get(name3);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap.put(name3, arrayList7);
                    }
                    ((List) arrayList7).add(obj7);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    kotlin.jvm.internal.m.d(key, "component1(...)");
                    n20.e eVar3 = (n20.e) key;
                    List list2 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj8 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((j10.c) obj8) instanceof j10.u);
                        Object arrayList8 = linkedHashMap2.get(boolValueOf);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList8);
                        }
                        ((List) arrayList8).add(obj8);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list3 = (List) entry3.getValue();
                        q20.j jVar4 = q20.j.c;
                        if (zBooleanValue) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj9 : listH) {
                                if (kotlin.jvm.internal.m.a(((m10.m) ((j10.u) obj9)).getName(), eVar3)) {
                                    arrayList9.add(obj9);
                                }
                            }
                            collection = arrayList9;
                        } else {
                            collection = xVar;
                        }
                        jVar4.h(eVar3, list3, collection, bVar, new x20.g(arrayList4, hVar2));
                    }
                }
                return h00.q.Y0(n30.l.d(arrayList4), listH);
            case 22:
                s0 s0VarF = ((u0) obj).f();
                s0VarF.getClass();
                return new u0(s0VarF);
            case 23:
                x20.s sVar = (x20.s) obj;
                return sVar.i(k00.f.C(sVar.b, null, 3));
            case 24:
                return x5.i(a0.a, xo.a.class, w50.c.M((AppleAuthRedirectActivity) obj), (b60.a) null, (a60.a) null);
            case 25:
                Object obj10 = y10.e.a;
                e20.a aVar4 = ((y10.i) obj).d;
                p10.t tVar2 = aVar4 instanceof p10.t ? (p10.t) aVar4 : null;
                if (tVar2 == null || (mVar = (k10.m) y10.e.b.get(n20.e.e(tVar2.b.name()).b())) == null) {
                    iVar = null;
                } else {
                    n20.c topLevelFqName = g10.o.v;
                    kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
                    iVar = new s20.i(new n20.b(topLevelFqName.b(), topLevelFqName.a.g()), n20.e.e(mVar.name()));
                }
                Map mapQ = iVar != null ? h00.d0.Q(new g00.k(y10.c.c, iVar)) : null;
                return mapQ == null ? yVar : mapQ;
            case 26:
                e20.a aVar5 = ((y10.j) obj).d;
                if (aVar5 instanceof p10.h) {
                    Object obj11 = y10.e.a;
                    bVarA = y10.e.a(((p10.h) aVar5).a());
                } else if (aVar5 instanceof p10.t) {
                    Object obj12 = y10.e.a;
                    bVarA = y10.e.a(va.a.R(aVar5));
                } else {
                    bVarA = null;
                }
                Map mapQ2 = bVarA != null ? h00.d0.Q(new g00.k(y10.c.b, bVarA)) : null;
                return mapQ2 == null ? yVar : mapQ2;
            case 27:
                return x5.i(a0.a, bp.b.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            default:
                return x5.i(a0.a, c0.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
        }
    }
}
