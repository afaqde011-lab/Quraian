package g1;

import kotlin.NoWhenBranchMatchedException;

public final class r4 implements u00.n {
    public final int A = 0;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final boolean F;
    public final Object G;
    public final Object H;
    public final Object I;

    public r4(m6 m6Var, u00.a aVar, a40.z zVar, boolean z10, String str, String str2, String str3, u00.n nVar) {
        this.C = m6Var;
        this.D = aVar;
        this.E = zVar;
        this.F = z10;
        this.G = str;
        this.H = str2;
        this.I = str3;
        this.B = nVar;
    }

    public r4(m3.r0 r0Var, m3.r0 r0Var2, x.m1 m1Var, x.m1 m1Var2, boolean z10, x.m1 m1Var3, u00.o oVar, h1.b1 b1Var) {
        this.C = r0Var;
        this.D = r0Var2;
        this.E = m1Var;
        this.G = m1Var2;
        this.F = z10;
        this.H = m1Var3;
        this.I = oVar;
        this.B = b1Var;
    }

    public r4(u00.n nVar, x.b bVar, m6 m6Var, u00.n nVar2, v1.c cVar, u00.a aVar, a40.z zVar, boolean z10) {
        this.B = nVar;
        this.G = bVar;
        this.C = m6Var;
        this.H = nVar2;
        this.I = cVar;
        this.D = aVar;
        this.E = zVar;
        this.F = z10;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        m3.r0 r0Var;
        Object obj3;
        x3.o bVar;
        q3.u uVar;
        q3.u uVar2;
        x3.a aVar;
        float f3;
        x3.a aVar2;
        float f10;
        x3.p pVar;
        x3.p pVar2;
        x3.p pVar3;
        i2.s0 s0Var;
        i2.s0 s0Var2;
        i2.s0 s0VarT;
        i2.s0 s0VarT2;
        m3.y yVar;
        m3.y yVar2;
        x3.q qVar;
        x3.q qVar2;
        m3.x xVar;
        m3.x xVar2;
        m3.x xVar3;
        boolean z10;
        boolean z11;
        m3.x xVar4;
        l1.p2 p2Var;
        int i10 = this.A;
        l1.c cVar = l1.i.f9868a;
        boolean z12 = this.F;
        g00.b0 b0Var = g00.b0.a;
        Object obj4 = this.B;
        Object obj5 = this.C;
        Object obj6 = this.I;
        Object obj7 = this.G;
        Object obj8 = this.H;
        Object obj9 = this.E;
        Object obj10 = this.D;
        switch (i10) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                a40.z zVar = (a40.z) obj9;
                u00.a aVar3 = (u00.a) obj10;
                m6 m6Var = (m6) obj5;
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = g0Var.g(m6Var) | g0Var.g(aVar3) | g0Var.i(zVar);
                    Object objN = g0Var.N();
                    if (zG || objN == cVar) {
                        objN = new cz.c(m6Var, aVar3, zVar);
                        g0Var.n0(objN);
                    }
                    b2.l lVar = new b2.l(new h1.x0(6, (u00.a) objN));
                    boolean zH = g0Var.h(z12) | g0Var.g(m6Var) | g0Var.g((String) obj7) | g0Var.g(aVar3) | g0Var.g((String) obj8) | g0Var.i(zVar) | g0Var.g((String) obj6);
                    String str = (String) obj7;
                    String str2 = (String) obj8;
                    String str3 = (String) obj6;
                    u00.a aVar4 = (u00.a) obj10;
                    a40.z zVar2 = (a40.z) obj9;
                    Object objN2 = g0Var.N();
                    if (zH || objN2 == cVar) {
                        objN2 = new q4(this.F, m6Var, str, str2, str3, aVar4, zVar2, 0);
                        g0Var.n0(objN2);
                    }
                    b2.r rVarC = j3.q.c(lVar, true, (u00.k) objN2);
                    u00.n nVar = (u00.n) obj4;
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
                    nVar.invoke(jVar, 0);
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                return b0Var;
            case 1:
                m6 m6Var2 = (m6) obj5;
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                final x.b bVar2 = (x.b) obj7;
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b2.r rVarL = h0.c.L(h0.z1.d(b2.o.A, 1.0f), (h0.l2) ((u00.n) obj4).invoke(jVar2, 0));
                    boolean zI = g0Var2.i(bVar2);
                    Object objN3 = g0Var2.N();
                    if (zI || objN3 == cVar) {
                        final Object[] objArr = null == true ? 1 : 0;
                        objN3 = new u00.k() {
                            public final Object invoke(Object obj11) {
                                switch (objArr) {
                                    case 0:
                                        i2.c0 c0Var = (i2.c0) obj11;
                                        float fFloatValue = ((Number) bVar2.d()).floatValue();
                                        float fD = t4.d(c0Var, fFloatValue);
                                        float fE = t4.e(c0Var, fFloatValue);
                                        c0Var.N(fE == 0.0f ? 1.0f : fD / fE);
                                        c0Var.S0(t4.f5968c);
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.e((y3.c) obj11, "$this$offset");
                                        return new y3.j((((long) w00.a.F(((Number) bVar2.d()).floatValue())) << 32) | (((long) 0) & 4294967295L));
                                    default:
                                        i2.c0 c0Var2 = (i2.c0) obj11;
                                        kotlin.jvm.internal.m.e(c0Var2, "$this$graphicsLayer");
                                        c0Var2.v(((Number) bVar2.d()).floatValue());
                                        break;
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var2.n0(objN3);
                    }
                    b2.r rVarP = i2.b0.p(i2.b0.p(rVarL, (u00.k) objN3), new q(m6Var2, 0));
                    u00.n nVar2 = (u00.n) obj8;
                    v1.c cVar2 = (v1.c) obj6;
                    u00.a aVar5 = (u00.a) obj10;
                    a40.z zVar3 = (a40.z) obj9;
                    h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.M, jVar2, 0);
                    int iT2 = l1.q.t(jVar2);
                    l1.m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC3 = b2.a.c(rVarP, jVar2);
                    b3.i.f2042c.getClass();
                    b3.g gVar2 = b3.h.f2035b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA, jVar2, b3.h.f2039f);
                    l1.q.I(m1VarM2, jVar2, b3.h.f2038e);
                    b3.f fVar2 = b3.h.f2040g;
                    if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iT2))) {
                        com.google.android.gms.internal.measurement.x5.v(iT2, g0Var2, iT2, fVar2);
                    }
                    l1.q.I(rVarC3, jVar2, b3.h.f2037d);
                    if (nVar2 != null) {
                        g0Var2.c0(1352934765);
                        j6.a(v1.d.d(2000500644, new r4(m6Var2, aVar5, zVar3, this.F, h1.f.l(jVar2, 2131886651), h1.f.l(jVar2, 2131886653), h1.f.l(jVar2, 2131886650), nVar2), jVar2), jVar2, 54);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(1356009965);
                        g0Var2.r(false);
                    }
                    cVar2.invoke(h0.w.f6474a, jVar2, 6);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            default:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (!g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g0Var3.V();
                    return b0Var;
                }
                m3.r0 r0Var2 = (m3.r0) obj5;
                m3.r0 r0Var3 = (m3.r0) obj10;
                float fFloatValue = ((Number) ((l1.p2) obj9).getValue()).floatValue();
                m3.i0 i0Var = r0Var2.f10522a;
                m3.i0 i0Var2 = r0Var3.f10522a;
                x3.o oVar = m3.j0.f10474d;
                x3.o oVar2 = i0Var.f10457a;
                x3.o oVar3 = i0Var2.f10457a;
                boolean z13 = oVar2 instanceof x3.b;
                x3.o oVar4 = x3.n.f16422a;
                if (!z13) {
                    obj3 = obj4;
                    if (!(oVar3 instanceof x3.b)) {
                        long jU = i2.b0.u(oVar2.a(), oVar3.a(), fFloatValue);
                        if (jU != 16) {
                            bVar = new x3.c(jU);
                            oVar4 = bVar;
                        }
                    }
                    x3.o oVar5 = oVar4;
                    q3.i iVar = (q3.i) m3.j0.b(i0Var.f10462f, i0Var2.f10462f, fFloatValue);
                    long jC = m3.j0.c(i0Var.f10458b, i0Var2.f10458b, fFloatValue);
                    uVar = i0Var.f10459c;
                    if (uVar == null) {
                        uVar = q3.u.J;
                    }
                    uVar2 = i0Var2.f10459c;
                    if (uVar2 == null) {
                        uVar2 = q3.u.J;
                    }
                    q3.u uVar3 = new q3.u(ab.a0.y(com.google.android.gms.internal.measurement.b5.B(fFloatValue, uVar.A, uVar2.A), 1, 1000));
                    q3.o oVar6 = (q3.o) m3.j0.b(i0Var.f10460d, i0Var2.f10460d, fFloatValue);
                    q3.p pVar4 = (q3.p) m3.j0.b(i0Var.f10461e, i0Var2.f10461e, fFloatValue);
                    String str4 = (String) m3.j0.b(i0Var.f10463g, i0Var2.f10463g, fFloatValue);
                    long jC2 = m3.j0.c(i0Var.f10464h, i0Var2.f10464h, fFloatValue);
                    aVar = i0Var.f10465i;
                    if (aVar != null) {
                        f3 = aVar.f16399a;
                    } else {
                        f3 = 0.0f;
                    }
                    aVar2 = i0Var2.f10465i;
                    if (aVar2 != null) {
                        f10 = aVar2.f16399a;
                    } else {
                        f10 = 0.0f;
                    }
                    float fA = com.google.android.gms.internal.measurement.b5.A(f3, f10, fFloatValue);
                    pVar = i0Var.f10466j;
                    pVar2 = x3.p.f16423c;
                    if (pVar == null) {
                        pVar = pVar2;
                    }
                    pVar3 = i0Var2.f10466j;
                    if (pVar3 != null) {
                        pVar2 = pVar3;
                    }
                    x3.p pVar5 = new x3.p(com.google.android.gms.internal.measurement.b5.A(pVar.f16424a, pVar2.f16424a, fFloatValue), com.google.android.gms.internal.measurement.b5.A(pVar.f16425b, pVar2.f16425b, fFloatValue));
                    t3.b bVar3 = (t3.b) m3.j0.b(i0Var.f10467k, i0Var2.f10467k, fFloatValue);
                    long jU2 = i2.b0.u(i0Var.l, i0Var2.l, fFloatValue);
                    x3.l lVar2 = (x3.l) m3.j0.b(i0Var.m, i0Var2.m, fFloatValue);
                    s0Var = i0Var.f10468n;
                    s0Var2 = i0Var2.f10468n;
                    if (s0Var != null && s0Var2 == null) {
                        obj8 = obj8;
                        s0VarT2 = null;
                    } else if (s0Var == null) {
                        kotlin.jvm.internal.m.b(s0Var2);
                        s0VarT2 = i2.b0.t(i2.s0.a(s0Var2, i2.t.b(0.0f, s0Var2.f7159a), 0.0f, 6), s0Var2, fFloatValue);
                        obj8 = obj8;
                    } else {
                        if (s0Var2 == null) {
                            s0VarT = i2.b0.t(s0Var, i2.s0.a(s0Var, i2.t.b(0.0f, s0Var.f7159a), 0.0f, 6), fFloatValue);
                        } else {
                            s0VarT = i2.b0.t(s0Var, s0Var2, fFloatValue);
                        }
                        s0VarT2 = s0VarT;
                    }
                    yVar = i0Var.f10469o;
                    m3.y yVar3 = i0Var2.f10469o;
                    if (yVar == null || yVar3 != null) {
                        if (yVar == null) {
                            yVar = m3.y.f10551a;
                        }
                        yVar2 = yVar;
                    } else {
                        yVar2 = null;
                    }
                    m3.i0 i0Var3 = new m3.i0(oVar5, jC, uVar3, oVar6, pVar4, iVar, str4, jC2, new x3.a(fA), pVar5, bVar3, jU2, lVar2, s0VarT2, yVar2, (k2.e) m3.j0.b(i0Var.f10470p, i0Var2.f10470p, fFloatValue));
                    m3.v vVar = r0Var2.f10523b;
                    m3.v vVar2 = r0Var3.f10523b;
                    int i11 = m3.w.f10547b;
                    int i12 = ((x3.k) m3.j0.b(new x3.k(vVar.f10537a), new x3.k(vVar2.f10537a), fFloatValue)).f16416a;
                    int i13 = ((x3.m) m3.j0.b(new x3.m(vVar.f10538b), new x3.m(vVar2.f10538b), fFloatValue)).f16421a;
                    long jC3 = m3.j0.c(vVar.f10539c, vVar2.f10539c, fFloatValue);
                    qVar = vVar.f10540d;
                    if (qVar == null) {
                        qVar = x3.q.f16426c;
                    }
                    qVar2 = vVar2.f10540d;
                    if (qVar2 == null) {
                        qVar2 = x3.q.f16426c;
                    }
                    x3.q qVar3 = new x3.q(m3.j0.c(qVar.f16427a, qVar2.f16427a, fFloatValue), m3.j0.c(qVar.f16428b, qVar2.f16428b, fFloatValue));
                    xVar = vVar.f10541e;
                    xVar2 = vVar2.f10541e;
                    if (xVar == null || xVar2 != null) {
                        xVar3 = m3.x.f10548c;
                        if (xVar == null) {
                            xVar = xVar3;
                        }
                        z10 = xVar.f10549a;
                        if (xVar2 == null) {
                            xVar2 = xVar3;
                        }
                        z11 = xVar2.f10549a;
                        if (z10 == z11) {
                            xVar4 = xVar;
                        } else {
                            xVar4 = new m3.x(((m3.l) m3.j0.b(new m3.l(xVar.f10550b), new m3.l(xVar2.f10550b), fFloatValue)).f10477a, ((Boolean) m3.j0.b(Boolean.valueOf(z10), Boolean.valueOf(z11), fFloatValue)).booleanValue());
                        }
                    } else {
                        xVar4 = null;
                    }
                    r0Var = new m3.r0(i0Var3, new m3.v(i12, i13, jC3, qVar3, xVar4, (x3.i) m3.j0.b(vVar.f10542f, vVar2.f10542f, fFloatValue), ((x3.e) m3.j0.b(new x3.e(vVar.f10543g), new x3.e(vVar2.f10543g), fFloatValue)).f16405a, ((x3.d) m3.j0.b(new x3.d(vVar.f10544h), new x3.d(vVar2.f10544h), fFloatValue)).f16403a, (x3.s) m3.j0.b(vVar.f10545i, vVar2.f10545i, fFloatValue)));
                    p2Var = (l1.p2) obj8;
                    if (z12) {
                        r0Var = m3.r0.a(r0Var, ((i2.t) p2Var.getValue()).f7169a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    }
                    h1.e1.b(((i2.t) ((l1.p2) obj7).getValue()).f7169a, r0Var, v1.d.d(1157484991, new w((u00.o) obj6, (h1.b1) obj3), jVar3), jVar3, 384);
                    return b0Var;
                }
                obj3 = obj4;
                if (z13 && (oVar3 instanceof x3.b)) {
                    x3.b bVar4 = (x3.b) oVar2;
                    x3.b bVar5 = (x3.b) oVar3;
                    i2.q qVar4 = (i2.q) m3.j0.b(bVar4.f16400a, bVar5.f16400a, fFloatValue);
                    float fA2 = com.google.android.gms.internal.measurement.b5.A(bVar4.f16401b, bVar5.f16401b, fFloatValue);
                    if (qVar4 != null) {
                        if (qVar4 instanceof i2.v0) {
                            long jE = kh.o.E(fA2, ((i2.v0) qVar4).f7174a);
                            if (jE != 16) {
                                bVar = new x3.c(jE);
                            }
                        } else {
                            if (!(qVar4 instanceof i2.r0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new x3.b((i2.r0) qVar4, fA2);
                        }
                        oVar4 = bVar;
                    }
                } else {
                    oVar4 = (x3.o) m3.j0.b(oVar2, oVar3, fFloatValue);
                }
                x3.o oVar7 = oVar4;
                q3.i iVar2 = (q3.i) m3.j0.b(i0Var.f10462f, i0Var2.f10462f, fFloatValue);
                long jC4 = m3.j0.c(i0Var.f10458b, i0Var2.f10458b, fFloatValue);
                uVar = i0Var.f10459c;
                if (uVar == null) {
                    uVar = q3.u.J;
                }
                uVar2 = i0Var2.f10459c;
                if (uVar2 == null) {
                    uVar2 = q3.u.J;
                }
                q3.u uVar4 = new q3.u(ab.a0.y(com.google.android.gms.internal.measurement.b5.B(fFloatValue, uVar.A, uVar2.A), 1, 1000));
                q3.o oVar8 = (q3.o) m3.j0.b(i0Var.f10460d, i0Var2.f10460d, fFloatValue);
                q3.p pVar6 = (q3.p) m3.j0.b(i0Var.f10461e, i0Var2.f10461e, fFloatValue);
                String str5 = (String) m3.j0.b(i0Var.f10463g, i0Var2.f10463g, fFloatValue);
                long jC5 = m3.j0.c(i0Var.f10464h, i0Var2.f10464h, fFloatValue);
                aVar = i0Var.f10465i;
                if (aVar != null) {
                    f3 = aVar.f16399a;
                } else {
                    f3 = 0.0f;
                }
                aVar2 = i0Var2.f10465i;
                if (aVar2 != null) {
                    f10 = aVar2.f16399a;
                } else {
                    f10 = 0.0f;
                }
                float fA3 = com.google.android.gms.internal.measurement.b5.A(f3, f10, fFloatValue);
                pVar = i0Var.f10466j;
                pVar2 = x3.p.f16423c;
                if (pVar == null) {
                    pVar = pVar2;
                }
                pVar3 = i0Var2.f10466j;
                if (pVar3 != null) {
                    pVar2 = pVar3;
                }
                x3.p pVar7 = new x3.p(com.google.android.gms.internal.measurement.b5.A(pVar.f16424a, pVar2.f16424a, fFloatValue), com.google.android.gms.internal.measurement.b5.A(pVar.f16425b, pVar2.f16425b, fFloatValue));
                t3.b bVar6 = (t3.b) m3.j0.b(i0Var.f10467k, i0Var2.f10467k, fFloatValue);
                long jU3 = i2.b0.u(i0Var.l, i0Var2.l, fFloatValue);
                x3.l lVar3 = (x3.l) m3.j0.b(i0Var.m, i0Var2.m, fFloatValue);
                s0Var = i0Var.f10468n;
                s0Var2 = i0Var2.f10468n;
                if (s0Var != null) {
                    if (s0Var == null) {
                        kotlin.jvm.internal.m.b(s0Var2);
                        s0VarT2 = i2.b0.t(i2.s0.a(s0Var2, i2.t.b(0.0f, s0Var2.f7159a), 0.0f, 6), s0Var2, fFloatValue);
                        obj8 = obj8;
                    } else {
                        if (s0Var2 == null) {
                            s0VarT = i2.b0.t(s0Var, i2.s0.a(s0Var, i2.t.b(0.0f, s0Var.f7159a), 0.0f, 6), fFloatValue);
                        } else {
                            s0VarT = i2.b0.t(s0Var, s0Var2, fFloatValue);
                        }
                        s0VarT2 = s0VarT;
                    }
                } else if (s0Var == null) {
                    kotlin.jvm.internal.m.b(s0Var2);
                    s0VarT2 = i2.b0.t(i2.s0.a(s0Var2, i2.t.b(0.0f, s0Var2.f7159a), 0.0f, 6), s0Var2, fFloatValue);
                    obj8 = obj8;
                } else {
                    if (s0Var2 == null) {
                        s0VarT = i2.b0.t(s0Var, i2.s0.a(s0Var, i2.t.b(0.0f, s0Var.f7159a), 0.0f, 6), fFloatValue);
                    } else {
                        s0VarT = i2.b0.t(s0Var, s0Var2, fFloatValue);
                    }
                    s0VarT2 = s0VarT;
                }
                yVar = i0Var.f10469o;
                m3.y yVar4 = i0Var2.f10469o;
                if (yVar == null) {
                    if (yVar == null) {
                        yVar = m3.y.f10551a;
                    }
                    yVar2 = yVar;
                } else {
                    if (yVar == null) {
                        yVar = m3.y.f10551a;
                    }
                    yVar2 = yVar;
                }
                m3.i0 i0Var4 = new m3.i0(oVar7, jC4, uVar4, oVar8, pVar6, iVar2, str5, jC5, new x3.a(fA3), pVar7, bVar6, jU3, lVar3, s0VarT2, yVar2, (k2.e) m3.j0.b(i0Var.f10470p, i0Var2.f10470p, fFloatValue));
                m3.v vVar3 = r0Var2.f10523b;
                m3.v vVar4 = r0Var3.f10523b;
                int i14 = m3.w.f10547b;
                int i15 = ((x3.k) m3.j0.b(new x3.k(vVar3.f10537a), new x3.k(vVar4.f10537a), fFloatValue)).f16416a;
                int i16 = ((x3.m) m3.j0.b(new x3.m(vVar3.f10538b), new x3.m(vVar4.f10538b), fFloatValue)).f16421a;
                long jC6 = m3.j0.c(vVar3.f10539c, vVar4.f10539c, fFloatValue);
                qVar = vVar3.f10540d;
                if (qVar == null) {
                    qVar = x3.q.f16426c;
                }
                qVar2 = vVar4.f10540d;
                if (qVar2 == null) {
                    qVar2 = x3.q.f16426c;
                }
                x3.q qVar5 = new x3.q(m3.j0.c(qVar.f16427a, qVar2.f16427a, fFloatValue), m3.j0.c(qVar.f16428b, qVar2.f16428b, fFloatValue));
                xVar = vVar3.f10541e;
                xVar2 = vVar4.f10541e;
                if (xVar == null) {
                    xVar3 = m3.x.f10548c;
                    if (xVar == null) {
                        xVar = xVar3;
                    }
                    z10 = xVar.f10549a;
                    if (xVar2 == null) {
                        xVar2 = xVar3;
                    }
                    z11 = xVar2.f10549a;
                    if (z10 == z11) {
                        xVar4 = xVar;
                    } else {
                        xVar4 = new m3.x(((m3.l) m3.j0.b(new m3.l(xVar.f10550b), new m3.l(xVar2.f10550b), fFloatValue)).f10477a, ((Boolean) m3.j0.b(Boolean.valueOf(z10), Boolean.valueOf(z11), fFloatValue)).booleanValue());
                    }
                } else {
                    xVar3 = m3.x.f10548c;
                    if (xVar == null) {
                        xVar = xVar3;
                    }
                    z10 = xVar.f10549a;
                    if (xVar2 == null) {
                        xVar2 = xVar3;
                    }
                    z11 = xVar2.f10549a;
                    if (z10 == z11) {
                        xVar4 = xVar;
                    } else {
                        xVar4 = new m3.x(((m3.l) m3.j0.b(new m3.l(xVar.f10550b), new m3.l(xVar2.f10550b), fFloatValue)).f10477a, ((Boolean) m3.j0.b(Boolean.valueOf(z10), Boolean.valueOf(z11), fFloatValue)).booleanValue());
                    }
                }
                r0Var = new m3.r0(i0Var4, new m3.v(i15, i16, jC6, qVar5, xVar4, (x3.i) m3.j0.b(vVar3.f10542f, vVar4.f10542f, fFloatValue), ((x3.e) m3.j0.b(new x3.e(vVar3.f10543g), new x3.e(vVar4.f10543g), fFloatValue)).f16405a, ((x3.d) m3.j0.b(new x3.d(vVar3.f10544h), new x3.d(vVar4.f10544h), fFloatValue)).f16403a, (x3.s) m3.j0.b(vVar3.f10545i, vVar4.f10545i, fFloatValue)));
                p2Var = (l1.p2) obj8;
                if (z12) {
                    r0Var = m3.r0.a(r0Var, ((i2.t) p2Var.getValue()).f7169a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                }
                h1.e1.b(((i2.t) ((l1.p2) obj7).getValue()).f7169a, r0Var, v1.d.d(1157484991, new w((u00.o) obj6, (h1.b1) obj3), jVar3), jVar3, 384);
                return b0Var;
        }
    }
}
