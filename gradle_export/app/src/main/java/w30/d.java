package w30;

import ca.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d extends h00.i implements u30.e {
    public c A;
    public z30.b B;
    public k C;
    public Object D;
    public int E;
    public int F;

    public d(c map) {
        kotlin.jvm.internal.m.e(map, "map");
        this.A = map;
        this.B = new z30.b();
        this.C = map.A;
        this.F = map.e();
    }

    @Override
    public final Set a() {
        return new f(this, 0);
    }

    @Override
    public final Set c() {
        return new g(this, 0);
    }

    @Override
    public final void clear() {
        k kVar = k.e;
        kotlin.jvm.internal.m.c(kVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.C = kVar;
        i(0);
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.C.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override
    public final int e() {
        return this.F;
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
        if (this.F != map.size()) {
            return false;
        }
        if (map instanceof c) {
            return this.C.g(((c) obj).A, b.F);
        }
        if (map instanceof d) {
            return this.C.g(((d) obj).C, b.G);
        }
        if (map instanceof x30.c) {
            return this.C.g(((x30.c) obj).C.A, b.H);
        }
        if (map instanceof x30.d) {
            return this.C.g(((x30.d) obj).D.C, b.I);
        }
        if (e() != map.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (map.isEmpty()) {
            return true;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!v.t(this, (Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Collection g() {
        return new i00.h(this, 2);
    }

    @Override
    public final Object get(Object obj) {
        return this.C.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override
    public final c build() {
        k kVar = this.C;
        c cVar = this.A;
        if (kVar != cVar.A) {
            this.B = new z30.b();
            cVar = new c(this.C, e());
        }
        this.A = cVar;
        return cVar;
    }

    @Override
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final void i(int i) {
        this.F = i;
        this.E++;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        this.D = null;
        this.C = this.C.m(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.D;
    }

    @Override
    public final void putAll(Map from) {
        kotlin.jvm.internal.m.e(from, "from");
        c cVarBuild = null;
        c cVar = from instanceof c ? (c) from : null;
        if (cVar == null) {
            d dVar = from instanceof d ? (d) from : null;
            if (dVar != null) {
                cVarBuild = dVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super.putAll(from);
            return;
        }
        z30.a aVar = new z30.a();
        aVar.a = 0;
        int iE = e();
        k kVar = this.C;
        k kVar2 = cVarBuild.A;
        kotlin.jvm.internal.m.c(kVar2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.C = kVar.n(kVar2, 0, aVar, this);
        int iE2 = (cVarBuild.e() + iE) - aVar.a;
        if (iE != iE2) {
            i(iE2);
        }
    }

    @Override
    public final Object remove(Object obj) {
        this.D = null;
        k kVarO = this.C.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (kVarO == null) {
            k kVar = k.e;
            kotlin.jvm.internal.m.c(kVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            kVarO = kVar;
        }
        this.C = kVarO;
        return this.D;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        int iE = e();
        k kVarP = this.C.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (kVarP == null) {
            k kVar = k.e;
            kotlin.jvm.internal.m.c(kVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            kVarP = kVar;
        }
        this.C = kVarP;
        return iE != e();
    }
}
