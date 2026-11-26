package b20;

import a1.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class u extends e0 {
    public final p10.y n;
    public final p o;
    public final d30.h p;
    public final d30.j q;

    public u(oj.q qVar, p10.y yVar, p pVar) {
        super(qVar, null);
        this.n = yVar;
        this.o = pVar;
        d30.o oVar = ((a20.b) qVar.B).a;
        a20.a aVar = new a20.a(qVar, this, 9);
        d30.l lVar = (d30.l) oVar;
        lVar.getClass();
        this.p = new d30.h(lVar, aVar);
        this.q = ((d30.l) oVar).c(new v2(this, qVar, 6));
    }

    @Override
    public final Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        if (!kindFilter.a(x20.f.l | x20.f.e)) {
            return h00.x.A;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            j10.k kVar2 = (j10.k) obj;
            if (kVar2 instanceof j10.e) {
                n20.e name = ((j10.e) kVar2).getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                if (((Boolean) kVar.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return h00.x.A;
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return v(name, null);
    }

    @Override
    public final Set h(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        if (!kindFilter.a(x20.f.e)) {
            return h00.z.A;
        }
        Set set = (Set) this.p.invoke();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(n20.e.e((String) it.next()));
        }
        return hashSet;
    }

    @Override
    public final Set i(x20.f kindFilter, x20.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return h00.z.A;
    }

    @Override
    public final c k() {
        return b.a;
    }

    @Override
    public final void m(LinkedHashSet linkedHashSet, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    @Override
    public final Set o(x20.f kindFilter) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return h00.z.A;
    }

    @Override
    public final j10.k q() {
        return this.o;
    }

    public final j10.e v(n20.e name, p10.o oVar) {
        n20.e eVar = n20.g.a;
        kotlin.jvm.internal.m.e(name, "name");
        String strB = name.b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        if (strB.length() <= 0 || name.B) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (oVar == null && set != null && !set.contains(name.b())) {
            return null;
        }
        return (j10.e) this.q.invoke(new q(name, oVar));
    }
}
