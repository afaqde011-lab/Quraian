package a8;

import com.google.android.gms.cast.Cast;

public final class n0 {

    public final int f299a;

    public byte[] f300b;

    public int f301c;

    public int f302d;

    public int f303e;

    public n0() {
        this.f299a = 1;
        this.f300b = e7.i0.f5137b;
    }

    public n0(int i10, int i11) {
        this.f299a = 3;
        this.f301c = i10;
        this.f302d = i11;
        this.f300b = new byte[(i11 * 2) - 1];
        this.f303e = 0;
    }

    public n0(int i10, byte[] bArr) {
        this.f299a = 1;
        this.f300b = bArr;
        this.f303e = i10;
    }

    public n0(byte[] bArr) {
        this.f299a = 0;
        this.f300b = bArr;
        this.f301c = bArr.length;
    }

    public n0(byte[] bArr, int i10, int i11) {
        this.f299a = 2;
        this.f300b = bArr;
        this.f302d = i10;
        this.f301c = i11;
        this.f303e = 0;
        a();
    }

    public void a() {
        int i10;
        int i11;
        switch (this.f299a) {
            case 1:
                int i12 = this.f301c;
                ta.c0.A(i12 >= 0 && (i12 < (i10 = this.f303e) || (i12 == i10 && this.f302d == 0)));
                break;
            default:
                int i13 = this.f302d;
                ta.c0.A(i13 >= 0 && (i13 < (i11 = this.f301c) || (i13 == i11 && this.f303e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f303e - this.f301c) * 8) - this.f302d;
    }

    public void c() {
        if (this.f302d == 0) {
            return;
        }
        this.f302d = 0;
        this.f301c++;
        a();
    }

    public boolean d(int i10) {
        int i11 = this.f302d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f303e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f301c) {
                break;
            }
            if (r(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f301c;
        return i13 < i15 || (i13 == i15 && i14 == 0);
    }

    public boolean e() {
        int i10 = this.f302d;
        int i11 = this.f303e;
        int i12 = 0;
        while (this.f302d < this.f301c && !h()) {
            i12++;
        }
        boolean z10 = this.f302d == this.f301c;
        this.f302d = i10;
        this.f303e = i11;
        return !z10 && d((i12 * 2) + 1);
    }

    public int f() {
        ta.c0.A(this.f302d == 0);
        return this.f301c;
    }

    public int g() {
        return (this.f301c * 8) + this.f302d;
    }

    public boolean h() {
        switch (this.f299a) {
            case 0:
                boolean z10 = (((this.f300b[this.f302d] & 255) >> this.f303e) & 1) == 1;
                t(1);
                return z10;
            case 1:
                boolean z11 = (this.f300b[this.f301c] & (Cast.MAX_NAMESPACE_LENGTH >> this.f302d)) != 0;
                s();
                return z11;
            default:
                boolean z12 = (this.f300b[this.f302d] & (Cast.MAX_NAMESPACE_LENGTH >> this.f303e)) != 0;
                s();
                return z12;
        }
    }

    public int i(int i10) {
        switch (this.f299a) {
            case 0:
                int i11 = this.f302d;
                int iMin = Math.min(i10, 8 - this.f303e);
                byte[] bArr = this.f300b;
                int i12 = i11 + 1;
                int i13 = ((bArr[i11] & 255) >> this.f303e) & (255 >> (8 - iMin));
                while (iMin < i10) {
                    i13 |= (bArr[i12] & 255) << iMin;
                    iMin += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                t(i10);
                return i14;
            case 1:
                if (i10 == 0) {
                    return 0;
                }
                this.f302d += i10;
                int i15 = 0;
                while (true) {
                    int i16 = this.f302d;
                    if (i16 <= 8) {
                        byte[] bArr2 = this.f300b;
                        int i17 = this.f301c;
                        int i18 = ((-1) >>> (32 - i10)) & (i15 | ((bArr2[i17] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.f302d = 0;
                            this.f301c = i17 + 1;
                        }
                        a();
                        return i18;
                    }
                    int i19 = i16 - 8;
                    this.f302d = i19;
                    byte[] bArr3 = this.f300b;
                    int i20 = this.f301c;
                    this.f301c = i20 + 1;
                    i15 |= (bArr3[i20] & 255) << i19;
                }
                break;
            default:
                this.f303e += i10;
                int i21 = 0;
                while (true) {
                    int i22 = this.f303e;
                    int i23 = 2;
                    if (i22 <= 8) {
                        byte[] bArr4 = this.f300b;
                        int i24 = this.f302d;
                        int i25 = ((-1) >>> (32 - i10)) & (i21 | ((bArr4[i24] & 255) >> (8 - i22)));
                        if (i22 == 8) {
                            this.f303e = 0;
                            this.f302d = i24 + (r(i24 + 1) ? 2 : 1);
                        }
                        a();
                        return i25;
                    }
                    int i26 = i22 - 8;
                    this.f303e = i26;
                    byte[] bArr5 = this.f300b;
                    int i27 = this.f302d;
                    i21 |= (bArr5[i27] & 255) << i26;
                    if (!r(i27 + 1)) {
                        i23 = 1;
                    }
                    this.f302d = i27 + i23;
                }
                break;
        }
    }

    public void j(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f300b;
            int i13 = this.f301c;
            int i14 = i13 + 1;
            this.f301c = i14;
            byte b7 = bArr2[i13];
            int i15 = this.f302d;
            byte b10 = (byte) (b7 << i15);
            bArr[i12] = b10;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b10);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b11;
        int i17 = this.f302d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f300b;
            int i18 = this.f301c;
            this.f301c = i18 + 1;
            bArr[i11] = (byte) (b11 | ((bArr3[i18] & 255) << i17));
            this.f302d = i17 - 8;
        }
        int i19 = this.f302d + i16;
        this.f302d = i19;
        byte[] bArr4 = this.f300b;
        int i20 = this.f301c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f302d = 0;
            this.f301c = i20 + 1;
        }
        a();
    }

    public long k(int i10) {
        if (i10 <= 32) {
            int i11 = i(i10);
            String str = e7.i0.f5136a;
            return ((long) i11) & 4294967295L;
        }
        int i12 = i(i10 - 32);
        int i13 = i(32);
        String str2 = e7.i0.f5136a;
        return (((long) i13) & 4294967295L) | ((((long) i12) & 4294967295L) << 32);
    }

    public void l(int i10, byte[] bArr) {
        ta.c0.A(this.f302d == 0);
        System.arraycopy(this.f300b, this.f301c, bArr, 0, i10);
        this.f301c += i10;
        a();
    }

    public int m() {
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(int i10, byte[] bArr) {
        this.f300b = bArr;
        this.f301c = 0;
        this.f302d = 0;
        this.f303e = i10;
    }

    public void p(e7.u uVar) {
        o(uVar.f5184c, uVar.f5182a);
        q(uVar.f5183b * 8);
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        this.f301c = i11;
        this.f302d = i10 - (i11 * 8);
        a();
    }

    public boolean r(int i10) {
        if (2 > i10 || i10 >= this.f301c) {
            return false;
        }
        byte[] bArr = this.f300b;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void s() {
        switch (this.f299a) {
            case 1:
                int i10 = this.f302d + 1;
                this.f302d = i10;
                if (i10 == 8) {
                    this.f302d = 0;
                    this.f301c++;
                }
                a();
                break;
            default:
                int i11 = this.f303e + 1;
                this.f303e = i11;
                if (i11 == 8) {
                    this.f303e = 0;
                    int i12 = this.f302d;
                    this.f302d = i12 + (r(i12 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i10) {
        int i11;
        switch (this.f299a) {
            case 0:
                int i12 = i10 / 8;
                int i13 = this.f302d + i12;
                this.f302d = i13;
                int i14 = (i10 - (i12 * 8)) + this.f303e;
                this.f303e = i14;
                boolean z10 = true;
                if (i14 > 7) {
                    this.f302d = i13 + 1;
                    this.f303e = i14 - 8;
                }
                int i15 = this.f302d;
                if (i15 < 0 || (i15 >= (i11 = this.f301c) && (i15 != i11 || this.f303e != 0))) {
                    z10 = false;
                }
                ta.c0.A(z10);
                break;
            case 1:
                int i16 = i10 / 8;
                int i17 = this.f301c + i16;
                this.f301c = i17;
                int i18 = (i10 - (i16 * 8)) + this.f302d;
                this.f302d = i18;
                if (i18 > 7) {
                    this.f301c = i17 + 1;
                    this.f302d = i18 - 8;
                }
                a();
                break;
            default:
                int i19 = this.f302d;
                int i20 = i10 / 8;
                int i21 = i19 + i20;
                this.f302d = i21;
                int i22 = (i10 - (i20 * 8)) + this.f303e;
                this.f303e = i22;
                if (i22 > 7) {
                    this.f302d = i21 + 1;
                    this.f303e = i22 - 8;
                }
                while (true) {
                    i19++;
                    if (i19 > this.f302d) {
                        a();
                        break;
                    } else if (r(i19)) {
                        this.f302d++;
                        i19 += 2;
                    }
                }
                break;
        }
    }

    public void u(int i10) {
        ta.c0.A(this.f302d == 0);
        this.f301c += i10;
        a();
    }
}
