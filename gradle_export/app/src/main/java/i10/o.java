package i10;

import a10.w;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import e30.s0;
import e30.u0;
import h00.x;
import h00.z;
import j10.u;
import j10.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.s;
import m10.a0;
import m10.l0;
import m10.r0;
import m10.t;

public final class o implements l10.b, l10.d {
    public static final w[] h;
    public final a0 a;
    public final d30.i b;
    public final e30.a0 c;
    public final d30.i d;
    public final d30.e e;
    public final d30.i f;
    public final d30.e g;

    static {
        s sVar = new s(o.class, AuthAnalyticsSource.SETTINGS, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        b0 b0Var = kotlin.jvm.internal.a0.a;
        h = new w[]{b0Var.h(sVar), a1.b.h(o.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, b0Var), a1.b.h(o.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, b0Var)};
    }

    public o(a0 a0Var, d30.l lVar, eo.p pVar) {
        this.a = a0Var;
        this.b = new d30.i(lVar, pVar);
        m10.k kVar = new m10.k(new m(a0Var, new n20.c("java.io"), 0), n20.e.e("Serializable"), y.E, j10.f.B, va.a.R(new e30.y(lVar, new k(this, 1))), lVar);
        kVar.e0(x20.m.b, z.A, null);
        this.c = kVar.n();
        this.d = new d30.i(lVar, new a20.a(this, lVar, 22));
        this.e = new d30.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new d30.f(), 0);
        this.f = new d30.i(lVar, new k(this, 0));
        this.g = lVar.b(new a20.d(this, 18));
    }

