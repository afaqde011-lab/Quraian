package gv;

import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.Constants;
import g1.z6;

public final class a implements u00.o {
    public final int A;
    public final int B;
    public final int C;

    public a(int i, int i2, int i3) {
        this.A = i3;
        this.B = i;
        this.C = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                h0.w1 LiquidButton = (h0.w1) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton, "$this$LiquidButton");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.o oVar = b2.o.A;
                    b2.r rVarE = h0.c.E(f2.h.c(h0.z1.e(oVar, 36), p0.f.a(24)), 12, 0.0f, 2);
                    h0.v1 v1VarA = h0.t1.a(h0.i.g(5), b2.b.K, g0Var, 54);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(rVarE, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(v1VarA, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    b2.r rVarM = h0.z1.m(oVar, 18);
                    m2.b bVarR = y3.R(2131231074, g0Var, 0);
                    long j = dl.a.k;
                    z3.j(bVarR, (String) null, rVarM, j, g0Var, 440, 0);
                    z6.b(this.B + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.C, (b2.r) null, j, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, dl.c.h, g0Var, 0, 0, 131066);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var3.h(zBooleanValue) ? 4 : 2;
                }
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    z.n.c(y3.R(zBooleanValue ? this.B : this.C, g0Var3, 0), (String) null, h0.z1.c, (b2.d) null, z2.o.b, 0.0f, g0Var3, 25016, 104);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
