package gz;

import c3.t2;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.m6;
import g1.o3;
import g1.z6;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.w1;
import h0.z1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import l1.p2;
import no.n;

public final class z0 implements u00.o {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public z0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.B = obj4;
        this.F = obj5;
        this.G = obj6;
    }

    public z0(Set set, Object obj, Set set2, l1.z0 z0Var, List list, p9.e eVar) {
        this.A = 3;
        this.C = set;
        this.D = obj;
        this.E = set2;
        this.F = z0Var;
        this.B = list;
        this.G = eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u00.a aVar;
        Object obj4;
        ?? G0;
        b3.e eVar;
        b3.f fVar;
        Object obj5;
        u00.n nVar;
        l1.g0 g0Var;
        u00.n nVar2;
        l1.g0 g0Var2;
        float f;
        b2.r rVar;
        int i;
        float f2;
        b2.r rVar2;
        l1.g0 g0Var3;
        final l1.z0 z0Var;
        u00.a aVar2;
        long j;
        long jB;
        switch (this.A) {
            case 0:
                h0.n1 n1Var = (h0.n1) this.C;
                h0.t0 t0Var = (h0.t0) this.D;
                j0.v vVar = (j0.v) this.E;
                p2 p2Var = (p2) this.B;
                l1.z0 z0Var2 = (l1.z0) this.F;
                m1 m1Var = (m1) this.G;
                h0.r PullToRefreshBox = (h0.r) obj;
                l1.g0 g0Var4 = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                l1.g0 g0Var5 = g0Var4;
                if (g0Var5.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h0.a0 a0Var = z1.c;
                    p1 p1VarG = h0.c.g(0.0f, t0Var.c() + n1Var.c(), 0.0f, t0Var.a() + n1Var.a(), 5);
                    boolean zG = g0Var5.g(p2Var) | g0Var5.g(z0Var2) | g0Var5.g(m1Var);
                    Object objN = g0Var5.N();
                    if (zG || objN == l1.i.a) {
                        objN = new b1.l(p2Var, z0Var2, m1Var, 13);
                        g0Var5.n0(objN);
                    }
                    k00.f.d(a0Var, vVar, p1VarG, null, null, null, false, null, (u00.k) objN, g0Var4, 6, 504);
                } else {
                    g0Var5.V();
                }
                break;
            case 1:
                xk.d dVar = (xk.d) this.C;
                jp.x xVar = (jp.x) this.D;
                u00.k kVar = (u00.k) this.E;
                p2 p2Var2 = (p2) this.B;
                t2 t2Var = (t2) this.F;
                String str = (String) this.G;
                h0.w AuthScreenScaffold = (h0.w) obj;
                l1.g0 g0Var6 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(AuthScreenScaffold, "$this$AuthScreenScaffold");
                l1.g0 g0Var7 = g0Var6;
                if (g0Var7.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z6.b(z3.U(g0Var6, 2131886171), (b2.r) null, dl.a.n, ((Boolean) g0Var7.k(tp.h.a)).booleanValue() ? kh.o.z(28) : kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var6, 1572864, 48, 260010);
                    b2.o oVar = b2.o.A;
                    h0.c.h(z1.e(oVar, 8), g0Var6);
                    b2.r rVarV = c7.i.V(z1.d(oVar, 1.0f), dVar, g0Var6);
                    String str2 = xVar.u;
                    String strU = z3.U(g0Var6, 2131886195);
                    String str3 = xVar.v;
                    q0.i1 i1Var = new q0.i1(2, 0, 7, 118);
                    boolean zG2 = g0Var7.g(kVar);
                    Object objN2 = g0Var7.N();
                    Object obj6 = l1.i.a;
                    if (zG2 || objN2 == obj6) {
                        objN2 = new hv.j(24, kVar);
                        g0Var7.n0(objN2);
                    }
                    u00.k kVar2 = (u00.k) objN2;
                    boolean zG3 = g0Var7.g(p2Var2) | g0Var7.g(t2Var) | g0Var7.g(kVar);
                    Object objN3 = g0Var7.N();
                    if (zG3 || objN3 == obj6) {
                        objN3 = new ez.o(t2Var, kVar, p2Var2, 1);
                        g0Var7.n0(objN3);
                    }
                    up.i.e(str2, kVar2, rVarV, strU, str3, true, false, false, true, null, i1Var, (u00.a) objN3, null, null, null, g0Var6, 805502976, 48, 58816);
                    b2.r rVarD = z1.d(oVar, 1.0f);
                    ep.f fVar2 = xVar.y;
                    boolean zG4 = g0Var7.g(kVar);
                    Object objN4 = g0Var7.N();
                    if (zG4 || objN4 == obj6) {
                        objN4 = new hv.j(25, kVar);
                        g0Var7.n0(objN4);
                    }
                    pp.h.c(fVar2, (u00.k) objN4, rVarD, false, g0Var6, 384, 8);
                    b2.r rVarD2 = z1.d(oVar, 1.0f);
                    LocalDate localDate = xVar.z;
                    boolean zG5 = g0Var7.g(kVar);
                    Object objN5 = g0Var7.N();
                    if (zG5 || objN5 == obj6) {
                        objN5 = new hv.j(26, kVar);
                        g0Var7.n0(objN5);
                    }
                    pp.c.b(localDate, (u00.k) objN5, rVarD2, false, g0Var6, 384, 8);
                    b2.r rVarG = h0.c.G(oVar, 0.0f, 12, 0.0f, 0.0f, 13);
                    String strU2 = z3.U(g0Var6, 2131886163);
                    boolean z = xVar.A;
                    boolean zG6 = g0Var7.g(kVar);
                    Object objN6 = g0Var7.N();
                    if (zG6 || objN6 == obj6) {
                        objN6 = new hv.j(27, kVar);
                        g0Var7.n0(objN6);
                    }
                    up.c.a(strU2, z, (u00.k) objN6, rVarG, 0L, 0L, 0.0f, false, g0Var6, 3072, 240);
                    if (str == null) {
                        g0Var7.c0(-703744386);
                        g0Var7.r(false);
                    } else {
                        g0Var7.c0(-703744385);
                        z6.b(str, (b2.r) null, dl.a.U, kh.o.z(12), q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var6, 1597440, 0, 262058);
                        g0Var7.r(false);
                    }
                } else {
                    g0Var7.V();
                }
                break;
            case 2:
                gm.a aVar3 = (gm.a) this.C;
                ju.f fVar3 = (ju.f) this.D;
                u30.b bVar = ((lu.z) this.E).g;
                jk.a aVar4 = (jk.a) this.B;
                zz.a aVar5 = (zz.a) this.F;
                u00.k kVar3 = (u00.k) this.G;
                h0.t BoxWithConstraints = (h0.t) obj;
                l1.g0 g0Var8 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                b2.h hVar = b2.b.K;
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= g0Var8.g(BoxWithConstraints) ? 4 : 2;
                }
                boolean z2 = (iIntValue3 & 19) != 18;
                l1.g0 g0Var9 = g0Var8;
                a30.x xVar2 = g0Var9.a;
                if (g0Var9.S(iIntValue3 & 1, z2)) {
                    gm.a aVar6 = gm.a.B;
                    boolean z3 = aVar3 == aVar6;
                    boolean zD = g0Var9.d(BoxWithConstraints.b()) | g0Var9.d(BoxWithConstraints.c()) | g0Var9.e(aVar3.ordinal());
                    Object objN7 = g0Var9.N();
                    Object obj7 = l1.i.a;
                    if (zD || objN7 == obj7) {
                        objN7 = oi.k.t(b5.G(BoxWithConstraints.b(), BoxWithConstraints.c(), aVar3 == aVar6), g0Var9);
                    }
                    float f3 = ((y3.f) objN7).A;
                    boolean zD2 = g0Var9.d(BoxWithConstraints.c()) | g0Var9.e(aVar3.ordinal());
                    Object objN8 = g0Var9.N();
                    if (zD2 || objN8 == obj7) {
                        objN8 = oi.k.t(ab.a0.C(new y3.f(BoxWithConstraints.c() * (aVar3 == aVar6 ? 0.22f : 0.24f)), new y3.f(72), new y3.f(104)).A, g0Var9);
                    }
                    float f4 = ((y3.f) objN8).A;
                    boolean zD3 = g0Var9.d(f4);
                    Object objN9 = g0Var9.N();
                    if (zD3 || objN9 == obj7) {
                        objN9 = oi.k.t(ab.a0.C(new y3.f(0.45f * f4), new y3.f(30), new y3.f(44)).A, g0Var9);
                    }
                    float f5 = ((y3.f) objN9).A;
                    boolean zD4 = g0Var9.d(f4);
                    Object objN10 = g0Var9.N();
                    if (zD4 || objN10 == obj7) {
                        objN10 = oi.k.t(ab.a0.C(new y3.f(0.28f * f4), new y3.f(14), new y3.f(20)).A, g0Var9);
                    }
                    float f6 = ((y3.f) objN10).A;
                    b2.r rVarG2 = h0.c.G(z1.c, 0.0f, f3, 0.0f, 0.0f, 13);
                    b2.g gVar = b2.b.N;
                    h0.v vVarA = h0.u.a(h0.i.c, gVar, g0Var8, 54);
                    int iHashCode = Long.hashCode(g0Var9.T);
                    l1.m1 m1VarM = g0Var9.m();
                    b2.r rVarC = b2.a.c(rVarG2, g0Var8);
                    b3.i.c.getClass();
                    u00.a aVar7 = b3.h.b;
                    g0Var9.g0();
                    if (g0Var9.S) {
                        g0Var9.l(aVar7);
                    } else {
                        g0Var9.q0();
                    }
                    b3.f fVar4 = b3.h.f;
                    l1.q.I(vVarA, g0Var8, fVar4);
                    b3.f fVar5 = b3.h.e;
                    l1.q.I(m1VarM, g0Var8, fVar5);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar6 = b3.h.g;
                    l1.q.I(numValueOf, g0Var8, fVar6);
                    b3.e eVar2 = b3.h.h;
                    l1.q.E(g0Var8, eVar2);
                    b3.f fVar7 = b3.h.d;
                    l1.q.I(rVarC, g0Var8, fVar7);
                    float f7 = 12;
                    b2.o oVar2 = b2.o.A;
                    u00.k kVar4 = kVar3;
                    zz.a aVar8 = aVar5;
                    Object obj8 = obj7;
                    float f8 = f7;
                    mu.d.u(fVar3, h0.c.E(oVar2, f7, 0.0f, 2), 0L, 0L, 0, 0.0f, g0Var8, 48, 60);
                    z6.b(z3.U(g0Var8, 2131886926), h0.c.E(h0.c.G(oVar2, 0.0f, 8, 0.0f, 0.0f, 13), f8, 0.0f, 2), i2.t.b(0.85f, dl.a.i), ju.e.a(z3), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), ju.e.b(z3), 2, false, 2, 0, (u00.k) null, (m3.r0) null, g0Var8, 48, 24960, 238568);
                    h0.c.h(h0.w.a(oVar2, 1.0f), g0Var8);
                    h0.v vVarA2 = h0.u.a(h0.i.g(f6), gVar, g0Var8, 48);
                    int iHashCode2 = Long.hashCode(g0Var9.T);
                    l1.m1 m1VarM2 = g0Var9.m();
                    b2.r rVarC2 = b2.a.c(oVar2, g0Var8);
                    g0Var9.g0();
                    if (g0Var9.S) {
                        aVar = aVar7;
                        g0Var9.l(aVar);
                    } else {
                        aVar = aVar7;
                        g0Var9.q0();
                    }
                    l1.q.I(vVarA2, g0Var8, fVar4);
                    l1.q.I(m1VarM2, g0Var8, fVar5);
                    x5.u(iHashCode2, g0Var8, fVar6, g0Var8, eVar2);
                    l1.q.I(rVarC2, g0Var8, fVar7);
                    b2.h hVar2 = hVar;
                    v1 v1VarA = t1.a(h0.i.g(f6), hVar2, g0Var8, 48);
                    int iHashCode3 = Long.hashCode(g0Var9.T);
                    l1.m1 m1VarM3 = g0Var9.m();
                    b2.r rVarC3 = b2.a.c(oVar2, g0Var8);
                    g0Var9.g0();
                    if (g0Var9.S) {
                        g0Var9.l(aVar);
                    } else {
                        g0Var9.q0();
                    }
                    l1.q.I(v1VarA, g0Var8, fVar4);
                    l1.q.I(m1VarM3, g0Var8, fVar5);
                    x5.u(iHashCode3, g0Var8, fVar6, g0Var8, eVar2);
                    l1.q.I(rVarC3, g0Var8, fVar7);
                    g0Var9.c0(568448494);
                    Iterator it = h00.q.j1(bVar, 2).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            final zz.a aVar9 = (zz.a) it.next();
                            int iB = mu.d.B(aVar9);
                            zz.a aVar10 = aVar8;
                            boolean zA = kotlin.jvm.internal.m.a(aVar8 != null ? aVar10.a : null, aVar9.a);
                            final u00.k kVar5 = kVar4;
                            boolean zG7 = g0Var9.g(kVar5) | g0Var9.g(aVar9);
                            Object objN11 = g0Var9.N();
                            if (zG7) {
                                obj4 = obj8;
                            } else {
                                obj4 = obj8;
                                if (objN11 == obj4) {
                                }
                                mu.d.s(aVar4, iB, zA, f4, f5, (u00.a) objN11, null, g0Var8, 0);
                                hVar2 = hVar2;
                                obj8 = obj4;
                                aVar8 = aVar10;
                                f8 = f8;
                                it = it;
                                kVar4 = kVar5;
                            }
                            final int i2 = 0;
                            objN11 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            kVar5.invoke(new lu.c(aVar9));
                                            break;
                                        default:
                                            kVar5.invoke(new lu.c(aVar9));
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var9.n0(objN11);
                            mu.d.s(aVar4, iB, zA, f4, f5, (u00.a) objN11, null, g0Var8, 0);
                            hVar2 = hVar2;
                            obj8 = obj4;
                            aVar8 = aVar10;
                            f8 = f8;
                            it = it;
                            kVar4 = kVar5;
                        } else {
                            final u00.k kVar6 = kVar4;
                            float f9 = f8;
                            zz.a aVar11 = aVar8;
                            Object obj9 = obj8;
                            g0Var9.r(false);
                            boolean z4 = true;
                            g0Var9.r(true);
                            v1 v1VarA2 = t1.a(h0.i.g(f6), hVar2, g0Var8, 48);
                            int iHashCode4 = Long.hashCode(g0Var9.T);
                            l1.m1 m1VarM4 = g0Var9.m();
                            b2.r rVarC4 = b2.a.c(oVar2, g0Var8);
                            b3.i.c.getClass();
                            b3.g gVar2 = b3.h.b;
                            g0Var9.g0();
                            if (g0Var9.S) {
                                g0Var9.l(gVar2);
                            } else {
                                g0Var9.q0();
                            }
                            l1.q.I(v1VarA2, g0Var8, b3.h.f);
                            l1.q.I(m1VarM4, g0Var8, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode4), g0Var8, b3.h.g);
                            l1.q.E(g0Var8, b3.h.h);
                            l1.q.I(rVarC4, g0Var8, b3.h.d);
                            g0Var9.c0(-652821097);
                            for (final zz.a aVar12 : h00.q.H0(bVar, 2)) {
                                int iB2 = mu.d.B(aVar12);
                                boolean zA2 = kotlin.jvm.internal.m.a(aVar11 != null ? aVar11.a : null, aVar12.a);
                                boolean zG8 = g0Var9.g(kVar6) | g0Var9.g(aVar12);
                                Object objN12 = g0Var9.N();
                                if (zG8 || objN12 == obj9) {
                                    final int i3 = 1;
                                    objN12 = new u00.a() {
                                        @Override
                                        public final Object invoke() {
                                            switch (i3) {
                                                case 0:
                                                    kVar6.invoke(new lu.c(aVar12));
                                                    break;
                                                default:
                                                    kVar6.invoke(new lu.c(aVar12));
                                                    break;
                                            }
                                            return b0.a;
                                        }
                                    };
                                    g0Var9.n0(objN12);
                                }
                                mu.d.s(aVar4, iB2, zA2, f4, f5, (u00.a) objN12, null, g0Var8, 0);
                                kVar6 = kVar6;
                                z4 = true;
                            }
                            g0Var9.r(false);
                            g0Var9.r(true);
                            z6.b(z3.U(g0Var8, 2131887332), h0.c.G(oVar2, 0.0f, f9, 0.0f, 0.0f, 13), i2.t.b(0.7f, dl.a.k), ju.e.a(z3), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), ju.e.b(z3), 2, false, 2, 0, (u00.k) null, (m3.r0) null, g0Var8, 48, 24960, 238568);
                            g0Var9.r(true);
                            h0.c.h(h0.w.a(oVar2, 1.0f), g0Var8);
                            g0Var9.r(true);
                        }
                    }
                } else {
                    g0Var9.V();
                }
                break;
            case 3:
                Set set = (Set) this.C;
                Set set2 = (Set) this.E;
                l1.z0 z0Var3 = (l1.z0) this.F;
                List list = (List) this.B;
                p9.e eVar3 = (p9.e) this.G;
                l1.g0 g0Var10 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                l1.g0 g0Var11 = g0Var10;
                if (g0Var11.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zI = g0Var11.i(set);
                    Object obj10 = this.D;
                    boolean zI2 = g0Var11.i(obj10) | zI | g0Var11.i(set2) | g0Var11.g(z0Var3);
                    Object objN13 = g0Var11.N();
                    if (zI2 || objN13 == l1.i.a) {
                        objN13 = new az.k(set, obj10, set2, z0Var3, 10);
                        g0Var11.n0(objN13);
                    }
                    l1.q.e(obj10, (u00.k) objN13, g0Var10);
                    g0Var11.c0(358947325);
                    if (list instanceof RandomAccess) {
                        u.j0 j0Var = new u.j0(list.size());
                        G0 = new ArrayList(list.size());
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Object obj11 = list.get(i4);
                            if (j0Var.a(obj11)) {
                                G0.add(obj11);
                            }
                        }
                    } else {
                        G0 = h00.q.G0(list);
                    }
                    if (!G0.isEmpty()) {
                        ListIterator listIterator = G0.listIterator(G0.size());
                        while (listIterator.hasPrevious()) {
                            eVar3 = new p9.e(eVar3, v1.d.d(-330823412, new c0.f((p9.f) listIterator.previous(), eVar3, 16), g0Var10));
                        }
                    }
                    g0Var11.r(false);
                    eVar3.a(g0Var10, 0);
                } else {
                    g0Var11.V();
                }
                break;
            case 4:
                a40.z zVar = (a40.z) this.C;
                m6 m6Var = (m6) this.D;
                u00.a aVar13 = (u00.a) this.E;
                u30.b bVar2 = (u30.b) this.B;
                u00.k kVar7 = (u00.k) this.F;
                u00.k kVar8 = (u00.k) this.G;
                h0.w ModalBottomSheet = (h0.w) obj;
                l1.g0 g0Var12 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.g0 g0Var13 = g0Var12;
                if (g0Var13.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    g4.d(6, dl.a.x, g0Var12, true);
                    b2.r rVarM = h0.c.M(z1.c, h0.c.g);
                    h0.v vVarA3 = h0.u.a(h0.i.c, b2.b.M, g0Var12, 0);
                    int iHashCode5 = Long.hashCode(g0Var13.T);
                    l1.m1 m1VarM5 = g0Var13.m();
                    b2.r rVarC5 = b2.a.c(rVarM, g0Var12);
                    b3.i.c.getClass();
                    b3.g gVar3 = b3.h.b;
                    g0Var13.g0();
                    if (g0Var13.S) {
                        g0Var13.l(gVar3);
                    } else {
                        g0Var13.q0();
                    }
                    l1.q.I(vVarA3, g0Var12, b3.h.f);
                    l1.q.I(m1VarM5, g0Var12, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode5), g0Var12, b3.h.g);
                    l1.q.E(g0Var12, b3.h.h);
                    l1.q.I(rVarC5, g0Var12, b3.h.d);
                    boolean zI3 = g0Var13.i(zVar) | g0Var13.g(m6Var) | g0Var13.g(aVar13);
                    Object objN14 = g0Var13.N();
                    if (zI3 || objN14 == l1.i.a) {
                        objN14 = new cz.c(zVar, m6Var, aVar13, 11);
                        g0Var13.n0(objN14);
                    }
                    po.n.l((u00.a) objN14, g0Var12, 0);
                    po.n.i(bVar2, kVar7, kVar8, g0Var12, 0);
                    g0Var13.r(true);
                } else {
                    g0Var13.V();
                }
                break;
            default:
                to.f fVar8 = (to.f) this.C;
                boolean z5 = fVar8.g;
                final go.a aVar14 = (go.a) this.D;
                u00.a aVar15 = (u00.a) this.E;
                u00.a aVar16 = (u00.a) this.B;
                final l1.z0 z0Var4 = (l1.z0) this.F;
                l1.z0 z0Var5 = (l1.z0) this.G;
                w1 LiquidPlayer = (w1) obj;
                l1.g0 g0Var14 = (l1.j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidPlayer, "$this$LiquidPlayer");
                boolean z6 = (iIntValue6 & 17) != 16;
                l1.g0 g0Var15 = g0Var14;
                a30.x xVar3 = g0Var15.a;
                if (g0Var15.S(iIntValue6 & 1, z6)) {
                    b2.r rVar3 = b2.o.A;
                    float f11 = 16;
                    b2.r rVarD3 = h0.c.D(z1.d(rVar3, 1.0f), f11, 6);
                    float f12 = 12;
                    h0.f fVarG = h0.i.g(f12);
                    b2.h hVar3 = b2.b.K;
                    v1 v1VarA3 = t1.a(fVarG, hVar3, g0Var14, 54);
                    int iHashCode6 = Long.hashCode(g0Var15.T);
                    l1.m1 m1VarM6 = g0Var15.m();
                    b2.r rVarC6 = b2.a.c(rVarD3, g0Var14);
                    b3.i.c.getClass();
                    u00.a aVar17 = b3.h.b;
                    g0Var15.g0();
                    if (g0Var15.S) {
                        g0Var15.l(aVar17);
                    } else {
                        g0Var15.q0();
                    }
                    u00.n nVar3 = b3.h.f;
                    l1.q.I(v1VarA3, g0Var14, nVar3);
                    u00.n nVar4 = b3.h.e;
                    l1.q.I(m1VarM6, g0Var14, nVar4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    b3.f fVar9 = b3.h.g;
                    l1.q.I(numValueOf2, g0Var14, fVar9);
                    b3.e eVar4 = b3.h.h;
                    l1.q.E(g0Var14, eVar4);
                    b3.f fVar10 = b3.h.d;
                    l1.q.I(rVarC6, g0Var14, fVar10);
                    float f13 = fVar8.e;
                    boolean z7 = fVar8.d;
                    boolean zBooleanValue = ((Boolean) z0Var4.getValue()).booleanValue();
                    Object objN15 = g0Var15.N();
                    Object obj12 = l1.i.a;
                    if (objN15 == obj12) {
                        objN15 = new ct.k(z0Var4, 21);
                        g0Var15.n0(objN15);
                    }
                    u00.a aVar18 = (u00.a) objN15;
                    Object objN16 = g0Var15.N();
                    if (objN16 == obj12) {
                        objN16 = new ct.k(z0Var4, 22);
                        g0Var15.n0(objN16);
                    }
                    u00.a aVar19 = (u00.a) objN16;
                    boolean zI4 = g0Var15.i(aVar14);
                    Object objN17 = g0Var15.N();
                    if (zI4 || objN17 == obj12) {
                        final int i5 = 1;
                        objN17 = new u00.k() {
                            @Override
                            public final Object invoke(Object obj13) {
                                switch (i5) {
                                    case 0:
                                        ru.d it2 = (ru.d) obj13;
                                        kotlin.jvm.internal.m.e(it2, "it");
                                        ((n) aVar14).u(it2);
                                        z0Var4.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        ((n) aVar14).v(((Float) obj13).floatValue());
                                        z0Var4.setValue(Boolean.FALSE);
                                        break;
                                }
                                return b0.a;
                            }
                        };
                        g0Var15.n0(objN17);
                    }
                    c7.i.j(f13, zBooleanValue, aVar18, aVar19, (u00.k) objN17, g0Var14, 3456);
                    String strU3 = z3.U(g0Var14, 2131886764);
                    boolean zI5 = g0Var15.i(aVar14);
                    Object objN18 = g0Var15.N();
                    if (zI5 || objN18 == obj12) {
                        eVar = eVar4;
                        fVar = fVar9;
                        obj5 = obj12;
                        nVar = nVar3;
                        g0Var = g0Var15;
                        nVar2 = nVar4;
                        pi.c cVar = new pi.c(0, aVar14, go.a.class, "skipBack", "skipBack()V", 0, 9);
                        g0Var.n0(cVar);
                        objN18 = cVar;
                    } else {
                        g0Var = g0Var15;
                        nVar = nVar3;
                        nVar2 = nVar4;
                        eVar = eVar4;
                        fVar = fVar9;
                        obj5 = obj12;
                    }
                    float f14 = 30;
                    float f15 = 26;
                    long j2 = dl.a.i;
                    float f16 = 8;
                    l1.g0 g0Var16 = g0Var;
                    to.m.a(2131231377, false, strU3, (u00.a) ((a10.g) objN18), h0.c.E((b2.r) r61, f16, 0.0f, 2), f14, f15, j2, g0Var14, 1794096, 0);
                    b2.r rVarM2 = z1.m(h0.c.j(r26 != 0 ? 0 : 3), f14);
                    boolean zI6 = g0Var16.i(aVar14);
                    Object objN19 = g0Var16.N();
                    if (zI6 || objN19 == obj5) {
                        g0Var2 = g0Var16;
                        f = f16;
                        rVar = rVar3;
                        i = 2;
                        f2 = 0.0f;
                        rVar2 = rVarM2;
                        pi.c cVar2 = new pi.c(0, aVar14, go.a.class, "playPause", "playPause()V", 0, 10);
                        g0Var2.n0(cVar2);
                        objN19 = cVar2;
                    } else {
                        g0Var2 = g0Var16;
                        f = f16;
                        rVar = rVar3;
                        i = 2;
                        f2 = 0.0f;
                        rVar2 = rVarM2;
                    }
                    b2.r rVarO = w50.c.o(rVar2, false, null, (u00.a) ((a10.g) objN19), 7);
                    m2.b bVarR = y3.R(r26 != 0 ? 2131231354 : 2131231358, g0Var14, 0);
                    String strU4 = z3.U(g0Var14, z7 ? 2131886141 : 2131886151);
                    l1.g0 g0Var17 = g0Var2;
                    o3.a(bVarR, strU4, rVarO, j2, g0Var14, 8, 0);
                    String strU5 = z3.U(g0Var14, 2131886766);
                    boolean zI7 = g0Var17.i(aVar14);
                    Object objN20 = g0Var17.N();
                    if (zI7 || objN20 == obj5) {
                        g0Var3 = g0Var17;
                        pi.c cVar3 = new pi.c(0, aVar14, go.a.class, "skipForward", "skipForward()V", 0, 11);
                        g0Var3.n0(cVar3);
                        objN20 = cVar3;
                    } else {
                        g0Var3 = g0Var17;
                    }
                    l1.g0 g0Var18 = g0Var3;
                    to.m.a(2131231379, true, strU5, (u00.a) ((a10.g) objN20), h0.c.E(rVar, f, f2, i), f14, f15, j2, g0Var14, 1794096, 0);
                    ru.d dVar2 = fVar8.f;
                    boolean zBooleanValue2 = ((Boolean) z0Var5.getValue()).booleanValue();
                    Object objN21 = g0Var18.N();
                    if (objN21 == obj5) {
                        z0Var = z0Var5;
                        objN21 = new ct.k(z0Var, 23);
                        g0Var18.n0(objN21);
                    } else {
                        z0Var = z0Var5;
                    }
                    u00.a aVar20 = (u00.a) objN21;
                    Object objN22 = g0Var18.N();
                    if (objN22 == obj5) {
                        objN22 = new ct.k(z0Var, 20);
                        g0Var18.n0(objN22);
                    }
                    u00.a aVar21 = (u00.a) objN22;
                    boolean zI8 = g0Var18.i(aVar14);
                    Object objN23 = g0Var18.N();
                    if (zI8 || objN23 == obj5) {
                        final int i6 = 0;
                        objN23 = new u00.k() {
                            @Override
                            public final Object invoke(Object obj13) {
                                switch (i6) {
                                    case 0:
                                        ru.d it2 = (ru.d) obj13;
                                        kotlin.jvm.internal.m.e(it2, "it");
                                        ((n) aVar14).u(it2);
                                        z0Var.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        ((n) aVar14).v(((Float) obj13).floatValue());
                                        z0Var.setValue(Boolean.FALSE);
                                        break;
                                }
                                return b0.a;
                            }
                        };
                        g0Var18.n0(objN23);
                    }
                    c7.i.i(dVar2, zBooleanValue2, aVar20, aVar21, (u00.k) objN23, h0.c.G(rVar, 0.0f, 0.0f, f11, 0.0f, 11), g0Var14, 200064);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c1 c1Var = new h0.c1(1.0f, true);
                    v1 v1VarA4 = t1.a(h0.i.g(f), hVar3, g0Var14, 54);
                    int iHashCode7 = Long.hashCode(g0Var18.T);
                    l1.m1 m1VarM7 = g0Var18.m();
                    b2.r rVarC7 = b2.a.c(c1Var, g0Var14);
                    g0Var18.g0();
                    if (g0Var18.S) {
                        aVar2 = aVar17;
                        g0Var18.l(aVar2);
                    } else {
                        aVar2 = r24;
                        g0Var18.q0();
                    }
                    u00.n nVar5 = nVar;
                    l1.q.I(v1VarA4, g0Var14, nVar5);
                    u00.n nVar6 = nVar2;
                    l1.q.I(m1VarM7, g0Var14, nVar6);
                    b3.f fVar11 = fVar;
                    b3.e eVar5 = eVar;
                    x5.u(iHashCode7, g0Var14, fVar11, g0Var14, eVar5);
                    l1.q.I(rVarC7, g0Var14, fVar10);
                    a10.h0.a(fVar8.a, f2.h.c(z1.m(rVar, 48), p0.f.a((float) r20)), f12, false, null, false, g0Var14, 384, 56);
                    h0.v vVarA4 = h0.u.a(h0.i.c, b2.b.M, g0Var14, 0);
                    int iHashCode8 = Long.hashCode(g0Var18.T);
                    l1.m1 m1VarM8 = g0Var18.m();
                    b2.r rVarC8 = b2.a.c(rVar, g0Var14);
                    g0Var18.g0();
                    if (g0Var18.S) {
                        g0Var18.l(aVar2);
                    } else {
                        g0Var18.q0();
                    }
                    l1.q.I(vVarA4, g0Var14, nVar5);
                    l1.q.I(m1VarM8, g0Var14, nVar6);
                    x5.u(iHashCode8, g0Var14, fVar11, g0Var14, eVar5);
                    l1.q.I(rVarC8, g0Var14, fVar10);
                    z6.b(z3.T(2131886133, new Object[]{Integer.valueOf(fVar8.b)}, g0Var14), (b2.r) null, dl.a.k, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(15), 0, false, 1, 0, (u00.k) null, (m3.r0) null, g0Var14, 24576, 24624, 243690);
                    z6.b(fVar8.c, (b2.r) null, dl.a.o, kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(12), 2, false, 1, 0, (u00.k) null, (m3.r0) null, g0Var14, 24576, 25008, 239594);
                    g0Var18.r(true);
                    g0Var18.r(true);
                    b2.r rVarO2 = w50.c.o(z1.m(rVar, 22), z5, null, aVar15, 6);
                    m2.b bVarR2 = y3.R(2131231393, g0Var14, 0);
                    if (z5) {
                        j = j2;
                        jB = j;
                    } else {
                        j = j2;
                        jB = i2.t.b(0.3f, j);
                    }
                    o3.a(bVarR2, (String) null, rVarO2, jB, g0Var14, 56, 0);
                    o3.a(y3.R(2131231206, g0Var14, 0), z3.U(g0Var14, 2131886134), w50.c.o(z1.m(rVar, 20), false, null, aVar16, 7), j, g0Var14, 8, 0);
                    g0Var18.r(true);
                } else {
                    g0Var15.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
