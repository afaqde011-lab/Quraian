package j10;

import c3.y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class w {
    public static final eh.l a = new eh.l("InvalidModuleNotifier", 3);

    public static final a1.i a(e30.a0 a0Var, i iVar, int i) {
        if (iVar == null || g30.l.f(iVar)) {
            return null;
        }
        int size = iVar.p().size() + i;
        if (iVar.k()) {
            List listSubList = a0Var.e0().subList(i, size);
            k kVarL = iVar.l();
            return new a1.i(iVar, listSubList, a(a0Var, kVarL instanceof i ? (i) kVarL : null, size));
        }
        if (size != a0Var.e0().size()) {
            q20.d.m(iVar);
        }
        return new a1.i(iVar, a0Var.e0().subList(i, a0Var.e0().size()), (a1.i) null);
    }

    public static final void b(h0 h0Var, n20.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(h0Var, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        h0Var.b(fqName, arrayList);
    }

    public static final List c(i iVar) {
        List parameters;
        Object next;
        e30.m0 m0VarF;
        List listP = iVar.p();
        kotlin.jvm.internal.m.d(listP, "getDeclaredTypeParameters(...)");
        if (!iVar.k() && !(iVar.l() instanceof b)) {
            return listP;
        }
        int i = u20.d.a;
        u20.b bVar = u20.b.B;
        List listU0 = q30.l.u0(new q30.g(new q30.f(new y2(q30.l.l0(q30.l.n0(iVar, bVar), 1), 6), true, r.D), r.E, q30.o.A));
        Iterator it = q30.l.l0(q30.l.n0(iVar, bVar), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof e));
        e eVar = (e) next;
        if (eVar != null && (m0VarF = eVar.f()) != null) {
            parameters = m0VarF.getParameters();
        }
        if (parameters == null) {
            parameters = h00.x.A;
        }
        if (listU0.isEmpty() && parameters.isEmpty()) {
            List listP2 = iVar.p();
            kotlin.jvm.internal.m.d(listP2, "getDeclaredTypeParameters(...)");
            return listP2;
        }
        ArrayList<r0> arrayListY0 = h00.q.Y0(parameters, listU0);
        ArrayList arrayList = new ArrayList(h00.r.q0(arrayListY0, 10));
        for (r0 r0Var : arrayListY0) {
            kotlin.jvm.internal.m.b(r0Var);
            arrayList.add(new d(r0Var, iVar, listP.size()));
        }
        return h00.q.Y0(arrayList, listP);
    }

    public static final e d(z zVar, n20.b classId) {
        kotlin.jvm.internal.m.e(zVar, "<this>");
        kotlin.jvm.internal.m.e(classId, "classId");
        h hVarE = e(zVar, classId);
        if (hVarE instanceof e) {
            return (e) hVarE;
        }
        return null;
    }

    public static final h e(z zVar, n20.b classId) {
        kotlin.jvm.internal.m.e(zVar, "<this>");
        kotlin.jvm.internal.m.e(classId, "classId");
        if (zVar.D(q20.k.a) != null) {
            throw new ClassCastException();
        }
        i0 i0VarF0 = zVar.f0(classId.a);
        n20.d dVar = classId.b.a;
        dVar.getClass();
        List listF = n20.d.f(dVar);
        h hVarG = ((m10.w) i0VarF0).H.g((n20.e) h00.q.L0(listF), r10.c.G);
        if (hVarG != null) {
            for (n20.e eVar : listF.subList(1, listF.size())) {
                if (hVarG instanceof e) {
                    h hVarG2 = ((e) hVarG).i0().g(eVar, r10.c.G);
                    hVarG = hVarG2 instanceof e ? (e) hVarG2 : null;
                    if (hVarG != null) {
                    }
                }
            }
            return hVarG;
        }
        return null;
    }

    public static final e f(z zVar, n20.b classId, oj.q notFoundClasses) {
        kotlin.jvm.internal.m.e(zVar, "<this>");
        kotlin.jvm.internal.m.e(classId, "classId");
        kotlin.jvm.internal.m.e(notFoundClasses, "notFoundClasses");
        e eVarD = d(zVar, classId);
        return eVarD != null ? eVarD : notFoundClasses.B(classId, q30.l.u0(q30.l.r0(q30.l.n0(classId, s.B), r.B)));
    }

    public static final h g(k kVar) {
        k kVarL = kVar.l();
        if (kVarL == null || (kVar instanceof e0)) {
            return null;
        }
        if (!(kVarL.l() instanceof e0)) {
            return g(kVarL);
        }
        if (kVarL instanceof h) {
            return (h) kVarL;
        }
        return null;
    }

    public static final boolean h(h0 h0Var, n20.c fqName) {
        kotlin.jvm.internal.m.e(h0Var, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return h0Var.a(fqName);
    }

    public static final ArrayList i(h0 h0Var, n20.c fqName) {
        kotlin.jvm.internal.m.e(h0Var, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        b(h0Var, fqName, arrayList);
        return arrayList;
    }

    public static final e j(z zVar, n20.c fqName) {
        x20.n nVarI0;
        r10.c cVar = r10.c.A;
        kotlin.jvm.internal.m.e(zVar, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        n20.d dVar = fqName.a;
        if (!dVar.c()) {
            h hVarG = ((m10.w) zVar.f0(fqName.b())).H.g(dVar.g(), cVar);
            e eVar = hVarG instanceof e ? (e) hVarG : null;
            if (eVar != null) {
                return eVar;
            }
            e eVarJ = j(zVar, fqName.b());
            h hVarG2 = (eVarJ == null || (nVarI0 = eVarJ.i0()) == null) ? null : nVarI0.g(dVar.g(), cVar);
            if (hVarG2 instanceof e) {
                return (e) hVarG2;
            }
        }
        return null;
    }
}
