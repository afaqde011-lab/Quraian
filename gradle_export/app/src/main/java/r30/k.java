package r30;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class k extends r {
    public static boolean A0(CharSequence charSequence, CharSequence other, boolean z) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (other instanceof String) {
            if (J0(charSequence, (String) other, 0, z, 2) >= 0) {
                return true;
            }
        } else if (H0(charSequence, other, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean B0(CharSequence charSequence, char c) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return I0(charSequence, c, 0, 2) >= 0;
    }

    public static String C0(int i, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean D0(CharSequence charSequence, char c) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence.length() > 0 && z3.x(charSequence.charAt(F0(charSequence)), c, false);
    }

    public static boolean E0(CharSequence charSequence, String str) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence instanceof String ? r.p0((String) charSequence, str, false) : Q0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int F0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int G0(CharSequence charSequence, String string, int i, boolean z) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return (z || !(charSequence instanceof String)) ? H0(charSequence, string, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int H0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        z00.c cVar;
        if (z2) {
            int iF0 = F0(charSequence);
            if (i > iF0) {
                i = iF0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            cVar = new z00.c(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            cVar = new z00.e(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = cVar.C;
        int i4 = cVar.B;
        int i5 = cVar.A;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (Q0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (r.s0(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static int I0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? K0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static int J0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return G0(charSequence, str, i, z);
    }

    public static final int K0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(h00.n.Q0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iF0 = F0(charSequence);
        if (i > iF0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (z3.x(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iF0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean L0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!z3.J(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char M0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(F0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int N0(int i, int i2, String str, String string) {
        if ((i2 & 2) != 0) {
            i = F0(str);
        }
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return str.lastIndexOf(string, i);
    }

    public static int O0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = F0(charSequence);
        }
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(h00.n.Q0(cArr), i);
        }
        int iF0 = F0(charSequence);
        if (i > iF0) {
            i = iF0;
        }
        while (-1 < i) {
            if (z3.x(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static String P0(int i, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean Q0(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!z3.x(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String R0(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (!r.x0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S0(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (!E0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder T0(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(replacement, "replacement");
        if (i2 < i) {
            throw new IndexOutOfBoundsException(g4.c.e(i2, i, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(replacement);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void U0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.f(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List V0(String str, CharSequence charSequence, int i) {
        U0(i);
        int iG0 = G0(charSequence, str, 0, false);
        if (iG0 == -1 || i == 1) {
            return va.a.R(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iG0).toString());
            length = str.length() + iG0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iG0 = G0(charSequence, str, length, false);
        } while (iG0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List W0(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return V0(str, charSequence, i2);
            }
        }
        U0(i2);
        c<z00.e> cVar = new c(charSequence, i2, new m3.a(h00.n.k0(strArr), 16));
        ArrayList arrayList = new ArrayList(h00.r.q0(new h00.p(cVar, 3), 10));
        for (z00.e range : cVar) {
            kotlin.jvm.internal.m.e(range, "range");
            arrayList.add(charSequence.subSequence(range.A, range.B + 1).toString());
        }
        return arrayList;
    }

    public static List X0(String str, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        kotlin.jvm.internal.m.e(str, "<this>");
        if (cArr.length == 1) {
            return V0(String.valueOf(cArr[0]), str, i2);
        }
        U0(i2);
        c<z00.e> cVar = new c(str, i2, new m3.a(cArr, 15));
        ArrayList arrayList = new ArrayList(h00.r.q0(new h00.p(cVar, 3), 10));
        for (z00.e range : cVar) {
            kotlin.jvm.internal.m.e(range, "range");
            arrayList.add(str.subSequence(range.A, range.B + 1).toString());
        }
        return arrayList;
    }

    public static boolean Y0(String str, char c) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return str.length() > 0 && z3.x(str.charAt(0), c, false);
    }

    public static String Z0(char c, String str, String str2) {
        int iI0 = I0(str, c, 0, 6);
        if (iI0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iI0 + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String a1(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(delimiter, "delimiter");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = J0(str, delimiter, 0, false, 6);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iJ0, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String b1(char c, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iO0 = O0(str, c, 0, 6);
        if (iO0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iO0 + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String c1(String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = N0(0, 6, missingDelimiterValue, ".");
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(1 + iN0, missingDelimiterValue.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String d1(String missingDelimiterValue, char c) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = I0(missingDelimiterValue, c, 0, 6);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iI0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String e1(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = J0(missingDelimiterValue, str, 0, false, 6);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iJ0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String f1(char c, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iO0 = O0(str, c, 0, 6);
        if (iO0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iO0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String g1(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int iN0 = N0(0, 6, str, ".");
        if (iN0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iN0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String h1(int i, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String i1(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(length - i);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence j1(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zJ = z3.J(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zJ) {
                    break;
                }
                length--;
            } else if (zJ) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String k1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.e(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = str.charAt(length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (!(i2 >= 0)) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static String l1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (!(i2 >= 0)) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }
}
