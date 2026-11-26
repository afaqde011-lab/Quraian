package bz;

import a1.e1;
import a30.x;
import a40.z;
import bv.o1;
import c3.g1;
import c3.g3;
import c3.w2;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d0.o2;
import d00.x0;
import du.h0;
import g00.b0;
import g1.c5;
import g1.m6;
import g1.n5;
import g1.t6;
import g1.w6;
import g1.z6;
import g2.t;
import gv.n1;
import h0.a0;
import h0.c1;
import h0.m2;
import h0.p1;
import h0.t1;
import h0.u;
import h0.v1;
import h0.w;
import h0.z1;
import j0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jz.d0;
import k0.y;
import l1.g0;
import l1.m1;
import l1.z0;
import m3.q0;
import m3.r0;
import nx.i0;
import oo.o0;
import oo.v0;
import q0.i1;
import q0.j1;
import z2.w0;

public final class o implements u00.o {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    public o(Object obj, u00.k kVar, kk.c cVar, Object obj2, int i) {
        this.A = i;
        this.C = obj;
        this.D = kVar;
        this.B = cVar;
        this.E = obj2;
    }

    public o(kk.c cVar, d0 d0Var, v vVar, z0 z0Var) {
        this.A = 5;
        this.B = cVar;
        this.D = d0Var;
        this.C = vVar;
        this.E = z0Var;
    }

