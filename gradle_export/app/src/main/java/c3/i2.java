package c3;

public final class i2 extends androidx.lifecycle.a1 {

    public final u.w f2682c;

    public i2() {
        u.w wVar = u.m.f14876a;
        this.f2682c = new u.w();
    }

    @Override
    public final void g() {
        u.w wVar = this.f2682c;
        int[] iArr = wVar.f14872b;
        Object[] objArr = wVar.f14873c;
        long[] jArr = wVar.f14871a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        int i14 = iArr[i13];
                        u.d0 d0Var = (u.d0) objArr[i13];
                        Object[] objArr2 = d0Var.f14837a;
                        int i15 = d0Var.f14838b;
                        for (int i16 = 0; i16 < i15; i16++) {
                            h2 h2Var = (h2) objArr2[i16];
                            l1.d dVar = h2Var.f2678d;
                            if (dVar != null) {
                                dVar.cancel();
                            }
                            h2Var.f2678d = null;
                            w1.c cVar = (w1.c) h2Var.f2675a.B;
                            cVar.B = true;
                            cVar.A = false;
                            cVar.a();
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
