package r30;

import com.google.android.gms.internal.measurement.z3;

public abstract class r extends q {
    public static boolean n0(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String o0(byte[] bArr) {
        return new String(bArr, a.a);
    }

    public static boolean p0(String str, String suffix, boolean z) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(suffix, "suffix");
        return !z ? str.endsWith(suffix) : s0(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean q0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final void r0(String str) {
        throw new NumberFormatException(oi.k.g('\'', "Invalid number format: '", str));
    }

    public static boolean s0(int i, int i2, int i3, String str, String other, boolean z) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }

    public static String t0(int i, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(oi.k.h("Count 'n' must be non-negative, but was ", i, '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.b(string);
        return string;
    }

    public static String u0(String str, char c, char c2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        String strReplace = str.replace(c, c2);
        kotlin.jvm.internal.m.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static String v0(String str, String oldValue, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(oldValue, "oldValue");
        int iG0 = k.G0(str, oldValue, 0, false);
        if (iG0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = str2.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iG0);
            sb.append(str2);
            i2 = iG0 + length;
            if (iG0 >= str.length()) {
                break;
            }
            iG0 = k.G0(str, oldValue, iG0 + i, false);
        } while (iG0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static boolean w0(int i, String str, String str2, boolean z) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return !z ? str.startsWith(str2, i) : s0(i, 0, str2.length(), str, str2, z);
    }

    public static boolean x0(String str, String prefix, boolean z) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return !z ? str.startsWith(prefix) : s0(0, 0, prefix.length(), str, prefix, z);
    }

    public static Integer y0(String str) {
        boolean z;
        int i;
        int i2;
        kotlin.jvm.internal.m.e(str, "<this>");
        z3.r(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static Long z0(String str) {
        boolean z;
        kotlin.jvm.internal.m.e(str, "<this>");
        z3.r(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / ((long) 10);
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * ((long) 10);
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
