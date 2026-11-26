package g1;

public final class i2 implements u00.n {
    public final int A;
    public final u00.n B;

    public i2(int i10, u00.n nVar) {
        this.A = i10;
        this.B = nVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c1 c1Var = new h0.c1(1.0f, true);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iT = l1.q.t(jVar);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(c1Var, jVar);
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
                    l1.q.I(rVarC, jVar, b3.h.f2037d);
                    this.B.invoke(jVar, 0);
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
                    b2.r rVarB = h0.z1.b(k1.o.f8839j, 0.0f, 2);
                    z2.w0 w0VarD2 = h0.o.d(b2.b.A, false);
                    int iT2 = l1.q.t(jVar2);
                    l1.m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(rVarB, jVar2);
                    b3.i.f2042c.getClass();
                    b3.g gVar2 = b3.h.f2035b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD2, jVar2, b3.h.f2039f);
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
