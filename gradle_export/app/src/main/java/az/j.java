package az;

import a1.y1;
import a30.x;
import android.content.Context;
import bt.a1;
import bv.o1;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import g1.o3;
import g1.w3;
import g1.z6;
import gz.g1;
import h0.c1;
import h0.n1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.w;
import h0.w1;
import h0.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz.t;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.z0;
import m3.r0;
import nx.i0;
import qd.s0;
import w.c0;
import w.d0;
import w.x0;
import w.y0;
import z1.s;
import z2.a0;
import z2.w0;

public final class j implements u00.o {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public j(int i, Object obj, Object obj2, u00.k kVar) {
        this.A = i;
        this.B = obj;
        this.D = kVar;
        this.C = obj2;
    }

    public j(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        float f;
        gm.a aVar = (gm.a) this.B;
        i0 i0Var = (i0) this.C;
        u00.k kVar = (u00.k) this.D;
        j0.b item = (j0.b) obj;
        g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.e(item, "$this$item");
        g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                f = 16;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 24;
            }
            b2.r rVarE = h0.c.E(b2.o.A, f, 0.0f, 2);
            int iA = ((h00.b) i0Var.c).a();
            int iA2 = ((h00.b) i0Var.f).a();
            u30.b bVar = i0Var.i;
            boolean zG = g0Var2.g(kVar);
            Object objN = g0Var2.N();
            Object obj4 = l1.i.a;
            if (zG || objN == obj4) {
                objN = new t(27, kVar);
                g0Var2.n0(objN);
            }
            u00.a aVar2 = (u00.a) objN;
            boolean zG2 = g0Var2.g(kVar);
            Object objN2 = g0Var2.N();
            if (zG2 || objN2 == obj4) {
                objN2 = new t(28, kVar);
                g0Var2.n0(objN2);
            }
            u00.a aVar3 = (u00.a) objN2;
            boolean zG3 = g0Var2.g(kVar);
            Object objN3 = g0Var2.N();
            if (zG3 || objN3 == obj4) {
                objN3 = new t(29, kVar);
                g0Var2.n0(objN3);
            }
            ox.a.k(iA, iA2, bVar, aVar2, aVar3, (u00.a) objN3, rVarE, false, 0, g0Var, 512, 384);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        s sVar = (s) this.B;
        s sVar2 = (s) this.C;
        z0 z0Var = (z0) this.D;
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        a0 coordinates = (a0) obj2;
        Boolean bool = (Boolean) obj3;
        boolean zBooleanValue = bool.booleanValue();
        kotlin.jvm.internal.m.e(coordinates, "coordinates");
        sVar.put(num, new g00.k(coordinates, bool));
        b5.h(sVar2, z0Var, iIntValue, coordinates, zBooleanValue);
        return b0.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        u30.b bVar = (u30.b) this.B;
        pz.j jVar = (pz.j) this.C;
        u00.k kVar = (u00.k) this.D;
        j0.b item = (j0.b) obj;
        g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.e(item, "$this$item");
        g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
            u30.c cVar = jVar.c;
            boolean zG = g0Var2.g(kVar);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.a) {
                objN = new lp.k(28, kVar);
                g0Var2.n0(objN);
            }
            w00.a.a(bVar, cVar, (u00.k) objN, null, g0Var, 0);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        qx.o oVar = (qx.o) this.B;
        u00.k kVar = (u00.k) this.D;
        kk.c cVar = (kk.c) this.C;
        d0 AnimatedVisibility = (d0) obj;
        g0 g0Var = (l1.j) obj2;
        ((Integer) obj3).getClass();
        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
        b2.r rVarE = z1.e(z1.q(b2.o.A, rx.b.a), 40);
        String str = oVar.g;
        g0 g0Var2 = g0Var;
        boolean zG = g0Var2.g(kVar);
        Object objN = g0Var2.N();
        Object obj4 = l1.i.a;
        if (zG || objN == obj4) {
            objN = new lp.k(29, kVar);
            g0Var2.n0(objN);
        }
        u00.k kVar2 = (u00.k) objN;
        boolean zG2 = g0Var2.g(kVar);
        Object objN2 = g0Var2.N();
        if (zG2 || objN2 == obj4) {
            objN2 = new rx.c(0, kVar);
            g0Var2.n0(objN2);
        }
        rx.a.b(rVarE, str, kVar2, cVar, false, 0, (u00.k) objN2, g0Var, 196608, 208);
        return b0.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        qx.o oVar = (qx.o) this.B;
        u00.k kVar = (u00.k) this.D;
        p2 p2Var = (p2) this.C;
        k0.k item = (k0.k) obj;
        g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.e(item, "$this$item");
        g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
            c0.c(true ^ oVar.h, (b2.r) null, (x0) null, (y0) null, (String) null, v1.d.d(-1368763569, new kx.c(kVar, p2Var, 1), g0Var), g0Var, 196608, 30);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        b2.r rVar = (b2.r) this.B;
        u00.a aVar = (u00.a) this.C;
        u00.a aVar2 = (u00.a) this.D;
        w ModalBottomSheet = (w) obj;
        g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
        boolean z = (iIntValue & 17) != 16;
        g0 g0Var2 = g0Var;
        x xVar = g0Var2.a;
        if (g0Var2.S(iIntValue & 1, z)) {
            b2.o oVar = b2.o.A;
            b2.r rVarV = z1.d(oVar, 1.0f).V(rVar);
            long j = dl.a.q;
            b2.r rVarM = h0.c.M(z.n.f(rVarV, j, i2.b0.b), h0.c.g);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarM, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            g4.d(6, j, g0Var, true);
            b2.i iVar2 = b2.b.B;
            h0.s sVar = h0.s.a;
            z3.e(sVar.a(oVar, iVar2), g0Var, 0);
            b2.r rVarE = h0.c.E(z.n.p(z1.d(oVar, 1.0f), z.n.l(g0Var), false, 14), 16, 0.0f, 2);
            v vVarA = u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            tr.a.a(h0.c.G(oVar, 0.0f, 48, 0.0f, 0.0f, 13), g0Var, 6);
            float f = 24;
            tr.a.e(z1.d(h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), g0Var, 6);
            tr.a.c(aVar2, h0.c.E(oVar, 0.0f, f, 1), g0Var, 48);
            g0Var2.r(true);
            z3.b(aVar, h0.c.C(sVar.a(oVar, iVar), 20), g0Var, 0);
            g0Var2.r(true);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        j3.k kVar;
        b2.r rVar;
        switch (this.A) {
            case 0:
                u30.b bVar = (u30.b) this.B;
                q qVar = (q) this.C;
                u00.k kVar2 = (u00.k) this.D;
                j0.b item = (j0.b) obj;
                g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u30.c cVar = qVar.b;
                    boolean zG = g0Var2.g(kVar2);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new as.d0(3, kVar2);
                        g0Var2.n0(objN);
                    }
                    w00.a.a(bVar, cVar, (u00.k) objN, null, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 1:
                a1 a1Var = (a1) this.B;
                n1 n1Var = (n1) this.C;
                j1.r rVar2 = (j1.r) this.D;
                h0.r PullToRefreshBox = (h0.r) obj;
                g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var3.g(PullToRefreshBox) ? 4 : 2;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    j1.h.a.a(rVar2, a1Var.v, PullToRefreshBox.a(b2.o.A, b2.b.B), 0L, 0L, n1Var.c() + j1.h.d, g0Var3, 0, 24);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 2:
                ys.c cVar2 = (ys.c) this.B;
                u00.k kVar3 = (u00.k) this.D;
                z0 z0Var = (z0) this.C;
                w DropdownMenuNoPaddingVertical = (w) obj;
                g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    for (ys.c cVar3 : ys.c.E) {
                        v1.c cVarD = v1.d.d(648452888, new y1(cVar3, 7), g0Var5);
                        boolean zE = g0Var6.e(cVar3.ordinal()) | g0Var6.e(cVar2.ordinal()) | g0Var6.g(kVar3);
                        Object objN2 = g0Var6.N();
                        if (zE || objN2 == l1.i.a) {
                            ct.m mVar = new ct.m(cVar3, cVar2, kVar3, z0Var, 0);
                            g0Var6.n0(mVar);
                            objN2 = mVar;
                        }
                        g1.m.b(cVarD, (u00.a) objN2, (b2.r) null, (u00.n) null, false, (w3) null, (n1) null, g0Var5, 6, 508);
                        g0Var6 = g0Var6;
                    }
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 3:
                b2.r rVar3 = (b2.r) this.B;
                ArrayList<ry.a> arrayList = (ArrayList) this.C;
                u00.k kVar4 = (u00.k) this.D;
                j0.b item2 = (j0.b) obj;
                g0 g0Var7 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                boolean z2 = (iIntValue4 & 17) != 16;
                g0 g0Var8 = g0Var7;
                x xVar = g0Var8.a;
                if (g0Var8.S(iIntValue4 & 1, z2)) {
                    h0.d dVar = h0.i.c;
                    b2.g gVar = b2.b.M;
                    v vVarA = u.a(dVar, gVar, g0Var7, 0);
                    int iHashCode = Long.hashCode(g0Var8.T);
                    m1 m1VarM = g0Var8.m();
                    b2.r rVarC = b2.a.c(rVar3, g0Var7);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var8.g0();
                    if (g0Var8.S) {
                        g0Var8.l(gVar2);
                    } else {
                        g0Var8.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(vVarA, g0Var7, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, g0Var7, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var7, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(g0Var7, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, g0Var7, fVar4);
                    b2.o oVar = b2.o.A;
                    b2.r rVarG = h0.c.G(oVar, 0.0f, 8, 0.0f, 16, 5);
                    String strU = z3.U(g0Var7, 2131887224);
                    long j = dl.a.i;
                    u00.k kVar5 = kVar4;
                    z6.b(strU, rVarG, j, kh.o.z(15), q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var7, 1597488, 0, 262056);
                    if (arrayList.isEmpty()) {
                        g0Var8.c0(346394951);
                        cz.a.i(null, g0Var7, 0);
                        g0Var8.r(false);
                        z = true;
                    } else {
                        g0Var8.c0(346510147);
                        b2.r rVarF = z.n.f(f2.h.c(z1.d(oVar, 1.0f), p0.f.a(24)), i2.t.b(0.08f, j), i2.b0.b);
                        v vVarA2 = u.a(dVar, gVar, g0Var7, 0);
                        int iHashCode2 = Long.hashCode(g0Var8.T);
                        m1 m1VarM2 = g0Var8.m();
                        b2.r rVarC2 = b2.a.c(rVarF, g0Var7);
                        g0Var8.g0();
                        if (g0Var8.S) {
                            g0Var8.l(gVar2);
                        } else {
                            g0Var8.q0();
                        }
                        l1.q.I(vVarA2, g0Var7, fVar);
                        l1.q.I(m1VarM2, g0Var7, fVar2);
                        x5.u(iHashCode2, g0Var7, fVar3, g0Var7, eVar);
                        l1.q.I(rVarC2, g0Var7, fVar4);
                        g0Var8.c0(1219104368);
                        for (ry.a aVar : arrayList) {
                            List listS = va.a.S(new String[]{aVar.g, aVar.d});
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : listS) {
                                if (!r30.k.L0((String) obj4)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            m3.h hVar = new m3.h(h00.q.R0(arrayList2, " · ", null, null, null, 62));
                            u00.k kVar6 = kVar5;
                            boolean zG2 = g0Var8.g(kVar6) | g0Var8.g(aVar);
                            Object objN3 = g0Var8.N();
                            if (zG2 || objN3 == l1.i.a) {
                                objN3 = new cz.i(kVar6, aVar, 0);
                                g0Var8.n0(objN3);
                            }
                            cz.a.g(aVar, hVar, (u00.a) objN3, g0Var7, 0);
                            kVar5 = kVar6;
                        }
                        z = true;
                        x5.z(g0Var8, false, true, false);
                    }
                    g0Var8.r(z);
                } else {
                    g0Var8.V();
                }
                return b0.a;
            case 4:
                u00.a aVar2 = (u00.a) this.B;
                u00.a aVar3 = (u00.a) this.C;
                u00.a aVar4 = (u00.a) this.D;
                j0.b item3 = (j0.b) obj;
                g0 g0Var9 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    eu.a.h(aVar2, aVar3, aVar4, null, g0Var9, 0);
                } else {
                    g0Var10.V();
                }
                return b0.a;
            case 5:
                u00.a aVar5 = (u00.a) this.B;
                u00.a aVar6 = (u00.a) this.C;
                z0 z0Var2 = (z0) this.D;
                w ModalBottomSheet = (w) obj;
                g0 g0Var11 = (l1.j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    long j2 = dl.a.q;
                    g4.d(6, j2, g0Var11, true);
                    float f = 16;
                    b2.r rVarG2 = h0.c.G(h0.c.E(h0.c.M(z.n.f(z1.d(b2.o.A, 1.0f), j2, i2.b0.b), h0.c.g), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                    v vVarA3 = u.a(h0.i.c, b2.b.N, g0Var11, 48);
                    int iHashCode3 = Long.hashCode(g0Var12.T);
                    m1 m1VarM3 = g0Var12.m();
                    b2.r rVarC3 = b2.a.c(rVarG2, g0Var11);
                    b3.i.c.getClass();
                    b3.g gVar3 = b3.h.b;
                    g0Var12.g0();
                    if (g0Var12.S) {
                        g0Var12.l(gVar3);
                    } else {
                        g0Var12.q0();
                    }
                    l1.q.I(vVarA3, g0Var11, b3.h.f);
                    l1.q.I(m1VarM3, g0Var11, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode3), g0Var11, b3.h.g);
                    l1.q.E(g0Var11, b3.h.h);
                    l1.q.I(rVarC3, g0Var11, b3.h.d);
                    kl.a.a(null, false, g0Var11, 48, 1);
                    boolean zI = p30.f.I(z0Var2);
                    boolean zH = g0Var12.h(false);
                    Object objN4 = g0Var12.N();
                    if (zH || objN4 == l1.i.a) {
                        objN4 = new ct.k(z0Var2, 2);
                        g0Var12.n0(objN4);
                    }
                    p30.f.G(zI, (u00.a) objN4, aVar5, aVar6, g0Var11, 6);
                    g0Var12.r(true);
                } else {
                    g0Var12.V();
                }
                return b0.a;
            case 6:
                zz.a aVar7 = (zz.a) this.B;
                Integer num = (Integer) this.C;
                String str = (String) this.D;
                w1 LiquidButton = (w1) obj;
                g0 g0Var13 = (l1.j) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton, "$this$LiquidButton");
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    b2.o oVar2 = b2.o.A;
                    b2.r rVarE = h0.c.E(f2.h.c(z1.e(oVar2, 36), p0.f.a(24)), 12, 0.0f, 2);
                    v1 v1VarA = t1.a(h0.i.g(6), b2.b.K, g0Var13, 54);
                    int iHashCode4 = Long.hashCode(g0Var14.T);
                    m1 m1VarM4 = g0Var14.m();
                    b2.r rVarC4 = b2.a.c(rVarE, g0Var13);
                    b3.i.c.getClass();
                    b3.g gVar4 = b3.h.b;
                    g0Var14.g0();
                    if (g0Var14.S) {
                        g0Var14.l(gVar4);
                    } else {
                        g0Var14.q0();
                    }
                    l1.q.I(v1VarA, g0Var13, b3.h.f);
                    l1.q.I(m1VarM4, g0Var13, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode4), g0Var13, b3.h.g);
                    l1.q.E(g0Var13, b3.h.h);
                    l1.q.I(rVarC4, g0Var13, b3.h.d);
                    if (aVar7 == null) {
                        g0Var14.c0(-110614768);
                        z3.j(y3.R(2131231074, g0Var13, 0), (String) null, z1.m(oVar2, 16), dl.a.k, g0Var13, 440, 0);
                        g0Var14.r(false);
                    } else if (num != null) {
                        g0Var14.c0(-110314719);
                        z3.j(y3.R(num.intValue(), g0Var13, 0), (String) null, z1.m(oVar2, 16), dl.a.k, g0Var13, 440, 0);
                        g0Var14.r(false);
                    } else {
                        g0Var14.c0(-110051312);
                        z3.j(y3.R(2131231344, g0Var13, 0), (String) null, z1.m(oVar2, 16), dl.a.k, g0Var13, 440, 0);
                        g0Var14.r(false);
                    }
                    z6.b(str, (b2.r) null, dl.a.k, kh.o.z(14), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var13, 1597440, 0, 262058);
                    g0Var14.r(true);
                } else {
                    g0Var14.V();
                }
                return b0.a;
            case 7:
                d00.x0 x0Var = (d00.x0) this.B;
                kk.c cVar4 = (kk.c) this.C;
                u00.k kVar7 = (u00.k) this.D;
                d0 PlayerScreenAnimatedVisibility = (d0) obj;
                g0 g0Var15 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$PlayerScreenAnimatedVisibility");
                h0.a0 a0Var = z1.c;
                w0 w0VarD = h0.o.d(b2.b.H, false);
                g0 g0Var16 = g0Var15;
                int iHashCode5 = Long.hashCode(g0Var16.T);
                m1 m1VarM5 = g0Var16.m();
                b2.r rVarC5 = b2.a.c(a0Var, g0Var15);
                b3.i.c.getClass();
                b3.g gVar5 = b3.h.b;
                g0Var16.g0();
                if (g0Var16.S) {
                    g0Var16.l(gVar5);
                } else {
                    g0Var16.q0();
                }
                l1.q.I(w0VarD, g0Var15, b3.h.f);
                l1.q.I(m1VarM5, g0Var15, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode5), g0Var15, b3.h.g);
                l1.q.E(g0Var15, b3.h.h);
                l1.q.I(rVarC5, g0Var15, b3.h.d);
                gv.p.B(x0Var, cVar4, kVar7, z1.d(b2.o.A, 1.0f), g0Var15, 3072, 0);
                g0Var16.r(true);
                break;
            case 8:
                o1 o1Var = (o1) this.B;
                u00.k kVar8 = (u00.k) this.D;
                kk.c cVar5 = (kk.c) this.C;
                d0 PlayerScreenAnimatedVisibility2 = (d0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility2, "$this$PlayerScreenAnimatedVisibility");
                gv.s.b(o1Var, kVar8, cVar5, null, (l1.j) obj2, 0);
                break;
            case 9:
                final gz.m1 m1Var = (gz.m1) this.B;
                z0 z0Var3 = (z0) this.C;
                p2 p2Var = (p2) this.D;
                j0.b item4 = (j0.b) obj;
                g0 g0Var17 = (l1.j) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item4, "$this$item");
                g0 g0Var18 = g0Var17;
                if (g0Var18.S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    v vVarA4 = u.a(h0.i.c, b2.b.M, g0Var17, 0);
                    int iHashCode6 = Long.hashCode(g0Var18.T);
                    m1 m1VarM6 = g0Var18.m();
                    b2.o oVar3 = b2.o.A;
                    b2.r rVarC6 = b2.a.c(oVar3, g0Var17);
                    b3.i.c.getClass();
                    b3.g gVar6 = b3.h.b;
                    g0Var18.g0();
                    if (g0Var18.S) {
                        g0Var18.l(gVar6);
                    } else {
                        g0Var18.q0();
                    }
                    l1.q.I(vVarA4, g0Var17, b3.h.f);
                    l1.q.I(m1VarM6, g0Var17, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode6), g0Var17, b3.h.g);
                    l1.q.E(g0Var17, b3.h.h);
                    l1.q.I(rVarC6, g0Var17, b3.h.d);
                    boolean z3 = ((g1) z0Var3.getValue()).v;
                    Object obj5 = l1.i.a;
                    if (z3) {
                        g0Var18.c0(712380308);
                        b2.r rVarE2 = h0.c.E(oVar3, s0.L(p2Var), 0.0f, 2);
                        String str2 = ((g1) z0Var3.getValue()).x;
                        String str3 = ((g1) z0Var3.getValue()).y;
                        boolean zG3 = g0Var18.g(m1Var);
                        Object objN5 = g0Var18.N();
                        if (zG3 || objN5 == obj5) {
                            final int i = 21;
                            objN5 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i2 = i;
                                    m1 m1Var2 = m1Var;
                                    switch (i2) {
                                        case 0:
                                            m1Var2.l(g.a);
                                            break;
                                        case 1:
                                            m1Var2.l(k.a);
                                            break;
                                        case 2:
                                            m1Var2.l(c.a);
                                            break;
                                        case 3:
                                            m1Var2.l(g.a);
                                            break;
                                        case 4:
                                            m1Var2.l(p.a);
                                            break;
                                        case 5:
                                            m1Var2.l(n.a);
                                            break;
                                        case 6:
                                            m1Var2.l(d0.a);
                                            break;
                                        case 7:
                                            m1Var2.l(t.a);
                                            break;
                                        case 8:
                                            m1Var2.l(h.a);
                                            break;
                                        case 9:
                                            m1Var2.l(u.a);
                                            break;
                                        case 10:
                                            m1Var2.l(o.a);
                                            break;
                                        case 11:
                                            m1Var2.l(m.a);
                                            break;
                                        case 12:
                                            m1Var2.l(e.a);
                                            break;
                                        case 13:
                                            m1Var2.l(q.a);
                                            break;
                                        case 14:
                                            m1Var2.l(l.a);
                                            break;
                                        case 15:
                                            m1Var2.l(e0.a);
                                            break;
                                        case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                            m1Var2.l(r.a);
                                            break;
                                        case 17:
                                            m1Var2.l(x.a);
                                            break;
                                        case 18:
                                            m1Var2.l(j0.a);
                                            break;
                                        case 19:
                                            m1Var2.l(k0.a);
                                            break;
                                        case 20:
                                            m1Var2.l(s.a);
                                            break;
                                        case 21:
                                            m1Var2.l(a0.a);
                                            break;
                                        case 22:
                                            m1Var2.l(b.a);
                                            break;
                                        case 23:
                                            m1Var2.l(z.a);
                                            break;
                                        case 24:
                                            m1Var2.l(b0.a);
                                            break;
                                        case 25:
                                            m1Var2.l(k.a);
                                            break;
                                        default:
                                            m1Var2.l(c.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var18.n0(objN5);
                        }
                        iz.d.d(str2, str3, (u00.a) objN5, rVarE2, g0Var17, 0);
                        g0Var18.r(false);
                    } else {
                        g0Var18.c0(712878044);
                        b2.r rVarE3 = h0.c.E(oVar3, s0.L(p2Var), 0.0f, 2);
                        boolean zG4 = g0Var18.g(m1Var);
                        Object objN6 = g0Var18.N();
                        if (zG4 || objN6 == obj5) {
                            final int i2 = 22;
                            objN6 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i3 = i2;
                                    m1 m1Var2 = m1Var;
                                    switch (i3) {
                                        case 0:
                                            m1Var2.l(g.a);
                                            break;
                                        case 1:
                                            m1Var2.l(k.a);
                                            break;
                                        case 2:
                                            m1Var2.l(c.a);
                                            break;
                                        case 3:
                                            m1Var2.l(g.a);
                                            break;
                                        case 4:
                                            m1Var2.l(p.a);
                                            break;
                                        case 5:
                                            m1Var2.l(n.a);
                                            break;
                                        case 6:
                                            m1Var2.l(d0.a);
                                            break;
                                        case 7:
                                            m1Var2.l(t.a);
                                            break;
                                        case 8:
                                            m1Var2.l(h.a);
                                            break;
                                        case 9:
                                            m1Var2.l(u.a);
                                            break;
                                        case 10:
                                            m1Var2.l(o.a);
                                            break;
                                        case 11:
                                            m1Var2.l(m.a);
                                            break;
                                        case 12:
                                            m1Var2.l(e.a);
                                            break;
                                        case 13:
                                            m1Var2.l(q.a);
                                            break;
                                        case 14:
                                            m1Var2.l(l.a);
                                            break;
                                        case 15:
                                            m1Var2.l(e0.a);
                                            break;
                                        case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                            m1Var2.l(r.a);
                                            break;
                                        case 17:
                                            m1Var2.l(x.a);
                                            break;
                                        case 18:
                                            m1Var2.l(j0.a);
                                            break;
                                        case 19:
                                            m1Var2.l(k0.a);
                                            break;
                                        case 20:
                                            m1Var2.l(s.a);
                                            break;
                                        case 21:
                                            m1Var2.l(a0.a);
                                            break;
                                        case 22:
                                            m1Var2.l(b.a);
                                            break;
                                        case 23:
                                            m1Var2.l(z.a);
                                            break;
                                        case 24:
                                            m1Var2.l(b0.a);
                                            break;
                                        case 25:
                                            m1Var2.l(k.a);
                                            break;
                                        default:
                                            m1Var2.l(c.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var18.n0(objN6);
                        }
                        iz.d.c((u00.a) objN6, rVarE3, g0Var17, 0);
                        g0Var18.r(false);
                    }
                    h0.c.h(z1.e(oVar3, 20), g0Var17);
                    g0Var18.r(true);
                } else {
                    g0Var18.V();
                }
                return b0.a;
            case 10:
                Context context = (Context) this.B;
                String str4 = (String) this.C;
                ln.c cVar6 = (ln.c) this.D;
                j6.g Column = (j6.g) obj;
                l1.j jVar = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(Column, "$this$Column");
                b6.k kVar9 = b6.k.a;
                ta.c0.d(ze.d.v(kVar9), 0, v1.d.d(1498093721, new kn.c(0, context, str4), jVar), jVar, 3072, 2);
                a.a.f(Column.a(kVar9), jVar, 0);
                ta.c0.d(ze.d.v(kVar9), 0, v1.d.d(1865373520, new a1.w(cVar6, 10), jVar), jVar, 3072, 6);
                a.a.f(Column.a(kVar9), jVar, 0);
                ta.c0.d((b6.m) null, 1, v1.d.d(-217177839, new c0.f(context, cVar6, 9), jVar), jVar, 3072, 3);
                break;
            case 11:
                jx.s sVar = (jx.s) this.B;
                u00.k kVar10 = (u00.k) this.D;
                p2 p2Var2 = (p2) this.C;
                k0.k item5 = (k0.k) obj;
                g0 g0Var19 = (l1.j) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item5, "$this$item");
                g0 g0Var20 = g0Var19;
                if (g0Var20.S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    c0.c(!sVar.g, (b2.r) null, (x0) null, (y0) null, (String) null, v1.d.d(368332551, new kx.c(kVar10, p2Var2, 0), g0Var19), g0Var19, 196608, 30);
                } else {
                    g0Var20.V();
                }
                return b0.a;
            case 12:
                jx.s sVar2 = (jx.s) this.B;
                u00.k kVar11 = (u00.k) this.D;
                kk.c cVar7 = (kk.c) this.C;
                d0 AnimatedVisibility = (d0) obj;
                g0 g0Var21 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                b2.r rVarE4 = z1.e(z1.q(b2.o.A, kx.i.a), 40);
                String str5 = sVar2.f;
                g0 g0Var22 = g0Var21;
                boolean zG5 = g0Var22.g(kVar11);
                Object objN7 = g0Var22.N();
                Object obj6 = l1.i.a;
                if (zG5 || objN7 == obj6) {
                    objN7 = new hv.j(13, kVar11);
                    g0Var22.n0(objN7);
                }
                u00.k kVar12 = (u00.k) objN7;
                boolean zG6 = g0Var22.g(kVar11);
                Object objN8 = g0Var22.N();
                if (zG6 || objN8 == obj6) {
                    objN8 = new hv.j(14, kVar11);
                    g0Var22.n0(objN8);
                }
                kx.a.h(rVarE4, str5, kVar12, cVar7, false, (u00.k) objN8, g0Var21, 196608, 80);
                break;
            case 13:
                uu.a aVar8 = (uu.a) this.B;
                p2 p2Var3 = (p2) this.C;
                p2 p2Var4 = (p2) this.D;
                w1 LiquidPlayer = (w1) obj;
                g0 g0Var23 = (l1.j) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidPlayer, "$this$LiquidPlayer");
                g0 g0Var24 = g0Var23;
                if (g0Var24.S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    b2.o oVar4 = b2.o.A;
                    b2.r rVarE5 = h0.c.E(z1.d(oVar4, 1.0f), 0.0f, 6, 1);
                    v1 v1VarA2 = t1.a(h0.i.g(12), b2.b.K, g0Var23, 54);
                    int iHashCode7 = Long.hashCode(g0Var24.T);
                    m1 m1VarM7 = g0Var24.m();
                    b2.r rVarC7 = b2.a.c(rVarE5, g0Var23);
                    b3.i.c.getClass();
                    b3.g gVar7 = b3.h.b;
                    g0Var24.g0();
                    if (g0Var24.S) {
                        g0Var24.l(gVar7);
                    } else {
                        g0Var24.q0();
                    }
                    l1.q.I(v1VarA2, g0Var23, b3.h.f);
                    l1.q.I(m1VarM7, g0Var23, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode7), g0Var23, b3.h.g);
                    l1.q.E(g0Var23, b3.h.h);
                    l1.q.I(rVarC7, g0Var23, b3.h.d);
                    if (((PlayerItem) p2Var3.getValue()) != null) {
                        g0Var24.c0(562759829);
                        PlayerItem playerItem = (PlayerItem) p2Var3.getValue();
                        kotlin.jvm.internal.m.b(playerItem);
                        k00.f.i(playerItem, g0Var23, 0);
                        g0Var24.r(false);
                    } else {
                        g0Var24.c0(562877071);
                        g0Var24.r(false);
                    }
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c.h(new c1(1.0f, true), g0Var23);
                    b2.r rVarM = z1.m(oVar4, 14);
                    boolean zI2 = g0Var24.i(aVar8);
                    Object objN9 = g0Var24.N();
                    l1.c cVar8 = l1.i.a;
                    if (zI2 || objN9 == cVar8) {
                        av.k kVar13 = new av.k(0, aVar8, uu.a.class, "playPauseToggle", "playPauseToggle()V", 0, 21);
                        g0Var24.n0(kVar13);
                        objN9 = kVar13;
                    }
                    b2.r rVarO = w50.c.o(rVarM, false, null, (u00.a) ((a10.g) objN9), 7);
                    m2.b bVarR = y3.R(((Boolean) p2Var4.getValue()).booleanValue() ? 2131231354 : 2131231358, g0Var23, 0);
                    long j3 = dl.a.j;
                    o3.a(bVarR, (String) null, rVarO, j3, g0Var23, 56, 0);
                    b2.r rVarM2 = z1.m(oVar4, 18);
                    boolean zI3 = g0Var24.i(aVar8);
                    Object objN10 = g0Var24.N();
                    if (zI3 || objN10 == cVar8) {
                        kVar = null;
                        rVar = rVarM2;
                        av.k kVar14 = new av.k(0, aVar8, uu.a.class, "seekToNext", "seekToNext()V", 0, 22);
                        g0Var24.n0(kVar14);
                        objN10 = kVar14;
                    } else {
                        kVar = null;
                        rVar = rVarM2;
                    }
                    o3.a(y3.R(2131231135, g0Var23, 0), (String) null, w50.c.o(rVar, false, kVar, (u00.a) ((a10.g) objN10), 7), j3, g0Var23, 56, 0);
                    g0Var24.r(true);
                } else {
                    g0Var24.V();
                }
                return b0.a;
            case 14:
                gm.a aVar9 = (gm.a) this.B;
                ju.f fVar5 = (ju.f) this.C;
                jk.a aVar10 = (jk.a) this.D;
                h0.t BoxWithConstraints = (h0.t) obj;
                g0 g0Var25 = (l1.j) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= g0Var25.g(BoxWithConstraints) ? 4 : 2;
                }
                g0 g0Var26 = g0Var25;
                if (g0Var26.S(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    gm.a aVar11 = gm.a.B;
                    boolean z4 = aVar9 == aVar11;
                    boolean zD = g0Var26.d(BoxWithConstraints.c()) | g0Var26.d(BoxWithConstraints.b()) | g0Var26.h(z4);
                    Object objN11 = g0Var26.N();
                    l1.c cVar9 = l1.i.a;
                    if (zD || objN11 == cVar9) {
                        float fX = ab.a0.x(Math.min(BoxWithConstraints.b() / 860.0f, BoxWithConstraints.c() / 400.0f) * (z4 ? 1.06f : 1.0f), 0.8f, 1.08f);
                        float f2 = z4 ? 1.12f : 1.0f;
                        float fX2 = ab.a0.x(40.0f * fX, 26.0f, 44.0f);
                        float fX3 = ab.a0.x(18.0f * fX, 15.0f, 20.0f);
                        float fX4 = ab.a0.x(14.0f * fX, 11.0f, 16.0f);
                        objN11 = new ju.b(g4.a0(fX, 20.0f, 14.0f, 28.0f), kh.o.F(fX2, 4294967296L), kh.o.F(fX2 * 1.14f, 4294967296L), g4.a0(fX, 56.0f * f2, 20.0f, 76.0f), g4.a0(fX, 80.0f, 64.0f, 94.0f), g4.a0(fX, 36.0f, 29.0f, 42.0f), g4.a0(fX, 7.0f * f2, 4.0f, 10.0f), kh.o.F(fX3, 4294967296L), kh.o.F(fX3, 4294967296L), kh.o.F(ab.a0.x(12.0f * fX, 10.0f, 13.0f), 4294967296L), kh.o.F(fX4, 4294967296L), kh.o.F(fX4 * 1.24f, 4294967296L), g4.a0(fX, f2 * 12.0f, 6.0f, 14.0f));
                        g0Var26.n0(objN11);
                    }
                    ju.b bVar2 = (ju.b) objN11;
                    boolean zD2 = g0Var26.d(BoxWithConstraints.c()) | g0Var26.d(BoxWithConstraints.b()) | g0Var26.h(z4);
                    Object objN12 = g0Var26.N();
                    if (zD2 || objN12 == cVar9) {
                        objN12 = oi.k.t(b5.G(BoxWithConstraints.b(), BoxWithConstraints.c(), z4), g0Var26);
                    }
                    float f3 = ((y3.f) objN12).A;
                    b2.o oVar5 = b2.o.A;
                    b2.r rVarG3 = h0.c.G(h0.c.E(z1.c(oVar5, 1.0f).V(aVar9 == aVar11 ? z1.q(oVar5, 420) : z1.d(oVar5, 1.0f)), bVar2.a, 0.0f, 2), 0.0f, f3, 0.0f, 0.0f, 13);
                    v vVarA5 = u.a(h0.i.c, b2.b.N, g0Var25, 54);
                    int iHashCode8 = Long.hashCode(g0Var26.T);
                    m1 m1VarM8 = g0Var26.m();
                    b2.r rVarC8 = b2.a.c(rVarG3, g0Var25);
                    b3.i.c.getClass();
                    b3.g gVar8 = b3.h.b;
                    g0Var26.g0();
                    if (g0Var26.S) {
                        g0Var26.l(gVar8);
                    } else {
                        g0Var26.q0();
                    }
                    l1.q.I(vVarA5, g0Var25, b3.h.f);
                    l1.q.I(m1VarM8, g0Var25, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode8), g0Var25, b3.h.g);
                    l1.q.E(g0Var25, b3.h.h);
                    l1.q.I(rVarC8, g0Var25, b3.h.d);
                    boolean z5 = z4;
                    g0 g0Var27 = g0Var25;
                    boolean z6 = true;
                    float f4 = 1.0f;
                    mu.d.u(fVar5, z1.d(oVar5, 1.0f), bVar2.b, bVar2.c, 3, 0.0f, g0Var27, 48, 32);
                    h0.c.h(z1.e(oVar5, bVar2.d), g0Var27);
                    g0Var26.c0(-233809176);
                    Iterator it = ju.c.a.iterator();
                    while (it.hasNext()) {
                        jk.a aVar12 = aVar10;
                        g0 g0Var28 = g0Var27;
                        va.a.e(z1.d(oVar5, f4), aVar12, p0.f.a(24), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new i2.t(i2.t.b(0.7f, dl.a.P)), v1.d.d(463064000, new c0.f(bVar2, z3.U(g0Var27, ((Number) it.next()).intValue()), 13), g0Var27), g0Var28, 805309446, 240);
                        aVar10 = aVar12;
                        g0Var27 = g0Var28;
                        h0.c.h(z1.e(oVar5, bVar2.m), g0Var27);
                        it = it;
                        f4 = 1.0f;
                        z6 = true;
                    }
                    g0Var26.r(false);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c.h(new c1(1.0f, true), g0Var27);
                    z6.b(z3.U(g0Var27, 2131886940), h0.c.D(z1.d(oVar5, 1.0f), 8, 12), i2.t.b(0.7f, dl.a.k), ju.e.a(z5), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), ju.e.b(z5), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var27, 48, 24960, 238568);
                    g0Var26.r(true);
                } else {
                    g0Var26.V();
                }
                return b0.a;
            case 15:
                ju.k kVar15 = (ju.k) this.B;
                ArrayList arrayList3 = (ArrayList) this.C;
                u00.k kVar16 = (u00.k) this.D;
                d0 AnimatedVisibility2 = (d0) obj;
                g0 g0Var29 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility2, "$this$AnimatedVisibility");
                b2.r rVarG4 = h0.c.G(z1.d(b2.o.A, 1.0f), 0.0f, kVar15.i, 0.0f, 0.0f, 13);
                h0.f fVarG = h0.i.g(12);
                b2.h hVar2 = b2.b.J;
                g0 g0Var30 = g0Var29;
                boolean zI4 = g0Var30.i(arrayList3) | g0Var30.g(kVar16);
                Object objN13 = g0Var30.N();
                if (zI4 || objN13 == l1.i.a) {
                    objN13 = new mu.q((Object) arrayList3, kVar16, 1);
                    g0Var30.n0(objN13);
                }
                k00.f.e(rVarG4, null, null, fVarG, hVar2, null, false, null, (u00.k) objN13, g0Var29, 221184, 462);
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return a(obj, obj2, obj3);
            case 17:
                return e(obj, obj2, obj3);
            case 18:
                return f(obj, obj2, obj3);
            case 19:
                return g(obj, obj2, obj3);
            case 20:
                return h(obj, obj2, obj3);
            case 21:
                return i(obj, obj2, obj3);
            default:
                String str6 = (String) this.B;
                String str7 = (String) this.C;
                u00.a aVar13 = (u00.a) this.D;
                d0 AnimatedVisibility3 = (d0) obj;
                l1.j jVar2 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility3, "$this$AnimatedVisibility");
                st.j.a(z3.U(jVar2, 2131887103), x5.m(str6, " · ", str7), aVar13, h0.c.G(b2.o.A, 0.0f, st.j.a, 0.0f, 0.0f, 13), jVar2, 3072);
                break;
        }
        return b0.a;
    }
}
