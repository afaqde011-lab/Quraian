package b20;

import a1.v2;
import a40.g1;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import e30.p0;
import e30.v0;
import e30.x0;
import e30.z0;
import j10.o0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m10.j0;
import m10.k0;
import m10.l0;
import m10.r0;

public final class n extends a0 {
    public static final int v = 0;
    public final j10.e n;
    public final p10.o o;
    public final boolean p;
    public final d30.i q;
    public final d30.i r;
    public final d30.i s;
    public final d30.i t;
    public final d30.j u;

    public n(oj.q c, j10.e eVar, p10.o jClass, boolean z, n nVar) {
        super(c, nVar);
        kotlin.jvm.internal.m.e(c, "c");
        kotlin.jvm.internal.m.e(jClass, "jClass");
        this.n = eVar;
        this.o = jClass;
        this.p = z;
        d30.o oVar = ((a20.b) c.B).a;
        j jVar = new j(this, c);
        d30.l lVar = (d30.l) oVar;
        lVar.getClass();
        this.q = new d30.i(lVar, jVar);
        k kVar = new k(this, 0);
        d30.l lVar2 = (d30.l) oVar;
        lVar2.getClass();
        this.r = new d30.i(lVar2, kVar);
        j jVar2 = new j(c, this);
        d30.l lVar3 = (d30.l) oVar;
        lVar3.getClass();
        this.s = new d30.i(lVar3, jVar2);
        k kVar2 = new k(this, 1);
        d30.l lVar4 = (d30.l) oVar;
        lVar4.getClass();
        this.t = new d30.i(lVar4, kVar2);
        this.u = ((d30.l) oVar).c(new v2(this, c, 4));
    }