    @Override
    public final Collection a(j10.e eVar) {
        n20.d dVarH = u20.d.h(eVar);
        LinkedHashSet linkedHashSet = r.a;
        n20.d dVar = g10.o.g;
        boolean zEquals = dVarH.equals(dVar);
        boolean zIsAssignableFrom = false;
        e30.a0 a0Var = this.c;
        if (!zEquals) {
            HashMap map = g10.o.g0;
            if (map.get(dVarH) == null) {
                if (dVarH.equals(dVar) || map.get(dVarH) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = d.a;
                    n20.b bVarG = d.g(dVarH);
                    if (bVarG != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarG.a().a.a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? va.a.R(a0Var) : x.A;
            }
        }
        return va.a.S(new e30.w[]{(e30.a0) ze.d.A(this.d, h[1]), a0Var});
    }

    @Override
    public final Collection b(j10.e eVar) {
        j10.e eVarC;
        if (eVar.getKind() == j10.f.A) {
            g().getClass();
            b20.i iVarF = f(eVar);
            if (iVarF != null && (eVarC = e.c(u20.d.g(iVarF), b.f)) != null) {
                u0 u0Var = new u0(a.a.s(eVarC, iVarF));
                List list = (List) iVarF.Q.q.invoke();
                ArrayList<m10.i> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    m10.i iVar = (m10.i) next;
                    m10.i iVar2 = iVar;
                    if (iVar2.getVisibility().a.b) {
                        Collection collectionI = eVarC.i();
                        kotlin.jvm.internal.m.d(collectionI, "getConstructors(...)");
                        Collection collection = collectionI;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    m10.i iVar3 = (m10.i) it2.next();
                                    kotlin.jvm.internal.m.b(iVar3);
                                    if (q20.j.j(iVar3, iVar.e(u0Var)) == 1) {
                                    }
                                }
                            }
                        }
                        if (iVar2.O().size() == 1) {
                            List listO = iVar2.O();
                            kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                            j10.h hVarG = ((r0) h00.q.d1(listO)).getType().m0().g();
                            if (kotlin.jvm.internal.m.a(hVarG != null ? u20.d.h(hVarG) : null, u20.d.h(eVar))) {
                            }
                        }
                        if (!g10.i.D(iVar) && !r.f.contains(bi.b.Q(iVarF, c7.i.u(iVar, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
                for (m10.i iVar4 : arrayList) {
                    m10.i iVar5 = iVar4;
                    iVar5.getClass();
                    m10.s sVarE1 = iVar5.e1(u0.b);
                    sVarE1.B = eVar;
                    sVarE1.c(eVar.n());
                    sVarE1.O = true;
                    s0 s0VarF = u0Var.f();
                    if (s0VarF == null) {
                        m10.s.b(37);
                        throw null;
                    }
                    sVarE1.A = s0VarF;
                    if (!r.g.contains(bi.b.Q(iVarF, c7.i.u(iVar4, 3)))) {
                        sVarE1.p((k10.h) ze.d.A(this.f, h[2]));
                    }
                    t tVarB1 = sVarE1.X.b1(sVarE1);
                    kotlin.jvm.internal.m.c(tVarB1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((m10.i) tVarB1);
                }
                return arrayList2;
            }
        }
        return x.A;
    }

    @Override
    public final boolean c(j10.e classDescriptor, c30.t tVar) {
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        b20.i iVarF = f(classDescriptor);
        if (iVarF == null || !tVar.getAnnotations().d(l10.e.a)) {
            return true;
        }
        g().getClass();
        String strU = c7.i.u(tVar, 3);
        b20.n nVarE0 = iVarF.e0();
        n20.e name = tVar.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        Collection collectionD = nVarE0.d(name, r10.c.A);
        if ((collectionD instanceof Collection) && collectionD.isEmpty()) {
            return false;
        }
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(c7.i.u((l0) it.next(), 3), strU)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Collection d(j10.e classDescriptor) {
        Set setB;
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        g().getClass();
        b20.i iVarF = f(classDescriptor);
        if (iVarF == null || (setB = iVarF.e0().b()) == null) {
            setB = z.A;
        }
        return setB;
    }

    @Override
    public final Collection e(n20.e name, j10.e classDescriptor) {
        Set setG0;
        Object obj;
        l0 l0Var;
        j10.k kVarL;
        boolean zBooleanValue;
        boolean z;
        l0 l0Var2;
        k10.h hVar;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        boolean zEquals = name.equals(a.e);
        w[] wVarArr = h;
        List<l0> list = x.A;
        if (zEquals && (classDescriptor instanceof c30.i) && (g10.i.b(classDescriptor, g10.o.g) || g10.i.s(classDescriptor) != null)) {
            c30.i iVar = (c30.i) classDescriptor;
            List list2 = iVar.E.Q;
            kotlin.jvm.internal.m.d(list2, "getFunctionList(...)");
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (z3.A((k20.g) iVar.L.b, ((i20.b0) it.next()).F).equals(a.e)) {
                        return list;
                    }
                }
            }
            j10.t tVarN0 = ((l0) h00.q.c1(((e30.a0) ze.d.A(this.d, wVarArr[1])).N().d(name, r10.c.A))).n0();
            tVarN0.o(iVar);
            tVarN0.a(j10.p.e);
            tVarN0.c(iVar.n());
            tVarN0.f(iVar.x0());
            u uVarBuild = tVarN0.build();
            kotlin.jvm.internal.m.b(uVarBuild);
            return va.a.R((l0) uVarBuild);
        }
        g().getClass();
        b20.i iVarF = f(classDescriptor);
        if (iVarF == null) {
            l0Var = null;
        } else {
            n20.c cVarG = u20.d.g(iVarF);
            b builtIns = b.f;
            kotlin.jvm.internal.m.e(builtIns, "builtIns");
            j10.e eVarC = e.c(cVarG, builtIns);
            if (eVarC == null) {
                setG0 = z.A;
            } else {
                String str = d.a;
                n20.c cVarH = d.h(u20.d.h(eVarC));
                setG0 = cVarH == null ? w50.c.g0(eVarC) : va.a.S(new j10.e[]{eVarC, builtIns.j(cVarH)});
            }
            Iterable iterable = setG0;
            if (iterable instanceof List) {
                List list3 = (List) iterable;
                if (list3.isEmpty()) {
                    obj = null;
                } else {
                    obj = list3.get(list3.size() - 1);
                }
            } else {
                Iterator it2 = iterable.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                } else {
                    obj = null;
                }
            }
            j10.e eVar = (j10.e) obj;
            if (eVar == null) {
                l0Var = null;
            } else {
                int i = n30.i.C;
                ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(u20.d.g((j10.e) it3.next()));
                }
                n30.i iVar2 = new n30.i(0);
                iVar2.addAll(arrayList);
                String str2 = d.a;
                boolean zContainsKey = d.j.containsKey(q20.d.f(classDescriptor));
                n20.c cVarG2 = u20.d.g(iVarF);
                l0Var = null;
                a20.a aVar = new a20.a(iVarF, eVar, 23);
                d30.e eVar2 = this.e;
                eVar2.getClass();
                Object objInvoke = eVar2.invoke(new d30.g(cVarG2, aVar));
                if (objInvoke == null) {
                    d30.e.a(3);
                    throw null;
                }
                x20.n nVarO0 = ((j10.e) objInvoke).o0();
                kotlin.jvm.internal.m.d(nVarO0, "getUnsubstitutedMemberScope(...)");
                Collection collectionD = nVarO0.d(name, r10.c.A);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionD) {
                    l0 l0Var3 = (l0) obj2;
                    if (l0Var3.getKind() == 1 && l0Var3.getVisibility().a.b && !g10.i.D(l0Var3)) {
                        Collection collectionM = l0Var3.m();
                        if ((collectionM instanceof Collection) && collectionM.isEmpty()) {
                            kVarL = l0Var3.l();
                            kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (r.e.contains(bi.b.Q((j10.e) kVarL, c7.i.u(l0Var3, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolH = n30.l.h(va.a.R(l0Var3), e.A, new f(this));
                                kotlin.jvm.internal.m.d(boolH, "ifAny(...)");
                                zBooleanValue = boolH.booleanValue();
                            }
                            if (zBooleanValue) {
                            }
                        } else {
                            Iterator it4 = collectionM.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    j10.k kVarL2 = ((u) it4.next()).l();
                                    kotlin.jvm.internal.m.d(kVarL2, "getContainingDeclaration(...)");
                                    if (iVar2.contains(u20.d.g(kVarL2))) {
                                    }
                                } else {
                                    kVarL = l0Var3.l();
                                    kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (r.e.contains(bi.b.Q((j10.e) kVarL, c7.i.u(l0Var3, 3))) ^ zContainsKey) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolH2 = n30.l.h(va.a.R(l0Var3), e.A, new f(this));
                                        kotlin.jvm.internal.m.d(boolH2, "ifAny(...)");
                                        zBooleanValue = boolH2.booleanValue();
                                    }
                                    z = zBooleanValue;
                                }
                            }
                        }
                    }
                    if (z) {
                        arrayList2.add(obj2);
                    }
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (l0 l0Var4 : list) {
            j10.k kVarL3 = l0Var4.l();
            kotlin.jvm.internal.m.c(kVarL3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            u uVarE = l0Var4.e(new u0(a.a.s((j10.e) kVarL3, classDescriptor)));
            kotlin.jvm.internal.m.c(uVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            j10.t tVarN1 = ((l0) uVarE).n0();
            tVarN1.o(classDescriptor);
            tVarN1.f(classDescriptor.x0());
            tVarN1.i();
            j10.k kVarL4 = l0Var4.l();
            kotlin.jvm.internal.m.c(kVarL4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objF = n30.l.f(va.a.R((j10.e) kVarL4), new gi.c(this, 4), new n(0, new kotlin.jvm.internal.z(), c7.i.u(l0Var4, 3)));
            kotlin.jvm.internal.m.d(objF, "dfs(...)");
            int iOrdinal = ((l) objF).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        n20.e name2 = l0Var4.getName();
                        boolean zA = kotlin.jvm.internal.m.a(name2, p.a);
                        d30.e eVar3 = this.g;
                        if (zA) {
                            hVar = (k10.h) eVar3.invoke(new g00.k(l0Var4.getName().b(), "first"));
                        } else {
                            if (!kotlin.jvm.internal.m.a(name2, p.b)) {
                                throw new IllegalStateException(("Unexpected name: " + l0Var4.getName()).toString());
                            }
                            hVar = (k10.h) eVar3.invoke(new g00.k(l0Var4.getName().b(), "last"));
                        }
                        tVarN1.p(hVar);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l0Var2 = l0Var;
                    } else {
                        tVarN1.p((k10.h) ze.d.A(this.f, wVarArr[2]));
                    }
                }
                u uVarBuild2 = tVarN1.build();
                kotlin.jvm.internal.m.b(uVarBuild2);
                l0Var2 = (l0) uVarBuild2;
            } else if (classDescriptor.g() == y.B && classDescriptor.getKind() != j10.f.C) {
                l0Var2 = l0Var;
            } else {
                tVarN1.n();
                u uVarBuild3 = tVarN1.build();
                kotlin.jvm.internal.m.b(uVarBuild3);
                l0Var2 = (l0) uVarBuild3;
            }
            if (l0Var2 != null) {
                arrayList3.add(l0Var2);
            }
        }
        return arrayList3;
    }

    public final b20.i f(j10.e eVar) {
        n20.c cVarA;
        if (eVar == null) {
            g10.i.a(108);
            throw null;
        }
        if (!g10.i.b(eVar, g10.o.a) && g10.i.J(eVar)) {
            n20.d dVarH = u20.d.h(eVar);
            if (dVarH.d()) {
                String str = d.a;
                n20.b bVarG = d.g(dVarH);
                if (bVarG != null && (cVarA = bVarG.a()) != null) {
                    a0 a0Var = g().a;
                    r10.c cVar = r10.c.A;
                    j10.e eVarJ = j10.w.j(a0Var, cVarA);
                    if (eVarJ instanceof b20.i) {
                        return (b20.i) eVarJ;
                    }
                }
            }
        }
        return null;
    }

    public final i g() {
        return (i) ze.d.A(this.b, h[0]);
    }
}
