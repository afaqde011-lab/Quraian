package g4;

import java.util.ArrayList;

public abstract class k {

    public static final boolean[] f6207a = new boolean[3];

    public static void a(f fVar, e4.c cVar, ArrayList arrayList, int i10) {
        int i11;
        b[] bVarArr;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        e eVar;
        e4.c cVar2;
        e4.g gVar;
        d dVar;
        e4.g gVar2;
        e eVar2;
        int i15;
        d dVar2;
        e4.g gVar3;
        e eVar3;
        int i16;
        d[] dVarArr;
        int i17;
        d dVar3;
        d dVar4;
        e4.g gVar4;
        d dVar5;
        e4.g gVar5;
        int size;
        ArrayList arrayList2;
        int i18;
        float f3;
        e4.g gVar6;
        e4.g gVar7;
        e4.g gVar8;
        e4.g gVar9;
        e4.b bVarL;
        float f10;
        d dVar6;
        e eVar4;
        int i19;
        int i20;
        e eVar5;
        f fVar2 = fVar;
        if (i10 == 0) {
            i11 = fVar2.f6171y0;
            bVarArr = fVar2.B0;
            i12 = 0;
        } else {
            i11 = fVar2.f6172z0;
            bVarArr = fVar2.A0;
            i12 = 2;
        }
        int i21 = i11;
        b[] bVarArr2 = bVarArr;
        int i22 = 0;
        while (i22 < i21) {
            b bVar = bVarArr2[i22];
            boolean z13 = bVar.f6113q;
            e eVar6 = bVar.f6099a;
            d[] dVarArr2 = eVar6.P;
            int i23 = 3;
            int i24 = 8;
            float f11 = 0.0f;
            if (z13) {
                i13 = i22;
            } else {
                int i25 = bVar.l;
                int i26 = i25 * 2;
                e eVar7 = eVar6;
                e eVar8 = eVar7;
                boolean z14 = false;
                while (!z14) {
                    bVar.f6107i++;
                    e[] eVarArr = eVar7.f6145l0;
                    d[] dVarArr3 = eVar7.P;
                    eVarArr[i25] = null;
                    eVar7.f6144k0[i25] = null;
                    if (eVar7.f6134f0 != i24) {
                        eVar7.j(i25);
                        dVarArr3[i26].e();
                        int i27 = i26 + 1;
                        dVarArr3[i27].e();
                        dVarArr3[i26].e();
                        dVarArr3[i27].e();
                        if (bVar.f6100b == null) {
                            bVar.f6100b = eVar7;
                        }
                        bVar.f6102d = eVar7;
                        int i28 = eVar7.f6150o0[i25];
                        if (i28 == i23) {
                            int i29 = eVar7.f6154s[i25];
                            if (i29 == 0 || i29 == i23 || i29 == 2) {
                                bVar.f6108j++;
                                float f12 = eVar7.f6142j0[i25];
                                if (f12 > 0.0f) {
                                    bVar.f6109k += f12;
                                }
                                i20 = i25;
                                if (eVar7.f6134f0 != 8 && i28 == 3 && (i29 == 0 || i29 == 3)) {
                                    if (f12 < 0.0f) {
                                        bVar.f6110n = true;
                                    } else {
                                        bVar.f6111o = true;
                                    }
                                    if (bVar.f6106h == null) {
                                        bVar.f6106h = new ArrayList();
                                    }
                                    bVar.f6106h.add(eVar7);
                                }
                                if (bVar.f6104f == null) {
                                    bVar.f6104f = eVar7;
                                }
                                e eVar9 = bVar.f6105g;
                                if (eVar9 != null) {
                                    eVar9.f6144k0[i20] = eVar7;
                                }
                                bVar.f6105g = eVar7;
                            } else {
                                i22 = i22;
                                i20 = i25;
                            }
                            if (i20 == 0) {
                                if (eVar7.f6152q == 0 && eVar7.f6155t == 0) {
                                    int i30 = eVar7.f6156u;
                                }
                            } else if (eVar7.f6153r == 0 && eVar7.f6158w == 0) {
                                int i31 = eVar7.f6159x;
                            }
                        } else {
                            i22 = i22;
                            i20 = i25;
                        }
                    } else {
                        i22 = i22;
                        i20 = i25;
                    }
                    e eVar10 = eVar8;
                    if (eVar10 != eVar7) {
                        eVar10.f6145l0[i20] = eVar7;
                    }
                    d dVar7 = dVarArr3[i26 + 1].f6119f;
                    if (dVar7 != null) {
                        eVar5 = dVar7.f6117d;
                        d dVar8 = eVar5.P[i26].f6119f;
                        if (dVar8 == null || dVar8.f6117d != eVar7) {
                            eVar5 = null;
                        }
                    } else {
                        eVar5 = null;
                    }
                    if (eVar5 == null) {
                        eVar5 = eVar7;
                        z14 = true;
                    }
                    eVar8 = eVar7;
                    i25 = i20;
                    i23 = 3;
                    i24 = 8;
                    eVar7 = eVar5;
                    i22 = i22;
                }
                i13 = i22;
                int i32 = i25;
                e eVar11 = bVar.f6100b;
                if (eVar11 != null) {
                    eVar11.P[i26].e();
                }
                e eVar12 = bVar.f6102d;
                if (eVar12 != null) {
                    eVar12.P[i26 + 1].e();
                }
                bVar.f6101c = eVar7;
                if (i32 == 0 && bVar.m) {
                    bVar.f6103e = eVar7;
                } else {
                    bVar.f6103e = eVar6;
                }
                bVar.f6112p = bVar.f6111o && bVar.f6110n;
            }
            bVar.f6113q = true;
            if (arrayList == 0 || arrayList.contains(eVar6)) {
                e eVar13 = bVar.f6101c;
                e eVar14 = bVar.f6100b;
                e eVar15 = bVar.f6102d;
                e eVar16 = bVar.f6103e;
                float f13 = bVar.f6109k;
                int[] iArr = fVar2.f6150o0;
                d[] dVarArr4 = fVar2.P;
                boolean z15 = iArr[i10] == 2;
                if (i10 == 0) {
                    int i33 = eVar16.f6138h0;
                    boolean z16 = i33 == 0;
                    boolean z17 = i33 == 1;
                    z10 = i33 == 2;
                    z12 = z17;
                    z11 = z16;
                } else {
                    int i34 = eVar16.f6140i0;
                    boolean z18 = i34 == 0;
                    boolean z19 = i34 == 1;
                    z10 = i34 == 2;
                    z11 = z18;
                    z12 = z19;
                }
                boolean z20 = false;
                while (!z20) {
                    d[] dVarArr5 = eVar6.P;
                    int[] iArr2 = eVar6.f6150o0;
                    d dVar9 = dVarArr5[i12];
                    int i35 = z10 ? 1 : 4;
                    int iE = dVar9.e();
                    boolean z21 = z15;
                    boolean z22 = z10;
                    boolean z23 = iArr2[i10] == 3 && eVar6.f6154s[i10] == 0;
                    d dVar10 = dVar9.f6119f;
                    if (dVar10 != null && eVar6 != eVar6) {
                        iE = dVar10.e() + iE;
                    }
                    int i36 = iE;
                    if (z22 && eVar6 != eVar6 && eVar6 != eVar14) {
                        i35 = 8;
                    }
                    e eVar17 = eVar6;
                    d dVar11 = dVar9.f6119f;
                    if (dVar11 != null) {
                        if (eVar6 == eVar14) {
                            cVar.f(dVar9.f6122i, dVar11.f6122i, i36, 6);
                        } else {
                            cVar.f(dVar9.f6122i, dVar11.f6122i, i36, 8);
                        }
                        if (z23 && !z22) {
                            i35 = 5;
                        }
                        cVar.e(dVar9.f6122i, dVar9.f6119f.f6122i, i36, (eVar6 == eVar14 && z22 && eVar6.R[i10]) ? 5 : i35);
                    }
                    if (z21) {
                        if (eVar6.f6134f0 == 8 || iArr2[i10] != 3) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                            cVar.f(dVarArr5[i12 + 1].f6122i, dVarArr5[i12].f6122i, 0, 5);
                        }
                        cVar.f(dVarArr5[i12].f6122i, dVarArr4[i12].f6122i, i19, 8);
                    }
                    d dVar12 = dVarArr5[i12 + 1].f6119f;
                    if (dVar12 != null) {
                        eVar4 = dVar12.f6117d;
                        d dVar13 = eVar4.P[i12].f6119f;
                        if (dVar13 == null || dVar13.f6117d != eVar6) {
                            eVar4 = null;
                        }
                    } else {
                        eVar4 = null;
                    }
                    if (eVar4 != null) {
                        eVar6 = eVar4;
                    } else {
                        z20 = true;
                    }
                    eVar6 = eVar17;
                    z15 = z21;
                    z10 = z22;
                }
                boolean z24 = z15;
                boolean z25 = z10;
                if (eVar15 != null) {
                    int i37 = i12 + 1;
                    if (eVar13.P[i37].f6119f != null) {
                        d dVar14 = eVar15.P[i37];
                        if (eVar15.f6150o0[i10] == 3 && eVar15.f6154s[i10] == 0 && !z25) {
                            d dVar15 = dVar14.f6119f;
                            if (dVar15.f6117d == fVar2) {
                                cVar.e(dVar14.f6122i, dVar15.f6122i, -dVar14.e(), 5);
                            } else if (z25) {
                                dVar6 = dVar14.f6119f;
                                if (dVar6.f6117d == fVar2) {
                                    cVar.e(dVar14.f6122i, dVar6.f6122i, -dVar14.e(), 4);
                                }
                            }
                        } else if (z25) {
                            dVar6 = dVar14.f6119f;
                            if (dVar6.f6117d == fVar2) {
                                cVar.e(dVar14.f6122i, dVar6.f6122i, -dVar14.e(), 4);
                            }
                        }
                        cVar.g(dVar14.f6122i, eVar13.P[i37].f6119f.f6122i, -dVar14.e(), 6);
                    }
                }
                if (z24) {
                    int i38 = i12 + 1;
                    e4.g gVar10 = dVarArr4[i38].f6122i;
                    d dVar16 = eVar13.P[i38];
                    cVar.f(gVar10, dVar16.f6122i, dVar16.e(), 8);
                }
                ArrayList arrayList3 = bVar.f6106h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.f6110n && !bVar.f6112p) {
                        f13 = bVar.f6108j;
                    }
                    e eVar18 = null;
                    float f14 = 0.0f;
                    int i39 = 0;
                    while (i39 < size) {
                        e eVar19 = (e) arrayList3.get(i39);
                        float[] fArr = eVar19.f6142j0;
                        d[] dVarArr6 = eVar19.P;
                        float f15 = fArr[i10];
                        if (f15 >= f11) {
                            arrayList2 = arrayList3;
                            i18 = size;
                            if (f15 == f11) {
                                cVar.e(dVarArr6[i12 + 1].f6122i, dVarArr6[i12].f6122i, 0, 8);
                                i39 = i39;
                                f3 = f11;
                                f14 = f14;
                                i21 = i21;
                            } else {
                                float f16 = f14;
                                if (eVar18 != null) {
                                    d[] dVarArr7 = eVar18.P;
                                    gVar6 = dVarArr7[i12].f6122i;
                                    int i40 = i12 + 1;
                                    gVar7 = dVarArr7[i40].f6122i;
                                    gVar8 = dVarArr6[i12].f6122i;
                                    gVar9 = dVarArr6[i40].f6122i;
                                    bVarL = cVar.l();
                                    f10 = f11;
                                    bVarL.f5062b = f10;
                                    f3 = f10;
                                    if (f13 != f10 || f16 == f15) {
                                        bVarL.f5064d.g(gVar6, 1.0f);
                                        bVarL.f5064d.g(gVar7, -1.0f);
                                        bVarL.f5064d.g(gVar9, 1.0f);
                                        bVarL.f5064d.g(gVar8, -1.0f);
                                    } else if (f16 == f3) {
                                        bVarL.f5064d.g(gVar6, 1.0f);
                                        bVarL.f5064d.g(gVar7, -1.0f);
                                    } else if (f15 == f11) {
                                        bVarL.f5064d.g(gVar8, 1.0f);
                                        bVarL.f5064d.g(gVar9, -1.0f);
                                    } else {
                                        float f17 = (f16 / f13) / (f15 / f13);
                                        bVarL.f5064d.g(gVar6, 1.0f);
                                        bVarL.f5064d.g(gVar7, -1.0f);
                                        bVarL.f5064d.g(gVar9, f17);
                                        bVarL.f5064d.g(gVar8, -f17);
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i39 = i39;
                                    f3 = f11;
                                    i21 = i21;
                                }
                                f14 = f15;
                                eVar18 = eVar19;
                            }
                        } else {
                            if (bVar.f6112p) {
                                arrayList2 = arrayList3;
                                i18 = size;
                                cVar.e(dVarArr6[i12 + 1].f6122i, dVarArr6[i12].f6122i, 0, 4);
                            } else {
                                f15 = 1.0f;
                                arrayList2 = arrayList3;
                                i18 = size;
                                if (f15 == f11) {
                                    cVar.e(dVarArr6[i12 + 1].f6122i, dVarArr6[i12].f6122i, 0, 8);
                                } else {
                                    float f18 = f14;
                                    if (eVar18 != null) {
                                        d[] dVarArr8 = eVar18.P;
                                        gVar6 = dVarArr8[i12].f6122i;
                                        int i41 = i12 + 1;
                                        gVar7 = dVarArr8[i41].f6122i;
                                        gVar8 = dVarArr6[i12].f6122i;
                                        gVar9 = dVarArr6[i41].f6122i;
                                        bVarL = cVar.l();
                                        f10 = f11;
                                        bVarL.f5062b = f10;
                                        f3 = f10;
                                        if (f13 != f10) {
                                            bVarL.f5064d.g(gVar6, 1.0f);
                                            bVarL.f5064d.g(gVar7, -1.0f);
                                            bVarL.f5064d.g(gVar9, 1.0f);
                                            bVarL.f5064d.g(gVar8, -1.0f);
                                        } else {
                                            bVarL.f5064d.g(gVar6, 1.0f);
                                            bVarL.f5064d.g(gVar7, -1.0f);
                                            bVarL.f5064d.g(gVar9, 1.0f);
                                            bVarL.f5064d.g(gVar8, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i39 = i39;
                                        f3 = f11;
                                        i21 = i21;
                                    }
                                    f14 = f15;
                                    eVar18 = eVar19;
                                }
                            }
                            i39 = i39;
                            f3 = f11;
                            f14 = f14;
                            i21 = i21;
                        }
                        i39++;
                        i21 = i21;
                        arrayList3 = arrayList2;
                        size = i18;
                        f11 = f3;
                    }
                }
                i14 = i21;
                if (eVar14 == null || !(eVar14 == eVar15 || z25)) {
                    eVar = eVar15;
                    if (!z11 || eVar14 == null) {
                        int i42 = 8;
                        if (z12 && eVar14 != null) {
                            int i43 = bVar.f6108j;
                            boolean z26 = i43 > 0 && bVar.f6107i == i43;
                            e eVar20 = eVar14;
                            e eVar21 = eVar20;
                            while (eVar21 != null) {
                                d[] dVarArr9 = eVar21.P;
                                e eVar22 = eVar21.f6145l0[i10];
                                while (eVar22 != null && eVar22.f6134f0 == i42) {
                                    eVar22 = eVar22.f6145l0[i10];
                                }
                                if (eVar21 == eVar14 || eVar21 == eVar || eVar22 == null) {
                                    eVar20 = eVar20;
                                } else {
                                    if (eVar22 == eVar) {
                                        eVar22 = null;
                                    }
                                    d dVar17 = dVarArr9[i12];
                                    e4.g gVar11 = dVar17.f6122i;
                                    int i44 = i12 + 1;
                                    e4.g gVar12 = eVar20.P[i44].f6122i;
                                    int iE2 = dVar17.e();
                                    int iE3 = dVarArr9[i44].e();
                                    if (eVar22 != null) {
                                        dVar = eVar22.P[i12];
                                        gVar2 = dVar.f6122i;
                                        d dVar18 = dVar.f6119f;
                                        gVar = dVar18 != null ? dVar18.f6122i : null;
                                    } else {
                                        d dVar19 = eVar.P[i12];
                                        e4.g gVar13 = dVar19 != null ? dVar19.f6122i : null;
                                        gVar = dVarArr9[i44].f6122i;
                                        dVar = dVar19;
                                        gVar2 = gVar13;
                                    }
                                    if (dVar != null) {
                                        iE3 += dVar.e();
                                    }
                                    int iE4 = iE2 + eVar20.P[i44].e();
                                    e eVar23 = eVar22;
                                    e4.g gVar14 = gVar2;
                                    int i45 = z26 ? 8 : 4;
                                    if (gVar11 == null || gVar12 == null || gVar14 == null || gVar == null) {
                                        eVar2 = eVar23;
                                    } else {
                                        eVar2 = eVar23;
                                        cVar.b(gVar11, gVar12, iE4, 0.5f, gVar14, gVar, iE3, i45);
                                    }
                                    eVar22 = eVar2;
                                }
                                if (eVar21.f6134f0 != 8) {
                                    eVar20 = eVar21;
                                }
                                eVar21 = eVar22;
                                eVar20 = eVar20;
                                i42 = 8;
                            }
                            cVar2 = cVar;
                            d dVar20 = eVar14.P[i12];
                            d dVar21 = dVarArr2[i12].f6119f;
                            int i46 = i12 + 1;
                            d dVar22 = eVar.P[i46];
                            d dVar23 = eVar13.P[i46].f6119f;
                            if (dVar21 != null) {
                                if (eVar14 != eVar) {
                                    cVar2.e(dVar20.f6122i, dVar21.f6122i, dVar20.e(), 5);
                                } else if (dVar23 != null) {
                                    cVar2.b(dVar20.f6122i, dVar21.f6122i, dVar20.e(), 0.5f, dVar22.f6122i, dVar23.f6122i, dVar22.e(), 5);
                                }
                            }
                            if (dVar23 != null && eVar14 != eVar) {
                                cVar2.e(dVar22.f6122i, dVar23.f6122i, -dVar22.e(), 5);
                            }
                        }
                        if ((z11 || z12) && eVar14 != null && eVar14 != eVar) {
                            dVarArr = eVar14.P;
                            d dVar24 = dVarArr[i12];
                            if (eVar == null) {
                                eVar = eVar14;
                            }
                            d[] dVarArr10 = eVar.P;
                            i17 = i12 + 1;
                            dVar3 = dVarArr10[i17];
                            dVar4 = dVar24.f6119f;
                            if (dVar4 != null) {
                                gVar4 = dVar4.f6122i;
                            } else {
                                gVar4 = null;
                            }
                            dVar5 = dVar3.f6119f;
                            if (dVar5 != null) {
                                gVar5 = dVar5.f6122i;
                            } else {
                                gVar5 = null;
                            }
                            if (eVar13 != eVar) {
                                d dVar25 = eVar13.P[i17].f6119f;
                                gVar5 = dVar25 != null ? dVar25.f6122i : null;
                            }
                            if (eVar14 == eVar) {
                                dVar3 = dVarArr[i17];
                            }
                            if (gVar4 == null && gVar5 != null) {
                                cVar2.b(dVar24.f6122i, gVar4, dVar24.e(), 0.5f, gVar5, dVar3.f6122i, dVarArr10[i17].e(), 5);
                            }
                        }
                    } else {
                        int i47 = bVar.f6108j;
                        boolean z27 = i47 > 0 && bVar.f6107i == i47;
                        e eVar24 = eVar14;
                        e eVar25 = eVar24;
                        while (eVar24 != null) {
                            d[] dVarArr11 = eVar24.P;
                            e eVar26 = eVar24.f6145l0[i10];
                            while (true) {
                                if (eVar26 == null) {
                                    i15 = 8;
                                    break;
                                }
                                i15 = 8;
                                if (eVar26.f6134f0 != 8) {
                                    break;
                                } else {
                                    eVar26 = eVar26.f6145l0[i10];
                                }
                            }
                            if (eVar26 != null || eVar24 == eVar) {
                                d dVar26 = dVarArr11[i12];
                                e4.g gVar15 = dVar26.f6122i;
                                d dVar27 = dVar26.f6119f;
                                e4.g gVar16 = dVar27 != null ? dVar27.f6122i : null;
                                if (eVar25 != eVar24) {
                                    gVar16 = eVar25.P[i12 + 1].f6122i;
                                } else if (eVar24 == eVar14) {
                                    d dVar28 = dVarArr2[i12].f6119f;
                                    gVar16 = dVar28 != null ? dVar28.f6122i : null;
                                }
                                int iE5 = dVar26.e();
                                int i48 = i12 + 1;
                                int iE6 = dVarArr11[i48].e();
                                if (eVar26 != null) {
                                    dVar2 = eVar26.P[i12];
                                    gVar3 = dVar2.f6122i;
                                } else {
                                    dVar2 = eVar13.P[i48].f6119f;
                                    gVar3 = dVar2 != null ? dVar2.f6122i : null;
                                }
                                e4.g gVar17 = dVarArr11[i48].f6122i;
                                if (dVar2 != null) {
                                    iE6 += dVar2.e();
                                }
                                int iE7 = eVar25.P[i48].e() + iE5;
                                if (gVar15 == null || gVar16 == null || gVar3 == null || gVar17 == null) {
                                    eVar3 = eVar26;
                                    i16 = 8;
                                } else {
                                    if (eVar24 == eVar14) {
                                        iE7 = eVar14.P[i12].e();
                                    }
                                    if (eVar24 == eVar) {
                                        iE6 = eVar.P[i48].e();
                                    }
                                    eVar3 = eVar26;
                                    i16 = 8;
                                    cVar.b(gVar15, gVar16, iE7, 0.5f, gVar3, gVar17, iE6, z27 ? 8 : 5);
                                }
                            } else {
                                eVar3 = eVar26;
                                i16 = i15;
                            }
                            if (eVar24.f6134f0 != i16) {
                                eVar25 = eVar24;
                            }
                            eVar24 = eVar3;
                            eVar25 = eVar25;
                            dVarArr2 = dVarArr2;
                        }
                    }
                } else {
                    d dVar29 = dVarArr2[i12];
                    int i49 = i12 + 1;
                    d dVar30 = eVar13.P[i49];
                    d dVar31 = dVar29.f6119f;
                    e4.g gVar18 = dVar31 != null ? dVar31.f6122i : null;
                    d dVar32 = dVar30.f6119f;
                    e4.g gVar19 = dVar32 != null ? dVar32.f6122i : null;
                    d dVar33 = eVar14.P[i12];
                    if (eVar15 != null) {
                        dVar30 = eVar15.P[i49];
                    }
                    if (gVar18 == null || gVar19 == null) {
                        eVar = eVar15;
                    } else {
                        float f19 = i10 == 0 ? eVar16.f6128c0 : eVar16.f6130d0;
                        int iE8 = dVar33.e();
                        int iE9 = dVar30.e();
                        e4.g gVar20 = dVar33.f6122i;
                        e4.g gVar21 = dVar30.f6122i;
                        e4.g gVar22 = gVar18;
                        eVar = eVar15;
                        cVar.b(gVar20, gVar22, iE8, f19, gVar19, gVar21, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z11) {
                    dVarArr = eVar14.P;
                    d dVar210 = dVarArr[i12];
                    if (eVar == null) {
                        eVar = eVar14;
                    }
                    d[] dVarArr12 = eVar.P;
                    i17 = i12 + 1;
                    dVar3 = dVarArr12[i17];
                    dVar4 = dVar210.f6119f;
                    if (dVar4 != null) {
                        gVar4 = dVar4.f6122i;
                    } else {
                        gVar4 = null;
                    }
                    dVar5 = dVar3.f6119f;
                    if (dVar5 != null) {
                        gVar5 = dVar5.f6122i;
                    } else {
                        gVar5 = null;
                    }
                    if (eVar13 != eVar) {
                        d dVar211 = eVar13.P[i17].f6119f;
                        gVar5 = dVar211 != null ? dVar211.f6122i : null;
                    }
                    if (eVar14 == eVar) {
                        dVar3 = dVarArr[i17];
                    }
                    if (gVar4 == null) {
                    }
                } else {
                    dVarArr = eVar14.P;
                    d dVar212 = dVarArr[i12];
                    if (eVar == null) {
                        eVar = eVar14;
                    }
                    d[] dVarArr13 = eVar.P;
                    i17 = i12 + 1;
                    dVar3 = dVarArr13[i17];
                    dVar4 = dVar212.f6119f;
                    if (dVar4 != null) {
                        gVar4 = dVar4.f6122i;
                    } else {
                        gVar4 = null;
                    }
                    dVar5 = dVar3.f6119f;
                    if (dVar5 != null) {
                        gVar5 = dVar5.f6122i;
                    } else {
                        gVar5 = null;
                    }
                    if (eVar13 != eVar) {
                        d dVar213 = eVar13.P[i17].f6119f;
                        gVar5 = dVar213 != null ? dVar213.f6122i : null;
                    }
                    if (eVar14 == eVar) {
                        dVar3 = dVarArr[i17];
                    }
                    if (gVar4 == null) {
                    }
                }
            } else {
                i14 = i21;
            }
            i22 = i13 + 1;
            fVar2 = fVar;
            i21 = i14;
        }
    }

    public static void b(f fVar, e4.c cVar, e eVar) {
        eVar.f6147n = -1;
        d dVar = eVar.L;
        int[] iArr = eVar.f6150o0;
        d dVar2 = eVar.K;
        d dVar3 = eVar.I;
        d dVar4 = eVar.J;
        d dVar5 = eVar.H;
        eVar.f6149o = -1;
        int[] iArr2 = fVar.f6150o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i10 = dVar5.f6120g;
            int iN = fVar.n() - dVar4.f6120g;
            dVar5.f6122i = cVar.k(dVar5);
            dVar4.f6122i = cVar.k(dVar4);
            cVar.d(dVar5.f6122i, i10);
            cVar.d(dVar4.f6122i, iN);
            eVar.f6147n = 2;
            eVar.X = i10;
            int i11 = iN - i10;
            eVar.T = i11;
            int i12 = eVar.f6124a0;
            if (i11 < i12) {
                eVar.T = i12;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i13 = dVar3.f6120g;
        int iK = fVar.k() - dVar2.f6120g;
        dVar3.f6122i = cVar.k(dVar3);
        dVar2.f6122i = cVar.k(dVar2);
        cVar.d(dVar3.f6122i, i13);
        cVar.d(dVar2.f6122i, iK);
        if (eVar.Z > 0 || eVar.f6134f0 == 8) {
            e4.g gVarK = cVar.k(dVar);
            dVar.f6122i = gVarK;
            cVar.d(gVarK, eVar.Z + i13);
        }
        eVar.f6149o = 2;
        eVar.Y = i13;
        int i14 = iK - i13;
        eVar.U = i14;
        int i15 = eVar.f6126b0;
        if (i14 < i15) {
            eVar.U = i15;
        }
    }

    public static final boolean c(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
