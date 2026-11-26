package g1;

public final class q7 implements u00.o {
    public final int A = 0;
    public final boolean B;
    public final Object C;
    public final Object D;

    public q7(a7 a7Var, h hVar, boolean z10) {
        this.C = a7Var;
        this.D = hVar;
        this.B = z10;
    }

    public q7(boolean z10, bx.c cVar, gm.a aVar) {
        this.B = z10;
        this.C = cVar;
        this.D = aVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                u.v vVar = (u.v) obj;
                l1.j jVar = (l1.j) obj2;
                ((Number) obj3).intValue();
                b2.r rVarM = h0.z1.m(b2.o.A, k1.d0.f8590b);
                l1.g0 g0Var = (l1.g0) jVar;
                Object objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = new j7(2);
                    g0Var.n0(objN);
                }
                z7.a(j3.q.c(rVarM, false, (u00.k) objN), z7.f6046a, v1.d.d(-99063847, new y3((a7) this.C, vVar, (h) this.D, this.B), jVar), jVar, 432);
                break;
            default:
                pl.j jVar2 = (pl.j) obj;
                l1.j jVar3 = (l1.j) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(jVar2, "$this$SpoilerGroupContentWidget");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((l1.g0) jVar3).g(jVar2) : ((l1.g0) jVar3).i(jVar2) ? 4 : 2;
                }
                boolean z10 = (iIntValue & 19) != 18;
                l1.g0 g0Var2 = (l1.g0) jVar3;
                a30.x xVar = g0Var2.f9842a;
                if (g0Var2.S(iIntValue & 1, z10)) {
                    b2.g gVar = b2.b.N;
                    h0.f fVarG = h0.i.g(4);
                    bx.c cVar = (bx.c) this.C;
                    gm.a aVar = (gm.a) this.D;
                    h0.v vVarA = h0.u.a(fVarG, gVar, jVar3, 54);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM = g0Var2.m();
                    b2.o oVar = b2.o.A;
                    b2.r rVarC = b2.a.c(oVar, jVar3);
                    b3.i.f2042c.getClass();
                    b3.g gVar2 = b3.h.f2035b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar = b3.h.f2039f;
                    l1.q.I(vVarA, jVar3, fVar);
                    b3.f fVar2 = b3.h.f2038e;
                    l1.q.I(m1VarM, jVar3, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.f2040g;
                    l1.q.I(numValueOf, jVar3, fVar3);
                    b3.e eVar = b3.h.f2041h;
                    l1.q.E(jVar3, eVar);
                    b3.f fVar4 = b3.h.f2037d;
                    l1.q.I(rVarC, jVar3, fVar4);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM2 = g0Var2.m();
                    int i10 = iIntValue;
                    b2.r rVarC2 = b2.a.c(oVar, jVar3);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD, jVar3, fVar);
                    l1.q.I(m1VarM2, jVar3, fVar2);
                    com.google.android.gms.internal.measurement.x5.u(iHashCode2, jVar3, fVar3, jVar3, eVar);
                    l1.q.I(rVarC2, jVar3, fVar4);
                    int i11 = (i10 << 9) & 7168;
                    jVar2.a(h0.z1.m(oVar, 96), p0.f.f12243a, v1.d.d(-50370861, new d3(cVar, 1), jVar3), jVar3, 390 | i11, 0);
                    if (this.B) {
                        g0Var2.c0(-1725409460);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(-1725582440);
                        f50.c.i(h0.s.f6456a.a(oVar, b2.b.C), jVar3, 0);
                        g0Var2.r(false);
                    }
                    g0Var2.r(true);
                    jVar2.a((b2.r) null, (i2.t0) null, v1.d.d(1545945433, new w(cVar, aVar, 12), jVar3), jVar3, 384 | i11, 3);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
