package g1;

public final class x7 implements u00.n {
    public final int A;
    public final b8 B;
    public final int C;
    public final long D;

    public x7(int i10, b8 b8Var, int i11, long j9) {
        this.A = i10;
        this.B = b8Var;
        this.C = i11;
        this.D = j9;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zF = this.B.f();
            int i10 = this.A;
            int i11 = this.C;
            String strY = z7.y(i10, zF, i11, jVar);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iT = l1.q.t(jVar);
            l1.m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, jVar);
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
            boolean zG = g0Var.g(strY);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new b6.o(strY, 15);
                g0Var.n0(objN);
            }
            z6.b(y.a(i11, null, 14), j3.q.c(oVar, false, (u00.k) objN), this.D, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar, 0, 0, 262136);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
