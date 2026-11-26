package g1;

public final class n4 implements u00.n {
    public final long A;
    public final u00.a B;
    public final m6 C;
    public final u4 D;
    public final x.b E;
    public final a40.z F;
    public final u00.k G;
    public final b2.r H;
    public final float I;
    public final boolean J;
    public final i2.t0 K;
    public final long L;
    public final long M;
    public final float N;
    public final u00.n O;
    public final u00.n P;
    public final v1.c Q;

    public n4(long j9, u00.a aVar, m6 m6Var, u4 u4Var, x.b bVar, a40.z zVar, u00.k kVar, b2.r rVar, float f3, boolean z10, i2.t0 t0Var, long j10, long j11, float f10, u00.n nVar, u00.n nVar2, v1.c cVar) {
        this.A = j9;
        this.B = aVar;
        this.C = m6Var;
        this.D = u4Var;
        this.E = bVar;
        this.F = zVar;
        this.G = kVar;
        this.H = rVar;
        this.I = f3;
        this.J = z10;
        this.K = t0Var;
        this.L = j10;
        this.M = j11;
        this.N = f10;
        this.O = nVar;
        this.P = nVar2;
        this.Q = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            b2.r rVarM = h0.c.M(h0.z1.f6478c, h0.c.f6387f);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new e6.c(24);
                g0Var.n0(objN);
            }
            b2.r rVarC = j3.q.c(rVarM, false, (u00.k) objN);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iT = l1.q.t(jVar);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, jVar);
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
            l1.q.I(rVarC2, jVar, b3.h.f2037d);
            m6 m6Var = this.C;
            boolean z10 = ((n6) ((l1.w) m6Var.f5887d.f5633h).getValue()) != n6.A;
            boolean z11 = this.D.f6002c;
            long j9 = this.A;
            u00.a aVar = this.B;
            t4.c(j9, aVar, z10, z11, jVar, 0);
            t4.b(this.E, this.F, aVar, this.G, this.H, m6Var, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, jVar, 70);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
