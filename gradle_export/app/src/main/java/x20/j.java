package x20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class j implements n {
    public final int b = 0;
    public final Object c;

    public j(d30.o storageManager, u00.a aVar) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.c = new d30.i((d30.l) storageManager, new c30.m(1, aVar));
    }

    public j(n nVar) {
        this.c = nVar;
    }

    @Override
    public Collection a(f kindFilter, u00.k kVar) {
        switch (this.b) {
            case 1:
                kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
                Collection collectionI = i(kindFilter, kVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((j10.k) obj) instanceof j10.b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return h00.q.Y0(arrayList2, q20.k.o(arrayList, k.E));
            default:
                return i(kindFilter, kVar);
        }
    }

    @Override
    public final Set b() {
        return l().b();
    }

    @Override
    public final Set c() {
        return l().c();
    }

    @Override
    public Collection d(n20.e name, r10.a aVar) {
        switch (this.b) {
            case 1:
                kotlin.jvm.internal.m.e(name, "name");
                return q20.k.o(j(name, aVar), k.C);
            default:
                return j(name, aVar);
        }
    }

    @Override
    public Collection e(n20.e name, r10.c cVar) {
        switch (this.b) {
            case 1:
                kotlin.jvm.internal.m.e(name, "name");
                return q20.k.o(k(name, cVar), k.D);
            default:
                return k(name, cVar);
        }
    }

    @Override
    public final Set f() {
        return l().f();
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return l().g(name, location);
    }

    public final n h() {
        if (!(l() instanceof j)) {
            return l();
        }
        n nVarL = l();
        kotlin.jvm.internal.m.c(nVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((j) nVarL).h();
    }

    public final Collection i(f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return l().a(kindFilter, kVar);
    }

    public final Collection j(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return l().d(name, aVar);
    }

    public final Collection k(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return l().e(name, cVar);
    }

    public final n l() {
        switch (this.b) {
            case 0:
                return (n) ((d30.i) this.c).invoke();
            default:
                return (n) this.c;
        }
    }
}
