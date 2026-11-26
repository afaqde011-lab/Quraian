package f7;

import a8.n0;
import fh.d2;
import fh.q0;
import fh.t0;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import l9.f0;
import ta.c0;

public abstract class p {

    public static final byte[] f5547a = {0, 0, 0, 1};

    public static final float[] f5548b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    public static final Object f5549c = new Object();

    public static int[] f5550d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        c0.A(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b7 = bArr[i14];
            if ((b7 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b7 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static String c(androidx.media3.common.t tVar) {
        String str = tVar.f1594n;
        String str2 = tVar.f1593k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return tVar.f1594n;
    }

    public static boolean d(byte[] bArr, int i10, androidx.media3.common.t tVar) {
        int i11;
        if (Objects.equals(tVar.f1594n, "video/avc")) {
            byte b7 = bArr[4];
            if (((b7 & 96) >> 5) == 0 && ((i11 = b7 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(tVar.f1594n, "video/hevc")) {
            a8.d dVarF = f(new n0(bArr, 4, i10 + 4));
            int i12 = dVarF.f238a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && dVarF.f240c == tVar.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(androidx.media3.common.t tVar) {
        String strC = c(tVar);
        if (Objects.equals(strC, "video/avc")) {
            return 1;
        }
        return Objects.equals(strC, "video/hevc") ? 2 : 0;
    }

    public static a8.d f(n0 n0Var) {
        n0Var.s();
        return new a8.d(n0Var.i(6), n0Var.i(6), n0Var.i(3) - 1);
    }

    public static i g(n0 n0Var, boolean z10, int i10, i iVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zH;
        int i14;
        int i15;
        int i16;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (iVar != null) {
                int i17 = iVar.f5501a;
                zH = iVar.f5502b;
                i14 = iVar.f5503c;
                i15 = iVar.f5504d;
                iArr2 = iVar.f5505e;
                i11 = i17;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int i18 = n0Var.i(8);
            i16 = 0;
            for (int i19 = 0; i19 < i10; i19++) {
                if (n0Var.h()) {
                    i16 += 88;
                }
                if (n0Var.h()) {
                    i16 += 8;
                }
            }
            n0Var.t(i16);
            if (i10 > 0) {
                n0Var.t((8 - i10) * 2);
            }
            return new i(i11, z11, i12, i13, iArr, i18);
        }
        int i20 = n0Var.i(2);
        zH = n0Var.h();
        i14 = n0Var.i(5);
        i15 = 0;
        for (int i21 = 0; i21 < 32; i21++) {
            if (n0Var.h()) {
                i15 |= 1 << i21;
            }
        }
        for (int i22 = 0; i22 < 6; i22++) {
            iArr2[i22] = n0Var.i(8);
        }
        i11 = i20;
        iArr = iArr2;
        z11 = zH;
        i12 = i14;
        i13 = i15;
        int i110 = n0Var.i(8);
        i16 = 0;
        while (i19 < i10) {
            if (n0Var.h()) {
                i16 += 88;
            }
            if (n0Var.h()) {
                i16 += 8;
            }
        }
        n0Var.t(i16);
        if (i10 > 0) {
            n0Var.t((8 - i10) * 2);
        }
        return new i(i11, z11, i12, i13, iArr, i110);
    }

    public static com.google.android.gms.internal.cast.o h(int i10, int i11, byte[] bArr) {
        byte b7;
        int i12 = i10 + 2;
        do {
            i11--;
            b7 = bArr[i11];
            if (b7 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b7 == 0 || i11 <= i12) {
            return null;
        }
        n0 n0Var = new n0(bArr, i12, i11 + 1);
        while (n0Var.d(16)) {
            int i13 = n0Var.i(8);
            int i14 = 0;
            while (i13 == 255) {
                i14 += 255;
                i13 = n0Var.i(8);
            }
            int i15 = i14 + i13;
            int i16 = n0Var.i(8);
            int i17 = 0;
            while (i16 == 255) {
                i17 += 255;
                i16 = n0Var.i(8);
            }
            int i18 = i17 + i16;
            if (i18 == 0 || !n0Var.d(i18)) {
                return null;
            }
            if (i15 == 176) {
                int iM = n0Var.m();
                boolean zH = n0Var.h();
                int iM2 = zH ? n0Var.m() : 0;
                int iM3 = n0Var.m();
                int iM4 = -1;
                for (int i19 = 0; i19 <= iM3; i19++) {
                    iM4 = n0Var.m();
                    n0Var.m();
                    int i20 = n0Var.i(6);
                    if (i20 == 63) {
                        return null;
                    }
                    n0Var.i(i20 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i20 + iM) - 31));
                    if (zH) {
                        int i21 = n0Var.i(6);
                        if (i21 == 63) {
                            return null;
                        }
                        n0Var.i(i21 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i21 + iM2) - 31));
                    }
                    if (n0Var.h()) {
                        n0Var.t(10);
                    }
                }
                return new com.google.android.gms.internal.cast.o(iM4);
            }
            n0Var.t(i18 * 8);
        }
        return null;
    }

    public static l i(byte[] bArr, int i10, int i11, oj.q qVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iM;
        int i16;
        int iM2;
        int i17;
        int i18;
        int iMax;
        int i19;
        int i20;
        int i21;
        int iF;
        int iG;
        int i22;
        j jVar;
        f0 f0Var;
        a8.d dVarF = f(new n0(bArr, i10, i11));
        n0 n0Var = new n0(bArr, i10 + 2, i11);
        int i23 = 4;
        n0Var.t(4);
        int i24 = n0Var.i(3);
        int i25 = dVarF.f239b;
        boolean z10 = i25 != 0 && i24 == 7;
        if (qVar != null) {
            t0 t0Var = (t0) qVar.B;
            if (t0Var.isEmpty()) {
                i12 = 0;
            } else {
                i12 = ((h) t0Var.get(Math.min(i25, t0Var.size() - 1))).f5499a;
            }
        } else {
            i12 = 0;
        }
        i iVarG = null;
        if (!z10) {
            n0Var.s();
            iVarG = g(n0Var, true, i24, null);
        } else if (qVar != null) {
            j jVar2 = (j) qVar.C;
            int[] iArr = jVar2.f5508b;
            t0 t0Var2 = jVar2.f5507a;
            int i26 = iArr[i12];
            if (t0Var2.size() > i26) {
                iVarG = (i) t0Var2.get(i26);
            }
        }
        n0Var.m();
        if (z10) {
            int i27 = n0Var.h() ? n0Var.i(8) : -1;
            if (qVar == null || (f0Var = (f0) qVar.D) == null) {
                iM = 0;
                iM2 = 0;
                i16 = 0;
                i18 = 0;
                i15 = 0;
                i17 = 0;
            } else {
                t0 t0Var3 = (t0) f0Var.B;
                if (i27 == -1) {
                    i27 = ((int[]) f0Var.C)[i12];
                }
                if (i27 == -1 || t0Var3.size() <= i27) {
                    iM = 0;
                    iM2 = 0;
                    i16 = 0;
                    i18 = 0;
                    i15 = 0;
                    i17 = 0;
                } else {
                    k kVar = (k) t0Var3.get(i27);
                    int i28 = kVar.f5509a;
                    i16 = kVar.f5512d;
                    int i29 = kVar.f5513e;
                    iM = kVar.f5510b;
                    iM2 = kVar.f5511c;
                    i15 = i29;
                    i17 = i15;
                    i18 = i16;
                }
            }
        } else {
            int iM3 = n0Var.m();
            if (iM3 == 3) {
                n0Var.s();
            }
            int iM4 = n0Var.m();
            int iM5 = n0Var.m();
            if (n0Var.h()) {
                int iM6 = n0Var.m();
                int iM7 = n0Var.m();
                int iM8 = n0Var.m();
                int iM9 = n0Var.m();
                i13 = iM4 - ((iM6 + iM7) * ((iM3 == 1 || iM3 == 2) ? 2 : 1));
                i14 = iM5 - ((iM8 + iM9) * (iM3 == 1 ? 2 : 1));
            } else {
                i13 = iM4;
                i14 = iM5;
            }
            i15 = i14;
            iM = n0Var.m();
            i16 = i13;
            iM2 = n0Var.m();
            i17 = iM5;
            i18 = iM4;
        }
        int iM10 = n0Var.m();
        if (z10) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i30 = n0Var.h() ? 0 : i24; i30 <= i24; i30++) {
                n0Var.m();
                iMax = Math.max(n0Var.m(), iMax);
                n0Var.m();
            }
        }
        n0Var.m();
        n0Var.m();
        n0Var.m();
        n0Var.m();
        n0Var.m();
        n0Var.m();
        if (n0Var.h()) {
            int i31 = 6;
            if (z10 ? n0Var.h() : false) {
                n0Var.t(6);
            } else if (n0Var.h()) {
                int i32 = 0;
                while (i32 < i23) {
                    int i33 = 0;
                    while (i33 < i31) {
                        if (n0Var.h()) {
                            int iMin = Math.min(64, 1 << ((i32 << 1) + 4));
                            if (i32 > 1) {
                                n0Var.n();
                            }
                            for (int i34 = 0; i34 < iMin; i34++) {
                                n0Var.n();
                            }
                        } else {
                            n0Var.m();
                        }
                        i33 += i32 == 3 ? 3 : 1;
                        i31 = 6;
                    }
                    i32++;
                    i23 = 4;
                    i31 = 6;
                }
            }
        }
        n0Var.t(2);
        if (n0Var.h()) {
            n0Var.t(8);
            n0Var.m();
            n0Var.m();
            n0Var.s();
        }
        int iM11 = n0Var.m();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i35 = 0;
        int iM12 = -1;
        int i36 = -1;
        while (i35 < iM11) {
            if (i35 == 0 || !n0Var.h()) {
                int iM13 = n0Var.m();
                iM12 = n0Var.m();
                int[] iArr3 = new int[iM13];
                int i37 = 0;
                while (i37 < iM13) {
                    iArr3[i37] = (i37 > 0 ? iArr3[i37 - 1] : 0) - (n0Var.m() + 1);
                    n0Var.s();
                    i37++;
                }
                int[] iArr4 = new int[iM12];
                int i38 = 0;
                while (i38 < iM12) {
                    iArr4[i38] = n0Var.m() + 1 + (i38 > 0 ? iArr4[i38 - 1] : 0);
                    n0Var.s();
                    i38++;
                }
                i36 = iM13;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i39 = i36 + iM12;
                int iM14 = (1 - ((n0Var.h() ? 1 : 0) * 2)) * (n0Var.m() + 1);
                int i40 = i39 + 1;
                boolean[] zArr = new boolean[i40];
                for (int i41 = 0; i41 <= i39; i41++) {
                    if (n0Var.h()) {
                        zArr[i41] = true;
                    } else {
                        zArr[i41] = n0Var.h();
                    }
                }
                int[] iArr5 = new int[i40];
                int[] iArr6 = new int[i40];
                int i42 = 0;
                for (int i43 = iM12 - 1; i43 >= 0; i43--) {
                    int i44 = iArrCopyOf[i43] + iM14;
                    if (i44 < 0 && zArr[i36 + i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                if (iM14 < 0 && zArr[i39]) {
                    iArr5[i42] = iM14;
                    i42++;
                }
                int i45 = i42;
                int[] iArr7 = iArr2;
                for (int i46 = 0; i46 < i36; i46++) {
                    int i47 = iArr7[i46] + iM14;
                    if (i47 < 0 && zArr[i46]) {
                        iArr5[i45] = i47;
                        i45++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i45);
                int i48 = 0;
                for (int i49 = i36 - 1; i49 >= 0; i49--) {
                    int i50 = iArr7[i49] + iM14;
                    if (i50 > 0 && zArr[i49]) {
                        iArr6[i48] = i50;
                        i48++;
                    }
                }
                if (iM14 > 0 && zArr[i39]) {
                    iArr6[i48] = iM14;
                    i48++;
                }
                int i51 = i45;
                int i52 = i48;
                for (int i53 = 0; i53 < iM12; i53++) {
                    int i54 = iArrCopyOf[i53] + iM14;
                    if (i54 > 0 && zArr[i36 + i53]) {
                        iArr6[i52] = i54;
                        i52++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i52);
                iM12 = i52;
                i36 = i51;
                iArr2 = iArrCopyOf2;
            }
            i35++;
            iM11 = iM11;
            i12 = i12;
        }
        int i55 = i12;
        if (n0Var.h()) {
            int iM15 = n0Var.m();
            for (int i56 = 0; i56 < iM15; i56++) {
                n0Var.t(iM10 + 5);
            }
        }
        n0Var.t(2);
        float f3 = 1.0f;
        if (n0Var.h()) {
            if (n0Var.h()) {
                int i57 = n0Var.i(8);
                if (i57 == 255) {
                    int i58 = n0Var.i(16);
                    int i59 = n0Var.i(16);
                    if (i58 != 0 && i59 != 0) {
                        f3 = i58 / i59;
                    }
                } else if (i57 < 17) {
                    f3 = f5548b[i57];
                } else {
                    a1.b.y("Unexpected aspect_ratio_idc value: ", i57, "NalUnitUtil");
                }
            }
            if (n0Var.h()) {
                n0Var.s();
            }
            if (n0Var.h()) {
                n0Var.t(3);
                i22 = n0Var.h() ? 1 : 2;
                if (n0Var.h()) {
                    int i60 = n0Var.i(8);
                    int i61 = n0Var.i(8);
                    n0Var.t(8);
                    iF = androidx.media3.common.i.f(i60);
                    iG = androidx.media3.common.i.g(i61);
                } else {
                    iF = -1;
                    iG = -1;
                }
            } else if (qVar == null || (jVar = (j) qVar.E) == null) {
                iF = -1;
                iG = -1;
                i22 = -1;
            } else {
                t0 t0Var4 = jVar.f5507a;
                int i62 = jVar.f5508b[i55];
                if (t0Var4.size() > i62) {
                    m mVar = (m) t0Var4.get(i62);
                    int i63 = mVar.f5525a;
                    int i64 = mVar.f5526b;
                    iG = mVar.f5527c;
                    iF = i63;
                    i22 = i64;
                } else {
                    iF = -1;
                    iG = -1;
                    i22 = -1;
                }
            }
            if (n0Var.h()) {
                n0Var.m();
                n0Var.m();
            }
            n0Var.s();
            if (n0Var.h()) {
                i15 *= 2;
            }
            i19 = iF;
            i21 = iG;
            i20 = i22;
        } else {
            i19 = -1;
            i20 = -1;
            i21 = -1;
        }
        return new l(i24, iVarG, iM, iM2, i16, i15, i18, i17, f3, iMax, i19, i20, i21);
    }

    public static oj.q j(int i10, int i11, byte[] bArr) {
        int[] iArr;
        j jVar;
        int i12;
        int i13;
        int i14;
        int i15;
        d2 d2Var;
        boolean[][] zArr;
        int i16;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z10;
        int i17;
        boolean zH;
        int i18;
        int i19;
        int i20;
        boolean zH2;
        boolean zH3;
        int iM;
        int i21;
        int i22;
        int i23;
        boolean z11;
        boolean z12;
        n0 n0Var = new n0(bArr, i10, i11);
        f(n0Var);
        n0Var.t(4);
        boolean zH4 = n0Var.h();
        boolean zH5 = n0Var.h();
        int i24 = n0Var.i(6);
        int i25 = i24 + 1;
        int i26 = n0Var.i(3);
        n0Var.t(17);
        i iVarG = g(n0Var, true, i26, null);
        for (int i27 = n0Var.h() ? 0 : i26; i27 <= i26; i27++) {
            n0Var.m();
            n0Var.m();
            n0Var.m();
        }
        int i28 = n0Var.i(6);
        int iM2 = n0Var.m() + 1;
        int i29 = 6;
        int i30 = 1;
        j jVar2 = new j(t0.s(iVarG), new int[1], 0);
        boolean z13 = i25 >= 2 && iM2 >= 2;
        boolean z14 = zH4 && zH5;
        int i31 = i28 + 1;
        boolean z15 = i31 >= i25;
        if (!z13 || !z14 || !z15) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM2, i31);
        int[] iArr5 = new int[iM2];
        int[] iArr6 = new int[iM2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i32 = 1; i32 < iM2; i32++) {
            int i33 = 0;
            for (int i34 = 0; i34 <= i28; i34++) {
                if (n0Var.h()) {
                    iArr4[i32][i33] = i34;
                    iArr6[i32] = i34;
                    i33++;
                }
                iArr5[i32] = i33;
            }
        }
        if (n0Var.h()) {
            n0Var.t(64);
            if (n0Var.h()) {
                n0Var.m();
            }
            int iM3 = n0Var.m();
            int i35 = 0;
            while (i35 < iM3) {
                n0Var.m();
                if (i35 == 0 || n0Var.h()) {
                    boolean zH6 = n0Var.h();
                    boolean zH7 = n0Var.h();
                    z12 = zH6;
                    z11 = zH7;
                    if (zH6 || zH7) {
                        zH = n0Var.h();
                        if (zH) {
                            n0Var.t(19);
                        }
                        n0Var.t(8);
                        if (zH) {
                            n0Var.t(4);
                        }
                        n0Var.t(15);
                        i19 = zH6;
                        i18 = zH7;
                    }
                    i20 = 0;
                    while (i20 <= i26) {
                        zH2 = n0Var.h();
                        if (!zH2) {
                            zH2 = n0Var.h();
                        }
                        if (zH2) {
                            n0Var.m();
                            zH3 = false;
                        } else {
                            zH3 = n0Var.h();
                        }
                        if (zH3) {
                            iM = 0;
                        } else {
                            iM = n0Var.m();
                        }
                        int[][] iArr7 = iArr4;
                        i21 = i19 + i18;
                        int[] iArr8 = iArr6;
                        i22 = 0;
                        while (i22 < i21) {
                            int i36 = i21;
                            for (i23 = 0; i23 <= iM; i23++) {
                                n0Var.m();
                                n0Var.m();
                                if (zH) {
                                    n0Var.m();
                                    n0Var.m();
                                }
                                n0Var.s();
                            }
                            i22++;
                            i21 = i36;
                        }
                        i20++;
                        i35 = i35;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i35++;
                } else {
                    z12 = false;
                    z11 = false;
                }
                zH = false;
                i19 = z12;
                i18 = z11;
                i20 = 0;
                while (i20 <= i26) {
                    zH2 = n0Var.h();
                    if (!zH2) {
                        zH2 = n0Var.h();
                    }
                    if (zH2) {
                        n0Var.m();
                        zH3 = false;
                    } else {
                        zH3 = n0Var.h();
                    }
                    if (zH3) {
                        iM = n0Var.m();
                    } else {
                        iM = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i21 = i19 + i18;
                    int[] iArr10 = iArr6;
                    i22 = 0;
                    while (i22 < i21) {
                        int i37 = i21;
                        while (i23 <= iM) {
                            n0Var.m();
                            n0Var.m();
                            if (zH) {
                                n0Var.m();
                                n0Var.m();
                            }
                            n0Var.s();
                        }
                        i22++;
                        i21 = i37;
                    }
                    i20++;
                    i35 = i35;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i35++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!n0Var.h()) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        int i38 = n0Var.f303e;
        if (i38 > 0) {
            n0Var.t(8 - i38);
        }
        i iVarG2 = g(n0Var, false, i26, iVarG);
        boolean zH8 = n0Var.h();
        boolean[] zArr3 = new boolean[16];
        int i39 = 0;
        for (int i40 = 0; i40 < 16; i40++) {
            boolean zH9 = n0Var.h();
            zArr3[i40] = zH9;
            if (zH9) {
                i39++;
            }
        }
        if (i39 == 0 || !zArr3[1]) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        int[] iArr13 = new int[i39];
        for (int i41 = 0; i41 < i39 - (zH8 ? 1 : 0); i41++) {
            iArr13[i41] = n0Var.i(3);
        }
        int[] iArr14 = new int[i39 + 1];
        if (zH8) {
            int i42 = 1;
            while (i42 < i39) {
                int[] iArr15 = iArr14;
                for (int i43 = 0; i43 < i42; i43++) {
                    iArr15[i42] = iArr13[i43] + 1 + iArr15[i42];
                }
                i42++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i39] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i25, i39);
        int[] iArr17 = new int[i25];
        iArr17[0] = 0;
        boolean zH10 = n0Var.h();
        int i44 = 1;
        while (i44 < i25) {
            if (zH10) {
                i17 = i44;
                iArr17[i17] = n0Var.i(i29);
            } else {
                i17 = i44;
                iArr17[i17] = i17;
            }
            if (zH8) {
                int i45 = 0;
                while (i45 < i39) {
                    int i46 = i45 + 1;
                    iArr16[i17][i45] = (iArr17[i17] & ((1 << iArr[i46]) - 1)) >> iArr[i45];
                    i45 = i46;
                }
            } else {
                int i47 = 0;
                while (i47 < i39) {
                    int i48 = i47;
                    iArr16[i17][i48] = n0Var.i(iArr13[i47] + 1);
                    i47 = i48 + 1;
                }
            }
            i44 = i17 + 1;
            i29 = 6;
        }
        int[] iArr18 = new int[i31];
        int i49 = 1;
        int i50 = 0;
        while (i50 < i25) {
            iArr18[iArr17[i50]] = -1;
            int[] iArr19 = iArr18;
            int i51 = 0;
            int i52 = 0;
            while (i51 < 16) {
                if (zArr3[i51]) {
                    if (i51 == i30) {
                        iArr19[iArr17[i50]] = iArr16[i50][i52];
                    }
                    i52++;
                }
                i51++;
                i30 = 1;
            }
            if (i50 > 0) {
                int i53 = 0;
                while (true) {
                    if (i53 >= i50) {
                        z10 = true;
                        break;
                    }
                    int i54 = i53;
                    if (iArr19[iArr17[i50]] == iArr19[iArr17[i53]]) {
                        z10 = false;
                        break;
                    }
                    i53 = i54 + 1;
                }
                if (z10) {
                    i49++;
                }
            }
            i50++;
            iArr18 = iArr19;
            i30 = 1;
        }
        int[] iArr20 = iArr18;
        int i55 = n0Var.i(4);
        if (i49 < 2 || i55 == 0) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        int[] iArr21 = new int[i49];
        for (int i56 = 0; i56 < i49; i56++) {
            iArr21[i56] = n0Var.i(i55);
        }
        int[] iArr22 = new int[i31];
        int i57 = 0;
        while (i57 < i25) {
            iArr22[Math.min(iArr17[i57], i28)] = i57;
            i57++;
            iArr21 = iArr21;
        }
        int[] iArr23 = iArr21;
        q0 q0VarM = t0.m();
        int i58 = 0;
        while (i58 <= i28) {
            int i59 = i49;
            int[] iArr24 = iArr17;
            int iMin = Math.min(iArr20[i58], i59 - 1);
            int[] iArr25 = iArr22;
            q0VarM.c(new h(iArr25[i58], iMin >= 0 ? iArr23[iMin] : -1));
            i58++;
            i49 = i59;
            iArr22 = iArr25;
            iArr17 = iArr24;
        }
        int[] iArr26 = iArr17;
        d2 d2VarG = q0VarM.g();
        if (((h) d2VarG.get(0)).f5500b == -1) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        int i60 = 1;
        while (true) {
            if (i60 > i28) {
                i60 = -1;
                break;
            }
            if (((h) d2VarG.get(i60)).f5500b != -1) {
                break;
            }
            i60++;
        }
        if (i60 == -1) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i25, i25);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i25, i25);
        int i61 = 1;
        while (i61 < i25) {
            boolean[][] zArr6 = zArr5;
            for (int i62 = 0; i62 < i61; i62++) {
                boolean[] zArr7 = zArr4[i61];
                boolean[] zArr8 = zArr6[i61];
                boolean zH11 = n0Var.h();
                zArr8[i62] = zH11;
                zArr7[i62] = zH11;
            }
            i61++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i63 = 1; i63 < i25; i63++) {
            int i64 = 0;
            while (i64 < i24) {
                boolean[][] zArr10 = zArr4;
                for (int i65 = 0; i65 < i63; i65++) {
                    boolean[] zArr11 = zArr9[i63];
                    if (zArr11[i65] && zArr9[i65][i64]) {
                        zArr11[i64] = true;
                        break;
                    }
                }
                i64++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr27 = new int[i31];
        for (int i66 = 0; i66 < i25; i66++) {
            int i67 = 0;
            for (int i68 = 0; i68 < i66; i68++) {
                i67 += zArr12[i66][i68] ? 1 : 0;
            }
            iArr27[iArr26[i66]] = i67;
        }
        int i69 = 0;
        for (int i70 = 0; i70 < i25; i70++) {
            if (iArr27[iArr26[i70]] == 0) {
                i69++;
            }
        }
        if (i69 > 1) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        int[] iArr28 = new int[i25];
        int[] iArr29 = new int[iM2];
        if (n0Var.h()) {
            int i71 = 0;
            while (i71 < i25) {
                int i72 = i71;
                iArr28[i72] = n0Var.i(3);
                i71 = i72 + 1;
            }
        } else {
            Arrays.fill(iArr28, 0, i25, i26);
        }
        int i73 = 0;
        while (i73 < iM2) {
            int i74 = i73;
            int[] iArr30 = iArr28;
            int[] iArr31 = iArr29;
            int iMax = 0;
            for (int i75 = 0; i75 < iArr5[i74]; i75++) {
                iMax = Math.max(iMax, iArr30[((h) d2VarG.get(iArr11[i74][i75])).f5499a]);
            }
            iArr31[i74] = iMax + 1;
            i73 = i74 + 1;
            iArr28 = iArr30;
            iArr29 = iArr31;
        }
        int[] iArr32 = iArr29;
        if (n0Var.h()) {
            int i76 = 0;
            while (i76 < i24) {
                int i77 = i76 + 1;
                int i78 = i77;
                while (i78 < i25) {
                    if (zArr12[i78][i76]) {
                        n0Var.t(3);
                    }
                    i78++;
                    i24 = i24;
                }
                i76 = i77;
            }
        }
        n0Var.s();
        int iM4 = n0Var.m() + 1;
        q0 q0VarM2 = t0.m();
        q0VarM2.c(iVarG);
        if (iM4 > 1) {
            q0VarM2.c(iVarG2);
            for (int i79 = 2; i79 < iM4; i79++) {
                iVarG2 = g(n0Var, n0Var.h(), i26, iVarG2);
                q0VarM2.c(iVarG2);
            }
        }
        d2 d2VarG2 = q0VarM2.g();
        int iM5 = n0Var.m() + iM2;
        if (iM5 > iM2) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        int i80 = n0Var.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM5, i31);
        int[] iArr33 = new int[iM5];
        int i81 = 0;
        int[] iArr34 = new int[iM5];
        int i82 = 0;
        while (i82 < iM2) {
            iArr33[i82] = i81;
            iArr34[i82] = iArr12[i82];
            if (i80 == 0) {
                i16 = i82;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                Arrays.fill(zArr13[i16], i81, iArr5[i16], true);
                iArr2[i16] = iArr3[i16];
            } else {
                i16 = i82;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                if (i80 == 1) {
                    int i83 = iArr12[i16];
                    for (int i84 = 0; i84 < iArr3[i16]; i84++) {
                        zArr2[i16][i84] = iArr11[i16][i84] == i83;
                    }
                    iArr2[i16] = 1;
                } else {
                    i81 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i82 = i16 + 1;
                zArr13 = zArr2;
                iArr33 = iArr2;
                iArr5 = iArr3;
            }
            i81 = 0;
            i82 = i16 + 1;
            zArr13 = zArr2;
            iArr33 = iArr2;
            iArr5 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr35 = iArr33;
        int[] iArr36 = iArr5;
        int[] iArr37 = new int[i31];
        int i85 = 2;
        int[] iArr38 = new int[2];
        iArr38[1] = i31;
        iArr38[i81] = iM5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr38);
        int i86 = 1;
        int i87 = 0;
        while (i86 < iM5) {
            if (i80 == i85) {
                for (int i88 = 0; i88 < iArr36[i86]; i88++) {
                    zArr14[i86][i88] = n0Var.h();
                    int i89 = iArr35[i86];
                    boolean z16 = zArr14[i86][i88];
                    iArr35[i86] = i89 + (z16 ? 1 : 0);
                    if (z16) {
                        iArr34[i86] = iArr11[i86][i88];
                    }
                }
            }
            if (i87 == 0) {
                i15 = 0;
                if (iArr11[i86][0] == 0 && zArr14[i86][0]) {
                    for (int i90 = 1; i90 < iArr36[i86]; i90++) {
                        if (iArr11[i86][i90] == i60 && zArr14[i86][i60]) {
                            i87 = i86;
                        }
                    }
                }
            } else {
                i15 = 0;
            }
            int i91 = i15;
            while (i91 < iArr36[i86]) {
                if (iM4 > 1) {
                    zArr15[i86][i91] = zArr14[i86][i91];
                    d2Var = d2VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = hh.c.c(iM4);
                    if (!zArr[i86][i91]) {
                        int i92 = ((h) d2VarG.get(iArr11[i86][i91])).f5499a;
                        int i93 = i15;
                        while (i93 < i91) {
                            int i94 = i93;
                            if (zArr9[i92][((h) d2VarG.get(iArr11[i86][i94])).f5499a]) {
                                zArr[i86][i91] = true;
                                break;
                            }
                            i93 = i94 + 1;
                        }
                    }
                    if (zArr[i86][i91]) {
                        if (i87 <= 0 || i86 != i87) {
                            n0Var.t(iC);
                        } else {
                            iArr37[i91] = n0Var.i(iC);
                        }
                    }
                } else {
                    d2Var = d2VarG2;
                    zArr = zArr15;
                }
                i91++;
                d2VarG2 = d2Var;
                zArr15 = zArr;
            }
            d2 d2Var2 = d2VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr35[i86] == 1 && iArr27[iArr34[i86]] > 0) {
                n0Var.s();
            }
            i86++;
            d2VarG2 = d2Var2;
            zArr15 = zArr16;
            i85 = 2;
        }
        d2 d2Var3 = d2VarG2;
        boolean[][] zArr17 = zArr15;
        if (i87 == 0) {
            return new oj.q((d2) null, jVar2, (f0) null, (j) null);
        }
        int iM6 = n0Var.m();
        int i95 = iM6 + 1;
        q0 q0VarN = t0.n(i95);
        int[] iArr39 = new int[i25];
        for (int i96 = 0; i96 < i95; i96++) {
            int i97 = n0Var.i(16);
            int i98 = n0Var.i(16);
            if (n0Var.h()) {
                i12 = n0Var.i(2);
                if (i12 == 3) {
                    n0Var.s();
                }
                i13 = n0Var.i(4);
                i14 = n0Var.i(4);
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (n0Var.h()) {
                int iM7 = n0Var.m();
                int iM8 = n0Var.m();
                int iM9 = n0Var.m();
                int iM10 = n0Var.m();
                i97 -= (iM7 + iM8) * ((i12 == 1 || i12 == 2) ? 2 : 1);
                i98 -= (iM9 + iM10) * (i12 == 1 ? 2 : 1);
            }
            q0VarN.c(new k(i12, i13, i14, i97, i98));
        }
        if (i95 <= 1 || !n0Var.h()) {
            for (int i99 = 1; i99 < i25; i99++) {
                iArr39[i99] = Math.min(i99, iM6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = hh.c.c(i95);
            for (int i100 = 1; i100 < i25; i100++) {
                iArr39[i100] = n0Var.i(iC2);
            }
        }
        f0 f0Var = new f0(q0VarN.g(), iArr39);
        n0Var.t(2);
        for (int i101 = 1; i101 < i25; i101++) {
            if (iArr27[iArr26[i101]] == 0) {
                n0Var.s();
            }
        }
        for (int i102 = 1; i102 < iM5; i102++) {
            boolean zH12 = n0Var.h();
            int i103 = 0;
            while (i103 < iArr32[i102]) {
                if ((i103 <= 0 || !zH12) ? i103 == 0 : n0Var.h()) {
                    for (int i104 = 0; i104 < iArr36[i102]; i104++) {
                        if (zArr17[i102][i104]) {
                            n0Var.m();
                        }
                    }
                    n0Var.m();
                    n0Var.m();
                }
                i103++;
            }
        }
        int iM11 = n0Var.m() + 2;
        if (n0Var.h()) {
            n0Var.t(iM11);
        } else {
            for (int i105 = 1; i105 < i25; i105++) {
                for (int i106 = 0; i106 < i105; i106++) {
                    if (zArr12[i105][i106]) {
                        n0Var.t(iM11);
                    }
                }
            }
        }
        int iM12 = n0Var.m();
        for (int i107 = 1; i107 <= iM12; i107++) {
            n0Var.t(8);
        }
        if (n0Var.h()) {
            int i108 = n0Var.f303e;
            if (i108 > 0) {
                n0Var.t(8 - i108);
            }
            if (!n0Var.h() ? n0Var.h() : true) {
                n0Var.s();
            }
            boolean zH13 = n0Var.h();
            boolean zH14 = n0Var.h();
            if (zH13 || zH14) {
                for (int i109 = 0; i109 < iM2; i109++) {
                    for (int i110 = 0; i110 < iArr32[i109]; i110++) {
                        boolean zH15 = zH13 ? n0Var.h() : false;
                        boolean zH16 = zH14 ? n0Var.h() : false;
                        if (zH15) {
                            n0Var.t(32);
                        }
                        if (zH16) {
                            n0Var.t(18);
                        }
                    }
                }
            }
            boolean zH17 = n0Var.h();
            int i111 = zH17 ? n0Var.i(4) + 1 : i25;
            q0 q0VarN2 = t0.n(i111);
            int[] iArr40 = new int[i25];
            for (int i112 = 0; i112 < i111; i112++) {
                n0Var.t(3);
                int i113 = n0Var.h() ? 1 : 2;
                int iF = androidx.media3.common.i.f(n0Var.i(8));
                int iG = androidx.media3.common.i.g(n0Var.i(8));
                n0Var.t(8);
                q0VarN2.c(new m(iF, i113, iG));
            }
            if (zH17 && i111 > 1) {
                for (int i114 = 0; i114 < i25; i114++) {
                    iArr40[i114] = n0Var.i(4);
                }
            }
            jVar = new j(q0VarN2.g(), iArr40, 1);
        } else {
            jVar = null;
        }
        return new oj.q(d2VarG, new j(d2Var3, iArr37, 0), f0Var, jVar);
    }

    public static o k(int i10, int i11, byte[] bArr) {
        int iM;
        int iM2;
        int i12;
        boolean z10;
        int i13;
        int iM3;
        boolean z11;
        boolean zH;
        int i14;
        int i15;
        int i16;
        int iM4;
        int iF;
        float f3;
        int i17;
        int i18;
        int i19;
        float f10;
        int i20;
        int i21;
        int iG;
        boolean zH2;
        boolean zH3;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        n0 n0Var = new n0(bArr, i10 + 1, i11);
        int i27 = n0Var.i(8);
        int i28 = n0Var.i(8);
        int i29 = n0Var.i(8);
        int iM5 = n0Var.m();
        if (i27 == 100 || i27 == 110 || i27 == 122 || i27 == 244 || i27 == 44 || i27 == 83 || i27 == 86 || i27 == 118 || i27 == 128 || i27 == 138) {
            iM = n0Var.m();
            boolean zH4 = iM == 3 ? n0Var.h() : false;
            int iM6 = n0Var.m();
            iM2 = n0Var.m();
            n0Var.s();
            if (n0Var.h()) {
                int i30 = iM != 3 ? 8 : 12;
                i12 = 16;
                int i31 = 0;
                while (i31 < i30) {
                    if (n0Var.h()) {
                        int i32 = i31 < 6 ? 16 : 64;
                        int iN = 8;
                        int i33 = 8;
                        for (int i34 = 0; i34 < i32; i34++) {
                            if (iN != 0) {
                                iN = ((n0Var.n() + i33) + 256) % 256;
                            }
                            if (iN != 0) {
                                i33 = iN;
                            }
                        }
                    }
                    i31++;
                }
            } else {
                i12 = 16;
            }
            z10 = zH4;
            i13 = iM6;
        } else {
            iM = 1;
            i12 = 16;
            i13 = 0;
            z10 = false;
            iM2 = 0;
        }
        int iM7 = n0Var.m() + 4;
        int iM8 = n0Var.m();
        if (iM8 != 0) {
            if (iM8 == 1) {
                boolean zH5 = n0Var.h();
                n0Var.n();
                n0Var.n();
                i27 = i27;
                long jM = n0Var.m();
                iM8 = iM8;
                for (int i35 = 0; i35 < jM; i35++) {
                    n0Var.m();
                }
                iM2 = iM2;
                z11 = zH5;
                iM3 = 0;
            } else {
                iM3 = 0;
            }
            n0Var.m();
            n0Var.s();
            int iM9 = n0Var.m() + 1;
            int iM10 = n0Var.m() + 1;
            zH = n0Var.h();
            i14 = 2 - (zH ? 1 : 0);
            int i36 = iM10 * i14;
            if (!zH) {
                n0Var.s();
            }
            n0Var.s();
            i15 = iM9 * 16;
            i16 = i36 * 16;
            if (n0Var.h()) {
                int iM11 = n0Var.m();
                int iM12 = n0Var.m();
                int iM13 = n0Var.m();
                int iM14 = n0Var.m();
                if (iM == 0) {
                    i25 = 1;
                } else {
                    if (iM == 3) {
                        i25 = 1;
                    } else {
                        i25 = 2;
                    }
                    if (iM == 1) {
                        i26 = 2;
                    } else {
                        i26 = 1;
                    }
                    i14 *= i26;
                }
                i15 -= (iM11 + iM12) * i25;
                i16 -= (iM13 + iM14) * i14;
            }
            int i37 = i16;
            int i38 = i15;
            int i39 = i27;
            iM4 = ((i39 != 44 || i39 == 86 || i39 == 100 || i39 == 110 || i39 == 122 || i39 == 244) && (i28 & 16) != 0) ? 0 : i12;
            iF = -1;
            f3 = 1.0f;
            if (n0Var.h()) {
                if (!n0Var.h()) {
                    i22 = n0Var.i(8);
                    if (i22 == 255) {
                        int i40 = i12;
                        i23 = n0Var.i(i40);
                        i24 = n0Var.i(i40);
                        if (i23 != 0 && i24 != 0) {
                            f3 = i23 / i24;
                        }
                    } else if (i22 < 17) {
                        f3 = f5548b[i22];
                    } else {
                        a1.b.y("Unexpected aspect_ratio_idc value: ", i22, "NalUnitUtil");
                    }
                }
                if (n0Var.h()) {
                    n0Var.s();
                }
                if (n0Var.h()) {
                    n0Var.t(3);
                    if (n0Var.h()) {
                        i21 = 1;
                    } else {
                        i21 = 2;
                    }
                    if (n0Var.h()) {
                        int i41 = n0Var.i(8);
                        int i42 = n0Var.i(8);
                        n0Var.t(8);
                        iF = androidx.media3.common.i.f(i41);
                        iG = androidx.media3.common.i.g(i42);
                    } else {
                        iG = -1;
                    }
                } else {
                    i21 = -1;
                    iG = -1;
                }
                if (n0Var.h()) {
                    n0Var.m();
                    n0Var.m();
                }
                if (n0Var.h()) {
                    n0Var.t(65);
                }
                zH2 = n0Var.h();
                if (zH2) {
                    l(n0Var);
                }
                zH3 = n0Var.h();
                if (zH3) {
                    l(n0Var);
                }
                if (zH2 || zH3) {
                    n0Var.s();
                }
                n0Var.s();
                if (n0Var.h()) {
                    n0Var.s();
                    n0Var.m();
                    n0Var.m();
                    n0Var.m();
                    n0Var.m();
                    iM4 = n0Var.m();
                    n0Var.m();
                }
                f10 = f3;
                i20 = iF;
                i18 = i21;
                i19 = iG;
                i17 = iM4;
            } else {
                iM7 = iM7;
                i17 = iM4;
                i18 = -1;
                i19 = -1;
                f10 = 1.0f;
                i20 = -1;
            }
            return new o(i39, i28, i29, iM5, i38, i37, f10, i13, iM2, z10, zH, iM7, iM8, iM3, z11, i20, i18, i19, i17);
        }
        iM3 = n0Var.m() + 4;
        z11 = false;
        n0Var.m();
        n0Var.s();
        int iM15 = n0Var.m() + 1;
        int iM16 = n0Var.m() + 1;
        zH = n0Var.h();
        i14 = 2 - (zH ? 1 : 0);
        int i310 = iM16 * i14;
        if (!zH) {
            n0Var.s();
        }
        n0Var.s();
        i15 = iM15 * 16;
        i16 = i310 * 16;
        if (n0Var.h()) {
            int iM17 = n0Var.m();
            int iM18 = n0Var.m();
            int iM19 = n0Var.m();
            int iM110 = n0Var.m();
            if (iM == 0) {
                i25 = 1;
            } else {
                if (iM == 3) {
                    i25 = 1;
                } else {
                    i25 = 2;
                }
                if (iM == 1) {
                    i26 = 2;
                } else {
                    i26 = 1;
                }
                i14 *= i26;
            }
            i15 -= (iM17 + iM18) * i25;
            i16 -= (iM19 + iM110) * i14;
        }
        int i311 = i16;
        int i312 = i15;
        int i313 = i27;
        if (i313 != 44) {
        }
        iF = -1;
        f3 = 1.0f;
        if (n0Var.h()) {
            if (!n0Var.h()) {
                i22 = n0Var.i(8);
                if (i22 == 255) {
                    int i43 = i12;
                    i23 = n0Var.i(i43);
                    i24 = n0Var.i(i43);
                    if (i23 != 0) {
                        f3 = i23 / i24;
                    }
                } else if (i22 < 17) {
                    f3 = f5548b[i22];
                } else {
                    a1.b.y("Unexpected aspect_ratio_idc value: ", i22, "NalUnitUtil");
                }
            }
            if (n0Var.h()) {
                n0Var.s();
            }
            if (n0Var.h()) {
                n0Var.t(3);
                if (n0Var.h()) {
                    i21 = 1;
                } else {
                    i21 = 2;
                }
                if (n0Var.h()) {
                    int i44 = n0Var.i(8);
                    int i45 = n0Var.i(8);
                    n0Var.t(8);
                    iF = androidx.media3.common.i.f(i44);
                    iG = androidx.media3.common.i.g(i45);
                } else {
                    iG = -1;
                }
            } else {
                i21 = -1;
                iG = -1;
            }
            if (n0Var.h()) {
                n0Var.m();
                n0Var.m();
            }
            if (n0Var.h()) {
                n0Var.t(65);
            }
            zH2 = n0Var.h();
            if (zH2) {
                l(n0Var);
            }
            zH3 = n0Var.h();
            if (zH3) {
                l(n0Var);
            }
            if (zH2) {
                n0Var.s();
            } else {
                n0Var.s();
            }
            n0Var.s();
            if (n0Var.h()) {
                n0Var.s();
                n0Var.m();
                n0Var.m();
                n0Var.m();
                n0Var.m();
                iM4 = n0Var.m();
                n0Var.m();
            }
            f10 = f3;
            i20 = iF;
            i18 = i21;
            i19 = iG;
            i17 = iM4;
        } else {
            iM7 = iM7;
            i17 = iM4;
            i18 = -1;
            i19 = -1;
            f10 = 1.0f;
            i20 = -1;
        }
        return new o(i313, i28, i29, iM5, i312, i311, f10, i13, iM2, z10, zH, iM7, iM8, iM3, z11, i20, i18, i19, i17);
    }

    public static void l(n0 n0Var) {
        int iM = n0Var.m() + 1;
        n0Var.t(8);
        for (int i10 = 0; i10 < iM; i10++) {
            n0Var.m();
            n0Var.m();
            n0Var.s();
        }
        n0Var.t(20);
    }

    public static ArrayList m(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b7 = byteBufferAsReadOnlyBuffer.get();
                int i10 = (b7 >> 3) & 15;
                if (((b7 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b7 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i11 = 0; i11 < 8; i11++) {
                        byte b10 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b10 & 127) << (i11 * 7);
                        if ((b10 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new r(i10, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int n(int i10, byte[] bArr) {
        int i11;
        synchronized (f5549c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f5550d;
                    if (iArr.length <= i13) {
                        f5550d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f5550d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f5550d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
