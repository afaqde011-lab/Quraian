package i10;

import a10.w;

public final class e implements n30.a {
    public static final e A = new e();

    public static j10.e a(j10.e eVar) {
        n20.d dVarF = q20.d.f(eVar);
        String str = d.a;
        n20.c cVarH = d.h(dVarF);
        if (cVarH != null) {
            return u20.d.e(eVar).j(cVarH);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public static j10.e c(n20.c cVar, g10.i builtIns) {
        kotlin.jvm.internal.m.e(builtIns, "builtIns");
        String str = d.a;
        n20.b bVar = (n20.b) d.h.get(cVar.a);
        if (bVar != null) {
            return builtIns.j(bVar.a());
        }
        return null;
    }

    @Override
    public Iterable b(Object obj) {
        w[] wVarArr = o.h;
        return ((j10.c) obj).a().m();
    }
}
