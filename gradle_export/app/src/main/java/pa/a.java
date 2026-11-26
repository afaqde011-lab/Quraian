package pa;

import a10.h0;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.m;
import r30.k;

public final class a implements ma.a {
    public final na.a A;

    public a(na.a aVar) {
        m.e(aVar, "db");
        this.A = aVar;
    }

    @Override
    public final void close() throws IOException {
        this.A.close();
    }

    @Override
    public final boolean g() {
        return this.A.g();
    }

    @Override
    public final ma.c k0(String str) {
        String strSubstring;
        c cVar;
        int i10;
        m.e(str, "sql");
        na.a aVar = this.A;
        b bVar = null;
        if (!aVar.isOpen()) {
            h0.M(21, "connection is closed");
            throw null;
        }
        String upperCase = k.j1(str).toString().toUpperCase(Locale.ROOT);
        m.d(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i11 = -1;
        if (length >= 0) {
            int iI0 = 0;
            loop0: while (iI0 < length) {
                char cCharAt = upperCase.charAt(iI0);
                if (m.f(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iI1 = iI0 + 1;
                            if (upperCase.charAt(iI1) == '*') {
                                do {
                                    iI1 = k.I0(upperCase, '*', iI1 + 1, 4);
                                    if (iI1 < 0) {
                                        break loop0;
                                    }
                                    i10 = iI1 + 1;
                                    if (i10 >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i10) != '/');
                                iI0 = iI1 + 2;
                            }
                        }
                        i11 = iI0;
                        break;
                    }
                    if (upperCase.charAt(iI0 + 1) != '-') {
                        i11 = iI0;
                        break;
                    }
                    iI0 = k.I0(upperCase, '\n', iI0 + 2, 4);
                    if (iI0 < 0) {
                        break;
                    }
                }
                iI0++;
            }
        }
        if (i11 < 0 || i11 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i11, Math.min(i11 + 3, upperCase.length()));
            m.d(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new d(aVar, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    cVar = null;
                } else if (!k.A0(upperCase, "EXCLUSIVE", false)) {
                    cVar = !k.A0(upperCase, "IMMEDIATE", false) ? c.E : c.D;
                } else {
                    cVar = c.C;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    cVar = null;
                } else {
                    cVar = c.A;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    cVar = null;
                } else {
                    cVar = c.A;
                }
                break;
            case 81327:
                cVar = (!strSubstring.equals("ROL") || k.A0(upperCase, " TO ", false)) ? null : c.B;
                break;
            default:
                cVar = null;
                break;
        }
        if (cVar != null) {
            return new d(aVar, str, cVar);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            if (k.A0(k.a1(lowerCase, "journal_mode", RuntimeVersion.SUFFIX), "=", false)) {
                bVar = b.f12473a;
            }
        }
        if (bVar != null) {
            return new d(aVar, str, new e(aVar, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new d(aVar, str) : new e(aVar, str);
    }
}
