package c7;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

public final class q implements p {

    public final short[] f2941a;

    public short[] f2942b;

    public short[] f2943c;

    public short[] f2944d;

    public int f2945e;

    public int f2946f;

    public int f2947g;

    public final r f2948h;

    public q(r rVar) {
        this.f2948h = rVar;
        int i10 = rVar.f2956h;
        this.f2941a = new short[i10];
        int i11 = i10 * rVar.f2950b;
        this.f2942b = new short[i11];
        this.f2943c = new short[i11];
        this.f2944d = new short[i11];
    }

    @Override
    public final void a(int i10, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.f2942b;
        r rVar = this.f2948h;
        shortBufferAsShortBuffer.get(sArr, rVar.f2958j * rVar.f2950b, i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override
    public final void b(int i10, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.f2943c;
        r rVar = this.f2948h;
        shortBufferAsShortBuffer.put(sArr, 0, rVar.f2950b * i10);
        byteBuffer.position((i10 * 2 * rVar.f2950b) + byteBuffer.position());
    }

    @Override
    public final void c(int i10, long j9, long j10) {
        int i11 = 0;
        while (true) {
            r rVar = this.f2948h;
            int i12 = rVar.f2950b;
            if (i11 >= i12) {
                return;
            }
            short[] sArr = this.f2943c;
            int i13 = (rVar.f2959k * i12) + i11;
            short[] sArr2 = this.f2944d;
            int i14 = (i10 * i12) + i11;
            short s6 = sArr2[i14];
            short s10 = sArr2[i14 + i12];
            long j11 = ((long) rVar.f2960n) * j9;
            int i15 = rVar.m;
            long j12 = ((long) (i15 + 1)) * j10;
            long j13 = j12 - j11;
            long j14 = j12 - (((long) i15) * j10);
            sArr[i13] = (short) ((((j14 - j13) * ((long) s10)) + (((long) s6) * j13)) / j14);
            i11++;
        }
    }

    @Override
    public final void d(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2948h.f2950b * i11; i12++) {
            this.f2942b[i10 + i12] = 0;
        }
    }

    @Override
    public final void e(int i10, int i11) {
        short[] sArr = this.f2942b;
        r rVar = this.f2948h;
        int i12 = rVar.f2956h / i11;
        int i13 = rVar.f2950b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f2941a[i16] = (short) (i17 / i14);
        }
    }

    @Override
    public final int f(int i10, int i11, int i12) {
        return s(this.f2942b, i10, i11, i12);
    }

    @Override
    public final void flush() {
        this.f2947g = 0;
        this.f2945e = 0;
        this.f2946f = 0;
    }

    @Override
    public final void g() {
        this.f2947g = this.f2945e;
    }

    @Override
    public final Object h() {
        return this.f2942b;
    }

    @Override
    public final Object i() {
        return this.f2943c;
    }

    @Override
    public final void j(int i10) {
        this.f2943c = r(this.f2943c, this.f2948h.f2959k, i10);
    }

    @Override
    public final boolean k() {
        int i10 = this.f2945e;
        return i10 != 0 && this.f2948h.f2962p != 0 && this.f2946f <= i10 * 3 && i10 * 2 > this.f2947g * 3;
    }

    @Override
    public final Object l() {
        return this.f2944d;
    }

    @Override
    public final void m(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = this.f2943c;
        short[] sArr2 = this.f2942b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    @Override
    public final void n(int i10) {
        this.f2944d = r(this.f2944d, this.f2948h.l, i10);
    }

    @Override
    public final int o() {
        return 2;
    }

    @Override
    public final void p(int i10) {
        this.f2942b = r(this.f2942b, this.f2948h.f2958j, i10);
    }

    @Override
    public final int q(int i10, int i11) {
        return s(this.f2941a, 0, i10, i11);
    }

    public final short[] r(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f2948h.f2950b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int s(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f2948h.f2950b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f2945e = i15 / i16;
        this.f2946f = i17 / i14;
        return i16;
    }
}
