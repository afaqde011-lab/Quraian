package c40;

import a40.c0;
import a40.e2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qd.s0;
import ri.t1;

public final class c implements e2 {
    public Object A = j.p;
    public a40.k B;
    public final h C;

    public c(h hVar) {
        this.C = hVar;
    }

    public final Object a(m00.c cVar) throws Throwable {
        p pVarQ;
        Object obj = this.A;
        boolean z = true;
        if (obj == j.p || obj == j.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.G;
            h hVar = this.C;
            p pVar = (p) atomicReferenceFieldUpdater.get(hVar);
            while (!hVar.x()) {
                long andIncrement = h.C.getAndIncrement(hVar);
                long j = j.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (pVar.C != j2) {
                    pVarQ = hVar.q(j2, pVar);
                    if (pVarQ == null) {
                        continue;
                    }
                } else {
                    pVarQ = pVar;
                }
                Object objI = hVar.I(pVarQ, i, andIncrement, null);
                eh.l lVar = j.m;
                if (objI == lVar) {
                    throw new IllegalStateException("unreachable");
                }
                eh.l lVar2 = j.o;
                if (objI == lVar2) {
                    if (andIncrement < hVar.u()) {
                        pVarQ.b();
                    }
                    pVar = pVarQ;
                } else {
                    if (objI == j.n) {
                        h hVar2 = this.C;
                        a40.k kVarS = c0.s(s0.j0(cVar));
                        try {
                            this.B = kVarS;
                            Object objI2 = hVar2.I(pVarQ, i, andIncrement, this);
                            if (objI2 != lVar) {
                                if (objI2 == lVar2) {
                                    if (andIncrement < hVar2.u()) {
                                        pVarQ.b();
                                    }
                                    p pVar2 = (p) h.G.get(hVar2);
                                    while (true) {
                                        if (hVar2.x()) {
                                            a40.k kVar = this.B;
                                            kotlin.jvm.internal.m.b(kVar);
                                            this.B = null;
                                            this.A = j.l;
                                            Throwable thR = hVar.r();
                                            if (thR != null) {
                                                kVar.resumeWith(t1.s(thR));
                                                break;
                                            }
                                            kVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = h.C.getAndIncrement(hVar2);
                                        long j3 = j.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (pVar2.C != j4) {
                                            p pVarQ2 = hVar2.q(j4, pVar2);
                                            if (pVarQ2 != null) {
                                                pVar2 = pVarQ2;
                                            }
                                        }
                                        Object objI3 = hVar2.I(pVar2, i2, andIncrement2, this);
                                        if (objI3 == j.m) {
                                            b(pVar2, i2);
                                            break;
                                        }
                                        if (objI3 == j.o) {
                                            if (andIncrement2 < hVar2.u()) {
                                                pVar2.b();
                                            }
                                        } else {
                                            if (objI3 == j.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            pVar2.b();
                                            this.A = objI3;
                                            this.B = null;
                                        }
                                    }
                                } else {
                                    pVarQ.b();
                                    this.A = objI2;
                                    this.B = null;
                                }
                                kVarS.e(Boolean.TRUE, null);
                                break;
                            }
                            b(pVarQ, i);
                            Object objQ = kVarS.q();
                            l00.a aVar = l00.a.A;
                            return objQ;
                        } catch (Throwable th) {
                            kVarS.B();
                            throw th;
                        }
                    }
                    pVarQ.b();
                    this.A = objI;
                }
            }
            this.A = j.l;
            Throwable thR2 = hVar.r();
            if (thR2 != null) {
                int i3 = f40.r.a;
                throw thR2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void b(f40.q qVar, int i) {
        a40.k kVar = this.B;
        if (kVar != null) {
            kVar.b(qVar, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.A;
        eh.l lVar = j.p;
        if (obj == lVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.A = lVar;
        if (obj != j.l) {
            return obj;
        }
        Throwable thS = this.C.s();
        int i = f40.r.a;
        throw thS;
    }
}
