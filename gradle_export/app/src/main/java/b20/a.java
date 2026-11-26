package b20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class a implements c {
    public final p10.o a;
    public final u00.k b;
    public final a20.d c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public a(p10.o jClass, u00.k kVar) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        this.a = jClass;
        this.b = kVar;
        a20.d dVar = new a20.d(this, 4);
        this.c = dVar;
        q30.f fVar = new q30.f(h00.q.D0(jClass.d()), true, dVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q30.e eVar = new q30.e(fVar);
        while (eVar.hasNext()) {
            Object next = eVar.next();
            n20.e eVarC = ((p10.x) next).c();
            Object arrayList = linkedHashMap.get(eVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        q30.f fVar2 = new q30.f(h00.q.D0(this.a.b()), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        q30.e eVar2 = new q30.e(fVar2);
        while (eVar2.hasNext()) {
            Object next2 = eVar2.next();
            linkedHashMap2.put(((p10.u) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListF = this.a.f();
        u00.k kVar2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) kVar2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iP = h00.d0.P(h00.r.q0(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((p10.a0) obj2).c(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override
    public final Set a() {
        q30.f fVar = new q30.f(h00.q.D0(this.a.d()), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q30.e eVar = new q30.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((p10.x) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override
    public final p10.a0 b(n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return (p10.a0) this.f.get(name);
    }

    @Override
    public final Set c() {
        return this.f.keySet();
    }

    @Override
    public final p10.u d(n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return (p10.u) this.e.get(name);
    }

    @Override
    public final Collection e(n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        List list = (List) this.d.get(name);
        return list != null ? list : h00.x.A;
    }

    @Override
    public final Set f() {
        q30.f fVar = new q30.f(h00.q.D0(this.a.b()), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q30.e eVar = new q30.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((p10.u) eVar.next()).c());
        }
        return linkedHashSet;
    }
}
