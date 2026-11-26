package c2;

import android.view.autofill.AutofillManager;
import b2.r;
import b3.l0;
import g00.b0;
import h0.o;
import l1.g0;
import l1.m1;
import l1.q;
import u00.p;
import w.u1;
import z2.w0;

public final class b extends kotlin.jvm.internal.n implements p {
    public final int A;
    public final Object B;
    public final Object C;

    public b(Object obj, Object obj2, int i10) {
        super(4);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        switch (this.A) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                int iIntValue4 = ((Number) obj4).intValue();
                c cVar = (c) this.B;
                cVar.F.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                ((AutofillManager) cVar.A.B).requestAutofill(cVar.C, ((l0) this.C).B, cVar.F);
                break;
            default:
                u1 u1Var = (u1) obj;
                r rVar = (r) obj2;
                l1.j jVar = (l1.j) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i10 = (((g0) jVar).g(u1Var) ? 4 : 2) | iIntValue5;
                } else {
                    i10 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i10 |= ((g0) jVar).g(rVar) ? 32 : 16;
                }
                g0 g0Var = (g0) jVar;
                if (g0Var.S(i10 & 1, (i10 & 147) != 146)) {
                    r rVarV = ((r) this.B).V(rVar);
                    v1.c cVar2 = (v1.c) this.C;
                    w0 w0VarD = o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarV, jVar);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    q.I(w0VarD, jVar, b3.h.f2039f);
                    q.I(m1VarM, jVar, b3.h.f2038e);
                    q.v(jVar, Integer.valueOf(iHashCode), b3.h.f2040g);
                    q.E(jVar, b3.h.f2041h);
                    q.I(rVarC, jVar, b3.h.f2037d);
                    cVar2.invoke(u1Var, jVar, Integer.valueOf(i10 & 14));
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                break;
        }
        return b0.a;
    }
}
