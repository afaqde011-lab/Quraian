package w0;

import a40.u1;
import l1.q;
import l1.w;
import q0.f2;
import z2.a0;

public final class j extends b3.l implements b3.j, x0.e {
    public l Q;
    public m00.i R;
    public m00.i S;
    public u00.k T;
    public u1 U;
    public final w V = q.r(new f2(this, 11));
    public h2.c W = h2.c.f6545e;

    public j(l lVar, u00.k kVar, u00.k kVar2, u00.k kVar3) {
        this.Q = lVar;
        this.R = (m00.i) kVar;
        this.S = (m00.i) kVar2;
        this.T = kVar3;
    }

    @Override
    public final long O0(a0 a0Var) {
        return W0(a0Var).e();
    }

    @Override
    public final h2.c W0(a0 a0Var) {
        h2.c cVar;
        if (this.N && (cVar = (h2.c) this.T.invoke(a0Var)) != null) {
            this.W = cVar;
            return cVar;
        }
        return this.W;
    }

    @Override
    public final t0.c i0() {
        return (t0.c) this.V.getValue();
    }

    @Override
    public final void t1() {
        l lVar = this.Q;
        lVar.f15829b = k.C;
        lVar.f15828a = this;
    }

    @Override
    public final void u1() {
        l lVar = this.Q;
        lVar.f15829b = k.B;
        lVar.f15828a = null;
    }
}
