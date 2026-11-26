package c40;

import a40.e2;
import g00.b0;
import kotlin.jvm.internal.a0;

public final class q extends h {
    public final a K;

    public q(int i, a aVar) {
        super(i);
        this.K = aVar;
        if (aVar != a.A) {
            if (i < 1) {
                throw new IllegalArgumentException(g4.c.i("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + a0.a.b(h.class).n() + " instead").toString());
        }
    }

    public final Object L(Object obj, boolean z) {
        a aVar = this.K;
        a aVar2 = a.C;
        b0 b0Var = b0.a;
        if (aVar == aVar2) {
            Object objJ = super.j(obj);
            return (!(objJ instanceof n) || (objJ instanceof m)) ? objJ : b0Var;
        }
        e2 e2Var = j.d;
        p pVar = (p) h.F.get(this);
        while (true) {
            long andIncrement = h.B.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zW = w(false, andIncrement);
            int i = j.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (pVar.C != j3) {
                p pVarA = h.a(this, j3, pVar);
                if (pVarA != null) {
                    pVar = pVarA;
                } else if (zW) {
                    return new m(t());
                }
            }
            int iG = h.g(this, pVar, i2, obj, j, e2Var, zW);
            if (iG == 0) {
                pVar.b();
                return b0Var;
            }
            if (iG != 1) {
                if (iG != 2) {
                    if (iG == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iG == 4) {
                        if (j < h.C.get(this)) {
                            pVar.b();
                        }
                        return new m(t());
                    }
                    if (iG == 5) {
                        pVar.b();
                    }
                } else {
                    if (zW) {
                        pVar.i();
                        return new m(t());
                    }
                    e2 e2Var2 = e2Var instanceof e2 ? e2Var : null;
                    if (e2Var2 != null) {
                        e2Var2.b(pVar, i2 + i);
                    }
                    o((pVar.C * j2) + ((long) i2));
                }
            }
            return b0Var;
        }
    }

    @Override
    public final Object j(Object obj) {
        return L(obj, false);
    }

    @Override
    public final Object m(Object obj, k00.c cVar) throws Throwable {
        if (L(obj, true) instanceof m) {
            throw t();
        }
        return b0.a;
    }

    @Override
    public final boolean z() {
        return this.K == a.B;
    }
}
