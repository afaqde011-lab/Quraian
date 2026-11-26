package x20;

import h00.x;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import m10.l0;

public abstract class o implements n {
    @Override
    public Collection a(f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return x.A;
    }

    @Override
    public Set b() {
        Collection collectionA = a(f.p, n30.b.A);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof l0) {
                n20.e name = ((l0) obj).getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override
    public Set c() {
        return null;
    }

    @Override
    public Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return x.A;
    }

    @Override
    public Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return x.A;
    }

    @Override
    public Set f() {
        Collection collectionA = a(f.q, n30.b.A);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof l0) {
                n20.e name = ((l0) obj).getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override
    public j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return null;
    }
}
