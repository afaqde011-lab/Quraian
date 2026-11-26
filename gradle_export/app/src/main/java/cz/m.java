package cz;

import a30.x;
import b2.r;
import c3.o1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import d0.e2;
import d0.n2;
import d0.o2;
import d0.q1;
import g1.o3;
import g1.p4;
import g1.v5;
import g1.z6;
import gv.a0;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.w;
import h0.w1;
import h0.z1;
import i2.b0;
import i2.t;
import i2.t0;
import l1.g0;
import l1.i1;
import l1.m1;
import l1.q;
import l1.z0;
import m3.r0;
import q0.a2;
import q0.b2;
import qo.z;
import z.v0;
import z2.w0;

public final class m implements u00.o {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;

    public m(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.C = obj;
        this.B = z;
        this.D = obj2;
    }

    public m(boolean z, j3.k kVar, u00.a aVar) {
        this.A = 5;
        this.B = z;
        this.D = kVar;
        this.C = aVar;
    }

    public m(boolean z, Object obj, g00.e eVar, int i) {
        this.A = i;
        this.B = z;
        this.C = obj;
        this.D = eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u00.n nVar;
        b3.f fVar;
        b3.e eVar;
        long j;
        t0 t0Var;
        r rVar;
        boolean z;
        g0 g0Var;
        u00.a aVar;
        switch (this.A) {
            case 0:
                u00.a aVar2 = (u00.a) this.C;
                u00.a aVar3 = (u00.a) this.D;
                w ModalBottomSheet = (w) obj;
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                boolean z2 = (iIntValue & 17) != 16;
                g0 g0Var2 = (g0) jVar;
                x xVar = g0Var2.a;
                if (g0Var2.S(iIntValue & 1, z2)) {
                    long j2 = dl.a.q;
                    g4.d(6, j2, jVar, true);
                    r rVar2 = b2.o.A;
                    r rVarD = z1.d(rVar2, 1.0f);
                    t0 t0Var2 = b0.b;
                    float f = 16;
                    r rVarG = h0.c.G(h0.c.E(h0.c.M(z.n.f(rVarD, j2, t0Var2), h0.c.g), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                    v vVarA = u.a(h0.i.c, b2.b.N, jVar, 48);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarG, jVar);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar2 = b3.h.f;
                    q.I(vVarA, jVar, fVar2);
                    b3.f fVar3 = b3.h.e;
                    q.I(m1VarM, jVar, fVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar4 = b3.h.g;
                    q.I(numValueOf, jVar, fVar4);
                    b3.e eVar2 = b3.h.h;
                    q.E(jVar, eVar2);
                    u00.n nVar2 = b3.h.d;
                    q.I(rVarC, jVar, nVar2);
                    kl.a.a(null, false, jVar, 48, 1);
                    float f2 = 28;
                    r rVarD2 = z1.d(h0.c.G(rVar2, 0.0f, f2, 0.0f, 0.0f, 13), 1.0f);
                    String strU = z3.U(jVar, 2131887240);
                    long j3 = dl.a.k;
                    z6.b(strU, rVarD2, j3, kh.o.z(22), q3.u.E, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(28), 0, false, 0, 0, (u00.k) null, (r0) null, jVar, 1597488, 48, 258984);
                    l1.j jVar2 = jVar;
                    r rVarG2 = h0.c.G(rVar2, 0.0f, 32, 0.0f, 0.0f, 13);
                    v vVarA2 = u.a(h0.i.g(f), b2.b.M, jVar2, 6);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    r rVarC2 = b2.a.c(rVarG2, jVar2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(vVarA2, jVar2, fVar2);
                    q.I(m1VarM2, jVar2, fVar3);
                    x5.u(iHashCode2, jVar2, fVar4, jVar2, eVar2);
                    q.I(rVarC2, jVar2, nVar2);
                    float f3 = 52;
                    r rVarC3 = f2.h.c(z1.e(z1.d(rVar2, 1.0f), f3), p0.f.a(f2));
                    long j4 = dl.a.i;
                    r rVarF = z.n.f(rVarC3, j4, t0Var2);
                    boolean z3 = this.B;
                    boolean z4 = !z3;
                    r rVarN = w50.c.n(rVarF, z4, aVar2);
                    b2.i iVar = b2.b.E;
                    w0 w0VarD = h0.o.d(iVar, false);
                    int iHashCode3 = Long.hashCode(g0Var2.T);
                    m1 m1VarM3 = g0Var2.m();
                    r rVarC4 = b2.a.c(rVarN, jVar2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(w0VarD, jVar2, fVar2);
                    q.I(m1VarM3, jVar2, fVar3);
                    x5.u(iHashCode3, jVar2, fVar4, jVar2, eVar2);
                    q.I(rVarC4, jVar2, nVar2);
                    if (z3) {
                        g0Var2.c0(-643609088);
                        fVar = fVar4;
                        eVar = eVar2;
                        nVar = nVar2;
                        v5.a(z1.m(rVar2, 22), dl.a.l, 2, 0L, 0, 0.0f, jVar2, 390, 56);
                        g0Var2.r(false);
                        j = j4;
                        t0Var = t0Var2;
                        z = false;
                        rVar = rVar2;
                    } else {
                        nVar = nVar2;
                        fVar = fVar4;
                        eVar = eVar2;
                        g0Var2.c0(-643368373);
                        j = j4;
                        t0Var = t0Var2;
                        rVar = rVar2;
                        z = false;
                        z6.b(z3.U(jVar2, 2131887238), (r) null, dl.a.l, kh.o.z(16), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1597440, 0, 262058);
                        jVar2 = jVar2;
                        g0Var2.r(false);
                    }
                    g0Var2.r(true);
                    r rVarN2 = w50.c.n(z.n.f(f2.h.c(z1.e(z1.d(rVar, 1.0f), f3), p0.f.a(f2)), t.b(0.12f, j), t0Var), z4, aVar3);
                    w0 w0VarD2 = h0.o.d(iVar, z);
                    int iHashCode4 = Long.hashCode(g0Var2.T);
                    m1 m1VarM4 = g0Var2.m();
                    r rVarC5 = b2.a.c(rVarN2, jVar2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(w0VarD2, jVar2, fVar2);
                    q.I(m1VarM4, jVar2, fVar3);
                    x5.u(iHashCode4, jVar2, fVar, jVar2, eVar);
                    q.I(rVarC5, jVar2, nVar);
                    z6.b(z3.U(jVar2, 2131887233), (r) null, j3, kh.o.z(16), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1597440, 0, 262058);
                    x5.z(g0Var2, true, true, true);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                x.b bVar = (x.b) this.C;
                String str = (String) this.D;
                w1 LiquidButton = (w1) obj;
                g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton, "$this$LiquidButton");
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b2.o oVar = b2.o.A;
                    r rVarE = h0.c.E(z1.g(oVar, 36, 0.0f, 2), 12, 0.0f, 2);
                    v1 v1VarA = t1.a(h0.i.g(5), b2.b.K, g0Var3, 54);
                    int iHashCode5 = Long.hashCode(g0Var4.T);
                    m1 m1VarM5 = g0Var4.m();
                    r rVarC6 = b2.a.c(rVarE, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    q.I(v1VarA, g0Var3, b3.h.f);
                    q.I(m1VarM5, g0Var3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode5), g0Var3, b3.h.g);
                    q.E(g0Var3, b3.h.h);
                    q.I(rVarC6, g0Var3, b3.h.d);
                    r rVarM = z1.m(oVar, 16);
                    boolean zI = g0Var4.i(bVar);
                    Object objN = g0Var4.N();
                    if (zI || objN == l1.i.a) {
                        objN = new p4(bVar, 2);
                        g0Var4.n0(objN);
                    }
                    r rVarP = b0.p(rVarM, (u00.k) objN);
                    m2.b bVarR = y3.R(2131231205, g0Var3, 0);
                    long j5 = dl.a.i;
                    o3.a(bVarR, (String) null, rVarP, j5, g0Var3, 56, 0);
                    if (this.B) {
                        g0Var4.c0(109792753);
                        g0Var = g0Var4;
                        z6.b(str, (r) null, j5, kh.o.z(14), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 24576, 245674);
                        g0Var.r(false);
                    } else {
                        g0Var = g0Var4;
                        g0Var.c0(110032042);
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 2:
                zz.b bVar2 = (zz.b) this.C;
                u00.k kVar = (u00.k) this.D;
                w ModalBottomSheet2 = (w) obj;
                g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet2, "$this$ModalBottomSheet");
                boolean z5 = (iIntValue3 & 17) != 16;
                g0 g0Var6 = g0Var5;
                x xVar2 = g0Var6.a;
                if (g0Var6.S(iIntValue3 & 1, z5)) {
                    long j6 = dl.a.q;
                    g4.d(0, j6, g0Var5, this.B);
                    b2.o oVar2 = b2.o.A;
                    float f4 = 24;
                    r rVarG3 = h0.c.G(h0.c.E(h0.c.M(z.n.f(z1.d(oVar2, 1.0f), j6, b0.b), h0.c.g), f4, 0.0f, 2), 0.0f, 0.0f, 0.0f, f4, 7);
                    float f5 = 12;
                    h0.f fVarG = h0.i.g(f5);
                    b2.g gVar3 = b2.b.M;
                    v vVarA3 = u.a(fVarG, gVar3, g0Var5, 6);
                    int iHashCode6 = Long.hashCode(g0Var6.T);
                    m1 m1VarM6 = g0Var6.m();
                    r rVarC7 = b2.a.c(rVarG3, g0Var5);
                    b3.i.c.getClass();
                    u00.a aVar4 = b3.h.b;
                    g0Var6.g0();
                    if (g0Var6.S) {
                        g0Var6.l(aVar4);
                    } else {
                        g0Var6.q0();
                    }
                    b3.f fVar5 = b3.h.f;
                    q.I(vVarA3, g0Var5, fVar5);
                    b3.f fVar6 = b3.h.e;
                    q.I(m1VarM6, g0Var5, fVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    b3.f fVar7 = b3.h.g;
                    q.I(numValueOf2, g0Var5, fVar7);
                    b3.e eVar3 = b3.h.h;
                    q.E(g0Var5, eVar3);
                    b3.f fVar8 = b3.h.d;
                    q.I(rVarC7, g0Var5, fVar8);
                    r rVarD3 = z1.d(oVar2, 1.0f);
                    w0 w0VarD3 = h0.o.d(b2.b.E, false);
                    int iHashCode7 = Long.hashCode(g0Var6.T);
                    m1 m1VarM7 = g0Var6.m();
                    r rVarC8 = b2.a.c(rVarD3, g0Var5);
                    g0Var6.g0();
                    if (g0Var6.S) {
                        g0Var6.l(aVar4);
                    } else {
                        g0Var6.q0();
                    }
                    q.I(w0VarD3, g0Var5, fVar5);
                    q.I(m1VarM7, g0Var5, fVar6);
                    x5.u(iHashCode7, g0Var5, fVar7, g0Var5, eVar3);
                    q.I(rVarC8, g0Var5, fVar8);
                    kl.a.a(null, false, g0Var5, 48, 1);
                    g0Var6.r(true);
                    z6.b(z3.U(g0Var5, 2131887291), z1.d(oVar2, 1.0f), dl.a.k, kh.o.z(22), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var5, 1597488, 0, 261032);
                    v vVarA4 = u.a(h0.i.g(f5), gVar3, g0Var5, 6);
                    int iHashCode8 = Long.hashCode(g0Var6.T);
                    m1 m1VarM8 = g0Var6.m();
                    r rVarC9 = b2.a.c(oVar2, g0Var5);
                    g0Var6.g0();
                    if (g0Var6.S) {
                        aVar = aVar4;
                        g0Var6.l(aVar);
                    } else {
                        aVar = aVar4;
                        g0Var6.q0();
                    }
                    q.I(vVarA4, g0Var5, fVar5);
                    q.I(m1VarM8, g0Var5, fVar6);
                    x5.u(iHashCode8, g0Var5, fVar7, g0Var5, eVar3);
                    q.I(rVarC9, g0Var5, fVar8);
                    v1 v1VarA2 = t1.a(h0.i.g(f5), b2.b.J, g0Var5, 6);
                    int iHashCode9 = Long.hashCode(g0Var6.T);
                    m1 m1VarM9 = g0Var6.m();
                    r rVarC10 = b2.a.c(oVar2, g0Var5);
                    g0Var6.g0();
                    if (g0Var6.S) {
                        g0Var6.l(aVar);
                    } else {
                        g0Var6.q0();
                    }
                    q.I(v1VarA2, g0Var5, fVar5);
                    q.I(m1VarM9, g0Var5, fVar6);
                    x5.u(iHashCode9, g0Var5, fVar7, g0Var5, eVar3);
                    q.I(rVarC10, g0Var5, fVar8);
                    String strU2 = z3.U(g0Var5, 2131887290);
                    boolean z6 = bVar2 == zz.b.FULL;
                    boolean zG = g0Var6.g(kVar);
                    Object objN2 = g0Var6.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN2 == obj4) {
                        objN2 = new a0(24, kVar);
                        g0Var6.n0(objN2);
                    }
                    iz.d.j(0, strU2, g0Var5, (u00.a) objN2, z6);
                    String strU3 = z3.U(g0Var5, 2131887292);
                    boolean z7 = bVar2 == zz.b.HD;
                    boolean zG2 = g0Var6.g(kVar);
                    Object objN3 = g0Var6.N();
                    if (zG2 || objN3 == obj4) {
                        objN3 = new a0(25, kVar);
                        g0Var6.n0(objN3);
                    }
                    iz.d.j(0, strU3, g0Var5, (u00.a) objN3, z7);
                    x5.z(g0Var6, true, true, true);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 3:
                b2 b2Var = (b2) this.C;
                i1 i1Var = b2Var.f;
                f0.i iVar2 = (f0.i) this.D;
                ((Integer) obj3).getClass();
                g0 g0Var7 = (l1.j) obj2;
                g0Var7.c0(-2137546592);
                boolean z8 = ((q1) i1Var.getValue()) == q1.A || !(g0Var7.k(o1.n) == y3.m.B);
                boolean zG3 = g0Var7.g(b2Var);
                Object objN4 = g0Var7.N();
                l1.c cVar = l1.i.a;
                if (zG3 || objN4 == cVar) {
                    objN4 = new q0.a(b2Var, 2);
                    g0Var7.n0(objN4);
                }
                z0 z0VarG = q.G((u00.k) objN4, g0Var7);
                Object objN5 = g0Var7.N();
                if (objN5 == cVar) {
                    d0.n nVar3 = new d0.n(new o2(z0VarG, 0));
                    g0Var7.n0(nVar3);
                    objN5 = nVar3;
                }
                n2 n2Var = (n2) objN5;
                boolean zG4 = g0Var7.g(n2Var) | g0Var7.g(b2Var);
                Object objN6 = g0Var7.N();
                if (zG4 || objN6 == cVar) {
                    objN6 = new a2(n2Var, b2Var);
                    g0Var7.n0(objN6);
                }
                r rVarB = e2.b(b2.o.A, (a2) objN6, (q1) i1Var.getValue(), this.B && b2Var.b.h() != 0.0f, z8, iVar2);
                g0Var7.r(false);
                return rVarB;
            case 4:
                lo.k kVar2 = (lo.k) this.C;
                u00.k kVar3 = (u00.k) this.D;
                j0.b item = (j0.b) obj;
                g0 g0Var8 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var9 = g0Var8;
                if (!g0Var9.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    g0Var9.V();
                } else if (this.B) {
                    g0Var9.c0(1747414223);
                    z.g(kVar2, kVar3, g0Var8, 0);
                    g0Var9.r(false);
                } else {
                    g0Var9.c0(1747499349);
                    z.d(kVar2, kVar3, g0Var8, 0);
                    g0Var9.r(false);
                }
                return g00.b0.a;
            default:
                j3.k kVar4 = (j3.k) this.D;
                u00.a aVar5 = (u00.a) this.C;
                r composed = (r) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(composed, "$this$composed");
                g0 g0Var10 = (l1.j) obj2;
                g0Var10.c0(194720286);
                Object objN7 = g0Var10.N();
                if (objN7 == l1.i.a) {
                    objN7 = w.c.g(g0Var10);
                }
                r rVarA = androidx.compose.foundation.b.a(composed, (f0.i) objN7, (v0) null, this.B, kVar4, aVar5);
                g0Var10.r(false);
                return rVarA;
        }
    }
}
