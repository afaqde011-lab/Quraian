package m0;

import android.os.Trace;
import d0.q1;
import h0.n1;
import h1.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l0.n0;
import l0.o0;
import l0.q0;
import l1.e1;
import l1.f1;
import l1.z0;
import z2.w1;
import z2.x0;

public final class p implements n0 {

    public final w f10356a;

    public final n1 f10357b;

    public final float f10358c;

    public final g f10359d;

    public final u00.a f10360e;

    public final u00.a f10361f;

    public final b2.h f10362g;

    public final e0.o f10363h;

    public final a40.z f10364i;

    public p(w wVar, n1 n1Var, float f3, g gVar, a10.r rVar, u00.a aVar, b2.h hVar, e0.o oVar, a40.z zVar) {
        q1 q1Var = q1.A;
        this.f10356a = wVar;
        this.f10357b = n1Var;
        this.f10358c = f3;
        this.f10359d = gVar;
        this.f10360e = rVar;
        this.f10361f = aVar;
        this.f10362g = hVar;
        this.f10363h = oVar;
        this.f10364i = zVar;
    }

    @Override
    public final x0 a(o0 o0Var, long j9) throws KotlinNothingValueException {
        b2.h hVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        f fVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        h00.m mVar;
        int i24;
        ArrayList arrayList;
        int i25;
        ArrayList arrayList2;
        int i26;
        int i27;
        ArrayList arrayList3;
        int i28;
        int i29;
        f fVar2;
        int i30;
        ArrayList arrayList4;
        int i31;
        h00.m mVar2;
        w1 w1Var;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Object obj;
        e0.o oVar;
        int i32;
        int i33;
        int i34;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        q qVar;
        w wVar;
        o0 o0Var2;
        List list;
        int iMax;
        p pVar = this;
        w wVar2 = pVar.f10356a;
        wVar2.A.getValue();
        q1 q1Var = q1.B;
        q1 q1Var2 = q1.A;
        z.n.h(j9, q1Var);
        w1 w1Var2 = o0Var.B;
        y3.m layoutDirection = w1Var2.getLayoutDirection();
        n1 n1Var = pVar.f10357b;
        int iR0 = w1Var2.R0(h0.c.o(n1Var, layoutDirection));
        int iR1 = w1Var2.R0(h0.c.n(n1Var, w1Var2.getLayoutDirection()));
        int iR2 = w1Var2.R0(n1Var.c());
        int iR3 = w1Var2.R0(n1Var.a()) + iR2;
        int i35 = iR1 + iR0;
        int i36 = i35 - iR0;
        long jI = y3.b.i(-i35, j9, -iR3);
        wVar2.f10396n = o0Var;
        int iR4 = w1Var2.R0(pVar.f10358c);
        int iH = y3.a.h(j9) - i35;
        int i37 = iR3;
        int i38 = i35;
        long j10 = (((long) iR0) << 32) | (((long) iR2) & 4294967295L);
        pVar.f10359d.getClass();
        int i39 = iH < 0 ? 0 : iH;
        y3.b.b(0, i39, 0, y3.a.g(jI), 5);
        o oVar2 = (o) pVar.f10360e.invoke();
        int i40 = iH + iR0 + i36;
        e0.o oVar3 = pVar.f10363h;
        long j11 = jI;
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        int i41 = iH;
        try {
            a2.o oVar4 = wVar2.f10388d;
            int iH2 = ((f1) oVar4.B).h();
            w1 w1Var3 = w1Var2;
            int i42 = l0.q.i(iH2, oVar4.E, oVar2);
            if (iH2 != i42) {
                ((f1) oVar4.B).i(i42);
                ((q0) oVar4.F).a(iH2);
            }
            ((f1) oVar4.B).h();
            float fH = ((e1) oVar4.D).h();
            wVar2.l();
            int i43 = i39 + iR4;
            int iF = w00.a.F(oVar3.b(i40, i39, iR0, i36) - (fH * i43));
            z1.q.n(fVarF, fVarK, kVarE);
            List listG = l0.q.g(oVar2, wVar2.f10407y, wVar2.f10403u);
            u.w wVar3 = u.m.f14876a;
            u.w wVar4 = new u.w();
            int iIntValue = ((Number) pVar.f10361f.invoke()).intValue();
            z0 z0Var = wVar2.f10408z;
            if (iR0 < 0) {
                g0.a.a("negative beforeContentPadding");
            }
            if (i36 < 0) {
                g0.a.a("negative afterContentPadding");
            }
            int i44 = i43 < 0 ? 0 : i43;
            int i45 = iF;
            int i46 = iIntValue < 0 ? iIntValue : 0;
            o oVar5 = oVar2;
            long jB = y3.b.b(0, i39, 0, y3.a.g(j11), 5);
            h00.y yVar = h00.y.A;
            e0.o oVar6 = pVar.f10363h;
            int i47 = i44;
            a40.z zVar = pVar.f10364i;
            if (iIntValue <= 0) {
                qVar = new q(i39, iR4, i36, -iR0, i41 + i36, i46, oVar6, w1Var3.o0(y3.b.g(y3.a.j(j11) + i38, j9), y3.b.f(y3.a.i(j11) + i37, j9), yVar, new xn.a(29)), zVar, o0Var, jB);
                o0Var2 = o0Var;
                wVar = wVar2;
            } else {
                long j12 = j10;
                int i48 = i36;
                int i49 = 0;
                int i50 = i39;
                int i51 = i42;
                while (i51 > 0 && i45 > 0) {
                    i51--;
                    i45 -= i47;
                }
                int i52 = i45 * (-1);
                if (i51 >= iIntValue) {
                    i51 = iIntValue - 1;
                    i52 = 0;
                }
                h00.m mVar3 = new h00.m();
                int i53 = -iR0;
                int i54 = i53 + (iR4 < 0 ? iR4 : 0);
                int i55 = i52 + i54;
                int iMax2 = 0;
                while (true) {
                    hVar = pVar.f10362g;
                    if (i55 >= 0 || i51 <= 0) {
                        break;
                    }
                    int i56 = i51 - 1;
                    int i57 = i53;
                    u.w wVar5 = wVar4;
                    int i58 = i50;
                    int i59 = iMax2;
                    int i60 = i46;
                    o oVar7 = oVar5;
                    int i61 = iIntValue;
                    int i62 = i38;
                    int i63 = i49;
                    int i64 = i37;
                    List list2 = listG;
                    h00.m mVar4 = mVar3;
                    long j13 = j12;
                    f fVarD = rd.a.D(o0Var, i56, jB, oVar7, j13, hVar, w1Var3.getLayoutDirection(), i58, wVar5);
                    i50 = i58;
                    wVar4 = wVar5;
                    mVar4.add(i63, fVarD);
                    i55 += i47;
                    i51 = i56;
                    j12 = j13;
                    mVar3 = mVar4;
                    listG = list2;
                    i37 = i64;
                    i38 = i62;
                    iR0 = iR0;
                    i53 = i57;
                    i46 = i60;
                    yVar = yVar;
                    iMax2 = Math.max(i59, fVarD.f10328h);
                    oVar5 = oVar7;
                    i49 = i63;
                    i48 = i48;
                    iIntValue = i61;
                    j11 = j11;
                    pVar = this;
                }
                h00.y yVar2 = yVar;
                int iMax3 = iMax2;
                int i65 = i46;
                int i66 = i53;
                long j14 = j11;
                long j15 = j12;
                int i67 = i48;
                int i68 = iIntValue;
                o oVar8 = oVar5;
                int i69 = i49;
                int i70 = iR0;
                int i71 = i38;
                int i72 = i37;
                List list3 = listG;
                h00.m mVar5 = mVar3;
                b2.h hVar2 = hVar;
                if (i55 < i54) {
                    i55 = i54;
                }
                int i73 = i55 - i54;
                int i74 = i41 + i67;
                int i75 = i74 < 0 ? i69 : i74;
                int i76 = -i73;
                int i77 = i51;
                int i78 = i69;
                int i79 = i78;
                while (i78 < mVar5.C) {
                    if (i76 >= i75) {
                        mVar5.c(i78);
                        i79 = 1;
                    } else {
                        i77++;
                        i76 += i47;
                        i78++;
                    }
                }
                int i80 = i79;
                List list4 = list3;
                boolean z10 = i80;
                int i81 = i76;
                int i82 = i68;
                int i83 = i73;
                int i84 = i51;
                int i85 = i77;
                while (i85 < i82 && (i81 < i75 || i81 <= 0 || mVar5.isEmpty())) {
                    int i86 = i74;
                    int i87 = i84;
                    int i88 = iMax3;
                    int i89 = i82;
                    long j16 = jB;
                    int i90 = i75;
                    f fVarD2 = rd.a.D(o0Var, i85, j16, oVar8, j15, hVar2, w1Var3.getLayoutDirection(), i50, wVar4);
                    int i91 = i85;
                    int i92 = i89 - 1;
                    i81 += i91 == i92 ? i50 : i47;
                    if (i81 > i54 || i91 == i92) {
                        iMax = Math.max(i88, fVarD2.f10328h);
                        mVar5.addLast(fVarD2);
                    } else {
                        i83 -= i47;
                        i87 = i91 + 1;
                        iMax = i88;
                        z10 = 1;
                    }
                    int i93 = iMax;
                    i85 = i91 + 1;
                    iMax3 = i93;
                    i75 = i90;
                    jB = j16;
                    i74 = i86;
                    i82 = i89;
                    i84 = i87;
                    z10 = z10;
                }
                if (i81 < i41) {
                    int i94 = i41 - i81;
                    int i95 = i81 + i94;
                    int i96 = i70;
                    int i97 = i83 - i94;
                    while (i97 < i96 && i84 > 0) {
                        i84--;
                        int i98 = i96;
                        f fVarD3 = rd.a.D(o0Var, i84, jB, oVar8, j15, hVar2, w1Var3.getLayoutDirection(), i50, wVar4);
                        mVar5.add(0, fVarD3);
                        iMax3 = Math.max(iMax3, fVarD3.f10328h);
                        i96 = i98;
                        i95 = i95;
                        i97 += i47;
                        i85 = i85;
                    }
                    i10 = i85;
                    int i99 = i97;
                    i12 = i95;
                    i11 = i96;
                    if (i99 < 0) {
                        i12 += i99;
                        i13 = 0;
                    } else {
                        i13 = i99;
                    }
                } else {
                    i10 = i85;
                    int i100 = i81;
                    i11 = i70;
                    int i101 = i83;
                    i12 = i100;
                    i13 = i101;
                }
                if (i13 < 0) {
                    g0.a.a("invalid currentFirstPageScrollOffset");
                }
                int i102 = -i13;
                f fVar3 = (f) mVar5.first();
                if (i11 > 0 || iR4 < 0) {
                    int i103 = i13;
                    int iA = mVar5.a();
                    f fVar4 = fVar3;
                    int i104 = i103;
                    int i105 = 0;
                    while (true) {
                        if (i105 >= iA || i104 == 0) {
                            i14 = iMax3;
                            i15 = i47;
                            break;
                        }
                        i14 = iMax3;
                        i15 = i47;
                        if (i15 > i104) {
                            break;
                        }
                        int i106 = iA;
                        if (i105 == va.a.M(mVar5)) {
                            break;
                        }
                        i104 -= i15;
                        i105++;
                        fVar4 = (f) mVar5.get(i105);
                        i47 = i15;
                        iMax3 = i14;
                        iA = i106;
                    }
                    f fVar5 = fVar4;
                    i16 = i104;
                    fVar3 = fVar5;
                } else {
                    i16 = i13;
                    i14 = iMax3;
                    i15 = i47;
                }
                q1 q1Var3 = q1.A;
                int iMax4 = Math.max(0, i84 - i65);
                int i107 = 1;
                int i108 = i84 - 1;
                if (iMax4 <= i108) {
                    ArrayList arrayList11 = null;
                    while (true) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        i17 = i15;
                        arrayList = arrayList11;
                        q1 q1Var4 = q1.A;
                        i19 = i11;
                        i20 = i12;
                        fVar = fVar3;
                        i22 = iMax4;
                        i18 = i41;
                        i23 = i102;
                        i21 = i107;
                        mVar = mVar5;
                        i24 = i65;
                        arrayList.add(rd.a.D(o0Var, i108, jB, oVar8, j15, hVar2, w1Var3.getLayoutDirection(), i50, wVar4));
                        if (i108 == i22) {
                            break;
                        }
                        i108--;
                        i107 = i21;
                        i65 = i24;
                        iMax4 = i22;
                        mVar5 = mVar;
                        i102 = i23;
                        i41 = i18;
                        i11 = i19;
                        i12 = i20;
                        fVar3 = fVar;
                        arrayList11 = arrayList;
                        i15 = i17;
                    }
                } else {
                    fVar = fVar3;
                    i17 = i15;
                    i18 = i41;
                    i19 = i11;
                    i20 = i12;
                    i21 = 1;
                    i22 = iMax4;
                    i23 = i102;
                    mVar = mVar5;
                    i24 = i65;
                    arrayList = null;
                }
                int size = list4.size();
                ArrayList arrayList12 = arrayList;
                int i109 = 0;
                while (i109 < size) {
                    List list5 = list4;
                    int i110 = i21;
                    int iIntValue2 = ((Number) list5.get(i109)).intValue();
                    if (iIntValue2 < i22) {
                        if (arrayList12 == null) {
                            arrayList12 = new ArrayList();
                        }
                        q1 q1Var5 = q1.A;
                        ArrayList arrayList13 = arrayList12;
                        list = list5;
                        arrayList13.add(rd.a.D(o0Var, iIntValue2, jB, oVar8, j15, hVar2, w1Var3.getLayoutDirection(), i50, wVar4));
                        arrayList12 = arrayList13;
                    } else {
                        list = list5;
                    }
                    i109++;
                    size = size;
                    list4 = list;
                    i21 = i110;
                }
                int i111 = i21;
                List list6 = list4;
                ArrayList arrayList14 = h00.x.A;
                ArrayList arrayList15 = arrayList12 == null ? arrayList14 : arrayList12;
                int iMax5 = i14;
                int i112 = 0;
                for (int size2 = arrayList15.size(); i112 < size2; size2 = size2) {
                    iMax5 = Math.max(iMax5, ((f) arrayList15.get(i112)).f10328h);
                    i112++;
                }
                int i113 = ((f) mVar.last()).f10321a;
                q1 q1Var6 = q1.A;
                int iMin = Math.min(i24, (i82 - i113) - 1) + i113;
                int i114 = i113 + 1;
                if (i114 <= iMin) {
                    ArrayList arrayList16 = null;
                    while (true) {
                        if (arrayList16 == null) {
                            arrayList16 = new ArrayList();
                        }
                        arrayList2 = arrayList14;
                        arrayList3 = arrayList16;
                        q1 q1Var7 = q1.A;
                        i25 = iMax5;
                        i26 = i24;
                        i27 = iMin;
                        int i115 = i114;
                        arrayList3.add(rd.a.D(o0Var, i115, jB, oVar8, j15, hVar2, w1Var3.getLayoutDirection(), i50, wVar4));
                        if (i115 == i27) {
                            break;
                        }
                        i114 = i115 + 1;
                        iMin = i27;
                        iMax5 = i25;
                        i24 = i26;
                        arrayList16 = arrayList3;
                        arrayList14 = arrayList2;
                    }
                } else {
                    i25 = iMax5;
                    arrayList2 = arrayList14;
                    i26 = i24;
                    i27 = iMin;
                    arrayList3 = null;
                }
                int size3 = list6.size();
                ArrayList arrayList17 = arrayList3;
                int i116 = 0;
                while (i116 < size3) {
                    int iIntValue3 = ((Number) list6.get(i116)).intValue();
                    int i117 = size3;
                    if (i27 + 1 <= iIntValue3 && iIntValue3 < i82) {
                        if (arrayList17 == null) {
                            arrayList17 = new ArrayList();
                        }
                        q1 q1Var8 = q1.A;
                        ArrayList arrayList18 = arrayList17;
                        arrayList18.add(rd.a.D(o0Var, iIntValue3, jB, oVar8, j15, hVar2, w1Var3.getLayoutDirection(), i50, wVar4));
                        arrayList17 = arrayList18;
                    }
                    i116++;
                    jB = jB;
                    i67 = i67;
                    mVar = mVar;
                    hVar2 = hVar2;
                    size3 = i117;
                }
                h00.m mVar6 = mVar;
                int i118 = i67;
                long j17 = jB;
                ArrayList arrayList19 = arrayList17 == null ? arrayList2 : arrayList17;
                int size4 = arrayList19.size();
                int iMax6 = i25;
                for (int i119 = 0; i119 < size4; i119++) {
                    iMax6 = Math.max(iMax6, ((f) arrayList19.get(i119)).f10328h);
                }
                f fVar6 = fVar;
                int i120 = (kotlin.jvm.internal.m.a(fVar6, mVar6.first()) && arrayList15.isEmpty() && arrayList19.isEmpty()) ? i111 : 0;
                q1 q1Var9 = q1.A;
                int i121 = i20;
                int iG = y3.b.g(i121, j14);
                int iF2 = y3.b.f(iMax6, j14);
                int i122 = i18;
                int i123 = i121 < Math.min(iG, i122) ? i111 : 0;
                if (i123 == 0 || i23 == 0) {
                    i28 = i23;
                } else {
                    StringBuilder sb2 = new StringBuilder("non-zero pagesScrollOffset=");
                    i28 = i23;
                    sb2.append(i28);
                    g0.a.c(sb2.toString());
                }
                ArrayList arrayList20 = new ArrayList(arrayList19.size() + arrayList15.size() + mVar6.a());
                if (i123 != 0) {
                    if (!arrayList15.isEmpty() || !arrayList19.isEmpty()) {
                        g0.a.a("No extra pages");
                    }
                    int iA2 = mVar6.a();
                    int[] iArr = new int[iA2];
                    for (int i124 = 0; i124 < iA2; i124++) {
                        iArr[i124] = i50;
                    }
                    int[] iArr2 = new int[iA2];
                    i29 = i118;
                    h0.f fVar7 = new h0.f(w1Var3.h0(iR4), false, null);
                    q1 q1Var10 = q1.A;
                    fVar2 = fVar6;
                    i30 = i122;
                    i31 = iG;
                    arrayList4 = arrayList20;
                    h00.m mVar7 = mVar6;
                    w1Var = w1Var3;
                    fVar7.c(o0Var, i31, iArr, y3.m.A, iArr2);
                    z00.e eVarF0 = h00.n.F0(iArr2);
                    int i125 = ((z00.c) eVarF0).A;
                    int i126 = ((z00.c) eVarF0).B;
                    int i127 = ((z00.c) eVarF0).C;
                    if ((i127 > 0 && i125 <= i126) || (i127 < 0 && i126 <= i125)) {
                        while (true) {
                            int i128 = iArr2[i125];
                            int i129 = i127;
                            mVar2 = mVar7;
                            int[] iArr3 = iArr2;
                            f fVar8 = (f) mVar2.get(i125);
                            fVar8.b(i128, i31, iF2);
                            arrayList4.add(fVar8);
                            if (i125 == i126) {
                                break;
                            }
                            i125 += i129;
                            mVar7 = mVar2;
                            i127 = i129;
                            iArr2 = iArr3;
                        }
                    } else {
                        mVar2 = mVar7;
                    }
                } else {
                    i29 = i118;
                    fVar2 = fVar6;
                    i30 = i122;
                    arrayList4 = arrayList20;
                    i31 = iG;
                    mVar2 = mVar6;
                    w1Var = w1Var3;
                    int size5 = arrayList15.size();
                    int i130 = i28;
                    int i131 = 0;
                    while (i131 < size5) {
                        int i132 = size5;
                        f fVar9 = (f) arrayList15.get(i131);
                        i130 -= i43;
                        fVar9.b(i130, i31, iF2);
                        arrayList4.add(fVar9);
                        i131++;
                        size5 = i132;
                    }
                    int iA3 = mVar2.a();
                    for (int i133 = 0; i133 < iA3; i133++) {
                        f fVar10 = (f) mVar2.get(i133);
                        fVar10.b(i28, i31, iF2);
                        arrayList4.add(fVar10);
                        i28 += i43;
                    }
                    int size6 = arrayList19.size();
                    for (int i134 = 0; i134 < size6; i134++) {
                        f fVar11 = (f) arrayList19.get(i134);
                        fVar11.b(i28, i31, iF2);
                        arrayList4.add(fVar11);
                        i28 += i43;
                    }
                }
                if (i120 != 0) {
                    arrayList5 = arrayList4;
                } else {
                    arrayList5 = new ArrayList(arrayList4.size());
                    int size7 = arrayList4.size();
                    int i135 = 0;
                    while (i135 < size7) {
                        Object obj2 = arrayList4.get(i135);
                        f fVar12 = (f) obj2;
                        h00.m mVar8 = mVar2;
                        int i136 = i31;
                        if (fVar12.f10321a >= ((f) mVar8.first()).f10321a && fVar12.f10321a <= ((f) mVar8.last()).f10321a) {
                            arrayList5.add(obj2);
                        }
                        i135++;
                        mVar2 = mVar8;
                        i31 = i136;
                    }
                }
                h00.m mVar9 = mVar2;
                int i137 = i31;
                if (arrayList15.isEmpty()) {
                    arrayList6 = arrayList2;
                } else {
                    arrayList6 = new ArrayList(arrayList4.size());
                    int size8 = arrayList4.size();
                    for (int i138 = 0; i138 < size8; i138++) {
                        Object obj3 = arrayList4.get(i138);
                        if (((f) obj3).f10321a < ((f) mVar9.first()).f10321a) {
                            arrayList6.add(obj3);
                        }
                    }
                }
                if (arrayList19.isEmpty()) {
                    arrayList7 = arrayList2;
                } else {
                    arrayList7 = new ArrayList(arrayList4.size());
                    int size9 = arrayList4.size();
                    for (int i139 = 0; i139 < size9; i139++) {
                        Object obj4 = arrayList4.get(i139);
                        if (((f) obj4).f10321a > ((f) mVar9.last()).f10321a) {
                            arrayList7.add(obj4);
                        }
                    }
                }
                if (arrayList5.isEmpty()) {
                    arrayList9 = arrayList5;
                    arrayList10 = arrayList7;
                    oVar = oVar6;
                    i32 = i29;
                    i33 = i19;
                    i34 = i40;
                    obj = null;
                    arrayList8 = arrayList6;
                } else {
                    obj = arrayList5.get(0);
                    oVar = oVar6;
                    i32 = i29;
                    i33 = i19;
                    i34 = i40;
                    arrayList8 = arrayList6;
                    float f3 = -Math.abs(((f) obj).f10330j - oVar.b(i34, i50, i33, i32));
                    int iM = va.a.M(arrayList5);
                    int i140 = i111;
                    if (i140 <= iM) {
                        Object obj5 = obj;
                        float f10 = f3;
                        while (true) {
                            Object obj6 = arrayList5.get(i140);
                            arrayList9 = arrayList5;
                            arrayList10 = arrayList7;
                            float f11 = -Math.abs(((f) obj6).f10330j - oVar.b(i34, i50, i33, i32));
                            if (Float.compare(f10, f11) < 0) {
                                f10 = f11;
                                obj5 = obj6;
                            }
                            if (i140 == iM) {
                                break;
                            }
                            i140++;
                            arrayList5 = arrayList9;
                            arrayList7 = arrayList10;
                        }
                        obj = obj5;
                    } else {
                        arrayList9 = arrayList5;
                        arrayList10 = arrayList7;
                    }
                }
                f fVar13 = (f) obj;
                float fX = i17 == 0 ? 0.0f : ab.a0.x((oVar.b(i34, i50, i33, i32) - (fVar13 != null ? fVar13.f10330j : 0)) / i17, -0.5f, 0.5f);
                x0 x0VarO0 = w1Var.o0(y3.b.g(i137 + i71, j9), y3.b.f(iF2 + i72, j9), yVar2, new v0(z0Var, arrayList4, 28));
                ArrayList arrayList21 = arrayList9;
                wVar = wVar2;
                w1Var3 = w1Var;
                qVar = new q(arrayList21, i50, iR4, i32, q1Var, i66, i74, i26, fVar2, fVar13, fX, i16, i10 < i82 || i121 > i30, oVar, x0VarO0, z10, arrayList8, arrayList10, zVar, o0Var, j17);
                o0Var2 = o0Var;
            }
            w wVar6 = wVar;
            wVar6.h(qVar, w1Var3.w0(), false);
            j jVar = wVar6.f10402t;
            List list7 = qVar.f10365a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (jVar.b() && !list7.isEmpty()) {
                    int i141 = ((f) h00.q.L0(list7)).f10321a;
                    int i142 = ((f) h00.q.T0(list7)).f10321a;
                    for (int i143 = jVar.f10344h; i143 < i141; i143++) {
                        o0Var2.a(i143);
                    }
                    int i144 = i142 + 1;
                    int i145 = jVar.f10345i;
                    if (i144 <= i145) {
                        while (true) {
                            o0Var2.a(i144);
                            if (i144 == i145) {
                                break;
                            }
                            i144++;
                        }
                    }
                }
                return qVar;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }
}
