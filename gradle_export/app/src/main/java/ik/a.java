package ik;

import com.google.android.gms.internal.measurement.x5;
import com.google.gson.stream.MalformedJsonException;
import g4.c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import oi.k;
import sg.f;

public class a implements Closeable {
    public final Reader A;
    public long H;
    public int I;
    public String J;
    public int[] K;
    public String[] M;
    public int[] N;
    public int O = 2;
    public final char[] B = new char[1024];
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int L = 1;

    static {
        f.A = new f();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.K = iArr;
        iArr[0] = 6;
        this.M = new String[32];
        this.N = new int[32];
        this.A = reader;
    }

    public final boolean A(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.F;
        int i14 = this.C;
        this.F = i13 - i14;
        int i15 = this.D;
        char[] cArr = this.B;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.D = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.D = 0;
        }
        this.C = 0;
        do {
            int i17 = this.D;
            int i18 = this.A.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.D + i18;
            this.D = i11;
            if (this.E == 0 && (i12 = this.F) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.C++;
                this.F = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final void A0(String str) throws MalformedJsonException {
        StringBuilder sbQ = x5.q(str);
        sbQ.append(O());
        sbQ.append("\nSee ");
        sbQ.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbQ.toString());
    }

    public final IllegalStateException B0(String str) {
        String str2 = t0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbN = c.n("Expected ", str, " but was ");
        sbN.append(c.t(t0()));
        sbN.append(O());
        sbN.append("\nSee ");
        sbN.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbN.toString());
    }

    public final String F(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.L;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.K[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.N[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.M[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(c.f(i12, "Unknown scope value: "));
            }
            i10++;
        }
    }

    public final boolean G() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        return (iR == 2 || iR == 4 || iR == 17) ? false : true;
    }

