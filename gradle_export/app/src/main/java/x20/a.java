package x20;

import h00.v;
import h00.x;
import h00.z;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public final class a implements n {
    public final String b;
    public final n[] c;

    public a(String str, n[] nVarArr) {
        this.b = str;
        this.c = nVarArr;
    }

    @Override
    public final Collection a(f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        n[] nVarArr = this.c;
        int length = nVarArr.length;
        if (length == 0) {
            return x.A;
        }
        if (length == 1) {
            return nVarArr[0].a(kindFilter, kVar);
        }
        Collection collectionR = null;
        for (n nVar : nVarArr) {
            collectionR = w50.c.r(collectionR, nVar.a(kindFilter, kVar));
        }
        return collectionR == null ? z.A : collectionR;
    }

    @Override
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.c) {
            v.u0(nVar.b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override
    public final Set c() {
        return f50.k.m(h00.n.j0(this.c));
    }

    @Override
    public final Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        n[] nVarArr = this.c;
        int length = nVarArr.length;
        if (length == 0) {
            return x.A;
        }
        if (length == 1) {
            return nVarArr[0].d(name, aVar);
        }
        Collection collectionR = null;
        for (n nVar : nVarArr) {
            collectionR = w50.c.r(collectionR, nVar.d(name, aVar));
        }
        return collectionR == null ? z.A : collectionR;
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        n[] nVarArr = this.c;
        int length = nVarArr.length;
        if (length == 0) {
            return x.A;
        }
        if (length == 1) {
            return nVarArr[0].e(name, cVar);
        }
        Collection collectionR = null;
        for (n nVar : nVarArr) {
            collectionR = w50.c.r(collectionR, nVar.e(name, cVar));
        }
        return collectionR == null ? z.A : collectionR;
    }

    @Override
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.c) {
            v.u0(nVar.f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        j10.h hVar = null;
        for (n nVar : this.c) {
            j10.h hVarG = nVar.g(name, location);
            if (hVarG != null) {
                if (!(hVarG instanceof j10.i) || !((j10.x) hVarG).E()) {
                    return hVarG;
                }
                if (hVar == null) {
                    hVar = hVarG;
                }
            }
        }
        return hVar;
    }

    public final String toString() {
        return this.b;
    }
}
