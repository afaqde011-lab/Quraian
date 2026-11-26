package x20;

import ab.a0;
import e30.s0;
import e30.u0;
import j10.p0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class s implements n {
    public final n b;
    public final u0 c;
    public HashMap d;
    public final g00.p e;

    public s(n workerScope, u0 givenSubstitutor) {
        kotlin.jvm.internal.m.e(workerScope, "workerScope");
        kotlin.jvm.internal.m.e(givenSubstitutor, "givenSubstitutor");
        this.b = workerScope;
        rd.a.J(new eo.p(givenSubstitutor, 22));
        s0 s0VarF = givenSubstitutor.f();
        kotlin.jvm.internal.m.d(s0VarF, "getSubstitution(...)");
        this.c = new u0(a0.J0(s0VarF));
        this.e = rd.a.J(new eo.p(this, 23));
    }

    @Override
    public final Collection a(f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return (Collection) this.e.getValue();
    }

    @Override
    public final Set b() {
        return this.b.b();
    }

    @Override
    public final Set c() {
        return this.b.c();
    }

    @Override
    public final Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return i(this.b.d(name, aVar));
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return i(this.b.e(name, cVar));
    }

    @Override
    public final Set f() {
        return this.b.f();
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        j10.h hVarG = this.b.g(name, location);
        if (hVarG != null) {
            return (j10.h) h(hVarG);
        }
        return null;
    }

    public final j10.k h(j10.k kVar) {
        u0 u0Var = this.c;
        if (u0Var.a.e()) {
            return kVar;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap map = this.d;
        kotlin.jvm.internal.m.b(map);
        Object objE = map.get(kVar);
        if (objE == null) {
            if (!(kVar instanceof p0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + kVar).toString());
            }
            objE = ((p0) kVar).e(u0Var);
            if (objE == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + kVar + " substitution fails");
            }
            map.put(kVar, objE);
        }
        return (j10.k) objE;
    }

    public final Collection i(Collection collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((j10.k) it.next()));
        }
        return linkedHashSet;
    }
}
