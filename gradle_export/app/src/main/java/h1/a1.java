package h1;

import bv.k1;
import com.google.android.gms.internal.measurement.x5;
import l1.p2;
import x.m1;

public final class a1 implements u00.o {
    public final p2 A;
    public final long B;
    public final m3.r0 C;
    public final u00.n D;

    public a1(m1 m1Var, long j9, m3.r0 r0Var, u00.n nVar) {
        this.A = m1Var;
        this.B = j9;
        this.C = r0Var;
        this.D = nVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b2.r rVar = (b2.r) obj;
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.g0) jVar).g(rVar) ? 4 : 2;
        }
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            p2 p2Var = this.A;
            boolean zG = g0Var.g(p2Var);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new k1(p2Var, 2);
                g0Var.n0(objN);
            }
            b2.r rVarP = i2.b0.p(rVar, (u00.k) objN);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iT = l1.q.t(jVar);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarP, jVar);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, jVar, b3.h.f2039f);
            l1.q.I(m1VarM, jVar, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT))) {
                x5.v(iT, g0Var, iT, fVar);
            }
            l1.q.I(rVarC, jVar, b3.h.f2037d);
            e1.b(this.B, this.C, this.D, jVar, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
