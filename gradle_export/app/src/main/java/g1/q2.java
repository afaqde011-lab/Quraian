package g1;

import com.google.android.gms.cast.MediaError;
import java.time.Instant;
import java.util.List;

public final class q2 implements u00.p {
    public final int A;
    public final u00.k B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public q2(Object obj, Object obj2, u00.k kVar, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.A = i10;
        this.C = obj;
        this.D = obj2;
        this.B = kVar;
        this.E = obj3;
        this.F = obj4;
        this.G = obj5;
        this.H = obj6;
        this.I = obj7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        float f3;
        x.b bVar;
        lo.v vVar;
        switch (this.A) {
            case 0:
                j0.b bVar2 = (j0.b) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.j jVar = (l1.j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                h1.t tVar = (h1.t) this.C;
                if ((iIntValue2 & 6) == 0) {
                    i10 = (((l1.g0) jVar).g(bVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= ((l1.g0) jVar).e(iIntValue) ? 32 : 16;
                }
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(i10 & 1, (i10 & 147) != 146)) {
                    h1.w wVarE = (h1.w) this.D;
                    h1.v vVar2 = (h1.v) tVar;
                    vVar2.getClass();
                    if (iIntValue > 0) {
                        wVarE = vVar2.e(Instant.ofEpochMilli(wVarE.f6538e).atZone(h1.v.f6531e).toLocalDate().plusMonths(iIntValue));
                    }
                    b2.r rVarC = j0.b.c(bVar2);
                    h1.s sVar = (h1.s) this.E;
                    Long l = (Long) this.F;
                    r1 r1Var = (r1) this.G;
                    d6 d6Var = (d6) this.H;
                    h1 h1Var = (h1) this.I;
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
                    a3.i(wVarE, this.B, sVar.D, l, r1Var, d6Var, h1Var, tVar.f6528a, jVar, 221184);
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                break;
            default:
                j0.b bVar3 = (j0.b) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.j jVar2 = (l1.j) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                l1.z0 z0Var = (l1.z0) this.G;
                l1.p2 p2Var = (l1.p2) this.F;
                if ((iIntValue4 & 6) == 0) {
                    i11 = (((l1.g0) jVar2).g(bVar3) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= ((l1.g0) jVar2).e(iIntValue3) ? 32 : 16;
                }
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(i11 & 1, (i11 & 147) != 146)) {
                    lo.v vVar3 = (lo.v) ((List) this.C).get(iIntValue3);
                    g0Var2.c0(49271319);
                    boolean z10 = iIntValue3 == va.a.M((u30.b) this.D);
                    l1.p2 p2VarB = x.d.b(iIntValue3 == ((Number) p2Var.getValue()).intValue() ? 1.04f : 1.0f, x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, x.x.f16384a, 2), null, jVar2, 0, 28);
                    float f10 = g0Var2.k(c3.o1.f2738n) != y3.m.B ? 0.0f : 1.0f;
                    Object objN = g0Var2.N();
                    l1.c cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = x.c.a(0.0f, 0.01f);
                        g0Var2.n0(objN);
                    }
                    x.b bVar4 = (x.b) objN;
                    po.o oVar = (po.o) z0Var.getValue();
                    int i12 = (i11 & 112) ^ 48;
                    boolean zI = ((i12 > 32 && g0Var2.e(iIntValue3)) || (i11 & 48) == 32) | g0Var2.i(bVar4);
                    Object objN2 = g0Var2.N();
                    if (zI || objN2 == cVar) {
                        objN2 = new as.y0(iIntValue3, bVar4, z0Var, (k00.c) null);
                        g0Var2.n0(objN2);
                    }
                    l1.q.i(oVar, jVar2, (u00.n) objN2);
                    boolean zG = ((i12 > 32 && g0Var2.e(iIntValue3)) || (i11 & 48) == 32) | g0Var2.g(this.B) | g0Var2.g(vVar3);
                    Object objN3 = g0Var2.N();
                    if (zG || objN3 == cVar) {
                        f3 = 0.0f;
                        bVar = bVar4;
                        objN3 = new po.k(iIntValue3, this.B, vVar3, (l1.z0) this.G, (l1.z0) this.H);
                        vVar = vVar3;
                        g0Var2.n0(objN3);
                    } else {
                        vVar = vVar3;
                        bVar = bVar4;
                        f3 = 0.0f;
                    }
                    b2.r rVarG = b2.o.A;
                    b2.r rVarO = w50.c.o(rVarG, false, (j3.k) null, (u00.a) objN3, 7);
                    boolean zI2 = g0Var2.i(bVar);
                    Object objN4 = g0Var2.N();
                    if (zI2 || objN4 == cVar) {
                        objN4 = new a20.d(bVar, 25);
                        g0Var2.n0(objN4);
                    }
                    b2.r rVarL = z2.d0.l(h0.c.E(f2.h.e(rVarO, (u00.k) objN4), 12, f3, 2), new lu.a(25));
                    boolean zG2 = g0Var2.g(p2VarB) | g0Var2.d(f10);
                    Object objN5 = g0Var2.N();
                    if (zG2 || objN5 == cVar) {
                        objN5 = new po.l(f10, p2VarB);
                        g0Var2.n0(objN5);
                    }
                    b2.r rVarP = i2.b0.p(rVarL, (u00.k) objN5);
                    if (z10 && ((lo.u) this.E).b) {
                        rVarG = f2.h.g(i2.b0.p(rVarG, new m3.c0(27)), new m3.c0(28));
                    }
                    b2.r rVarV = rVarP.V(rVarG);
                    z2.w0 w0VarD2 = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC3 = b2.a.c(rVarV, jVar2);
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
                    l1.q.I(Integer.valueOf(iHashCode), jVar2, b3.h.f2040g);
                    l1.q.E(jVar2, b3.h.f2041h);
                    l1.q.I(rVarC3, jVar2, b3.h.f2037d);
                    boolean z11 = iIntValue3 == ((Number) p2Var.getValue()).intValue();
                    boolean z12 = iIntValue3 < ((Number) p2Var.getValue()).intValue();
                    Object objN6 = g0Var2.N();
                    if (objN6 == cVar) {
                        objN6 = new eo.p((l1.g1) this.I, 15);
                        g0Var2.n0(objN6);
                    }
                    po.m.c(vVar, z11, z12, (u00.a) objN6, jVar2, 3072);
                    g0Var2.r(true);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
