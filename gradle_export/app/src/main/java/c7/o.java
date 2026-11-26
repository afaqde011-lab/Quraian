package c7;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

public final class o implements p {

    public final float[] f2933a;

    public float[] f2934b;

    public float[] f2935c;

    public float[] f2936d;

    public double f2937e;

    public double f2938f;

    public double f2939g;

    public final r f2940h;

    public o(r rVar) {
        this.f2940h = rVar;
        int i10 = rVar.f2956h;
        this.f2933a = new float[i10];
        int i11 = i10 * rVar.f2950b;
        this.f2934b = new float[i11];
        this.f2935c = new float[i11];
        this.f2936d = new float[i11];
    }

    @Override
    public final void a(int i10, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f2934b;
        r rVar = this.f2940h;
        floatBufferAsFloatBuffer.get(fArr, rVar.f2958j * rVar.f2950b, i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override
    public final void b(int i10, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f2935c;
        r rVar = this.f2940h;
        floatBufferAsFloatBuffer.put(fArr, 0, rVar.f2950b * i10);
        byteBuffer.position((i10 * 4 * rVar.f2950b) + byteBuffer.position());
    }

    @Override
    public final void c(int i10, long j9, long j10) {
        int i11 = 0;
        while (true) {
            r rVar = this.f2940h;
            int i12 = rVar.f2950b;
            if (i11 >= i12) {
                return;
            }
            float[] fArr = this.f2935c;
            int i13 = (rVar.f2959k * i12) + i11;
            float[] fArr2 = this.f2936d;
            int i14 = (i10 * i12) + i11;
            float f3 = fArr2[i14];
            float f10 = fArr2[i14 + i12];
            long j11 = ((long) rVar.f2960n) * j9;
            int i15 = rVar.m;
            long j12 = ((long) (i15 + 1)) * j10;
            long j13 = j12 - j11;
            long j14 = j12 - (((long) i15) * j10);
            fArr[i13] = (((j14 - j13) * f10) + (j13 * f3)) / j14;
            i11++;
        }
    }

    @Override
    public final void d(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2940h.f2950b * i11; i12++) {
            this.f2934b[i10 + i12] = 0.0f;
        }
    }

    @Override
    public final void e(int i10, int i11) {
        r rVar = this.f2940h;
        int i12 = rVar.f2956h / i11;
        int i13 = rVar.f2950b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            double d3 = 0.0d;
            for (int i17 = 0; i17 < i14; i17++) {
                d3 += (double) this.f2934b[(i16 * i14) + i15 + i17];
            }
            this.f2933a[i16] = (float) (d3 / ((double) i14));
        }
    }

    @Override
    public final int f(int i10, int i11, int i12) {
        return s(i10, i11, i12, this.f2934b);
    }

    @Override
    public final void flush() {
        this.f2939g = 0.0d;
        this.f2937e = 0.0d;
        this.f2938f = 0.0d;
    }

    @Override
    public final void g() {
        this.f2939g = this.f2937e;
    }

    @Override
    public final Object h() {
        return this.f2934b;
    }

    @Override
    public final Object i() {
        return this.f2935c;
    }

    @Override
    public final void j(int i10) {
        this.f2935c = r(this.f2940h.f2959k, i10, this.f2935c);
    }

    @Override
    public final boolean k() {
        double d3 = this.f2937e;
        return d3 != 0.0d && this.f2940h.f2962p != 0 && this.f2938f <= d3 * 3.0d && d3 * 2.0d > this.f2939g * 3.0d;
    }

    @Override
    public final Object l() {
        return this.f2936d;
    }

    @Override
    public final void m(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.f2935c;
        float[] fArr2 = this.f2934b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                fArr[i16] = ((fArr2[i17] * i19) + (fArr2[i18] * (i10 - i19))) / i10;
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    @Override
    public final void n(int i10) {
        this.f2936d = r(this.f2940h.l, i10, this.f2936d);
    }

    @Override
    public final int o() {
        return 4;
    }

    @Override
    public final void p(int i10) {
        this.f2934b = r(this.f2940h.f2958j, i10, this.f2934b);
    }

    @Override
    public final int q(int i10, int i11) {
        return s(0, i10, i11, this.f2933a);
    }

    public final float[] r(int i10, int i11, float[] fArr) {
        int length = fArr.length;
        int i12 = this.f2940h.f2950b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? fArr : Arrays.copyOf(fArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int s(int i10, int i11, int i12, float[] fArr) {
        int i13 = this.f2940h.f2950b * i10;
        double d3 = 1.0d;
        int i14 = 0;
        double d5 = 0.0d;
        int i15 = 255;
        int i16 = i11;
        while (i16 <= i12) {
            double dAbs = 0.0d;
            for (int i17 = 0; i17 < i16; i17++) {
                dAbs += (double) Math.abs(fArr[i13 + i17] - fArr[(i13 + i16) + i17]);
            }
            int i18 = i13;
            double d10 = i16;
            if (((double) i14) * dAbs < d3 * d10) {
                i14 = i16;
                d3 = dAbs;
            }
            if (((double) i15) * dAbs > d10 * d5) {
                i15 = i16;
                d5 = dAbs;
            }
            i16++;
            i13 = i18;
        }
        this.f2937e = d3 / ((double) i14);
        this.f2938f = d5 / ((double) i15);
        return i14;
    }
}
