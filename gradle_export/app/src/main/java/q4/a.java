package q4;

import android.graphics.Color;

public abstract class a {

    public static final ThreadLocal f12753a = new ThreadLocal();

    public static void a(int i10, int i11, int i12, float[] fArr) {
        float f3;
        float fAbs;
        float f10 = i10 / 255.0f;
        float f11 = i11 / 255.0f;
        float f12 = i12 / 255.0f;
        float fMax = Math.max(f10, Math.max(f11, f12));
        float fMin = Math.min(f10, Math.min(f11, f12));
        float f13 = fMax - fMin;
        float f14 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f3 = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f10) {
                f3 = ((f11 - f12) / f13) % 6.0f;
            } else {
                f3 = fMax == f11 ? ((f12 - f10) / f13) + 2.0f : 4.0f + ((f10 - f11) / f13);
            }
            fAbs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (f3 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = f15 < 0.0f ? 0.0f : Math.min(f15, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f14 >= 0.0f ? Math.min(f14, 1.0f) : 0.0f;
    }

    public static int b(double d3, double d5, double d10) {
        double d11 = (((-0.4986d) * d10) + (((-1.5372d) * d5) + (3.2406d * d3))) / 100.0d;
        double d12 = ((0.0415d * d10) + ((1.8758d * d5) + ((-0.9689d) * d3))) / 100.0d;
        double d13 = ((1.057d * d10) + (((-0.204d) * d5) + (0.0557d * d3))) / 100.0d;
        double dPow = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        double dPow2 = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        double dPow3 = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static double c(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        if (Color.alpha(i10) < 255) {
            i10 = f(i10, i11);
        }
        double d3 = d(i10) + 0.05d;
        double d5 = d(i11) + 0.05d;
        return Math.max(d3, d5) / Math.min(d3, d5);
    }

    public static double d(int i10) {
        ThreadLocal threadLocal = f12753a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = ((double) iRed) / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d5 = ((double) iGreen) / 255.0d;
        double dPow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d10 = ((double) iBlue) / 255.0d;
        double dPow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d11 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d11;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d11 / 100.0d;
    }

    public static int e(float f3, int i10, int i11) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        double d3 = f3;
        if (c(h(i10, 255), i11) < d3) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (c(h(i10, i15), i11) < d3) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    public static int f(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i12, g(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, i12), g(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, i12), g(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, i12));
    }

    public static int g(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    public static int h(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
