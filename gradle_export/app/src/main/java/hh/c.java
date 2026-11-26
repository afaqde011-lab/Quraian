package hh;

import ca.v;
import com.google.android.gms.internal.measurement.g4;
import java.math.RoundingMode;
import ta.c0;

public abstract class c {

    public static final int f7066a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d3) {
        if (v.C(d3)) {
            return d3 == 0.0d || 52 - Long.numberOfTrailingZeros(v.A(d3)) <= Math.getExponent(d3);
        }
        return false;
    }

    public static boolean b(double d3) {
        if (d3 > 0.0d && v.C(d3)) {
            long jA = v.A(d3);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static int c(double d3) {
        boolean zB;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z10 = false;
        c0.r("x must be positive and finite", d3 > 0.0d && v.C(d3));
        int exponent = Math.getExponent(d3);
        if (Math.getExponent(d3) < -1022) {
            return c(d3 * 4.503599627370496E15d) - 52;
        }
        switch (b.f7065a[roundingMode.ordinal()]) {
            case 1:
                g4.w(b(d3));
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z10 = !b(d3);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zB = b(d3);
                z10 &= !zB;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zB = b(d3);
                z10 &= !zB;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d3) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }
}
