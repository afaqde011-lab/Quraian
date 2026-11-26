package g1;

public final class m2 implements u00.o {
    public final long A;
    public final l1.z0 B;
    public final a40.z C;
    public final j0.v D;
    public final z00.e E;
    public final h1.w F;
    public final d6 G;
    public final h1.t H;
    public final h1 I;

    public m2(long j9, l1.z0 z0Var, a40.z zVar, j0.v vVar, z00.e eVar, h1.w wVar, d6 d6Var, h1.t tVar, h1 h1Var) {
        this.A = j9;
        this.B = z0Var;
        this.C = zVar;
        this.D = vVar;
        this.E = eVar;
        this.F = wVar;
        this.G = d6Var;
        this.H = tVar;
        this.I = h1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.j jVar = (l1.j) obj2;
        ((Number) obj3).intValue();
        String strL = h1.f.l(jVar, 2131886677);
        l1.g0 g0Var = (l1.g0) jVar;
        boolean zG = g0Var.g(strL);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            objN = new b6.o(strL, 6);
            g0Var.n0(objN);
        }
        b2.o oVar = b2.o.A;
        b2.r rVarC = j3.q.c(oVar, false, (u00.k) objN);
        h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.M, jVar, 0);
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
        l1.q.I(vVarA, jVar, b3.h.f2039f);
        l1.q.I(m1VarM, jVar, b3.h.f2038e);
        b3.f fVar = b3.h.f2040g;
        if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT))) {
            com.google.android.gms.internal.measurement.x5.v(iT, g0Var, iT, fVar);
        }
        l1.q.I(rVarC2, jVar, b3.h.f2037d);
        b2.r rVarE = h0.c.E(h0.z1.h(oVar, (a3.f5709a * 7) - j3.f5845a), a3.f5711c, 0.0f, 2);
        l1.z0 z0Var = this.B;
        boolean zG2 = g0Var.g(z0Var);
        a40.z zVar = this.C;
        boolean zI = zG2 | g0Var.i(zVar);
        j0.v vVar = this.D;
        boolean zG3 = zI | g0Var.g(vVar);
        z00.e eVar = this.E;
        boolean zI2 = zG3 | g0Var.i(eVar);
        h1.w wVar = this.F;
        boolean zG4 = zI2 | g0Var.g(wVar);
        Object objN2 = g0Var.N();
        if (zG4 || objN2 == cVar) {
            a1.a aVar = new a1.a(zVar, z0Var, vVar, eVar, wVar, 3);
            g0Var.n0(aVar);
            objN2 = aVar;
        }
        long j9 = this.A;
        d6 d6Var = this.G;
        h1.t tVar = this.H;
        h1 h1Var = this.I;
        a3.n(rVarE, j9, (u00.k) objN2, d6Var, tVar, eVar, h1Var, jVar, 6);
        x5.c(null, 0.0f, h1Var.f5835x, jVar, 0, 3);
        g0Var.r(true);
        return g00.b0.a;
    }
}
