package qo;

import android.content.Context;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import d0.o2;
import g00.b0;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import l1.g0;
import l1.m1;
import l1.z0;
import z2.d0;
import z2.w0;

public final class s implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public s(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A = i2;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public s(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                z.b((t) this.B, (j0.v) this.C, (u00.k) this.D, (l1.j) obj, l1.q.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bi.b.b((hp.b) this.B, (rp.o) this.C, (AuthAnalytics) this.D, (l1.j) obj, l1.q.K(1));
                break;
            case 2:
                b2.r rVar = (b2.r) this.B;
                z0 z0Var = (z0) this.C;
                v1.c cVar = (v1.c) this.D;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objN = g0Var2.N();
                    if (objN == l1.i.a) {
                        objN = new o2(z0Var, 26);
                        g0Var2.n0(objN);
                    }
                    b2.r rVarN = d0.n(rVar, (u00.k) objN);
                    w0 w0VarD = h0.o.d(b2.b.A, true);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(rVarN, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    cVar.invoke(g0Var, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 3:
                u30.b bVar = (u30.b) this.B;
                Context context = (Context) this.C;
                String str = (String) this.D;
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b2.r rVarD = z1.d(b2.o.A, 1.0f);
                    v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var3, 54);
                    int iHashCode2 = Long.hashCode(g0Var4.T);
                    m1 m1VarM2 = g0Var4.m();
                    b2.r rVarC2 = b2.a.c(rVarD, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(v1VarA, g0Var3, b3.h.f);
                    l1.q.I(m1VarM2, g0Var3, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var3, b3.h.g);
                    l1.q.E(g0Var3, b3.h.h);
                    l1.q.I(rVarC2, g0Var3, b3.h.d);
                    yr.a.f(bVar, context, g0Var3, 0);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    k00.f.a(str, new c1(1.0f, true), dl.a.i, kh.o.z(15), null, null, null, 1, 0.8f, null, g0Var3, 113249280, 624);
                    g0Var4.r(true);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 4:
                ((Integer) obj2).getClass();
                yy.b.a((String) this.B, (String) this.C, (u00.a) this.D, (l1.j) obj, l1.q.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                yy.d.b((String) this.B, (String) this.C, (String) this.D, (l1.j) obj, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
