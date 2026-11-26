package g1;

public final class c0 implements u00.n {
    public final int A;
    public final v1.c B;

    public c0(v1.c cVar, int i10) {
        this.A = i10;
        this.B = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.M, jVar, 0);
                    int iT = l1.q.t(jVar);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(b2.o.A, jVar);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA, jVar, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar, b3.h.f2038e);
                    b3.f fVar = b3.h.f2040g;
                    if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT))) {
                        com.google.android.gms.internal.measurement.x5.v(iT, g0Var, iT, fVar);
                    }
                    l1.q.I(rVarC, jVar, b3.h.f2037d);
                    this.B.invoke(h0.w.f6474a, jVar, 6);
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z2.w0 w0VarD = h0.o.d(b2.b.G, false);
                    int iT2 = l1.q.t(jVar2);
                    l1.m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(b2.o.A, jVar2);
                    b3.i.f2042c.getClass();
                    b3.g gVar2 = b3.h.f2035b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD, jVar2, b3.h.f2039f);
                    l1.q.I(m1VarM2, jVar2, b3.h.f2038e);
                    b3.f fVar2 = b3.h.f2040g;
                    if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iT2))) {
                        com.google.android.gms.internal.measurement.x5.v(iT2, g0Var2, iT2, fVar2);
                    }
                    l1.q.I(rVarC2, jVar2, b3.h.f2037d);
                    this.B.invoke(jVar2, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
