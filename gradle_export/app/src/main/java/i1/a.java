package i1;

import android.graphics.Color;
import p4.j;

public final class a {

    public final float f7080a;

    public final float f7081b;

    public final float f7082c;

    public final float f7083d;

    public final float f7084e;

    public final float f7085f;

    public a(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f7080a = f3;
        this.f7081b = f10;
        this.f7082c = f11;
        this.f7083d = f12;
        this.f7084e = f13;
        this.f7085f = f14;
    }

    public static a a(int i10) {
        j jVar = j.f12338k;
        float f3 = p4.a.f(Color.red(i10));
        float f10 = p4.a.f(Color.green(i10));
        float f11 = p4.a.f(Color.blue(i10));
        float[][] fArr = p4.a.f12318d;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[2] * f11) + (fArr2[1] * f10) + (fArr2[0] * f3);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[2] * f11) + (fArr3[1] * f10) + (fArr3[0] * f3);
        float[] fArr4 = fArr[2];
        float f14 = (f11 * fArr4[2]) + (f10 * fArr4[1]) + (f3 * fArr4[0]);
        float[][] fArr5 = p4.a.f12315a;
        float[] fArr6 = fArr5[0];
        float f15 = (fArr6[2] * f14) + (fArr6[1] * f13) + (fArr6[0] * f12);
        float[] fArr7 = fArr5[1];
        float f16 = (fArr7[2] * f14) + (fArr7[1] * f13) + (fArr7[0] * f12);
        float[] fArr8 = fArr5[2];
        float f17 = (f14 * fArr8[2]) + (f13 * fArr8[1]) + (f12 * fArr8[0]);
        float[] fArr9 = jVar.f12345g;
        float f18 = jVar.f12347i;
        float f19 = jVar.f12342d;
        float f20 = jVar.f12339a;
        float f21 = fArr9[0] * f15;
        float f22 = fArr9[1] * f16;
        float f23 = fArr9[2] * f17;
        float f24 = jVar.f12346h;
        float fPow = (float) Math.pow(((double) (Math.abs(f21) * f24)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f22) * f24)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f23) * f24)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f21) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f22) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f23) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f25 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d3)) / 11.0f;
        float f26 = ((float) (((double) (fSignum + fSignum2)) - (d3 * 2.0d))) / 9.0f;
        float f27 = fSignum2 * 20.0f;
        float f28 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f27)) / 20.0f;
        float f29 = (((fSignum * 40.0f) + f27) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f26, f25)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f30 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f29 * jVar.f12340b) / f20, jVar.f12348j * f19)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f31 = f20 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.f12344f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.f12343e) * jVar.f12341c) * ((float) Math.sqrt((f26 * f26) + (f25 * f25)))) / (f28 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f19) / f31);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f18 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d5 = f30;
        return new a(fAtan2, fSqrt, fPow4, f32, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    public static a b(float f3, float f10, float f11) {
        j jVar = j.f12338k;
        float f12 = jVar.f12342d;
        double d3 = ((double) f3) / 100.0d;
        Math.sqrt(d3);
        float f13 = jVar.f12339a + 4.0f;
        float f14 = jVar.f12347i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(d3))) * jVar.f12342d) / f13);
        float f15 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) f14) * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f3, f15, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    public int c(c cVar) {
        float f3 = this.f7081b;
        float f10 = this.f7082c;
        float fSqrt = (f3 == 0.0f || f10 == 0.0f) ? 0.0f : f3 / ((float) Math.sqrt(f10 / 100.0f));
        float f11 = cVar.f7096a;
        float f12 = cVar.f7103h;
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, f11), 0.73f)), 1.1111112f));
        float f13 = (this.f7080a * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f13)) + 3.8f) * 0.25f;
        float fPow2 = cVar.f7097b * ((float) Math.pow(f10 / 100.0f, (1.0f / cVar.f7100e) / cVar.f7105j));
        float f14 = fCos * 3846.1538f * cVar.f7101f * cVar.f7099d;
        float f15 = fPow2 / cVar.f7098c;
        double d3 = f13;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f16 = (((0.305f + f15) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f14 * 23.0f)));
        float f17 = fCos2 * f16;
        float f18 = f16 * fSin;
        float f19 = f15 * 460.0f;
        float f20 = ((288.0f * f18) + ((451.0f * f17) + f19)) / 1403.0f;
        float f21 = ((f19 - (891.0f * f17)) - (261.0f * f18)) / 1403.0f;
        float f22 = ((f19 - (f17 * 220.0f)) - (f18 * 6300.0f)) / 1403.0f;
        float f23 = 100.0f / f12;
        double d5 = 2.3809524f;
        float fSignum = Math.signum(f20) * f23 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f20) * 27.13f) / (400.0f - Math.abs(f20))), d5));
        float fSignum2 = Math.signum(f21) * f23 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f21) * 27.13f) / (400.0f - Math.abs(f21))), d5));
        float fSignum3 = Math.signum(f22) * f23 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f22) * 27.13f) / (400.0f - Math.abs(f22))), d5));
        float[] fArr = cVar.f7102g;
        float f24 = fSignum / fArr[0];
        float f25 = fSignum2 / fArr[1];
        float f26 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f7087b;
        float[] fArr3 = fArr2[0];
        float f27 = (fArr3[2] * f26) + (fArr3[1] * f25) + (fArr3[0] * f24);
        float[] fArr4 = fArr2[1];
        float f28 = (fArr4[2] * f26) + (fArr4[1] * f25) + (fArr4[0] * f24);
        float[] fArr5 = fArr2[2];
        return q4.a.b(f27, f28, (f26 * fArr5[2]) + (f25 * fArr5[1]) + (f24 * fArr5[0]));
    }

    public int d(j jVar) {
        float fSqrt;
        float f3 = this.f7081b;
        double d3 = f3;
        float f10 = this.f7082c;
        if (d3 != 0.0d) {
            double d5 = f10;
            if (d5 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f3 / ((float) Math.sqrt(d5 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f11 = jVar.f12344f;
        float f12 = jVar.f12346h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f11), 0.73d), 1.1111111111111112d);
        double d10 = (this.f7080a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f;
        float fPow2 = jVar.f12339a * ((float) Math.pow(((double) f10) / 100.0d, (1.0d / ((double) jVar.f12342d)) / ((double) jVar.f12348j)));
        float f13 = fCos * 3846.1538f * jVar.f12343e * jVar.f12341c;
        float f14 = fPow2 / jVar.f12340b;
        float fSin = (float) Math.sin(d10);
        float fCos2 = (float) Math.cos(d10);
        float f15 = (((0.305f + f14) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f13 * 23.0f)));
        float f16 = fCos2 * f15;
        float f17 = f15 * fSin;
        float f18 = f14 * 460.0f;
        float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
        float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
        float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
        float f22 = 100.0f / f12;
        float fSignum = Math.signum(f19) * f22 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f20) * f22 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f21) * f22 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f21)) * 27.13d) / (400.0d - ((double) Math.abs(f21)))), 2.380952380952381d));
        float[] fArr = jVar.f12345g;
        float f23 = fSignum / fArr[0];
        float f24 = fSignum2 / fArr[1];
        float f25 = fSignum3 / fArr[2];
        float[][] fArr2 = p4.a.f12316b;
        float[] fArr3 = fArr2[0];
        float f26 = (fArr3[2] * f25) + (fArr3[1] * f24) + (fArr3[0] * f23);
        float[] fArr4 = fArr2[1];
        float f27 = (fArr4[2] * f25) + (fArr4[1] * f24) + (fArr4[0] * f23);
        float[] fArr5 = fArr2[2];
        return q4.a.b(f26, f27, (f25 * fArr5[2]) + (f24 * fArr5[1]) + (f23 * fArr5[0]));
    }
}
