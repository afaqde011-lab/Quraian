package b3;

import java.util.Arrays;

public final class r0 implements y3.c {
    public boolean A;
    public long B = 9223372034707292159L;
    public long C = 0;
    public final u0 D;

    public r0(u0 u0Var) {
        this.D = u0Var;
    }

    public final void a(z2.t tVar, float f3) {
        u0 u0Var = this.D;
        i2 i2Var = u0Var.M;
        if (i2Var == null) {
            i2Var = new i2();
            u0Var.M = i2Var;
        }
        int iJ0 = h00.n.J0(tVar, (z2.t[]) i2Var.f2045b);
        if (iJ0 >= 0) {
            float[] fArr = (float[]) i2Var.f2046c;
            if (fArr[iJ0] != f3) {
                fArr[iJ0] = f3;
                ((byte[]) i2Var.f2047d)[iJ0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) i2Var.f2047d;
                if (bArr[iJ0] == 2) {
                    bArr[iJ0] = 0;
                    return;
                }
                return;
            }
        }
        int i10 = i2Var.f2044a;
        z2.t[] tVarArr = (z2.t[]) i2Var.f2045b;
        if (i10 == tVarArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(tVarArr, i11);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            i2Var.f2045b = (z2.t[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) i2Var.f2046c, i11);
            kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
            i2Var.f2046c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) i2Var.f2047d, i11);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            i2Var.f2047d = bArrCopyOf;
        }
        ((z2.t[]) i2Var.f2045b)[i10] = tVar;
        ((byte[]) i2Var.f2047d)[i10] = 3;
        ((float[]) i2Var.f2046c)[i10] = f3;
        i2Var.f2044a++;
    }

    @Override
    public final float c() {
        return this.D.c();
    }

    @Override
    public final float t0() {
        return this.D.t0();
    }
}
