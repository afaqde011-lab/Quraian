package x10;

import com.google.android.gms.internal.measurement.f4;
import h00.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class b {
    public static final LinkedHashMap c;
    public final f4 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : a.values()) {
            String str = aVar.A;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, aVar);
            }
        }
        c = linkedHashMap;
    }

    public b(f4 f4Var) {
        this.a = f4Var;
    }

    public static ArrayList a(Object obj, boolean z) {
        k10.b bVar = (k10.b) obj;
        kotlin.jvm.internal.m.e(bVar, "<this>");
        Map mapB = bVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            h00.v.u0((!z || kotlin.jvm.internal.m.a((n20.e) entry.getKey(), v.b)) ? j((s20.g) entry.getValue()) : h00.x.A, arrayList);
        }
        return arrayList;
    }

    public static s b(b bVar, s sVar, k10.h annotations) {
        boolean z;
        m mVar;
        z zVarH;
        m mVar2;
        Object objC;
        Object next;
        g00.k kVar;
        f20.i iVarG;
        bVar.getClass();
        kotlin.jvm.internal.m.e(annotations, "annotations");
        f4 f4Var = bVar.a;
        boolean z2 = f4Var.B;
        if (!z2) {
            ArrayList<m> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                m mVar3 = null;
                if (z2 || (mVar = (m) n.e.get(d(next2))) == null) {
                    mVar2 = null;
                } else {
                    n20.c cVarD = d(next2);
                    if (cVarD == null || !n.c.containsKey(cVarD)) {
                        zVarH = bVar.h(next2);
                        if (zVarH == null) {
                            zVarH = ((t) f4Var.C).a;
                        }
                    } else {
                        zVarH = (z) ((v2.b0) f4Var.D).invoke(cVarD);
                    }
                    if (zVarH == z.IGNORE) {
                        zVarH = null;
                    }
                    if (zVarH == null) {
                        mVar2 = null;
                    } else {
                        f20.i iVarA = f20.i.a(mVar.a, null, zVarH == z.WARN, 1);
                        Collection qualifierApplicabilityTypes = mVar.b;
                        boolean z3 = mVar.c;
                        boolean z4 = mVar.d;
                        boolean z5 = mVar.e;
                        kotlin.jvm.internal.m.e(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                        mVar2 = new m(iVarA, qualifierApplicabilityTypes, z3, z4, z5);
                    }
                }
                if (mVar2 != null) {
                    mVar3 = mVar2;
                } else {
                    if (((t) f4Var.C).d || (objC = c(next2, w.f)) == null) {
                        kVar = null;
                    } else {
                        Iterator it2 = e(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (bVar.i(next) == null);
                        if (next == null) {
                            kVar = null;
                        } else {
                            ArrayList arrayListA = a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                a aVar = (a) c.get((String) it3.next());
                                if (aVar != null) {
                                    linkedHashSet.add(aVar);
                                }
                            }
                            if (linkedHashSet.contains(a.TYPE_USE)) {
                                linkedHashSet = j0.q0(j0.o0(h00.n.X0(a.values()), a.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            kVar = new g00.k(next, linkedHashSet);
                        }
                    }
                    if (kVar != null) {
                        Object extractNullability = kVar.A;
                        Set set = (Set) kVar.B;
                        z zVarH2 = bVar.h(next2);
                        if (zVarH2 == null && (zVarH2 = bVar.h(extractNullability)) == null) {
                            zVarH2 = ((t) f4Var.C).a;
                        }
                        z zVar = z.IGNORE;
                        if (zVarH2 != zVar) {
                            kotlin.jvm.internal.m.e(extractNullability, "$this$extractNullability");
                            f20.i iVarG2 = bVar.g(extractNullability, false);
                            if (iVarG2 == null) {
                                Object objI = bVar.i(extractNullability);
                                if (objI != null) {
                                    z zVarH3 = bVar.h(extractNullability);
                                    if (zVarH3 == null) {
                                        zVarH3 = ((t) f4Var.C).a;
                                    }
                                    if (zVarH3 == zVar || (iVarG = bVar.g(objI, false)) == null) {
                                        iVarG2 = null;
                                    } else {
                                        iVarG2 = f20.i.a(iVarG, null, zVarH3 == z.WARN, 1);
                                    }
                                } else {
                                    iVarG2 = null;
                                }
                            }
                            if (iVarG2 != null) {
                                mVar3 = new m(f20.i.a(iVarG2, null, zVarH2 == z.WARN, 1), set, 28);
                            }
                        }
                    }
                }
                if (mVar3 != null) {
                    arrayList.add(mVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(a.class);
                for (m mVar4 : arrayList) {
                    for (a aVar2 : mVar4.b) {
                        enumMap.containsKey(aVar2);
                        enumMap.put(aVar2, mVar4);
                    }
                }
                EnumMap enumMap2 = sVar != null ? new EnumMap(sVar.a) : new EnumMap(a.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    a aVar3 = (a) entry.getKey();
                    m mVar5 = (m) entry.getValue();
                    if (mVar5 != null) {
                        enumMap2.put(aVar3, mVar5);
                        z = true;
                    }
                }
                if (z) {
                    return new s(enumMap2);
                }
            }
        }
        return sVar;
    }

    public static Object c(Object obj, n20.c cVar) {
        for (Object obj2 : e(obj)) {
            if (kotlin.jvm.internal.m.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static n20.c d(Object obj) {
        k10.b bVar = (k10.b) obj;
        kotlin.jvm.internal.m.e(bVar, "<this>");
        return bVar.a();
    }

    public static Iterable e(Object obj) {
        k10.h annotations;
        k10.b bVar = (k10.b) obj;
        kotlin.jvm.internal.m.e(bVar, "<this>");
        j10.e eVarD = u20.d.d(bVar);
        return (eVarD == null || (annotations = eVarD.getAnnotations()) == null) ? h00.x.A : annotations;
    }

    public static boolean f(Object obj, n20.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(s20.g gVar) {
        if (!(gVar instanceof s20.b)) {
            return gVar instanceof s20.i ? va.a.R(((s20.i) gVar).c.c()) : h00.x.A;
        }
        Iterable iterable = (Iterable) ((s20.b) gVar).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h00.v.u0(j((s20.g) it.next()), arrayList);
        }
        return arrayList;
    }

    public final f20.i g(java.lang.Object r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: x10.b.g(java.lang.Object, boolean):f20.i");
    }

    public final z h(Object obj) {
        String str;
        t tVar = (t) this.a.C;
        z zVar = (z) tVar.c.get(d(obj));
        if (zVar != null) {
            return zVar;
        }
        Object objC = c(obj, w.p);
        if (objC == null || (str = (String) h00.q.M0(a(objC, false))) == null) {
            return null;
        }
        z zVar2 = tVar.b;
        if (zVar2 != null) {
            return zVar2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return z.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return z.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return z.WARN;
        }
        return null;
    }

    public final Object i(Object annotation) {
        Object objI;
        kotlin.jvm.internal.m.e(annotation, "annotation");
        if (!((t) this.a.C).d) {
            if (h00.q.F0(w.j, d(annotation)) || f(annotation, w.d)) {
                return annotation;
            }
            if (f(annotation, w.e)) {
                j10.e eVarD = u20.d.d((k10.b) annotation);
                kotlin.jvm.internal.m.b(eVarD);
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj = concurrentHashMap.get(eVarD);
                if (obj != null) {
                    return obj;
                }
                Iterator it = e(annotation).iterator();
                do {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                } while (objI == null);
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(eVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
