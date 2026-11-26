package c40;

import a40.e2;
import g00.b0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class d extends kotlin.jvm.internal.j implements u00.o {
    public static final d A = new d(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar;
        h hVar = (h) obj;
        i40.f fVar = (i40.f) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.B;
        hVar.getClass();
        p pVar2 = (p) h.G.get(hVar);
        while (!hVar.x()) {
            long andIncrement = h.C.getAndIncrement(hVar);
            long j = j.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (pVar2.C != j2) {
                p pVarQ = hVar.q(j2, pVar2);
                if (pVarQ == null) {
                    continue;
                } else {
                    pVar = pVarQ;
                }
            } else {
                pVar = pVar2;
            }
            Object objI = hVar.I(pVar, i, andIncrement, fVar);
            p pVar3 = pVar;
            if (objI == j.m) {
                e2 e2Var = fVar instanceof e2 ? (e2) fVar : null;
                if (e2Var != null) {
                    e2Var.b(pVar3, i);
                }
            } else if (objI == j.o) {
                if (andIncrement < hVar.u()) {
                    pVar3.b();
                }
                pVar2 = pVar3;
            } else {
                if (objI == j.n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.b();
                ((i40.e) fVar).E = objI;
            }
            return b0.a;
        }
        ((i40.e) fVar).E = j.l;
        return b0.a;
    }
}
