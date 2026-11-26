package g1;

public abstract class s6 {

    public static final l1.t f5961a = new l1.t((u00.a) new e00.g(25));

    public static final void a(b2.r rVar, i2.t0 t0Var, long j9, long j10, float f3, float f10, z.u uVar, v1.c cVar, l1.j jVar, int i10, int i11) {
        long jB = (i11 & 8) != 0 ? r0.b(j9, jVar) : j10;
        float f11 = (i11 & 16) != 0 ? 0 : f3;
        float f12 = (i11 & 32) != 0 ? 0 : f10;
        z.u uVar2 = (i11 & 64) != 0 ? null : uVar;
        l1.t tVar = f5961a;
        float f13 = ((y3.f) ((l1.g0) jVar).k(tVar)).A + f11;
        l1.q.b(new l1.q1[]{y0.f6028a.a(new i2.t(jB)), tVar.a(new y3.f(f13))}, v1.d.d(421772006, new p6(rVar, t0Var, j9, f13, uVar2, f12, cVar), jVar), jVar, 56);
    }

    public static final void b(boolean z10, u00.a aVar, b2.r rVar, boolean z11, i2.t0 t0Var, long j9, z.u uVar, v1.c cVar, l1.j jVar, int i10, int i11) {
        boolean z12 = (i11 & 8) != 0 ? true : z11;
        long jB = r0.b(j9, jVar);
        float f3 = 0;
        float f10 = 0;
        z.u uVar2 = (i11 & 512) != 0 ? null : uVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.c0(1528143336);
        Object objN = g0Var.N();
        if (objN == l1.i.f9868a) {
            objN = w.c.g(g0Var);
        }
        f0.i iVar = (f0.i) objN;
        g0Var.r(false);
        l1.t tVar = f5961a;
        float f11 = ((y3.f) ((l1.g0) jVar).k(tVar)).A + f3;
        l1.q.b(new l1.q1[]{y0.f6028a.a(new i2.t(jB)), tVar.a(new y3.f(f11))}, v1.d.d(1508735219, new r6(rVar, t0Var, j9, f11, uVar2, z10, iVar, z12, aVar, f10, cVar), jVar), jVar, 56);
    }

    public static final b2.r c(b2.r rVar, i2.t0 t0Var, long j9, z.u uVar, float f3) {
        i2.t0 t0Var2;
        b2.r rVarQ;
        b2.r tVar = b2.o.A;
        if (f3 > 0.0f) {
            t0Var2 = t0Var;
            rVarQ = i2.b0.q(tVar, 0.0f, 0.0f, 0.0f, f3, t0Var2, 124895);
        } else {
            t0Var2 = t0Var;
            rVarQ = tVar;
        }
        b2.r rVarV = rVar.V(rVarQ);
        if (uVar != null) {
            tVar = new z.t(uVar.f16965a, uVar.f16966b, t0Var2);
        }
        return f2.h.c(z.n.f(rVarV.V(tVar), j9, t0Var2), t0Var2);
    }

    public static final long d(long j9, float f3, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        q0 q0Var = (q0) g0Var.k(r0.f5948a);
        boolean zBooleanValue = ((Boolean) g0Var.k(r0.f5949b)).booleanValue();
        long j10 = q0Var.f5926p;
        if (i2.t.c(j9, j10) && zBooleanValue) {
            return y3.f.b(f3, (float) 0) ? j10 : i2.b0.k(i2.t.b(((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f, q0Var.f5930t), j10);
        }
        return j9;
    }
}
