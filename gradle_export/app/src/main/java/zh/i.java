package zh;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import q3.e0;
import s10.w0;
import sd.p1;

public abstract class i {

    public static final e0 f17477a = new e0(new p1(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 27), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 26);

    public static final byte[] f17478b = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static final int[] f17479c = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    public static final int[] f17480d = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    public static final int[] f17481e = {67108863, 33554431};

    public static final int[] f17482f = {26, 25};

    public static boolean a(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        l(jArr2);
        byte[] bArrD = d(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrD[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void b(e0 e0Var, w0 w0Var, g gVar) {
        long[] jArr = new long[10];
        p1 p1Var = (p1) e0Var.B;
        long[] jArr2 = (long[]) p1Var.B;
        p1 p1Var2 = (p1) w0Var.B;
        q(jArr2, (long[]) p1Var2.C, (long[]) p1Var2.B);
        p((long[]) p1Var.C, (long[]) p1Var2.C, (long[]) p1Var2.B);
        long[] jArr3 = (long[]) p1Var.C;
        j(jArr3, jArr3, gVar.f17474b);
        long[] jArr4 = (long[]) p1Var.D;
        long[] jArr5 = (long[]) p1Var.B;
        j(jArr4, jArr5, gVar.f17473a);
        long[] jArr6 = (long[]) e0Var.C;
        j(jArr6, (long[]) w0Var.C, gVar.f17475c);
        gVar.a(jArr5, (long[]) p1Var2.D);
        q(jArr, jArr5, jArr5);
        p(jArr5, jArr4, jArr3);
        q(jArr3, jArr4, jArr3);
        q(jArr4, jArr, jArr6);
        p(jArr6, jArr, jArr6);
    }

    public static byte[] c(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static byte[] d(long[] jArr) {
        int[] iArr;
        int i10;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            iArr = f17482f;
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j9 = jArrCopyOf[i13];
                int i14 = iArr[i13 & 1];
                int i15 = -((int) (((j9 >> 31) & j9) >> i14));
                jArrCopyOf[i13] = j9 + ((long) (i15 << i14));
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) i15);
            }
            long j10 = jArrCopyOf[9];
            int i16 = -((int) (((j10 >> 31) & j10) >> 25));
            jArrCopyOf[9] = j10 + ((long) (i16 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i16 * 19));
            i12++;
        }
        long j11 = jArrCopyOf[0];
        int i17 = -((int) (((j11 >> 31) & j11) >> 26));
        jArrCopyOf[0] = j11 + ((long) (i17 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i17);
        int i18 = 0;
        while (true) {
            iArr2 = f17481e;
            if (i18 >= 2) {
                break;
            }
            int i19 = i11;
            while (i19 < 9) {
                long j12 = jArrCopyOf[i19];
                int i20 = i19 & 1;
                int i21 = i11;
                int i22 = (int) (j12 >> iArr[i20]);
                jArrCopyOf[i19] = j12 & ((long) iArr2[i20]);
                i19++;
                jArrCopyOf[i19] = jArrCopyOf[i19] + ((long) i22);
                i11 = i21;
                i18 = i18;
            }
            i18++;
        }
        int i23 = i11;
        long j13 = jArrCopyOf[9];
        jArrCopyOf[9] = j13 & 33554431;
        long j14 = jArrCopyOf[i23] + ((long) (((int) (j13 >> 25)) * 19));
        jArrCopyOf[i23] = j14;
        int i24 = ~((((int) j14) - 67108845) >> 31);
        for (int i25 = 1; i25 < 10; i25++) {
            int i26 = ~(((int) jArrCopyOf[i25]) ^ iArr2[i25 & 1]);
            int i27 = i26 & (i26 << 16);
            int i28 = i27 & (i27 << 8);
            int i29 = i28 & (i28 << 4);
            int i30 = i29 & (i29 << 2);
            i24 &= (i30 & (i30 << 1)) >> 31;
        }
        jArrCopyOf[i23] = jArrCopyOf[i23] - ((long) (67108845 & i24));
        long j15 = 33554431 & i24;
        jArrCopyOf[1] = jArrCopyOf[1] - j15;
        for (i10 = 2; i10 < 10; i10 += 2) {
            jArrCopyOf[i10] = jArrCopyOf[i10] - ((long) (67108863 & i24));
            int i31 = i10 + 1;
            jArrCopyOf[i31] = jArrCopyOf[i31] - j15;
        }
        for (int i32 = i23; i32 < 10; i32++) {
            jArrCopyOf[i32] = jArrCopyOf[i32] << f17480d[i32];
        }
        byte[] bArr = new byte[32];
        for (int i33 = i23; i33 < 10; i33++) {
            int i34 = f17479c[i33];
            long j16 = bArr[i34];
            long j17 = jArrCopyOf[i33];
            bArr[i34] = (byte) (j16 | (j17 & 255));
            int i35 = i34 + 1;
            bArr[i35] = (byte) (((long) bArr[i35]) | ((j17 >> 8) & 255));
            int i36 = i34 + 2;
            bArr[i36] = (byte) (((long) bArr[i36]) | ((j17 >> 16) & 255));
            int i37 = i34 + 3;
            bArr[i37] = (byte) (((long) bArr[i37]) | ((j17 >> 24) & 255));
        }
        return bArr;
    }

    public static byte[] e(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String f(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            int i10 = b7 & 255;
            sb2.append("0123456789abcdef".charAt(i10 / 16));
            sb2.append("0123456789abcdef".charAt(i10 % 16));
        }
        return sb2.toString();
    }

    public static long[] g(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f17479c[i10];
            jArr[i10] = ((((((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8)) | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> f17480d[i10]) & ((long) f17481e[i10 & 1]);
        }
        return jArr;
    }

    public static long h(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (((long) bArr[i10]) & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    public static long i(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | h(i10, bArr);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long j9 = jArr2[0];
        long j10 = jArr3[0];
        long j11 = j9 * j10;
        long j12 = jArr3[1];
        long j13 = jArr2[1];
        long j14 = (j13 * j10) + (j9 * j12);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        long j17 = (j16 * j10) + (j9 * j15) + (j13 * 2 * j12);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        long j20 = (j19 * j10) + (j9 * j18) + (j16 * j12) + (j13 * j15);
        long j21 = jArr3[4];
        long j22 = jArr2[4];
        long j23 = (j22 * j10) + (j9 * j21) + (((j19 * j12) + (j13 * j18)) * 2) + (j16 * j15);
        long j24 = jArr3[5];
        long j25 = jArr2[5];
        long j26 = (j25 * j10) + (j9 * j24) + (j22 * j12) + (j13 * j21) + (j19 * j15) + (j16 * j18);
        long j27 = jArr3[6];
        long j28 = (j9 * j27) + (j22 * j15) + (j16 * j21) + (((j25 * j12) + (j13 * j24) + (j19 * j18)) * 2);
        long j29 = jArr2[6];
        long j30 = (j29 * j10) + j28;
        long j31 = jArr3[7];
        long j32 = jArr2[7];
        long j33 = (j32 * j10) + (j9 * j31) + (j29 * j12) + (j13 * j27) + (j25 * j15) + (j16 * j24) + (j22 * j18) + (j19 * j21);
        long j34 = jArr3[8];
        long j35 = jArr2[8];
        long j36 = (j35 * j10) + (j9 * j34) + (j29 * j15) + (j16 * j27) + (((j32 * j12) + (j13 * j31) + (j25 * j18) + (j19 * j24)) * 2) + (j22 * j21);
        long j37 = jArr3[9];
        long j38 = jArr2[9];
        long j39 = (j10 * j38) + (j9 * j37) + (j35 * j12) + (j13 * j34) + (j32 * j15) + (j16 * j31) + (j29 * j18) + (j19 * j27) + (j25 * j21) + (j22 * j24);
        long j40 = j12 * j38;
        long j41 = (j35 * j15) + (j16 * j34) + (j29 * j21) + (j22 * j27) + ((j40 + (j13 * j37) + (j32 * j18) + (j19 * j31) + (j25 * j24)) * 2);
        long j42 = j15 * j38;
        long j43 = j42 + (j16 * j37) + (j35 * j18) + (j19 * j34) + (j32 * j21) + (j22 * j31) + (j29 * j24) + (j25 * j27);
        long j44 = j18 * j38;
        long j45 = j35 * j21;
        long j46 = j21 * j38;
        long j47 = j35 * j27;
        long j48 = j27 * j38;
        k(new long[]{j11, j14, j17, j20, j23, j26, j30, j33, j36, j39, j41, j43, j45 + (j22 * j34) + ((j44 + (j19 * j37) + (j32 * j24) + (j25 * j31)) * 2) + (j29 * j27), j46 + (j22 * j37) + (j35 * j24) + (j25 * j34) + (j32 * j27) + (j29 * j31), j47 + (j29 * j34) + (((j24 * j38) + (j25 * j37) + (j32 * j31)) * 2), j48 + (j29 * j37) + (j35 * j31) + (j32 * j34), (((j31 * j38) + (j32 * j37)) * 2) + (j35 * j34), (j34 * j38) + (j35 * j37), j38 * 2 * j37}, jArr);
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        long j9 = jArr[8];
        long j10 = jArr[18];
        long j11 = j9 + (j10 << 4);
        jArr[8] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j39 + (j38 << 1);
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j43 + (j42 << 1);
        jArr[0] = j44;
        jArr[0] = j44 + j42;
        l(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void l(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j9 = jArr[i10];
            long j10 = j9 / 67108864;
            jArr[i10] = j9 - (j10 << 26);
            int i11 = i10 + 1;
            long j11 = jArr[i11] + j10;
            jArr[i11] = j11;
            long j12 = j11 / 33554432;
            jArr[i11] = j11 - (j12 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j12;
        }
        long j13 = jArr[0];
        long j14 = jArr[10];
        long j15 = j13 + (j14 << 4);
        jArr[0] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static byte[] m(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b7 = bArr2[i10];
                    if (b7 != 0) {
                        byte b10 = bArr2[i12];
                        if ((b7 << i13) + b10 > 15) {
                            if (b10 - (b7 << i13) < -15) {
                                break;
                            }
                            bArr2[i12] = (byte) (b10 - (b7 << i13));
                            while (i10 < 256) {
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        } else {
                            bArr2[i12] = (byte) (b10 + (b7 << i13));
                            bArr2[i10] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j9 = jArr2[0];
        long j10 = j9 * 2;
        long j11 = jArr2[1];
        long j12 = jArr2[2];
        long j13 = jArr2[3];
        long j14 = jArr2[4];
        long j15 = jArr2[5];
        long j16 = jArr2[6];
        long j17 = jArr2[7];
        long j18 = jArr2[8];
        long j19 = jArr2[9];
        k(new long[]{j9 * j9, j10 * j11, ((j9 * j12) + (j11 * j11)) * 2, ((j9 * j13) + (j11 * j12)) * 2, (j10 * j14) + (j11 * 4 * j13) + (j12 * j12), ((j9 * j15) + (j11 * j14) + (j12 * j13)) * 2, ((j11 * 2 * j15) + (j9 * j16) + (j12 * j14) + (j13 * j13)) * 2, ((j9 * j17) + (j11 * j16) + (j12 * j15) + (j13 * j14)) * 2, (((((j13 * j15) + (j11 * j17)) * 2) + (j9 * j18) + (j12 * j16)) * 2) + (j14 * j14), ((j9 * j19) + (j11 * j18) + (j12 * j17) + (j13 * j16) + (j14 * j15)) * 2, ((((j11 * j19) + (j13 * j17)) * 2) + (j12 * j18) + (j14 * j16) + (j15 * j15)) * 2, ((j12 * j19) + (j13 * j18) + (j14 * j17) + (j15 * j16)) * 2, (((((j13 * j19) + (j15 * j17)) * 2) + (j14 * j18)) * 2) + (j16 * j16), ((j14 * j19) + (j15 * j18) + (j16 * j17)) * 2, ((j15 * 2 * j19) + (j16 * j18) + (j17 * j17)) * 2, ((j16 * j19) + (j17 * j18)) * 2, (j17 * 4 * j19) + (j18 * j18), j18 * 2 * j19, 2 * j19 * j19}, jArr);
    }

    public static void o(e0 e0Var, w0 w0Var, g gVar) {
        long[] jArr = new long[10];
        p1 p1Var = (p1) e0Var.B;
        long[] jArr2 = (long[]) p1Var.B;
        p1 p1Var2 = (p1) w0Var.B;
        q(jArr2, (long[]) p1Var2.C, (long[]) p1Var2.B);
        p((long[]) p1Var.C, (long[]) p1Var2.C, (long[]) p1Var2.B);
        long[] jArr3 = (long[]) p1Var.C;
        j(jArr3, jArr3, gVar.f17473a);
        long[] jArr4 = (long[]) p1Var.D;
        long[] jArr5 = (long[]) p1Var.B;
        j(jArr4, jArr5, gVar.f17474b);
        long[] jArr6 = (long[]) e0Var.C;
        j(jArr6, (long[]) w0Var.C, gVar.f17475c);
        gVar.a(jArr5, (long[]) p1Var2.D);
        q(jArr, jArr5, jArr5);
        p(jArr5, jArr4, jArr3);
        q(jArr3, jArr4, jArr3);
        p(jArr4, jArr, jArr6);
        q(jArr6, jArr, jArr6);
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static final void r(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] s(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i12 < 0 || bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    public static final byte[] t(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return s(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
