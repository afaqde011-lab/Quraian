package g1;

public final class g8 implements u00.n {
    public final float A;
    public final long B;
    public final v1.c C;

    public g8(float f3, long j9, v1.c cVar) {
        this.A = f3;
        this.B = j9;
        this.C = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            b2.r rVarB = h0.c.B(h0.z1.p(b2.o.A, h8.f5839c, h8.f5838b, this.A, 8), h8.f5840d);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iT = l1.q.t(jVar);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarB, jVar);
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
            l1.q.b(new l1.q1[]{y0.f6028a.a(new i2.t(this.B)), z6.f6045a.a(m8.a(k1.u.f8896d, jVar))}, this.C, jVar, 8);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
