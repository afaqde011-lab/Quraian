package c4;

import l1.g0;
import l1.m1;
import l1.z0;
import z2.w0;

public final class m extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final z B;
    public final z0 C;

    public m(z zVar, z0 z0Var, int i10) {
        super(2);
        this.A = i10;
        this.B = zVar;
        this.C = z0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        z0 z0Var = this.C;
        z zVar = this.B;
        int i11 = 0;
        switch (i10) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (g0) jVar;
                if (!g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.V();
                } else {
                    Object objN = g0Var.N();
                    l1.c cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = b.E;
                        g0Var.n0(objN);
                    }
                    b2.r rVarC = j3.q.c(b2.o.A, false, (u00.k) objN);
                    boolean zI = g0Var.i(zVar);
                    Object objN2 = g0Var.N();
                    if (zI || objN2 == cVar) {
                        objN2 = new j(zVar, 1);
                        g0Var.n0(objN2);
                    }
                    b2.r rVarA = f2.h.a(z2.d0.o(rVarC, (u00.k) objN2), zVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    l1.t tVar = n.f2838a;
                    u00.n nVar = (u00.n) z0Var.getValue();
                    Object objN3 = g0Var.N();
                    if (objN3 == cVar) {
                        objN3 = e.f2833c;
                        g0Var.n0(objN3);
                    }
                    w0 w0Var = (w0) objN3;
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    b2.r rVarC2 = b2.a.c(rVarA, jVar);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0Var, jVar, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2040g);
                    l1.q.E(jVar, b3.h.f2041h);
                    l1.q.I(rVarC2, jVar, b3.h.f2037d);
                    nVar.invoke(jVar, 0);
                    g0Var.r(true);
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                g0 g0Var2 = (g0) jVar2;
                if (!g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var2.V();
                } else {
                    l1.q.a(n.f2839b.a(Boolean.TRUE), v1.d.d(1022273628, new m(zVar, z0Var, i11), jVar2), jVar2, 56);
                }
                break;
        }
        return b0Var;
    }
}
