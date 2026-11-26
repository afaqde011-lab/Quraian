package t1;

import h00.k;
import java.util.Iterator;
import kotlin.jvm.internal.m;

public final class b extends k implements q1.e {
    public static final b D;
    public final Object A;
    public final Object B;
    public final s1.c C;

    static {
        u1.b bVar = u1.b.f14920a;
        D = new b(bVar, bVar, s1.c.C);
    }

    public b(Object obj, Object obj2, s1.c cVar) {
        this.A = obj;
        this.B = obj2;
        this.C = cVar;
    }

    public final int a() {
        return this.C.e();
    }

    public final b c(Object obj) {
        s1.c cVar = this.C;
        if (cVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, cVar.i(obj, new a()));
        }
        Object obj2 = this.B;
        Object obj3 = cVar.get(obj2);
        m.b(obj3);
        return new b(this.A, obj, cVar.i(obj2, new a(((a) obj3).f14325a, obj)).i(obj, new a(obj2)));
    }

    @Override
    public final boolean contains(Object obj) {
        return this.C.containsKey(obj);
    }

    public final b e(Object obj) {
        s1.c cVarI = this.C;
        a aVar = (a) cVarI.get(obj);
        if (aVar == null) {
            return this;
        }
        Object obj2 = aVar.f14325a;
        Object obj3 = aVar.f14326b;
        s1.k kVar = cVarI.A;
        s1.k kVarV = kVar.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (kVar != kVarV) {
            cVarI = kVarV == null ? s1.c.C : new s1.c(kVarV, cVarI.B - 1);
        }
        u1.b bVar = u1.b.f14920a;
        if (obj2 != bVar) {
            Object obj4 = cVarI.get(obj2);
            m.b(obj4);
            cVarI = cVarI.i(obj2, new a(((a) obj4).f14325a, obj3));
        }
        if (obj3 != bVar) {
            Object obj5 = cVarI.get(obj3);
            m.b(obj5);
            cVarI = cVarI.i(obj3, new a(obj2, ((a) obj5).f14326b));
        }
        Object obj6 = obj2 != bVar ? this.A : obj3;
        if (obj3 != bVar) {
            obj2 = this.B;
        }
        return new b(obj6, obj2, cVarI);
    }

    @Override
    public final Iterator iterator() {
        return new d(this.A, this.C, 0);
    }
}
