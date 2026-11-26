package g4;

public final class g {

    public int f6173a;

    public d f6176d;

    public d f6177e;

    public d f6178f;

    public d f6179g;

    public int f6180h;

    public int f6181i;

    public int f6182j;

    public int f6183k;

    public int f6187q;

    public final h f6188r;

    public e f6174b = null;

    public int f6175c = 0;
    public int l = 0;
    public int m = 0;

    public int f6184n = 0;

    public int f6185o = 0;

    public int f6186p = 0;

    public g(h hVar, int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
        this.f6188r = hVar;
        this.f6173a = i10;
        this.f6176d = dVar;
        this.f6177e = dVar2;
        this.f6178f = dVar3;
        this.f6179g = dVar4;
        this.f6180h = hVar.f6194v0;
        this.f6181i = hVar.f6190r0;
        this.f6182j = hVar.f6195w0;
        this.f6183k = hVar.f6191s0;
        this.f6187q = i11;
    }

    public final void a(e eVar) {
        int i10 = this.f6173a;
        h hVar = this.f6188r;
        if (i10 == 0) {
            int iP = hVar.P(eVar, this.f6187q);
            if (eVar.f6150o0[0] == 3) {
                this.f6186p++;
                iP = 0;
            }
            this.l = iP + (eVar.f6134f0 != 8 ? hVar.O0 : 0) + this.l;
            int iO = hVar.O(eVar, this.f6187q);
            if (this.f6174b == null || this.f6175c < iO) {
                this.f6174b = eVar;
                this.f6175c = iO;
                this.m = iO;
            }
        } else {
            int iP2 = hVar.P(eVar, this.f6187q);
            int iO2 = hVar.O(eVar, this.f6187q);
            if (eVar.f6150o0[1] == 3) {
                this.f6186p++;
                iO2 = 0;
            }
            this.m = iO2 + (eVar.f6134f0 != 8 ? hVar.P0 : 0) + this.m;
            if (this.f6174b == null || this.f6175c < iP2) {
                this.f6174b = eVar;
                this.f6175c = iP2;
                this.l = iP2;
            }
        }
        this.f6185o++;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        h hVar;
        int i11;
        e eVar;
        char c10;
        int i12;
        int i13;
        int i14;
        int i15 = this.f6185o;
        int i16 = 0;
        while (true) {
            hVar = this.f6188r;
            if (i16 >= i15 || (i14 = this.f6184n + i16) >= hVar.f6189a1) {
                break;
            }
            e eVar2 = hVar.Z0[i14];
            if (eVar2 != null) {
                eVar2.A();
            }
            i16++;
        }
        if (i15 == 0 || this.f6174b == null) {
            return;
        }
        boolean z12 = z11 && i10 == 0;
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < i15; i19++) {
            int i20 = this.f6184n + (z10 ? (i15 - 1) - i19 : i19);
            if (i20 >= hVar.f6189a1) {
                break;
            }
            if (hVar.Z0[i20].f6134f0 == 0) {
                if (i17 == -1) {
                    i17 = i19;
                }
                i18 = i19;
            }
        }
        if (this.f6173a != 0) {
            e eVar3 = this.f6174b;
            eVar3.f6138h0 = hVar.C0;
            d dVar = eVar3.H;
            d dVar2 = eVar3.J;
            int i21 = this.f6180h;
            if (i10 > 0) {
                i21 += hVar.O0;
            }
            if (z10) {
                dVar2.a(this.f6178f, i21);
                if (z11) {
                    dVar.a(this.f6176d, this.f6182j);
                }
                if (i10 > 0) {
                    this.f6178f.f6117d.H.a(dVar2, 0);
                }
            } else {
                dVar.a(this.f6176d, i21);
                if (z11) {
                    dVar2.a(this.f6178f, this.f6182j);
                }
                if (i10 > 0) {
                    this.f6176d.f6117d.J.a(dVar, 0);
                }
            }
            e eVar4 = null;
            int i22 = 0;
            while (i22 < i15) {
                int i23 = this.f6184n + i22;
                if (i23 >= hVar.f6189a1) {
                    return;
                }
                e eVar5 = hVar.Z0[i23];
                if (i22 == 0) {
                    eVar5.f(eVar5.I, this.f6177e, this.f6181i);
                    int i24 = hVar.D0;
                    float f3 = hVar.J0;
                    if (this.f6184n == 0) {
                        int i25 = hVar.F0;
                        i11 = -1;
                        if (i25 != -1) {
                            f3 = hVar.L0;
                        }
                        i24 = i25;
                        eVar5.f6140i0 = i24;
                        eVar5.f6130d0 = f3;
                    } else {
                        i11 = -1;
                    }
                    if (z11 && (i25 = hVar.H0) != i11) {
                        f3 = hVar.N0;
                        i24 = i25;
                    }
                    eVar5.f6140i0 = i24;
                    eVar5.f6130d0 = f3;
                }
                if (i22 == i15 - 1) {
                    eVar5.f(eVar5.K, this.f6179g, this.f6183k);
                }
                if (eVar4 != null) {
                    d dVar3 = eVar4.K;
                    d dVar4 = eVar5.I;
                    dVar4.a(dVar3, hVar.P0);
                    if (i22 == i17) {
                        int i26 = this.f6181i;
                        if (dVar4.h()) {
                            dVar4.f6121h = i26;
                        }
                    }
                    dVar3.a(dVar4, 0);
                    if (i22 == i18 + 1) {
                        int i27 = this.f6183k;
                        if (dVar3.h()) {
                            dVar3.f6121h = i27;
                        }
                    }
                }
                if (eVar5 != eVar3) {
                    if (z10) {
                        int i28 = hVar.Q0;
                        if (i28 == 0) {
                            eVar5.J.a(dVar2, 0);
                        } else if (i28 == 1) {
                            eVar5.H.a(dVar, 0);
                        } else if (i28 == 2) {
                            eVar5.H.a(dVar, 0);
                            eVar5.J.a(dVar2, 0);
                        }
                    } else {
                        int i29 = hVar.Q0;
                        if (i29 == 0) {
                            eVar5.H.a(dVar, 0);
                        } else if (i29 == 1) {
                            eVar5.J.a(dVar2, 0);
                        } else if (i29 == 2) {
                            if (z12) {
                                eVar5.H.a(this.f6176d, this.f6180h);
                                eVar5.J.a(this.f6178f, this.f6182j);
                            } else {
                                eVar5.H.a(dVar, 0);
                                eVar5.J.a(dVar2, 0);
                            }
                        }
                    }
                }
                i22++;
                eVar4 = eVar5;
            }
            return;
        }
        e eVar6 = this.f6174b;
        eVar6.f6140i0 = hVar.D0;
        d dVar5 = eVar6.K;
        d dVar6 = eVar6.I;
        int i30 = this.f6181i;
        if (i10 > 0) {
            i30 += hVar.P0;
        }
        dVar6.a(this.f6177e, i30);
        if (z11) {
            dVar5.a(this.f6179g, this.f6183k);
        }
        if (i10 > 0) {
            this.f6177e.f6117d.K.a(dVar6, 0);
        }
        if (hVar.R0 != 3 || eVar6.D) {
            eVar = eVar6;
            break;
        }
        int i31 = 0;
        while (true) {
            if (i31 < i15) {
                int i32 = this.f6184n + (z10 ? (i15 - 1) - i31 : i31);
                if (i32 < hVar.f6189a1) {
                    eVar = hVar.Z0[i32];
                    if (eVar.D) {
                        break;
                    } else {
                        i31++;
                    }
                }
            }
            eVar = eVar6;
            break;
        }
        int i33 = 0;
        e eVar7 = null;
        while (i33 < i15) {
            int i34 = z10 ? (i15 - 1) - i33 : i33;
            int i35 = this.f6184n + i34;
            if (i35 >= hVar.f6189a1) {
                return;
            }
            e eVar8 = hVar.Z0[i35];
            if (i33 == 0) {
                eVar8.f(eVar8.H, this.f6176d, this.f6180h);
            }
            if (i34 == 0) {
                int i36 = hVar.C0;
                float f10 = z10 ? 1.0f - hVar.I0 : hVar.I0;
                if (this.f6184n == 0 && (i13 = hVar.E0) != -1) {
                    f10 = z10 ? 1.0f - hVar.K0 : hVar.K0;
                    i12 = i13;
                } else if (!z11 || (i12 = hVar.G0) == -1) {
                    i12 = i36;
                } else {
                    f10 = z10 ? 1.0f - hVar.M0 : hVar.M0;
                }
                eVar8.f6138h0 = i12;
                eVar8.f6128c0 = f10;
            }
            if (i33 == i15 - 1) {
                eVar8.f(eVar8.J, this.f6178f, this.f6182j);
            }
            if (eVar7 != null) {
                d dVar7 = eVar7.J;
                d dVar8 = eVar8.H;
                dVar8.a(dVar7, hVar.O0);
                if (i33 == i17) {
                    int i37 = this.f6180h;
                    if (dVar8.h()) {
                        dVar8.f6121h = i37;
                    }
                }
                dVar7.a(dVar8, 0);
                if (i33 == i18 + 1) {
                    int i38 = this.f6182j;
                    if (dVar7.h()) {
                        dVar7.f6121h = i38;
                    }
                }
            }
            if (eVar8 != eVar6) {
                int i39 = hVar.R0;
                c10 = 3;
                if (i39 == 3 && eVar.D && eVar8 != eVar && eVar8.D) {
                    eVar8.L.a(eVar.L, 0);
                } else if (i39 == 0) {
                    eVar8.I.a(dVar6, 0);
                } else if (i39 == 1) {
                    eVar8.K.a(dVar5, 0);
                } else if (z12) {
                    eVar8.I.a(this.f6177e, this.f6181i);
                    eVar8.K.a(this.f6179g, this.f6183k);
                } else {
                    eVar8.I.a(dVar6, 0);
                    eVar8.K.a(dVar5, 0);
                }
            } else {
                c10 = 3;
            }
            i33++;
            eVar7 = eVar8;
        }
    }

    public final int c() {
        return this.f6173a == 1 ? this.m - this.f6188r.P0 : this.m;
    }

    public final int d() {
        return this.f6173a == 0 ? this.l - this.f6188r.O0 : this.l;
    }

    public final void e(int i10) {
        h hVar;
        int i11;
        int i12 = this.f6186p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f6185o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            hVar = this.f6188r;
            if (i15 >= i13 || (i11 = this.f6184n + i15) >= hVar.f6189a1) {
                break;
            }
            e eVar = hVar.Z0[i11];
            if (this.f6173a == 0) {
                if (eVar != null) {
                    int[] iArr = eVar.f6150o0;
                    if (iArr[0] == 3 && eVar.f6152q == 0) {
                        hVar.Q(1, i14, iArr[1], eVar.k(), eVar);
                    }
                }
            } else if (eVar != null) {
                int[] iArr2 = eVar.f6150o0;
                if (iArr2[1] == 3 && eVar.f6153r == 0) {
                    int i16 = i14;
                    hVar.Q(iArr2[0], eVar.n(), 1, i16, eVar);
                    i14 = i16;
                }
            }
            i15++;
        }
        this.l = 0;
        this.m = 0;
        this.f6174b = null;
        this.f6175c = 0;
        int i17 = this.f6185o;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = this.f6184n + i18;
            if (i19 >= hVar.f6189a1) {
                return;
            }
            e eVar2 = hVar.Z0[i19];
            if (this.f6173a == 0) {
                int iN = eVar2.n();
                int i20 = hVar.O0;
                if (eVar2.f6134f0 == 8) {
                    i20 = 0;
                }
                this.l = iN + i20 + this.l;
                int iO = hVar.O(eVar2, this.f6187q);
                if (this.f6174b == null || this.f6175c < iO) {
                    this.f6174b = eVar2;
                    this.f6175c = iO;
                    this.m = iO;
                }
            } else {
                int iP = hVar.P(eVar2, this.f6187q);
                int iO2 = hVar.O(eVar2, this.f6187q);
                int i21 = hVar.P0;
                if (eVar2.f6134f0 == 8) {
                    i21 = 0;
                }
                this.m = iO2 + i21 + this.m;
                if (this.f6174b == null || this.f6175c < iP) {
                    this.f6174b = eVar2;
                    this.f6175c = iP;
                    this.l = iP;
                }
            }
        }
    }

    public final void f(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f6173a = i10;
        this.f6176d = dVar;
        this.f6177e = dVar2;
        this.f6178f = dVar3;
        this.f6179g = dVar4;
        this.f6180h = i11;
        this.f6181i = i12;
        this.f6182j = i13;
        this.f6183k = i14;
        this.f6187q = i15;
    }
}
