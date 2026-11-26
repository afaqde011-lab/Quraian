package z;

import b3.e2;

public final class p0 extends b2.q implements e2 {
    public f0.i O;
    public f0.f P;

    public static final Object B1(p0 p0Var, m00.c cVar) {
        m0 m0Var;
        f0.f fVar;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i10 = m0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(p0Var, cVar);
            }
        } else {
            m0Var = new m0(p0Var, cVar);
        }
        Object obj = m0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = m0Var.D;
        if (i11 == 0) {
            ri.t1.O(obj);
            if (p0Var.P == null) {
                f0.f fVar2 = new f0.f();
                f0.i iVar = p0Var.O;
                m0Var.A = fVar2;
                m0Var.D = 1;
                if (iVar.a(fVar2, m0Var) == aVar) {
                    return aVar;
                }
                fVar = fVar2;
            }
            return g00.b0.a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = m0Var.A;
        ri.t1.O(obj);
        p0Var.P = fVar;
        return g00.b0.a;
    }

    public static final Object C1(p0 p0Var, m00.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i10 = n0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(p0Var, cVar);
            }
        } else {
            n0Var = new n0(p0Var, cVar);
        }
        Object obj = n0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = n0Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            f0.f fVar = p0Var.P;
            if (fVar != null) {
                f0.g gVar = new f0.g(fVar);
                f0.i iVar = p0Var.O;
                n0Var.C = 1;
                if (iVar.a(gVar, n0Var) == aVar) {
                    return aVar;
                }
            }
            return g00.b0.a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(obj);
        p0Var.P = null;
        return g00.b0.a;
    }

    @Override
    public final void A(v2.k kVar, v2.l lVar, long j9) {
        if (lVar == v2.l.B) {
            int i10 = kVar.f15392f;
            k00.c cVar = null;
            if (i10 == 4) {
                a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new o0(this, cVar, 0), 3);
            } else if (i10 == 5) {
                a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new o0(this, cVar, 1), 3);
            }
        }
    }

    public final void D1() {
        f0.f fVar = this.P;
        if (fVar != null) {
            this.O.b(new f0.g(fVar));
            this.P = null;
        }
    }

    @Override
    public final void X() {
        D1();
    }

    @Override
    public final void u1() {
        D1();
    }
}
