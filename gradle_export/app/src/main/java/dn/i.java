package dn;

import b2.o;
import b2.r;
import com.google.android.gms.internal.measurement.y3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g00.b0;
import gv.c0;
import gv.p;
import h0.z1;
import i2.o0;
import i2.t;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import u00.n;
import z2.w0;

public final class i implements n {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;

    public i(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.B = z;
        this.C = obj;
        this.D = obj2;
    }

    public i(u30.f fVar, r rVar, boolean z, int i) {
        this.A = 4;
        this.C = fVar;
        this.D = rVar;
        this.B = z;
    }

    public i(yu.a aVar, boolean z, iv.m mVar) {
        this.A = 2;
        this.C = aVar;
        this.B = z;
        this.D = mVar;
    }

    public i(boolean z, e6.d dVar, b6.m mVar, int i) {
        this.A = 0;
        this.B = z;
        this.C = dVar;
        this.D = mVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        r rVarG;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                kh.n.u(this.B, (e6.d) this.C, (b6.m) this.D, (l1.j) obj, q.K(1));
                break;
            case 1:
                u00.k kVar = (u00.k) this.C;
                p2 p2Var = (p2) this.D;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m2.b bVarR = y3.R(2131231396, g0Var, 0);
                    long jB = t.b(((Number) p2Var.getValue()).floatValue(), dl.a.i);
                    float f = c0.a;
                    float f2 = c0.b;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new fy.r(18, kVar);
                        g0Var2.n0(objN);
                    }
                    p.i(bVarR, jB, this.B, (u00.a) objN, null, false, f, f2, 0L, g0Var, 14155784, RCHTTPStatusCodes.NOT_MODIFIED);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 2:
                yu.a aVar = (yu.a) this.C;
                iv.m mVar = (iv.m) this.D;
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    iv.a.e(aVar, this.B, mVar, h0.c.C(z.n.f(f2.h.c(z1.q(o.A, iv.n.a), p0.f.a(32)), dl.a.q, i2.b0.b), 24), false, g0Var3, 0, 16);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 3:
                bx.c cVar = (bx.c) this.C;
                u00.a aVar2 = (u00.a) this.D;
                g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o0 o0Var = i2.b0.b;
                    if (this.B) {
                        rVarG = z.n.f(z1.c, dl.a.L, o0Var);
                    } else {
                        float f3 = 32;
                        rVarG = z.n.g(z.n.f(f2.h.c(z1.r(h0.c.E(o.A, 0.0f, 44, 1), 500, 550), p0.f.a(f3)), dl.a.L, o0Var), 1, dl.a.Y, p0.f.a(f3));
                    }
                    w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var6.T);
                    m1 m1VarM = g0Var6.m();
                    r rVarC = b2.a.c(rVarG, g0Var5);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var6.g0();
                    if (g0Var6.S) {
                        g0Var6.l(gVar);
                    } else {
                        g0Var6.q0();
                    }
                    q.I(w0VarD, g0Var5, b3.h.f);
                    q.I(m1VarM, g0Var5, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var5, b3.h.g);
                    q.E(g0Var5, b3.h.h);
                    q.I(rVarC, g0Var5, b3.h.d);
                    mx.a.a(cVar, aVar2, g0Var5, 8);
                    g0Var6.r(true);
                } else {
                    g0Var6.V();
                }
                return b0.a;
            default:
                ((Integer) obj2).getClass();
                y3.h((u30.f) this.C, (r) this.D, this.B, (l1.j) obj, q.K(49));
                break;
        }
        return b0.a;
    }
}
