package b9;

import android.graphics.Color;
import com.google.android.gms.internal.measurement.x5;
import ta.c0;

public final class e {

    public final String f2220a;

    public final int f2221b;

    public final Integer f2222c;

    public final Integer f2223d;

    public final float f2224e;

    public final boolean f2225f;

    public final boolean f2226g;

    public final boolean f2227h;

    public final boolean f2228i;

    public final int f2229j;

    public e(String str, int i10, Integer num, Integer num2, float f3, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f2220a = str;
        this.f2221b = i10;
        this.f2222c = num;
        this.f2223d = num2;
        this.f2224e = f3;
        this.f2225f = z10;
        this.f2226g = z11;
        this.f2227h = z12;
        this.f2228i = z13;
        this.f2229j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        x5.x("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e3) {
            e7.a.n("SsaStyle", "Failed to parse boolean value: '" + str + "'", e3);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j9 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            c0.s(j9 <= 4294967295L);
            return Integer.valueOf(Color.argb(bi.b.s(((j9 >> 24) & 255) ^ 255), bi.b.s(j9 & 255), bi.b.s((j9 >> 8) & 255), bi.b.s((j9 >> 16) & 255)));
        } catch (IllegalArgumentException e3) {
            e7.a.n("SsaStyle", "Failed to parse color expression: '" + str + "'", e3);
            return null;
        }
    }
}
