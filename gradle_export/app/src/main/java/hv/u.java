package hv;

import l1.z0;

public final class u implements u2.a {
    public final w A;
    public final float B;
    public final z0 C;

    public u(w wVar, float f, z0 z0Var) {
        this.A = wVar;
        this.B = f;
        this.C = z0Var;
    }

    public final long c0(int i, long j) {
        u00.k kVar = (u00.k) this.C.getValue();
        if (i != 1 || kVar == null) {
            return 0L;
        }
        float f = -Float.intBitsToFloat((int) (j & 4294967295L));
        w wVar = this.A;
        Boolean boolValueOf = null;
        if (!wVar.b && f != 0.0f) {
            if ((f > 0.0f) != (wVar.a >= 0.0f)) {
                wVar.a = 0.0f;
            }
            float f2 = wVar.a + f;
            wVar.a = f2;
            if (Math.abs(f2) >= this.B) {
                wVar.b = true;
                boolValueOf = Boolean.valueOf(wVar.a > 0.0f);
            }
        }
        if (boolValueOf == null) {
            return 0L;
        }
        kVar.invoke(boolValueOf);
        return 0L;
    }
}
