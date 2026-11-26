package lp;

import b2.r;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.z6;
import h0.a0;
import h0.c1;
import h0.t1;
import h0.v;
import h0.v1;
import h0.w;
import h0.z1;
import jp.x;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import m3.r0;
import q0.i1;
import q3.u;
import u00.o;
import w.c0;
import w.x0;
import w.y0;
import z2.w0;

public final class a implements o {
    public final int A;
    public final boolean B;
    public final Object C;
    public final u00.k D;
    public final boolean E;
    public final g2.l F;
    public final u30.f G;
    public final String H;
    public final boolean I;
    public final p2 J;

    public a(boolean z, x xVar, u00.k kVar, boolean z2, g2.l lVar, u30.f fVar, String str, boolean z3, p2 p2Var, int i) {
        this.A = i;
        this.B = z;
        this.C = xVar;
        this.D = kVar;
        this.E = z2;
        this.F = lVar;
        this.G = fVar;
        this.H = str;
        this.I = z3;
        this.J = p2Var;
    }

    public a(boolean z, wy.o oVar, u00.k kVar, g2.l lVar, boolean z2, boolean z3, p2 p2Var, u30.f fVar, String str) {
        this.A = 2;
        this.B = z;
        this.C = oVar;
        this.D = kVar;
        this.F = lVar;
        this.E = z2;
        this.I = z3;
        this.J = p2Var;
        this.G = fVar;
        this.H = str;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar;
        r rVar2;
        int i;
        boolean z;
        r rVar3;
        g0 g0Var;
        boolean z2;
        Object obj4;
        boolean zI;
        Object objN;
        Object obj5;
        boolean zG;
        Object objN2;
        Object obj6;
        boolean zG2;
        Object objN3;
        switch (this.A) {
            case 0:
                x xVar = (x) this.C;
                w AuthScreenScaffold = (w) obj;
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b2.g gVar = b2.b.M;
                m.e(AuthScreenScaffold, "$this$AuthScreenScaffold");
                boolean z3 = (iIntValue & 17) != 16;
                g0 g0Var2 = (g0) jVar;
                a30.x xVar2 = g0Var2.a;
                if (g0Var2.S(iIntValue & 1, z3)) {
                    String strU = z3.U(jVar, 2131886160);
                    long j = dl.a.n;
                    boolean z4 = this.B;
                    z6.b(strU, (r) null, j, z4 ? kh.o.z(28) : kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 0, false, 0, 0, (u00.k) null, (r0) null, jVar, 1572864, 48, 260010);
                    r rVar4 = b2.o.A;
                    h0.c.h(z1.e(rVar4, 8), jVar);
                    final u00.k kVar = this.D;
                    boolean z5 = this.E;
                    final g2.l lVar = this.F;
                    String str = this.H;
                    boolean z6 = this.I;
                    final p2 p2Var = this.J;
                    Object obj7 = l1.i.a;
                    if (z4) {
                        g0Var2.c0(682402720);
                        r rVarD = z1.d(rVar4, 1.0f);
                        v vVarA = h0.u.a(h0.i.g(4), gVar, jVar, 6);
                        int iHashCode = Long.hashCode(g0Var2.T);
                        m1 m1VarM = g0Var2.m();
                        r rVarC = b2.a.c(rVarD, jVar);
                        b3.i.c.getClass();
                        b3.g gVar2 = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar2);
                        } else {
                            g0Var2.q0();
                        }
                        b3.f fVar = b3.h.f;
                        q.I(vVarA, jVar, fVar);
                        b3.f fVar2 = b3.h.e;
                        q.I(m1VarM, jVar, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b3.f fVar3 = b3.h.g;
                        q.I(numValueOf, jVar, fVar3);
                        b3.e eVar = b3.h.h;
                        q.E(jVar, eVar);
                        b3.f fVar4 = b3.h.d;
                        q.I(rVarC, jVar, fVar4);
                        r rVarD2 = z1.d(rVar4, 1.0f);
                        v1 v1VarA = t1.a(h0.i.g(16), b2.b.J, jVar, 6);
                        int iHashCode2 = Long.hashCode(g0Var2.T);
                        m1 m1VarM2 = g0Var2.m();
                        r rVarC2 = b2.a.c(rVarD2, jVar);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar2);
                        } else {
                            g0Var2.q0();
                        }
                        q.I(v1VarA, jVar, fVar);
                        q.I(m1VarM2, jVar, fVar2);
                        x5.u(iHashCode2, jVar, fVar3, jVar, eVar);
                        q.I(rVarC2, jVar, fVar4);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        c1 c1Var = new c1(1.0f, true);
                        String str2 = xVar.r;
                        String strU2 = z3.U(jVar, 2131886205);
                        r3.q qVar = new r3.q();
                        i1 i1Var = new i1(0, 7, 6, 115);
                        boolean zG3 = g0Var2.g(kVar);
                        Object objN4 = g0Var2.N();
                        if (zG3 || objN4 == obj7) {
                            objN4 = new hv.j(18, kVar);
                            g0Var2.n0(objN4);
                        }
                        u00.k kVar2 = (u00.k) objN4;
                        boolean zI2 = g0Var2.i(lVar);
                        Object objN5 = g0Var2.N();
                        if (zI2 || objN5 == obj7) {
                            final int i2 = 0;
                            objN5 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            lVar.h(1, true);
                                            break;
                                        case 1:
                                            lVar.h(1, true);
                                            break;
                                        case 2:
                                            lVar.h(1, true);
                                            break;
                                        case 3:
                                            lVar.h(1, true);
                                            break;
                                        case 4:
                                            lVar.h(1, true);
                                            break;
                                        case 5:
                                            lVar.h(1, true);
                                            break;
                                        default:
                                            lVar.h(1, true);
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var2.n0(objN5);
                        }
                        up.i.e(str2, kVar2, c1Var, strU2, null, false, z5, false, true, qVar, i1Var, (u00.a) objN5, null, null, null, jVar, 805306368, 48, 57776);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        c1 c1Var2 = new c1(1.0f, true);
                        String str3 = xVar.s;
                        String strU3 = z3.U(jVar, 2131886204);
                        r3.q qVar2 = new r3.q();
                        i1 i1Var2 = new i1(0, 7, 7, 115);
                        boolean zG4 = g0Var2.g(kVar);
                        Object objN6 = g0Var2.N();
                        if (zG4 || objN6 == obj7) {
                            objN6 = new hv.j(19, kVar);
                            g0Var2.n0(objN6);
                        }
                        u00.k kVar3 = (u00.k) objN6;
                        boolean zG5 = g0Var2.g(p2Var) | g0Var2.g(kVar);
                        Object objN7 = g0Var2.N();
                        if (zG5 || objN7 == obj7) {
                            final int i3 = 0;
                            objN7 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.f.a);
                                            }
                                            break;
                                        case 1:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.f.a);
                                            }
                                            break;
                                        case 2:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.r.a);
                                            }
                                            break;
                                        case 3:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.r.a);
                                            }
                                            break;
                                        case 4:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(wy.b.a);
                                            }
                                            break;
                                        default:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(wy.b.a);
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var2.n0(objN7);
                        }
                        up.i.e(str3, kVar3, c1Var2, strU3, null, false, z6, false, true, qVar2, i1Var2, (u00.a) objN7, null, null, null, jVar, 805306368, 48, 57776);
                        g0Var2.r(true);
                        f.b(str, jVar, 0);
                        g0Var2.r(true);
                        g0Var2.r(false);
                        rVar = rVar4;
                    } else {
                        g0Var2.c0(684619499);
                        rVar = rVar4;
                        r rVarD3 = z1.d(rVar, 1.0f);
                        String str4 = xVar.r;
                        String strU4 = z3.U(jVar, 2131886205);
                        r3.q qVar3 = new r3.q();
                        i1 i1Var3 = new i1(0, 7, 6, 115);
                        boolean zG6 = g0Var2.g(kVar);
                        Object objN8 = g0Var2.N();
                        if (zG6 || objN8 == obj7) {
                            objN8 = new hv.j(20, kVar);
                            g0Var2.n0(objN8);
                        }
                        u00.k kVar4 = (u00.k) objN8;
                        boolean zI3 = g0Var2.i(lVar);
                        Object objN9 = g0Var2.N();
                        if (zI3 || objN9 == obj7) {
                            final int i4 = 1;
                            objN9 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            lVar.h(1, true);
                                            break;
                                        case 1:
                                            lVar.h(1, true);
                                            break;
                                        case 2:
                                            lVar.h(1, true);
                                            break;
                                        case 3:
                                            lVar.h(1, true);
                                            break;
                                        case 4:
                                            lVar.h(1, true);
                                            break;
                                        case 5:
                                            lVar.h(1, true);
                                            break;
                                        default:
                                            lVar.h(1, true);
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var2.n0(objN9);
                        }
                        up.i.e(str4, kVar4, rVarD3, strU4, null, false, z5, false, true, qVar3, i1Var3, (u00.a) objN9, null, null, null, jVar, 805306752, 48, 57776);
                        jVar = jVar;
                        r rVarD4 = z1.d(rVar, 1.0f);
                        v vVarA2 = h0.u.a(h0.i.g(4), gVar, jVar, 6);
                        int iHashCode3 = Long.hashCode(g0Var2.T);
                        m1 m1VarM3 = g0Var2.m();
                        r rVarC3 = b2.a.c(rVarD4, jVar);
                        b3.i.c.getClass();
                        b3.g gVar3 = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar3);
                        } else {
                            g0Var2.q0();
                        }
                        q.I(vVarA2, jVar, b3.h.f);
                        q.I(m1VarM3, jVar, b3.h.e);
                        q.I(Integer.valueOf(iHashCode3), jVar, b3.h.g);
                        q.E(jVar, b3.h.h);
                        q.I(rVarC3, jVar, b3.h.d);
                        r rVarD5 = z1.d(rVar, 1.0f);
                        String str5 = xVar.s;
                        String strU5 = z3.U(jVar, 2131886204);
                        r3.q qVar4 = new r3.q();
                        i1 i1Var4 = new i1(0, 7, 7, 115);
                        boolean zG7 = g0Var2.g(kVar);
                        Object objN10 = g0Var2.N();
                        if (zG7 || objN10 == obj7) {
                            objN10 = new hv.j(21, kVar);
                            g0Var2.n0(objN10);
                        }
                        u00.k kVar5 = (u00.k) objN10;
                        boolean zG8 = g0Var2.g(p2Var) | g0Var2.g(kVar);
                        Object objN11 = g0Var2.N();
                        if (zG8 || objN11 == obj7) {
                            final int i5 = 1;
                            objN11 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.f.a);
                                            }
                                            break;
                                        case 1:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.f.a);
                                            }
                                            break;
                                        case 2:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.r.a);
                                            }
                                            break;
                                        case 3:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(jp.r.a);
                                            }
                                            break;
                                        case 4:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(wy.b.a);
                                            }
                                            break;
                                        default:
                                            if (((Boolean) p2Var.getValue()).booleanValue()) {
                                                kVar.invoke(wy.b.a);
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var2.n0(objN11);
                        }
                        up.i.e(str5, kVar5, rVarD5, strU5, null, false, z6, false, true, qVar4, i1Var4, (u00.a) objN11, null, null, null, jVar, 805306752, 48, 57776);
                        f.b(str, jVar, 0);
                        g0Var2.r(true);
                        g0Var2.r(false);
                    }
                    y3.h(this.G, z1.d(rVar, 1.0f), z4, jVar, 48);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                x xVar3 = (x) this.C;
                w AuthScreenScaffold2 = (w) obj;
                l1.j jVar2 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b2.g gVar4 = b2.b.M;
                m.e(AuthScreenScaffold2, "$this$AuthScreenScaffold");
                boolean z7 = (iIntValue2 & 17) != 16;
                g0 g0Var3 = (g0) jVar2;
                a30.x xVar4 = g0Var3.a;
                if (g0Var3.S(iIntValue2 & 1, z7)) {
                    String strU6 = z3.U(jVar2, 2131886198);
                    long j2 = dl.a.n;
                    boolean z8 = this.B;
                    z6.b(strU6, (r) null, j2, z8 ? kh.o.z(28) : kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1572864, 48, 260010);
                    r rVar5 = b2.o.A;
                    h0.c.h(z1.e(rVar5, 8), jVar2);
                    final u00.k kVar6 = this.D;
                    boolean z9 = this.E;
                    final g2.l lVar2 = this.F;
                    String str6 = this.H;
                    boolean z11 = this.I;
                    final p2 p2Var2 = this.J;
                    Object obj8 = l1.i.a;
                    if (z8) {
                        g0Var3.c0(1519374723);
                        r rVarD6 = z1.d(rVar5, 1.0f);
                        v vVarA3 = h0.u.a(h0.i.g(4), gVar4, jVar2, 6);
                        int iHashCode4 = Long.hashCode(g0Var3.T);
                        m1 m1VarM4 = g0Var3.m();
                        r rVarC4 = b2.a.c(rVarD6, jVar2);
                        b3.i.c.getClass();
                        b3.g gVar5 = b3.h.b;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar5);
                        } else {
                            g0Var3.q0();
                        }
                        b3.f fVar5 = b3.h.f;
                        q.I(vVarA3, jVar2, fVar5);
                        b3.f fVar6 = b3.h.e;
                        q.I(m1VarM4, jVar2, fVar6);
                        Integer numValueOf2 = Integer.valueOf(iHashCode4);
                        b3.f fVar7 = b3.h.g;
                        q.I(numValueOf2, jVar2, fVar7);
                        b3.e eVar2 = b3.h.h;
                        q.E(jVar2, eVar2);
                        b3.f fVar8 = b3.h.d;
                        q.I(rVarC4, jVar2, fVar8);
                        r rVarD7 = z1.d(rVar5, 1.0f);
                        v1 v1VarA2 = t1.a(h0.i.g(16), b2.b.J, jVar2, 6);
                        int iHashCode5 = Long.hashCode(g0Var3.T);
                        m1 m1VarM5 = g0Var3.m();
                        r rVarC5 = b2.a.c(rVarD7, jVar2);
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar5);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(v1VarA2, jVar2, fVar5);
                        q.I(m1VarM5, jVar2, fVar6);
                        x5.u(iHashCode5, jVar2, fVar7, jVar2, eVar2);
                        q.I(rVarC5, jVar2, fVar8);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        c1 c1Var3 = new c1(1.0f, true);
                        String str7 = xVar3.r;
                        String strU7 = z3.U(jVar2, 2131886196);
                        r3.q qVar5 = new r3.q();
                        i1 i1Var5 = new i1(0, 7, 6, 115);
                        boolean zG9 = g0Var3.g(kVar6);
                        Object objN12 = g0Var3.N();
                        if (zG9 || objN12 == obj8) {
                            objN12 = new hv.j(29, kVar6);
                            g0Var3.n0(objN12);
                        }
                        u00.k kVar7 = (u00.k) objN12;
                        boolean zI4 = g0Var3.i(lVar2);
                        Object objN13 = g0Var3.N();
                        if (zI4 || objN13 == obj8) {
                            final int i6 = 2;
                            objN13 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            lVar2.h(1, true);
                                            break;
                                        case 1:
                                            lVar2.h(1, true);
                                            break;
                                        case 2:
                                            lVar2.h(1, true);
                                            break;
                                        case 3:
                                            lVar2.h(1, true);
                                            break;
                                        case 4:
                                            lVar2.h(1, true);
                                            break;
                                        case 5:
                                            lVar2.h(1, true);
                                            break;
                                        default:
                                            lVar2.h(1, true);
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var3.n0(objN13);
                        }
                        up.i.e(str7, kVar7, c1Var3, strU7, null, false, z9, false, true, qVar5, i1Var5, (u00.a) objN13, null, null, null, jVar2, 805306368, 48, 57776);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        c1 c1Var4 = new c1(1.0f, true);
                        String str8 = xVar3.s;
                        String strU8 = z3.U(jVar2, 2131886204);
                        boolean z12 = z11 || xVar3.t != null;
                        r3.q qVar6 = new r3.q();
                        i1 i1Var6 = new i1(0, 7, 7, 115);
                        boolean zG10 = g0Var3.g(kVar6);
                        Object objN14 = g0Var3.N();
                        if (zG10 || objN14 == obj8) {
                            objN14 = new k(0, kVar6);
                            g0Var3.n0(objN14);
                        }
                        u00.k kVar8 = (u00.k) objN14;
                        boolean zG11 = g0Var3.g(p2Var2) | g0Var3.g(kVar6);
                        Object objN15 = g0Var3.N();
                        if (zG11 || objN15 == obj8) {
                            final int i7 = 2;
                            objN15 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.f.a);
                                            }
                                            break;
                                        case 1:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.f.a);
                                            }
                                            break;
                                        case 2:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.r.a);
                                            }
                                            break;
                                        case 3:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.r.a);
                                            }
                                            break;
                                        case 4:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(wy.b.a);
                                            }
                                            break;
                                        default:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(wy.b.a);
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var3.n0(objN15);
                        }
                        up.i.e(str8, kVar8, c1Var4, strU8, null, false, z12, false, true, qVar6, i1Var6, (u00.a) objN15, null, null, null, jVar2, 805306368, 48, 57776);
                        g0Var3.r(true);
                        l.b(str6, jVar2, 0);
                        g0Var3.r(true);
                        g0Var3.r(false);
                        rVar2 = rVar5;
                    } else {
                        g0Var3.c0(1521626222);
                        rVar2 = rVar5;
                        r rVarD8 = z1.d(rVar2, 1.0f);
                        String str9 = xVar3.r;
                        String strU9 = z3.U(jVar2, 2131886196);
                        r3.q qVar7 = new r3.q();
                        i1 i1Var7 = new i1(0, 7, 6, 115);
                        boolean zG12 = g0Var3.g(kVar6);
                        Object objN16 = g0Var3.N();
                        if (zG12 || objN16 == obj8) {
                            objN16 = new k(1, kVar6);
                            g0Var3.n0(objN16);
                        }
                        u00.k kVar9 = (u00.k) objN16;
                        boolean zI5 = g0Var3.i(lVar2);
                        Object objN17 = g0Var3.N();
                        if (zI5 || objN17 == obj8) {
                            final int i8 = 3;
                            objN17 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i8) {
                                        case 0:
                                            lVar2.h(1, true);
                                            break;
                                        case 1:
                                            lVar2.h(1, true);
                                            break;
                                        case 2:
                                            lVar2.h(1, true);
                                            break;
                                        case 3:
                                            lVar2.h(1, true);
                                            break;
                                        case 4:
                                            lVar2.h(1, true);
                                            break;
                                        case 5:
                                            lVar2.h(1, true);
                                            break;
                                        default:
                                            lVar2.h(1, true);
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var3.n0(objN17);
                        }
                        up.i.e(str9, kVar9, rVarD8, strU9, null, false, z9, false, true, qVar7, i1Var7, (u00.a) objN17, null, null, null, jVar2, 805306752, 48, 57776);
                        jVar2 = jVar2;
                        r rVarD9 = z1.d(rVar2, 1.0f);
                        v vVarA4 = h0.u.a(h0.i.g(4), gVar4, jVar2, 6);
                        int iHashCode6 = Long.hashCode(g0Var3.T);
                        m1 m1VarM6 = g0Var3.m();
                        r rVarC6 = b2.a.c(rVarD9, jVar2);
                        b3.i.c.getClass();
                        b3.g gVar6 = b3.h.b;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar6);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(vVarA4, jVar2, b3.h.f);
                        q.I(m1VarM6, jVar2, b3.h.e);
                        q.I(Integer.valueOf(iHashCode6), jVar2, b3.h.g);
                        q.E(jVar2, b3.h.h);
                        q.I(rVarC6, jVar2, b3.h.d);
                        r rVarD10 = z1.d(rVar2, 1.0f);
                        String str10 = xVar3.s;
                        String strU10 = z3.U(jVar2, 2131886204);
                        boolean z13 = z11 || xVar3.t != null;
                        r3.q qVar8 = new r3.q();
                        i1 i1Var8 = new i1(0, 7, 7, 115);
                        boolean zG13 = g0Var3.g(kVar6);
                        Object objN18 = g0Var3.N();
                        if (zG13 || objN18 == obj8) {
                            objN18 = new k(2, kVar6);
                            g0Var3.n0(objN18);
                        }
                        u00.k kVar10 = (u00.k) objN18;
                        boolean zG14 = g0Var3.g(p2Var2) | g0Var3.g(kVar6);
                        Object objN19 = g0Var3.N();
                        if (zG14 || objN19 == obj8) {
                            final int i9 = 3;
                            objN19 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i9) {
                                        case 0:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.f.a);
                                            }
                                            break;
                                        case 1:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.f.a);
                                            }
                                            break;
                                        case 2:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.r.a);
                                            }
                                            break;
                                        case 3:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(jp.r.a);
                                            }
                                            break;
                                        case 4:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(wy.b.a);
                                            }
                                            break;
                                        default:
                                            if (((Boolean) p2Var2.getValue()).booleanValue()) {
                                                kVar6.invoke(wy.b.a);
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var3.n0(objN19);
                        }
                        up.i.e(str10, kVar10, rVarD10, strU10, null, false, z13, false, true, qVar8, i1Var8, (u00.a) objN19, null, null, null, jVar2, 805306752, 48, 57776);
                        l.b(str6, jVar2, 0);
                        g0Var3.r(true);
                        g0Var3.r(false);
                    }
                    y3.h(this.G, z1.d(rVar2, 1.0f), z8, jVar2, 48);
                } else {
                    g0Var3.V();
                }
                break;
            default:
                wy.o oVar = (wy.o) this.C;
                w AuthScreenScaffold3 = (w) obj;
                g0 g0Var4 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                m.e(AuthScreenScaffold3, "$this$AuthScreenScaffold");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= g0Var4.g(AuthScreenScaffold3) ? 4 : 2;
                }
                int i11 = iIntValue3;
                boolean z14 = (i11 & 19) != 18;
                g0 g0Var5 = g0Var4;
                a30.x xVar5 = g0Var5.a;
                if (g0Var5.S(i11 & 1, z14)) {
                    String strU11 = z3.U(g0Var4, 2131887208);
                    long j3 = dl.a.n;
                    boolean z15 = this.B;
                    z6.b(strU11, (r) null, j3, z15 ? kh.o.z(24) : kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, z15 ? kh.o.z(24) : kh.o.z(32), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1572864, 0, 260010);
                    r rVar6 = b2.o.A;
                    h0.c.h(z1.e(rVar6, 8), g0Var4);
                    r rVarD11 = z1.d(rVar6, 1.0f);
                    String str11 = oVar.a;
                    String str12 = oVar.d;
                    String str13 = oVar.c;
                    String strU12 = z3.U(g0Var4, 2131887249);
                    String str14 = oVar.b;
                    boolean z16 = str14 != null;
                    r3.q qVar9 = new r3.q();
                    i1 i1Var9 = new i1(0, 7, 6, 115);
                    final u00.k kVar11 = this.D;
                    boolean zG15 = g0Var5.g(kVar11);
                    Object objN20 = g0Var5.N();
                    Object obj9 = l1.i.a;
                    if (zG15 || objN20 == obj9) {
                        objN20 = new rx.c(19, kVar11);
                        g0Var5.n0(objN20);
                    }
                    u00.k kVar12 = (u00.k) objN20;
                    final g2.l lVar3 = this.F;
                    boolean zI6 = g0Var5.i(lVar3);
                    Object objN21 = g0Var5.N();
                    if (zI6 || objN21 == obj9) {
                        final int i12 = 6;
                        objN21 = new u00.a() {
                            @Override
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        lVar3.h(1, true);
                                        break;
                                    case 1:
                                        lVar3.h(1, true);
                                        break;
                                    case 2:
                                        lVar3.h(1, true);
                                        break;
                                    case 3:
                                        lVar3.h(1, true);
                                        break;
                                    case 4:
                                        lVar3.h(1, true);
                                        break;
                                    case 5:
                                        lVar3.h(1, true);
                                        break;
                                    default:
                                        lVar3.h(1, true);
                                        break;
                                }
                                return b0.a;
                            }
                        };
                        g0Var5.n0(objN21);
                    }
                    up.i.e(str11, kVar12, rVarD11, strU12, str14, true, z16, false, false, qVar9, i1Var9, (u00.a) objN21, null, null, null, g0Var4, 196992, 48, 58240);
                    boolean z17 = this.E;
                    boolean z18 = this.I;
                    final p2 p2Var3 = this.J;
                    if (z15) {
                        g0Var5.c0(1892235122);
                        r rVarD12 = z1.d(rVar6, 1.0f);
                        v1 v1VarA3 = t1.a(h0.i.g(12), b2.b.J, g0Var4, 6);
                        int iHashCode7 = Long.hashCode(g0Var5.T);
                        m1 m1VarM7 = g0Var5.m();
                        r rVarC7 = b2.a.c(rVarD12, g0Var4);
                        b3.i.c.getClass();
                        b3.g gVar7 = b3.h.b;
                        g0Var5.g0();
                        if (g0Var5.S) {
                            g0Var5.l(gVar7);
                        } else {
                            g0Var5.q0();
                        }
                        q.I(v1VarA3, g0Var4, b3.h.f);
                        q.I(m1VarM7, g0Var4, b3.h.e);
                        q.I(Integer.valueOf(iHashCode7), g0Var4, b3.h.g);
                        q.E(g0Var4, b3.h.h);
                        q.I(rVarC7, g0Var4, b3.h.d);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        c1 c1Var5 = new c1(1.0f, true);
                        String strU13 = z3.U(g0Var4, 2131886196);
                        r3.q qVar10 = new r3.q();
                        i1 i1Var10 = new i1(0, 7, 6, 115);
                        boolean zG16 = g0Var5.g(kVar11);
                        Object objN22 = g0Var5.N();
                        if (zG16) {
                            obj4 = obj9;
                        } else {
                            obj4 = obj9;
                            if (objN22 == obj4) {
                            }
                            u00.k kVar13 = (u00.k) objN22;
                            zI = g0Var5.i(lVar3);
                            objN = g0Var5.N();
                            if (zI || objN == obj4) {
                                final int i13 = 4;
                                objN = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        switch (i13) {
                                            case 0:
                                                lVar3.h(1, true);
                                                break;
                                            case 1:
                                                lVar3.h(1, true);
                                                break;
                                            case 2:
                                                lVar3.h(1, true);
                                                break;
                                            case 3:
                                                lVar3.h(1, true);
                                                break;
                                            case 4:
                                                lVar3.h(1, true);
                                                break;
                                            case 5:
                                                lVar3.h(1, true);
                                                break;
                                            default:
                                                lVar3.h(1, true);
                                                break;
                                        }
                                        return b0.a;
                                    }
                                };
                                g0Var5.n0(objN);
                            }
                            obj5 = obj4;
                            i = 12;
                            z = z15;
                            up.i.e(str13, kVar13, c1Var5, strU13, null, false, z17, false, true, qVar10, i1Var10, (u00.a) objN, null, null, null, g0Var4, 805306368, 48, 57776);
                            if (1.0f <= 0.0d) {
                                i0.a.a("invalid weight; must be greater than zero");
                            }
                            c1 c1Var6 = new c1(1.0f, true);
                            String strU14 = z3.U(g0Var4, 2131887211);
                            r3.q qVar11 = new r3.q();
                            i1 i1Var11 = new i1(0, 7, 7, 115);
                            zG = g0Var5.g(kVar11);
                            objN2 = g0Var5.N();
                            if (zG) {
                                obj6 = obj5;
                            } else {
                                obj6 = obj5;
                                if (objN2 == obj6) {
                                }
                                u00.k kVar14 = (u00.k) objN2;
                                zG2 = g0Var5.g(p2Var3) | g0Var5.g(kVar11);
                                objN3 = g0Var5.N();
                                if (zG2 || objN3 == obj6) {
                                    final int i14 = 4;
                                    objN3 = new u00.a() {
                                        @Override
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                        kVar11.invoke(jp.f.a);
                                                    }
                                                    break;
                                                case 1:
                                                    if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                        kVar11.invoke(jp.f.a);
                                                    }
                                                    break;
                                                case 2:
                                                    if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                        kVar11.invoke(jp.r.a);
                                                    }
                                                    break;
                                                case 3:
                                                    if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                        kVar11.invoke(jp.r.a);
                                                    }
                                                    break;
                                                case 4:
                                                    if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                        kVar11.invoke(wy.b.a);
                                                    }
                                                    break;
                                                default:
                                                    if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                        kVar11.invoke(wy.b.a);
                                                    }
                                                    break;
                                            }
                                            return b0.a;
                                        }
                                    };
                                    g0Var5.n0(objN3);
                                }
                                up.i.e(str12, kVar14, c1Var6, strU14, null, false, z18, false, true, qVar11, i1Var11, (u00.a) objN3, null, null, null, g0Var4, 805306368, 48, 57776);
                                g0Var = g0Var4;
                                g0Var5.r(true);
                                g0Var5.r(false);
                                z2 = false;
                                rVar3 = rVar6;
                            }
                            objN2 = new rx.c(16, kVar11);
                            g0Var5.n0(objN2);
                            u00.k kVar15 = (u00.k) objN2;
                            zG2 = g0Var5.g(p2Var3) | g0Var5.g(kVar11);
                            objN3 = g0Var5.N();
                            if (zG2) {
                                final int i15 = 4;
                                objN3 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 1:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 2:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 3:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 4:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                            default:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                        }
                                        return b0.a;
                                    }
                                };
                                g0Var5.n0(objN3);
                            } else {
                                final int i16 = 4;
                                objN3 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        switch (i16) {
                                            case 0:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 1:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 2:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 3:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 4:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                            default:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                        }
                                        return b0.a;
                                    }
                                };
                                g0Var5.n0(objN3);
                            }
                            up.i.e(str12, kVar15, c1Var6, strU14, null, false, z18, false, true, qVar11, i1Var11, (u00.a) objN3, null, null, null, g0Var4, 805306368, 48, 57776);
                            g0Var = g0Var4;
                            g0Var5.r(true);
                            g0Var5.r(false);
                            z2 = false;
                            rVar3 = rVar6;
                        }
                        objN22 = new rx.c(20, kVar11);
                        g0Var5.n0(objN22);
                        u00.k kVar16 = (u00.k) objN22;
                        zI = g0Var5.i(lVar3);
                        objN = g0Var5.N();
                        if (zI) {
                            final int i17 = 4;
                            objN = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            lVar3.h(1, true);
                                            break;
                                        case 1:
                                            lVar3.h(1, true);
                                            break;
                                        case 2:
                                            lVar3.h(1, true);
                                            break;
                                        case 3:
                                            lVar3.h(1, true);
                                            break;
                                        case 4:
                                            lVar3.h(1, true);
                                            break;
                                        case 5:
                                            lVar3.h(1, true);
                                            break;
                                        default:
                                            lVar3.h(1, true);
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var5.n0(objN);
                        } else {
                            final int i18 = 4;
                            objN = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            lVar3.h(1, true);
                                            break;
                                        case 1:
                                            lVar3.h(1, true);
                                            break;
                                        case 2:
                                            lVar3.h(1, true);
                                            break;
                                        case 3:
                                            lVar3.h(1, true);
                                            break;
                                        case 4:
                                            lVar3.h(1, true);
                                            break;
                                        case 5:
                                            lVar3.h(1, true);
                                            break;
                                        default:
                                            lVar3.h(1, true);
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var5.n0(objN);
                        }
                        obj5 = obj4;
                        i = 12;
                        z = z15;
                        up.i.e(str13, kVar16, c1Var5, strU13, null, false, z17, false, true, qVar10, i1Var10, (u00.a) objN, null, null, null, g0Var4, 805306368, 48, 57776);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        c1 c1Var7 = new c1(1.0f, true);
                        String strU15 = z3.U(g0Var4, 2131887211);
                        r3.q qVar12 = new r3.q();
                        i1 i1Var12 = new i1(0, 7, 7, 115);
                        zG = g0Var5.g(kVar11);
                        objN2 = g0Var5.N();
                        if (zG) {
                            obj6 = obj5;
                            if (objN2 == obj6) {
                            }
                            u00.k kVar17 = (u00.k) objN2;
                            zG2 = g0Var5.g(p2Var3) | g0Var5.g(kVar11);
                            objN3 = g0Var5.N();
                            if (zG2) {
                                final int i19 = 4;
                                objN3 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 1:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 2:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 3:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 4:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                            default:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                        }
                                        return b0.a;
                                    }
                                };
                                g0Var5.n0(objN3);
                            } else {
                                final int i110 = 4;
                                objN3 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        switch (i110) {
                                            case 0:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 1:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.f.a);
                                                }
                                                break;
                                            case 2:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 3:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(jp.r.a);
                                                }
                                                break;
                                            case 4:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                            default:
                                                if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                    kVar11.invoke(wy.b.a);
                                                }
                                                break;
                                        }
                                        return b0.a;
                                    }
                                };
                                g0Var5.n0(objN3);
                            }
                            up.i.e(str12, kVar17, c1Var7, strU15, null, false, z18, false, true, qVar12, i1Var12, (u00.a) objN3, null, null, null, g0Var4, 805306368, 48, 57776);
                            g0Var = g0Var4;
                            g0Var5.r(true);
                            g0Var5.r(false);
                            z2 = false;
                            rVar3 = rVar6;
                        } else {
                            obj6 = obj5;
                        }
                        objN2 = new rx.c(16, kVar11);
                        g0Var5.n0(objN2);
                        u00.k kVar18 = (u00.k) objN2;
                        zG2 = g0Var5.g(p2Var3) | g0Var5.g(kVar11);
                        objN3 = g0Var5.N();
                        if (zG2) {
                            final int i111 = 4;
                            objN3 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i111) {
                                        case 0:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.f.a);
                                            }
                                            break;
                                        case 1:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.f.a);
                                            }
                                            break;
                                        case 2:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.r.a);
                                            }
                                            break;
                                        case 3:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.r.a);
                                            }
                                            break;
                                        case 4:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(wy.b.a);
                                            }
                                            break;
                                        default:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(wy.b.a);
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var5.n0(objN3);
                        } else {
                            final int i112 = 4;
                            objN3 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.f.a);
                                            }
                                            break;
                                        case 1:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.f.a);
                                            }
                                            break;
                                        case 2:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.r.a);
                                            }
                                            break;
                                        case 3:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.r.a);
                                            }
                                            break;
                                        case 4:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(wy.b.a);
                                            }
                                            break;
                                        default:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(wy.b.a);
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var5.n0(objN3);
                        }
                        up.i.e(str12, kVar18, c1Var7, strU15, null, false, z18, false, true, qVar12, i1Var12, (u00.a) objN3, null, null, null, g0Var4, 805306368, 48, 57776);
                        g0Var = g0Var4;
                        g0Var5.r(true);
                        g0Var5.r(false);
                        z2 = false;
                        rVar3 = rVar6;
                    } else {
                        i = 12;
                        z = z15;
                        g0Var5.c0(1894110994);
                        r rVarD13 = z1.d(rVar6, 1.0f);
                        String strU16 = z3.U(g0Var4, 2131886196);
                        r3.q qVar13 = new r3.q();
                        i1 i1Var13 = new i1(0, 7, 6, 115);
                        boolean zG17 = g0Var5.g(kVar11);
                        Object objN23 = g0Var5.N();
                        if (zG17 || objN23 == obj9) {
                            objN23 = new rx.c(17, kVar11);
                            g0Var5.n0(objN23);
                        }
                        u00.k kVar19 = (u00.k) objN23;
                        boolean zI7 = g0Var5.i(lVar3);
                        Object objN24 = g0Var5.N();
                        if (zI7 || objN24 == obj9) {
                            final int i21 = 5;
                            objN24 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i21) {
                                        case 0:
                                            lVar3.h(1, true);
                                            break;
                                        case 1:
                                            lVar3.h(1, true);
                                            break;
                                        case 2:
                                            lVar3.h(1, true);
                                            break;
                                        case 3:
                                            lVar3.h(1, true);
                                            break;
                                        case 4:
                                            lVar3.h(1, true);
                                            break;
                                        case 5:
                                            lVar3.h(1, true);
                                            break;
                                        default:
                                            lVar3.h(1, true);
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var5.n0(objN24);
                        }
                        rVar3 = rVar6;
                        up.i.e(str13, kVar19, rVarD13, strU16, null, false, z17, false, true, qVar13, i1Var13, (u00.a) objN24, null, null, null, g0Var4, 805306752, 48, 57776);
                        r rVarD14 = z1.d(rVar3, 1.0f);
                        String strU17 = z3.U(g0Var4, 2131887211);
                        r3.q qVar14 = new r3.q();
                        i1 i1Var14 = new i1(0, 7, 7, 115);
                        boolean zG18 = g0Var5.g(kVar11);
                        Object objN25 = g0Var5.N();
                        if (zG18 || objN25 == obj9) {
                            objN25 = new rx.c(18, kVar11);
                            g0Var5.n0(objN25);
                        }
                        u00.k kVar20 = (u00.k) objN25;
                        boolean zG19 = g0Var5.g(p2Var3) | g0Var5.g(kVar11);
                        Object objN26 = g0Var5.N();
                        if (zG19 || objN26 == obj9) {
                            final int i22 = 5;
                            objN26 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i22) {
                                        case 0:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.f.a);
                                            }
                                            break;
                                        case 1:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.f.a);
                                            }
                                            break;
                                        case 2:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.r.a);
                                            }
                                            break;
                                        case 3:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(jp.r.a);
                                            }
                                            break;
                                        case 4:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(wy.b.a);
                                            }
                                            break;
                                        default:
                                            if (((Boolean) p2Var3.getValue()).booleanValue()) {
                                                kVar11.invoke(wy.b.a);
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var5.n0(objN26);
                        }
                        up.i.e(str12, kVar20, rVarD14, strU17, null, false, z18, false, true, qVar14, i1Var14, (u00.a) objN26, null, null, null, g0Var4, 805306752, 48, 57776);
                        g0Var = g0Var4;
                        z2 = false;
                        g0Var5.r(false);
                    }
                    r rVarE = z1.e(z1.d(rVar3, 1.0f), 20);
                    w0 w0VarD = h0.o.d(b2.b.A, z2);
                    int iHashCode8 = Long.hashCode(g0Var5.T);
                    m1 m1VarM8 = g0Var5.m();
                    r rVarC8 = b2.a.c(rVarE, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar8 = b3.h.b;
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar8);
                    } else {
                        g0Var5.q0();
                    }
                    q.I(w0VarD, g0Var, b3.h.f);
                    q.I(m1VarM8, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC8, g0Var, b3.h.d);
                    boolean z19 = z2;
                    a0 a0Var = z1.c;
                    String str15 = this.H;
                    c0.b(AuthScreenScaffold3, str15 != null ? true : z19, a0Var, (x0) null, (y0) null, (String) null, v1.d.d(-2109173300, new fv.a(str15, 9), g0Var), g0Var, (i11 & 14) | 1573248, 28);
                    g0Var5.r(true);
                    y3.h(this.G, z1.d(rVar3, 1.0f), z, g0Var, 48);
                    String str16 = oVar.f;
                    if (str16 == null) {
                        g0Var5.c0(1896385680);
                        g0Var5.r(z19);
                    } else {
                        g0Var5.c0(1896385681);
                        z6.b(str16, (r) null, dl.a.U, kh.o.z(i), u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
                        g0Var5.r(z19);
                    }
                } else {
                    g0Var5.V();
                }
                break;
        }
        return b0.a;
    }
}
