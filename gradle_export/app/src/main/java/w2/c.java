package w2;

import kh.n;
import kotlin.NoWhenBranchMatchedException;

public final class c {

    public final boolean f15833a;

    public final b f15834b;

    public final int f15835c;

    public final a[] f15836d;

    public int f15837e;

    public final float[] f15838f;

    public final float[] f15839g;

    public final float[] f15840h;

    public c() {
        this(false, b.A);
    }

    public c(int i10) {
        this(true, b.B);
    }

    public c(boolean z10, b bVar) throws NoWhenBranchMatchedException {
        int i10;
        this.f15833a = z10;
        this.f15834b = bVar;
        if (z10 && bVar.equals(b.A)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            i10 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 2;
        }
        this.f15835c = i10;
        this.f15836d = new a[20];
        this.f15838f = new float[20];
        this.f15839g = new float[20];
        this.f15840h = new float[3];
    }

    public final void a(float f3, long j9) {
        int i10 = (this.f15837e + 1) % 20;
        this.f15837e = i10;
        a[] aVarArr = this.f15836d;
        a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f15831a = j9;
            aVar.f15832b = f3;
        } else {
            a aVar2 = new a();
            aVar2.f15831a = j9;
            aVar2.f15832b = f3;
            aVarArr[i10] = aVar2;
        }
    }

    public final float b(float f3) throws NoWhenBranchMatchedException {
        b bVar;
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z10;
        int i10;
        float f11;
        float fSignum;
        float f12 = 0.0f;
        if (f3 <= 0.0f) {
            y2.a.c("maximumVelocity should be a positive value. You specified=" + f3);
        }
        int i11 = this.f15837e;
        a[] aVarArr = this.f15836d;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            int i12 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i11];
                boolean z11 = this.f15833a;
                bVar = this.f15834b;
                fArr = this.f15838f;
                fArr2 = this.f15839g;
                if (aVar3 == null) {
                    f10 = f12;
                    z10 = z11;
                    i10 = 1;
                    break;
                }
                long j9 = aVar.f15831a;
                f10 = f12;
                int i13 = i11;
                long j10 = aVar3.f15831a;
                float f13 = j9 - j10;
                z10 = z11;
                i10 = 1;
                float fAbs = Math.abs(j10 - aVar2.f15831a);
                aVar2 = (bVar == b.A || z10) ? aVar3 : aVar;
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar3.f15832b;
                fArr2[i12] = -f13;
                i11 = (i13 == 0 ? 20 : i13) - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f12 = f10;
            }
            if (i12 >= this.f15835c) {
                int iOrdinal = bVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f15840h;
                        n.U(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f10;
                    }
                } else {
                    if (iOrdinal != i10) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i14 = i12 - i10;
                    float f14 = fArr2[i14];
                    int i15 = i14;
                    float fAbs2 = f10;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        float f15 = fArr2[i16];
                        if (f14 != f15) {
                            float f16 = (z10 ? -fArr[i16] : fArr[i15] - fArr[i16]) / (f14 - f15);
                            fAbs2 += Math.abs(f16) * (f16 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i15 == i14) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i15--;
                        f14 = f15;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f11 = fSignum * 1000;
            } else {
                f11 = f10;
            }
        }
        if (f11 == f10 || Float.isNaN(f11)) {
            return f10;
        }
        if (f11 <= f10) {
            float f17 = -f3;
            if (f11 < f17) {
                return f17;
            }
        } else if (f11 > f3) {
            f11 = f3;
        }
        return f11;
    }
}
