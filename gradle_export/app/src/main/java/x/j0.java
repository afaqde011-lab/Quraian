package x;

import java.util.Arrays;

public final class j0 implements u {

    public final i0 f16304a;

    public j0(i0 i0Var) {
        this.f16304a = i0Var;
    }

    @Override
    public final y1 a(r1 r1Var) {
        int[] iArr;
        Object[] objArr;
        i0 i0Var = this.f16304a;
        u.w wVar = i0Var.f16303b;
        u.v vVar = new u.v(wVar.f14875e + 2);
        u.w wVar2 = new u.w(wVar.f14875e);
        int[] iArr2 = wVar.f14872b;
        Object[] objArr2 = wVar.f14873c;
        long[] jArr = wVar.f14871a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j9) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr2[i14];
                            h0 h0Var = (h0) objArr2[i14];
                            vVar.a(i15);
                            wVar2.i(i15, new x1((o) r1Var.f16363a.invoke(h0Var.f16291a), h0Var.f16292b));
                        }
                        j9 >>= i11;
                        i13++;
                        i11 = i11;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!wVar.a(0)) {
            int i16 = vVar.f14904b;
            if (i16 < 0) {
                v.a.d("Index must be between 0 and size");
                throw null;
            }
            vVar.b(i16 + 1);
            int[] iArr3 = vVar.f14903a;
            int i17 = vVar.f14904b;
            if (i17 != 0) {
                h00.n.p0(1, 0, i17, iArr3, iArr3);
            }
            iArr3[0] = 0;
            vVar.f14904b++;
        }
        if (!wVar.a(i0Var.f16302a)) {
            vVar.a(i0Var.f16302a);
        }
        int i18 = vVar.f14904b;
        if (i18 != 0) {
            int[] iArr4 = vVar.f14903a;
            kotlin.jvm.internal.m.e(iArr4, "<this>");
            Arrays.sort(iArr4, 0, i18);
        }
        return new y1(vVar, wVar2, i0Var.f16302a, x.f16386c);
    }
}
