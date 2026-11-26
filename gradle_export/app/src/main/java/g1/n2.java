package g1;

public final class n2 implements u00.n {
    public final int A;
    public final String B;
    public final h1 C;
    public final boolean D;
    public final boolean E;
    public final boolean F;

    public n2(String str, h1 h1Var, boolean z10, boolean z11, boolean z12, int i10) {
        this.A = i10;
        this.B = str;
        this.C = h1Var;
        this.D = z10;
        this.E = z11;
        this.F = z12;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j9;
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f3 = k1.h.f8746g;
                    float f10 = k1.h.f8744e;
                    b2.o oVar = b2.o.A;
                    b2.r rVarJ = h0.z1.j(oVar, f3, f10);
                    z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iT = l1.q.t(jVar);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(rVarJ, jVar);
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
                    Object objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = new e6.c(18);
                        g0Var.n0(objN);
                    }
                    b2.r rVarB = j3.q.b(oVar, (u00.k) objN);
                    h1 h1Var = this.C;
                    long j10 = h1Var.f5826o;
                    boolean z10 = this.E;
                    boolean z11 = this.F;
                    if (z10 && z11) {
                        j10 = h1Var.f5827p;
                    } else if (z10 && !z11) {
                        j10 = h1Var.f5828q;
                    } else if (this.D && z11) {
                        j10 = h1Var.f5831t;
                    } else if (z11) {
                        j10 = h1Var.f5825n;
                    }
                    long j11 = j10;
                    g0Var.c0(-969417610);
                    l1.p2 p2VarA = w.b2.a(j11, x5.p(k1.q.C, jVar), null, jVar, 0, 12);
                    g0Var.r(false);
                    z6.b(this.B, rVarB, ((i2.t) p2VarA.getValue()).f7169a, 0L, null, null, 0L, null, new x3.k(3), 0L, 0, false, 0, 0, null, null, jVar, 0, 0, 261112);
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
                    b2.o oVar2 = b2.o.A;
                    b2.r rVarD = h0.z1.d(oVar2, 1.0f);
                    z2.w0 w0VarD2 = h0.o.d(b2.b.E, false);
                    int iT2 = l1.q.t(jVar2);
                    l1.m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(rVarD, jVar2);
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
                    Object objN2 = g0Var2.N();
                    if (objN2 == l1.i.f9868a) {
                        objN2 = new e6.c(18);
                        g0Var2.n0(objN2);
                    }
                    b2.r rVarB2 = j3.q.b(oVar2, (u00.k) objN2);
                    h1 h1Var2 = this.C;
                    boolean z12 = this.E;
                    boolean z13 = this.F;
                    if (z12 && z13) {
                        j9 = h1Var2.f5823j;
                    } else if (z12 && !z13) {
                        j9 = h1Var2.f5824k;
                    } else if (this.D && z13) {
                        j9 = h1Var2.f5822i;
                    } else {
                        j9 = z13 ? h1Var2.f5820g : h1Var2.f5821h;
                    }
                    z6.b(this.B, rVarB2, ((i2.t) w.b2.a(j9, x5.p(k1.q.C, jVar2), null, jVar2, 0, 12).getValue()).f7169a, 0L, null, null, 0L, null, new x3.k(3), 0L, 0, false, 0, 0, null, null, jVar2, 0, 0, 261112);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
