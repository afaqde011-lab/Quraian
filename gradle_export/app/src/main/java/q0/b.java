package q0;

public final class b implements u00.n {
    public final int A = 0;
    public final long B;
    public final b2.r C;

    public b(long j9, b2.r rVar) {
        this.B = j9;
        this.C = rVar;
    }

    public b(long j9, b2.r rVar, int i10) {
        this.B = j9;
        this.C = rVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j9 = this.B;
                    b2.r rVar = this.C;
                    if (j9 != 9205357640488583168L) {
                        g0Var.c0(-1244013944);
                        b2.r rVarK = h0.z1.k(rVar, y3.h.b(j9), y3.h.a(j9), 0.0f, 0.0f, 12);
                        z2.w0 w0VarD = h0.o.d(b2.b.B, false);
                        int iHashCode = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM = g0Var.m();
                        b2.r rVarC = b2.a.c(rVarK, jVar);
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
                        l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2040g);
                        l1.q.E(jVar, b3.h.f2041h);
                        l1.q.I(rVarC, jVar, b3.h.f2037d);
                        c.b(null, jVar, 0, 1);
                        g0Var.r(true);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(-1243644858);
                        c.b(rVar, jVar, 0, 0);
                        g0Var.r(false);
                    }
                } else {
                    g0Var.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a10.h0.e(this.B, this.C, (l1.j) obj, l1.q.K(49));
                break;
        }
        return g00.b0.a;
    }
}
