package j50;

import h00.x;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.m;
import oi.k;
import r30.r;
import ri.t1;

public final class c implements HostnameVerifier {
    public static final c a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && m.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return x.A;
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(g4.c.i("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbQ = k.q("endIndex > string.length: ", length2, " > ");
            sbQ.append(str.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    public static boolean c(String host, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        m.e(host, "host");
        byte[] bArr = y40.b.a;
        if (y40.b.f.b(host)) {
            String strP = t1.P(host);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (m.a(strP, t1.P((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale US = Locale.US;
            m.d(US, "US");
            host = host.toLowerCase(US);
            m.d(host, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                if (host.length() == 0 || r.x0(host, ".", false) || r.p0(host, "..", false) || lowerCase == null || lowerCase.length() == 0 || r.x0(lowerCase, ".", false) || r.p0(lowerCase, "..", false)) {
                    zA = false;
                } else {
                    String strConcat = !r.p0(host, ".", false) ? host.concat(".") : host;
                    if (!r.p0(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (b(lowerCase)) {
                        Locale US2 = Locale.US;
                        m.d(US2, "US");
                        lowerCase = lowerCase.toLowerCase(US2);
                        m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!r30.k.A0(lowerCase, "*", false)) {
                        zA = m.a(strConcat, lowerCase);
                    } else if (!r.x0(lowerCase, "*.", false) || r30.k.I0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zA = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (r.p0(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || r30.k.O0(strConcat, '.', length - 1, 4) == -1)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean verify(String host, SSLSession session) {
        m.e(host, "host");
        m.e(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
