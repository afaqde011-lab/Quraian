package g1;

import com.google.android.gms.cast.MediaError;

public final class h5 implements u00.n {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final f0.i D;
    public final t6 E;
    public final i2.t0 F;

    public h5(boolean z10, boolean z11, f0.i iVar, t6 t6Var, i2.t0 t0Var, int i10) {
        this.A = i10;
        this.B = z10;
        this.C = z11;
        this.D = iVar;
        this.E = t6Var;
        this.F = t0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5.f5746a.a(this.B, this.C, this.D, null, this.E, this.F, 0.0f, 0.0f, jVar, 100663296, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                } else {
                    g0Var.V();
                }
                break;
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5.f5746a.a(this.B, this.C, this.D, null, this.E, this.F, 0.0f, 0.0f, jVar2, 100663296, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c5.f5746a.a(this.B, this.C, this.D, null, this.E, this.F, 0.0f, 0.0f, jVar3, 100663296, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
