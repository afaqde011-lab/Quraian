package g1;

public final class d3 implements u00.n {
    public final int A;
    public final Object B;

    public d3(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                oj.q qVar = (oj.q) this.B;
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strL = h1.f.l(jVar, 2131886686);
                    b2.r rVarP = h0.z1.p((b2.r) qVar.C, e.f5760a, 0.0f, e.f5761b, 10);
                    boolean zG = g0Var.g(strL);
                    Object objN = g0Var.N();
                    if (zG || objN == l1.i.f9868a) {
                        objN = new b6.o(strL, 8);
                        g0Var.n0(objN);
                    }
                    b2.r rVarV = rVarP.V(j3.q.c(b2.o.A, false, (u00.k) objN));
                    z2.w0 w0VarD = h0.o.d(b2.b.A, true);
                    int iT = l1.q.t(jVar);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(rVarV, jVar);
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
                    ((v1.c) qVar.E).invoke(jVar, 0);
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
                    yr.a.i((bx.c) this.B, 96, kh.o.z(21), jVar2, 440);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
