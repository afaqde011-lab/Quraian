package g1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class p6 implements u00.n {
    public final b2.r A;
    public final i2.t0 B;
    public final long C;
    public final float D;
    public final z.u E;
    public final float F;
    public final v1.c G;

    public p6(b2.r rVar, i2.t0 t0Var, long j9, float f3, z.u uVar, float f10, v1.c cVar) {
        this.A = rVar;
        this.B = t0Var;
        this.C = j9;
        this.D = f3;
        this.E = uVar;
        this.F = f10;
        this.G = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        boolean zS = g0Var.S(iIntValue & 1, (iIntValue & 3) != 2);
        g00.b0 b0Var = g00.b0.a;
        if (!zS) {
            g0Var.V();
            return b0Var;
        }
        b2.r rVarC = s6.c(this.A, this.B, s6.d(this.C, this.D, jVar), this.E, ((y3.c) g0Var.k(c3.o1.f2734h)).A0(this.F));
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (objN == cVar) {
            objN = new e6.c(27);
            g0Var.n0(objN);
        }
        b2.r rVarC2 = j3.q.c(rVarC, false, (u00.k) objN);
        Object objN2 = g0Var.N();
        if (objN2 == cVar) {
            objN2 = o6.f5896a;
            g0Var.n0(objN2);
        }
        b2.r rVarB = v2.f0.b(rVarC2, b0Var, (PointerInputEventHandler) objN2);
        z2.w0 w0VarD = h0.o.d(b2.b.A, true);
        int iT = l1.q.t(jVar);
        l1.m1 m1VarM = g0Var.m();
        b2.r rVarC3 = b2.a.c(rVarB, jVar);
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
            com.google.android.gms.internal.measurement.x5.v(iT, g0Var, iT, fVar);
        }
        l1.q.I(rVarC3, jVar, b3.h.f2037d);
        this.G.invoke(jVar, 0);
        g0Var.r(true);
        return b0Var;
    }
}
