package y30;

import h00.k;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class c extends k implements u30.c {
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
    public final int a() {
        return this.C.e();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.C.containsKey(obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (a() != set.size()) {
            return false;
        }
        boolean z = set instanceof c;
        w30.c cVar = this.C;
        if (z) {
            return cVar.A.g(((c) obj).C.A, b.B);
        }
        return set instanceof d ? cVar.A.g(((d) obj).D.C, b.C) : super.equals(obj);
    }

    @Override
    public final Iterator iterator() {
        return new t1.d(this.A, this.C, 2);
    }
}
