package c50;

import h00.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k50.l;
import kotlin.jvm.internal.m;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import r30.k;
import r30.r;
import ri.t1;
import x40.b0;
import x40.p;
import x40.q;

public abstract class e {
    static {
        l lVar = l.D;
        sg.f.I("\"\\");
        sg.f.I("\t ,=");
    }

    public static final boolean a(b0 b0Var) {
        if (m.a((String) b0Var.A.B, "HEAD")) {
            return false;
        }
        int i = b0Var.D;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && y40.b.j(b0Var) == -1 && !"chunked".equalsIgnoreCase(b0.a("Transfer-Encoding", b0Var))) ? false : true;
    }

    public static final void b(x40.m mVar, q url, p headers) {
        List list;
        int i;
        x40.l lVar;
        long j;
        m.e(mVar, "<this>");
        m.e(url, "url");
        m.e(headers, "headers");
        if (mVar == x40.m.a) {
            return;
        }
        Pattern pattern = x40.l.j;
        int size = headers.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.c(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.h(i3));
            }
        }
        List listUnmodifiableList = x.A;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            m.d(listUnmodifiableList2, "{\n      Collections.unmodifiableList(result)\n    }");
            list = listUnmodifiableList2;
        } else {
            list = listUnmodifiableList;
        }
        int size2 = list.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size2) {
            String setCookie = (String) list.get(i4);
            m.e(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = y40.b.a;
            char c = ';';
            int iG = y40.b.g(setCookie, ';', i2, setCookie.length());
            char c2 = '=';
            int iG2 = y40.b.g(setCookie, '=', i2, iG);
            if (iG2 == iG) {
                i = i2;
                lVar = null;
                break;
            }
            String strY = y40.b.y(i2, setCookie, iG2);
            if (strY.length() == 0 || y40.b.l(strY) != -1) {
                i = i2;
                lVar = null;
                break;
            }
            String strY2 = y40.b.y(iG2 + 1, setCookie, iG);
            if (y40.b.l(strY2) != -1) {
                i = i2;
            } else {
                int i5 = iG + 1;
                int length = setCookie.length();
                int i6 = i2;
                int i7 = i6;
                int i8 = i7;
                long j2 = -1;
                long jG = 253402300799999L;
                String str = null;
                String str2 = null;
                boolean z = true;
                while (true) {
                    if (i5 < length) {
                        int iG3 = y40.b.g(setCookie, c, i5, length);
                        int iG4 = y40.b.g(setCookie, c2, i5, iG3);
                        String strY3 = y40.b.y(i5, setCookie, iG4);
                        String strY4 = iG4 < iG3 ? y40.b.y(iG4 + 1, setCookie, iG3) : "";
                        if (strY3.equalsIgnoreCase("expires")) {
                            try {
                                jG = t1.G(strY4.length(), strY4);
                                i7 = 1;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strY3.equalsIgnoreCase("max-age")) {
                            try {
                                long j3 = Long.parseLong(strY4);
                                j2 = j3 <= 0 ? Long.MIN_VALUE : j3;
                            } catch (NumberFormatException e) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                m.d(patternCompile, "compile(...)");
                                if (!patternCompile.matcher(strY4).matches()) {
                                    throw e;
                                }
                                j2 = r.x0(strY4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            i7 = 1;
                        } else if (strY3.equalsIgnoreCase("domain")) {
                            if (r.p0(strY4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strP = t1.P(k.R0(strY4, "."));
                            if (strP == null) {
                                throw new IllegalArgumentException();
                            }
                            str2 = strP;
                            z = false;
                        } else if (strY3.equalsIgnoreCase("path")) {
                            str = strY4;
                        } else if (strY3.equalsIgnoreCase("secure")) {
                            i8 = 1;
                        } else if (strY3.equalsIgnoreCase("httponly")) {
                            i6 = 1;
                        }
                        i5 = iG3 + 1;
                        c = ';';
                        c2 = '=';
                    } else {
                        if (j2 == Long.MIN_VALUE) {
                            j = Long.MIN_VALUE;
                        } else if (j2 != -1) {
                            long j4 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                            j = (j4 < jCurrentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                        } else {
                            j = jG;
                        }
                        String str3 = url.d;
                        if (str2 == null) {
                            str2 = str3;
                        } else {
                            if (m.a(str3, str2) || (r.p0(str3, str2, false) && str3.charAt((str3.length() - str2.length()) - 1) == '.' && !y40.b.f.b(str3))) {
                            }
                            i = 0;
                        }
                        if (str3.length() == str2.length() || PublicSuffixDatabase.g.a(str2) != null) {
                            String strSubstring = "/";
                            i = 0;
                            if (str == null || !r.x0(str, "/", false)) {
                                String strB = url.b();
                                int iO0 = k.O0(strB, '/', 0, 6);
                                if (iO0 != 0) {
                                    strSubstring = strB.substring(0, iO0);
                                    m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                str = strSubstring;
                            }
                            lVar = new x40.l(strY, strY2, j, str2, str, i8, i6, i7, z);
                            break;
                        }
                        i = 0;
                    }
                }
            }
            lVar = null;
            break;
            if (lVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(lVar);
            }
            i4++;
            i2 = i;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            m.d(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        listUnmodifiableList.isEmpty();
    }
}
