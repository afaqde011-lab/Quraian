package h4;

import java.util.ArrayList;

public final class j extends n {

    public static final int[] f6588k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f3, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f3) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f3) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f3) + 0.5f);
        int i18 = (int) ((i15 / f3) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    @Override
    public final void a(d dVar) {
        float f3;
        int iG;
        int i10;
        int iG2;
        float f10;
        float f11;
        float f12;
        int i11;
        if (e4.f.b(this.f6607j) == 3) {
            g4.e eVar = this.f6599b;
            l(eVar.H, eVar.J, 0);
            return;
        }
        f fVar = this.f6602e;
        boolean z10 = fVar.f6585j;
        e eVar2 = this.f6605h;
        e eVar3 = this.f6606i;
        if (z10 || this.f6601d != 3) {
            f3 = 0.5f;
        } else {
            g4.e eVar4 = this.f6599b;
            int i12 = eVar4.f6152q;
            if (i12 == 2) {
                f3 = 0.5f;
                g4.e eVar5 = eVar4.S;
                if (eVar5 != null) {
                    f fVar2 = eVar5.f6129d.f6602e;
                    if (fVar2.f6585j) {
                        fVar.d((int) ((fVar2.f6582g * eVar4.f6157v) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = eVar4.f6153r;
                if (i13 == 0 || i13 == 3) {
                    l lVar = eVar4.f6131e;
                    e eVar6 = lVar.f6605h;
                    e eVar7 = lVar.f6606i;
                    boolean z11 = eVar4.H.f6119f != null;
                    boolean z12 = eVar4.I.f6119f != null;
                    boolean z13 = eVar4.J.f6119f != null;
                    boolean z14 = eVar4.K.f6119f != null;
                    f3 = 0.5f;
                    int i14 = eVar4.W;
                    if (z11 && z12 && z13 && z14) {
                        float f13 = eVar4.V;
                        boolean z15 = eVar6.f6585j;
                        ArrayList arrayList = eVar6.l;
                        int[] iArr = f6588k;
                        if (z15 && eVar7.f6585j) {
                            if (eVar2.f6578c && eVar3.f6578c) {
                                m(iArr, ((e) eVar2.l.get(0)).f6582g + eVar2.f6581f, ((e) eVar3.l.get(0)).f6582g - eVar3.f6581f, eVar6.f6582g + eVar6.f6581f, eVar7.f6582g - eVar7.f6581f, f13, i14);
                                fVar.d(iArr[0]);
                                this.f6599b.f6131e.f6602e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (eVar2.f6585j && eVar3.f6585j) {
                            if (!eVar6.f6578c || !eVar7.f6578c) {
                                return;
                            }
                            m(iArr, eVar2.f6582g + eVar2.f6581f, eVar3.f6582g - eVar3.f6581f, ((e) arrayList.get(0)).f6582g + eVar6.f6581f, ((e) eVar7.l.get(0)).f6582g - eVar7.f6581f, f13, i14);
                            fVar.d(iArr[0]);
                            this.f6599b.f6131e.f6602e.d(iArr[1]);
                        }
                        if (!eVar2.f6578c || !eVar3.f6578c || !eVar6.f6578c || !eVar7.f6578c) {
                            return;
                        }
                        m(iArr, ((e) eVar2.l.get(0)).f6582g + eVar2.f6581f, ((e) eVar3.l.get(0)).f6582g - eVar3.f6581f, ((e) arrayList.get(0)).f6582g + eVar6.f6581f, ((e) eVar7.l.get(0)).f6582g - eVar7.f6581f, f13, i14);
                        fVar.d(iArr[0]);
                        this.f6599b.f6131e.f6602e.d(iArr[1]);
                    } else if (z11 && z13) {
                        if (!eVar2.f6578c || !eVar3.f6578c) {
                            return;
                        }
                        float f14 = eVar4.V;
                        int i15 = ((e) eVar2.l.get(0)).f6582g + eVar2.f6581f;
                        int i16 = ((e) eVar3.l.get(0)).f6582g - eVar3.f6581f;
                        if (i14 == -1 || i14 == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * f14) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / f14) + 0.5f);
                            }
                            fVar.d(iG3);
                            this.f6599b.f6131e.f6602e.d(iG4);
                        } else if (i14 == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / f14) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * f14) + 0.5f);
                            }
                            fVar.d(iG5);
                            this.f6599b.f6131e.f6602e.d(iG6);
                        }
                    } else if (z12 && z14) {
                        if (!eVar6.f6578c || !eVar7.f6578c) {
                            return;
                        }
                        float f15 = eVar4.V;
                        int i19 = ((e) eVar6.l.get(0)).f6582g + eVar6.f6581f;
                        int i20 = ((e) eVar7.l.get(0)).f6582g - eVar7.f6581f;
                        if (i14 == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f15) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f15) + 0.5f);
                            }
                            fVar.d(iG2);
                            this.f6599b.f6131e.f6602e.d(iG);
                        } else if (i14 == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * f15) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / f15) + 0.5f);
                            }
                            fVar.d(iG8);
                            this.f6599b.f6131e.f6602e.d(iG7);
                        } else if (i14 == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f15) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f15) + 0.5f);
                            }
                            fVar.d(iG2);
                            this.f6599b.f6131e.f6602e.d(iG);
                        }
                    }
                } else {
                    int i22 = eVar4.W;
                    if (i22 != -1) {
                        if (i22 == 0) {
                            f12 = eVar4.f6131e.f6602e.f6582g / eVar4.V;
                            i11 = (int) (f12 + 0.5f);
                        } else if (i22 != 1) {
                            i11 = 0;
                        } else {
                            f10 = eVar4.f6131e.f6602e.f6582g;
                            f11 = eVar4.V;
                        }
                        fVar.d(i11);
                        f3 = 0.5f;
                    } else {
                        f10 = eVar4.f6131e.f6602e.f6582g;
                        f11 = eVar4.V;
                    }
                    f12 = f10 * f11;
                    i11 = (int) (f12 + 0.5f);
                    fVar.d(i11);
                    f3 = 0.5f;
                }
            } else {
                f3 = 0.5f;
            }
        }
        boolean z16 = eVar2.f6578c;
        ArrayList arrayList2 = eVar2.l;
        if (z16) {
            boolean z17 = eVar3.f6578c;
            ArrayList arrayList3 = eVar3.l;
            if (z17) {
                if (eVar2.f6585j && eVar3.f6585j && fVar.f6585j) {
                    return;
                }
                if (!fVar.f6585j && this.f6601d == 3) {
                    g4.e eVar8 = this.f6599b;
                    if (eVar8.f6152q == 0 && !eVar8.u()) {
                        e eVar9 = (e) arrayList2.get(0);
                        e eVar10 = (e) arrayList3.get(0);
                        int i23 = eVar9.f6582g + eVar2.f6581f;
                        int i24 = eVar10.f6582g + eVar3.f6581f;
                        eVar2.d(i23);
                        eVar3.d(i24);
                        fVar.d(i24 - i23);
                        return;
                    }
                }
                if (!fVar.f6585j && this.f6601d == 3 && this.f6598a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((e) arrayList3.get(0)).f6582g + eVar3.f6581f) - (((e) arrayList2.get(0)).f6582g + eVar2.f6581f), fVar.m);
                    g4.e eVar11 = this.f6599b;
                    int i25 = eVar11.f6156u;
                    int iMax = Math.max(eVar11.f6155t, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    fVar.d(iMax);
                }
                if (fVar.f6585j) {
                    e eVar12 = (e) arrayList2.get(0);
                    e eVar13 = (e) arrayList3.get(0);
                    int i26 = eVar12.f6582g;
                    int i27 = eVar2.f6581f + i26;
                    int i28 = eVar13.f6582g;
                    int i29 = eVar3.f6581f + i28;
                    float f16 = this.f6599b.f6128c0;
                    if (eVar12 == eVar13) {
                        f16 = f3;
                    } else {
                        i26 = i27;
                        i28 = i29;
                    }
                    eVar2.d((int) ((((i28 - i26) - fVar.f6582g) * f16) + i26 + f3));
                    eVar3.d(eVar2.f6582g + fVar.f6582g);
                }
            }
        }
    }

    @Override
    public final void d() {
        g4.e eVar;
        g4.e eVar2;
        int i10;
        g4.e eVar3;
        g4.e eVar4;
        int i11;
        g4.e eVar5 = this.f6599b;
        boolean z10 = eVar5.f6123a;
        f fVar = this.f6602e;
        if (z10) {
            fVar.d(eVar5.n());
        }
        boolean z11 = fVar.f6585j;
        ArrayList arrayList = fVar.f6586k;
        ArrayList arrayList2 = fVar.l;
        e eVar6 = this.f6606i;
        e eVar7 = this.f6605h;
        if (!z11) {
            g4.e eVar8 = this.f6599b;
            int i12 = eVar8.f6150o0[0];
            this.f6601d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (eVar4 = eVar8.S) != null && ((i11 = eVar4.f6150o0[0]) == 1 || i11 == 4)) {
                    int iN = (eVar4.n() - this.f6599b.H.e()) - this.f6599b.J.e();
                    n.b(eVar7, eVar4.f6129d.f6605h, this.f6599b.H.e());
                    n.b(eVar6, eVar4.f6129d.f6606i, -this.f6599b.J.e());
                    fVar.d(iN);
                    return;
                }
                if (i12 == 1) {
                    fVar.d(eVar8.n());
                }
            }
        } else if (this.f6601d == 4 && (eVar2 = (eVar = this.f6599b).S) != null && ((i10 = eVar2.f6150o0[0]) == 1 || i10 == 4)) {
            n.b(eVar7, eVar2.f6129d.f6605h, eVar.H.e());
            n.b(eVar6, eVar2.f6129d.f6606i, -this.f6599b.J.e());
            return;
        }
        if (fVar.f6585j) {
            g4.e eVar9 = this.f6599b;
            if (eVar9.f6123a) {
                g4.d[] dVarArr = eVar9.P;
                g4.d dVar = dVarArr[0];
                g4.d dVar2 = dVar.f6119f;
                if (dVar2 != null && dVarArr[1].f6119f != null) {
                    if (eVar9.u()) {
                        eVar7.f6581f = this.f6599b.P[0].e();
                        eVar6.f6581f = -this.f6599b.P[1].e();
                        return;
                    }
                    e eVarH = n.h(this.f6599b.P[0]);
                    if (eVarH != null) {
                        n.b(eVar7, eVarH, this.f6599b.P[0].e());
                    }
                    e eVarH2 = n.h(this.f6599b.P[1]);
                    if (eVarH2 != null) {
                        n.b(eVar6, eVarH2, -this.f6599b.P[1].e());
                    }
                    eVar7.f6577b = true;
                    eVar6.f6577b = true;
                    return;
                }
                if (dVar2 != null) {
                    e eVarH3 = n.h(dVar);
                    if (eVarH3 != null) {
                        n.b(eVar7, eVarH3, this.f6599b.P[0].e());
                        n.b(eVar6, eVar7, fVar.f6582g);
                        return;
                    }
                    return;
                }
                g4.d dVar3 = dVarArr[1];
                if (dVar3.f6119f != null) {
                    e eVarH4 = n.h(dVar3);
                    if (eVarH4 != null) {
                        n.b(eVar6, eVarH4, -this.f6599b.P[1].e());
                        n.b(eVar7, eVar6, -fVar.f6582g);
                        return;
                    }
                    return;
                }
                if ((eVar9 instanceof g4.j) || eVar9.S == null || eVar9.i(7).f6119f != null) {
                    return;
                }
                g4.e eVar10 = this.f6599b;
                n.b(eVar7, eVar10.S.f6129d.f6605h, eVar10.o());
                n.b(eVar6, eVar7, fVar.f6582g);
                return;
            }
        }
        if (this.f6601d == 3) {
            g4.e eVar11 = this.f6599b;
            int i13 = eVar11.f6152q;
            if (i13 == 2) {
                g4.e eVar12 = eVar11.S;
                if (eVar12 != null) {
                    f fVar2 = eVar12.f6131e.f6602e;
                    arrayList2.add(fVar2);
                    fVar2.f6586k.add(fVar);
                    fVar.f6577b = true;
                    arrayList.add(eVar7);
                    arrayList.add(eVar6);
                }
            } else if (i13 == 3) {
                if (eVar11.f6153r == 3) {
                    eVar7.f6576a = this;
                    eVar6.f6576a = this;
                    l lVar = eVar11.f6131e;
                    lVar.f6605h.f6576a = this;
                    lVar.f6606i.f6576a = this;
                    fVar.f6576a = this;
                    if (eVar11.v()) {
                        arrayList2.add(this.f6599b.f6131e.f6602e);
                        this.f6599b.f6131e.f6602e.f6586k.add(fVar);
                        l lVar2 = this.f6599b.f6131e;
                        lVar2.f6602e.f6576a = this;
                        arrayList2.add(lVar2.f6605h);
                        arrayList2.add(this.f6599b.f6131e.f6606i);
                        this.f6599b.f6131e.f6605h.f6586k.add(fVar);
                        this.f6599b.f6131e.f6606i.f6586k.add(fVar);
                    } else if (this.f6599b.u()) {
                        this.f6599b.f6131e.f6602e.l.add(fVar);
                        arrayList.add(this.f6599b.f6131e.f6602e);
                    } else {
                        this.f6599b.f6131e.f6602e.l.add(fVar);
                    }
                } else {
                    f fVar3 = eVar11.f6131e.f6602e;
                    arrayList2.add(fVar3);
                    fVar3.f6586k.add(fVar);
                    this.f6599b.f6131e.f6605h.f6586k.add(fVar);
                    this.f6599b.f6131e.f6606i.f6586k.add(fVar);
                    fVar.f6577b = true;
                    arrayList.add(eVar7);
                    arrayList.add(eVar6);
                    eVar7.l.add(fVar);
                    eVar6.l.add(fVar);
                }
            }
        }
        g4.e eVar13 = this.f6599b;
        g4.d[] dVarArr2 = eVar13.P;
        g4.d dVar4 = dVarArr2[0];
        g4.d dVar5 = dVar4.f6119f;
        if (dVar5 != null && dVarArr2[1].f6119f != null) {
            if (eVar13.u()) {
                eVar7.f6581f = this.f6599b.P[0].e();
                eVar6.f6581f = -this.f6599b.P[1].e();
                return;
            }
            e eVarH5 = n.h(this.f6599b.P[0]);
            e eVarH6 = n.h(this.f6599b.P[1]);
            if (eVarH5 != null) {
                eVarH5.b(this);
            }
            if (eVarH6 != null) {
                eVarH6.b(this);
            }
            this.f6607j = 4;
            return;
        }
        if (dVar5 != null) {
            e eVarH7 = n.h(dVar4);
            if (eVarH7 != null) {
                n.b(eVar7, eVarH7, this.f6599b.P[0].e());
                c(eVar6, eVar7, 1, fVar);
                return;
            }
            return;
        }
        g4.d dVar6 = dVarArr2[1];
        if (dVar6.f6119f != null) {
            e eVarH8 = n.h(dVar6);
            if (eVarH8 != null) {
                n.b(eVar6, eVarH8, -this.f6599b.P[1].e());
                c(eVar7, eVar6, -1, fVar);
                return;
            }
            return;
        }
        if ((eVar13 instanceof g4.j) || (eVar3 = eVar13.S) == null) {
            return;
        }
        n.b(eVar7, eVar3.f6129d.f6605h, eVar13.o());
        c(eVar6, eVar7, 1, fVar);
    }

    @Override
    public final void e() {
        e eVar = this.f6605h;
        if (eVar.f6585j) {
            this.f6599b.X = eVar.f6582g;
        }
    }

    @Override
    public final void f() {
        this.f6600c = null;
        this.f6605h.c();
        this.f6606i.c();
        this.f6602e.c();
        this.f6604g = false;
    }

    @Override
    public final boolean k() {
        return this.f6601d != 3 || this.f6599b.f6152q == 0;
    }

    public final void n() {
        this.f6604g = false;
        e eVar = this.f6605h;
        eVar.c();
        eVar.f6585j = false;
        e eVar2 = this.f6606i;
        eVar2.c();
        eVar2.f6585j = false;
        this.f6602e.f6585j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f6599b.f6136g0;
    }
}
