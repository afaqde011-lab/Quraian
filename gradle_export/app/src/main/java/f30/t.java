package f30;

import e30.a0;
import e30.h0;
import e30.m0;
import e30.v;
import e30.w;
import e30.z0;
import h00.x;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l9.f0;

public final class t {
    public static final t a = new t();

    public static ArrayList a(AbstractCollection abstractCollection, u00.n nVar) {
        ArrayList<a0> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (!arrayList.isEmpty()) {
                for (a0 a0Var2 : arrayList) {
                    if (a0Var2 != a0Var) {
                        kotlin.jvm.internal.m.b(a0Var2);
                        kotlin.jvm.internal.m.b(a0Var);
                        if (((Boolean) nVar.invoke(a0Var2, a0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final a0 b(ArrayList arrayList) {
        a0 a0Var;
        a0 a0VarA;
        arrayList.size();
        ArrayList<a0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0 a0Var2 = (a0) it.next();
            if (a0Var2.m0() instanceof v) {
                Collection collectionL = a0Var2.m0().l();
                kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
                Collection<w> collection = collectionL;
                ArrayList arrayList3 = new ArrayList(h00.r.q0(collection, 10));
                for (w wVar : collection) {
                    kotlin.jvm.internal.m.b(wVar);
                    a0 a0VarG = e30.c.G(wVar);
                    if (a0Var2.t0()) {
                        a0VarG = a0VarG.z0(true);
                    }
                    arrayList3.add(a0VarG);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(a0Var2);
            }
        }
        s sVarA = s.A;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sVarA = sVarA.a((z0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (a0 a0VarZ0 : arrayList2) {
            if (sVarA == s.D) {
                if (a0VarZ0 instanceof h) {
                    h hVar = (h) a0VarZ0;
                    a0VarZ0 = new h(hVar.B, hVar.C, hVar.D, hVar.E, hVar.F, true);
                }
                kotlin.jvm.internal.m.e(a0VarZ0, "<this>");
                a0 a0VarP = e30.d.p(a0VarZ0, false);
                a0VarZ0 = (a0VarP == null && (a0VarP = e30.c.o(a0VarZ0)) == null) ? a0VarZ0.z0(false) : a0VarP;
            }
            linkedHashSet.add(a0VarZ0);
        }
        ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a0) it3.next()).k0());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it4.next();
        while (true) {
            a0Var = null;
            if (!it4.hasNext()) {
                break;
            }
            h0 other = (h0) it4.next();
            next = (h0) next;
            next.getClass();
            f0 f0Var = h0.B;
            kotlin.jvm.internal.m.e(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) f0Var.B).values();
                kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    e30.g gVar = (e30.g) next.A.get(iIntValue);
                    e30.g gVar2 = (e30.g) other.A.get(iIntValue);
                    if (gVar != null) {
                        if (!kotlin.jvm.internal.m.a(gVar2, gVar)) {
                            gVar = null;
                        }
                        gVar2 = gVar;
                    } else if (gVar2 == null || !kotlin.jvm.internal.m.a(gVar, gVar2)) {
                        gVar2 = null;
                    }
                    n30.l.a(arrayList5, gVar2);
                }
                next = f0.e(arrayList5);
            }
        }
        h0 h0Var = (h0) next;
        if (linkedHashSet.size() == 1) {
            a0VarA = (a0) h00.q.c1(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new av.b(2, this, t.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 4));
            arrayListA.isEmpty();
            s20.n[] nVarArr = s20.n.A;
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    a0 a0Var3 = (a0) it6.next();
                    next2 = (a0) next2;
                    if (next2 != 0 && a0Var3 != null) {
                        m0 m0VarM0 = next2.m0();
                        m0 m0VarM1 = a0Var3.m0();
                        boolean z = m0VarM0 instanceof s20.o;
                        if (z && (m0VarM1 instanceof s20.o)) {
                            Set set = ((s20.o) m0VarM0).A;
                            Set other2 = ((s20.o) m0VarM1).A;
                            kotlin.jvm.internal.m.e(set, "<this>");
                            kotlin.jvm.internal.m.e(other2, "other");
                            Set setQ1 = h00.q.q1(set);
                            h00.v.u0(other2, setQ1);
                            s20.o oVar = new s20.o(setQ1);
                            h0.B.getClass();
                            h0 attributes = h0.C;
                            kotlin.jvm.internal.m.e(attributes, "attributes");
                            next2 = e30.c.v(attributes, oVar, x.A, g30.l.a(g30.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
                        } else if (z) {
                            if (((s20.o) m0VarM0).A.contains(a0Var3)) {
                                next2 = a0Var3;
                            }
                        } else if (!(m0VarM1 instanceof s20.o) || !((s20.o) m0VarM1).A.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                a0Var = (a0) next2;
            }
            if (a0Var != null) {
                a0VarA = a0Var;
            } else {
                k.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new av.b(2, j.b, l.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 5));
                arrayListA2.isEmpty();
                a0VarA = arrayListA2.size() < 2 ? (a0) h00.q.c1(arrayListA2) : new v(linkedHashSet).a();
            }
        }
        return a0VarA.B0(h0Var);
    }
}
