package h4;

import java.util.ArrayList;
import java.util.Iterator;

public final class c extends n {

    public final ArrayList f6575k;
    public int l;

    public c(g4.e eVar, int i10) {
        g4.e eVar2;
        super(eVar);
        ArrayList<n> arrayList = new ArrayList();
        this.f6575k = arrayList;
        this.f6603f = i10;
        g4.e eVar3 = this.f6599b;
        g4.e eVarM = eVar3.m(i10);
        while (true) {
            eVar2 = eVar3;
            eVar3 = eVarM;
            if (eVar3 == null) {
                break;
            } else {
                eVarM = eVar3.m(this.f6603f);
            }
        }
        this.f6599b = eVar2;
        int i11 = this.f6603f;
        arrayList.add(i11 == 0 ? eVar2.f6129d : i11 == 1 ? eVar2.f6131e : null);
        g4.e eVarL = eVar2.l(this.f6603f);
        while (eVarL != null) {
            int i12 = this.f6603f;
            arrayList.add(i12 == 0 ? eVarL.f6129d : i12 == 1 ? eVarL.f6131e : null);
            eVarL = eVarL.l(this.f6603f);
        }
        for (n nVar : arrayList) {
            int i13 = this.f6603f;
            if (i13 == 0) {
                nVar.f6599b.f6125b = this;
            } else if (i13 == 1) {
                nVar.f6599b.f6127c = this;
            }
        }
        if (this.f6603f == 0 && ((g4.f) this.f6599b.S).f6167u0 && arrayList.size() > 1) {
            this.f6599b = ((n) g4.c.d(1, arrayList)).f6599b;
        }
        this.l = this.f6603f == 0 ? this.f6599b.f6138h0 : this.f6599b.f6140i0;
    }

