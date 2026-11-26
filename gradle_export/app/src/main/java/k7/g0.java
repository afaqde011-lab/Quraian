package k7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

public final class g0 extends c7.n {

    public int f9062n;

    public boolean f9063o;

    public int f9064p;

    public long f9065q;

    public byte[] f9067s;

    public byte[] f9070v;

    public int f9066r = 0;

    public int f9068t = 0;

    public int f9069u = 0;
    public final long l = 100000;

    public final float f9059i = 0.2f;
    public final long m = 2000000;

    public final int f9061k = 10;

    public final short f9060j = 1024;

    public g0() {
        byte[] bArr = e7.i0.f5137b;
        this.f9067s = bArr;
        this.f9070v = bArr;
    }

    @Override
    public final boolean a() {
        return super.a() && this.f9063o;
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f2931g.hasRemaining()) {
            int i10 = this.f9064p;
            short s6 = this.f9060j;
            if (i10 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f9067s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s6) {
                        int i11 = this.f9062n;
                        iPosition = a1.b.e(iLimit3, i11, i11, i11);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f9064p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                ta.c0.A(this.f9068t < this.f9067s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s6) {
                        int i12 = this.f9062n;
                        iLimit = (iPosition2 / i12) * i12;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f9068t;
                int i13 = this.f9069u;
                int length2 = length + i13;
                byte[] bArr = this.f9067s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i13 - (bArr.length - length);
                }
                int i14 = length - length2;
                boolean z10 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i14);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f9067s, length2, iMin);
                int i15 = this.f9069u + iMin;
                this.f9069u = i15;
                ta.c0.A(i15 <= this.f9067s.length);
                boolean z11 = z10 && iPosition3 < i14;
                n(z11);
                if (z11) {
                    this.f9064p = 0;
                    this.f9066r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override
    public final c7.k h(c7.k kVar) throws AudioProcessor$UnhandledAudioFormatException {
        if (kVar.f2921c == 2) {
            return kVar.f2919a == -1 ? c7.k.f2918e : kVar;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(kVar);
    }

    @Override
    public final void i() {
        if (a()) {
            c7.k kVar = this.f2926b;
            int i10 = kVar.f2920b * 2;
            this.f9062n = i10;
            int i11 = ((((int) ((this.l * ((long) kVar.f2919a)) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f9067s.length != i11) {
                this.f9067s = new byte[i11];
                this.f9070v = new byte[i11];
            }
        }
        this.f9064p = 0;
        this.f9065q = 0L;
        this.f9066r = 0;
        this.f9068t = 0;
        this.f9069u = 0;
    }

    @Override
    public final void j() {
        if (this.f9069u > 0) {
            n(true);
            this.f9066r = 0;
        }
    }

    @Override
    public final void k() {
        this.f9063o = false;
        byte[] bArr = e7.i0.f5137b;
        this.f9067s = bArr;
        this.f9070v = bArr;
    }

    public final int m(int i10) {
        int length = ((((int) ((this.m * ((long) this.f2926b.f2919a)) / 1000000)) - this.f9066r) * this.f9062n) - (this.f9067s.length / 2);
        ta.c0.A(length >= 0);
        int iMin = (int) Math.min((i10 * this.f9059i) + 0.5f, length);
        int i11 = this.f9062n;
        return (iMin / i11) * i11;
    }

    public final void n(boolean z10) {
        int length;
        int iM;
        int i10 = this.f9069u;
        byte[] bArr = this.f9067s;
        if (i10 == bArr.length || z10) {
            if (this.f9066r == 0) {
                if (z10) {
                    o(i10, 3);
                    length = i10;
                } else {
                    ta.c0.A(i10 >= bArr.length / 2);
                    length = this.f9067s.length / 2;
                    o(length, 0);
                }
                iM = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM2 = m(length2) + (this.f9067s.length / 2);
                o(iM2, 2);
                iM = iM2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iM = m(length);
                o(iM, 1);
            }
            if (!(length % this.f9062n == 0)) {
                throw new IllegalStateException(ze.d.H("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            }
            ta.c0.A(i10 >= iM);
            this.f9069u -= length;
            int i11 = this.f9068t + length;
            this.f9068t = i11;
            this.f9068t = i11 % this.f9067s.length;
            int i12 = this.f9066r;
            int i13 = this.f9062n;
            this.f9066r = (iM / i13) + i12;
            this.f9065q += (long) ((length - iM) / i13);
        }
    }

    public final void o(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        ta.c0.s(this.f9069u >= i10);
        if (i11 == 2) {
            int i12 = this.f9068t;
            int i13 = this.f9069u;
            int i14 = i12 + i13;
            byte[] bArr = this.f9067s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f9070v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f9070v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f9070v, 0, i15);
                    System.arraycopy(this.f9067s, 0, this.f9070v, i15, length);
                }
            }
        } else {
            int i16 = this.f9068t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f9067s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f9070v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f9070v, 0, length2);
                System.arraycopy(this.f9067s, 0, this.f9070v, length2, i10 - length2);
            }
        }
        ta.c0.q("sizeToOutput is not aligned to frame size: %s", i10, i10 % this.f9062n == 0);
        ta.c0.A(this.f9068t < this.f9067s.length);
        byte[] bArr3 = this.f9070v;
        ta.c0.q("byteOutput size is not aligned to frame size %s", i10, i10 % this.f9062n == 0);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f9061k;
                if (i11 == 0) {
                    i21 = ((((i18 * 1000) / (i10 - 1)) * (i21 - 100)) / 1000) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * 1000) * (100 - i21)) / (i10 - 1)) / 1000;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        l(i10).put(bArr3, 0, i10).flip();
    }
}
