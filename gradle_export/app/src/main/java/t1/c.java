package t1;

import h00.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;

public final class c extends j implements Collection, v00.b {
    public b A;
    public Object B;
    public Object C;
    public final s1.e D;

    public c(b bVar) {
        this.A = bVar;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C.h();
    }

    public final int a() {
        return this.D.e();
    }

    @Override
    public final boolean add(Object obj) {
        s1.e eVar = this.D;
        if (eVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.B = obj;
            this.C = obj;
            eVar.put(obj, new a());
            return true;
        }
        Object obj2 = eVar.get(this.C);
        m.b(obj2);
        eVar.put(this.C, new a(((a) obj2).f14325a, obj));
        eVar.put(obj, new a(this.C));
        this.C = obj;
        return true;
    }

    public final b c() {
        s1.c cVarBuild = this.D.build();
        b bVar = this.A;
        if (cVarBuild != bVar.C) {
            bVar = new b(this.B, this.C, cVarBuild);
        }
        this.A = bVar;
        return bVar;
    }

    @Override
    public final void clear() {
        this.D.clear();
        u1.b bVar = u1.b.f14920a;
        this.B = bVar;
        this.C = bVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.D.containsKey(obj);
    }

    @Override
    public final Iterator iterator() {
        return new e(this);
    }

    @Override
    public final boolean remove(Object obj) {
        s1.e eVar = this.D;
        a aVar = (a) eVar.remove(obj);
        if (aVar == null) {
            return false;
        }
        Object obj2 = aVar.f14326b;
        Object obj3 = aVar.f14325a;
        u1.b bVar = u1.b.f14920a;
        if (obj3 != bVar) {
            Object obj4 = eVar.get(obj3);
            m.b(obj4);
            eVar.put(obj3, new a(((a) obj4).f14325a, obj2));
        } else {
            this.B = obj2;
        }
        if (obj2 == bVar) {
            this.C = obj3;
            return true;
        }
        Object obj5 = eVar.get(obj2);
        m.b(obj5);
        eVar.put(obj2, new a(obj3, ((a) obj5).f14326b));
        return true;
    }
}
