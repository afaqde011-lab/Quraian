package m0;

import d0.q1;
import l1.i1;
import x.z1;

public final class i implements d0.c {

    public final w f10334b;

    public final d0.c f10335c;

    public final y3.m f10336d;

    public i(w wVar, d0.c cVar, y3.m mVar) {
        this.f10334b = wVar;
        this.f10335c = cVar;
        this.f10336d = mVar;
    }

    @Override
    public final float a(float f3, float f10, float f11) {
        int iN;
        int iN2;
        int iN3;
        float fA = this.f10335c.a(f3, f10, f11);
        boolean z10 = false;
        if (f3 <= 0.0f) {
            float f12 = f3 + f10;
            h2.c cVar = z1.f16390a;
            if (f12 <= 1) {
                z10 = true;
            }
        } else if (f3 + f10 > f11) {
            z10 = true;
        }
        float fAbs = Math.abs(fA);
        y3.m mVar = this.f10336d;
        w wVar = this.f10334b;
        if (fAbs != 0.0f && z10) {
            if (mVar == y3.m.B && wVar.k().f10369e == q1.B) {
                iN3 = wVar.n() + (-wVar.f10390f);
            } else {
                iN3 = wVar.f10390f;
            }
            float fN = iN3 * (-1);
            while (fA > 0.0f && fN < fA) {
                fN += wVar.n();
            }
            while (fA < 0.0f && fN > fA) {
                fN -= wVar.n();
            }
            return fN;
        }
        int i10 = wVar.f10390f;
        i1 i1Var = wVar.D;
        if (Math.abs(i10) < 1.0E-6d) {
            return 0.0f;
        }
        y3.m mVar2 = y3.m.B;
        if (mVar == mVar2 && wVar.k().f10369e == q1.B) {
            iN = wVar.n() + (-wVar.f10390f);
        } else {
            iN = wVar.f10390f;
        }
        float f13 = iN * (-1.0f);
        if (mVar == mVar2 && wVar.k().f10369e == q1.B) {
            if (!((Boolean) i1Var.getValue()).booleanValue()) {
                iN2 = wVar.n();
                f13 += iN2;
            }
        } else if (((Boolean) i1Var.getValue()).booleanValue()) {
            iN2 = wVar.n();
            f13 += iN2;
        }
        return ab.a0.x(f13, -f11, f11);
    }
}
