package b20;

import com.google.android.gms.internal.measurement.y3;
import j10.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d0 extends e0 {
    public static final int p = 0;
    public final p10.o n;
    public final i o;

    public d0(oj.q qVar, p10.o jClass, i iVar) {
        super(qVar, null);
        kotlin.jvm.internal.m.e(jClass, "jClass");
        this.n = jClass;
        this.o = iVar;
    }

    public static l0 v(l0 l0Var) {
        if (l0Var.getKind() != 2) {
            return l0Var;
        }
        Collection collectionM = l0Var.m();
        kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
        Collection<l0> collection = collectionM;
        ArrayList arrayList = new ArrayList(h00.r.q0(collection, 10));
        for (l0 l0Var2 : collection) {
            kotlin.jvm.internal.m.b(l0Var2);
            arrayList.add(v(l0Var2));
        }
        return (l0) h00.q.d1(h00.q.G0(arrayList));
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return null;
    }

    @Override
    public final Set h(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return h00.z.A;
    }

    @Override
    public final Set i(x20.f kindFilter, x20.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        Set setQ1 = h00.q.q1(((c) this.e.invoke()).a());
        i thisDescriptor = this.o;
        d0 d0VarD = bi.b.D(thisDescriptor);
        Set setB = d0VarD != null ? d0VarD.b() : null;
        if (setB == null) {
            setB = h00.z.A;
        }
        setQ1.addAll(setB);
        if (this.n.a.isEnum()) {
            setQ1.addAll(va.a.S(new n20.e[]{g10.p.c, g10.p.a}));
        }
        oj.q c = this.b;
        ((v20.a) ((a20.b) c.B).x).getClass();
        kotlin.jvm.internal.m.e(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.m.e(c, "c");
        setQ1.addAll(new ArrayList());
        return setQ1;
    }

    @Override
    public final void j(ArrayList arrayList, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        oj.q c = this.b;
        ((v20.a) ((a20.b) c.B).x).getClass();
        i thisDescriptor = this.o;
        kotlin.jvm.internal.m.e(thisDescriptor, "thisDescriptor");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(c, "c");
    }

    @Override
    public final c k() {
        return new a(this.n, l.D);
    }

    @Override
    public final void m(LinkedHashSet linkedHashSet, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        i iVar = this.o;
        d0 d0VarD = bi.b.D(iVar);
        Collection collectionR1 = d0VarD == null ? h00.z.A : h00.q.r1(d0VarD.d(name, r10.c.E));
        a20.b bVar = (a20.b) this.b.B;
        linkedHashSet.addAll(y3.V(name, collectionR1, linkedHashSet, this.o, bVar.f, ((f30.l) bVar.u).d));
        if (this.n.a.isEnum()) {
            if (name.equals(g10.p.c)) {
                linkedHashSet.add(q20.k.i(iVar));
            } else if (name.equals(g10.p.a)) {
                linkedHashSet.add(q20.k.j(iVar));
            }
        }
    }

    @Override
    public final void n(ArrayList arrayList, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a20.d dVar = new a20.d(name, 6);
        i iVar = this.o;
        n30.l.f(va.a.R(iVar), b0.A, new c0(iVar, linkedHashSet, dVar));
        boolean zIsEmpty = arrayList.isEmpty();
        oj.q qVar = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                l0 l0VarV = v((l0) obj);
                Object arrayList2 = linkedHashMap.get(l0VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(l0VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                a20.b bVar = (a20.b) qVar.B;
                h00.v.u0(y3.V(name, collection, arrayList, this.o, bVar.f, ((f30.l) bVar.u).d), arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            a20.b bVar2 = (a20.b) qVar.B;
            arrayList.addAll(y3.V(name, linkedHashSet, arrayList, this.o, bVar2.f, ((f30.l) bVar2.u).d));
        }
        if (this.n.a.isEnum() && name.equals(g10.p.b)) {
            n30.l.a(arrayList, q20.k.h(iVar));
        }
    }

    @Override
    public final Set o(x20.f kindFilter) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        Set setQ1 = h00.q.q1(((c) this.e.invoke()).f());
        l lVar = l.E;
        i iVar = this.o;
        n30.l.f(va.a.R(iVar), b0.A, new c0(iVar, setQ1, lVar));
        if (this.n.a.isEnum()) {
            setQ1.add(g10.p.b);
        }
        return setQ1;
    }

    @Override
    public final j10.k q() {
        return this.o;
    }
}