    public final boolean I(char c10) throws MalformedJsonException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        l();
        return false;
    }

    public final String O() {
        StringBuilder sbP = k.p(this.E + 1, (this.C - this.F) + 1, " at line ", " column ", " path ");
        sbP.append(F(false));
        return sbP.toString();
    }

    public final boolean S() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 5) {
            this.G = 0;
            int[] iArr = this.N;
            int i10 = this.L - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iR != 6) {
            throw B0("a boolean");
        }
        this.G = 0;
        int[] iArr2 = this.N;
        int i11 = this.L - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double Z() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.G = 0;
            int[] iArr = this.N;
            int i10 = this.L - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.H;
        }
        if (iR == 16) {
            this.J = new String(this.B, this.C, this.I);
            this.C += this.I;
        } else if (iR == 8 || iR == 9) {
            this.J = q0(iR == 8 ? '\'' : '\"');
        } else if (iR == 10) {
            this.J = s0();
        } else if (iR != 11) {
            throw B0("a double");
        }
        this.G = 11;
        double d3 = Double.parseDouble(this.J);
        if (this.O != 1 && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            A0("JSON forbids NaN and infinities: " + d3);
            throw null;
        }
        this.J = null;
        this.G = 0;
        int[] iArr2 = this.N;
        int i11 = this.L - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d3;
    }

    public final void a() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 3) {
            throw B0("BEGIN_ARRAY");
        }
        u0(1);
        this.N[this.L - 1] = 0;
        this.G = 0;
    }

    public final int b0() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            long j9 = this.H;
            int i10 = (int) j9;
            if (j9 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.H + O());
            }
            this.G = 0;
            int[] iArr = this.N;
            int i11 = this.L - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iR == 16) {
            this.J = new String(this.B, this.C, this.I);
            this.C += this.I;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw B0("an int");
            }
            if (iR == 10) {
                this.J = s0();
            } else {
                this.J = q0(iR == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.J);
                this.G = 0;
                int[] iArr2 = this.N;
                int i13 = this.L - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.G = 11;
        double d3 = Double.parseDouble(this.J);
        int i14 = (int) d3;
        if (i14 != d3) {
            throw new NumberFormatException("Expected an int but was " + this.J + O());
        }
        this.J = null;
        this.G = 0;
        int[] iArr3 = this.N;
        int i15 = this.L - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    @Override
    public final void close() throws IOException {
        this.G = 0;
        this.K[0] = 8;
        this.L = 1;
        this.A.close();
    }

    public final long f0() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.G = 0;
            int[] iArr = this.N;
            int i10 = this.L - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.H;
        }
        if (iR == 16) {
            this.J = new String(this.B, this.C, this.I);
            this.C += this.I;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw B0("a long");
            }
            if (iR == 10) {
                this.J = s0();
            } else {
                this.J = q0(iR == 8 ? '\'' : '\"');
            }
            try {
                long j9 = Long.parseLong(this.J);
                this.G = 0;
                int[] iArr2 = this.N;
                int i11 = this.L - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j9;
            } catch (NumberFormatException unused) {
            }
        }
        this.G = 11;
        double d3 = Double.parseDouble(this.J);
        long j10 = (long) d3;
        if (j10 != d3) {
            throw new NumberFormatException("Expected a long but was " + this.J + O());
        }
        this.J = null;
        this.G = 0;
        int[] iArr3 = this.N;
        int i12 = this.L - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j10;
    }

    public final void i() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 1) {
            throw B0("BEGIN_OBJECT");
        }
        u0(3);
        this.G = 0;
    }

    public final void l() throws MalformedJsonException {
        if (this.O == 1) {
            return;
        }
        A0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final String n0() throws IOException {
        String strQ0;
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 14) {
            strQ0 = s0();
        } else if (iR == 12) {
            strQ0 = q0('\'');
        } else {
            if (iR != 13) {
                throw B0("a name");
            }
            strQ0 = q0('\"');
        }
        this.G = 0;
        this.M[this.L - 1] = strQ0;
        return strQ0;
    }

    public final int o0(boolean z10) throws IOException {
        int i10 = this.C;
        int i11 = this.D;
        while (true) {
            if (i10 == i11) {
                this.C = i10;
                if (!A(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + O());
                }
                i10 = this.C;
                i11 = this.D;
            }
            int i12 = i10 + 1;
            char[] cArr = this.B;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.E++;
                this.F = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.C = i12;
                    if (i12 == i11) {
                        this.C = i10;
                        boolean zA = A(2);
                        this.C++;
                        if (!zA) {
                        }
                        return c10;
                    }
                    l();
                    int i13 = this.C;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.C = i13 + 1;
                        while (true) {
                            if (this.C + 2 > this.D && !A(2)) {
                                A0("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.C;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.C + 2;
                                        i11 = this.D;
                                        break;
                                    }
                                    if (cArr[this.C + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.E++;
                                this.F = i14 + 1;
                            }
                            this.C++;
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.C = i13 + 1;
                        x0();
                        i10 = this.C;
                        i11 = this.D;
                    }
                } else {
                    if (c10 != '#') {
                        this.C = i12;
                        return c10;
                    }
                    this.C = i12;
                    l();
                    x0();
                    i10 = this.C;
                    i11 = this.D;
                }
            }
            i10 = i12;
        }
    }

    public final void p0() {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 7) {
            throw B0("null");
        }
        this.G = 0;
        int[] iArr = this.N;
        int i10 = this.L - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String q0(char c10) throws MalformedJsonException {
        int i10;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i11 = this.C;
            int i12 = this.D;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.B;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (this.O == 3 && c11 < ' ') {
                            A0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c11 == c10) {
                            this.C = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.C = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(v0());
                            i11 = this.C;
                            i12 = this.D;
                        } else {
                            if (c11 == '\n') {
                                this.E++;
                                this.F = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.C = i11;
        } while (A(1));
        A0("Unterminated string");
        throw null;
    }

    public final int r() throws IOException {
        int iO0;
        int i10;
        int iO1;
        char c10;
        String str;
        String str2;
        int i11;
        int i12;
        int length;
        int i13;
        char c11;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        char c12;
        int i18;
        int i19;
        int[] iArr = this.K;
        int i20 = this.L - 1;
        int i21 = iArr[i20];
        char[] cArr = this.B;
        if (i21 == 1) {
            iArr[i20] = 2;
        } else if (i21 == 2) {
            int iO2 = o0(true);
            if (iO2 != 44) {
                if (iO2 != 59) {
                    if (iO2 == 93) {
                        this.G = 4;
                        return 4;
                    }
                    A0("Unterminated array");
                    throw null;
                }
                l();
            }
        } else {
            if (i21 == 3 || i21 == 5) {
                iArr[i20] = 4;
                if (i21 == 5 && (iO0 = o0(true)) != 44) {
                    if (iO0 != 59) {
                        if (iO0 == 125) {
                            this.G = 2;
                            return 2;
                        }
                        A0("Unterminated object");
                        throw null;
                    }
                    l();
                }
                int iO3 = o0(true);
                if (iO3 == 34) {
                    this.G = 13;
                    return 13;
                }
                if (iO3 == 39) {
                    l();
                    this.G = 12;
                    return 12;
                }
                if (iO3 == 125) {
                    if (i21 != 5) {
                        this.G = 2;
                        return 2;
                    }
                    A0("Expected name");
                    throw null;
                }
                l();
                this.C--;
                if (I((char) iO3)) {
                    this.G = 14;
                    return 14;
                }
                A0("Expected name");
                throw null;
            }
            if (i21 != 4) {
                if (i21 == 6) {
                    if (this.O == 1) {
                        o0(true);
                        int i22 = this.C;
                        this.C = i22 - 1;
                        if (i22 + 4 <= this.D || A(5)) {
                            int i23 = this.C;
                            if (cArr[i23] == ')' && cArr[i23 + 1] == ']' && cArr[i23 + 2] == '}' && cArr[i23 + 3] == '\'' && cArr[i23 + 4] == '\n') {
                                this.C = i23 + 5;
                            }
                        }
                    }
                    this.K[this.L - 1] = 7;
                } else if (i21 == 7) {
                    i10 = 0;
                    if (o0(false) == -1) {
                        this.G = 17;
                        return 17;
                    }
                    l();
                    this.C--;
                } else {
                    i10 = 0;
                    if (i21 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iO1 = o0(true);
                if (iO1 != 34) {
                    this.G = 9;
                    return 9;
                }
                if (iO1 != 39) {
                    l();
                    this.G = 8;
                    return 8;
                }
                if (iO1 != 44 && iO1 != 59) {
                    if (iO1 != 91) {
                        this.G = 3;
                        return 3;
                    }
                    if (iO1 != 93) {
                        if (iO1 != 123) {
                            this.G = 1;
                            return 1;
                        }
                        int i24 = this.C - 1;
                        this.C = i24;
                        c10 = cArr[i24];
                        if (c10 != 't' || c10 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i11 = 5;
                        } else {
                            if (c10 != 'f' && c10 != 'F') {
                                if (c10 != 'n' && c10 != 'N') {
                                    i11 = i10;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i11 = 7;
                                if (i11 != 0) {
                                    return i11;
                                }
                                int i25 = this.C;
                                i14 = this.D;
                                i15 = i10;
                                i16 = i15;
                                int i26 = i16;
                                i17 = i25;
                                z10 = true;
                                long j9 = 0;
                                while (true) {
                                    if (i17 + i16 != i14) {
                                        c12 = cArr[i17 + i16];
                                        if (c12 != '+') {
                                            if (c12 != 'E' || c12 == 'e') {
                                                if (i15 != 2 || i15 == 4) {
                                                    i15 = 5;
                                                    i16++;
                                                }
                                            } else if (c12 == '-') {
                                                if (i15 == 0) {
                                                    i15 = 1;
                                                    i26 = 1;
                                                } else {
                                                    if (i15 != 5) {
                                                    }
                                                    i15 = 6;
                                                }
                                                i16++;
                                            } else if (c12 != '.') {
                                                if (c12 >= '0' && c12 <= '9') {
                                                    if (i15 == 1 || i15 == 0) {
                                                        j9 = -(c12 - '0');
                                                        i15 = 2;
                                                    } else if (i15 == 2) {
                                                        if (j9 != 0) {
                                                            long j10 = (10 * j9) - ((long) (c12 - '0'));
                                                            z10 &= j9 > -922337203685477580L || (j9 == -922337203685477580L && j10 < j9);
                                                            j9 = j10;
                                                        }
                                                    } else if (i15 == 3) {
                                                        i15 = 4;
                                                    } else if (i15 == 5 || i15 == 6) {
                                                        i15 = 7;
                                                    }
                                                    i16++;
                                                } else if (!I(c12)) {
                                                    i19 = 2;
                                                    if (i15 != 2) {
                                                        if (i15 != i19 || i15 == 4 || i15 == 7) {
                                                            this.I = i16;
                                                            i18 = 16;
                                                            this.G = 16;
                                                        }
                                                    } else if (z10 || ((j9 == Long.MIN_VALUE && i26 == 0) || (j9 == 0 && i26 != 0))) {
                                                        i19 = 2;
                                                        if (i15 != i19) {
                                                        }
                                                        this.I = i16;
                                                        i18 = 16;
                                                        this.G = 16;
                                                    } else {
                                                        if (i26 == 0) {
                                                            j9 = -j9;
                                                        }
                                                        this.H = j9;
                                                        this.C += i16;
                                                        i18 = 15;
                                                        this.G = 15;
                                                    }
                                                }
                                            } else if (i15 == 2) {
                                                i15 = 3;
                                                i16++;
                                            }
                                            if (i18 != 0) {
                                                return i18;
                                            }
                                            if (I(cArr[this.C])) {
                                                A0("Expected value");
                                                throw null;
                                            }
                                            l();
                                            this.G = 10;
                                            return 10;
                                        }
                                        if (i15 != 5) {
                                        }
                                        i15 = 6;
                                        i16++;
                                    } else if (i16 != cArr.length) {
                                        if (A(i16 + 1)) {
                                            i17 = this.C;
                                            i14 = this.D;
                                            c12 = cArr[i17 + i16];
                                            if (c12 != '+') {
                                                if (c12 != 'E') {
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                } else {
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                }
                                                if (i18 != 0) {
                                                    return i18;
                                                }
                                                if (I(cArr[this.C])) {
                                                    A0("Expected value");
                                                    throw null;
                                                }
                                                l();
                                                this.G = 10;
                                                return 10;
                                            }
                                            if (i15 != 5) {
                                            }
                                            i15 = 6;
                                            i16++;
                                        }
                                        i19 = 2;
                                        if (i15 != 2) {
                                            if (i15 != i19) {
                                            }
                                            this.I = i16;
                                            i18 = 16;
                                            this.G = 16;
                                        } else {
                                            if (z10) {
                                            }
                                            i19 = 2;
                                            if (i15 != i19) {
                                            }
                                            this.I = i16;
                                            i18 = 16;
                                            this.G = 16;
                                        }
                                        if (i18 != 0) {
                                            return i18;
                                        }
                                        if (I(cArr[this.C])) {
                                            A0("Expected value");
                                            throw null;
                                        }
                                        l();
                                        this.G = 10;
                                        return 10;
                                    }
                                    i18 = 0;
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (I(cArr[this.C])) {
                                        A0("Expected value");
                                        throw null;
                                    }
                                    l();
                                    this.G = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i11 = 6;
                        }
                        if (this.O != 3) {
                            i12 = 1;
                        } else {
                            i12 = i10;
                        }
                        length = str.length();
                        i13 = i10;
                        while (true) {
                            if (i13 >= length) {
                                if ((this.C + length < this.D && !A(length + 1)) || !I(cArr[this.C + length])) {
                                    this.C += length;
                                    this.G = i11;
                                    break;
                                }
                                break;
                            }
                            if ((this.C + i13 >= this.D || A(i13 + 1)) && ((c11 = cArr[this.C + i13]) == str.charAt(i13) || (i12 != 0 && c11 == str2.charAt(i13)))) {
                            }
                            i11 = i10;
                            break;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        int i27 = this.C;
                        i14 = this.D;
                        i15 = i10;
                        i16 = i15;
                        int i28 = i16;
                        i17 = i27;
                        z10 = true;
                        long j11 = 0;
                        while (true) {
                            if (i17 + i16 != i14) {
                                c12 = cArr[i17 + i16];
                                if (c12 != '+') {
                                    if (c12 != 'E') {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    } else {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (I(cArr[this.C])) {
                                        A0("Expected value");
                                        throw null;
                                    }
                                    l();
                                    this.G = 10;
                                    return 10;
                                }
                                if (i15 != 5) {
                                }
                                i15 = 6;
                                i16++;
                            } else if (i16 != cArr.length) {
                                if (A(i16 + 1)) {
                                    i17 = this.C;
                                    i14 = this.D;
                                    c12 = cArr[i17 + i16];
                                    if (c12 != '+') {
                                        if (c12 != 'E') {
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                        } else {
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                        }
                                        if (i18 != 0) {
                                            return i18;
                                        }
                                        if (I(cArr[this.C])) {
                                            A0("Expected value");
                                            throw null;
                                        }
                                        l();
                                        this.G = 10;
                                        return 10;
                                    }
                                    if (i15 != 5) {
                                    }
                                    i15 = 6;
                                    i16++;
                                }
                                i19 = 2;
                                if (i15 != 2) {
                                    if (i15 != i19) {
                                    }
                                    this.I = i16;
                                    i18 = 16;
                                    this.G = 16;
                                } else {
                                    if (z10) {
                                    }
                                    i19 = 2;
                                    if (i15 != i19) {
                                    }
                                    this.I = i16;
                                    i18 = 16;
                                    this.G = 16;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (I(cArr[this.C])) {
                                    A0("Expected value");
                                    throw null;
                                }
                                l();
                                this.G = 10;
                                return 10;
                            }
                            i18 = 0;
                            if (i18 != 0) {
                                return i18;
                            }
                            if (I(cArr[this.C])) {
                                A0("Expected value");
                                throw null;
                            }
                            l();
                            this.G = 10;
                            return 10;
                        }
                    }
                    if (i21 == 1) {
                        this.G = 4;
                        return 4;
                    }
                }
                if (i21 == 1 && i21 != 2) {
                    A0("Unexpected value");
                    throw null;
                }
                l();
                this.C--;
                this.G = 7;
                return 7;
            }
            iArr[i20] = 5;
            int iO4 = o0(true);
            if (iO4 != 58) {
                if (iO4 != 61) {
                    A0("Expected ':'");
                    throw null;
                }
                l();
                if (this.C < this.D || A(1)) {
                    int i29 = this.C;
                    if (cArr[i29] == '>') {
                        this.C = i29 + 1;
                    }
                }
            }
        }
        i10 = 0;
        iO1 = o0(true);
        if (iO1 != 34) {
            this.G = 9;
            return 9;
        }
        if (iO1 != 39) {
            l();
            this.G = 8;
            return 8;
        }
        if (iO1 != 44) {
            if (iO1 != 91) {
                this.G = 3;
                return 3;
            }
            if (iO1 != 93) {
                if (iO1 != 123) {
                    this.G = 1;
                    return 1;
                }
                int i210 = this.C - 1;
                this.C = i210;
                c10 = cArr[i210];
                if (c10 != 't') {
                    str = "true";
                    str2 = "TRUE";
                    i11 = 5;
                    if (this.O != 3) {
                        i12 = 1;
                    } else {
                        i12 = i10;
                    }
                    length = str.length();
                    i13 = i10;
                    while (true) {
                        if (i13 >= length) {
                            if (this.C + length < this.D) {
                            }
                            this.C += length;
                            this.G = i11;
                            break;
                        }
                        i13 = this.C + i13 >= this.D ? i13 + 1 : i13 + 1;
                    }
                    if (i11 != 0) {
                        return i11;
                    }
                    int i211 = this.C;
                    i14 = this.D;
                    i15 = i10;
                    i16 = i15;
                    int i212 = i16;
                    i17 = i211;
                    z10 = true;
                    long j12 = 0;
                    while (true) {
                        if (i17 + i16 != i14) {
                            c12 = cArr[i17 + i16];
                            if (c12 != '+') {
                                if (c12 != 'E') {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                } else {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (I(cArr[this.C])) {
                                    A0("Expected value");
                                    throw null;
                                }
                                l();
                                this.G = 10;
                                return 10;
                            }
                            if (i15 != 5) {
                            }
                            i15 = 6;
                            i16++;
                        } else if (i16 != cArr.length) {
                            if (A(i16 + 1)) {
                                i17 = this.C;
                                i14 = this.D;
                                c12 = cArr[i17 + i16];
                                if (c12 != '+') {
                                    if (c12 != 'E') {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    } else {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (I(cArr[this.C])) {
                                        A0("Expected value");
                                        throw null;
                                    }
                                    l();
                                    this.G = 10;
                                    return 10;
                                }
                                if (i15 != 5) {
                                }
                                i15 = 6;
                                i16++;
                            }
                            i19 = 2;
                            if (i15 != 2) {
                                if (i15 != i19) {
                                }
                                this.I = i16;
                                i18 = 16;
                                this.G = 16;
                            } else {
                                if (z10) {
                                }
                                i19 = 2;
                                if (i15 != i19) {
                                }
                                this.I = i16;
                                i18 = 16;
                                this.G = 16;
                            }
                            if (i18 != 0) {
                                return i18;
                            }
                            if (I(cArr[this.C])) {
                                A0("Expected value");
                                throw null;
                            }
                            l();
                            this.G = 10;
                            return 10;
                        }
                        i18 = 0;
                        if (i18 != 0) {
                            return i18;
                        }
                        if (I(cArr[this.C])) {
                            A0("Expected value");
                            throw null;
                        }
                        l();
                        this.G = 10;
                        return 10;
                    }
                }
                str = "true";
                str2 = "TRUE";
                i11 = 5;
                if (this.O != 3) {
                    i12 = 1;
                } else {
                    i12 = i10;
                }
                length = str.length();
                i13 = i10;
                while (true) {
                    if (i13 >= length) {
                        if (this.C + length < this.D) {
                        }
                        this.C += length;
                        this.G = i11;
                        break;
                    }
                    if (this.C + i13 >= this.D) {
                    }
                }
                if (i11 != 0) {
                    return i11;
                }
                int i213 = this.C;
                i14 = this.D;
                i15 = i10;
                i16 = i15;
                int i214 = i16;
                i17 = i213;
                z10 = true;
                long j13 = 0;
                while (true) {
                    if (i17 + i16 != i14) {
                        c12 = cArr[i17 + i16];
                        if (c12 != '+') {
                            if (c12 != 'E') {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            } else {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            }
                            if (i18 != 0) {
                                return i18;
                            }
                            if (I(cArr[this.C])) {
                                A0("Expected value");
                                throw null;
                            }
                            l();
                            this.G = 10;
                            return 10;
                        }
                        if (i15 != 5) {
                        }
                        i15 = 6;
                        i16++;
                    } else if (i16 != cArr.length) {
                        if (A(i16 + 1)) {
                            i17 = this.C;
                            i14 = this.D;
                            c12 = cArr[i17 + i16];
                            if (c12 != '+') {
                                if (c12 != 'E') {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                } else {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (I(cArr[this.C])) {
                                    A0("Expected value");
                                    throw null;
                                }
                                l();
                                this.G = 10;
                                return 10;
                            }
                            if (i15 != 5) {
                            }
                            i15 = 6;
                            i16++;
                        }
                        i19 = 2;
                        if (i15 != 2) {
                            if (i15 != i19) {
                            }
                            this.I = i16;
                            i18 = 16;
                            this.G = 16;
                        } else {
                            if (z10) {
                            }
                            i19 = 2;
                            if (i15 != i19) {
                            }
                            this.I = i16;
                            i18 = 16;
                            this.G = 16;
                        }
                        if (i18 != 0) {
                            return i18;
                        }
                        if (I(cArr[this.C])) {
                            A0("Expected value");
                            throw null;
                        }
                        l();
                        this.G = 10;
                        return 10;
                    }
                    i18 = 0;
                    if (i18 != 0) {
                        return i18;
                    }
                    if (I(cArr[this.C])) {
                        A0("Expected value");
                        throw null;
                    }
                    l();
                    this.G = 10;
                    return 10;
                }
                i11 = i10;
                if (i11 != 0) {
                    return i11;
                }
                int i215 = this.C;
                i14 = this.D;
                i15 = i10;
                i16 = i15;
                int i216 = i16;
                i17 = i215;
                z10 = true;
                long j14 = 0;
                while (true) {
                    if (i17 + i16 != i14) {
                        c12 = cArr[i17 + i16];
                        if (c12 != '+') {
                            if (c12 != 'E') {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            } else {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            }
                            if (i18 != 0) {
                                return i18;
                            }
                            if (I(cArr[this.C])) {
                                A0("Expected value");
                                throw null;
                            }
                            l();
                            this.G = 10;
                            return 10;
                        }
                        if (i15 != 5) {
                        }
                        i15 = 6;
                        i16++;
                    } else if (i16 != cArr.length) {
                        if (A(i16 + 1)) {
                            i17 = this.C;
                            i14 = this.D;
                            c12 = cArr[i17 + i16];
                            if (c12 != '+') {
                                if (c12 != 'E') {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                } else {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (I(cArr[this.C])) {
                                    A0("Expected value");
                                    throw null;
                                }
                                l();
                                this.G = 10;
                                return 10;
                            }
                            if (i15 != 5) {
                            }
                            i15 = 6;
                            i16++;
                        }
                        i19 = 2;
                        if (i15 != 2) {
                            if (i15 != i19) {
                            }
                            this.I = i16;
                            i18 = 16;
                            this.G = 16;
                        } else {
                            if (z10) {
                            }
                            i19 = 2;
                            if (i15 != i19) {
                            }
                            this.I = i16;
                            i18 = 16;
                            this.G = 16;
                        }
                        if (i18 != 0) {
                            return i18;
                        }
                        if (I(cArr[this.C])) {
                            A0("Expected value");
                            throw null;
                        }
                        l();
                        this.G = 10;
                        return 10;
                    }
                    i18 = 0;
                    if (i18 != 0) {
                        return i18;
                    }
                    if (I(cArr[this.C])) {
                        A0("Expected value");
                        throw null;
                    }
                    l();
                    this.G = 10;
                    return 10;
                }
            }
            if (i21 == 1) {
                this.G = 4;
                return 4;
            }
        }
        if (i21 == 1) {
        }
        l();
        this.C--;
        this.G = 7;
        return 7;
    }

    public final String r0() throws IOException {
        String str;
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 10) {
            str = s0();
        } else if (iR == 8) {
            str = q0('\'');
        } else if (iR == 9) {
            str = q0('\"');
        } else if (iR == 11) {
            str = this.J;
            this.J = null;
        } else if (iR == 15) {
            str = Long.toString(this.H);
        } else {
            if (iR != 16) {
                throw B0("a string");
            }
            str = new String(this.B, this.C, this.I);
            this.C += this.I;
        }
        this.G = 0;
        int[] iArr = this.N;
        int i10 = this.L - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final String s0() throws MalformedJsonException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.C;
                int i13 = i12 + i11;
                int i14 = this.D;
                char[] cArr = this.B;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        l();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.C, i11);
                    this.C += i11;
                    if (!A(1)) {
                    }
                } else if (!A(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.C, i10);
                } else {
                    sb2.append(cArr, this.C, i10);
                    string = sb2.toString();
                }
                this.C += i10;
                return string;
            }
        }
    }

    public final int t0() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        switch (iR) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final String toString() {
        return a.class.getSimpleName() + O();
    }

    public final void u0(int i10) throws MalformedJsonException {
        int i11 = this.L;
        if (i11 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached" + O());
        }
        int[] iArr = this.K;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.K = Arrays.copyOf(iArr, i12);
            this.N = Arrays.copyOf(this.N, i12);
            this.M = (String[]) Arrays.copyOf(this.M, i12);
        }
        int[] iArr2 = this.K;
        int i13 = this.L;
        this.L = i13 + 1;
        iArr2[i13] = i10;
    }

    public final void v() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 4) {
            throw B0("END_ARRAY");
        }
        int i10 = this.L;
        this.L = i10 - 1;
        int[] iArr = this.N;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.G = 0;
    }

    public final char v0() throws MalformedJsonException {
        int i10;
        if (this.C == this.D && !A(1)) {
            A0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.C;
        int i12 = i11 + 1;
        this.C = i12;
        char[] cArr = this.B;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            A0("Invalid escape sequence");
                            throw null;
                        }
                        if (i11 + 5 > this.D && !A(4)) {
                            A0("Unterminated escape sequence");
                            throw null;
                        }
                        int i13 = this.C;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = cArr[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    A0("Malformed Unicode escape \\u".concat(new String(cArr, this.C, 4)));
                                    throw null;
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i10 + i16;
                            i13++;
                        }
                        this.C += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.O == 3) {
            A0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.E++;
        this.F = i12;
        if (this.O == 3) {
            A0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c10;
    }

    public final void w0(char c10) throws MalformedJsonException {
        do {
            int i10 = this.C;
            int i11 = this.D;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.B[i10];
                if (c11 == c10) {
                    this.C = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.C = i12;
                    v0();
                    i10 = this.C;
                    i11 = this.D;
                } else {
                    if (c11 == '\n') {
                        this.E++;
                        this.F = i12;
                    }
                    i10 = i12;
                }
            }
            this.C = i10;
        } while (A(1));
        A0("Unterminated string");
        throw null;
    }

    public final void x() throws IOException {
        int iR = this.G;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 2) {
            throw B0("END_OBJECT");
        }
        int i10 = this.L;
        int i11 = i10 - 1;
        this.L = i11;
        this.M[i11] = null;
        int[] iArr = this.N;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.G = 0;
    }

    public final void x0() {
        char c10;
        do {
            if (this.C >= this.D && !A(1)) {
                return;
            }
            int i10 = this.C;
            int i11 = i10 + 1;
            this.C = i11;
            c10 = this.B[i10];
            if (c10 == '\n') {
                this.E++;
                this.F = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public final void y0() throws MalformedJsonException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.C;
                if (i11 + i10 < this.D) {
                    char c10 = this.B[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        l();
                    }
                    this.C += i10;
                    return;
                }
                this.C = i11 + i10;
            }
        } while (A(1));
    }

    public final void z0() throws IOException {
        int i10 = 0;
        do {
            int iR = this.G;
            if (iR == 0) {
                iR = r();
            }
            switch (iR) {
                case 1:
                    u0(3);
                    i10++;
                    this.G = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.M[this.L - 1] = null;
                    }
                    this.L--;
                    i10--;
                    this.G = 0;
                    break;
                case 3:
                    u0(1);
                    i10++;
                    this.G = 0;
                    break;
                case 4:
                    this.L--;
                    i10--;
                    this.G = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.G = 0;
                    break;
                case 8:
                    w0('\'');
                    this.G = 0;
                    break;
                case 9:
                    w0('\"');
                    this.G = 0;
                    break;
                case 10:
                    y0();
                    this.G = 0;
                    break;
                case 12:
                    w0('\'');
                    if (i10 == 0) {
                        this.M[this.L - 1] = "<skipped>";
                    }
                    this.G = 0;
                    break;
                case 13:
                    w0('\"');
                    if (i10 == 0) {
                        this.M[this.L - 1] = "<skipped>";
                    }
                    this.G = 0;
                    break;
                case 14:
                    y0();
                    if (i10 == 0) {
                        this.M[this.L - 1] = "<skipped>";
                    }
                    this.G = 0;
                    break;
                case 16:
                    this.C += this.I;
                    this.G = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.N;
        int i11 = this.L - 1;
        iArr[i11] = iArr[i11] + 1;
    }
}
