package a1;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.b3;
import g1.o3;
import g1.z6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class w implements u00.o {
    public final int A;
    public final Object B;

    public w(j40.c cVar, j40.b bVar) {
        this.A = 7;
        this.B = cVar;
    }

    public w(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        long jB;
        Object next;
        int i12 = this.A;
        Map map = h00.y.A;
        l1.c cVar = l1.i.f9868a;
        b2.o oVar = b2.o.A;
        int i13 = 8;
        int i14 = 4;
        int i15 = 9;
        g00.b0 b0Var = g00.b0.a;
        Object obj4 = this.B;
        switch (i12) {
            case 0:
                x xVar = (x) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = xVar.V.k(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = xVar.V.k(iIntValue2);
                }
                if (xVar.T) {
                    long j9 = xVar.R.f13100b;
                    int i16 = m3.q0.f10519c;
                    if (iIntValue == ((int) (j9 >> 32)) && iIntValue2 == ((int) (j9 & 4294967295L))) {
                        z10 = false;
                    } else if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > xVar.R.f13099a.B.length()) {
                        e1.v0 v0Var = xVar.W;
                        v0Var.t(false);
                        v0Var.q(q0.z0.A);
                        z10 = false;
                    } else {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            z11 = true;
                            e1.v0 v0Var2 = xVar.W;
                            v0Var2.t(false);
                            v0Var2.q(q0.z0.A);
                        } else {
                            z11 = true;
                            xVar.W.h(true);
                        }
                        xVar.S.f12657v.invoke(new r3.w(xVar.R.f13099a, m3.h0.b(iIntValue, iIntValue2), (m3.q0) null));
                        z10 = z11;
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                j2 j2Var = (j2) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                z0.b bVarD = zBooleanValue2 ? j2Var.Q.f135a.d() : j2Var.Q.d();
                long j10 = bVarD.D;
                if (!j2Var.U || Math.min(iIntValue3, iIntValue4) < 0 || Math.max(iIntValue3, iIntValue4) > bVarD.C.length()) {
                    z12 = false;
                } else {
                    int i17 = m3.q0.f10519c;
                    if (iIntValue3 != ((int) (j10 >> 32)) || iIntValue4 != ((int) (j10 & 4294967295L))) {
                        long jB2 = m3.h0.b(iIntValue3, iIntValue4);
                        if (zBooleanValue2 || iIntValue3 == iIntValue4) {
                            j2Var.S.x(b1.k0.A);
                        } else {
                            j2Var.S.x(b1.k0.C);
                        }
                        if (zBooleanValue2) {
                            j2Var.Q.k(jB2);
                        } else {
                            j2Var.Q.j(jB2);
                        }
                    }
                    z12 = true;
                }
                return Boolean.valueOf(z12);
            case 2:
                ((h00.a) obj4).invoke((Throwable) obj);
                return b0Var;
            case 3:
                as.u0 u0Var = (as.u0) obj4;
                l1.j jVar = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((h0.w) obj, "$this$SurahListContainerWidget");
                l1.g0 g0Var = (l1.g0) jVar;
                if (!g0Var.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    g0Var.V();
                } else if (u0Var.a) {
                    g0Var.c0(1612323624);
                    ox.g.f((b2.r) null, jVar, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1612449639);
                    z6.b(z3.U(jVar, 2131887114), h0.c.E(h0.z1.d(oVar, 1.0f), 0.0f, 40, 1), dl.a.p, 0L, null, null, 0L, null, new x3.k(3), 0L, 0, false, 0, 0, null, null, jVar, 48, 0, 261112);
                    g0Var.r(false);
                }
                return b0Var;
            case 4:
                p9.g gVar = (p9.g) obj;
                l1.j jVar2 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(gVar, "route");
                l1.q.a(cq.l.a.a(gVar), v1.d.d(1144914588, new cq.k((p9.e) obj4, 0, (byte) 0), jVar2), jVar2, 56);
                return b0Var;
            case 5:
                e1.v0 v0Var3 = (e1.v0) obj4;
                b2.r rVar = (b2.r) obj;
                ((Integer) obj3).getClass();
                l1.g0 g0Var2 = (l1.g0) ((l1.j) obj2);
                g0Var2.c0(1980580247);
                y3.c cVar2 = (y3.c) g0Var2.k(c3.o1.f2734h);
                Object objN = g0Var2.N();
                if (objN == cVar) {
                    objN = l1.q.z(new y3.l(0L));
                    g0Var2.n0(objN);
                }
                l1.z0 z0Var = (l1.z0) objN;
                boolean zI = g0Var2.i(v0Var3);
                Object objN2 = g0Var2.N();
                if (zI || objN2 == cVar) {
                    objN2 = new o1(v0Var3, z0Var, i15);
                    g0Var2.n0(objN2);
                }
                u00.a aVar = (u00.a) objN2;
                boolean zG = g0Var2.g(cVar2);
                Object objN3 = g0Var2.N();
                if (zG || objN3 == cVar) {
                    objN3 = new as.f0(cVar2, z0Var, 8);
                    g0Var2.n0(objN3);
                }
                x.l lVar = e1.h0.f4965a;
                b2.r rVarA = b2.a.a(rVar, new c0.f((Object) aVar, (u00.k) objN3, i14));
                g0Var2.r(false);
                return rVarA;
            case 6:
                hn.a aVar2 = (hn.a) obj4;
                l1.j jVar3 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e((j6.g) obj, "$this$Column");
                ze.d.e(aVar2.b, null, new n6.e(dn.d.a, new y3.o(kh.o.z(15)), new n6.b(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN), null, 120), 1, jVar3, 3072, 2);
                ze.d.e(aVar2.c, null, new n6.e(dn.d.b, new y3.o(kh.o.z(12)), null, null, 124), 1, jVar3, 3072, 2);
                return b0Var;
            case 7:
                j40.c cVar3 = (j40.c) obj4;
                j40.c.H.set(cVar3, null);
                cVar3.i((Object) null);
                return b0Var;
            case 8:
                ((j40.h) obj4).d();
                return b0Var;
            case 9:
                jz.z zVar = (jz.z) obj4;
                l1.j jVar4 = (l1.j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((h0.w) obj, "$this$SubscriptionDetailsCardWidget");
                l1.g0 g0Var3 = (l1.g0) jVar4;
                if (g0Var3.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean z13 = zVar.b;
                    boolean z14 = zVar.c;
                    boolean z15 = zVar.d;
                    if (z13 || z15) {
                        g0Var3.c0(388080732);
                        String strU = z3.U(jVar4, 2131886732);
                        if (z15) {
                            i10 = 2131886719;
                        } else {
                            i10 = z14 ? 2131886721 : 2131887120;
                        }
                        kz.a.f(strU, z3.U(jVar4, i10), (b2.r) null, (z14 || z15) ? dl.a.U : dl.a.k, (String) null, jVar4, 0, 20);
                        g0Var3.r(false);
                    } else {
                        g0Var3.c0(388648683);
                        g0Var3.r(false);
                    }
                    if (r30.k.L0(zVar.f)) {
                        g0Var3.c0(389235947);
                        g0Var3.r(false);
                    } else {
                        g0Var3.c0(388710280);
                        if (z15) {
                            i11 = 2131886733;
                        } else if (z14) {
                            i11 = 2131886734;
                        } else {
                            i11 = zVar.e ? 2131886731 : 2131886726;
                        }
                        kz.a.f(z3.U(jVar4, i11), zVar.f, (b2.r) null, 0L, (String) null, jVar4, 0, 28);
                        g0Var3.r(false);
                    }
                    if (r30.k.L0(zVar.g)) {
                        g0Var3.c0(389478987);
                        g0Var3.r(false);
                    } else {
                        g0Var3.c0(389294475);
                        kz.a.f(z3.U(jVar4, 2131886735), zVar.g, (b2.r) null, 0L, (String) null, jVar4, 0, 28);
                        g0Var3.r(false);
                    }
                    if (r30.k.L0(zVar.h)) {
                        g0Var3.c0(389798411);
                        g0Var3.r(false);
                    } else {
                        g0Var3.c0(389540863);
                        kz.a.f(z3.U(jVar4, 2131886729), zVar.h, (b2.r) null, 0L, zVar.i, jVar4, 0, 12);
                        g0Var3.r(false);
                    }
                } else {
                    g0Var3.V();
                }
                return b0Var;
            case 10:
                ln.c cVar4 = (ln.c) obj4;
                j6.q qVar = (j6.q) obj;
                l1.j jVar5 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(qVar, "$this$Row");
                Iterator it = cVar4.c.iterator();
                while (it.hasNext()) {
                    w00.a.b(qVar.a(), 0, 1, v1.d.d(649376076, new c0.f((ln.a) it.next(), cVar4, 10), jVar5), jVar5, 3072, 2);
                }
                return b0Var;
            case 11:
                l1.r0 r0Var = (l1.r0) obj4;
                l1.j jVar6 = (l1.j) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= (iIntValue7 & 8) == 0 ? ((l1.g0) jVar6).g(obj) : ((l1.g0) jVar6).i(obj) ? 4 : 2;
                }
                l1.g0 g0Var4 = (l1.g0) jVar6;
                if (g0Var4.S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    kotlin.jvm.internal.m.c(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
                    g0Var4.E(r0Var, g0Var4.m(), obj, false);
                } else {
                    g0Var4.V();
                }
                return b0Var;
            case 12:
                oo.z0 z0Var2 = (oo.z0) obj4;
                l1.j jVar7 = (l1.j) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((h0.r) obj, "$this$LiquidBoxV2");
                l1.g0 g0Var5 = (l1.g0) jVar7;
                if (g0Var5.S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    b2.r rVarM = h0.z1.m(oVar, 24);
                    m2.b bVarR = y3.R(2131231091, jVar7, 0);
                    if (z0Var2.w) {
                        jB = dl.a.k;
                    } else {
                        jB = z0Var2.x ? dl.a.i : i2.t.b(0.7f, dl.a.i);
                    }
                    o3.a(bVarR, null, rVarM, jB, jVar7, 440, 0);
                } else {
                    g0Var5.V();
                }
                return b0Var;
            case 13:
                y1.c cVar5 = (y1.c) obj4;
                p9.e eVar = (p9.e) obj;
                l1.j jVar8 = (l1.j) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((l1.g0) jVar8).g(eVar) ? 4 : 2;
                }
                l1.g0 g0Var6 = (l1.g0) jVar8;
                if (g0Var6.S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    cVar5.f(eVar.f12468b, v1.d.d(121262920, new cq.k(eVar, 2, (byte) 0), jVar8), jVar8, 48);
                } else {
                    g0Var6.V();
                }
                return b0Var;
            case 14:
                b3 b3Var = (b3) obj4;
                l1.j jVar9 = (l1.j) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((h0.w) obj, "$this$DatePickerDialog");
                boolean z16 = (iIntValue10 & 17) != 16;
                int i18 = iIntValue10 & 1;
                l1.g0 g0Var7 = (l1.g0) jVar9;
                if (g0Var7.S(i18, z16)) {
                    l1.q.a(g1.y0.f6028a.a(new i2.t(dl.a.i)), v1.d.d(-1177108818, new m3.a(b3Var, i13), jVar9), jVar9, 56);
                } else {
                    g0Var7.V();
                }
                return b0Var;
            case 15:
                z2.y0 y0Var = (z2.y0) obj;
                z2.l1 l1VarO = ((z2.v0) obj2).O(y3.b.e(((y3.a) obj3).f16587a, y3.b.a(0, Integer.MAX_VALUE, y0Var.R0(((y3.f) ((s2) obj4).f121f.getValue()).A), Integer.MAX_VALUE)));
                return y0Var.o0(l1VarO.A, l1VarO.B, map, new q2(l1VarO, 16));
            case 16:
                z1.s sVar = (z1.s) obj4;
                p9.e eVar2 = (p9.e) obj;
                l1.j jVar10 = (l1.j) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((l1.g0) jVar10).g(eVar2) ? 4 : 2;
                }
                l1.g0 g0Var8 = (l1.g0) jVar10;
                if (g0Var8.S(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    Object obj5 = eVar2.f12468b;
                    if (((Set) g0Var8.k(q9.f.f12788a)).contains(obj5)) {
                        g0Var8.c0(1572214353);
                    } else {
                        g0Var8.c0(1574916499);
                        g0Var8.Z(1159182959, obj5);
                        Object objN4 = g0Var8.N();
                        if (objN4 == cVar) {
                            Object cVar6 = sVar.get(obj5);
                            if (cVar6 == null) {
                                cVar6 = new v1.c(new w(new l1.r0(), 11), 1032736913, true);
                                sVar.put(obj5, cVar6);
                            }
                            objN4 = (u00.o) cVar6;
                            g0Var8.n0(objN4);
                        }
                        ((u00.o) objN4).invoke(v1.d.d(-804085656, new cq.k(eVar2, 4, (byte) 0), jVar10), jVar10, 54);
                        g0Var8.r(false);
                    }
                    g0Var8.r(false);
                } else {
                    g0Var8.V();
                }
                return b0Var;
            case 17:
                z2.y0 y0Var2 = (z2.y0) obj;
                z2.v0 v0Var4 = (z2.v0) obj2;
                y3.a aVar3 = (y3.a) obj3;
                kotlin.jvm.internal.m.e(y0Var2, "$this$layout");
                kotlin.jvm.internal.m.e(v0Var4, "measurable");
                z2.l1 l1VarO2 = v0Var4.O(aVar3.f16587a);
                return y0Var2.o0(Math.round(((tm.e) obj4).c() * y3.a.h(aVar3.f16587a)), l1VarO2.B, map, new q2(l1VarO2, 21));
            case TYPE_SINT64_VALUE:
                androidx.lifecycle.e1 e1Var = (androidx.lifecycle.e1) obj4;
                p9.e eVar3 = (p9.e) obj;
                l1.j jVar11 = (l1.j) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((l1.g0) jVar11).g(eVar3) ? 4 : 2;
                }
                l1.g0 g0Var9 = (l1.g0) jVar11;
                if (g0Var9.S(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    w6.a aVarQ = qd.s0.Q(e1Var);
                    Object obj6 = eVar3.f12468b;
                    LinkedHashMap linkedHashMap = aVarQ.f15841c;
                    Object e1Var2 = linkedHashMap.get(obj6);
                    if (e1Var2 == null) {
                        e1Var2 = new androidx.lifecycle.e1();
                        linkedHashMap.put(obj6, e1Var2);
                    }
                    androidx.lifecycle.e1 e1Var3 = (androidx.lifecycle.e1) e1Var2;
                    ia.g gVar2 = (ia.g) g0Var9.k(ja.a.f8257a);
                    Object objN5 = g0Var9.N();
                    if (objN5 == cVar) {
                        objN5 = new w6.b(gVar2, e1Var3);
                        g0Var9.n0(objN5);
                    }
                    l1.q.a(u6.a.f14986a.a((w6.b) objN5), v1.d.d(1108866301, new cq.k(eVar3, 5, (byte) 0), jVar11), jVar11, 56);
                } else {
                    g0Var9.V();
                }
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                xy.n nVar = (xy.n) obj4;
                l1.j jVar12 = (l1.j) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((j0.b) obj, "$this$item");
                l1.g0 g0Var10 = (l1.g0) jVar12;
                if (g0Var10.S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    yy.d.b(nVar.a, nVar.b, nVar.c, jVar12, 0);
                } else {
                    g0Var10.V();
                }
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                bx.c cVar7 = (bx.c) obj4;
                pl.j jVar13 = (pl.j) obj;
                l1.j jVar14 = (l1.j) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(jVar13, "$this$SpoilerGroupContentWidget");
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= (iIntValue14 & 8) == 0 ? ((l1.g0) jVar14).g(jVar13) : ((l1.g0) jVar14).i(jVar13) ? 4 : 2;
                }
                boolean z17 = (iIntValue14 & 19) != 18;
                l1.g0 g0Var11 = (l1.g0) jVar14;
                a30.x xVar2 = g0Var11.f9842a;
                if (g0Var11.S(iIntValue14 & 1, z17)) {
                    b2.g gVar3 = b2.b.N;
                    h0.v vVarA = h0.u.a(h0.i.g(12), gVar3, jVar14, 54);
                    int iHashCode = Long.hashCode(g0Var11.T);
                    l1.m1 m1VarM = g0Var11.m();
                    b2.r rVarC = b2.a.c(oVar, jVar14);
                    b3.i.f2042c.getClass();
                    b3.g gVar4 = b3.h.f2035b;
                    g0Var11.g0();
                    if (g0Var11.S) {
                        g0Var11.l(gVar4);
                    } else {
                        g0Var11.q0();
                    }
                    b3.f fVar = b3.h.f2039f;
                    l1.q.I(vVarA, jVar14, fVar);
                    b3.f fVar2 = b3.h.f2038e;
                    l1.q.I(m1VarM, jVar14, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.f2040g;
                    l1.q.I(numValueOf, jVar14, fVar3);
                    b3.e eVar4 = b3.h.f2041h;
                    l1.q.E(jVar14, eVar4);
                    b3.f fVar4 = b3.h.f2037d;
                    l1.q.I(rVarC, jVar14, fVar4);
                    int i19 = (iIntValue14 << 9) & 7168;
                    jVar13.a(h0.z1.m(oVar, 214), p0.f.f12243a, v1.d.d(1054200667, new yr.d(cVar7, 0), jVar14), jVar14, 390 | i19, 0);
                    h0.v vVarA2 = h0.u.a(h0.i.g(4), gVar3, jVar14, 54);
                    int iHashCode2 = Long.hashCode(g0Var11.T);
                    l1.m1 m1VarM2 = g0Var11.m();
                    b2.r rVarC2 = b2.a.c(oVar, jVar14);
                    g0Var11.g0();
                    if (g0Var11.S) {
                        g0Var11.l(gVar4);
                    } else {
                        g0Var11.q0();
                    }
                    l1.q.I(vVarA2, jVar14, fVar);
                    l1.q.I(m1VarM2, jVar14, fVar2);
                    x5.u(iHashCode2, jVar14, fVar3, jVar14, eVar4);
                    l1.q.I(rVarC2, jVar14, fVar4);
                    int i20 = 384 | i19;
                    jVar13.a((b2.r) null, (i2.t0) null, v1.d.d(1028181797, new yr.d(cVar7, 1), jVar14), jVar14, i20, 3);
                    jVar13.a((b2.r) null, (i2.t0) null, v1.d.d(1640114958, new yr.d(cVar7, 2), jVar14), jVar14, i20, 3);
                    g0Var11.r(true);
                    g0Var11.r(true);
                } else {
                    g0Var11.V();
                }
                return b0Var;
            default:
                u30.b bVar = (u30.b) obj4;
                Integer num = (Integer) obj;
                l1.j jVar15 = (l1.j) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((l1.g0) jVar15).g(num) ? 4 : 2;
                }
                l1.g0 g0Var12 = (l1.g0) jVar15;
                if (g0Var12.S(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    Iterator it2 = bVar.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            int i21 = ((bx.c) next).a;
                            if (num != null && i21 == num.intValue()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    bx.c cVar8 = (bx.c) next;
                    if (cVar8 == null) {
                        g0Var12.c0(1173179204);
                        g0Var12.r(false);
                    } else {
                        g0Var12.c0(1173179205);
                        yr.a.j(cVar8, h0.z1.f6478c, jVar15, 56);
                        g0Var12.r(false);
                    }
                } else {
                    g0Var12.V();
                }
                return b0Var;
        }
    }
}
