package x40;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class m {
    public static final m a = new m();
    public static final m b = new m();

    public static final j a(m mVar, String str) {
        j jVar = new j(str);
        j.d.put(str, jVar);
        return jVar;
    }

    public static String b(int i, String str, int i2, int i3, String str2) throws EOFException {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        kotlin.jvm.internal.m.e(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            int i6 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || r30.k.B0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !d(iCharCount, str, length)))) || (iCodePointAt == 43 && z3)))) {
                k50.i iVar = new k50.i();
                iVar.v0(i4, str, iCharCount);
                k50.i iVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            iVar.w0(z ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || r30.k.B0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !d(iCharCount, str, length)))))) {
                            if (iVar2 == null) {
                                iVar2 = new k50.i();
                            }
                            iVar2.x0(iCodePointAt2);
                            while (!iVar2.A()) {
                                byte b2 = iVar2.readByte();
                                iVar.q0(37);
                                char[] cArr = q.k;
                                iVar.q0(cArr[((b2 & 255) >> 4) & 15]);
                                iVar.q0(cArr[b2 & 15]);
                            }
                        } else {
                            iVar.x0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                    i6 = 32;
                }
                return iVar.b0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i4, length);
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(int i, String str, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && y40.b.q(str.charAt(i + 1)) != -1 && y40.b.q(str.charAt(i3)) != -1;
    }

    public static String e(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        kotlin.jvm.internal.m.e(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                k50.i iVar = new k50.i();
                iVar.v0(i, str, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iQ = y40.b.q(str.charAt(iCharCount + 1));
                        int iQ2 = y40.b.q(str.charAt(i4));
                        if (iQ == -1 || iQ2 == -1) {
                            iVar.x0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            iVar.q0((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        iVar.q0(32);
                        iCharCount++;
                    } else {
                        iVar.x0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return iVar.b0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iI0 = r30.k.I0(str, '&', i, 4);
            if (iI0 == -1) {
                iI0 = str.length();
            }
            int iI1 = r30.k.I0(str, '=', i, 4);
            if (iI1 == -1 || iI1 > iI0) {
                String strSubstring = str.substring(i, iI0);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iI1);
                kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iI1 + 1, iI0);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iI0 + 1;
        }
        return arrayList;
    }

    public static void g(StringBuilder sb, List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        z00.c cVarE0 = ab.a0.E0(2, ab.a0.I0(0, list.size()));
        int i = cVarE0.A;
        int i2 = cVarE0.B;
        int i3 = cVarE0.C;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public synchronized j c(String javaName) {
        j jVar;
        String strConcat;
        try {
            kotlin.jvm.internal.m.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = j.d;
            jVar = (j) linkedHashMap.get(javaName);
            if (jVar == null) {
                if (r30.r.x0(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (r30.r.x0(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                jVar = (j) linkedHashMap.get(strConcat);
                if (jVar == null) {
                    jVar = new j(javaName);
                }
                linkedHashMap.put(javaName, jVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jVar;
    }
}