    public static l0 A(l0 l0Var, j10.u uVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return l0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            l0 l0Var2 = (l0) it.next();
            if (!l0Var.equals(l0Var2) && l0Var2.c0 == null && D(l0Var2, uVar)) {
                j10.u uVarBuild = l0Var.n0().t().build();
                kotlin.jvm.internal.m.b(uVarBuild);
                return (l0) uVarBuild;
            }
        }
        return l0Var;
    }

    public static l0 B(l0 l0Var) {
        n20.c cVarI;
        List listO = l0Var.O();
        kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
        r0 r0Var = (r0) h00.q.U0(listO);
        if (r0Var != null) {
            j10.h hVarG = r0Var.getType().m0().g();
            if (hVarG != null) {
                n20.d dVarH = u20.d.h(hVarG);
                if (!dVarH.d()) {
                    dVarH = null;
                }
                if (dVarH != null) {
                    cVarI = dVarH.i();
                } else {
                    cVarI = null;
                }
            } else {
                cVarI = null;
            }
            if (!kotlin.jvm.internal.m.a(cVarI, g10.p.g)) {
                r0Var = null;
            }
            if (r0Var != null) {
                j10.t tVarN0 = l0Var.n0();
                List listO2 = l0Var.O();
                kotlin.jvm.internal.m.d(listO2, "getValueParameters(...)");
                l0 l0Var2 = (l0) tVarN0.d(h00.q.I0(listO2)).c(((p0) r0Var.getType().e0().get(0)).b()).build();
                if (l0Var2 != null) {
                    l0Var2.V = true;
                }
                return l0Var2;
            }
        }
        return null;
    }

    public static boolean D(j10.u uVar, j10.u uVar2) {
        int iB = q20.j.c.n(uVar2, uVar, true).b();
        g4.c.r(iB, "getResult(...)");
        return iB == 1 && !y3.B(uVar2, uVar);
    }

    public static boolean E(l0 l0Var, l0 l0Var2) {
        int i = x10.c.l;
        kotlin.jvm.internal.m.e(l0Var, "<this>");
        if (kotlin.jvm.internal.m.a(l0Var.getName().b(), "removeAt") && kotlin.jvm.internal.m.a(c7.i.v(l0Var), x10.e0.g.e)) {
            l0Var2 = l0Var2.a();
        }
        kotlin.jvm.internal.m.b(l0Var2);
        return D(l0Var2, l0Var);
    }

    public static l0 F(j10.l0 l0Var, String str, u00.k kVar) {
        l0 l0Var2;
        Iterator it = ((Iterable) kVar.invoke(n20.e.e(str))).iterator();
        do {
            l0Var2 = null;
            if (!it.hasNext()) {
                break;
            }
            l0 l0Var3 = (l0) it.next();
            if (l0Var3.O().size() == 0) {
                f30.l lVar = f30.d.a;
                e30.w wVar = l0Var3.H;
                if (wVar == null ? false : lVar.b(wVar, l0Var.getType())) {
                    l0Var2 = l0Var3;
                }
            }
        } while (l0Var2 == null);
        return l0Var2;
    }

    public static l0 H(j10.l0 l0Var, u00.k kVar) {
        l0 l0Var2;
        e30.w wVar;
        String strB = l0Var.getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        Iterator it = ((Iterable) kVar.invoke(n20.e.e(x10.u.b(strB)))).iterator();
        do {
            l0Var2 = null;
            if (!it.hasNext()) {
                break;
            }
            l0 l0Var3 = (l0) it.next();
            if (l0Var3.O().size() == 1 && (wVar = l0Var3.H) != null) {
                n20.e eVar = g10.i.e;
                if (g10.i.E(wVar, g10.o.d)) {
                    f30.l lVar = f30.d.a;
                    List listO = l0Var3.O();
                    kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                    if (lVar.a(((r0) h00.q.d1(listO)).getType(), l0Var.getType())) {
                        l0Var2 = l0Var3;
                    }
                }
            }
        } while (l0Var2 == null);
        return l0Var2;
    }

    public static boolean K(l0 l0Var, j10.u uVar) {
        String strU = c7.i.u(l0Var, 2);
        j10.u uVarA = uVar.a();
        kotlin.jvm.internal.m.d(uVarA, "getOriginal(...)");
        return kotlin.jvm.internal.m.a(strU, c7.i.u(uVarA, 2)) && !D(l0Var, uVar);
    }

    public final boolean C(j10.l0 l0Var, u00.k kVar) {
        if (rd.a.H(l0Var)) {
            return false;
        }
        l0 l0VarG = G(l0Var, kVar);
        l0 l0VarH = H(l0Var, kVar);
        if (l0VarG == null) {
            return false;
        }
        if (l0Var.W()) {
            return l0VarH != null && l0VarH.g() == l0VarG.g();
        }
        return true;
    }

    public final l0 G(j10.l0 l0Var, u00.k kVar) {
        n20.e eVar;
        j0 j0VarB = l0Var.b();
        String strB = null;
        j0 j0Var = j0VarB != null ? (j0) g4.N(j0VarB) : null;
        if (j0Var != null) {
            g10.i.A(j0Var);
            j10.c cVarB = u20.d.b(u20.d.k(j0Var), x10.d.D);
            if (cVarB != null && (eVar = (n20.e) x10.f.a.get(u20.d.g(cVarB))) != null) {
                strB = eVar.b();
            }
        }
        if (strB != null && !g4.P(this.n, j0Var)) {
            return F(l0Var, strB, kVar);
        }
        String strB2 = l0Var.getName().b();
        kotlin.jvm.internal.m.d(strB2, "asString(...)");
        return F(l0Var, x10.u.a(strB2), kVar);
    }

    public final LinkedHashSet I(n20.e eVar) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            h00.v.u0(((e30.w) it.next()).N().d(eVar, r10.c.E), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set J(n20.e eVar) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionE = ((e30.w) it.next()).N().e(eVar, r10.c.E);
            ArrayList arrayList2 = new ArrayList(h00.r.q0(collectionE, 10));
            Iterator it2 = collectionE.iterator();
            while (it2.hasNext()) {
                arrayList2.add((j10.l0) it2.next());
            }
            h00.v.u0(arrayList2, arrayList);
        }
        return h00.q.r1(arrayList);
    }

    public final boolean L(l0 l0Var) {
        Collection collectionT;
        n20.e eVar;
        n20.e name;
        l0 l0VarB;
        LinkedHashSet<l0> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        j10.u uVarA;
        ArrayList arrayList2;
        l0 l0Var2;
        Iterator it3;
        l0 l0Var3;
        n20.e name2 = l0Var.getName();
        kotlin.jvm.internal.m.d(name2, "getName(...)");
        String strB = name2.b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        n20.c cVar = x10.u.a;
        if (r30.r.x0(strB, "get", false) || r30.r.x0(strB, "is", false)) {
            n20.e eVarM = z3.M(name2, "get", (String) null, 12);
            if (eVarM == null) {
                eVarM = z3.M(name2, "is", (String) null, 8);
            }
            collectionT = va.a.T(eVarM);
        } else if (r30.r.x0(strB, "set", false)) {
            collectionT = h00.n.C0(new n20.e[]{z3.M(name2, "set", (String) null, 4), z3.M(name2, "set", "is", 4)});
        } else {
            collectionT = (List) x10.f.b.get(name2);
            if (collectionT == null) {
                collectionT = h00.x.A;
            }
        }
        if (collectionT.isEmpty()) {
            ArrayList arrayList3 = x10.e0.a;
            n20.e name3 = l0Var.getName();
            kotlin.jvm.internal.m.d(name3, "getName(...)");
            eVar = (n20.e) x10.e0.k.get(name3);
            if (eVar == null) {
                int i = x10.e.l;
                name = l0Var.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                if (!x10.e.b(name)) {
                    l0VarB = B(l0Var);
                    if (l0VarB == null) {
                        return true;
                    }
                    n20.e name4 = l0Var.getName();
                    kotlin.jvm.internal.m.d(name4, "getName(...)");
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (l0 l0Var4 : linkedHashSetI) {
                        if (l0Var4.isSuspend() || !D(l0VarB, l0Var4)) {
                        }
                    }
                    return true;
                }
                n20.e name5 = l0Var.getName();
                kotlin.jvm.internal.m.d(name5, "getName(...)");
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    uVarA = x10.e.a((l0) it.next());
                    if (uVarA != null) {
                        arrayList.add(uVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    l0VarB = B(l0Var);
                    if (l0VarB == null) {
                        return true;
                    }
                    n20.e name6 = l0Var.getName();
                    kotlin.jvm.internal.m.d(name6, "getName(...)");
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r10.hasNext()) {
                        if (l0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(l0Var, (j10.u) it2.next())) {
                    }
                }
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name7 = l0Var.getName();
                kotlin.jvm.internal.m.d(name7, "getName(...)");
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(eVar);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI3) {
                l0Var3 = (l0) obj;
                kotlin.jvm.internal.m.e(l0Var3, "<this>");
                if (g4.N(l0Var3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = x10.e.l;
                name = l0Var.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                if (!x10.e.b(name)) {
                    l0VarB = B(l0Var);
                    if (l0VarB == null) {
                        return true;
                    }
                    n20.e name8 = l0Var.getName();
                    kotlin.jvm.internal.m.d(name8, "getName(...)");
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r10.hasNext()) {
                        if (l0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                n20.e name9 = l0Var.getName();
                kotlin.jvm.internal.m.d(name9, "getName(...)");
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    uVarA = x10.e.a((l0) it.next());
                    if (uVarA != null) {
                        arrayList.add(uVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    l0VarB = B(l0Var);
                    if (l0VarB == null) {
                        return true;
                    }
                    n20.e name10 = l0Var.getName();
                    kotlin.jvm.internal.m.d(name10, "getName(...)");
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r10.hasNext()) {
                        if (l0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(l0Var, (j10.u) it2.next())) {
                    }
                }
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name11 = l0Var.getName();
                kotlin.jvm.internal.m.d(name11, "getName(...)");
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            j10.t tVarN0 = l0Var.n0();
            tVarN0.e(eVar);
            tVarN0.v();
            tVarN0.i();
            j10.u uVarBuild = tVarN0.build();
            kotlin.jvm.internal.m.b(uVarBuild);
            l0Var2 = (l0) uVarBuild;
            if (arrayList2.isEmpty()) {
                int i3 = x10.e.l;
                name = l0Var.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                if (!x10.e.b(name)) {
                    l0VarB = B(l0Var);
                    if (l0VarB == null) {
                        return true;
                    }
                    n20.e name12 = l0Var.getName();
                    kotlin.jvm.internal.m.d(name12, "getName(...)");
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r10.hasNext()) {
                        if (l0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                n20.e name13 = l0Var.getName();
                kotlin.jvm.internal.m.d(name13, "getName(...)");
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    uVarA = x10.e.a((l0) it.next());
                    if (uVarA != null) {
                        arrayList.add(uVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    l0VarB = B(l0Var);
                    if (l0VarB == null) {
                        return true;
                    }
                    n20.e name14 = l0Var.getName();
                    kotlin.jvm.internal.m.d(name14, "getName(...)");
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r10.hasNext()) {
                        if (l0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(l0Var, (j10.u) it2.next())) {
                    }
                }
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name15 = l0Var.getName();
                kotlin.jvm.internal.m.d(name15, "getName(...)");
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((l0) it3.next(), l0Var2)) {
                }
            }
            int i4 = x10.e.l;
            name = l0Var.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            if (!x10.e.b(name)) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name16 = l0Var.getName();
                kotlin.jvm.internal.m.d(name16, "getName(...)");
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            n20.e name17 = l0Var.getName();
            kotlin.jvm.internal.m.d(name17, "getName(...)");
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                uVarA = x10.e.a((l0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name18 = l0Var.getName();
                kotlin.jvm.internal.m.d(name18, "getName(...)");
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(l0Var, (j10.u) it2.next())) {
                }
            }
            l0VarB = B(l0Var);
            if (l0VarB == null) {
                return true;
            }
            n20.e name19 = l0Var.getName();
            kotlin.jvm.internal.m.d(name19, "getName(...)");
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r10.hasNext()) {
                if (l0Var4.isSuspend()) {
                }
            }
            return true;
        }
        Iterator it4 = collectionT.iterator();
        while (it4.hasNext()) {
            Set<j10.l0> setJ = J((n20.e) it4.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (j10.l0 l0Var5 : setJ) {
                    if (C(l0Var5, new v2(l0Var, this, 5))) {
                        if (!l0Var5.W()) {
                            String strB2 = l0Var.getName().b();
                            kotlin.jvm.internal.m.d(strB2, "asString(...)");
                            if (!r30.r.x0(strB2, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = x10.e0.a;
        n20.e name20 = l0Var.getName();
        kotlin.jvm.internal.m.d(name20, "getName(...)");
        eVar = (n20.e) x10.e0.k.get(name20);
        if (eVar == null) {
            int i5 = x10.e.l;
            name = l0Var.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            if (!x10.e.b(name)) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name110 = l0Var.getName();
                kotlin.jvm.internal.m.d(name110, "getName(...)");
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            n20.e name111 = l0Var.getName();
            kotlin.jvm.internal.m.d(name111, "getName(...)");
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                uVarA = x10.e.a((l0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name112 = l0Var.getName();
                kotlin.jvm.internal.m.d(name112, "getName(...)");
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(l0Var, (j10.u) it2.next())) {
                }
            }
            l0VarB = B(l0Var);
            if (l0VarB == null) {
                return true;
            }
            n20.e name113 = l0Var.getName();
            kotlin.jvm.internal.m.d(name113, "getName(...)");
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r10.hasNext()) {
                if (l0Var4.isSuspend()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(eVar);
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            l0Var3 = (l0) obj;
            kotlin.jvm.internal.m.e(l0Var3, "<this>");
            if (g4.N(l0Var3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = x10.e.l;
            name = l0Var.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            if (!x10.e.b(name)) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name114 = l0Var.getName();
                kotlin.jvm.internal.m.d(name114, "getName(...)");
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            n20.e name115 = l0Var.getName();
            kotlin.jvm.internal.m.d(name115, "getName(...)");
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                uVarA = x10.e.a((l0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name116 = l0Var.getName();
                kotlin.jvm.internal.m.d(name116, "getName(...)");
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(l0Var, (j10.u) it2.next())) {
                }
            }
            l0VarB = B(l0Var);
            if (l0VarB == null) {
                return true;
            }
            n20.e name117 = l0Var.getName();
            kotlin.jvm.internal.m.d(name117, "getName(...)");
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r10.hasNext()) {
                if (l0Var4.isSuspend()) {
                }
            }
            return true;
        }
        j10.t tVarN1 = l0Var.n0();
        tVarN1.e(eVar);
        tVarN1.v();
        tVarN1.i();
        j10.u uVarBuild2 = tVarN1.build();
        kotlin.jvm.internal.m.b(uVarBuild2);
        l0Var2 = (l0) uVarBuild2;
        if (arrayList2.isEmpty()) {
            int i7 = x10.e.l;
            name = l0Var.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            if (!x10.e.b(name)) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name118 = l0Var.getName();
                kotlin.jvm.internal.m.d(name118, "getName(...)");
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            n20.e name119 = l0Var.getName();
            kotlin.jvm.internal.m.d(name119, "getName(...)");
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                uVarA = x10.e.a((l0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                l0VarB = B(l0Var);
                if (l0VarB == null) {
                    return true;
                }
                n20.e name1110 = l0Var.getName();
                kotlin.jvm.internal.m.d(name1110, "getName(...)");
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r10.hasNext()) {
                    if (l0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(l0Var, (j10.u) it2.next())) {
                }
            }
            l0VarB = B(l0Var);
            if (l0VarB == null) {
                return true;
            }
            n20.e name1111 = l0Var.getName();
            kotlin.jvm.internal.m.d(name1111, "getName(...)");
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r10.hasNext()) {
                if (l0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((l0) it3.next(), l0Var2)) {
            }
        }
        int i8 = x10.e.l;
        name = l0Var.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        if (!x10.e.b(name)) {
            l0VarB = B(l0Var);
            if (l0VarB == null) {
                return true;
            }
            n20.e name1112 = l0Var.getName();
            kotlin.jvm.internal.m.d(name1112, "getName(...)");
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r10.hasNext()) {
                if (l0Var4.isSuspend()) {
                }
            }
            return true;
        }
        n20.e name1113 = l0Var.getName();
        kotlin.jvm.internal.m.d(name1113, "getName(...)");
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            uVarA = x10.e.a((l0) it.next());
            if (uVarA != null) {
                arrayList.add(uVarA);
            }
        }
        if (arrayList.isEmpty()) {
            l0VarB = B(l0Var);
            if (l0VarB == null) {
                return true;
            }
            n20.e name1114 = l0Var.getName();
            kotlin.jvm.internal.m.d(name1114, "getName(...)");
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r10.hasNext()) {
                if (l0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(l0Var, (j10.u) it2.next())) {
            }
        }
        l0VarB = B(l0Var);
        if (l0VarB == null) {
            return true;
        }
        n20.e name1115 = l0Var.getName();
        kotlin.jvm.internal.m.d(name1115, "getName(...)");
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r10.hasNext()) {
            if (l0Var4.isSuspend()) {
            }
        }
        return true;
        return false;
    }

    public final void M(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        kotlin.jvm.internal.m.e(((a20.b) this.b.B).n, "<this>");
        j10.e scopeOwner = this.n;
        kotlin.jvm.internal.m.e(scopeOwner, "scopeOwner");
    }

    public final ArrayList N(n20.e eVar) {
        Collection collectionE = ((c) this.e.invoke()).e(eVar);
        ArrayList arrayList = new ArrayList(h00.r.q0(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(t((p10.x) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(n20.e eVar) {
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            l0 l0Var = (l0) obj;
            kotlin.jvm.internal.m.e(l0Var, "<this>");
            if (g4.N(l0Var) == null && x10.e.a(l0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override
    public final Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        M(name, aVar);
        return super.d(name, aVar);
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        M(name, cVar);
        return super.e(name, cVar);
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        d30.j jVar;
        j10.e eVar;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        M(name, location);
        n nVar = (n) this.c;
        return (nVar == null || (jVar = nVar.u) == null || (eVar = (j10.e) jVar.invoke(name)) == null) ? (j10.h) this.u.invoke(name) : eVar;
    }

    @Override
    public final Set h(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return h00.j0.q0((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override
    public final Set i(x20.f kindFilter, x20.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        j10.e thisDescriptor = this.n;
        Collection collectionL = thisDescriptor.f().l();
        kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionL.iterator();
        while (it.hasNext()) {
            h00.v.u0(((e30.w) it.next()).N().b(), linkedHashSet);
        }
        d30.i iVar = this.e;
        linkedHashSet.addAll(((c) iVar.invoke()).a());
        linkedHashSet.addAll(((c) iVar.invoke()).c());
        linkedHashSet.addAll(h(kindFilter, kVar));
        oj.q c = this.b;
        ((v20.a) ((a20.b) c.B).x).getClass();
        kotlin.jvm.internal.m.e(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.m.e(c, "c");
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override
    public final void j(ArrayList arrayList, n20.e name) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.m.e(name, "name");
        boolean zG = this.o.g();
        j10.e thisDescriptor = this.n;
        oj.q c = this.b;
        if (zG) {
            d30.i iVar = this.e;
            if (((c) iVar.invoke()).b(name) != null) {
                if (arrayList.isEmpty()) {
                    p10.a0 a0VarB = ((c) iVar.invoke()).b(name);
                    kotlin.jvm.internal.m.b(a0VarB);
                    a20.e eVarF = ca.v.F(c, a0VarB);
                    a20.b bVar = (a20.b) c.B;
                    z10.e eVarN1 = z10.e.n1(thisDescriptor, eVarF, a0VarB.c(), bVar.j.b(a0VarB), true);
                    e30.w wVarG = ((a1.i) c.E).G(a0VarB.f(), p30.f.t0(v0.B, false, null, 6));
                    m10.u uVarP = p();
                    j10.y.A.getClass();
                    j10.y yVar = j10.y.D;
                    j10.o oVar = j10.p.e;
                    h00.x xVar = h00.x.A;
                    eVarN1.m1(null, uVarP, xVar, xVar, xVar, wVarG, yVar, oVar, null);
                    eVarN1.e0 = 1;
                    bVar.g.getClass();
                    arrayList.add(eVarN1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((l0) it.next()).O().isEmpty()) {
                        }
                    }
                    p10.a0 a0VarB2 = ((c) iVar.invoke()).b(name);
                    kotlin.jvm.internal.m.b(a0VarB2);
                    a20.e eVarF2 = ca.v.F(c, a0VarB2);
                    a20.b bVar2 = (a20.b) c.B;
                    z10.e eVarN2 = z10.e.n1(thisDescriptor, eVarF2, a0VarB2.c(), bVar2.j.b(a0VarB2), true);
                    e30.w wVarG2 = ((a1.i) c.E).G(a0VarB2.f(), p30.f.t0(v0.B, false, null, 6));
                    m10.u uVarP2 = p();
                    j10.y.A.getClass();
                    j10.y yVar2 = j10.y.D;
                    j10.o oVar2 = j10.p.e;
                    h00.x xVar2 = h00.x.A;
                    eVarN2.m1(null, uVarP2, xVar2, xVar2, xVar2, wVarG2, yVar2, oVar2, null);
                    eVarN2.e0 = 1;
                    bVar2.g.getClass();
                    arrayList.add(eVarN2);
                }
            }
        }
        ((v20.a) ((a20.b) c.B).x).getClass();
        kotlin.jvm.internal.m.e(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(c, "c");
    }

    @Override
    public final c k() {
        return new a(this.o, l.B);
    }

    @Override
    public final void m(LinkedHashSet linkedHashSet, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        LinkedHashSet linkedHashSetI = I(name);
        ArrayList arrayList = x10.e0.a;
        if (!x10.e0.j.contains(name) && !x10.e.b(name)) {
            if (!linkedHashSetI.isEmpty()) {
                Iterator it = linkedHashSetI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((j10.u) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (L((l0) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(linkedHashSet, name, arrayList2, false);
            return;
        }
        int i = n30.i.C;
        n30.i iVarE = n30.l.e();
        LinkedHashSet linkedHashSetU = y3.U(name, linkedHashSetI, h00.x.A, this.n, a30.n.a, ((f30.l) ((a20.b) this.b.B).u).d);
        x(name, linkedHashSet, linkedHashSetU, linkedHashSet, new g1(1, this, n.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 11));
        x(name, linkedHashSet, linkedHashSetU, iVarE, new g1(1, this, n.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 12));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((l0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, name, h00.q.Y0(iVarE, arrayList3), true);
    }

    @Override
    public final void n(ArrayList arrayList, n20.e name) {
        p10.x xVar;
        kotlin.jvm.internal.m.e(name, "name");
        boolean zIsAnnotation = this.o.a.isAnnotation();
        oj.q qVar = this.b;
        if (zIsAnnotation && (xVar = (p10.x) h00.q.e1(((c) this.e.invoke()).e(name))) != null) {
            o0 o0Var = j10.y.A;
            z10.f fVarG1 = z10.f.g1(this.n, ca.v.F(qVar, xVar), b5.O(xVar.e()), false, xVar.c(), ((a20.b) qVar.B).j.b(xVar), false);
            j0 j0VarF = q20.k.f(fVarG1, k10.g.a);
            fVarG1.c1(j0VarF, null, null, null);
            kotlin.jvm.internal.m.e(qVar, "<this>");
            e30.w wVarL = a0.l(xVar, new oj.q((a20.b) qVar.B, new a20.g(qVar, fVarG1, xVar, 0), (g00.h) qVar.D));
            m10.u uVarP = p();
            h00.x xVar2 = h00.x.A;
            fVarG1.f1(wVarL, xVar2, uVarP, null, xVar2);
            j0VarF.N = wVarL;
            arrayList.add(fVarG1);
        }
        Set setJ = J(name);
        if (setJ.isEmpty()) {
            return;
        }
        int i = n30.i.C;
        n30.i iVarE = n30.l.e();
        n30.i iVarE2 = n30.l.e();
        y(setJ, arrayList, iVarE, new m(this, 0));
        y(h00.j0.p0(setJ, iVarE), iVarE2, null, new m(this, 1));
        LinkedHashSet linkedHashSetQ0 = h00.j0.q0(setJ, iVarE2);
        a20.b bVar = (a20.b) qVar.B;
        arrayList.addAll(y3.U(name, linkedHashSetQ0, arrayList, this.n, bVar.f, ((f30.l) bVar.u).d));
    }

    @Override
    public final Set o(x20.f kindFilter) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        if (this.o.a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.e.invoke()).f());
        Collection collectionL = this.n.f().l();
        kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
        Iterator it = collectionL.iterator();
        while (it.hasNext()) {
            h00.v.u0(((e30.w) it.next()).N().f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override
    public final m10.u p() {
        j10.e eVar = this.n;
        if (eVar != null) {
            int i = q20.d.a;
            return eVar.x0();
        }
        q20.d.a(0);
        throw null;
    }

    @Override
    public final j10.k q() {
        return this.n;
    }

    @Override
    public final boolean r(z10.e eVar) {
        if (this.o.a.isAnnotation()) {
            return false;
        }
        return L(eVar);
    }

    @Override
    public final y s(p10.x method, ArrayList arrayList, e30.w wVar, List list) {
        kotlin.jvm.internal.m.e(method, "method");
        ((a20.b) this.b.B).e.getClass();
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new y(wVar, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void v(ArrayList arrayList, z10.b bVar, int i, p10.x xVar, e30.w wVar, e30.w wVar2) {
        e20.a pVar;
        n20.e eVarC = xVar.c();
        if (wVar == null) {
            x0.a(2);
            throw null;
        }
        z0 z0VarG = x0.g(wVar, false);
        Object defaultValue = xVar.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = p10.d.a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new p10.t(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                pVar = new p10.g(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                pVar = new p10.h(null, (Object[]) defaultValue);
            } else {
                pVar = defaultValue instanceof Class ? new p10.p(null, (Class) defaultValue) : new p10.v(null, defaultValue);
            }
        } else {
            pVar = null;
        }
        arrayList.add(new r0(bVar, null, i, k10.g.a, eVarC, z0VarG, pVar != null, false, false, wVar2 != null ? x0.g(wVar2, false) : null, ((a20.b) this.b.B).j.b(xVar)));
    }

    public final void w(LinkedHashSet linkedHashSet, n20.e eVar, ArrayList arrayList, boolean z) {
        a20.b bVar = (a20.b) this.b.B;
        LinkedHashSet<l0> linkedHashSetU = y3.U(eVar, arrayList, linkedHashSet, this.n, bVar.f, ((f30.l) bVar.u).d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetU);
            return;
        }
        ArrayList arrayListY0 = h00.q.Y0(linkedHashSetU, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(h00.r.q0(linkedHashSetU, 10));
        for (l0 l0VarA : linkedHashSetU) {
            l0 l0Var = (l0) g4.O(l0VarA);
            if (l0Var != null) {
                l0VarA = A(l0VarA, l0Var, arrayListY0);
            }
            arrayList2.add(l0VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    public final void x(n20.e eVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, u00.k kVar) {
        l0 l0VarA;
        Object next;
        l0 l0Var;
        l0 l0VarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            l0 l0Var2 = (l0) it.next();
            l0 l0Var3 = (l0) g4.N(l0Var2);
            l0 l0Var4 = null;
            if (l0Var3 != null) {
                String strM = g4.M(l0Var3);
                kotlin.jvm.internal.m.b(strM);
                Iterator it2 = ((Collection) kVar.invoke(n20.e.e(strM))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l0VarA = null;
                        break;
                    }
                    j10.t tVarN0 = ((l0) it2.next()).n0();
                    tVarN0.e(eVar);
                    tVarN0.v();
                    tVarN0.i();
                    j10.u uVarBuild = tVarN0.build();
                    kotlin.jvm.internal.m.b(uVarBuild);
                    l0 l0Var5 = (l0) uVarBuild;
                    if (E(l0Var3, l0Var5)) {
                        l0VarA = A(l0Var5, l0Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                l0VarA = null;
                break;
            }
            n30.l.a(abstractSet, l0VarA);
            j10.u uVarA = x10.e.a(l0Var2);
            if (uVarA == 0) {
                l0VarA2 = null;
            } else {
                n20.e name = ((m10.m) uVarA).getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                Iterator it3 = ((Iterable) kVar.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((l0) next, uVarA));
                l0 l0Var6 = (l0) next;
                if (l0Var6 != null) {
                    j10.t tVarN1 = l0Var6.n0();
                    List listO = uVarA.O();
                    kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                    ArrayList arrayList = new ArrayList(h00.r.q0(listO, 10));
                    Iterator it4 = listO.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((r0) it4.next()).getType());
                    }
                    List listO2 = l0Var6.O();
                    kotlin.jvm.internal.m.d(listO2, "getValueParameters(...)");
                    tVarN1.d(bi.b.w(arrayList, listO2, uVarA));
                    tVarN1.v();
                    tVarN1.i();
                    tVarN1.m();
                    l0Var = (l0) tVarN1.build();
                } else {
                    l0Var = null;
                }
                if (l0Var == null) {
                    l0VarA2 = null;
                } else {
                    if (!L(l0Var)) {
                        l0Var = null;
                    }
                    if (l0Var != null) {
                        l0VarA2 = A(l0Var, uVarA, linkedHashSet);
                    } else {
                        l0VarA2 = null;
                    }
                }
            }
            n30.l.a(abstractSet, l0VarA2);
            if (l0Var2.isSuspend()) {
                n20.e name2 = l0Var2.getName();
                kotlin.jvm.internal.m.d(name2, "getName(...)");
                Iterator it5 = ((Iterable) kVar.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    l0 l0VarB = B((l0) it5.next());
                    if (l0VarB == null || !D(l0VarB, l0Var2)) {
                        l0VarB = null;
                    }
                    if (l0VarB != null) {
                        l0Var4 = l0VarB;
                        break;
                    }
                }
            }
            n30.l.a(abstractSet, l0Var4);
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, n30.i iVar, u00.k kVar) {
        l0 l0VarH;
        k0 k0VarM;
        z10.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            j10.l0 l0Var = (j10.l0) it.next();
            if (C(l0Var, kVar)) {
                l0 l0VarG = G(l0Var, kVar);
                kotlin.jvm.internal.m.b(l0VarG);
                if (l0Var.W()) {
                    l0VarH = H(l0Var, kVar);
                    kotlin.jvm.internal.m.b(l0VarH);
                } else {
                    l0VarH = null;
                }
                if (l0VarH != null) {
                    l0VarH.g();
                    l0VarG.g();
                }
                j10.e ownerDescriptor = this.n;
                kotlin.jvm.internal.m.e(ownerDescriptor, "ownerDescriptor");
                z10.d dVar2 = new z10.d(ownerDescriptor, k10.g.a, l0VarG.g(), l0VarG.getVisibility(), l0VarH != null, l0Var.getName(), l0VarG.o(), null, 1, false, null);
                e30.w wVar = l0VarG.H;
                kotlin.jvm.internal.m.b(wVar);
                m10.u uVarP = p();
                h00.x xVar = h00.x.A;
                dVar2.f1(wVar, xVar, uVarP, null, xVar);
                j0 j0VarL = q20.k.l(dVar2, l0VarG.getAnnotations(), false, l0VarG.o());
                j0VarL.M = l0VarG;
                j0VarL.b1(dVar2.getType());
                if (l0VarH != null) {
                    List listO = l0VarH.O();
                    kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                    r0 r0Var = (r0) h00.q.N0(listO);
                    if (r0Var == null) {
                        throw new AssertionError("No parameter found for " + l0VarH);
                    }
                    k0VarM = q20.k.m(dVar2, l0VarH.getAnnotations(), r0Var.getAnnotations(), false, l0VarH.getVisibility(), l0VarH.o());
                    k0VarM.M = l0VarH;
                } else {
                    k0VarM = null;
                }
                dVar2.c1(j0VarL, k0VarM, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (iVar != null) {
                    iVar.add(l0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z = this.p;
        j10.e classDescriptor = this.n;
        if (z) {
            Collection collectionL = classDescriptor.f().l();
            kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
            return collectionL;
        }
        ((f30.l) ((a20.b) this.b.B).u).getClass();
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        Collection collectionL2 = classDescriptor.f().l();
        kotlin.jvm.internal.m.d(collectionL2, "getSupertypes(...)");
        return collectionL2;
    }
}