    public o(u00.n nVar, c0.d dVar, u00.o oVar, u00.a aVar) {
        this.A = 1;
        this.B = nVar;
        this.C = dVar;
        this.D = oVar;
        this.E = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u00.n nVar;
        boolean z;
        int i = this.A;
        b2.r rVarG = b2.o.A;
        Object obj4 = l1.i.a;
        b0 b0Var = b0.a;
        Object obj5 = this.E;
        Object obj6 = this.D;
        Object obj7 = this.C;
        Object obj8 = this.B;
        boolean z2 = true;
        switch (i) {
            case 0:
                kk.c cVar = (kk.c) obj8;
                v vVar = (v) obj7;
                s sVar = (s) obj6;
                z0 z0Var = (z0) obj5;
                h0.r PullToRefreshBox = (h0.r) obj;
                g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.r rVarA = kk.e.a(rVarG, cVar);
                    p pVar = (p) z0Var.getValue();
                    boolean zG = g0Var2.g(sVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == obj4) {
                        objN = new e1(sVar, 5);
                        g0Var2.n0(objN);
                    }
                    u00.k kVar = (u00.k) objN;
                    boolean zG2 = g0Var2.g(sVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new m(sVar, 1);
                        g0Var2.n0(objN2);
                    }
                    cz.j.a(vVar, pVar, kVar, (u00.a) objN2, rVarA, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case 1:
                u00.n nVar2 = (u00.n) obj8;
                c0.d dVar = (c0.d) obj7;
                u00.o oVar = (u00.o) obj6;
                u00.a aVar = (u00.a) obj5;
                c0.c cVar2 = (c0.c) obj;
                g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var3.g(cVar2) ? 4 : 2;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String str = (String) nVar2.invoke(g0Var3, 0);
                    if (r30.k.L0(str)) {
                        g0.a.c("Label must not be blank");
                    }
                    dVar.getClass();
                    c0.b.a.d(str, Boolean.TRUE, cVar2, oVar, aVar, g0Var3, Integer.valueOf((iIntValue2 << 9) & 7168));
                } else {
                    g0Var4.V();
                }
                return b0Var;
            case 2:
                o1 o1Var = (o1) obj7;
                u00.k kVar2 = (u00.k) obj6;
                kk.c cVar3 = (kk.c) obj8;
                x0 x0Var = (x0) obj5;
                h0.r CollapsibleSidePanel = (h0.r) obj;
                g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(CollapsibleSidePanel, "$this$CollapsibleSidePanel");
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    a0 a0Var = z1.c;
                    WeakHashMap weakHashMap = m2.w;
                    b2.r rVarL = h0.c.L(a0Var, h0.b.e(g0Var5).p);
                    v1 v1VarA = t1.a(h0.i.e, b2.b.L, g0Var5, 54);
                    int iHashCode = Long.hashCode(g0Var6.T);
                    m1 m1VarM = g0Var6.m();
                    b2.r rVarC = b2.a.c(rVarL, g0Var5);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var6.g0();
                    if (g0Var6.S) {
                        g0Var6.l(gVar);
                    } else {
                        g0Var6.q0();
                    }
                    l1.q.I(v1VarA, g0Var5, b3.h.f);
                    l1.q.I(m1VarM, g0Var5, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var5, b3.h.g);
                    l1.q.E(g0Var5, b3.h.h);
                    l1.q.I(rVarC, g0Var5, b3.h.d);
                    n1.c(o1Var, kVar2, cVar3, x0Var, g0Var5, 0);
                    g0Var6.r(true);
                } else {
                    g0Var6.V();
                }
                return b0Var;
            case 3:
                String str2 = (String) obj8;
                hw.j jVar = (hw.j) obj7;
                y yVar = (y) obj6;
                z0 z0Var2 = (z0) obj5;
                h0.r PullToRefreshBox2 = (h0.r) obj;
                g0 g0Var7 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PullToRefreshBox2, "$this$PullToRefreshBox");
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    u30.b bVar = ((hw.f) z0Var2.getValue()).a;
                    boolean z3 = ((hw.f) z0Var2.getValue()).b;
                    boolean zG3 = g0Var8.g(jVar);
                    Object objN3 = g0Var8.N();
                    if (zG3 || objN3 == obj4) {
                        objN3 = new h00.a(jVar, 3);
                        g0Var8.n0(objN3);
                    }
                    iw.a.f(bVar, z3, str2, (u00.k) objN3, yVar, null, g0Var7, 8);
                } else {
                    g0Var8.V();
                }
                return b0Var;
            case 4:
                String str3 = (String) obj8;
                z zVar = (z) obj7;
                g1 g1Var = (g1) obj6;
                w2 w2Var = (w2) obj5;
                w SettingsDialogWidget = (w) obj;
                g0 g0Var9 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(SettingsDialogWidget, "$this$SettingsDialogWidget");
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    b2.r rVarF = z.n.f(f2.h.c(z1.d(rVarG, 1.0f), p0.f.a(16)), dl.a.N, i2.b0.b);
                    h0.v vVarA = u.a(h0.i.c, b2.b.M, g0Var9, 0);
                    int iHashCode2 = Long.hashCode(g0Var10.T);
                    m1 m1VarM2 = g0Var10.m();
                    b2.r rVarC2 = b2.a.c(rVarF, g0Var9);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var10.g0();
                    if (g0Var10.S) {
                        g0Var10.l(gVar2);
                    } else {
                        g0Var10.q0();
                    }
                    l1.q.I(vVarA, g0Var9, b3.h.f);
                    l1.q.I(m1VarM2, g0Var9, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var9, b3.h.g);
                    l1.q.E(g0Var9, b3.h.h);
                    l1.q.I(rVarC2, g0Var9, b3.h.d);
                    boolean zI = g0Var10.i(zVar) | g0Var10.i(g1Var) | g0Var10.g(str3);
                    Object objN4 = g0Var10.N();
                    if (zI || objN4 == obj4) {
                        objN4 = new d0.g(zVar, g1Var, str3, 5);
                        g0Var10.n0(objN4);
                    }
                    iz.d.f(2131231125, str3, 2131231131, (u00.a) objN4, g0Var9, 0);
                    String strU = z3.U(g0Var9, 2131886785);
                    boolean zI2 = g0Var10.i(w2Var);
                    Object objN5 = g0Var10.N();
                    if (zI2 || objN5 == obj4) {
                        objN5 = new h0(w2Var, 2);
                        g0Var10.n0(objN5);
                    }
                    iz.d.f(2131231182, strU, 2131231382, (u00.a) objN5, g0Var9, 0);
                    g0Var10.r(true);
                } else {
                    g0Var10.V();
                }
                return b0Var;
            case 5:
                kk.c cVar4 = (kk.c) obj8;
                d0 d0Var = (d0) obj6;
                v vVar2 = (v) obj7;
                z0 z0Var3 = (z0) obj5;
                h0.r PullToRefreshBox3 = (h0.r) obj;
                g0 g0Var11 = (l1.j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PullToRefreshBox3, "$this$PullToRefreshBox");
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b2.r rVarA2 = kk.e.a(rVarG, cVar4);
                    jz.z zVar2 = (jz.z) z0Var3.getValue();
                    boolean zG4 = g0Var12.g(d0Var);
                    Object objN6 = g0Var12.N();
                    if (zG4 || objN6 == obj4) {
                        objN6 = new gz.e1(1, d0Var, d0.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/managesubscription/ManageSubscriptionAction;)V", 0, 5);
                        g0Var12.n0(objN6);
                    }
                    jz.y.a(zVar2, (u00.k) ((a10.g) objN6), rVarA2, vVar2, g0Var11, 0, 0);
                } else {
                    g0Var12.V();
                }
                return b0Var;
            case 6:
                t tVar = (t) obj8;
                u00.k kVar3 = (u00.k) obj7;
                String str4 = (String) obj6;
                z0.g gVar3 = (z0.g) obj5;
                h0.r LiquidBox = (h0.r) obj;
                g0 g0Var13 = (l1.j) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    b2.r rVarJ = g2.d.j(z1.d(rVarG, 1.0f), tVar);
                    boolean zG5 = g0Var14.g(kVar3);
                    Object objN7 = g0Var14.N();
                    if (zG5 || objN7 == obj4) {
                        objN7 = new hv.j(15, kVar3);
                        g0Var14.n0(objN7);
                    }
                    b2.r rVarS = g2.d.s(rVarJ, (u00.k) objN7);
                    p0.e eVarA = p0.f.a(32);
                    z0.e eVar = z0.e.B;
                    c5 c5Var = c5.a;
                    long j = i2.t.f;
                    long j2 = dl.a.k;
                    t6 t6VarC = c5.c(j2, j2, j2, 0L, j, j, j, 0L, 0L, j, j, j, 0L, i2.t.b(0.6f, j2), i2.t.b(0.6f, j2), i2.t.b(0.6f, j2), g0Var13, 1207945096);
                    p1 p1VarE = h0.c.e(16, 0.0f, 2);
                    if (str4.length() > 0) {
                        g0Var14.c0(-1336746772);
                        u00.n nVarD = v1.d.d(779041322, new c00.p(gVar3, 3), g0Var13);
                        g0Var14.r(false);
                        nVar = nVarD;
                    } else {
                        g0Var14.c0(-1335969943);
                        g0Var14.r(false);
                        nVar = null;
                    }
                    n5.c(gVar3, rVarS, false, (r0) null, (w6) null, kx.a.d, kx.a.e, nVar, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarC, p1VarE, g0Var13, 113246208, 100663296, 18611316);
                } else {
                    g0Var14.V();
                }
                return b0Var;
            case 7:
                gm.a aVar2 = (gm.a) obj8;
                ju.f fVar = (ju.f) obj7;
                lu.z zVar3 = (lu.z) obj6;
                u00.k kVar4 = (u00.k) obj5;
                h0.t BoxWithConstraints = (h0.t) obj;
                g0 g0Var15 = (l1.j) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= g0Var15.g(BoxWithConstraints) ? 4 : 2;
                }
                boolean z4 = (iIntValue8 & 19) != 18;
                g0 g0Var16 = g0Var15;
                x xVar = g0Var16.a;
                if (g0Var16.S(iIntValue8 & 1, z4)) {
                    gm.a aVar3 = gm.a.B;
                    boolean z5 = aVar2 == aVar3;
                    WeakHashMap weakHashMap2 = m2.w;
                    boolean z6 = h0.b.e(g0Var15).c.e().d > 0;
                    boolean zE = g0Var16.e(aVar2.ordinal());
                    Object objN8 = g0Var16.N();
                    if (zE || objN8 == obj4) {
                        objN8 = x5.s(0, g0Var16);
                    }
                    z0 z0Var4 = (z0) objN8;
                    y3.f fVar2 = new y3.f(BoxWithConstraints.b());
                    Boolean boolValueOf = Boolean.valueOf(z6);
                    boolean zH = ((iIntValue8 & 14) == 4) | g0Var16.h(z6) | g0Var16.g(z0Var4);
                    Object objN9 = g0Var16.N();
                    if (zH || objN9 == obj4) {
                        objN9 = new av.d(z6, BoxWithConstraints, z0Var4, (k00.c) null);
                        g0Var16.n0(objN9);
                    }
                    l1.q.h(fVar2, boolValueOf, (u00.n) objN9, g0Var15);
                    boolean zD = g0Var16.d(BoxWithConstraints.b()) | g0Var16.h(z6) | g0Var16.d(((y3.f) z0Var4.getValue()).A);
                    Object objN10 = g0Var16.N();
                    if (zD || objN10 == obj4) {
                        float fB = ((y3.f) z0Var4.getValue()).A;
                        if (!z6 || y3.f.a(fB, 0) <= 0) {
                            fB = BoxWithConstraints.b();
                        }
                        objN10 = oi.k.t(fB, g0Var16);
                    }
                    float f = ((y3.f) objN10).A;
                    boolean zD2 = g0Var16.d(BoxWithConstraints.c()) | g0Var16.d(f) | g0Var16.e(aVar2.ordinal());
                    Object objN11 = g0Var16.N();
                    if (zD2 || objN11 == obj4) {
                        float fC = BoxWithConstraints.c();
                        boolean z7 = aVar2 == aVar3;
                        float fX = ab.a0.x(Math.min(f / (z7 ? 380.0f : 560.0f), fC / (z7 ? 520.0f : 360.0f)), 0.68f, 1.0f);
                        float fX2 = ab.a0.x(30.0f * fX, 22.0f, 34.0f);
                        float fX3 = ab.a0.x(fX * 64.0f, 64.0f, 74.0f);
                        objN11 = new ju.a(ab.a0.C(new y3.f(22.0f * fX), new y3.f(16.0f), new y3.f(24.0f)).A, kh.o.F(fX2, 4294967296L), kh.o.F(fX2 * 1.12f, 4294967296L), fX < 0.82f ? 4 : 3, kh.o.F(fX3, 4294967296L), kh.o.F(fX3 * 1.05f, 4294967296L), ab.a0.C(new y3.f(52.0f * fX), new y3.f(44.0f), new y3.f(56.0f)).A, ab.a0.C(new y3.f(fX * 12.0f), new y3.f(8.0f), new y3.f(20.0f)).A);
                        g0Var16.n0(objN11);
                    }
                    ju.a aVar4 = (ju.a) objN11;
                    boolean zD3 = g0Var16.d(BoxWithConstraints.c()) | g0Var16.d(f) | g0Var16.e(aVar2.ordinal());
                    Object objN12 = g0Var16.N();
                    if (zD3 || objN12 == obj4) {
                        objN12 = oi.k.t(b5.G(f, BoxWithConstraints.c(), aVar2 == aVar3), g0Var16);
                    }
                    b2.r rVarG2 = h0.c.G(h0.c.E(z1.c, aVar4.a, 0.0f, 2), 0.0f, ((y3.f) objN12).A, 0.0f, 0.0f, 13);
                    h0.v vVarA2 = u.a(h0.i.g, b2.b.N, g0Var15, 54);
                    int iHashCode3 = Long.hashCode(g0Var16.T);
                    m1 m1VarM3 = g0Var16.m();
                    b2.r rVarC3 = b2.a.c(rVarG2, g0Var15);
                    b3.i.c.getClass();
                    b3.g gVar4 = b3.h.b;
                    g0Var16.g0();
                    if (g0Var16.S) {
                        g0Var16.l(gVar4);
                    } else {
                        g0Var16.q0();
                    }
                    b3.f fVar3 = b3.h.f;
                    l1.q.I(vVarA2, g0Var15, fVar3);
                    b3.f fVar4 = b3.h.e;
                    l1.q.I(m1VarM3, g0Var15, fVar4);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    b3.f fVar5 = b3.h.g;
                    l1.q.I(numValueOf, g0Var15, fVar5);
                    b3.e eVar2 = b3.h.h;
                    l1.q.E(g0Var15, eVar2);
                    b3.f fVar6 = b3.h.d;
                    l1.q.I(rVarC3, g0Var15, fVar6);
                    long j3 = aVar4.b;
                    long j4 = aVar4.c;
                    int i2 = aVar4.d;
                    b2.o oVar2 = b2.o.A;
                    mu.d.u(fVar, oVar2, j3, j4, i2, 0.0f, g0Var15, 48, 32);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    b2.r rVarD = z1.d(new c1(1.0f, true), 1.0f);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode4 = Long.hashCode(g0Var16.T);
                    m1 m1VarM4 = g0Var16.m();
                    b2.r rVarC4 = b2.a.c(rVarD, g0Var15);
                    g0Var16.g0();
                    if (g0Var16.S) {
                        g0Var16.l(gVar4);
                    } else {
                        g0Var16.q0();
                    }
                    l1.q.I(w0VarD, g0Var15, fVar3);
                    l1.q.I(m1VarM4, g0Var15, fVar4);
                    x5.u(iHashCode4, g0Var15, fVar5, g0Var15, eVar2);
                    l1.q.I(rVarC4, g0Var15, fVar6);
                    mu.d.e(zVar3.k, kVar4, aVar4.e, aVar4.f, aVar4.g, g0Var15, 0);
                    g0Var16.r(true);
                    z6.b(z3.U(g0Var15, 2131886931), h0.c.G(z1.d(oVar2, 1.0f), 0.0f, 0.0f, 0.0f, aVar4.h, 7), i2.t.b(0.7f, dl.a.k), ju.e.a(z5), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), ju.e.b(z5), 0, false, 2, 0, (u00.k) null, (r0) null, g0Var15, 0, 24576, 242664);
                    g0Var16.r(true);
                } else {
                    g0Var16.V();
                }
                return b0Var;
            case 8:
                ju.f fVar7 = (ju.f) obj8;
                ju.l lVar = (ju.l) obj7;
                ju.i iVar = ((lu.z) obj6).j;
                u30.b bVar2 = (u30.b) obj5;
                j0.b item = (j0.b) obj;
                g0 g0Var17 = (l1.j) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                boolean z8 = (iIntValue9 & 17) != 16;
                int i3 = iIntValue9 & 1;
                g0 g0Var18 = g0Var17;
                x xVar2 = g0Var18.a;
                if (!g0Var18.S(i3, z8)) {
                    g0Var18.V();
                    return b0Var;
                }
                b2.r rVarD2 = z1.d(rVarG, 1.0f);
                h0.v vVarA3 = u.a(h0.i.c, b2.b.N, g0Var17, 54);
                int iHashCode5 = Long.hashCode(g0Var18.T);
                m1 m1VarM5 = g0Var18.m();
                b2.r rVarC5 = b2.a.c(rVarD2, g0Var17);
                b3.i.c.getClass();
                b3.g gVar5 = b3.h.b;
                g0Var18.g0();
                if (g0Var18.S) {
                    g0Var18.l(gVar5);
                } else {
                    g0Var18.q0();
                }
                b3.f fVar8 = b3.h.f;
                l1.q.I(vVarA3, g0Var17, fVar8);
                b3.f fVar9 = b3.h.e;
                l1.q.I(m1VarM5, g0Var17, fVar9);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                b3.f fVar10 = b3.h.g;
                l1.q.I(numValueOf2, g0Var17, fVar10);
                b3.e eVar3 = b3.h.h;
                l1.q.E(g0Var17, eVar3);
                b3.f fVar11 = b3.h.d;
                l1.q.I(rVarC5, g0Var17, fVar11);
                mu.d.u(fVar7, null, 0L, 0L, 0, 0.7f, g0Var17, 196608, 30);
                b2.r rVarG3 = h0.c.G(z1.d(rVarG, 1.0f), 0.0f, lVar.b, 0.0f, 0.0f, 13);
                v1 v1VarA2 = t1.a(h0.i.f, b2.b.K, g0Var17, 54);
                int iHashCode6 = Long.hashCode(g0Var18.T);
                m1 m1VarM6 = g0Var18.m();
                b2.r rVarC6 = b2.a.c(rVarG3, g0Var17);
                g0Var18.g0();
                if (g0Var18.S) {
                    g0Var18.l(gVar5);
                } else {
                    g0Var18.q0();
                }
                l1.q.I(v1VarA2, g0Var17, fVar8);
                l1.q.I(m1VarM6, g0Var17, fVar9);
                x5.u(iHashCode6, g0Var17, fVar10, g0Var17, eVar3);
                l1.q.I(rVarC6, g0Var17, fVar11);
                String str5 = iVar.a;
                List listJ1 = h00.q.j1(bVar2, 3);
                ArrayList arrayList = new ArrayList(h00.r.q0(listJ1, 10));
                Iterator it = listJ1.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ju.d) it.next()).a));
                }
                mu.d.r(str5, g4.d0(arrayList), lVar.e, lVar.k, g0Var17, 0);
                mu.d.p(iVar.b, lVar.g, lVar.l, lVar.m, g0Var17, 0);
                g0Var18.r(true);
                z6.b(z3.U(g0Var17, 2131886978), h0.c.G(z1.d(rVarG, 1.0f), 0.0f, lVar.c, 0.0f, 0.0f, 13), dl.a.i, lVar.n, q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var17, 1572864, 0, 262056);
                h0.c.h(z1.e(rVarG, lVar.t), g0Var17);
                g0Var18.r(true);
                return b0Var;
            case 9:
                t tVar2 = (t) obj8;
                i0 i0Var = (i0) obj7;
                u00.k kVar5 = (u00.k) obj6;
                z0 z0Var5 = (z0) obj5;
                j0.b item2 = (j0.b) obj;
                g0 g0Var19 = (l1.j) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                g0 g0Var20 = g0Var19;
                if (g0Var20.S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    b2.r rVarJ2 = g2.d.j(rVarG, tVar2);
                    Object objN13 = g0Var20.N();
                    if (objN13 == obj4) {
                        objN13 = new o2(z0Var5, 13);
                        g0Var20.n0(objN13);
                    }
                    b2.r rVarE = z1.e(h0.c.E(g2.d.s(rVarJ2, (u00.k) objN13), 24, 0.0f, 2), 40);
                    String str6 = i0Var.e;
                    boolean zG6 = g0Var20.g(kVar5);
                    Object objN14 = g0Var20.N();
                    if (zG6 || objN14 == obj4) {
                        objN14 = new lp.k(6, kVar5);
                        g0Var20.n0(objN14);
                    }
                    ox.a.f(rVarE, str6, (u00.k) objN14, 0, g0Var19, 0, 8);
                } else {
                    g0Var20.V();
                }
                return b0Var;
            case 10:
                oo.z0 z0Var6 = (oo.z0) obj7;
                u00.k kVar6 = (u00.k) obj6;
                kk.c cVar5 = (kk.c) obj8;
                u00.a aVar5 = (u00.a) obj5;
                h0.t BoxWithConstraints2 = (h0.t) obj;
                g0 g0Var21 = (l1.j) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints2, "$this$BoxWithConstraints");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= g0Var21.g(BoxWithConstraints2) ? 4 : 2;
                }
                g0 g0Var22 = g0Var21;
                if (g0Var22.S(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    boolean z9 = y3.f.a(BoxWithConstraints2.c(), BoxWithConstraints2.b()) > 0 && y3.f.a(BoxWithConstraints2.c() / ((float) 2), (float) RCHTTPStatusCodes.UNSUCCESSFUL) >= 0;
                    Boolean boolValueOf2 = Boolean.valueOf(z9);
                    boolean zG7 = g0Var22.g(z0Var6) | g0Var22.g(kVar6);
                    Object objN15 = g0Var22.N();
                    if (zG7 || objN15 == obj4) {
                        objN15 = new v0(z0Var6, kVar6, null, 1);
                        g0Var22.n0(objN15);
                    }
                    l1.q.i(boolValueOf2, g0Var21, (u00.n) objN15);
                    if (z9) {
                        g0Var22.c0(-336995271);
                        o0.t(z0Var6, kVar6, cVar5, BoxWithConstraints2.c(), g0Var21, 0);
                        g0Var22.r(false);
                    } else {
                        g0Var22.c0(-336870031);
                        o0.u(z0Var6, kVar6, cVar5, aVar5, g0Var21, 0);
                        g0Var22.r(false);
                    }
                } else {
                    g0Var22.V();
                }
                return b0Var;
            case 11:
                i2.v0 v0Var = (i2.q) obj8;
                j1 j1Var = (j1) obj7;
                r3.w wVar = (r3.w) obj6;
                r3.p pVar2 = (r3.p) obj5;
                b2.r rVar = (b2.r) obj;
                ((Integer) obj3).getClass();
                g0 g0Var23 = (l1.j) obj2;
                g0Var23.c0(-84507373);
                boolean zBooleanValue = ((Boolean) g0Var23.k(c3.o1.x)).booleanValue();
                boolean zH2 = g0Var23.h(zBooleanValue);
                Object objN16 = g0Var23.N();
                if (zH2 || objN16 == obj4) {
                    objN16 = new a1.d0(zBooleanValue);
                    g0Var23.n0(objN16);
                }
                a1.d0 d0Var2 = (a1.d0) objN16;
                if ((v0Var instanceof i2.v0) && v0Var.a == 16) {
                    z2 = false;
                }
                if (((g3) g0Var23.k(c3.o1.u)).b() && j1Var.b() && q0.d(wVar.b) && z2) {
                    g0Var23.c0(-707487962);
                    m3.h hVar = wVar.a;
                    q0 q0Var = new q0(wVar.b);
                    boolean zI3 = g0Var23.i(d0Var2);
                    Object objN17 = g0Var23.N();
                    if (zI3 || objN17 == obj4) {
                        objN17 = new l6.d(d0Var2, (k00.c) null, 9);
                        g0Var23.n0(objN17);
                    }
                    l1.q.h(hVar, q0Var, (u00.n) objN17, g0Var23);
                    boolean zI4 = g0Var23.i(d0Var2) | g0Var23.i(pVar2) | g0Var23.g(wVar) | g0Var23.i(j1Var) | g0Var23.g(v0Var);
                    Object objN18 = g0Var23.N();
                    if (zI4 || objN18 == obj4) {
                        a1.a aVar6 = new a1.a(d0Var2, pVar2, wVar, j1Var, v0Var);
                        g0Var23.n0(aVar6);
                        objN18 = aVar6;
                    }
                    rVarG = f2.h.g(rVar, (u00.k) objN18);
                    z = false;
                    g0Var23.r(false);
                } else {
                    z = false;
                    g0Var23.c0(-705473241);
                    g0Var23.r(false);
                }
                g0Var23.r(z);
                return rVarG;
            case 12:
                lo.k kVar7 = (lo.k) obj8;
                z zVar4 = (z) obj7;
                m6 m6Var = (m6) obj6;
                u00.a aVar7 = (u00.a) obj5;
                w ModalBottomSheet = (w) obj;
                g0 g0Var24 = (l1.j) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                boolean z11 = (iIntValue12 & 17) != 16;
                int i4 = iIntValue12 & 1;
                g0 g0Var25 = g0Var24;
                if (g0Var25.S(i4, z11)) {
                    g4.d(54, i2.t.f, g0Var24, true);
                    boolean zI5 = g0Var25.i(zVar4) | g0Var25.g(m6Var) | g0Var25.g(aVar7);
                    Object objN19 = g0Var25.N();
                    if (zI5 || objN19 == obj4) {
                        objN19 = new cz.c(zVar4, m6Var, aVar7, 13);
                        g0Var25.n0(objN19);
                    }
                    ro.f.a(kVar7, true, (u00.a) objN19, g0Var24, 48);
                } else {
                    g0Var25.V();
                }
                return b0Var;
            default:
                z zVar5 = (z) obj8;
                m6 m6Var2 = (m6) obj7;
                u00.a aVar8 = (u00.a) obj6;
                u00.a aVar9 = (u00.a) obj5;
                w ModalBottomSheet2 = (w) obj;
                g0 g0Var26 = (l1.j) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet2, "$this$ModalBottomSheet");
                g0 g0Var27 = g0Var26;
                if (g0Var27.S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    long j5 = dl.a.q;
                    g4.d(6, j5, g0Var26, true);
                    float f2 = 16;
                    b2.r rVarG4 = h0.c.G(h0.c.E(h0.c.M(z.n.f(z1.d(rVarG, 1.0f), j5, i2.b0.b), h0.c.g), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7);
                    h0.v vVarA4 = u.a(h0.i.c, b2.b.N, g0Var26, 48);
                    int iHashCode7 = Long.hashCode(g0Var27.T);
                    m1 m1VarM7 = g0Var27.m();
                    b2.r rVarC7 = b2.a.c(rVarG4, g0Var26);
                    b3.i.c.getClass();
                    b3.g gVar6 = b3.h.b;
                    g0Var27.g0();
                    if (g0Var27.S) {
                        g0Var27.l(gVar6);
                    } else {
                        g0Var27.q0();
                    }
                    l1.q.I(vVarA4, g0Var26, b3.h.f);
                    l1.q.I(m1VarM7, g0Var26, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode7), g0Var26, b3.h.g);
                    l1.q.E(g0Var26, b3.h.h);
                    l1.q.I(rVarC7, g0Var26, b3.h.d);
                    kl.a.a(null, false, g0Var26, 48, 1);
                    boolean zI6 = g0Var27.i(zVar5) | g0Var27.g(m6Var2) | g0Var27.g(aVar8);
                    Object objN20 = g0Var27.N();
                    if (zI6 || objN20 == obj4) {
                        objN20 = new cz.c(zVar5, m6Var2, aVar8, 16);
                        g0Var27.n0(objN20);
                    }
                    u00.a aVar10 = (u00.a) objN20;
                    boolean zI7 = g0Var27.i(zVar5) | g0Var27.g(m6Var2) | g0Var27.g(aVar9);
                    Object objN21 = g0Var27.N();
                    if (zI7 || objN21 == obj4) {
                        objN21 = new cz.c(zVar5, m6Var2, aVar9, 17);
                        g0Var27.n0(objN21);
                    }
                    b5.a(aVar10, (u00.a) objN21, g0Var26, 0);
                    g0Var27.r(true);
                } else {
                    g0Var27.V();
                }
                return b0Var;
        }
    }
}
