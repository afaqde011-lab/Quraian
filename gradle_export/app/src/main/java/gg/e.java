package gg;

import w.a1;
import w.b1;
import x.a0;

public final class e implements a0 {
    public float A;
    public float B;

    public e(int i10) {
        switch (i10) {
            case 4:
                this.A = Math.max(1.0E-7f, Math.abs(0.1f));
                this.B = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                break;
        }
    }

    @Override
    public float a() {
        return this.A;
    }

    public a1 b(float f3) {
        double d3 = d(f3);
        double d5 = b1.f15741a;
        double d10 = d5 - 1.0d;
        return new a1(f3, (float) (Math.exp((d5 / d10) * d3) * ((double) (this.A * this.B))), (long) (Math.exp(d3 / d10) * 1000.0d));
    }

    @Override
    public float c(float f3, long j9) {
        return f3 * ((float) Math.exp(((j9 / 1000000) / 1000.0f) * this.B));
    }

    public double d(float f3) {
        float[] fArr = w.e.f15753a;
        return Math.log(((double) (Math.abs(f3) * 0.35f)) / ((double) (this.A * this.B)));
    }

    @Override
    public float e(float f3, float f10, long j9) {
        float f11 = this.B;
        return ((f10 / f11) * ((float) Math.exp((f11 * (j9 / 1000000)) / 1000.0f))) + (f3 - (f10 / f11));
    }

    @Override
    public long h(float f3) {
        return ((long) ((((float) Math.log(this.A / Math.abs(f3))) * 1000.0f) / this.B)) * 1000000;
    }

    @Override
    public float j(float f3, float f10) {
        float fAbs = Math.abs(f10);
        float f11 = this.A;
        if (fAbs <= f11) {
            return f3;
        }
        double dLog = Math.log(Math.abs(f11 / f10));
        float f12 = this.B;
        return ((f10 / f12) * ((float) Math.exp((((double) f12) * ((dLog / ((double) f12)) * ((double) 1000))) / ((double) 1000.0f)))) + (f3 - (f10 / f12));
    }
}
