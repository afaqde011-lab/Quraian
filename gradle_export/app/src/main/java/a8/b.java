package a8;

import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.common.v0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class b {

    public static final int[] f199a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static final int[] f200b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final int[] f201c = {1, 2, 3, 6};

    public static final int[] f202d = {48000, 44100, 32000};

    public static final int[] f203e = {24000, 22050, 16000};

    public static final int[] f204f = {2, 1, 2, 3, 3, 4, 4, 5};

    public static final int[] f205g = {32, 40, 48, 56, 64, 80, 96, 112, Cast.MAX_NAMESPACE_LENGTH, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    public static final int[] f206h = {69, 87, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final int[] f207i = {CastStatusCodes.CANCELED, CastStatusCodes.AUTHENTICATION_FAILED, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, 2048};

    public static final int[] f208j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    public static final int[] f209k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] l = {64, 112, Cast.MAX_NAMESPACE_LENGTH, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    public static final int[] f210n = {5, 8, 10, 12};

    public static final int[] f211o = {6, 9, 12, 15};

    public static final int[] f212p = {2, 4, 6, 8};

    public static final int[] f213q = {9, 11, 13, 16};

    public static final int[] f214r = {5, 8, 10, 12};

    public static final String[] f215s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    public static final int[] f216t = {44100, 48000, 32000};

    public static final int[] f217u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    public static final int[] f218v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    public static final int[] f219w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    public static final int[] f220x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    public static final int[] f221y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        long j9 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j9).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean b(e7.u uVar, w wVar, int i10, u uVar2) {
        long jC = uVar.C();
        long j9 = jC >>> 16;
        if (j9 != i10) {
            return false;
        }
        boolean z10 = (j9 & 1) == 1;
        int i11 = (int) ((jC >> 12) & 15);
        int i12 = (int) ((jC >> 8) & 15);
        int i13 = (int) ((jC >> 4) & 15);
        int i14 = (int) ((jC >> 1) & 7);
        boolean z11 = (jC & 1) == 1;
        if (i13 <= 7) {
            if (i13 != wVar.f317g - 1) {
                return false;
            }
        } else if (i13 > 10 || wVar.f317g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == wVar.f319i) || z11) {
            return false;
        }
        try {
            long jI = uVar.I();
            if (!z10) {
                jI *= (long) wVar.f312b;
            }
            long j10 = wVar.f320j;
            if (j10 != 0 && jI > j10) {
                return false;
            }
            uVar2.f307a = jI;
            int iU = u(i11, uVar);
            long j11 = wVar.f320j;
            boolean z12 = j11 == 0 || jI + ((long) iU) >= j11;
            if (iU == -1) {
                return false;
            }
            if ((!z12 && iU < wVar.f311a) || iU > wVar.f312b) {
                return false;
            }
            int i15 = wVar.f315e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != wVar.f316f) {
                        return false;
                    }
                } else if (i12 != 12) {
                    if (i12 > 14) {
                        return false;
                    }
                    int iH = uVar.H();
                    if (i12 == 14) {
                        iH *= 10;
                    }
                    if (iH != i15) {
                        return false;
                    }
                } else if (uVar.A() * 1000 != i15) {
                    return false;
                }
            }
            int iA = uVar.A();
            int i16 = uVar.f5183b;
            byte[] bArr = uVar.f5182a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = uVar.f5183b; i19 < i17; i19++) {
                i18 = e7.i0.l[i18 ^ (bArr[i19] & 255)];
            }
            String str = e7.i0.f5136a;
            if (iA != i18) {
                return false;
            }
            if (uVar.a() != 0) {
                int iJ = uVar.j();
                if ((iJ & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                    return false;
                }
                int i20 = (iJ & 126) >> 1;
                if ((i20 >= 2 && i20 <= 7) || (i20 >= 13 && i20 <= 31)) {
                    e7.a.h("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i20);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void c(String str, boolean z10) throws ParserException {
        if (!z10) {
            throw ParserException.a(null, str);
        }
    }

    public static void d(long j9, e7.u uVar, l0[] l0VarArr) {
        int i10;
        int iA;
        while (true) {
            if (uVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (uVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iA2 = uVar.A();
                i11 += iA2;
                if (iA2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (uVar.a() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iA = uVar.A();
                    i12 += iA;
                }
            } while (iA == 255);
            int i13 = uVar.f5183b + i12;
            if (i12 == -1 || i12 > uVar.a()) {
                e7.a.m("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = uVar.f5184c;
            } else if (i10 == 4 && i12 >= 8) {
                int iA3 = uVar.A();
                int iH = uVar.H();
                int iM = iH == 49 ? uVar.m() : 0;
                int iA4 = uVar.A();
                if (iH == 47) {
                    uVar.O(1);
                }
                boolean z10 = iA3 == 181 && (iH == 49 || iH == 47) && iA4 == 3;
                if (iH == 49) {
                    z10 &= iM == 1195456820;
                }
                if (z10) {
                    e(j9, uVar, l0VarArr);
                }
            }
            uVar.N(i13);
        }
    }

    public static void e(long j9, e7.u uVar, l0[] l0VarArr) {
        int iA = uVar.A();
        if ((iA & 64) != 0) {
            uVar.O(1);
            int i10 = (iA & 31) * 3;
            int i11 = uVar.f5183b;
            for (l0 l0Var : l0VarArr) {
                uVar.N(i11);
                l0Var.g(i10, uVar);
                ta.c0.A(j9 != -9223372036854775807L);
                l0Var.d(j9, 1, i10, 0, null);
            }
        }
    }

    public static int f(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f202d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f206h[i12]) * 2;
        }
        int i14 = f205g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static void g(int i10, e7.u uVar) {
        uVar.K(7);
        byte[] bArr = uVar.f5182a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static int h(byte[] bArr) {
        int i10;
        byte b7;
        int i11;
        int i12;
        byte b10;
        boolean z10 = false;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[9];
            } else if (b11 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b7 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b10 = bArr[8];
            }
            i11 = (((b10 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b7 = bArr[6];
        i11 = (((b7 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    public static int i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f216t[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f217u[i13 - 1] : f218v[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f219w[i13 - 1] : f220x[i13 - 1];
        } else {
            i15 = f221y[i13 - 1];
        }
        if (i11 == 3) {
            return a1.b.A(i15, 144, i16, i17);
        }
        return a1.b.A(i12 == 1 ? 72 : 144, i15, i16, i17);
    }

    public static int j(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static int k(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case TYPE_SINT64_VALUE:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static n0 l(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == 127 || b7 == 100 || b7 == 64 || b7 == 113) {
            return new n0(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        n0 n0Var = new n0(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            n0 n0Var2 = new n0(bArrCopyOf.length, bArrCopyOf);
            while (n0Var2.b() >= 16) {
                n0Var2.t(2);
                int i12 = n0Var2.i(14) & 16383;
                int iMin = Math.min(8 - n0Var.f302d, 14);
                int i13 = n0Var.f302d;
                int i14 = (8 - i13) - iMin;
                byte[] bArr2 = n0Var.f300b;
                int i15 = n0Var.f301c;
                byte b12 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr2[i15]);
                bArr2[i15] = b12;
                int i16 = 14 - iMin;
                bArr2[i15] = (byte) (b12 | ((i12 >>> i16) << i14));
                int i17 = i15 + 1;
                while (i16 > 8) {
                    n0Var.f300b[i17] = (byte) (i12 >>> (i16 - 8));
                    i16 -= 8;
                    i17++;
                }
                int i18 = 8 - i16;
                byte[] bArr3 = n0Var.f300b;
                byte b13 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                bArr3[i17] = b13;
                bArr3[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b13);
                n0Var.t(14);
                n0Var.a();
            }
        }
        n0Var.o(bArrCopyOf.length, bArrCopyOf);
        return n0Var;
    }

    public static long m(byte b7, byte b10) {
        int i10;
        int i11;
        int i12 = b7 & 255;
        int i13 = b7 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b10 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    public static int n(n0 n0Var) throws ParserException {
        int i10 = n0Var.i(4);
        if (i10 == 15) {
            if (n0Var.b() >= 24) {
                return n0Var.i(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (i10 < 13) {
            return f199a[i10];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static d o(n0 n0Var) {
        int i10;
        int i11;
        int i12 = n0Var.i(16);
        int i13 = n0Var.i(16);
        if (i13 == 65535) {
            i13 = n0Var.i(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i14 = i13 + i10;
        if (i12 == 44097) {
            i14 += 2;
        }
        if (n0Var.i(2) == 3) {
            do {
                n0Var.i(2);
            } while (n0Var.h());
        }
        int i15 = n0Var.i(10);
        if (n0Var.h() && n0Var.i(3) > 0) {
            n0Var.t(2);
        }
        int i16 = n0Var.h() ? 48000 : 44100;
        int i17 = n0Var.i(4);
        int[] iArr = f207i;
        if (i16 == 44100 && i17 == 13) {
            i11 = iArr[i17];
        } else if (i16 != 48000 || i17 >= 14) {
            i11 = 0;
        } else {
            int i18 = iArr[i17];
            int i19 = i15 % 5;
            if (i19 == 1) {
                if (i17 != 3 || i17 == 8) {
                    i11 = i18 + 1;
                } else {
                    i11 = i18;
                }
            } else if (i19 != 2) {
                if (i19 == 3) {
                    if (i17 != 3) {
                    }
                    i11 = i18 + 1;
                } else if (i19 == 4 && (i17 == 3 || i17 == 8 || i17 == 11)) {
                    i11 = i18 + 1;
                } else {
                    i11 = i18;
                }
            } else if (i17 == 8 || i17 == 11) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
            }
        }
        return new d(i16, i14, i11);
    }

    public static a p(n0 n0Var, boolean z10) throws ParserException {
        int i10 = n0Var.i(5);
        if (i10 == 31) {
            i10 = n0Var.i(6) + 32;
        }
        int iN = n(n0Var);
        int i11 = n0Var.i(4);
        String strF = g4.c.f(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            iN = n(n0Var);
            int i12 = n0Var.i(5);
            if (i12 == 31) {
                i12 = n0Var.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = n0Var.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i10);
                }
            }
            if (n0Var.h()) {
                e7.a.m("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (n0Var.h()) {
                n0Var.t(14);
            }
            boolean zH = n0Var.h();
            if (i11 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i10 == 6 || i10 == 20) {
                n0Var.t(3);
            }
            if (zH) {
                if (i10 == 22) {
                    n0Var.t(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    n0Var.t(3);
                }
                n0Var.t(1);
            }
            switch (i10) {
                case 17:
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                case 23:
                    int i13 = n0Var.i(2);
                    if (i13 == 2 || i13 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + i13);
                    }
                    break;
            }
        }
        int i14 = f200b[i11];
        if (i14 == -1) {
            throw ParserException.a(null, null);
        }
        a aVar = new a();
        aVar.f194b = iN;
        aVar.f195c = i14;
        aVar.f193a = strF;
        return aVar;
    }

    public static void q(n0 n0Var, c cVar) throws ParserException {
        int i10 = n0Var.i(5);
        n0Var.t(2);
        if (n0Var.h()) {
            n0Var.t(5);
        }
        if (i10 >= 7 && i10 <= 10) {
            n0Var.s();
        }
        if (n0Var.h()) {
            int i11 = n0Var.i(3);
            if (cVar.f230b == -1 && i10 >= 0 && i10 <= 15 && (i11 == 0 || i11 == 1)) {
                cVar.f230b = i10;
            }
            if (n0Var.h()) {
                x(n0Var);
            }
        }
    }

    public static void r(n0 n0Var, c cVar) throws ParserException {
        n0Var.t(2);
        boolean zH = n0Var.h();
        int i10 = n0Var.i(8);
        for (int i11 = 0; i11 < i10; i11++) {
            n0Var.t(2);
            if (n0Var.h()) {
                n0Var.t(5);
            }
            if (zH) {
                n0Var.t(24);
            } else {
                if (n0Var.h()) {
                    if (!n0Var.h()) {
                        n0Var.t(4);
                    }
                    cVar.f231c = n0Var.i(6) + 1;
                }
                n0Var.t(4);
            }
        }
        if (n0Var.h()) {
            n0Var.t(3);
            if (n0Var.h()) {
                x(n0Var);
            }
        }
    }

    public static int s(n0 n0Var, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && n0Var.h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return n0Var.i(iArr[i10]) + i12;
    }

    public static v0 t(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = e7.i0.f5136a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                e7.a.m("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(m8.a.d(new e7.u(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e3) {
                    e7.a.n("VorbisUtil", "Failed to parse vorbis picture", e3);
                }
            } else {
                arrayList.add(new r8.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v0(arrayList);
    }

    public static int u(int i10, e7.u uVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return uVar.A() + 1;
            case 7:
                return uVar.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static l9.f0 v(e7.u uVar) {
        uVar.O(1);
        int iD = uVar.D();
        long j9 = ((long) uVar.f5183b) + ((long) iD);
        int i10 = iD / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jU = uVar.u();
            if (jU == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jU;
            jArrCopyOf2[i11] = uVar.u();
            uVar.O(2);
        }
        uVar.O((int) (j9 - ((long) uVar.f5183b)));
        return new l9.f0(jArrCopyOf, jArrCopyOf2, 3);
    }

    public static qj.c w(e7.u uVar, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            y(3, uVar, false);
        }
        uVar.y((int) uVar.r(), StandardCharsets.UTF_8);
        long jR = uVar.r();
        String[] strArr = new String[(int) jR];
        for (int i10 = 0; i10 < jR; i10++) {
            strArr[i10] = uVar.y((int) uVar.r(), StandardCharsets.UTF_8);
        }
        if (z11 && (uVar.A() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new qj.c(strArr, 4);
    }

    public static void x(n0 n0Var) throws ParserException {
        int i10 = n0Var.i(6);
        if (i10 < 2 || i10 > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i10)));
        }
        n0Var.t(i10 * 8);
    }

    public static boolean y(int i10, e7.u uVar, boolean z10) throws ParserException {
        if (uVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + uVar.a());
        }
        if (uVar.A() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (uVar.A() == 118 && uVar.A() == 111 && uVar.A() == 114 && uVar.A() == 98 && uVar.A() == 105 && uVar.A() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
