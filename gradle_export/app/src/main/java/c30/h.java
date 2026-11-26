package c30;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class h extends q {
    public final f30.f g;
    public final d30.i h;
    public final d30.i i;
    public final i j;

    public h(i iVar, f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.j = iVar;
        a30.k kVar = iVar.L;
        i20.k kVar2 = iVar.E;
        List list = kVar2.Q;
        kotlin.jvm.internal.m.d(list, "getFunctionList(...)");
        List list2 = kVar2.R;
        kotlin.jvm.internal.m.d(list2, "getPropertyList(...)");
        List list3 = kVar2.S;
        kotlin.jvm.internal.m.d(list3, "getTypeAliasList(...)");
        List list4 = kVar2.K;
        kotlin.jvm.internal.m.d(list4, "getNestedClassNameList(...)");
        k20.g gVar = (k20.g) iVar.L.b;
        ArrayList arrayList = new ArrayList(h00.r.q0(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(z3.A(gVar, ((Number) it.next()).intValue()));
        }
        super(kVar, list, list2, list3, new e(0, arrayList));
        a30.i iVar2 = (a30.i) kVar.a;
        this.g = kotlinTypeRefiner;
        d30.l lVar = iVar2.a;
        f fVar = new f(this, 0);
        lVar.getClass();
        this.h = new d30.i(lVar, fVar);
        d30.l lVar2 = iVar2.a;
        f fVar2 = new f(this, 1);
        lVar2.getClass();
        this.i = new d30.i(lVar2, fVar2);
    }

    @Override
    public final Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return (Collection) this.h.invoke();
    }

    @Override
    public final Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        s(name, aVar);
        return super.d(name, aVar);
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        s(name, cVar);
        return super.e(name, cVar);
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        j10.e eVar;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        s(name, location);
        oj.q qVar = this.j.P;
        return (qVar == null || (eVar = (j10.e) ((d30.j) qVar.C).invoke(name)) == null) ? super.g(name, location) : eVar;
    }

    @Override
    public final void h(ArrayList arrayList, u00.k kVar) {
        ?? arrayList2;
        oj.q qVar = this.j.P;
        if (qVar != null) {
            Set<n20.e> setKeySet = ((LinkedHashMap) qVar.B).keySet();
            arrayList2 = new ArrayList();
            for (n20.e name : setKeySet) {
                kotlin.jvm.internal.m.e(name, "name");
                j10.e eVar = (j10.e) ((d30.j) qVar.C).invoke(name);
                if (eVar != null) {
                    arrayList2.add(eVar);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = h00.x.A;
        }
        arrayList.addAll(arrayList2);
    }

    @Override
    public final void j(ArrayList arrayList, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((e30.w) it.next()).N().d(name, r10.c.C));
        }
        a30.k kVar = this.b;
        arrayList.addAll(((a30.i) kVar.a).n.e(name, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((f30.l) ((a30.i) kVar.a).q).d.h(name, arrayList2, arrayList3, this.j, new g(arrayList, 0));
    }

    @Override
    public final void k(ArrayList arrayList, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((e30.w) it.next()).N().e(name, r10.c.C));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((f30.l) ((a30.i) this.b.a).q).d.h(name, arrayList2, arrayList3, this.j, new g(arrayList, 0));
    }

    @Override
    public final n20.b l(n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.j.H.d(name);
    }

    @Override
    public final Set n() {
        List listL = this.j.N.l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            Set setC = ((e30.w) it.next()).N().c();
            if (setC == null) {
                return null;
            }
            h00.v.u0(setC, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override
    public final Set o() {
        i iVar = this.j;
        List listL = iVar.N.l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            h00.v.u0(((e30.w) it.next()).N().b(), linkedHashSet);
        }
        linkedHashSet.addAll(((a30.i) this.b.a).n.d(iVar));
        return linkedHashSet;
    }

    @Override
    public final Set p() {
        List listL = this.j.N.l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            h00.v.u0(((e30.w) it.next()).N().f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override
    public final boolean r(t tVar) {
        return ((a30.i) this.b.a).o.c(this.j, tVar);
    }

    public final void s(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        kotlin.jvm.internal.m.e(((a30.i) this.b.a).i, "<this>");
        i scopeOwner = this.j;
        kotlin.jvm.internal.m.e(scopeOwner, "scopeOwner");
    }
}
