package x20;

import h00.x;
import j10.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class i extends o {
    public final n b;

    public i(n workerScope) {
        kotlin.jvm.internal.m.e(workerScope, "workerScope");
        this.b = workerScope;
    }

    @Override
    public final Collection a(f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        int i = f.l & kindFilter.b;
        f fVar = i == 0 ? null : new f(i, kindFilter.a);
        if (fVar == null) {
            return x.A;
        }
        Collection collectionA = this.b.a(fVar, kVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (obj instanceof j10.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
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
    public final Set f() {
        return this.b.f();
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        j10.h hVarG = this.b.g(name, location);
        if (hVarG != null) {
            j10.e eVar = hVarG instanceof j10.e ? (j10.e) hVarG : null;
            if (eVar != null) {
                return eVar;
            }
            if (hVarG instanceof q0) {
                return (q0) hVarG;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
