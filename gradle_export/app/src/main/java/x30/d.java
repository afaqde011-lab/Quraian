package x30;

import ca.v;
import h00.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class d extends i implements u30.e {
    public c A;
    public Object B;
    public Object C;
    public final w30.d D;

    public d(c cVar) {
        this.A = cVar;
        this.B = cVar.A;
        this.C = cVar.B;
        w30.c cVar2 = cVar.C;
        cVar2.getClass();
        this.D = new w30.d(cVar2);
    }

    @Override
    public final Set a() {
        return new w30.f(this, 1);
    }

    @Override
    public final u30.f build() {
        w30.c cVarBuild = this.D.build();
        c cVar = this.A;
        if (cVarBuild == cVar.C) {
            Object obj = cVar.A;
            Object obj2 = cVar.B;
        } else {
            cVar = new c(this.B, this.C, cVarBuild);
        }
        this.A = cVar;
        return cVar;
    }

    @Override
    public final Set c() {
        return new w30.g(this, 1);
    }

    @Override
    public final void clear() {
        this.D.clear();
        z30.b bVar = z30.b.a;
        this.B = bVar;
        this.C = bVar;
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.D.containsKey(obj);
    }

    @Override
    public final int e() {
        return this.D.size();
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        w30.d dVar = this.D;
        Map map = (Map) obj;
        if (dVar.size() != map.size()) {
            return false;
        }
        if (map instanceof c) {
            return dVar.C.g(((c) obj).C.A, b.F);
        }
        if (map instanceof d) {
            return dVar.C.g(((d) obj).D.C, b.G);
        }
        if (map instanceof w30.c) {
            return dVar.C.g(((w30.c) obj).A, b.H);
        }
        if (map instanceof w30.d) {
            return dVar.C.g(((w30.d) obj).C, b.I);
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
        return new i00.h(this, 3);
    }

    @Override
    public final Object get(Object obj) {
        a aVar = (a) this.D.get(obj);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    @Override
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        w30.d dVar = this.D;
        a aVar = (a) dVar.get(obj);
        if (aVar != null) {
            Object obj3 = aVar.a;
            if (obj3 == obj2) {
                return obj2;
            }
            dVar.put(obj, new a(obj2, aVar.b, aVar.c));
            return obj3;
        }
        boolean zIsEmpty = isEmpty();
        z30.b bVar = z30.b.a;
        if (zIsEmpty) {
            this.B = obj;
            this.C = obj;
            dVar.put(obj, new a(obj2, bVar, bVar));
            return null;
        }
        Object obj4 = this.C;
        Object obj5 = dVar.get(obj4);
        m.b(obj5);
        a aVar2 = (a) obj5;
        dVar.put(obj4, new a(aVar2.a, aVar2.b, obj));
        dVar.put(obj, new a(obj2, obj4, bVar));
        this.C = obj;
        return null;
    }

    @Override
    public final Object remove(Object obj) {
        w30.d dVar = this.D;
        a aVar = (a) dVar.remove(obj);
        if (aVar == null) {
            return null;
        }
        Object obj2 = aVar.c;
        Object obj3 = aVar.b;
        z30.b bVar = z30.b.a;
        if (obj3 != bVar) {
            Object obj4 = dVar.get(obj3);
            m.b(obj4);
            a aVar2 = (a) obj4;
            dVar.put(obj3, new a(aVar2.a, aVar2.b, obj2));
        } else {
            this.B = obj2;
        }
        if (obj2 != bVar) {
            Object obj5 = dVar.get(obj2);
            m.b(obj5);
            a aVar3 = (a) obj5;
            dVar.put(obj2, new a(aVar3.a, obj3, aVar3.c));
        } else {
            this.C = obj3;
        }
        return aVar.a;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        a aVar = (a) this.D.get(obj);
        if (aVar == null || !m.a(aVar.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
