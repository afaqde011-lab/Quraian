package gv;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

public final class j0 implements u00.n {
    public final int A;
    public final bv.o1 B;
    public final u00.k C;

    public j0(bv.o1 o1Var, u00.k kVar, int i) {
        this.A = 4;
        this.B = o1Var;
        this.C = kVar;
    }

    public j0(bv.o1 o1Var, u00.k kVar, int i, byte b) {
        this.A = i;
        this.B = o1Var;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM = g0Var2.m();
                    b2.o oVar = b2.o.A;
                    b2.r rVarC = b2.a.c(oVar, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    h0.c.h(h0.z1.e(oVar, 38), g0Var);
                    p.h(this.B, this.C, null, g0Var, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                l1.g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bv.o1 o1Var = this.B;
                    if (o1Var.v) {
                        g0Var4.c0(-1264001400);
                        jv.a.d(o1Var, this.C, g0Var3, 0);
                        g0Var4.r(false);
                    } else {
                        g0Var4.c0(-1263855328);
                        g0Var4.r(false);
                    }
                } else {
                    g0Var4.V();
                }
                break;
            case 2:
                l1.g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bv.o1 o1Var2 = this.B;
                    p.t(o1Var2.v, null, null, null, v1.d.d(1301887358, new h0(o1Var2, this.C, 1), g0Var5), g0Var5, 24576, 14);
                } else {
                    g0Var6.V();
                }
                break;
            case 3:
                l1.g0 g0Var7 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    b2.r rVarC2 = h0.z1.c(h0.z1.f(h0.z1.r(h0.c.E(b2.o.A, 0.0f, 44, 1), 500, 550), RCHTTPStatusCodes.BAD_REQUEST, 650), 1.0f);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode2 = Long.hashCode(g0Var8.T);
                    l1.m1 m1VarM2 = g0Var8.m();
                    b2.r rVarC3 = b2.a.c(rVarC2, g0Var7);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var8.g0();
                    if (g0Var8.S) {
                        g0Var8.l(gVar2);
                    } else {
                        g0Var8.q0();
                    }
                    l1.q.I(w0VarD, g0Var7, b3.h.f);
                    l1.q.I(m1VarM2, g0Var7, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var7, b3.h.g);
                    l1.q.E(g0Var7, b3.h.h);
                    l1.q.I(rVarC3, g0Var7, b3.h.d);
                    jv.a.b(this.B, this.C, h0.z1.c, g0Var7, 384);
                    g0Var8.r(true);
                } else {
                    g0Var8.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jv.a.d(this.B, this.C, (l1.j) obj, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
