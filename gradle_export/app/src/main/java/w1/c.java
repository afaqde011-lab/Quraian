package w1;

import u.d0;
import u.i0;

public final class c implements d {
    public boolean B;
    public boolean C;
    public boolean A = true;
    public final i0 D = new i0();

    public final void a() {
        i0 i0Var = this.D;
        Object[] objArr = i0Var.f14858c;
        long[] jArr = i0Var.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (obj instanceof d0) {
                                d0 d0Var = (d0) obj;
                                Object[] objArr2 = d0Var.f14837a;
                                int i13 = d0Var.f14838b;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    Object obj2 = objArr2[i14];
                                }
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        i0Var.a();
    }
}
