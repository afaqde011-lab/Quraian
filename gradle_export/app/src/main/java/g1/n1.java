package g1;

public final class n1 implements u00.n {
    public final int A;
    public final u00.n B;
    public final v1.c C;

    public n1(u00.n nVar, v1.c cVar, int i10) {
        this.A = i10;
        this.B = nVar;
        this.C = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u00.n nVar = this.B;
                    if (nVar == null) {
                        g0Var.c0(322524505);
                    } else {
                        g0Var.c0(-266690648);
                        nVar.invoke(jVar, 0);
                    }
                    g0Var.r(false);
                    this.C.invoke(jVar, 0);
                } else {
                    g0Var.V();
                }
                break;
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e.a(q1.f5938b, q1.f5939c, v1.d.d(-1980163584, new n1(this.B, this.C, 0), jVar2), jVar2, 438);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    b2.r rVarG = h0.c.G(new h0.c1(1.0f, true), 0, 0.0f, this.B != null ? z3.f6038c : 0, 0.0f, 10);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iT = l1.q.t(jVar3);
                    l1.m1 m1VarM = g0Var3.m();
                    b2.r rVarC = b2.a.c(rVarG, jVar3);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(w0VarD, jVar3, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar3, b3.h.f2038e);
                    b3.f fVar = b3.h.f2040g;
                    if (g0Var3.S || !kotlin.jvm.internal.m.a(g0Var3.N(), Integer.valueOf(iT))) {
                        com.google.android.gms.internal.measurement.x5.v(iT, g0Var3, iT, fVar);
                    }
                    l1.q.I(rVarC, jVar3, b3.h.f2037d);
                    this.C.invoke(jVar3, 0);
                    g0Var3.r(true);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
