package o8;

import a10.h0;
import a8.n0;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import e7.u;
import fh.d2;
import fh.q0;
import fh.t0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import k9.b3;

public final class i extends h0 {

    public static final b3 f11710g = new b3(24);

    public final g f11711f;

    public i(g gVar) {
        this.f11711f = gVar;
    }

    public static a Y(u uVar, int i10, int i11) {
        int iQ0;
        String strConcat;
        int iA = uVar.A();
        Charset charsetN0 = n0(iA);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        uVar.k(0, i12, bArr);
        if (i11 == 2) {
            strConcat = "image/" + w00.a.I(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iQ0 = 2;
        } else {
            iQ0 = q0(0, bArr);
            String strI = w00.a.I(new String(bArr, 0, iQ0, StandardCharsets.ISO_8859_1));
            strConcat = strI.indexOf(47) == -1 ? "image/".concat(strI) : strI;
        }
        int i13 = bArr[iQ0 + 1] & 255;
        int i14 = iQ0 + 2;
        int iP0 = p0(i14, iA, bArr);
        String str = new String(bArr, i14, iP0 - i14, charsetN0);
        int iM0 = m0(iA) + iP0;
        return new a(strConcat, str, i13, i12 <= iM0 ? i0.f5137b : Arrays.copyOfRange(bArr, iM0, i12));
    }

    public static c Z(u uVar, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int i13 = uVar.f5183b;
        int iQ0 = q0(i13, uVar.f5182a);
        String str = new String(uVar.f5182a, i13, iQ0 - i13, StandardCharsets.ISO_8859_1);
        uVar.N(iQ0 + 1);
        int iM = uVar.m();
        int iM2 = uVar.m();
        long jC = uVar.C();
        if (jC == 4294967295L) {
            jC = -1;
        }
        long jC2 = uVar.C();
        long j9 = jC2 == 4294967295L ? -1L : jC2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (uVar.f5183b < i14) {
            j jVarC0 = c0(i11, uVar, z10, i12, gVar);
            if (jVarC0 != null) {
                arrayList.add(jVarC0);
            }
        }
        return new c(str, iM, iM2, jC, j9, (j[]) arrayList.toArray(new j[0]));
    }

    public static d a0(u uVar, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int i13 = uVar.f5183b;
        int iQ0 = q0(i13, uVar.f5182a);
        String str = new String(uVar.f5182a, i13, iQ0 - i13, StandardCharsets.ISO_8859_1);
        uVar.N(iQ0 + 1);
        int iA = uVar.A();
        boolean z11 = (iA & 2) != 0;
        boolean z12 = (iA & 1) != 0;
        int iA2 = uVar.A();
        String[] strArr = new String[iA2];
        for (int i14 = 0; i14 < iA2; i14++) {
            int i15 = uVar.f5183b;
            int iQ1 = q0(i15, uVar.f5182a);
            strArr[i14] = new String(uVar.f5182a, i15, iQ1 - i15, StandardCharsets.ISO_8859_1);
            uVar.N(iQ1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (uVar.f5183b < i16) {
            j jVarC0 = c0(i11, uVar, z10, i12, gVar);
            if (jVarC0 != null) {
                arrayList.add(jVarC0);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e b0(int i10, u uVar) {
        if (i10 < 4) {
            return null;
        }
        int iA = uVar.A();
        Charset charsetN0 = n0(iA);
        byte[] bArr = new byte[3];
        uVar.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        uVar.k(0, i11, bArr2);
        int iP0 = p0(0, iA, bArr2);
        String str2 = new String(bArr2, 0, iP0, charsetN0);
        int iM0 = m0(iA) + iP0;
        return new e(str, str2, g0(bArr2, iM0, p0(iM0, iA, bArr2), charsetN0));
    }

    public static j c0(int i10, u uVar, boolean z10, int i11, g gVar) throws Throwable {
        int iE;
        int i12;
        ?? r4;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r10;
        int i13;
        int i14;
        ?? r7;
        Throwable th2;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        u uVar2;
        Object bVar;
        int i15 = i10;
        int iA = uVar.A();
        int iA2 = uVar.A();
        int iA3 = uVar.A();
        int iA4 = i15 >= 3 ? uVar.A() : 0;
        if (i15 == 4) {
            iE = uVar.E();
            if (!z10) {
                iE = (((iE >> 24) & 255) << 21) | (iE & 255) | (((iE >> 8) & 255) << 7) | (((iE >> 16) & 255) << 14);
            }
        } else {
            iE = i15 == 3 ? uVar.E() : uVar.D();
        }
        int iR0 = iE;
        int iH = i15 >= 3 ? uVar.H() : 0;
        if (iA == 0 && iA2 == 0 && iA3 == 0 && iA4 == 0 && iR0 == 0 && iH == 0) {
            uVar.N(uVar.f5184c);
            return null;
        }
        int i16 = uVar.f5183b + iR0;
        if (i16 > uVar.f5184c) {
            e7.a.m("Id3Decoder", "Frame size exceeds remaining tag data");
            uVar.N(uVar.f5184c);
            return null;
        }
        if (gVar != null) {
            boolean zG = gVar.g(i15, iA, iA2, iA3, iA4);
            i15 = i15;
            r4 = iA;
            i12 = iA2;
            if (!zG) {
                uVar.N(i16);
                return null;
            }
        } else {
            i12 = iA2;
            r4 = iA;
        }
        if (i15 == 3) {
            z11 = (iH & Cast.MAX_NAMESPACE_LENGTH) != 0;
            z14 = (iH & 64) != 0;
            z15 = false;
            z13 = (iH & 32) != 0;
            z12 = z11;
        } else if (i15 == 4) {
            boolean z16 = (iH & 64) != 0;
            boolean z17 = (iH & 8) != 0;
            z14 = (iH & 4) != 0;
            z15 = (iH & 2) != 0;
            z12 = (iH & 1) != 0;
            boolean z18 = z17;
            z13 = z16;
            z11 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z11 || z14) {
            e7.a.m("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            uVar.N(i16);
            return null;
        }
        if (z13) {
            iR0--;
            uVar.O(1);
        }
        if (z12) {
            iR0 -= 4;
            uVar.O(4);
        }
        if (z15) {
            iR0 = r0(iR0, uVar);
        }
        try {
            try {
                if (r4 == 84 && i12 == 88 && iA3 == 88 && (i15 == 2 || iA4 == 88)) {
                    bVar = j0(iR0, uVar);
                } else if (r4 == 84) {
                    bVar = h0(iR0, uVar, o0(i15, r4, i12, iA3, iA4));
                } else if (r4 == 87 && i12 == 88 && iA3 == 88 && (i15 == 2 || iA4 == 88)) {
                    bVar = l0(iR0, uVar);
                } else {
                    if (r4 != 87) {
                        if (r4 == 80 && i12 == 82 && iA3 == 73 && iA4 == 86) {
                            bVar = f0(iR0, uVar);
                        } else {
                            th2 = null;
                            try {
                                if (r4 != 71 || i12 != 69 || iA3 != 79 || (iA4 != 66 && i15 != 2)) {
                                    if (i15 == 2) {
                                        if (r4 == 80 && i12 == 73 && iA3 == 67) {
                                            bVar = Y(uVar, iR0, i15);
                                        } else if (r4 != 67 && i12 == 79 && iA3 == 77 && (iA4 == 77 || i15 == 2)) {
                                            bVar = b0(iR0, uVar);
                                        } else if (r4 != 67 && i12 == 72 && iA3 == 65 && iA4 == 80) {
                                            int i17 = iR0;
                                            iR0 = i12;
                                            i12 = i17;
                                            r14 = r4;
                                            i13 = iA3;
                                            i14 = iA4;
                                            try {
                                                bVar = Z(uVar, i12, i15, z10, i11, gVar);
                                                i15 = i10;
                                                r4 = uVar;
                                            } catch (Exception | OutOfMemoryError e3) {
                                                e = e3;
                                                i15 = i10;
                                                r7 = uVar;
                                                r10 = r14;
                                                r7.N(i16);
                                                r12 = th2;
                                                r13 = r10;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r11 = uVar;
                                                r11.N(i16);
                                                throw th;
                                            }
                                        } else {
                                            int i18 = iR0;
                                            iR0 = i12;
                                            i12 = i18;
                                            r14 = r4;
                                            i13 = iA3;
                                            i14 = iA4;
                                            try {
                                                if (r14 != 67 && iR0 == 84 && i13 == 79 && i14 == 67) {
                                                    i15 = i10;
                                                    u uVar3 = uVar;
                                                    bVar = a0(uVar3, i12, i15, z10, i11, gVar);
                                                    r4 = uVar3;
                                                } else {
                                                    i15 = i10;
                                                    uVar2 = uVar;
                                                    if (r14 != 77 && iR0 == 76 && i13 == 76 && i14 == 84) {
                                                        bVar = e0(i12, uVar2);
                                                        r4 = uVar2;
                                                    } else {
                                                        String strO0 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                        byte[] bArr = new byte[i12];
                                                        uVar2.k(0, i12, bArr);
                                                        bVar = new b(strO0, bArr);
                                                        r4 = uVar2;
                                                    }
                                                }
                                            } catch (Exception | OutOfMemoryError e10) {
                                                e = e10;
                                                r7 = r4;
                                                r10 = r14;
                                                r7.N(i16);
                                                r12 = th2;
                                                r13 = r10;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r11 = r4;
                                                r11.N(i16);
                                                throw th;
                                            }
                                        }
                                    } else if (r4 == 65 && i12 == 80 && iA3 == 73 && iA4 == 67) {
                                        bVar = Y(uVar, iR0, i15);
                                    } else {
                                        if (r4 != 67) {
                                        }
                                        if (r4 != 67) {
                                            int i19 = iR0;
                                            iR0 = i12;
                                            i12 = i19;
                                            r14 = r4;
                                            i13 = iA3;
                                            i14 = iA4;
                                            if (r14 != 67) {
                                                i15 = i10;
                                                uVar2 = uVar;
                                                if (r14 != 77) {
                                                    String strO1 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr2 = new byte[i12];
                                                    uVar2.k(0, i12, bArr2);
                                                    bVar = new b(strO1, bArr2);
                                                    r4 = uVar2;
                                                } else {
                                                    String strO2 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr3 = new byte[i12];
                                                    uVar2.k(0, i12, bArr3);
                                                    bVar = new b(strO2, bArr3);
                                                    r4 = uVar2;
                                                }
                                            } else {
                                                i15 = i10;
                                                uVar2 = uVar;
                                                if (r14 != 77) {
                                                    String strO3 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr4 = new byte[i12];
                                                    uVar2.k(0, i12, bArr4);
                                                    bVar = new b(strO3, bArr4);
                                                    r4 = uVar2;
                                                } else {
                                                    String strO4 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr5 = new byte[i12];
                                                    uVar2.k(0, i12, bArr5);
                                                    bVar = new b(strO4, bArr5);
                                                    r4 = uVar2;
                                                }
                                            }
                                        } else {
                                            int i110 = iR0;
                                            iR0 = i12;
                                            i12 = i110;
                                            r14 = r4;
                                            i13 = iA3;
                                            i14 = iA4;
                                            if (r14 != 67) {
                                                i15 = i10;
                                                uVar2 = uVar;
                                                if (r14 != 77) {
                                                    String strO5 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr6 = new byte[i12];
                                                    uVar2.k(0, i12, bArr6);
                                                    bVar = new b(strO5, bArr6);
                                                    r4 = uVar2;
                                                } else {
                                                    String strO6 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr7 = new byte[i12];
                                                    uVar2.k(0, i12, bArr7);
                                                    bVar = new b(strO6, bArr7);
                                                    r4 = uVar2;
                                                }
                                            } else {
                                                i15 = i10;
                                                uVar2 = uVar;
                                                if (r14 != 77) {
                                                    String strO7 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr8 = new byte[i12];
                                                    uVar2.k(0, i12, bArr8);
                                                    bVar = new b(strO7, bArr8);
                                                    r4 = uVar2;
                                                } else {
                                                    String strO8 = o0(i15, r14 == true ? 1 : 0, iR0, i13, i14);
                                                    byte[] bArr9 = new byte[i12];
                                                    uVar2.k(0, i12, bArr9);
                                                    bVar = new b(strO8, bArr9);
                                                    r4 = uVar2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        e7.a.n("Id3Decoder", "Failed to decode frame: id=" + o0(i15, r13, iR0, i13, i14) + ", frameSize=" + i12, e);
                                    }
                                    return r12;
                                }
                                bVar = d0(iR0, uVar);
                                int i20 = iR0;
                                iR0 = i12;
                                i12 = i20;
                                r14 = r4;
                                i13 = iA3;
                                i14 = iA4;
                                r4 = uVar;
                            } catch (Exception | OutOfMemoryError e11) {
                                e = e11;
                                int i21 = iR0;
                                iR0 = i12;
                                i12 = i21;
                                r10 = r4;
                                i13 = iA3;
                                i14 = iA4;
                                r7 = uVar;
                            }
                        }
                        r4.N(i16);
                        r12 = bVar;
                        e = th2;
                        r13 = r14;
                        if (r12 == 0) {
                            e7.a.n("Id3Decoder", "Failed to decode frame: id=" + o0(i15, r13, iR0, i13, i14) + ", frameSize=" + i12, e);
                        }
                        return r12;
                    }
                    bVar = k0(iR0, uVar, o0(i15, r4, i12, iA3, iA4));
                }
                int i22 = iR0;
                iR0 = i12;
                i12 = i22;
                r14 = r4;
                i13 = iA3;
                i14 = iA4;
                r4 = uVar;
                th2 = null;
                r4.N(i16);
                r12 = bVar;
                e = th2;
                r13 = r14;
            } catch (Throwable th5) {
                th = th5;
                r11 = uVar;
            }
        } catch (Exception | OutOfMemoryError e12) {
            e = e12;
            int i23 = iR0;
            iR0 = i12;
            i12 = i23;
            r10 = r4;
            i13 = iA3;
            i14 = iA4;
            r7 = uVar;
            th2 = null;
        }
        if (r12 == 0) {
            e7.a.n("Id3Decoder", "Failed to decode frame: id=" + o0(i15, r13, iR0, i13, i14) + ", frameSize=" + i12, e);
        }
        return r12;
    }

    public static f d0(int i10, u uVar) {
        int iA = uVar.A();
        Charset charsetN0 = n0(iA);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.k(0, i11, bArr);
        int iQ0 = q0(0, bArr);
        String strN = x0.n(new String(bArr, 0, iQ0, StandardCharsets.ISO_8859_1));
        int i12 = iQ0 + 1;
        int iP0 = p0(i12, iA, bArr);
        String strG0 = g0(bArr, i12, iP0, charsetN0);
        int iM0 = m0(iA) + iP0;
        int iP1 = p0(iM0, iA, bArr);
        String strG1 = g0(bArr, iM0, iP1, charsetN0);
        int iM1 = m0(iA) + iP1;
        return new f(strN, strG0, strG1, i11 <= iM1 ? i0.f5137b : Arrays.copyOfRange(bArr, iM1, i11));
    }

    public static m e0(int i10, u uVar) {
        int iH = uVar.H();
        int iD = uVar.D();
        int iD2 = uVar.D();
        int iA = uVar.A();
        int iA2 = uVar.A();
        n0 n0Var = new n0();
        n0Var.p(uVar);
        int i11 = ((i10 - 10) * 8) / (iA + iA2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = n0Var.i(iA);
            int i14 = n0Var.i(iA2);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new m(iH, iD, iD2, iArr, iArr2);
    }

    public static n f0(int i10, u uVar) {
        byte[] bArr = new byte[i10];
        uVar.k(0, i10, bArr);
        int iQ0 = q0(0, bArr);
        String str = new String(bArr, 0, iQ0, StandardCharsets.ISO_8859_1);
        int i11 = iQ0 + 1;
        return new n(str, i10 <= i11 ? i0.f5137b : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static String g0(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? RuntimeVersion.SUFFIX : new String(bArr, i10, i11 - i10, charset);
    }

    public static o h0(int i10, u uVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int iA = uVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.k(0, i11, bArr);
        return new o(str, null, i0(iA, 0, bArr));
    }

    public static d2 i0(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return t0.s(RuntimeVersion.SUFFIX);
        }
        q0 q0VarM = t0.m();
        int iP0 = p0(i11, i10, bArr);
        while (i11 < iP0) {
            q0VarM.c(new String(bArr, i11, iP0 - i11, n0(i10)));
            i11 = m0(i10) + iP0;
            iP0 = p0(i11, i10, bArr);
        }
        d2 d2VarG = q0VarM.g();
        return d2VarG.isEmpty() ? t0.s(RuntimeVersion.SUFFIX) : d2VarG;
    }

    public static o j0(int i10, u uVar) {
        if (i10 < 1) {
            return null;
        }
        int iA = uVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.k(0, i11, bArr);
        int iP0 = p0(0, iA, bArr);
        return new o("TXXX", new String(bArr, 0, iP0, n0(iA)), i0(iA, m0(iA) + iP0, bArr));
    }

    public static p k0(int i10, u uVar, String str) {
        byte[] bArr = new byte[i10];
        uVar.k(0, i10, bArr);
        return new p(str, null, new String(bArr, 0, q0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p l0(int i10, u uVar) {
        if (i10 < 1) {
            return null;
        }
        int iA = uVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.k(0, i11, bArr);
        int iP0 = p0(0, iA, bArr);
        String str = new String(bArr, 0, iP0, n0(iA));
        int iM0 = m0(iA) + iP0;
        return new p("WXXX", str, g0(bArr, iM0, q0(iM0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int m0(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset n0(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String o0(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int p0(int i10, int i11, byte[] bArr) {
        int iQ0 = q0(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iQ0;
        }
        while (iQ0 < bArr.length - 1) {
            if ((iQ0 - i10) % 2 == 0 && bArr[iQ0 + 1] == 0) {
                return iQ0;
            }
            iQ0 = q0(iQ0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int q0(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int r0(int i10, u uVar) {
        byte[] bArr = uVar.f5182a;
        int i11 = uVar.f5183b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    public static boolean s0(u uVar, int i10, int i11, boolean z10) {
        int iD;
        long jD;
        int iH;
        int i12;
        int i13 = uVar.f5183b;
        while (true) {
            try {
                boolean z11 = true;
                if (uVar.a() < i11) {
                    uVar.N(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iD = uVar.m();
                    jD = uVar.C();
                    iH = uVar.H();
                } else {
                    iD = uVar.D();
                    jD = uVar.D();
                    iH = 0;
                }
                if (iD == 0 && jD == 0 && iH == 0) {
                    uVar.N(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jD) != 0) {
                        uVar.N(i13);
                        return false;
                    }
                    jD = (((jD >> 24) & 255) << 21) | (jD & 255) | (((jD >> 8) & 255) << 7) | (((jD >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iH & 64) != 0 ? 1 : 0;
                    if ((iH & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iH & 32) != 0 ? 1 : 0;
                    if ((iH & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jD < i12) {
                    uVar.N(i13);
                    return false;
                }
                if (uVar.a() < jD) {
                    uVar.N(i13);
                    return false;
                }
                uVar.O((int) jD);
            } catch (Throwable th2) {
                uVar.N(i13);
                throw th2;
            }
        }
    }

    public final v0 X(int i10, byte[] bArr) {
        boolean z10;
        h hVar;
        int i11;
        int i12;
        int iR0;
        j jVarC0;
        ArrayList arrayList = new ArrayList();
        u uVar = new u(i10, bArr);
        boolean z11 = false;
        if (uVar.a() < 10) {
            e7.a.m("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iD = uVar.D();
            if (iD == 4801587) {
                int iA = uVar.A();
                uVar.O(1);
                int iA2 = uVar.A();
                int iZ = uVar.z();
                if (iA != 2) {
                    if (iA == 3) {
                        if ((iA2 & 64) != 0) {
                            int iM = uVar.m();
                            uVar.O(iM);
                            iZ -= iM + 4;
                        }
                    } else if (iA == 4) {
                        if ((iA2 & 64) != 0) {
                            int iZ2 = uVar.z();
                            uVar.O(iZ2 - 4);
                            iZ -= iZ2;
                        }
                        if ((iA2 & 16) != 0) {
                            iZ -= 10;
                        }
                    } else {
                        a1.b.y("Skipped ID3 tag with unsupported majorVersion=", iA, "Id3Decoder");
                    }
                    if (iA < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    hVar = new h(iA, iZ, z10);
                } else if ((iA2 & 64) != 0) {
                    e7.a.m("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iA < 4 || (iA2 & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    hVar = new h(iA, iZ, z10);
                }
                if (hVar == null) {
                    return null;
                }
                i11 = hVar.f11707a;
                int i13 = uVar.f5183b;
                i12 = i11 == 2 ? 6 : 10;
                iR0 = hVar.f11709c;
                if (hVar.f11708b) {
                    iR0 = r0(iR0, uVar);
                }
                uVar.M(i13 + iR0);
                if (!s0(uVar, i11, i12, false)) {
                    if (i11 == 4 || !s0(uVar, 4, i12, true)) {
                        a1.b.y("Failed to validate ID3 tag with majorVersion=", i11, "Id3Decoder");
                        return null;
                    }
                    z11 = true;
                }
                while (uVar.a() >= i12) {
                    jVarC0 = c0(i11, uVar, z11, i12, this.f11711f);
                    if (jVarC0 != null) {
                        arrayList.add(jVarC0);
                    }
                }
                return new v0(arrayList);
            }
            e7.a.m("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iD))));
        }
        hVar = null;
        if (hVar == null) {
            return null;
        }
        i11 = hVar.f11707a;
        int i14 = uVar.f5183b;
        if (i11 == 2) {
        }
        iR0 = hVar.f11709c;
        if (hVar.f11708b) {
            iR0 = r0(iR0, uVar);
        }
        uVar.M(i14 + iR0);
        if (!s0(uVar, i11, i12, false)) {
            if (i11 == 4) {
            }
            a1.b.y("Failed to validate ID3 tag with majorVersion=", i11, "Id3Decoder");
            return null;
        }
        while (uVar.a() >= i12) {
            jVarC0 = c0(i11, uVar, z11, i12, this.f11711f);
            if (jVarC0 != null) {
                arrayList.add(jVarC0);
            }
        }
        return new v0(arrayList);
    }

    public final v0 t(j8.a aVar, ByteBuffer byteBuffer) {
        return X(byteBuffer.limit(), byteBuffer.array());
    }
}
