package g4;

import com.google.android.gms.internal.measurement.x5;

public final class a extends j {

    public int f6095r0;

    public boolean f6096s0;

    public int f6097t0;

    public boolean f6098u0;

    public final boolean O() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f6206q0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f6205p0[i13];
            if ((this.f6096s0 || eVar.c()) && ((((i11 = this.f6095r0) == 0 || i11 == 1) && !eVar.x()) || (((i12 = this.f6095r0) == 2 || i12 == 3) && !eVar.y()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f6206q0; i14++) {
            e eVar2 = this.f6205p0[i14];
            if (this.f6096s0 || eVar2.c()) {
                if (!z11) {
                    int i15 = this.f6095r0;
                    if (i15 == 0) {
                        iMax = eVar2.i(2).d();
                    } else if (i15 == 1) {
                        iMax = eVar2.i(4).d();
                    } else if (i15 == 2) {
                        iMax = eVar2.i(3).d();
                    } else if (i15 == 3) {
                        iMax = eVar2.i(5).d();
                    }
                    z11 = true;
                }
                int i16 = this.f6095r0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, eVar2.i(2).d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, eVar2.i(4).d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, eVar2.i(3).d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, eVar2.i(5).d());
                }
            }
        }
        int i17 = iMax + this.f6097t0;
        int i18 = this.f6095r0;
        if (i18 == 0 || i18 == 1) {
            E(i17, i17);
        } else {
            F(i17, i17);
        }
        this.f6098u0 = true;
        return true;
    }

    public final int P() {
        int i10 = this.f6095r0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override
    public final void b(e4.c cVar, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        d[] dVarArr = this.P;
        d dVar = this.H;
        dVarArr[0] = dVar;
        int i12 = 2;
        d dVar2 = this.I;
        dVarArr[2] = dVar2;
        d dVar3 = this.J;
        dVarArr[1] = dVar3;
        d dVar4 = this.K;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f6122i = cVar.k(dVar5);
        }
        int i13 = this.f6095r0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        d dVar6 = dVarArr[i13];
        if (!this.f6098u0) {
            O();
        }
        if (this.f6098u0) {
            this.f6098u0 = false;
            int i14 = this.f6095r0;
            if (i14 == 0 || i14 == 1) {
                cVar.d(dVar.f6122i, this.X);
                cVar.d(dVar3.f6122i, this.X);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    cVar.d(dVar2.f6122i, this.Y);
                    cVar.d(dVar4.f6122i, this.Y);
                    return;
                }
                return;
            }
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.f6206q0) {
                z11 = false;
                break;
            }
            e eVar = this.f6205p0[i15];
            if ((this.f6096s0 || eVar.c()) && ((((i11 = this.f6095r0) == 0 || i11 == 1) && eVar.f6150o0[0] == 3 && eVar.H.f6119f != null && eVar.J.f6119f != null) || ((i11 == 2 || i11 == 3) && eVar.f6150o0[1] == 3 && eVar.I.f6119f != null && eVar.K.f6119f != null))) {
                z11 = true;
                break;
            }
            i15++;
        }
        boolean z12 = dVar.g() || dVar3.g();
        boolean z13 = dVar2.g() || dVar4.g();
        int i16 = !(!z11 && (((i10 = this.f6095r0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f6206q0) {
            e eVar2 = this.f6205p0[i17];
            if (this.f6096s0 || eVar2.c()) {
                e4.g gVarK = cVar.k(eVar2.P[this.f6095r0]);
                d[] dVarArr2 = eVar2.P;
                int i18 = this.f6095r0;
                d dVar7 = dVarArr2[i18];
                dVar7.f6122i = gVarK;
                d dVar8 = dVar7.f6119f;
                int i19 = (dVar8 == null || dVar8.f6117d != this) ? 0 : dVar7.f6120g;
                if (i18 == 0 || i18 == i12) {
                    e4.g gVar = dVar6.f6122i;
                    int i20 = this.f6097t0 - i19;
                    e4.b bVarL = cVar.l();
                    e4.g gVarM = cVar.m();
                    gVarM.D = 0;
                    bVarL.c(gVar, gVarK, gVarM, i20);
                    cVar.c(bVarL);
                } else {
                    e4.g gVar2 = dVar6.f6122i;
                    int i21 = this.f6097t0 + i19;
                    e4.b bVarL2 = cVar.l();
                    e4.g gVarM2 = cVar.m();
                    gVarM2.D = 0;
                    bVarL2.b(gVar2, gVarK, gVarM2, i21);
                    cVar.c(bVarL2);
                }
                cVar.e(dVar6.f6122i, gVarK, this.f6097t0 + i19, i16);
            }
            i17++;
            i12 = 2;
        }
        int i22 = this.f6095r0;
        if (i22 == 0) {
            cVar.e(dVar3.f6122i, dVar.f6122i, 0, 8);
            cVar.e(dVar.f6122i, this.S.J.f6122i, 0, 4);
            cVar.e(dVar.f6122i, this.S.H.f6122i, 0, 0);
            return;
        }
        if (i22 == 1) {
            cVar.e(dVar.f6122i, dVar3.f6122i, 0, 8);
            cVar.e(dVar.f6122i, this.S.H.f6122i, 0, 4);
            cVar.e(dVar.f6122i, this.S.J.f6122i, 0, 0);
        } else if (i22 == 2) {
            cVar.e(dVar4.f6122i, dVar2.f6122i, 0, 8);
            cVar.e(dVar2.f6122i, this.S.K.f6122i, 0, 4);
            cVar.e(dVar2.f6122i, this.S.I.f6122i, 0, 0);
        } else if (i22 == 3) {
            cVar.e(dVar2.f6122i, dVar4.f6122i, 0, 8);
            cVar.e(dVar2.f6122i, this.S.I.f6122i, 0, 4);
            cVar.e(dVar2.f6122i, this.S.K.f6122i, 0, 0);
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final String toString() {
        String strN = x5.n(new StringBuilder("[Barrier] "), this.f6136g0, " {");
        for (int i10 = 0; i10 < this.f6206q0; i10++) {
            e eVar = this.f6205p0[i10];
            if (i10 > 0) {
                strN = w.c.j(strN, ", ");
            }
            StringBuilder sbQ = x5.q(strN);
            sbQ.append(eVar.f6136g0);
            strN = sbQ.toString();
        }
        return w.c.j(strN, "}");
    }

    @Override
    public final boolean x() {
        return this.f6098u0;
    }

    @Override
    public final boolean y() {
        return this.f6098u0;
    }
}
