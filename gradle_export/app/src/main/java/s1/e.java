package s1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class e extends h00.i implements q1.c {
    public c A;
    public u1.b B = new u1.b();
    public k C;
    public Object D;
    public int E;
    public int F;

    public e(c cVar) {
        this.A = cVar;
        this.C = cVar.A;
        this.F = cVar.B;
    }

    public final Set a() {
        return new g(0, this);
    }

    public final Set c() {
        return new g(1, this);
    }

    @Override
    public final void clear() {
        this.C = k.f13620e;
        i(0);
    }

    @Override
    public boolean containsKey(Object obj) {
        return this.C.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final int e() {
        return this.F;
    }

    public final Collection g() {
        return new i00.h(this, 1);
    }

    @Override
    public Object get(Object obj) {
        return this.C.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override
    public c build() {
        k kVar = this.C;
        c cVar = this.A;
        if (kVar != cVar.A) {
            this.B = new u1.b();
            cVar = new c(this.C, e());
        }
        this.A = cVar;
        return cVar;
    }

    public final void i(int i10) {
        this.F = i10;
        this.E++;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        this.D = null;
        this.C = this.C.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.D;
    }

    @Override
    public final void putAll(Map map) {
        c cVarBuild = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarBuild = eVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super/*java.util.AbstractMap*/.putAll(map);
            return;
        }
        u1.a aVar = new u1.a();
        aVar.f14919a = 0;
        int i10 = this.F;
        k kVar = this.C;
        k kVar2 = cVarBuild.A;
        kotlin.jvm.internal.m.c(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.C = kVar.m(kVar2, 0, aVar, this);
        int i11 = (cVarBuild.B + i10) - aVar.f14919a;
        if (i10 != i11) {
            i(i11);
        }
    }

    @Override
    public Object remove(Object obj) {
        this.D = null;
        k kVarN = this.C.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (kVarN == null) {
            kVarN = k.f13620e;
        }
        this.C = kVarN;
        return this.D;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        int iE = e();
        k kVarO = this.C.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (kVarO == null) {
            kVarO = k.f13620e;
        }
        this.C = kVarO;
        return iE != e();
    }
}
