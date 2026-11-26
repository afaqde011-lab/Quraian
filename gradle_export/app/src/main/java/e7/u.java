package e7;

import com.google.protobuf.RuntimeVersion;
import fh.e1;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class u {

    public static final char[] f5178d = {'\r', '\n'};

    public static final char[] f5179e = {'\n'};

    public static final e1 f5180f = e1.m(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    public static final AtomicBoolean f5181g = new AtomicBoolean();

    public byte[] f5182a;

    public int f5183b;

    public int f5184c;

    public u() {
        this.f5182a = i0.f5137b;
    }

    public u(int i10) {
        this.f5182a = new byte[i10];
        this.f5184c = i10;
    }

    public u(int i10, byte[] bArr) {
        this.f5182a = bArr;
        this.f5184c = i10;
    }

    public u(byte[] bArr) {
        this.f5182a = bArr;
        this.f5184c = bArr.length;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        byte b7 = (byte) i12;
        return bi.b.B((byte) 0, ca.v.r(((i10 & 7) << 2) | ((i11 & 48) >> 4)), ca.v.r(((((byte) i11) & 15) << 4) | ((b7 & 60) >> 2)), ca.v.r(((b7 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int d(Charset charset) {
        ta.c0.t(f5180f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b7) {
        return (b7 & 192) == 128;
    }

    public final int A() {
        f(1);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        this.f5183b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int B() {
        f(4);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f5183b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f5183b = i10 + 4;
        return i13;
    }

    public final long C() {
        f(4);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        long j9 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f5183b = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f5183b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 8);
        this.f5183b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j11;
    }

    public final int D() {
        f(3);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f5183b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f5183b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int E() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        throw new IllegalStateException(g4.c.f(iM, "Top bit not zero: "));
    }

    public final int F() {
        long j9 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f5183b == this.f5184c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jA = A();
            j9 |= (127 & jA) << (i10 * 7);
            if ((jA & 128) == 0) {
                break;
            }
        }
        return bi.b.s(j9);
    }

    public final long G() {
        long jU = u();
        if (jU >= 0) {
            return jU;
        }
        throw new IllegalStateException(w.c.i(jU, "Top bit not zero: "));
    }

    public final int H() {
        f(2);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f5183b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long I() {
        int i10;
        f(1);
        long j9 = this.f5182a[this.f5183b];
        int i11 = 7;
        while (true) {
            if (i11 >= 0) {
                int i12 = 1 << i11;
                if ((((long) i12) & j9) == 0) {
                    if (i11 < 6) {
                        j9 &= (long) (i12 - 1);
                        i10 = 7 - i11;
                        break;
                    }
                    if (i11 == 7) {
                        i10 = 1;
                        break;
                    }
                } else {
                    i11--;
                }
            }
            i10 = 0;
            break;
        }
        if (i10 == 0) {
            throw new NumberFormatException(w.c.i(j9, "Invalid UTF-8 sequence first byte: "));
        }
        f(i10);
        for (int i13 = 1; i13 < i10; i13++) {
            byte b7 = this.f5182a[this.f5183b + i13];
            if ((b7 & 192) != 128) {
                throw new NumberFormatException(w.c.i(j9, "Invalid UTF-8 sequence continuation byte: "));
            }
            j9 = (j9 << 6) | ((long) (b7 & 63));
        }
        this.f5183b += i10;
        return j9;
    }

    public final Charset J() {
        if (a() >= 3) {
            byte[] bArr = this.f5182a;
            int i10 = this.f5183b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f5183b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f5182a;
        int i11 = this.f5183b;
        byte b7 = bArr2[i11];
        if (b7 == -2 && bArr2[i11 + 1] == -1) {
            this.f5183b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b7 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f5183b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void K(int i10) {
        byte[] bArr = this.f5182a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        L(i10, bArr);
    }

    public final void L(int i10, byte[] bArr) {
        this.f5182a = bArr;
        this.f5184c = i10;
        this.f5183b = 0;
    }

    public final void M(int i10) {
        ta.c0.s(i10 >= 0 && i10 <= this.f5182a.length);
        this.f5184c = i10;
    }

    public final void N(int i10) {
        ta.c0.s(i10 >= 0 && i10 <= this.f5184c);
        this.f5183b = i10;
    }

    public final void O(int i10) {
        N(this.f5183b + i10);
    }

    public final int a() {
        return Math.max(this.f5184c - this.f5183b, 0);
    }

    public final void c(int i10) {
        byte[] bArr = this.f5182a;
        if (i10 > bArr.length) {
            this.f5182a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void f(int i10) {
        if (!f5181g.get() || a() >= i10) {
            return;
        }
        StringBuilder sbQ = oi.k.q("bytesNeeded= ", i10, ", bytesLeft=");
        sbQ.append(a());
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public final char g(int i10, ByteOrder byteOrder) {
        byte b7;
        byte b10;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f5182a;
            int i11 = this.f5183b + i10;
            b7 = bArr[i11];
            b10 = bArr[i11 + 1];
        } else {
            byte[] bArr2 = this.f5182a;
            int i12 = this.f5183b + i10;
            b7 = bArr2[i12 + 1];
            b10 = bArr2[i12];
        }
        return (char) ((b10 & 255) | (b7 << 8));
    }

    public final int h(Charset charset) {
        int codePoint;
        int i10;
        ta.c0.t(f5180f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f5183b + ", limit=" + this.f5184c);
        }
        int i11 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b7 = this.f5182a[this.f5183b];
            if ((b7 & 128) != 0) {
                return 0;
            }
            codePoint = b7 & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b10 = this.f5182a[this.f5183b];
            if ((b10 & 128) == 0) {
                i10 = 1;
            } else if ((b10 & 224) == 192 && a() >= 2 && e(this.f5182a[this.f5183b + 1])) {
                i10 = 2;
            } else if ((this.f5182a[this.f5183b] & 240) == 224 && a() >= 3 && e(this.f5182a[this.f5183b + 1]) && e(this.f5182a[this.f5183b + 2])) {
                i10 = 3;
            } else {
                i10 = ((this.f5182a[this.f5183b] & 248) == 240 && a() >= 4 && e(this.f5182a[this.f5183b + 1]) && e(this.f5182a[this.f5183b + 2]) && e(this.f5182a[this.f5183b + 3])) ? 4 : 0;
            }
            if (i10 == 1) {
                codePoint = this.f5182a[this.f5183b] & 255;
            } else if (i10 == 2) {
                byte[] bArr = this.f5182a;
                int i12 = this.f5183b;
                codePoint = b(0, 0, bArr[i12], bArr[i12 + 1]);
            } else if (i10 == 3) {
                byte[] bArr2 = this.f5182a;
                int i13 = this.f5183b;
                codePoint = b(0, bArr2[i13] & 15, bArr2[i13 + 1], bArr2[i13 + 2]);
            } else {
                if (i10 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f5182a;
                int i14 = this.f5183b;
                codePoint = b(bArr3[i14], bArr3[i14 + 1], bArr3[i14 + 2], bArr3[i14 + 3]);
            }
            i11 = i10;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cG = g(0, byteOrder);
            if (!Character.isHighSurrogate(cG) || a() < 4) {
                codePoint = cG;
                i11 = 2;
            } else {
                codePoint = Character.toCodePoint(cG, g(2, byteOrder));
                i11 = 4;
            }
        }
        return (codePoint << 8) | i11;
    }

    public final int i() {
        if (a() >= 4) {
            int iM = m();
            this.f5183b -= 4;
            return iM;
        }
        throw new IndexOutOfBoundsException("position=" + this.f5183b + ", limit=" + this.f5184c);
    }

    public final int j() {
        f(1);
        return this.f5182a[this.f5183b] & 255;
    }

    public final void k(int i10, int i11, byte[] bArr) {
        f(i11);
        System.arraycopy(this.f5182a, this.f5183b, bArr, i10, i11);
        this.f5183b += i11;
    }

    public final char l(Charset charset, char[] cArr) {
        int iH;
        if (a() >= d(charset) && (iH = h(charset)) != 0) {
            long j9 = iH >>> 8;
            ta.c0.p(j9, "out of range: %s", (j9 >> 32) == 0);
            int i10 = (int) j9;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j10 = i10;
                char c10 = (char) j10;
                ta.c0.p(j10, "Out of range: %s", ((long) c10) == j10);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.f5183b = bi.b.s(iH & 255) + this.f5183b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f5183b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f5183b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f5183b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public final String n(Charset charset) {
        int i10;
        byte[] bArr;
        byte b7;
        byte[] bArr2;
        byte b10;
        ta.c0.t(f5180f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            J();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f5183b;
        while (true) {
            int i12 = this.f5184c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b11 = this.f5182a[i11];
                String str = i0.f5136a;
                if (b11 == 10 || b11 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f5182a;
                    if (bArr[i11] == 0) {
                        b7 = bArr[i11 + 1];
                        String str2 = i0.f5136a;
                        if (b7 != 10 || b7 == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f5182a;
                            if (bArr2[i11 + 1] == 0) {
                                b10 = bArr2[i11];
                                String str3 = i0.f5136a;
                                if (b10 != 10 || b10 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11 += i10;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f5182a;
                            if (bArr2[i11 + 1] == 0) {
                                b10 = bArr2[i11];
                                String str4 = i0.f5136a;
                                if (b10 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f5182a;
                        if (bArr2[i11 + 1] == 0) {
                            b10 = bArr2[i11];
                            String str5 = i0.f5136a;
                            if (b10 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i11 += i10;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f5182a;
                if (bArr[i11] == 0) {
                    b7 = bArr[i11 + 1];
                    String str6 = i0.f5136a;
                    if (b7 != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f5182a;
                    if (bArr2[i11 + 1] == 0) {
                        b10 = bArr2[i11];
                        String str7 = i0.f5136a;
                        if (b10 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            } else {
                bArr = this.f5182a;
                if (bArr[i11] == 0) {
                    b7 = bArr[i11 + 1];
                    String str8 = i0.f5136a;
                    if (b7 != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f5182a;
                    if (bArr2[i11 + 1] == 0) {
                        b10 = bArr2[i11];
                        String str9 = i0.f5136a;
                        if (b10 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            }
        }
        String strY = y(i11 - this.f5183b, charset);
        if (this.f5183b != this.f5184c && l(charset, f5178d) == '\r') {
            l(charset, f5179e);
        }
        return strY;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f5183b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f5183b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f5183b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long p() {
        f(8);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        long j9 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f5183b = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f5183b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f5183b = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f5183b = i15;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f5183b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f5183b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f5183b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j15;
    }

    public final short q() {
        f(2);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = bArr[i10] & 255;
        this.f5183b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long r() {
        f(4);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        long j9 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f5183b = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f5183b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16);
        this.f5183b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j11;
    }

    public final int s() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        throw new IllegalStateException(g4.c.f(iO, "Top bit not zero: "));
    }

    public final int t() {
        f(2);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = bArr[i10] & 255;
        this.f5183b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long u() {
        f(8);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        long j9 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f5183b = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f5183b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f5183b = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f5183b = i15;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f5183b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f5183b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f5183b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j15;
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f5183b;
        while (i10 < this.f5184c && this.f5182a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f5182a;
        int i11 = this.f5183b;
        String str = i0.f5136a;
        String str2 = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.f5183b = i10;
        if (i10 < this.f5184c) {
            this.f5183b = i10 + 1;
        }
        return str2;
    }

    public final String w(int i10) {
        f(i10);
        if (i10 == 0) {
            return RuntimeVersion.SUFFIX;
        }
        int i11 = this.f5183b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f5184c || this.f5182a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f5182a;
        String str = i0.f5136a;
        String str2 = new String(bArr, i11, i13, StandardCharsets.UTF_8);
        this.f5183b += i10;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.f5182a;
        int i10 = this.f5183b;
        int i11 = i10 + 1;
        this.f5183b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f5183b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String y(int i10, Charset charset) {
        f(i10);
        String str = new String(this.f5182a, this.f5183b, i10, charset);
        this.f5183b += i10;
        return str;
    }

    public final int z() {
        return A() | (A() << 21) | (A() << 14) | (A() << 7);
    }
}
