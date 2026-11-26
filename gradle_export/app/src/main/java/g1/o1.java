package g1;

public final class o1 implements u00.n {
    public final int A = 2;
    public final Object B;
    public final Object C;
    public final Object D;

    public o1(b2.r rVar, z.p1 p1Var, v1.c cVar) {
        this.C = rVar;
        this.D = p1Var;
        this.B = cVar;
    }

    public o1(b3 b3Var, r1 r1Var, h1 h1Var) {
        this.B = b3Var;
        this.C = r1Var;
        this.D = h1Var;
    }

    public o1(v1.c cVar, u00.n nVar, v1.c cVar2) {
        this.B = cVar;
        this.D = nVar;
        this.C = cVar2;
    }

    public o1(x.n1 n1Var, v1.c cVar, j8 j8Var) {
        this.C = n1Var;
        this.B = cVar;
        this.D = j8Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        b2.o oVar = b2.o.A;
        h0.w wVar = h0.w.f6474a;
        g00.b0 b0Var = g00.b0.a;
        Object obj3 = this.D;
        Object obj4 = this.B;
        Object obj5 = this.C;
        int i11 = 1;
        switch (i10) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                boolean z10 = (iIntValue & 3) != 2;
                l1.g0 g0Var = (l1.g0) jVar;
                a30.x xVar = g0Var.f9842a;
                if (!g0Var.S(iIntValue & 1, z10)) {
                    g0Var.V();
                } else {
                    v1.c cVar = (v1.c) obj4;
                    u00.n nVar = (u00.n) obj3;
                    v1.c cVar2 = (v1.c) obj5;
                    h0.v vVarA = h0.u.a(h0.i.f6412g, b2.b.M, jVar, 6);
                    int iT = l1.q.t(jVar);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(oVar, jVar);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    b3.f fVar = b3.h.f2039f;
                    l1.q.I(vVarA, jVar, fVar);
                    b3.f fVar2 = b3.h.f2038e;
                    l1.q.I(m1VarM, jVar, fVar2);
                    b3.f fVar3 = b3.h.f2040g;
                    if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT))) {
                        com.google.android.gms.internal.measurement.x5.v(iT, g0Var, iT, fVar3);
                    }
                    b3.f fVar4 = b3.h.f2037d;
                    l1.q.I(rVarC, jVar, fVar4);
                    wVar.getClass();
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c1 c1Var = new h0.c1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    oVar.V(c1Var);
                    b2.i iVar = b2.b.A;
                    z2.w0 w0VarD = h0.o.d(iVar, false);
                    int iT2 = l1.q.t(jVar);
                    l1.m1 m1VarM2 = g0Var.m();
                    b2.r rVarC2 = b2.a.c(c1Var, jVar);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD, jVar, fVar);
                    l1.q.I(m1VarM2, jVar, fVar2);
                    if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT2))) {
                        com.google.android.gms.internal.measurement.x5.v(iT2, g0Var, iT2, fVar3);
                    }
                    l1.q.I(rVarC2, jVar, fVar4);
                    cVar.invoke(wVar, jVar, 6);
                    g0Var.r(true);
                    b2.r rVarB = h0.c.B(new h0.m0(b2.b.O), q1.f5937a);
                    z2.w0 w0VarD2 = h0.o.d(iVar, false);
                    int iT3 = l1.q.t(jVar);
                    l1.m1 m1VarM3 = g0Var.m();
                    b2.r rVarC3 = b2.a.c(rVarB, jVar);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD2, jVar, fVar);
                    l1.q.I(m1VarM3, jVar, fVar2);
                    if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT3))) {
                        com.google.android.gms.internal.measurement.x5.v(iT3, g0Var, iT3, fVar3);
                    }
                    l1.q.I(rVarC3, jVar, fVar4);
                    h1.f.c(r0.e(k1.i.f8777a, jVar), m8.a(k1.i.f8778b, jVar), v1.d.d(-1103927529, new n1(nVar, cVar2, 1), jVar), jVar, 384);
                    g0Var.r(true);
                    g0Var.r(true);
                }
                break;
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                b3 b3Var = (b3) obj4;
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (!g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var2.V();
                } else {
                    l1.f5852a.a(b3Var.b(), b3Var.a(), (r1) obj5, h0.c.B(oVar, a3.f5713e), ((h1) obj3).f5816c, jVar2, 199680);
                }
                break;
            case 2:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (!g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g0Var3.V();
                } else {
                    b2.r rVarE = h0.c.E((b2.r) obj5, 0.0f, z3.f6039d, 1);
                    h0.x0 x0Var = h0.x0.A;
                    b2.r rVarP = z.n.p(h0.c.K(rVarE), (z.p1) obj3, false, 14);
                    v1.c cVar3 = (v1.c) obj4;
                    h0.v vVarA2 = h0.u.a(h0.i.f6408c, b2.b.M, jVar3, 0);
                    int iT4 = l1.q.t(jVar3);
                    l1.m1 m1VarM4 = g0Var3.m();
                    b2.r rVarC4 = b2.a.c(rVarP, jVar3);
                    b3.i.f2042c.getClass();
                    b3.g gVar2 = b3.h.f2035b;
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar2);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(vVarA2, jVar3, b3.h.f2039f);
                    l1.q.I(m1VarM4, jVar3, b3.h.f2038e);
                    b3.f fVar5 = b3.h.f2040g;
                    if (g0Var3.S || !kotlin.jvm.internal.m.a(g0Var3.N(), Integer.valueOf(iT4))) {
                        com.google.android.gms.internal.measurement.x5.v(iT4, g0Var3, iT4, fVar5);
                    }
                    l1.q.I(rVarC4, jVar3, b3.h.f2037d);
                    cVar3.invoke(wVar, jVar3, 6);
                    g0Var3.r(true);
                }
                break;
            default:
                l1.j jVar4 = (l1.j) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                l1.g0 g0Var4 = (l1.g0) jVar4;
                if (!g0Var4.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g0Var4.V();
                } else {
                    b2.l lVar = new b2.l(new a5((x.n1) obj5, i11));
                    v1.c cVar4 = (v1.c) obj4;
                    j8 j8Var = (j8) obj3;
                    z2.w0 w0VarD3 = h0.o.d(b2.b.A, false);
                    int iT5 = l1.q.t(jVar4);
                    l1.m1 m1VarM5 = g0Var4.m();
                    b2.r rVarC5 = b2.a.c(lVar, jVar4);
                    b3.i.f2042c.getClass();
                    b3.g gVar3 = b3.h.f2035b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar3);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(w0VarD3, jVar4, b3.h.f2039f);
                    l1.q.I(m1VarM5, jVar4, b3.h.f2038e);
                    b3.f fVar6 = b3.h.f2040g;
                    if (g0Var4.S || !kotlin.jvm.internal.m.a(g0Var4.N(), Integer.valueOf(iT5))) {
                        com.google.android.gms.internal.measurement.x5.v(iT5, g0Var4, iT5, fVar6);
                    }
                    l1.q.I(rVarC5, jVar4, b3.h.f2037d);
                    cVar4.invoke(j8Var, jVar4, 6);
                    g0Var4.r(true);
                }
                break;
        }
        return b0Var;
    }
}
