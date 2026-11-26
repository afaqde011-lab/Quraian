package j0;

import d0.q1;
import h0.n1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import l0.f0;
import l0.n0;
import l0.o0;
import l1.z0;
import z2.w1;
import z2.x0;

public final class l implements n0 {

    public final v f7760a;

    public final boolean f7761b;

    public final n1 f7762c;

    public final u00.a f7763d;

    public final h0.h f7764e;

    public final h0.e f7765f;

    public final a40.z f7766g;

    public final i2.y f7767h;

    public final l0.f f7768i;

    public final b2.c f7769j;

    public final b2.h f7770k;

    public l(v vVar, boolean z10, n1 n1Var, a10.r rVar, h0.h hVar, h0.e eVar, a40.z zVar, i2.y yVar, l0.f fVar, b2.c cVar, b2.h hVar2) {
        this.f7760a = vVar;
        this.f7761b = z10;
        this.f7762c = n1Var;
        this.f7763d = rVar;
        this.f7764e = hVar;
        this.f7765f = eVar;
        this.f7766g = zVar;
        this.f7767h = yVar;
        this.f7768i = fVar;
        this.f7769j = cVar;
        this.f7770k = hVar2;
    }

    @Override
    public final x0 a(o0 o0Var, long j9) throws KotlinNothingValueException {
        float fA;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f3;
        int i17;
        int i18;
        ArrayList arrayList;
        float f10;
        int i19;
        ArrayList arrayList2;
        Map map;
        int i20;
        int iF;
        int i21;
        ArrayList arrayList3;
        f0 f0Var;
        i iVar;
        float f11;
        h00.m mVar;
        boolean z10;
        Integer numValueOf;
        Integer numValueOf2;
        w1 w1Var;
        n nVar;
        int i22;
        w1 w1Var2 = o0Var.B;
        v vVar = this.f7760a;
        vVar.f7834t.getValue();
        int i23 = 1;
        boolean z11 = vVar.f7818b || w1Var2.w0();
        boolean z12 = this.f7761b;
        z.n.h(j9, z12 ? q1.A : q1.B);
        n1 n1Var = this.f7762c;
        int iR0 = z12 ? w1Var2.R0(n1Var.b(w1Var2.getLayoutDirection())) : w1Var2.R0(h0.c.o(n1Var, w1Var2.getLayoutDirection()));
        int iR1 = z12 ? w1Var2.R0(n1Var.d(w1Var2.getLayoutDirection())) : w1Var2.R0(h0.c.n(n1Var, w1Var2.getLayoutDirection()));
        int iR2 = w1Var2.R0(n1Var.c());
        int iR3 = w1Var2.R0(n1Var.a()) + iR2;
        int i24 = iR0 + iR1;
        int i25 = z12 ? iR3 : i24;
        int i26 = z12 ? iR2 : !z12 ? iR0 : iR1;
        int i27 = i25 - i26;
        long jI = y3.b.i(-i24, j9, -iR3);
        i iVar2 = (i) this.f7763d.invoke();
        b bVar = iVar2.f7758c;
        int iH = y3.a.h(jI);
        int iG = y3.a.g(jI);
        bVar.f7745a.i(iH);
        bVar.f7746b.i(iG);
        h0.e eVar = this.f7765f;
        h0.h hVar = this.f7764e;
        if (z12) {
            if (hVar == null) {
                throw g4.c.o("null verticalArrangement when isVertical == true");
            }
            fA = hVar.a();
        } else {
            if (eVar == null) {
                throw g4.c.o("null horizontalAlignment when isVertical == false");
            }
            fA = eVar.a();
        }
        int iR4 = w1Var2.R0(fA);
        int i28 = iVar2.f7757b.k().B;
        long j11 = (((long) iR0) << 32) | (((long) iR2) & 4294967295L);
        int iG2 = z12 ? y3.a.g(j9) - iR3 : y3.a.h(j9) - i24;
        int i29 = i26;
        k kVar = new k(jI, this.f7761b, iVar2, o0Var, i28, iR4, this.f7769j, this.f7770k, i29, i27, j11, this.f7760a);
        int i30 = i28;
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            q qVar = vVar.f7821e;
            int iH2 = qVar.f7808b.h();
            int i31 = l0.q.i(iH2, qVar.f7811e, iVar2);
            if (iH2 != i31) {
                qVar.f7808b.i(i31);
                qVar.f7812f.a(iH2);
            }
            int iH3 = qVar.f7809c.h();
            z1.q.n(fVarF, fVarK, kVarE);
            List listG = l0.q.g(iVar2, vVar.f7833s, vVar.f7830p);
            float fFloatValue = (w1Var2.w0() || !z11) ? vVar.f7824h : ((Number) ((x.j) vVar.f7838x.B).B.getValue()).floatValue();
            f0 f0Var2 = vVar.f7829o;
            boolean zW0 = w1Var2.w0();
            z0 z0Var = vVar.f7837w;
            boolean z13 = vVar.f7825i;
            if (i29 < 0) {
                g0.a.a("invalid beforeContentPadding");
            }
            if (i27 < 0) {
                g0.a.a("invalid afterContentPadding");
            }
            Map map2 = h00.y.A;
            i iVar3 = kVar.C;
            int i32 = iH3;
            boolean z14 = this.f7761b;
            a40.z zVar = this.f7766g;
            i2.y yVar = this.f7767h;
            ArrayList arrayList4 = h00.x.A;
            if (i30 <= 0) {
                int iJ = y3.a.j(jI);
                int i33 = y3.a.i(jI);
                f0Var2.d(0, iJ, i33, new ArrayList(), iVar3.f7759d, kVar, z14, zW0, 1, z11, 0, 0, zVar, yVar);
                if (!zW0) {
                    long jB = f0Var2.b();
                    if (!y3.l.b(jB, 0L)) {
                        iJ = y3.b.g((int) (jB >> 32), jI);
                        i33 = y3.b.f((int) (jB & 4294967295L), jI);
                    }
                }
                w1Var = w1Var2;
                nVar = new n(null, 0, false, 0.0f, w1Var2.o0(y3.b.g(iJ + i24, j9), y3.b.f(i33 + iR3, j9), map2, new xn.a(29)), 0.0f, false, zVar, o0Var, kVar.E, arrayList4, -i29, iG2 + i27, 0, z14 ? q1.A : q1.B, i27, iR4);
            } else {
                k kVar2 = kVar;
                int i34 = iG2;
                if (i31 >= i30) {
                    i31 = i30 - 1;
                    i32 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i35 = i32 - iRound;
                if (i31 == 0 && i35 < 0) {
                    iRound += i35;
                    i35 = 0;
                }
                h00.m mVar2 = new h00.m();
                int i36 = -i29;
                float f12 = fFloatValue;
                int i37 = i36 + (iR4 < 0 ? iR4 : 0);
                int i38 = i35 + i37;
                int i39 = i31;
                int iMax = 0;
                while (true) {
                    j10 = kVar2.E;
                    if (i38 >= 0 || i39 <= 0) {
                        break;
                    }
                    int i40 = i36;
                    int i41 = i39 - 1;
                    o oVarW0 = kVar2.W0(i41, j10);
                    mVar2.add(0, oVarW0);
                    iMax = Math.max(iMax, oVarW0.f7801r);
                    i38 += oVarW0.f7800q;
                    i39 = i41;
                    i36 = i40;
                }
                int i42 = i36;
                int i43 = 0;
                if (i38 < i37) {
                    iRound -= i37 - i38;
                    i38 = i37;
                }
                int i44 = iRound;
                int i45 = i38 - i37;
                int i46 = iMax;
                int i47 = i34 + i27;
                if (i47 < 0) {
                    i10 = i47;
                } else {
                    i43 = i47;
                    i10 = i43;
                }
                int i48 = i45;
                int i49 = -i45;
                int i50 = i39;
                int i51 = 0;
                boolean z15 = false;
                while (i51 < mVar2.C) {
                    if (i49 >= i43) {
                        mVar2.c(i51);
                        z15 = true;
                    } else {
                        i50++;
                        i49 += ((o) mVar2.get(i51)).f7800q;
                        i51++;
                    }
                }
                int i52 = i50;
                int iMax2 = i46;
                boolean z16 = z15;
                while (i52 < i30 && (i49 < i43 || i49 <= 0 || mVar2.isEmpty())) {
                    int i53 = i43;
                    o oVarW1 = kVar2.W0(i52, j10);
                    int i54 = i30;
                    int i55 = oVarW1.f7800q;
                    i49 += i55;
                    if (i49 <= i37) {
                        i22 = i37;
                        if (i52 != i54 - 1) {
                            i48 -= i55;
                            i39 = i52 + 1;
                            z16 = true;
                        }
                        i52++;
                        i43 = i53;
                        i37 = i22;
                        i30 = i54;
                    } else {
                        i22 = i37;
                    }
                    int iMax3 = Math.max(iMax2, oVarW1.f7801r);
                    mVar2.addLast(oVarW1);
                    iMax2 = iMax3;
                    i52++;
                    i43 = i53;
                    i37 = i22;
                    i30 = i54;
                }
                int i56 = i30;
                if (i49 < i34) {
                    int i57 = i34 - i49;
                    int i58 = i49 + i57;
                    int i59 = i48 - i57;
                    while (i59 < i29 && i39 > 0) {
                        int i60 = i39 - 1;
                        int i61 = i57;
                        o oVarW2 = kVar2.W0(i60, j10);
                        mVar2.add(0, oVarW2);
                        iMax2 = Math.max(iMax2, oVarW2.f7801r);
                        i59 += oVarW2.f7800q;
                        i39 = i60;
                        i57 = i61;
                        i58 = i58;
                    }
                    int i62 = i57;
                    int i63 = i58;
                    i11 = i44;
                    int i64 = i11 + i62;
                    if (i59 < 0) {
                        int i65 = i64 + i59;
                        i12 = i63 + i59;
                        i13 = i39;
                        i15 = i65;
                        i14 = 0;
                    } else {
                        i14 = i59;
                        i13 = i39;
                        i12 = i63;
                        i15 = i64;
                    }
                } else {
                    i11 = i44;
                    i12 = i49;
                    i13 = i39;
                    i14 = i48;
                    i15 = i11;
                }
                int i66 = iMax2;
                if (Integer.signum(Math.round(f12)) != Integer.signum(i15) || Math.abs(Math.round(f12)) < Math.abs(i15)) {
                    i16 = i15;
                    f3 = f12;
                } else {
                    i16 = i15;
                    f3 = i16;
                }
                float f13 = f12 - f3;
                float f14 = 0.0f;
                if (zW0 && i16 > i11 && f13 <= 0.0f) {
                    f14 = (i16 - i11) + f13;
                }
                float f15 = f14;
                if (i14 < 0) {
                    g0.a.a("negative currentFirstItemScrollOffset");
                }
                int i67 = -i14;
                o oVar = (o) mVar2.first();
                if (i29 > 0 || iR4 < 0) {
                    int iA = mVar2.a();
                    int i68 = i14;
                    int i69 = 0;
                    while (i69 < iA) {
                        int i70 = iA;
                        int i71 = ((o) mVar2.get(i69)).f7800q;
                        if (i68 == 0 || i71 > i68 || i69 == va.a.M(mVar2)) {
                            break;
                        }
                        i68 -= i71;
                        i69++;
                        oVar = (o) mVar2.get(i69);
                        iA = i70;
                    }
                    i17 = i68;
                } else {
                    i17 = i14;
                }
                o oVar2 = oVar;
                int iMax4 = Math.max(0, i13);
                int i72 = i13 - 1;
                if (iMax4 <= i72) {
                    ArrayList arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i18 = i52;
                        arrayList = arrayList5;
                        arrayList.add(kVar2.W0(i72, j10));
                        if (i72 == iMax4) {
                            break;
                        }
                        i72--;
                        arrayList5 = arrayList;
                        i52 = i18;
                    }
                } else {
                    i18 = i52;
                    arrayList = null;
                }
                int size = listG.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i73 = size - 1;
                        int iIntValue = ((Number) listG.get(size)).intValue();
                        if (iIntValue < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(kVar2.W0(iIntValue, j10));
                        }
                        if (i73 < 0) {
                            break;
                        }
                        size = i73;
                    }
                }
                if (arrayList == null) {
                    arrayList = arrayList4;
                }
                int iMax5 = i66;
                int i74 = 0;
                for (int size2 = arrayList.size(); i74 < size2; size2 = size2) {
                    iMax5 = Math.max(iMax5, ((o) arrayList.get(i74)).f7801r);
                    i74++;
                }
                int iMin = Math.min(((o) h00.q.T0(mVar2)).f7786a, i56 - 1);
                int i75 = ((o) h00.q.T0(mVar2)).f7786a + 1;
                if (i75 <= iMin) {
                    ArrayList arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        f10 = f3;
                        i19 = iMax5;
                        arrayList2 = arrayList6;
                        arrayList2.add(kVar2.W0(i75, j10));
                        if (i75 == iMin) {
                            break;
                        }
                        i75++;
                        arrayList6 = arrayList2;
                        iMax5 = i19;
                        f3 = f10;
                    }
                } else {
                    f10 = f3;
                    i19 = iMax5;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((o) h00.q.T0(arrayList2)).f7786a > iMin) {
                    iMin = ((o) h00.q.T0(arrayList2)).f7786a;
                }
                int size3 = listG.size();
                int i76 = 0;
                while (i76 < size3) {
                    List list = listG;
                    int iIntValue2 = ((Number) listG.get(i76)).intValue();
                    if (iIntValue2 > iMin) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(kVar2.W0(iIntValue2, j10));
                    }
                    i76++;
                    listG = list;
                }
                if (arrayList2 == null) {
                    arrayList2 = arrayList4;
                }
                int size4 = arrayList2.size();
                int iMax6 = i19;
                for (int i77 = 0; i77 < size4; i77++) {
                    iMax6 = Math.max(iMax6, ((o) arrayList2.get(i77)).f7801r);
                }
                boolean z17 = kotlin.jvm.internal.m.a(oVar2, mVar2.first()) && arrayList.isEmpty() && arrayList2.isEmpty();
                int iG3 = y3.b.g(z14 ? iMax6 : i12, jI);
                if (z14) {
                    iMax6 = i12;
                }
                int iF2 = y3.b.f(iMax6, jI);
                int i78 = z14 ? iF2 : iG3;
                boolean z18 = i12 < Math.min(i78, i34);
                if (z18 && i67 != 0) {
                    g0.a.c("non-zero itemsScrollOffset");
                }
                boolean z19 = z17;
                ArrayList arrayList7 = new ArrayList(arrayList2.size() + arrayList.size() + mVar2.a());
                if (z18) {
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                        g0.a.a("no extra items");
                    }
                    int iA2 = mVar2.a();
                    int[] iArr = new int[iA2];
                    for (int i79 = 0; i79 < iA2; i79++) {
                        iArr[i79] = ((o) mVar2.get(i79)).f7799p;
                    }
                    int[] iArr2 = new int[iA2];
                    if (z14) {
                        if (hVar == null) {
                            throw g4.c.o("null verticalArrangement when isVertical == true");
                        }
                        hVar.b(o0Var, i78, iArr, iArr2);
                        i20 = 0;
                    } else {
                        if (eVar == null) {
                            throw g4.c.o("null horizontalArrangement when isVertical == false");
                        }
                        i20 = 0;
                        eVar.c(o0Var, i78, iArr, y3.m.A, iArr2);
                    }
                    z00.e eVarF0 = h00.n.F0(iArr2);
                    eVarF0.getClass();
                    int i80 = ((z00.c) eVarF0).B;
                    int i81 = ((z00.c) eVarF0).C;
                    if ((i81 > 0 && i80 >= 0) || (i81 < 0 && i80 <= 0)) {
                        int i82 = 0;
                        while (true) {
                            int i83 = iArr2[i82];
                            o oVar3 = (o) mVar2.get(i82);
                            oVar3.n(i83, iG3, iF2);
                            arrayList7.add(oVar3);
                            if (i82 == i80) {
                                break;
                            }
                            i82 += i81;
                        }
                    }
                    map = map2;
                } else {
                    kVar2 = kVar2;
                    map = map2;
                    i34 = i34;
                    i20 = 0;
                    int i84 = i67;
                    int i85 = 0;
                    for (int size5 = arrayList.size(); i85 < size5; size5 = size5) {
                        o oVar4 = (o) arrayList.get(i85);
                        i84 -= oVar4.f7800q;
                        oVar4.n(i84, iG3, iF2);
                        arrayList7.add(oVar4);
                        i85++;
                    }
                    int iA3 = mVar2.a();
                    int i86 = i67;
                    for (int i87 = 0; i87 < iA3; i87++) {
                        o oVar5 = (o) mVar2.get(i87);
                        oVar5.n(i86, iG3, iF2);
                        arrayList7.add(oVar5);
                        i86 += oVar5.f7800q;
                    }
                    int size6 = arrayList2.size();
                    for (int i88 = 0; i88 < size6; i88++) {
                        o oVar6 = (o) arrayList2.get(i88);
                        oVar6.n(i86, iG3, iF2);
                        arrayList7.add(oVar6);
                        i86 += oVar6.f7800q;
                    }
                }
                if (z13) {
                    iF = iF2;
                    i21 = i12;
                    arrayList3 = arrayList7;
                    f0Var = f0Var2;
                    iVar = iVar3;
                    f11 = f10;
                } else {
                    f11 = f10;
                    iVar = iVar3;
                    int i89 = i12;
                    f0Var = f0Var2;
                    f0Var.d((int) f11, iG3, iF2, arrayList7, iVar.f7759d, kVar2, z14, zW0, 1, z11, i17, i89, zVar, yVar);
                    iF = iF2;
                    arrayList3 = arrayList7;
                    i21 = i89;
                }
                k kVar3 = kVar2;
                if (zW0) {
                    mVar = mVar2;
                    z10 = z14;
                } else {
                    long jB2 = f0Var.b();
                    z10 = z14;
                    mVar = mVar2;
                    if (!y3.l.b(jB2, 0L)) {
                        int i90 = z10 ? iF : iG3;
                        iG3 = y3.b.g(Math.max(iG3, (int) (jB2 >> 32)), jI);
                        iF = y3.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), jI);
                        int i91 = z10 ? iF : iG3;
                        if (i91 != i90) {
                            int size7 = arrayList3.size();
                            for (int i92 = i20; i92 < size7; i92++) {
                                o oVar7 = (o) arrayList3.get(i92);
                                oVar7.f7803t = i91;
                                oVar7.f7805v = oVar7.f7793h + i91;
                            }
                        }
                    }
                }
                int i93 = iF;
                int i94 = iG3;
                o oVar8 = (o) mVar.i();
                int i95 = oVar8 != null ? oVar8.f7786a : i20;
                o oVar9 = (o) mVar.l();
                int i96 = oVar9 != null ? oVar9.f7786a : i20;
                u.v vVar2 = iVar.f7757b.f7755d;
                if (vVar2 == null) {
                    vVar2 = u.k.f14870a;
                }
                List listF = l0.q.f(this.f7768i, i95, i96, arrayList3, vVar2, i29, i94, i93, new h00.a(kVar3, 5));
                if (z19) {
                    o oVar10 = (o) h00.q.N0(arrayList3);
                    if (oVar10 != null) {
                        numValueOf = Integer.valueOf(oVar10.f7786a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    o oVar11 = (o) mVar.i();
                    if (oVar11 != null) {
                        numValueOf = Integer.valueOf(oVar11.f7786a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z19) {
                    o oVar12 = (o) h00.q.U0(arrayList3);
                    if (oVar12 != null) {
                        numValueOf2 = Integer.valueOf(oVar12.f7786a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    o oVar13 = (o) mVar.l();
                    if (oVar13 != null) {
                        numValueOf2 = Integer.valueOf(oVar13.f7786a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                if (i18 >= i56 && i21 <= i34) {
                    i23 = i20;
                }
                w1Var = w1Var2;
                nVar = new n(oVar2, i17, i23, f11, w1Var2.o0(y3.b.g(i94 + i24, j9), y3.b.f(i93 + iR3, j9), map, new m(z0Var, arrayList3, listF, zW0, 0)), f15, z16, zVar, o0Var, kVar3.E, l0.q.o(numValueOf != null ? numValueOf.intValue() : i20, numValueOf2 != null ? numValueOf2.intValue() : i20, arrayList3, listF), i42, i10, i56, z10 ? q1.A : q1.B, i27, iR4);
            }
            vVar.g(nVar, w1Var.w0(), false);
            a aVar = vVar.f7817a;
            return nVar;
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }
}
