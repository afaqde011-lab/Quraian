package g4;

import java.util.ArrayList;

public final class i extends e {

    public float f6199p0 = -1.0f;

    public int f6200q0 = -1;

    public int f6201r0 = -1;

    public d f6202s0 = this.I;

    public int f6203t0 = 0;

    public boolean f6204u0;

    public i() {
        this.Q.clear();
        this.Q.add(this.f6202s0);
        int length = this.P.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.P[i10] = this.f6202s0;
        }
    }

    @Override
    public final void L(e4.c cVar, boolean z10) {
        if (this.S == null) {
            return;
        }
        d dVar = this.f6202s0;
        cVar.getClass();
        int iN = e4.c.n(dVar);
        if (this.f6203t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i10) {
        this.f6202s0.l(i10);
        this.f6204u0 = true;
    }

    public final void N(int i10) {
        if (this.f6203t0 == i10) {
            return;
        }
        this.f6203t0 = i10;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.f6203t0 == 1) {
            this.f6202s0 = this.H;
        } else {
            this.f6202s0 = this.I;
        }
        arrayList.add(this.f6202s0);
        d[] dVarArr = this.P;
        int length = dVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            dVarArr[i11] = this.f6202s0;
        }
    }

    @Override
    public final void b(e4.c cVar, boolean z10) {
        f fVar = (f) this.S;
        if (fVar == null) {
            return;
        }
        Object objI = fVar.i(2);
        Object objI2 = fVar.i(4);
        e eVar = this.S;
        boolean z11 = eVar != null && eVar.f6150o0[0] == 2;
        if (this.f6203t0 == 0) {
            objI = fVar.i(3);
            objI2 = fVar.i(5);
            e eVar2 = this.S;
            z11 = eVar2 != null && eVar2.f6150o0[1] == 2;
        }
        if (this.f6204u0) {
            d dVar = this.f6202s0;
            if (dVar.f6116c) {
                e4.g gVarK = cVar.k(dVar);
                cVar.d(gVarK, this.f6202s0.d());
                if (this.f6200q0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(objI2), gVarK, 0, 5);
                    }
                } else if (this.f6201r0 != -1 && z11) {
                    e4.g gVarK2 = cVar.k(objI2);
                    cVar.f(gVarK, cVar.k(objI), 0, 5);
                    cVar.f(gVarK2, gVarK, 0, 5);
                }
                this.f6204u0 = false;
                return;
            }
        }
        if (this.f6200q0 != -1) {
            e4.g gVarK3 = cVar.k(this.f6202s0);
            cVar.e(gVarK3, cVar.k(objI), this.f6200q0, 8);
            if (z11) {
                cVar.f(cVar.k(objI2), gVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f6201r0 != -1) {
            e4.g gVarK4 = cVar.k(this.f6202s0);
            e4.g gVarK5 = cVar.k(objI2);
            cVar.e(gVarK4, gVarK5, -this.f6201r0, 8);
            if (z11) {
                cVar.f(gVarK4, cVar.k(objI), 0, 5);
                cVar.f(gVarK5, gVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f6199p0 != -1.0f) {
            e4.g gVarK6 = cVar.k(this.f6202s0);
            e4.g gVarK7 = cVar.k(objI2);
            float f3 = this.f6199p0;
            e4.b bVarL = cVar.l();
            bVarL.f5064d.g(gVarK6, -1.0f);
            bVarL.f5064d.g(gVarK7, f3);
            cVar.c(bVarL);
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final d i(int i10) {
        int iB = e4.f.b(i10);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.f6203t0 == 0) {
                return this.f6202s0;
            }
            return null;
        }
        if (this.f6203t0 == 1) {
            return this.f6202s0;
        }
        return null;
    }

    @Override
    public final boolean x() {
        return this.f6204u0;
    }

    @Override
    public final boolean y() {
        return this.f6204u0;
    }
}