    @Override
    public final void a(d dVar) {
        int i10;
        int i11;
        boolean z10;
        float f3;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f11;
        e eVar = this.f6605h;
        if (eVar.f6585j) {
            e eVar2 = this.f6606i;
            if (eVar2.f6585j) {
                g4.e eVar3 = this.f6599b.S;
                boolean z11 = eVar3 instanceof g4.f ? ((g4.f) eVar3).f6167u0 : false;
                int i22 = eVar2.f6582g - eVar.f6582g;
                ArrayList arrayList = this.f6575k;
                int size = arrayList.size();
                int i23 = 0;
                while (true) {
                    i10 = -1;
                    i11 = 8;
                    if (i23 >= size) {
                        i23 = -1;
                        break;
                    } else if (((n) arrayList.get(i23)).f6599b.f6134f0 != 8) {
                        break;
                    } else {
                        i23++;
                    }
                }
                int i24 = size - 1;
                for (int i25 = i24; i25 >= 0; i25--) {
                    if (((n) arrayList.get(i25)).f6599b.f6134f0 != 8) {
                        i10 = i25;
                        break;
                    }
                }
                int i26 = 0;
                while (true) {
                    if (i26 >= 2) {
                        z10 = z11;
                        f3 = 0.0f;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        break;
                    }
                    f3 = 0.0f;
                    int i27 = 0;
                    i14 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    while (i27 < size) {
                        n nVar = (n) arrayList.get(i27);
                        g4.e eVar4 = nVar.f6599b;
                        boolean z12 = z11;
                        if (eVar4.f6134f0 == i11) {
                            i20 = i26;
                        } else {
                            i29++;
                            if (i27 > 0 && i27 >= i23) {
                                i14 += nVar.f6605h.f6581f;
                            }
                            f fVar = nVar.f6602e;
                            int i30 = fVar.f6582g;
                            i20 = i26;
                            boolean z13 = nVar.f6601d != 3;
                            if (z13) {
                                int i31 = this.f6603f;
                                if (i31 == 0 && !eVar4.f6129d.f6602e.f6585j) {
                                    return;
                                }
                                if (i31 == 1 && !eVar4.f6131e.f6602e.f6585j) {
                                    return;
                                }
                            } else {
                                if (nVar.f6598a == 1 && i20 == 0) {
                                    i21 = fVar.m;
                                    i28++;
                                } else {
                                    if (fVar.f6585j) {
                                        i21 = i30;
                                    }
                                    if (z13) {
                                        i14 += i21;
                                    } else {
                                        i28++;
                                        f11 = eVar4.f6142j0[this.f6603f];
                                        if (f11 >= 0.0f) {
                                            f3 += f11;
                                        }
                                    }
                                    if (i27 >= i24 && i27 < i10) {
                                        i14 += -nVar.f6606i.f6581f;
                                    }
                                }
                                z13 = true;
                                if (z13) {
                                    i28++;
                                    f11 = eVar4.f6142j0[this.f6603f];
                                    if (f11 >= 0.0f) {
                                        f3 += f11;
                                    }
                                } else {
                                    i14 += i21;
                                }
                                if (i27 >= i24) {
                                }
                            }
                            i21 = i30;
                            if (z13) {
                                i28++;
                                f11 = eVar4.f6142j0[this.f6603f];
                                if (f11 >= 0.0f) {
                                    f3 += f11;
                                }
                            } else {
                                i14 += i21;
                            }
                            if (i27 >= i24) {
                            }
                        }
                        i27++;
                        z11 = z12;
                        i26 = i20;
                        i11 = 8;
                    }
                    z10 = z11;
                    int i32 = i26;
                    if (i14 < i22 || i28 == 0) {
                        i12 = i28;
                        i13 = i29;
                        break;
                    } else {
                        i26 = i32 + 1;
                        z11 = z10;
                        i11 = 8;
                    }
                }
                int i33 = eVar.f6582g;
                if (z10) {
                    i33 = eVar2.f6582g;
                }
                float f12 = 0.5f;
                if (i14 > i22) {
                    i33 = z10 ? i33 + ((int) (((i14 - i22) / 2.0f) + 0.5f)) : i33 - ((int) (((i14 - i22) / 2.0f) + 0.5f));
                }
                if (i12 > 0) {
                    float f13 = i22 - i14;
                    int i34 = (int) ((f13 / i12) + 0.5f);
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < size) {
                        float f14 = f12;
                        n nVar2 = (n) arrayList.get(i35);
                        int i37 = i33;
                        g4.e eVar5 = nVar2.f6599b;
                        int i38 = i12;
                        f fVar2 = nVar2.f6602e;
                        float f15 = f13;
                        int i39 = i34;
                        if (eVar5.f6134f0 != 8 && nVar2.f6601d == 3 && !fVar2.f6585j) {
                            int i40 = f3 > 0.0f ? (int) (((eVar5.f6142j0[this.f6603f] * f15) / f3) + f14) : i39;
                            if (this.f6603f == 0) {
                                i18 = eVar5.f6156u;
                                i19 = eVar5.f6155t;
                            } else {
                                i18 = eVar5.f6159x;
                                i19 = eVar5.f6158w;
                            }
                            int iMax = Math.max(i19, nVar2.f6598a == 1 ? Math.min(i40, fVar2.m) : i40);
                            if (i18 > 0) {
                                iMax = Math.min(i18, iMax);
                            }
                            if (iMax != i40) {
                                i36++;
                                i40 = iMax;
                            }
                            fVar2.d(i40);
                        }
                        i35++;
                        i33 = i37;
                        f12 = f14;
                        i12 = i38;
                        f13 = f15;
                        i34 = i39;
                    }
                    i15 = i33;
                    f10 = f12;
                    int i41 = i12;
                    if (i36 > 0) {
                        i12 = i41 - i36;
                        i14 = 0;
                        for (int i42 = 0; i42 < size; i42++) {
                            n nVar3 = (n) arrayList.get(i42);
                            if (nVar3.f6599b.f6134f0 != 8) {
                                if (i42 > 0 && i42 >= i23) {
                                    i14 += nVar3.f6605h.f6581f;
                                }
                                i14 += nVar3.f6602e.f6582g;
                                if (i42 < i24 && i42 < i10) {
                                    i14 += -nVar3.f6606i.f6581f;
                                }
                            }
                        }
                    } else {
                        i12 = i41;
                    }
                    i17 = 2;
                    if (this.l == 2 && i36 == 0) {
                        i16 = 0;
                        this.l = 0;
                    } else {
                        i16 = 0;
                    }
                } else {
                    i15 = i33;
                    f10 = 0.5f;
                    i16 = 0;
                    i17 = 2;
                }
                if (i14 > i22) {
                    this.l = i17;
                }
                if (i13 > 0 && i12 == 0 && i23 == i10) {
                    this.l = i17;
                }
                int i43 = this.l;
                if (i43 == 1) {
                    int i44 = i13 > 1 ? (i22 - i14) / (i13 - 1) : i13 == 1 ? (i22 - i14) / 2 : i16;
                    if (i12 > 0) {
                        i44 = i16;
                    }
                    int i45 = i15;
                    for (int i46 = i16; i46 < size; i46++) {
                        n nVar4 = (n) arrayList.get(z10 ? size - (i46 + 1) : i46);
                        g4.e eVar6 = nVar4.f6599b;
                        e eVar7 = nVar4.f6606i;
                        e eVar8 = nVar4.f6605h;
                        if (eVar6.f6134f0 == 8) {
                            eVar8.d(i45);
                            eVar7.d(i45);
                        } else {
                            if (i46 > 0) {
                                i45 = z10 ? i45 - i44 : i45 + i44;
                            }
                            if (i46 > 0 && i46 >= i23) {
                                i45 = z10 ? i45 - eVar8.f6581f : i45 + eVar8.f6581f;
                            }
                            if (z10) {
                                eVar7.d(i45);
                            } else {
                                eVar8.d(i45);
                            }
                            f fVar3 = nVar4.f6602e;
                            int i47 = fVar3.f6582g;
                            if (nVar4.f6601d == 3 && nVar4.f6598a == 1) {
                                i47 = fVar3.m;
                            }
                            i45 = z10 ? i45 - i47 : i45 + i47;
                            if (z10) {
                                eVar8.d(i45);
                            } else {
                                eVar7.d(i45);
                            }
                            nVar4.f6604g = true;
                            if (i46 < i24 && i46 < i10) {
                                i45 = z10 ? i45 - (-eVar7.f6581f) : i45 + (-eVar7.f6581f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 0) {
                    int i48 = (i22 - i14) / (i13 + 1);
                    if (i12 > 0) {
                        i48 = i16;
                    }
                    int i49 = i15;
                    for (int i50 = i16; i50 < size; i50++) {
                        n nVar5 = (n) arrayList.get(z10 ? size - (i50 + 1) : i50);
                        g4.e eVar9 = nVar5.f6599b;
                        e eVar10 = nVar5.f6606i;
                        e eVar11 = nVar5.f6605h;
                        if (eVar9.f6134f0 == 8) {
                            eVar11.d(i49);
                            eVar10.d(i49);
                        } else {
                            int i51 = z10 ? i49 - i48 : i49 + i48;
                            if (i50 > 0 && i50 >= i23) {
                                i51 = z10 ? i51 - eVar11.f6581f : i51 + eVar11.f6581f;
                            }
                            if (z10) {
                                eVar10.d(i51);
                            } else {
                                eVar11.d(i51);
                            }
                            f fVar4 = nVar5.f6602e;
                            int iMin = fVar4.f6582g;
                            if (nVar5.f6601d == 3 && nVar5.f6598a == 1) {
                                iMin = Math.min(iMin, fVar4.m);
                            }
                            i49 = z10 ? i51 - iMin : i51 + iMin;
                            if (z10) {
                                eVar11.d(i49);
                            } else {
                                eVar10.d(i49);
                            }
                            if (i50 < i24 && i50 < i10) {
                                i49 = z10 ? i49 - (-eVar10.f6581f) : i49 + (-eVar10.f6581f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 2) {
                    int i52 = this.f6603f;
                    g4.e eVar12 = this.f6599b;
                    float f16 = i52 == 0 ? eVar12.f6128c0 : eVar12.f6130d0;
                    if (z10) {
                        f16 = 1.0f - f16;
                    }
                    int i53 = (int) (((i22 - i14) * f16) + f10);
                    if (i53 < 0 || i12 > 0) {
                        i53 = i16;
                    }
                    int i54 = z10 ? i15 - i53 : i15 + i53;
                    for (int i55 = i16; i55 < size; i55++) {
                        n nVar6 = (n) arrayList.get(z10 ? size - (i55 + 1) : i55);
                        g4.e eVar13 = nVar6.f6599b;
                        e eVar14 = nVar6.f6606i;
                        e eVar15 = nVar6.f6605h;
                        if (eVar13.f6134f0 == 8) {
                            eVar15.d(i54);
                            eVar14.d(i54);
                        } else {
                            if (i55 > 0 && i55 >= i23) {
                                i54 = z10 ? i54 - eVar15.f6581f : i54 + eVar15.f6581f;
                            }
                            if (z10) {
                                eVar14.d(i54);
                            } else {
                                eVar15.d(i54);
                            }
                            f fVar5 = nVar6.f6602e;
                            int i56 = fVar5.f6582g;
                            if (nVar6.f6601d == 3 && nVar6.f6598a == 1) {
                                i56 = fVar5.m;
                            }
                            i54 = z10 ? i54 - i56 : i54 + i56;
                            if (z10) {
                                eVar15.d(i54);
                            } else {
                                eVar14.d(i54);
                            }
                            if (i55 < i24 && i55 < i10) {
                                i54 = z10 ? i54 - (-eVar14.f6581f) : i54 + (-eVar14.f6581f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void d() {
        ArrayList arrayList = this.f6575k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        g4.e eVar = ((n) arrayList.get(0)).f6599b;
        g4.e eVar2 = ((n) arrayList.get(size - 1)).f6599b;
        int i10 = this.f6603f;
        e eVar3 = this.f6606i;
        e eVar4 = this.f6605h;
        if (i10 == 0) {
            g4.d dVar = eVar.H;
            g4.d dVar2 = eVar2.J;
            e eVarI = n.i(dVar, 0);
            int iE = dVar.e();
            g4.e eVarM = m();
            if (eVarM != null) {
                iE = eVarM.H.e();
            }
            if (eVarI != null) {
                n.b(eVar4, eVarI, iE);
            }
            e eVarI2 = n.i(dVar2, 0);
            int iE2 = dVar2.e();
            g4.e eVarN = n();
            if (eVarN != null) {
                iE2 = eVarN.J.e();
            }
            if (eVarI2 != null) {
                n.b(eVar3, eVarI2, -iE2);
            }
        } else {
            g4.d dVar3 = eVar.I;
            g4.d dVar4 = eVar2.K;
            e eVarI3 = n.i(dVar3, 1);
            int iE3 = dVar3.e();
            g4.e eVarM2 = m();
            if (eVarM2 != null) {
                iE3 = eVarM2.I.e();
            }
            if (eVarI3 != null) {
                n.b(eVar4, eVarI3, iE3);
            }
            e eVarI4 = n.i(dVar4, 1);
            int iE4 = dVar4.e();
            g4.e eVarN2 = n();
            if (eVarN2 != null) {
                iE4 = eVarN2.K.e();
            }
            if (eVarI4 != null) {
                n.b(eVar3, eVarI4, -iE4);
            }
        }
        eVar4.f6576a = this;
        eVar3.f6576a = this;
    }

    @Override
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6575k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i10)).e();
            i10++;
        }
    }

    @Override
    public final void f() {
        this.f6600c = null;
        Iterator it = this.f6575k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
    }

    @Override
    public final long j() {
        ArrayList arrayList = this.f6575k;
        int size = arrayList.size();
        long j9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            j9 = ((long) nVar.f6606i.f6581f) + nVar.j() + j9 + ((long) nVar.f6605h.f6581f);
        }
        return j9;
    }

    @Override
    public final boolean k() {
        ArrayList arrayList = this.f6575k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((n) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final g4.e m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6575k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            g4.e eVar = ((n) arrayList.get(i10)).f6599b;
            if (eVar.f6134f0 != 8) {
                return eVar;
            }
            i10++;
        }
    }

    public final g4.e n() {
        ArrayList arrayList = this.f6575k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g4.e eVar = ((n) arrayList.get(size)).f6599b;
            if (eVar.f6134f0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f6603f == 0 ? "horizontal : " : "vertical : ");
        for (n nVar : this.f6575k) {
            sb2.append("<");
            sb2.append(nVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
