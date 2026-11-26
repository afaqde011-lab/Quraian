package y30;

import h00.j;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.m;
import u30.g;

public final class d extends j implements g {
    public c A;
    public Object B;
    public Object C;
    public final w30.d D;

    public d(c set) {
        m.e(set, "set");
        this.A = set;
        this.B = set.A;
        this.C = set.B;
        w30.c cVar = set.C;
        cVar.getClass();
        this.D = new w30.d(cVar);
    }

    @Override
    public final int a() {
        return this.D.e();
    }

    @Override
    public final boolean add(Object obj) {
        w30.d dVar = this.D;
        if (dVar.containsKey(obj)) {
            return false;
        }
        boolean zIsEmpty = isEmpty();
        z30.b bVar = z30.b.a;
        if (zIsEmpty) {
            this.B = obj;
            this.C = obj;
            dVar.put(obj, new a(bVar, bVar));
            return true;
        }
        Object obj2 = dVar.get(this.C);
        m.b(obj2);
        dVar.put(this.C, new a(((a) obj2).a, obj));
        dVar.put(obj, new a(this.C, bVar));
        this.C = obj;
        return true;
    }

    public final c c() {
        w30.c cVarBuild = this.D.build();
        c cVar = this.A;
        if (cVarBuild != cVar.C) {
            cVar = new c(this.B, this.C, cVarBuild);
        }
        this.A = cVar;
        return cVar;
    }

    @Override
    public final void clear() {
        this.D.clear();
        z30.b bVar = z30.b.a;
        this.B = bVar;
        this.C = bVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.D.containsKey(obj);
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
        w30.d dVar = this.D;
        if (z) {
            return dVar.C.g(((c) obj).C.A, b.D);
        }
        return set instanceof d ? dVar.C.g(((d) obj).D.C, b.E) : super.equals(obj);
    }

    @Override
    public final Iterator iterator() {
        return new e(this);
    }

    @Override
    public final boolean remove(Object obj) {
        w30.d dVar = this.D;
        a aVar = (a) dVar.remove(obj);
        if (aVar == null) {
            return false;
        }
        Object obj2 = aVar.b;
        Object obj3 = aVar.a;
        z30.b bVar = z30.b.a;
        if (obj3 != bVar) {
            Object obj4 = dVar.get(obj3);
            m.b(obj4);
            dVar.put(obj3, new a(((a) obj4).a, obj2));
        } else {
            this.B = obj2;
        }
        if (obj2 == bVar) {
            this.C = obj3;
            return true;
        }
        Object obj5 = dVar.get(obj2);
        m.b(obj5);
        dVar.put(obj2, new a(obj3, ((a) obj5).b));
        return true;
    }
}
