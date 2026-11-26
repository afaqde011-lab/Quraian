package b20;

import java.util.LinkedHashSet;
import java.util.List;

public final class v implements u00.a {
    public final int A;
    public final a0 B;

    public v(a0 a0Var, int i) {
        this.A = i;
        this.B = a0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                x20.f kindFilter = x20.f.m;
                x20.n.a.getClass();
                x20.k kVar = x20.k.B;
                kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
                List list = kindFilter.a;
                r10.c cVar = r10.c.D;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = kindFilter.a(x20.f.l);
                a0 a0Var = this.B;
                if (zA) {
                    for (n20.e eVar : a0Var.h(kindFilter, kVar)) {
                        kVar.invoke(eVar);
                        n30.l.a(linkedHashSet, a0Var.g(eVar, cVar));
                    }
                }
                if (kindFilter.a(x20.f.i) && !list.contains(x20.b.a)) {
                    for (n20.e eVar2 : a0Var.i(kindFilter, kVar)) {
                        kVar.invoke(eVar2);
                        linkedHashSet.addAll(a0Var.d(eVar2, cVar));
                    }
                }
                if (kindFilter.a(x20.f.j) && !list.contains(x20.b.a)) {
                    for (n20.e eVar3 : a0Var.o(kindFilter)) {
                        kVar.invoke(eVar3);
                        linkedHashSet.addAll(a0Var.e(eVar3, cVar));
                    }
                }
                return h00.q.n1(linkedHashSet);
            case 1:
                return this.B.k();
            case 2:
                return this.B.i(x20.f.p, null);
            case 3:
                return this.B.o(x20.f.q);
            default:
                return this.B.h(x20.f.o, null);
        }
    }
}
