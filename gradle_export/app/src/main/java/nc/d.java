package nc;

import java.io.EOFException;
import k50.c0;
import k50.i;
import k50.l;
import k50.y;
import sg.f;

public final class d extends c {
    public static final l L;
    public static final l M;
    public static final l N;
    public final c0 F;
    public final i G;
    public int H;
    public long I;
    public int J;
    public String K;

    static {
        l lVar = l.D;
        L = f.I("'\\");
        M = f.I("\"\\");
        N = f.I("{}[]:, \n\t\r\f/\\;#=");
        f.I("\n\r");
        f.I("*/");
    }

    public d(c0 c0Var) {
        this.B = new int[32];
        this.C = new String[32];
        this.D = new int[32];
        this.H = 0;
        this.F = c0Var;
        this.G = c0Var.B;
        S(6);
    }

    @Override
    public final boolean A() throws b, EOFException {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 5) {
            this.H = 0;
            int[] iArr = this.D;
            int i10 = this.A - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iP0 == 6) {
            this.H = 0;
            int[] iArr2 = this.D;
            int i11 = this.A - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + g4.c.v(O()) + " at path " + v());
    }

    @Override
    public final double F() {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 16) {
            this.H = 0;
            int[] iArr = this.D;
            int i10 = this.A - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.I;
        }
        if (iP0 == 17) {
            long j9 = this.J;
            i iVar = this.G;
            iVar.getClass();
            this.K = iVar.Z(j9, r30.a.a);
        } else if (iP0 == 9) {
            this.K = u0(M);
        } else if (iP0 == 8) {
            this.K = u0(L);
        } else if (iP0 == 10) {
            this.K = v0();
        } else if (iP0 != 11) {
            throw new a("Expected a double but was " + g4.c.v(O()) + " at path " + v());
        }
        this.H = 11;
        try {
            double d3 = Double.parseDouble(this.K);
            if (Double.isNaN(d3) || Double.isInfinite(d3)) {
                throw new b("JSON forbids NaN and infinities: " + d3 + " at path " + v());
            }
            this.K = null;
            this.H = 0;
            int[] iArr2 = this.D;
            int i11 = this.A - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d3;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.K + " at path " + v());
        }
    }

    @Override
    public final int G() {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 16) {
            long j9 = this.I;
            int i10 = (int) j9;
            if (j9 == i10) {
                this.H = 0;
                int[] iArr = this.D;
                int i11 = this.A - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a("Expected an int but was " + this.I + " at path " + v());
        }
        if (iP0 == 17) {
            long j10 = this.J;
            i iVar = this.G;
            iVar.getClass();
            this.K = iVar.Z(j10, r30.a.a);
        } else if (iP0 == 9 || iP0 == 8) {
            String strU0 = iP0 == 9 ? u0(M) : u0(L);
            this.K = strU0;
            try {
                int i12 = Integer.parseInt(strU0);
                this.H = 0;
                int[] iArr2 = this.D;
                int i13 = this.A - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iP0 != 11) {
            throw new a("Expected an int but was " + g4.c.v(O()) + " at path " + v());
        }
        this.H = 11;
        try {
            double d3 = Double.parseDouble(this.K);
            int i14 = (int) d3;
            if (i14 != d3) {
                throw new a("Expected an int but was " + this.K + " at path " + v());
            }
            this.K = null;
            this.H = 0;
            int[] iArr3 = this.D;
            int i15 = this.A - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.K + " at path " + v());
        }
    }

    @Override
    public final String I() {
        String strZ;
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 10) {
            strZ = v0();
        } else if (iP0 == 9) {
            strZ = u0(M);
        } else if (iP0 == 8) {
            strZ = u0(L);
        } else if (iP0 == 11) {
            strZ = this.K;
            this.K = null;
        } else if (iP0 == 16) {
            strZ = Long.toString(this.I);
        } else {
            if (iP0 != 17) {
                throw new a("Expected a string but was " + g4.c.v(O()) + " at path " + v());
            }
            long j9 = this.J;
            i iVar = this.G;
            iVar.getClass();
            strZ = iVar.Z(j9, r30.a.a);
        }
        this.H = 0;
        int[] iArr = this.D;
        int i10 = this.A - 1;
        iArr[i10] = iArr[i10] + 1;
        return strZ;
    }

    @Override
    public final int O() throws b, EOFException {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        switch (iP0) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case TYPE_SINT64_VALUE:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public final int Z(h7.b bVar) {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 < 12 || iP0 > 15) {
            return -1;
        }
        if (iP0 == 15) {
            return q0(this.K, bVar);
        }
        int iM = this.F.M((y) bVar.B);
        if (iM != -1) {
            this.H = 0;
            this.C[this.A - 1] = ((String[]) bVar.A)[iM];
            return iM;
        }
        String str = this.C[this.A - 1];
        String strS0 = s0();
        int iQ0 = q0(strS0, bVar);
        if (iQ0 == -1) {
            this.H = 15;
            this.K = strS0;
            this.C[this.A - 1] = str;
        }
        return iQ0;
    }

    @Override
    public final void a() {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 3) {
            S(1);
            this.D[this.A - 1] = 0;
            this.H = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + g4.c.v(O()) + " at path " + v());
        }
    }

    @Override
    public final void b0() {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 14) {
            long jI = this.F.i(N);
            i iVar = this.G;
            if (jI == -1) {
                jI = iVar.B;
            }
            iVar.skip(jI);
        } else if (iP0 == 13) {
            x0(M);
        } else if (iP0 == 12) {
            x0(L);
        } else if (iP0 != 15) {
            throw new a("Expected a name but was " + g4.c.v(O()) + " at path " + v());
        }
        this.H = 0;
        this.C[this.A - 1] = "null";
    }

    @Override
    public final void close() {
        this.H = 0;
        this.B[0] = 8;
        this.A = 1;
        this.G.a();
        this.F.close();
    }

    @Override
    public final void f0() {
        int i10 = 0;
        do {
            int iP0 = this.H;
            if (iP0 == 0) {
                iP0 = p0();
            }
            if (iP0 == 3) {
                S(1);
            } else {
                if (iP0 == 1) {
                    S(3);
                } else if (iP0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + g4.c.v(O()) + " at path " + v());
                    }
                    this.A--;
                } else if (iP0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + g4.c.v(O()) + " at path " + v());
                    }
                    this.A--;
                } else {
                    i iVar = this.G;
                    if (iP0 == 14 || iP0 == 10) {
                        long jI = this.F.i(N);
                        if (jI == -1) {
                            jI = iVar.B;
                        }
                        iVar.skip(jI);
                    } else if (iP0 == 9 || iP0 == 13) {
                        x0(M);
                    } else if (iP0 == 8 || iP0 == 12) {
                        x0(L);
                    } else if (iP0 == 17) {
                        iVar.skip(this.J);
                    } else if (iP0 == 18) {
                        throw new a("Expected a value but was " + g4.c.v(O()) + " at path " + v());
                    }
                }
                this.H = 0;
            }
            i10++;
            this.H = 0;
        } while (i10 != 0);
        int[] iArr = this.D;
        int i11 = this.A - 1;
        iArr[i11] = iArr[i11] + 1;
        this.C[i11] = "null";
    }

    @Override
    public final void i() {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 1) {
            S(3);
            this.H = 0;
        } else {
            throw new a("Expected BEGIN_OBJECT but was " + g4.c.v(O()) + " at path " + v());
        }
    }

    @Override
    public final void l() {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 != 4) {
            throw new a("Expected END_ARRAY but was " + g4.c.v(O()) + " at path " + v());
        }
        int i10 = this.A;
        this.A = i10 - 1;
        int[] iArr = this.D;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.H = 0;
    }

    public final void o0() throws b {
        n0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int p0() throws b, EOFException {
        String str;
        String str2;
        int i10;
        long j9;
        char cF;
        char c10;
        int i11;
        int i12;
        int i13;
        byte bF;
        char c11;
        int[] iArr = this.B;
        int i14 = this.A - 1;
        int i15 = iArr[i14];
        i iVar = this.G;
        if (i15 == 1) {
            iArr[i14] = 2;
        } else if (i15 == 2) {
            int iT0 = t0(true);
            iVar.readByte();
            if (iT0 != 44) {
                if (iT0 == 59) {
                    o0();
                    throw null;
                }
                if (iT0 == 93) {
                    this.H = 4;
                    return 4;
                }
                n0("Unterminated array");
                throw null;
            }
        } else {
            if (i15 == 3 || i15 == 5) {
                iArr[i14] = 4;
                if (i15 == 5) {
                    int iT1 = t0(true);
                    iVar.readByte();
                    if (iT1 != 44) {
                        if (iT1 == 59) {
                            o0();
                            throw null;
                        }
                        if (iT1 == 125) {
                            this.H = 2;
                            return 2;
                        }
                        n0("Unterminated object");
                        throw null;
                    }
                }
                int iT2 = t0(true);
                if (iT2 == 34) {
                    iVar.readByte();
                    this.H = 13;
                    return 13;
                }
                if (iT2 == 39) {
                    iVar.readByte();
                    o0();
                    throw null;
                }
                if (iT2 != 125) {
                    o0();
                    throw null;
                }
                if (i15 == 5) {
                    n0("Expected name");
                    throw null;
                }
                iVar.readByte();
                this.H = 2;
                return 2;
            }
            if (i15 == 4) {
                iArr[i14] = 5;
                int iT3 = t0(true);
                iVar.readByte();
                if (iT3 != 58) {
                    if (iT3 != 61) {
                        n0("Expected ':'");
                        throw null;
                    }
                    o0();
                    throw null;
                }
            } else if (i15 == 6) {
                iArr[i14] = 7;
            } else {
                if (i15 == 7) {
                    if (t0(false) == -1) {
                        this.H = 18;
                        return 18;
                    }
                    o0();
                    throw null;
                }
                if (i15 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iT4 = t0(true);
        if (iT4 == 34) {
            iVar.readByte();
            this.H = 9;
            return 9;
        }
        if (iT4 == 39) {
            o0();
            throw null;
        }
        if (iT4 != 44 && iT4 != 59) {
            if (iT4 == 91) {
                iVar.readByte();
                this.H = 3;
                return 3;
            }
            if (iT4 != 93) {
                if (iT4 == 123) {
                    iVar.readByte();
                    this.H = 1;
                    return 1;
                }
                byte bF2 = iVar.F(0L);
                c0 c0Var = this.F;
                if (bF2 == 116 || bF2 == 84) {
                    str = "true";
                    str2 = "TRUE";
                    i10 = 5;
                } else {
                    if (bF2 != 102 && bF2 != 70) {
                        if (bF2 == 110 || bF2 == 78) {
                            str = "null";
                            str2 = "NULL";
                            i10 = 7;
                        } else {
                            j9 = 0;
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            return i10;
                        }
                        boolean z10 = true;
                        long j10 = j9;
                        c10 = 0;
                        i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            i12 = i11 + 1;
                            if (c0Var.T(i12)) {
                                bF = iVar.F(i11);
                                if (bF != 43) {
                                    if (bF != 69 || bF == 101) {
                                        c11 = 6;
                                        if (c10 != 2 || c10 == 4) {
                                            c10 = 5;
                                            i11 = i12;
                                        } else {
                                            i13 = 0;
                                        }
                                    } else if (bF == 45) {
                                        c11 = 6;
                                        if (c10 == 0) {
                                            c10 = 1;
                                            z11 = true;
                                        } else {
                                            if (c10 != 5) {
                                                i13 = 0;
                                            }
                                            c10 = c11;
                                        }
                                        i11 = i12;
                                    } else if (bF != 46) {
                                        if (bF >= 48 && bF <= 57) {
                                            if (c10 == 1 || c10 == 0) {
                                                c11 = 6;
                                                j10 = -(bF - 48);
                                                c10 = 2;
                                            } else {
                                                if (c10 == 2) {
                                                    if (j10 != j9) {
                                                        long j11 = (10 * j10) - ((long) (bF - 48));
                                                        z10 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                        j10 = j11;
                                                    }
                                                } else if (c10 == 3) {
                                                    c10 = 4;
                                                } else {
                                                    c11 = 6;
                                                    if (c10 == 5 || c10 == 6) {
                                                        c10 = 7;
                                                    }
                                                }
                                                c11 = 6;
                                                i11 = i12;
                                            }
                                            i11 = i12;
                                        } else if (!r0(bF)) {
                                        }
                                        i13 = 0;
                                    } else {
                                        c11 = 6;
                                        if (c10 == 2) {
                                            c10 = 3;
                                            i11 = i12;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                    if (i13 != 0) {
                                        return i13;
                                    }
                                    if (r0(iVar.F(j9))) {
                                        o0();
                                        throw null;
                                    }
                                    n0("Expected value");
                                    throw null;
                                }
                                c11 = 6;
                                if (c10 != 5) {
                                    i13 = 0;
                                    if (i13 != 0) {
                                        return i13;
                                    }
                                    if (r0(iVar.F(j9))) {
                                        n0("Expected value");
                                        throw null;
                                    }
                                    o0();
                                    throw null;
                                }
                                c10 = c11;
                                i11 = i12;
                            }
                            if (c10 != 2 && z10 && ((j10 != Long.MIN_VALUE || z11) && (j10 != j9 || !z11))) {
                                if (!z11) {
                                    j10 = -j10;
                                }
                                this.I = j10;
                                iVar.skip(i11);
                                i13 = 16;
                                this.H = 16;
                            } else if (c10 != 2 || c10 == 4 || c10 == 7) {
                                this.J = i11;
                                i13 = 17;
                                this.H = 17;
                            } else {
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                return i13;
                            }
                            if (r0(iVar.F(j9))) {
                                n0("Expected value");
                                throw null;
                            }
                            o0();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i10 = 6;
                }
                int length = str.length();
                j9 = 0;
                int i16 = 1;
                while (true) {
                    if (i16 >= length) {
                        if (!c0Var.T(length + 1) || !r0(iVar.F(length))) {
                            iVar.skip(length);
                            this.H = i10;
                            break;
                        }
                    } else {
                        int i17 = i16 + 1;
                        if (c0Var.T(i17) && ((cF = iVar.F(i16)) == str.charAt(i16) || cF == str2.charAt(i16))) {
                            i16 = i17;
                        }
                    }
                    i10 = 0;
                    break;
                }
                if (i10 != 0) {
                    return i10;
                }
                boolean z12 = true;
                long j12 = j9;
                c10 = 0;
                i11 = 0;
                boolean z13 = false;
                while (true) {
                    i12 = i11 + 1;
                    if (c0Var.T(i12)) {
                        bF = iVar.F(i11);
                        if (bF != 43) {
                            if (bF != 69) {
                                c11 = 6;
                                if (c10 != 2) {
                                }
                                c10 = 5;
                                i11 = i12;
                            } else {
                                c11 = 6;
                                if (c10 != 2) {
                                }
                                c10 = 5;
                                i11 = i12;
                            }
                            if (i13 != 0) {
                                return i13;
                            }
                            if (r0(iVar.F(j9))) {
                                n0("Expected value");
                                throw null;
                            }
                            o0();
                            throw null;
                        }
                        c11 = 6;
                        if (c10 != 5) {
                            i13 = 0;
                            if (i13 != 0) {
                                return i13;
                            }
                            if (r0(iVar.F(j9))) {
                                n0("Expected value");
                                throw null;
                            }
                            o0();
                            throw null;
                        }
                        c10 = c11;
                        i11 = i12;
                    }
                    if (c10 != 2) {
                        if (c10 != 2) {
                        }
                        this.J = i11;
                        i13 = 17;
                        this.H = 17;
                    } else {
                        if (c10 != 2) {
                        }
                        this.J = i11;
                        i13 = 17;
                        this.H = 17;
                    }
                    if (i13 != 0) {
                        return i13;
                    }
                    if (r0(iVar.F(j9))) {
                        n0("Expected value");
                        throw null;
                    }
                    o0();
                    throw null;
                }
            }
            if (i15 == 1) {
                iVar.readByte();
                this.H = 4;
                return 4;
            }
        }
        if (i15 == 1 || i15 == 2) {
            o0();
            throw null;
        }
        n0("Unexpected value");
        throw null;
    }

    public final int q0(String str, h7.b bVar) {
        int length = ((String[]) bVar.A).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) bVar.A)[i10])) {
                this.H = 0;
                this.C[this.A - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void r() {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 != 2) {
            throw new a("Expected END_OBJECT but was " + g4.c.v(O()) + " at path " + v());
        }
        int i10 = this.A;
        int i11 = i10 - 1;
        this.A = i11;
        this.C[i11] = null;
        int[] iArr = this.D;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.H = 0;
    }

    public final boolean r0(int i10) throws b {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        o0();
        throw null;
    }

    public final String s0() throws b, EOFException {
        String strU0;
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 14) {
            strU0 = v0();
        } else if (iP0 == 13) {
            strU0 = u0(M);
        } else if (iP0 == 12) {
            strU0 = u0(L);
        } else {
            if (iP0 != 15) {
                throw new a("Expected a name but was " + g4.c.v(O()) + " at path " + v());
            }
            strU0 = this.K;
        }
        this.H = 0;
        this.C[this.A - 1] = strU0;
        return strU0;
    }

    public final int t0(boolean z10) throws b, EOFException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            c0 c0Var = this.F;
            if (!c0Var.T(i11)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j9 = i10;
            i iVar = this.G;
            byte bF = iVar.F(j9);
            if (bF != 10 && bF != 32 && bF != 13 && bF != 9) {
                iVar.skip(j9);
                if (bF == 47) {
                    if (c0Var.T(2L)) {
                        o0();
                        throw null;
                    }
                } else if (bF == 35) {
                    o0();
                    throw null;
                }
                return bF;
            }
            i10 = i11;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.F + ")";
    }

    public final String u0(l lVar) throws b {
        StringBuilder sb2 = null;
        while (true) {
            long jI = this.F.i(lVar);
            if (jI == -1) {
                n0("Unterminated string");
                throw null;
            }
            i iVar = this.G;
            if (iVar.F(jI) != 92) {
                if (sb2 == null) {
                    String strZ = iVar.Z(jI, r30.a.a);
                    iVar.readByte();
                    return strZ;
                }
                sb2.append(iVar.Z(jI, r30.a.a));
                iVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(iVar.Z(jI, r30.a.a));
            iVar.readByte();
            sb2.append(w0());
        }
    }

    public final String v0() {
        long jI = this.F.i(N);
        i iVar = this.G;
        if (jI == -1) {
            return iVar.b0();
        }
        iVar.getClass();
        return iVar.Z(jI, r30.a.a);
    }

    public final char w0() throws b, EOFException {
        int i10;
        c0 c0Var = this.F;
        if (!c0Var.T(1L)) {
            n0("Unterminated escape sequence");
            throw null;
        }
        i iVar = this.G;
        byte b7 = iVar.readByte();
        if (b7 == 10 || b7 == 34 || b7 == 39 || b7 == 47 || b7 == 92) {
            return (char) b7;
        }
        if (b7 == 98) {
            return '\b';
        }
        if (b7 == 102) {
            return '\f';
        }
        if (b7 == 110) {
            return '\n';
        }
        if (b7 == 114) {
            return '\r';
        }
        if (b7 == 116) {
            return '\t';
        }
        if (b7 != 117) {
            n0("Invalid escape sequence: \\" + ((char) b7));
            throw null;
        }
        if (!c0Var.T(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + v());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bF = iVar.F(i11);
            char c11 = (char) (c10 << 4);
            if (bF >= 48 && bF <= 57) {
                i10 = bF - 48;
            } else if (bF >= 97 && bF <= 102) {
                i10 = bF - 87;
            } else {
                if (bF < 65 || bF > 70) {
                    n0("\\u".concat(iVar.Z(4L, r30.a.a)));
                    throw null;
                }
                i10 = bF - 55;
            }
            c10 = (char) (i10 + c11);
        }
        iVar.skip(4L);
        return c10;
    }

    @Override
    public final boolean x() throws b, EOFException {
        int iP0 = this.H;
        if (iP0 == 0) {
            iP0 = p0();
        }
        return (iP0 == 2 || iP0 == 4 || iP0 == 18) ? false : true;
    }

    public final void x0(l lVar) throws b, EOFException {
        while (true) {
            long jI = this.F.i(lVar);
            if (jI == -1) {
                n0("Unterminated string");
                throw null;
            }
            i iVar = this.G;
            if (iVar.F(jI) != 92) {
                iVar.skip(jI + 1);
                return;
            } else {
                iVar.skip(jI + 1);
                w0();
            }
        }
    }
}
