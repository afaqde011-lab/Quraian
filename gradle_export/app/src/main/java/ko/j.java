package ko;

import a10.h0;
import kotlin.NoWhenBranchMatchedException;
import lo.p;
import lo.q;

public final class j extends h0 {
    public static lo.l X(i iVar) {
        Object iVar2;
        q qVar;
        ho.a aVar = iVar.a;
        ho.g gVar = iVar.b;
        aVar.getClass();
        boolean z = gVar.l;
        ho.j jVar = ho.j.a;
        ho.h hVar = ho.h.a;
        if (z) {
            iVar2 = hVar;
        } else {
            ho.g gVarB = aVar.b();
            iVar2 = (gVarB == null || gVar.a != gVarB.a) ? jVar : new ho.i(gVar.c());
        }
        if (iVar2.equals(hVar)) {
            qVar = lo.m.a;
        } else if (iVar2 instanceof ho.i) {
            qVar = ((ho.i) iVar2).a ? lo.n.a : lo.o.a;
        } else {
            if (!iVar2.equals(jVar)) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = p.a;
        }
        return new lo.l(gVar.a, gVar.b, gVar.f, qVar, iVar.c, iVar.d);
    }
}
