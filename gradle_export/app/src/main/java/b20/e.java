package b20;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public final class e implements u00.a {
    public final int A;
    public final f B;

    public e(f fVar, int i) {
        this.A = i;
        this.B = fVar;
    }

    @Override
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        switch (this.A) {
            case 0:
                return p10.d.a(k00.f.D(k00.f.z(this.B.b.a))).a();
            case 1:
                f fVar = this.B;
                n20.c cVarA = fVar.a();
                p10.e eVar = fVar.b;
                oj.q qVar = fVar.a;
                if (cVarA == null) {
                    return g30.l.c(g30.k.e0, eVar.toString());
                }
                a20.b bVar = (a20.b) qVar.B;
                j10.z zVar = bVar.o;
                j10.e eVarC = i10.e.c(cVarA, zVar.d());
                if (eVarC == null) {
                    p10.o oVar = new p10.o(k00.f.D(k00.f.z(eVar.a)));
                    qj.c cVar = bVar.k;
                    cVar.getClass();
                    o9.q qVar2 = (o9.q) cVar.B;
                    if (qVar2 == null) {
                        kotlin.jvm.internal.m.k("resolver");
                        throw null;
                    }
                    eVarC = qVar2.S(oVar);
                    if (eVarC == null) {
                        eVarC = j10.w.f(zVar, new n20.b(cVarA.b(), cVarA.a.g()), bVar.d.c().l);
                    }
                }
                return eVarC.n();
            default:
                f fVar2 = this.B;
                ArrayList<e20.a> arrayListB = fVar2.b.b();
                ArrayList arrayList = new ArrayList();
                for (e20.a aVar : arrayListB) {
                    n20.e eVar2 = ((p10.f) aVar).a;
                    if (eVar2 == null) {
                        eVar2 = x10.v.b;
                    }
                    s20.g gVarC = fVar2.c(aVar);
                    g00.k kVar = gVarC != null ? new g00.k(eVar2, gVarC) : null;
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                }
                return h00.d0.Y(arrayList);
        }
    }
}
