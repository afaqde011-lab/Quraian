package g4;

import java.util.ArrayList;

public final class h extends j {
    public h4.b A0;
    public j4.f B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public e[] W0;
    public e[] X0;
    public int[] Y0;
    public e[] Z0;

    public int f6189a1;

    public int f6190r0;

    public int f6191s0;

    public int f6192t0;

    public int f6193u0;

    public int f6194v0;

    public int f6195w0;

    public boolean f6196x0;

    public int f6197y0;

    public int f6198z0;

    @Override
    public final void N() {
        for (int i10 = 0; i10 < this.f6206q0; i10++) {
            e eVar = this.f6205p0[i10];
            if (eVar != null) {
                eVar.E = true;
            }
        }
    }

    public final int O(e eVar, int i10) {
        e eVar2;
        if (eVar != null) {
            int[] iArr = eVar.f6150o0;
            if (iArr[1] == 3) {
                int i11 = eVar.f6153r;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int i12 = (int) (eVar.f6160y * i10);
                        if (i12 != eVar.k()) {
                            eVar.f6135g = true;
                            Q(iArr[0], eVar.n(), 1, i12, eVar);
                        }
                        return i12;
                    }
                    eVar2 = eVar;
                    if (i11 == 1) {
                        return eVar2.k();
                    }
                    if (i11 == 3) {
                        return (int) ((eVar2.n() * eVar2.V) + 0.5f);
                    }
                }
            } else {
                eVar2 = eVar;
            }
            return eVar2.k();
        }
        return 0;
    }

    public final int P(e eVar, int i10) {
        e eVar2;
        if (eVar != null) {
            int[] iArr = eVar.f6150o0;
            if (iArr[0] == 3) {
                int i11 = eVar.f6152q;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int i12 = (int) (eVar.f6157v * i10);
                        if (i12 != eVar.n()) {
                            eVar.f6135g = true;
                            Q(1, i12, iArr[1], eVar.k(), eVar);
                        }
                        return i12;
                    }
                    eVar2 = eVar;
                    if (i11 == 1) {
                        return eVar2.n();
                    }
                    if (i11 == 3) {
                        return (int) ((eVar2.k() * eVar2.V) + 0.5f);
                    }
                }
            } else {
                eVar2 = eVar;
            }
            return eVar2.n();
        }
        return 0;
    }

    public final void Q(int i10, int i11, int i12, int i13, e eVar) {
        j4.f fVar;
        e eVar2;
        h4.b bVar = this.A0;
        while (true) {
            fVar = this.B0;
            if (fVar != null || (eVar2 = this.S) == null) {
                break;
            } else {
                this.B0 = ((f) eVar2).f6166t0;
            }
        }
        bVar.f6565a = i10;
        bVar.f6566b = i12;
        bVar.f6567c = i11;
        bVar.f6568d = i13;
        fVar.b(eVar, bVar);
        eVar.J(bVar.f6569e);
        eVar.G(bVar.f6570f);
        eVar.D = bVar.f6572h;
        eVar.D(bVar.f6571g);
    }

    @Override
    public final void b(e4.c cVar, boolean z10) {
        e eVar;
        float f3;
        int i10;
        ArrayList arrayList = this.V0;
        super.b(cVar, z10);
        e eVar2 = this.S;
        boolean z11 = eVar2 != null && ((f) eVar2).f6167u0;
        int i11 = this.S0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((g) arrayList.get(i12)).b(i12, z11, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 == 2 && this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i13 = 0; i13 < this.f6189a1; i13++) {
                    this.Z0[i13].A();
                }
                int[] iArr = this.Y0;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f10 = this.I0;
                e eVar3 = null;
                int i16 = 0;
                while (i16 < i14) {
                    if (z11) {
                        i10 = (i14 - i16) - 1;
                        f3 = 1.0f - this.I0;
                    } else {
                        f3 = f10;
                        i10 = i16;
                    }
                    e eVar4 = this.X0[i10];
                    if (eVar4 != null) {
                        d dVar = eVar4.H;
                        if (eVar4.f6134f0 != 8) {
                            if (i16 == 0) {
                                eVar4.f(dVar, this.H, this.f6194v0);
                                eVar4.f6138h0 = this.C0;
                                eVar4.f6128c0 = f3;
                            }
                            if (i16 == i14 - 1) {
                                eVar4.f(eVar4.J, this.J, this.f6195w0);
                            }
                            if (i16 > 0 && eVar3 != null) {
                                d dVar2 = eVar3.J;
                                eVar4.f(dVar, dVar2, this.O0);
                                eVar3.f(dVar2, dVar, 0);
                            }
                            eVar3 = eVar4;
                        }
                    }
                    i16++;
                    f10 = f3;
                }
                for (int i17 = 0; i17 < i15; i17++) {
                    e eVar5 = this.W0[i17];
                    if (eVar5 != null) {
                        d dVar3 = eVar5.I;
                        if (eVar5.f6134f0 != 8) {
                            if (i17 == 0) {
                                eVar5.f(dVar3, this.I, this.f6190r0);
                                eVar5.f6140i0 = this.D0;
                                eVar5.f6130d0 = this.J0;
                            }
                            if (i17 == i15 - 1) {
                                eVar5.f(eVar5.K, this.K, this.f6191s0);
                            }
                            if (i17 > 0 && eVar3 != null) {
                                d dVar4 = eVar3.K;
                                eVar5.f(dVar3, dVar4, this.P0);
                                eVar3.f(dVar4, dVar3, 0);
                            }
                            eVar3 = eVar5;
                        }
                    }
                }
                for (int i18 = 0; i18 < i14; i18++) {
                    for (int i19 = 0; i19 < i15; i19++) {
                        int i20 = (i19 * i14) + i18;
                        if (this.U0 == 1) {
                            i20 = (i18 * i15) + i19;
                        }
                        e[] eVarArr = this.Z0;
                        if (i20 < eVarArr.length && (eVar = eVarArr[i20]) != null && eVar.f6134f0 != 8) {
                            e eVar6 = this.X0[i18];
                            e eVar7 = this.W0[i19];
                            if (eVar != eVar6) {
                                eVar.f(eVar.H, eVar6.H, 0);
                                eVar.f(eVar.J, eVar6.J, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.f(eVar.I, eVar7.I, 0);
                                eVar.f(eVar.K, eVar7.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z11, true);
        }
        this.f6196x0 = false;
    }
}
