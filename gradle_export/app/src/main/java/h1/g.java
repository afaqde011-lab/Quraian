package h1;

import l1.i1;

public final class g implements u00.a {
    public final int A;
    public final fc.n B;

    public g(fc.n nVar, int i10) {
        this.A = i10;
        this.B = nVar;
    }

    public final Object invoke() {
        float fK;
        switch (this.A) {
            case 0:
                fc.n nVar = this.B;
                i1 i1Var = (i1) nVar.l;
                i1 i1Var2 = (i1) nVar.f5632g;
                Object value = i1Var.getValue();
                if (value != null) {
                    return value;
                }
                float fH = ((l1.e1) nVar.f5635j).h();
                return !Float.isNaN(fH) ? nVar.f(fH, 0.0f, i1Var2.getValue()) : i1Var2.getValue();
            case 1:
                fc.n nVar2 = this.B;
                i1 i1Var3 = (i1) nVar2.l;
                i1 i1Var4 = (i1) nVar2.f5632g;
                Object value2 = i1Var3.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fH2 = ((l1.e1) nVar2.f5635j).h();
                if (Float.isNaN(fH2)) {
                    return i1Var4.getValue();
                }
                Object value3 = i1Var4.getValue();
                n0 n0VarG = nVar2.g();
                float fD = n0VarG.d(value3);
                if (fD != fH2 && !Float.isNaN(fD)) {
                    if (fD < fH2) {
                        Object objB = n0VarG.b(fH2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = n0VarG.b(fH2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value3;
            case 2:
                fc.n nVar3 = this.B;
                float fD2 = nVar3.g().d(((i1) nVar3.f5632g).getValue());
                float fD3 = nVar3.g().d(((l1.w) nVar3.f5634i).getValue()) - fD2;
                float fAbs = Math.abs(fD3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fK = 1.0f;
                } else {
                    fK = (nVar3.k() - fD2) / fD3;
                    if (fK < 1.0E-6f) {
                        fK = 0.0f;
                    } else if (fK > 0.999999f) {
                        fK = 1.0f;
                    }
                }
                return Float.valueOf(fK);
            case 3:
                return this.B.g();
            default:
                fc.n nVar4 = this.B;
                return new g00.k(nVar4.g(), ((l1.w) nVar4.f5633h).getValue());
        }
    }
}
