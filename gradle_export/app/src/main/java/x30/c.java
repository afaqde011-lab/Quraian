package x30;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class c extends h00.g implements u30.f {
    public static final c D;
    public final Object A;
    public final Object B;
    public final w30.c C;

    static {
        w30.c cVar = w30.c.C;
        m.c(cVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        z30.b bVar = z30.b.a;
        D = new c(bVar, bVar, cVar);
    }

    public c(Object obj, Object obj2, w30.c hashMap) {
        m.e(hashMap, "hashMap");
        this.A = obj;
        this.B = obj2;
        this.C = hashMap;
    }

    @Override
    public final Set a() {
        return new g(this, 0);
    }

    @Override
    public final Set c() {
        return new g(this, 1);
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.C.containsKey(obj);
    }

    @Override
    public final int e() {
        return this.C.size();
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (e() != map.size()) {
            return false;
        }
        boolean z = map instanceof c;
        w30.c cVar = this.C;
        if (z) {
            return cVar.A.g(((c) obj).C.A, b.B);
        }
        if (map instanceof d) {
            return cVar.A.g(((d) obj).D.C, b.C);
        }
        if (map instanceof w30.c) {
            return cVar.A.g(((w30.c) obj).A, b.D);
        }
        return map instanceof w30.d ? cVar.A.g(((w30.d) obj).C, b.E) : super.equals(obj);
    }

    @Override
    public final Collection g() {
        return new r30.g(this, 3);
    }

    @Override
    public final Object get(Object obj) {
        a aVar = (a) this.C.get(obj);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }
}
