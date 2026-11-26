package ez;

import as.d0;
import bt.t0;
import c3.l2;
import c3.t2;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.z6;
import h0.a0;
import h0.t1;
import h0.v;
import h0.v1;
import h0.w;
import h0.z1;
import i2.s0;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import jp.x;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.y0;
import l1.z0;
import m3.i0;
import m3.r0;
import q0.i1;
import z2.w0;

public final class n implements u00.o {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public n(l2 l2Var, ip.a aVar, boolean z, u00.a aVar2, v1.c cVar, b2.r rVar) {
        this.A = 3;
        this.E = l2Var;
        this.C = aVar;
        this.B = z;
        this.F = aVar2;
        this.G = cVar;
        this.D = rVar;
    }

    public n(ot.b bVar, boolean z, String str, String str2, u00.a aVar, u00.a aVar2) {
        this.A = 2;
        this.E = bVar;
        this.B = z;
        this.D = str;
        this.C = str2;
        this.F = aVar;
        this.G = aVar2;
    }

    public n(boolean z, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = z;
        this.E = obj;
        this.C = obj2;
        this.F = obj3;
        this.G = obj4;
        this.D = obj5;
    }

    public n(boolean z, xk.d dVar, Object obj, u00.k kVar, g2.t tVar, String str, int i) {
        this.A = i;
        this.B = z;
        this.E = dVar;
        this.F = obj;
        this.C = kVar;
        this.G = tVar;
        this.D = str;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g0 g0Var;
        b3.f fVar;
        u00.n nVar;
        g0 g0Var2;
        ?? r2;
        boolean z;
        b3.e eVar;
        String strU;
        b2.r rVarD;
        g0 g0Var3;
        switch (this.A) {
            case 0:
                t tVar = (t) this.E;
                u00.k kVar = (u00.k) this.C;
                p2 p2Var = (p2) this.F;
                t2 t2Var = (t2) this.G;
                String str = (String) this.D;
                w AuthScreenScaffold = (w) obj;
                g0 g0Var4 = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(AuthScreenScaffold, "$this$AuthScreenScaffold");
                g0 g0Var5 = g0Var4;
                if (g0Var5.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f = 8;
                    b2.o oVar = b2.o.A;
                    b2.r rVarG = h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13);
                    String strU2 = z3.U(g0Var4, 2131887248);
                    long j = dl.a.n;
                    boolean z2 = this.B;
                    z6.b(strU2, rVarG, j, z2 ? kh.o.z(24) : kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, z2 ? kh.o.z(24) : kh.o.z(32), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1572912, 0, 260008);
                    h0.c.h(z1.e(oVar, f), g0Var4);
                    b2.r rVarD2 = z1.d(oVar, 1.0f);
                    String str2 = tVar.a;
                    String strU3 = z3.U(g0Var4, 2131886195);
                    String str3 = tVar.b;
                    i1 i1Var = new i1(2, 0, 7, 118);
                    boolean zG = g0Var5.g(kVar);
                    Object objN = g0Var5.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new d0(15, kVar);
                        g0Var5.n0(objN);
                    }
                    u00.k kVar2 = (u00.k) objN;
                    boolean zG2 = g0Var5.g(p2Var) | g0Var5.g(t2Var) | g0Var5.g(kVar);
                    Object objN2 = g0Var5.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new o(t2Var, kVar, p2Var, 0);
                        g0Var5.n0(objN2);
                    }
                    up.i.e(str2, kVar2, rVarD2, strU3, str3, true, false, false, true, null, i1Var, (u00.a) objN2, null, null, null, g0Var4, 805503360, 48, 58816);
                    b2.r rVarD3 = z1.d(oVar, 1.0f);
                    ep.f fVar2 = tVar.e;
                    Object objN3 = g0Var5.N();
                    if (objN3 == obj4) {
                        objN3 = new e6.c(10);
                        g0Var5.n0(objN3);
                    }
                    pp.h.c(fVar2, (u00.k) objN3, rVarD3, false, g0Var4, 3504, 0);
                    b2.r rVarD4 = z1.d(oVar, 1.0f);
                    LocalDate localDate = tVar.f;
                    Object objN4 = g0Var5.N();
                    if (objN4 == obj4) {
                        objN4 = new e6.c(11);
                        g0Var5.n0(objN4);
                    }
                    pp.c.b(localDate, (u00.k) objN4, rVarD4, false, g0Var4, 3504, 0);
                    boolean zG3 = g0Var5.g(kVar);
                    Object objN5 = g0Var5.N();
                    if (zG3 || objN5 == obj4) {
                        objN5 = new t0(26, kVar);
                        g0Var5.n0(objN5);
                    }
                    a.a((u00.a) objN5, g0Var4, 0);
                    if (str == null) {
                        g0Var5.c0(-1975744606);
                        g0Var5.r(false);
                    } else {
                        g0Var5.c0(-1975744605);
                        z6.b(str, (b2.r) null, dl.a.U, kh.o.z(12), q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1597440, 0, 262058);
                        g0Var5.r(false);
                    }
                } else {
                    g0Var5.V();
                }
                return b0.a;
            case 1:
                xk.d dVar = (xk.d) this.E;
                x xVar = (x) this.F;
                u00.k kVar3 = (u00.k) this.C;
                g2.t tVar2 = (g2.t) this.G;
                String str4 = (String) this.D;
                w AuthScreenScaffold2 = (w) obj;
                g0 g0Var6 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(AuthScreenScaffold2, "$this$AuthScreenScaffold");
                g0 g0Var7 = g0Var6;
                if (g0Var7.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z6.b(z3.U(g0Var6, 2131886170), (b2.r) null, dl.a.n, this.B ? kh.o.z(28) : kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var6, 1572864, 48, 260010);
                    g0Var7.c0(156456129);
                    m3.e eVar2 = new m3.e();
                    List listW0 = r30.k.W0(z3.U(g0Var6, 2131886169), new String[]{"%1$s"}, 2);
                    Object obj5 = listW0.get(0);
                    kotlin.jvm.internal.m.d(obj5, "get(...)");
                    eVar2.b((String) obj5);
                    int iE = eVar2.e(new i0(dl.a.H, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534));
                    try {
                        String str5 = xVar.c;
                        boolean z3 = xVar.n;
                        eVar2.b(str5);
                        eVar2.d(iE);
                        if (listW0.size() > 1) {
                            Object obj6 = listW0.get(1);
                            kotlin.jvm.internal.m.d(obj6, "get(...)");
                            eVar2.b((String) obj6);
                        }
                        m3.h hVarF = eVar2.f();
                        g0Var7.r(false);
                        long j2 = dl.a.k;
                        long jB = i2.t.b(0.5f, j2);
                        long jZ = kh.o.z(15);
                        long jZ2 = kh.o.z(20);
                        q3.u uVar = q3.u.B;
                        z6.c(hVarF, (b2.r) null, jB, jZ, uVar, 0L, (x3.k) null, jZ2, 0, false, 0, 0, (Map) null, (u00.k) null, (r0) null, g0Var6, 1597440, 48, 522154);
                        b2.o oVar2 = b2.o.A;
                        h0.c.h(z1.e(oVar2, 8), g0Var6);
                        b2.r rVarV = c7.i.V(z1.d(oVar2, 1.0f), dVar, g0Var6);
                        String str6 = xVar.h;
                        boolean z4 = xVar.o;
                        boolean z5 = xVar.p;
                        boolean zG4 = g0Var7.g(kVar3);
                        Object objN6 = g0Var7.N();
                        Object obj7 = l1.i.a;
                        if (zG4 || objN6 == obj7) {
                            objN6 = new hv.j(23, kVar3);
                            g0Var7.n0(objN6);
                        }
                        np.a.b(str6, (u00.k) objN6, rVarV, null, z4, z5, tVar2, g0Var6, 12582960);
                        String str7 = xVar.q;
                        if (str7 == null) {
                            g0Var7.c0(556241026);
                            g0Var7.r(false);
                            g0Var = g0Var7;
                        } else {
                            g0Var7.c0(556241027);
                            g0Var = g0Var7;
                            z6.b(str7, (b2.r) null, dl.a.U, kh.o.z(12), uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var6, 1597440, 0, 262058);
                            g0Var.r(false);
                        }
                        boolean z6 = z3 && !xVar.a;
                        boolean zG5 = g0Var.g(kVar3);
                        Object objN7 = g0Var.N();
                        if (zG5 || objN7 == obj7) {
                            objN7 = new jz.t(12, kVar3);
                            g0Var.n0(objN7);
                        }
                        z6.b(str4, w50.c.o(oVar2, z6, null, (u00.a) objN7, 6), z3 ? dl.a.i : i2.t.b(0.5f, j2), kh.o.z(15), uVar, (q3.i) null, 0L, z3 ? x3.l.c : x3.l.b, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var6, 1597440, 0, 261544);
                    } catch (Throwable th) {
                        eVar2.d(iE);
                        throw th;
                    }
                } else {
                    g0Var7.V();
                }
                return b0.a;
            case 2:
                ot.b bVar = (ot.b) this.E;
                String str8 = (String) this.D;
                String str9 = (String) this.C;
                u00.a aVar = (u00.a) this.F;
                u00.a aVar2 = (u00.a) this.G;
                j0.b item = (j0.b) obj;
                g0 g0Var8 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var9 = g0Var8;
                if (g0Var9.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    st.j.i(bVar.b, this.B, str8, str9, aVar, aVar2, g0Var8, 0);
                } else {
                    g0Var9.V();
                }
                return b0.a;
            case 3:
                u2.a aVar3 = (u2.a) this.E;
                ip.a aVar4 = (ip.a) this.C;
                u00.a aVar5 = (u00.a) this.F;
                v1.c cVar = (v1.c) this.G;
                b2.r rVar = (b2.r) this.D;
                h0.t BoxWithConstraints = (h0.t) obj;
                g0 g0Var10 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                b2.i iVar = b2.b.E;
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= g0Var10.g(BoxWithConstraints) ? 4 : 2;
                }
                boolean z7 = (iIntValue4 & 19) != 18;
                g0 g0Var11 = g0Var10;
                a30.x xVar2 = g0Var11.a;
                if (g0Var11.S(iIntValue4 & 1, z7)) {
                    b2.o oVar3 = b2.o.A;
                    float f2 = 24;
                    b2.r rVarG2 = h0.c.G(h0.c.E(z1.e(z1.d(oVar3, 1.0f), BoxWithConstraints.b()), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7);
                    h0.d dVar2 = h0.i.c;
                    b2.g gVar = b2.b.M;
                    v vVarA = h0.u.a(dVar2, gVar, g0Var10, 0);
                    int iHashCode = Long.hashCode(g0Var11.T);
                    m1 m1VarM = g0Var11.m();
                    b2.r rVarC = b2.a.c(rVarG2, g0Var10);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var11.g0();
                    if (g0Var11.S) {
                        g0Var11.l(gVar2);
                    } else {
                        g0Var11.q0();
                    }
                    b3.f fVar3 = b3.h.f;
                    l1.q.I(vVarA, g0Var10, fVar3);
                    u00.n nVar2 = b3.h.e;
                    l1.q.I(m1VarM, g0Var10, nVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar4 = b3.h.g;
                    l1.q.I(numValueOf, g0Var10, fVar4);
                    b3.e eVar3 = b3.h.h;
                    l1.q.E(g0Var10, eVar3);
                    b3.f fVar5 = b3.h.d;
                    l1.q.I(rVarC, g0Var10, fVar5);
                    b2.r rVarE = z1.e(z1.d(oVar3, 1.0f), 76);
                    v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var10, 48);
                    int iHashCode2 = Long.hashCode(g0Var11.T);
                    m1 m1VarM2 = g0Var11.m();
                    b2.r rVarC2 = b2.a.c(rVarE, g0Var10);
                    g0Var11.g0();
                    if (g0Var11.S) {
                        g0Var11.l(gVar2);
                    } else {
                        g0Var11.q0();
                    }
                    l1.q.I(v1VarA, g0Var10, fVar3);
                    l1.q.I(m1VarM2, g0Var10, nVar2);
                    x5.u(iHashCode2, g0Var10, fVar4, g0Var10, eVar3);
                    l1.q.I(rVarC2, g0Var10, fVar5);
                    if (this.B) {
                        g0Var11.c0(308260644);
                        b2.r rVarN = w50.c.n(z.n.f(f2.h.c(z1.m(oVar3, 44), p0.f.a), i2.t.b(0.5f, dl.a.P), i2.b0.b), true, aVar5);
                        w0 w0VarD = h0.o.d(iVar, false);
                        int iHashCode3 = Long.hashCode(g0Var11.T);
                        m1 m1VarM3 = g0Var11.m();
                        b2.r rVarC3 = b2.a.c(rVarN, g0Var10);
                        g0Var11.g0();
                        if (g0Var11.S) {
                            g0Var11.l(gVar2);
                        } else {
                            g0Var11.q0();
                        }
                        l1.q.I(w0VarD, g0Var10, fVar3);
                        l1.q.I(m1VarM3, g0Var10, nVar2);
                        x5.u(iHashCode3, g0Var10, fVar4, g0Var10, eVar3);
                        l1.q.I(rVarC3, g0Var10, fVar5);
                        g0Var2 = g0Var11;
                        eVar = eVar3;
                        fVar = fVar4;
                        r2 = 1;
                        nVar = nVar2;
                        z3.j(y3.R(2131231078, g0Var10, 0), (String) null, (b2.r) null, dl.a.i, g0Var10, 56, 4);
                        g0Var2.r(true);
                        z = false;
                        g0Var2.r(false);
                    } else {
                        fVar = fVar4;
                        nVar = nVar2;
                        g0Var2 = g0Var11;
                        r2 = 1;
                        z = false;
                        eVar = eVar3;
                        g0Var2.c0(308915085);
                        g0Var2.r(false);
                    }
                    g0Var2.r((boolean) r2);
                    b2.r rVarG3 = h0.c.G(z.n.p(u2.f.a(w.a(z1.d(oVar3, 1.0f), 1.0f), aVar3, (u2.d) null), z.n.l(g0Var10), z, 14), 0.0f, 0.0f, 0.0f, up.f.a, 7);
                    v vVarA2 = h0.u.a(h0.i.g(8), gVar, g0Var10, 6);
                    int iHashCode4 = Long.hashCode(g0Var2.T);
                    m1 m1VarM4 = g0Var2.m();
                    b2.r rVarC4 = b2.a.c(rVarG3, g0Var10);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA2, g0Var10, fVar3);
                    l1.q.I(m1VarM4, g0Var10, nVar);
                    b3.f fVar6 = fVar;
                    x5.u(iHashCode4, g0Var10, fVar6, g0Var10, eVar);
                    l1.q.I(rVarC4, g0Var10, fVar5);
                    cVar.invoke(w.a, g0Var10, 6);
                    g0Var2.r((boolean) r2);
                    if (aVar4 != null) {
                        g0Var2.c0(334135773);
                        b2.r rVarD5 = z1.d(oVar3, 1.0f);
                        w0 w0VarD2 = h0.o.d(iVar, false);
                        int iHashCode5 = Long.hashCode(g0Var2.T);
                        m1 m1VarM5 = g0Var2.m();
                        b2.r rVarC5 = b2.a.c(rVarD5, g0Var10);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar2);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(w0VarD2, g0Var10, fVar3);
                        l1.q.I(m1VarM5, g0Var10, nVar);
                        x5.u(iHashCode5, g0Var10, fVar6, g0Var10, eVar);
                        l1.q.I(rVarC5, g0Var10, fVar5);
                        kh.n.l(aVar4.a, aVar4.d, z1.s(rVar, 0.0f, up.f.b, (int) r2), 32, 54, aVar4.b, aVar4.c, gl.d.Secondary, true, (u00.n) null, g0Var10, 905997312, 0, 7232);
                        g0Var2.r((boolean) r2);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(334831537);
                        g0Var2.r(false);
                    }
                    g0Var2.r((boolean) r2);
                } else {
                    g0Var11.V();
                }
                return b0.a;
            case 4:
                z0 z0Var = (z0) this.E;
                gm.a aVar6 = (gm.a) this.C;
                u00.a aVar7 = (u00.a) this.F;
                u00.a aVar8 = (u00.a) this.G;
                y0 y0Var = (y0) this.D;
                w.d0 AnimatedVisibility = (w.d0) obj;
                g0 g0Var12 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                boolean z8 = this.B;
                if (zBooleanValue) {
                    g0 g0Var13 = g0Var12;
                    g0Var13.c0(2051013272);
                    strU = z3.U(g0Var12, 2131886417);
                    g0Var13.r(false);
                } else if (z8) {
                    g0 g0Var14 = g0Var12;
                    g0Var14.c0(2051015768);
                    strU = z3.U(g0Var12, 2131886417);
                    g0Var14.r(false);
                } else {
                    g0 g0Var15 = g0Var12;
                    g0Var15.c0(2051017976);
                    String strU4 = z3.U(g0Var12, 2131886914);
                    g0Var15.r(false);
                    strU = strU4;
                }
                a0 a0Var = z1.c;
                b2.i iVar2 = b2.b.E;
                w0 w0VarD3 = h0.o.d(iVar2, false);
                g0 g0Var16 = g0Var12;
                a30.x xVar3 = g0Var16.a;
                int iHashCode6 = Long.hashCode(g0Var16.T);
                m1 m1VarM6 = g0Var16.m();
                b2.r rVarC6 = b2.a.c(a0Var, g0Var12);
                b3.i.c.getClass();
                b3.g gVar3 = b3.h.b;
                g0Var16.g0();
                if (g0Var16.S) {
                    g0Var16.l(gVar3);
                } else {
                    g0Var16.q0();
                }
                b3.f fVar7 = b3.h.f;
                l1.q.I(w0VarD3, g0Var12, fVar7);
                b3.f fVar8 = b3.h.e;
                l1.q.I(m1VarM6, g0Var12, fVar8);
                Integer numValueOf2 = Integer.valueOf(iHashCode6);
                b3.f fVar9 = b3.h.g;
                l1.q.I(numValueOf2, g0Var12, fVar9);
                b3.e eVar4 = b3.h.h;
                l1.q.E(g0Var12, eVar4);
                String str10 = strU;
                b3.f fVar10 = b3.h.d;
                l1.q.I(rVarC6, g0Var12, fVar10);
                int iOrdinal = aVar6.ordinal();
                b2.o oVar4 = b2.o.A;
                if (iOrdinal == 0) {
                    rVarD = z1.d(oVar4, 1.0f);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVarD = z1.q(oVar4, 350);
                }
                w0 w0VarD4 = h0.o.d(iVar2, false);
                int iHashCode7 = Long.hashCode(g0Var16.T);
                m1 m1VarM7 = g0Var16.m();
                b2.r rVarC7 = b2.a.c(rVarD, g0Var12);
                g0Var16.g0();
                if (g0Var16.S) {
                    g0Var16.l(gVar3);
                } else {
                    g0Var16.q0();
                }
                l1.q.I(w0VarD4, g0Var12, fVar7);
                l1.q.I(m1VarM7, g0Var12, fVar8);
                x5.u(iHashCode7, g0Var12, fVar9, g0Var12, eVar4);
                l1.q.I(rVarC7, g0Var12, fVar10);
                b2.r rVarE2 = h0.c.E(oVar4, aVar6.a(), 0.0f, 2);
                float f3 = 32;
                gl.d dVar3 = gl.d.Secondary;
                boolean zH = g0Var16.h(z8) | g0Var16.g(aVar7) | g0Var16.g(aVar8);
                Object objN8 = g0Var16.N();
                if (zH || objN8 == l1.i.a) {
                    objN8 = new el.f(z8, aVar7, aVar8, z0Var, y0Var);
                    g0Var16.n0(objN8);
                }
                kh.n.l(str10, (u00.a) objN8, rVarE2, f3, 0.0f, false, false, dVar3, false, (u00.n) null, g0Var12, 100666368, 0, 7920);
                g0Var16.r(true);
                g0Var16.r(true);
                return b0.a;
            default:
                xk.d dVar4 = (xk.d) this.E;
                zy.l lVar = (zy.l) this.F;
                u00.k kVar4 = (u00.k) this.C;
                g2.t tVar3 = (g2.t) this.G;
                String str11 = (String) this.D;
                w AuthScreenScaffold3 = (w) obj;
                g0 g0Var17 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(AuthScreenScaffold3, "$this$AuthScreenScaffold");
                g0 g0Var18 = g0Var17;
                if (g0Var18.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z6.b(z3.U(g0Var17, 2131886170), (b2.r) null, dl.a.n, this.B ? kh.o.z(28) : kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var17, 1572864, 48, 260010);
                    g0Var18.c0(1308168291);
                    m3.e eVar5 = new m3.e();
                    List listW1 = r30.k.W0(z3.U(g0Var17, 2131886169), new String[]{"%1$s"}, 2);
                    eVar5.b((String) listW1.get(0));
                    int iE2 = eVar5.e(new i0(dl.a.H, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534));
                    try {
                        String str12 = lVar.d;
                        boolean z9 = lVar.g;
                        eVar5.b(str12);
                        eVar5.d(iE2);
                        if (listW1.size() > 1) {
                            eVar5.b((String) listW1.get(1));
                        }
                        m3.h hVarF2 = eVar5.f();
                        g0Var18.r(false);
                        long j3 = dl.a.k;
                        long jB2 = i2.t.b(0.5f, j3);
                        long jZ3 = kh.o.z(15);
                        long jZ4 = kh.o.z(20);
                        q3.u uVar2 = q3.u.B;
                        z6.c(hVarF2, (b2.r) null, jB2, jZ3, uVar2, 0L, (x3.k) null, jZ4, 0, false, 0, 0, (Map) null, (u00.k) null, (r0) null, g0Var17, 1597440, 48, 522154);
                        b2.o oVar5 = b2.o.A;
                        h0.c.h(z1.e(oVar5, 8), g0Var17);
                        b2.r rVarV2 = c7.i.V(z1.d(oVar5, 1.0f), dVar4, g0Var17);
                        String str13 = lVar.c;
                        boolean z11 = lVar.i;
                        boolean z12 = lVar.j;
                        boolean zG6 = g0Var18.g(kVar4);
                        Object objN9 = g0Var18.N();
                        Object obj8 = l1.i.a;
                        if (zG6 || objN9 == obj8) {
                            objN9 = new rx.c(24, kVar4);
                            g0Var18.n0(objN9);
                        }
                        np.a.b(str13, (u00.k) objN9, rVarV2, null, z11, z12, tVar3, g0Var17, 12582960);
                        String str14 = lVar.k;
                        if (str14 == null) {
                            g0Var18.c0(1899579835);
                            g0Var18.r(false);
                            g0Var3 = g0Var18;
                        } else {
                            g0Var18.c0(1899579836);
                            g0Var3 = g0Var18;
                            z6.b(str14, (b2.r) null, dl.a.U, kh.o.z(12), uVar2, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var17, 1597440, 0, 262058);
                            g0Var3.r(false);
                        }
                        boolean z13 = z9 && !lVar.h;
                        boolean zG7 = g0Var3.g(kVar4);
                        Object objN10 = g0Var3.N();
                        if (zG7 || objN10 == obj8) {
                            objN10 = new wy.l(6, kVar4);
                            g0Var3.n0(objN10);
                        }
                        z6.b(str11, w50.c.o(oVar5, z13, null, (u00.a) objN10, 6), z9 ? dl.a.i : i2.t.b(0.5f, j3), kh.o.z(15), uVar2, (q3.i) null, 0L, z9 ? x3.l.c : x3.l.b, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var17, 1597440, 0, 261544);
                    } catch (Throwable th2) {
                        eVar5.d(iE2);
                        throw th2;
                    }
                } else {
                    g0Var18.V();
                }
                return b0.a;
        }
    }
}
