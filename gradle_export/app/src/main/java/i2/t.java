package i2;

public final class t {

    public static final long f7162b = b0.d(4278190080L);

    public static final long f7163c;

    public static final long f7164d;

    public static final long f7165e;

    public static final long f7166f;

    public static final long f7167g;

    public static final int f7168h = 0;

    public final long f7169a;

    static {
        b0.d(4282664004L);
        b0.d(4287137928L);
        b0.d(4291611852L);
        f7163c = b0.d(4294967295L);
        f7164d = b0.d(4294901760L);
        b0.d(4278255360L);
        f7165e = b0.d(4278190335L);
        b0.d(4294967040L);
        b0.d(4278255615L);
        b0.d(4294902015L);
        f7166f = b0.c(0);
        f7167g = b0.b(0.0f, 0.0f, 0.0f, 0.0f, j2.d.f7881u);
    }

    public t(long j9) {
        this.f7169a = j9;
    }

    public static final long a(long j9, j2.c cVar) {
        j2.g gVarE;
        j2.c cVarF = f(j9);
        int i10 = cVarF.f7862c;
        int i11 = cVar.f7862c;
        if ((i10 | i11) < 0) {
            gVarE = j2.j.e(cVarF, cVar);
        } else {
            u.w wVar = j2.h.f7893a;
            int i12 = i10 | (i11 << 6);
            Object objB = wVar.b(i12);
            if (objB == null) {
                objB = j2.j.e(cVarF, cVar);
                wVar.i(i12, objB);
            }
            gVarE = (j2.g) objB;
        }
        return gVarE.a(j9);
    }

    public static long b(float f3, long j9) {
        return b0.b(h(j9), g(j9), e(j9), f3, f(j9));
    }

    public static final boolean c(long j9, long j10) {
        return j9 == j10;
    }

    public static final float d(long j9) {
        float fL;
        float f3;
        if ((63 & j9) == 0) {
            fL = (float) w00.a.L((j9 >>> 56) & 255);
            f3 = 255.0f;
        } else {
            fL = (float) w00.a.L((j9 >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return fL / f3;
    }

    public static final float e(long j9) {
        int i10;
        int i11;
        int i12;
        if ((63 & j9) == 0) {
            return ((float) w00.a.L((j9 >>> 32) & 255)) / 255.0f;
        }
        short s6 = (short) ((j9 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & s6;
        int i14 = ((65535 & s6) >>> 10) & 31;
        int i15 = s6 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f7178a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final j2.c f(long j9) {
        float[] fArr = j2.d.f7863a;
        return j2.d.f7885y[(int) (j9 & 63)];
    }

    public static final float g(long j9) {
        int i10;
        int i11;
        int i12;
        if ((63 & j9) == 0) {
            return ((float) w00.a.L((j9 >>> 40) & 255)) / 255.0f;
        }
        short s6 = (short) ((j9 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & s6;
        int i14 = ((65535 & s6) >>> 10) & 31;
        int i15 = s6 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f7178a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j9) {
        int i10;
        int i11;
        int i12;
        if ((63 & j9) == 0) {
            return ((float) w00.a.L((j9 >>> 48) & 255)) / 255.0f;
        }
        short s6 = (short) ((j9 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & s6;
        int i14 = ((65535 & s6) >>> 10) & 31;
        int i15 = s6 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f7178a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j9) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j9));
        sb2.append(", ");
        sb2.append(g(j9));
        sb2.append(", ");
        sb2.append(e(j9));
        sb2.append(", ");
        sb2.append(d(j9));
        sb2.append(", ");
        return g4.c.k(sb2, f(j9).f7860a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f7169a == ((t) obj).f7169a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7169a);
    }

    public final String toString() {
        return i(this.f7169a);
    }
}
