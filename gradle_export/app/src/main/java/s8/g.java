package s8;

import a8.r;

public final class g {

    public static final long[] f13901d = {128, 64, 32, 16, 8, 4, 2, 1};

    public final byte[] f13902a = new byte[8];

    public int f13903b;

    public int f13904c;

    public static long a(int i10, boolean z10, byte[] bArr) {
        long j9 = ((long) bArr[0]) & 255;
        if (z10) {
            j9 &= ~f13901d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j9 = (j9 << 8) | (((long) bArr[i11]) & 255);
        }
        return j9;
    }

    public final long b(r rVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f13903b;
        byte[] bArr = this.f13902a;
        if (i12 == 0) {
            if (!rVar.d(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((f13901d[i14] & ((long) i13)) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f13904c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f13903b = 1;
        }
        int i15 = this.f13904c;
        if (i15 > i10) {
            this.f13903b = 0;
            return -2L;
        }
        if (i15 != 1) {
            rVar.readFully(bArr, 1, i15 - 1);
        }
        this.f13903b = 0;
        return a(this.f13904c, z11, bArr);
    }
}
