package y40;

import c50.g;
import com.revenuecat.purchases.common.Constants;
import g00.s;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k50.i;
import k50.i0;
import k50.l;
import k50.y;
import kotlin.jvm.internal.m;
import r30.j;
import r30.k;
import sg.f;
import x40.b0;
import x40.p;
import x40.q;
import x40.w;

public abstract class b {
    public static final byte[] a;
    public static final p b = w00.a.B(new String[0]);
    public static final g c;
    public static final y d;
    public static final TimeZone e;
    public static final j f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        i iVar = new i();
        iVar.write(bArr, 0, 0);
        long j = 0;
        c = new g(null, j, iVar, 1);
        c(j, j, j);
        l lVar = l.D;
        d = c7.i.P(new l[]{f.H("efbbbf"), f.H("feff"), f.H("fffe"), f.H("0000ffff"), f.H("ffff0000")});
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        m.b(timeZone);
        e = timeZone;
        f = new j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = k.S0(k.R0(w.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(q qVar, q other) {
        m.e(qVar, "<this>");
        m.e(other, "other");
        return m.a(qVar.d, other.d) && qVar.e == other.e && m.a(qVar.a, other.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        m.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        m.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!m.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(int i, int i2, String str, String str2) {
        m.e(str, "<this>");
        while (i < i2) {
            if (k.B0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, char c2, int i, int i2) {
        m.e(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String h(String format, Object... objArr) {
        m.e(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        m.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                s sVarI = m.i(strArr2);
                while (sVarI.hasNext()) {
                    if (comparator.compare(str, (String) sVarI.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(b0 b0Var) {
        String strA = b0Var.F.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... elements) {
        m.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(va.a.S(Arrays.copyOf(objArr, objArr.length)));
        m.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (m.f(cCharAt, 31) <= 0 || m.f(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, String str, int i2) {
        m.e(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, String str, int i2) {
        m.e(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator comparator) {
        m.e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String name) {
        m.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset r(k50.k kVar, Charset charset) {
        m.e(kVar, "<this>");
        m.e(charset, "default");
        int iM = kVar.M(d);
        if (iM == -1) {
            return charset;
        }
        if (iM == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            m.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iM == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            m.d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iM == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            m.d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iM == 3) {
            Charset charset2 = r30.a.a;
            Charset charset3 = r30.a.c;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            m.d(charsetForName, "forName(...)");
            r30.a.c = charsetForName;
            return charsetForName;
        }
        if (iM != 4) {
            throw new AssertionError();
        }
        Charset charset4 = r30.a.a;
        Charset charset5 = r30.a.b;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        m.d(charsetForName2, "forName(...)");
        r30.a.b = charsetForName2;
        return charsetForName2;
    }

    public static final int s(k50.k kVar) {
        m.e(kVar, "<this>");
        return (kVar.readByte() & 255) | ((kVar.readByte() & 255) << 16) | ((kVar.readByte() & 255) << 8);
    }

    public static final boolean t(i0 i0Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = i0Var.c().e() ? i0Var.c().c() - jNanoTime : Long.MAX_VALUE;
        i0Var.c().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            i iVar = new i();
            while (i0Var.s(iVar, 8192L) != -1) {
                iVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                i0Var.c().a();
                return true;
            }
            i0Var.c().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                i0Var.c().a();
                return false;
            }
            i0Var.c().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                i0Var.c().a();
            } else {
                i0Var.c().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final p u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e50.a aVar = (e50.a) it.next();
            l lVar = aVar.a;
            l lVar2 = aVar.b;
            String strQ = lVar.q();
            String strQ2 = lVar2.q();
            arrayList.add(strQ);
            arrayList.add(k.j1(strQ2).toString());
        }
        return new p((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(q qVar, boolean z) {
        int i;
        m.e(qVar, "<this>");
        int i2 = qVar.e;
        String strG = qVar.d;
        if (k.A0(strG, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false)) {
            strG = oi.k.g(']', "[", strG);
        }
        if (!z) {
            String scheme = qVar.a;
            m.e(scheme, "scheme");
            if (scheme.equals("http")) {
                i = 80;
            } else {
                i = scheme.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strG;
            }
        }
        return strG + ':' + i2;
    }

    public static final List w(List list) {
        m.e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(h00.q.o1(list));
        m.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String y(int i, String str, int i2) {
        int iM = m(i, str, i2);
        String strSubstring = str.substring(iM, n(iM, str, i2));
        m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
