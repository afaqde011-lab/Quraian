package h1;

import d0.q1;
import l1.i1;
import z2.l1;

public final class d0 extends b2.q implements b3.y {
    public fc.n O;
    public u00.n P;
    public q1 Q;
    public boolean R;

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        l1 l1VarO = v0Var.O(j9);
        if (!y0Var.w0() || !this.R) {
            g00.k kVar = (g00.k) this.P.invoke(new y3.l((((long) l1VarO.B) & 4294967295L) | (((long) l1VarO.A) << 32)), new y3.a(j9));
            fc.n nVar = this.O;
            n0 n0Var = (n0) kVar.A;
            Object obj = kVar.B;
            if (!kotlin.jvm.internal.m.a(nVar.g(), n0Var)) {
                ((i1) nVar.m).setValue(n0Var);
                j40.c cVar = ((j0) nVar.f5630e).f6518b;
                boolean zA = cVar.a((Object) null);
                if (zA) {
                    try {
                        j jVar = (j) nVar.f5637n;
                        float fD = nVar.g().d(obj);
                        if (!Float.isNaN(fD)) {
                            j.a(jVar, fD);
                            nVar.m(null);
                        }
                        nVar.l(obj);
                        cVar.i((Object) null);
                    } catch (Throwable th2) {
                        cVar.i((Object) null);
                        throw th2;
                    }
                }
                if (!zA) {
                    nVar.m(obj);
                }
            }
        }
        this.R = y0Var.w0() || this.R;
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new b1.l(y0Var, this, l1VarO, 17));
    }

    @Override
    public final void u1() {
        this.R = false;
    }
}
