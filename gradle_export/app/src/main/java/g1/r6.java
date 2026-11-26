package g1;

public final class r6 implements u00.n {
    public final b2.r A;
    public final i2.t0 B;
    public final long C;
    public final float D;
    public final z.u E;
    public final boolean F;
    public final f0.i G;
    public final boolean H;
    public final u00.a I;
    public final float J;
    public final v1.c K;

    public r6(b2.r rVar, i2.t0 t0Var, long j9, float f3, z.u uVar, boolean z10, f0.i iVar, boolean z11, u00.a aVar, float f10, v1.c cVar) {
        this.A = rVar;
        this.B = t0Var;
        this.C = j9;
        this.D = f3;
        this.E = uVar;
        this.F = z10;
        this.G = iVar;
        this.H = z11;
        this.I = aVar;
        this.J = f10;
        this.K = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            z2.r rVar = r3.f5951a;
            b2.r rVarG = h1.f.g(o0.c.a(s6.c(this.A.V(a4.B), this.B, s6.d(this.C, this.D, jVar), this.E, ((y3.c) g0Var.k(c3.o1.f2734h)).A0(this.J)), this.F, this.G, y5.a(0.0f, 7, false), this.H, this.I));
            z2.w0 w0VarD = h0.o.d(b2.b.A, true);
            int iT = l1.q.t(jVar);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, jVar);
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
            this.K.invoke(jVar, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
