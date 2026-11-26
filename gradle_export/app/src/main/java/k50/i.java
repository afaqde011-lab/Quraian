package k50;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class i implements k, j, Cloneable, ByteChannel {
    public d0 A;
    public long B;

    public final boolean A() {
        return this.B == 0;
    }

    public final byte F(long j) {
        ab.a0.u(this.B, j, 1L);
        d0 d0Var = this.A;
        if (d0Var == null) {
            kotlin.jvm.internal.m.b(null);
            throw null;
        }
        long j2 = this.B;
        if (j2 - j < j) {
            while (j2 > j) {
                d0Var = d0Var.g;
                kotlin.jvm.internal.m.b(d0Var);
                j2 -= (long) (d0Var.c - d0Var.b);
            }
            return d0Var.a[(int) ((((long) d0Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = d0Var.c;
            int i2 = d0Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return d0Var.a[(int) ((((long) i2) + j) - j3)];
            }
            d0Var = d0Var.f;
            kotlin.jvm.internal.m.b(d0Var);
            j3 = j4;
        }
    }

    public final long G(long j, l targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "fromIndex < 0: ").toString());
        }
        d0 d0Var = this.A;
        if (d0Var == null) {
            return -1L;
        }
        long j3 = this.B;
        if (j3 - j < j) {
            while (j3 > j) {
                d0Var = d0Var.g;
                kotlin.jvm.internal.m.b(d0Var);
                j3 -= (long) (d0Var.c - d0Var.b);
            }
            if (targetBytes.d() == 2) {
                byte bI = targetBytes.i(0);
                byte bI2 = targetBytes.i(1);
                while (j3 < this.B) {
                    byte[] bArr = d0Var.a;
                    int i = d0Var.c;
                    for (int i2 = (int) ((((long) d0Var.b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bI || b == bI2) {
                            return ((long) (i2 - d0Var.b)) + j3;
                        }
                    }
                    j3 += (long) (d0Var.c - d0Var.b);
                    d0Var = d0Var.f;
                    kotlin.jvm.internal.m.b(d0Var);
                    j = j3;
                }
            } else {
                byte[] bArrH = targetBytes.h();
                while (j3 < this.B) {
                    byte[] bArr2 = d0Var.a;
                    int i3 = d0Var.c;
                    for (int i4 = (int) ((((long) d0Var.b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrH) {
                            if (b2 == b3) {
                                return ((long) (i4 - d0Var.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (d0Var.c - d0Var.b);
                    d0Var = d0Var.f;
                    kotlin.jvm.internal.m.b(d0Var);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (d0Var.c - d0Var.b)) + j2;
            if (j4 > j) {
                break;
            }
            d0Var = d0Var.f;
            kotlin.jvm.internal.m.b(d0Var);
            j2 = j4;
        }
        if (targetBytes.d() == 2) {
            byte bI3 = targetBytes.i(0);
            byte bI4 = targetBytes.i(1);
            while (j2 < this.B) {
                byte[] bArr3 = d0Var.a;
                int i5 = d0Var.c;
                for (int i6 = (int) ((((long) d0Var.b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bI3 || b4 == bI4) {
                        return ((long) (i6 - d0Var.b)) + j2;
                    }
                }
                j2 += (long) (d0Var.c - d0Var.b);
                d0Var = d0Var.f;
                kotlin.jvm.internal.m.b(d0Var);
                j = j2;
            }
        } else {
            byte[] bArrH2 = targetBytes.h();
            while (j2 < this.B) {
                byte[] bArr4 = d0Var.a;
                int i7 = d0Var.c;
                for (int i8 = (int) ((((long) d0Var.b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrH2) {
                        if (b5 == b6) {
                            return ((long) (i8 - d0Var.b)) + j2;
                        }
                    }
                }
                j2 += (long) (d0Var.c - d0Var.b);
                d0Var = d0Var.f;
                kotlin.jvm.internal.m.b(d0Var);
                j = j2;
            }
        }
        return -1L;
    }

    public final long I(l targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        return G(0L, targetBytes);
    }

    @Override
    public final j J(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    @Override
    public final j K(String str) {
        w0(str);
        return this;
    }

    @Override
    public final int M(y options) throws EOFException {
        kotlin.jvm.internal.m.e(options, "options");
        int iB = l50.a.b(this, options, false);
        if (iB == -1) {
            return -1;
        }
        skip(options.A[iB].d());
        return iB;
    }

    @Override
    public final String N(Charset charset) {
        return Z(this.B, charset);
    }

    public final byte[] O(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount: ").toString());
        }
        if (this.B < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override
    public final j Q(long j) {
        s0(j);
        return this;
    }

    public final short S() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override
    public final boolean T(long j) {
        return this.B >= j;
    }

    @Override
    public final j V(l lVar) {
        o0(lVar);
        return this;
    }

    @Override
    public final String W() {
        return z(Long.MAX_VALUE);
    }

    public final String Z(long j, Charset charset) throws EOFException {
        kotlin.jvm.internal.m.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount: ").toString());
        }
        if (this.B < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.b(d0Var);
        int i = d0Var.b;
        if (((long) i) + j > d0Var.c) {
            return new String(O(j), charset);
        }
        int i2 = (int) j;
        String str = new String(d0Var.a, i, i2, charset);
        int i3 = d0Var.b + i2;
        d0Var.b = i3;
        this.B -= j;
        if (i3 == d0Var.c) {
            this.A = d0Var.a();
            e0.a(d0Var);
        }
        return str;
    }

    public final void a() throws EOFException {
        skip(this.B);
    }

    @Override
    public final long a0(j jVar) {
        long j = this.B;
        if (j > 0) {
            jVar.c0(this, j);
        }
        return j;
    }

    @Override
    public final i b() {
        return this;
    }

    public final String b0() {
        return Z(this.B, r30.a.a);
    }

    @Override
    public final k0 c() {
        return k0.d;
    }

    @Override
    public final void c0(i source, long j) {
        d0 d0VarB;
        kotlin.jvm.internal.m.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        ab.a0.u(source.B, 0L, j);
        while (j > 0) {
            d0 d0Var = source.A;
            kotlin.jvm.internal.m.b(d0Var);
            int i = d0Var.c;
            d0 d0Var2 = source.A;
            kotlin.jvm.internal.m.b(d0Var2);
            long j2 = i - d0Var2.b;
            int i2 = 0;
            if (j < j2) {
                d0 d0Var3 = this.A;
                d0 d0Var4 = d0Var3 != null ? d0Var3.g : null;
                if (d0Var4 != null && d0Var4.e) {
                    if ((((long) d0Var4.c) + j) - ((long) (d0Var4.d ? 0 : d0Var4.b)) <= 8192) {
                        d0 d0Var5 = source.A;
                        kotlin.jvm.internal.m.b(d0Var5);
                        d0Var5.d(d0Var4, (int) j);
                        source.B -= j;
                        this.B += j;
                        return;
                    }
                }
                d0 d0Var6 = source.A;
                kotlin.jvm.internal.m.b(d0Var6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > d0Var6.c - d0Var6.b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    d0VarB = d0Var6.c();
                } else {
                    d0VarB = e0.b();
                    byte[] bArr = d0Var6.a;
                    byte[] bArr2 = d0VarB.a;
                    int i4 = d0Var6.b;
                    h00.n.r0(bArr, 0, bArr2, i4, i4 + i3);
                }
                d0VarB.c = d0VarB.b + i3;
                d0Var6.b += i3;
                d0 d0Var7 = d0Var6.g;
                kotlin.jvm.internal.m.b(d0Var7);
                d0Var7.b(d0VarB);
                source.A = d0VarB;
            }
            d0 d0Var8 = source.A;
            kotlin.jvm.internal.m.b(d0Var8);
            long j3 = d0Var8.c - d0Var8.b;
            source.A = d0Var8.a();
            d0 d0Var9 = this.A;
            if (d0Var9 == null) {
                this.A = d0Var8;
                d0Var8.g = d0Var8;
                d0Var8.f = d0Var8;
            } else {
                d0 d0Var10 = d0Var9.g;
                kotlin.jvm.internal.m.b(d0Var10);
                d0Var10.b(d0Var8);
                d0 d0Var11 = d0Var8.g;
                if (d0Var11 == d0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.m.b(d0Var11);
                if (d0Var11.e) {
                    int i5 = d0Var8.c - d0Var8.b;
                    d0 d0Var12 = d0Var8.g;
                    kotlin.jvm.internal.m.b(d0Var12);
                    int i6 = 8192 - d0Var12.c;
                    d0 d0Var13 = d0Var8.g;
                    kotlin.jvm.internal.m.b(d0Var13);
                    if (!d0Var13.d) {
                        d0 d0Var14 = d0Var8.g;
                        kotlin.jvm.internal.m.b(d0Var14);
                        i2 = d0Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        d0 d0Var15 = d0Var8.g;
                        kotlin.jvm.internal.m.b(d0Var15);
                        d0Var8.d(d0Var15, i5);
                        d0Var8.a();
                        e0.a(d0Var8);
                    }
                }
            }
            source.B -= j3;
            this.B += j3;
            j -= j3;
        }
    }

    public final Object clone() {
        i iVar = new i();
        if (this.B == 0) {
            return iVar;
        }
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.b(d0Var);
        d0 d0VarC = d0Var.c();
        iVar.A = d0VarC;
        d0VarC.g = d0VarC;
        d0VarC.f = d0VarC;
        for (d0 d0Var2 = d0Var.f; d0Var2 != d0Var; d0Var2 = d0Var2.f) {
            d0 d0Var3 = d0VarC.g;
            kotlin.jvm.internal.m.b(d0Var3);
            kotlin.jvm.internal.m.b(d0Var2);
            d0Var3.b(d0Var2.c());
        }
        iVar.B = this.B;
        return iVar;
    }

    @Override
    public final void close() {
    }

    @Override
    public final void e0(long j) throws EOFException {
        if (this.B < j) {
            throw new EOFException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        long j = this.B;
        i iVar = (i) obj;
        if (j != iVar.B) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.b(d0Var);
        d0 d0Var2 = iVar.A;
        kotlin.jvm.internal.m.b(d0Var2);
        int i = d0Var.b;
        int i2 = d0Var2.b;
        long j2 = 0;
        while (j2 < this.B) {
            long jMin = Math.min(d0Var.c - i, d0Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (d0Var.a[i] != d0Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == d0Var.c) {
                d0Var = d0Var.f;
                kotlin.jvm.internal.m.b(d0Var);
                i = d0Var.b;
            }
            if (i2 == d0Var2.c) {
                d0Var2 = d0Var2.f;
                kotlin.jvm.internal.m.b(d0Var2);
                i2 = d0Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final l f0(int i) {
        if (i == 0) {
            return l.D;
        }
        ab.a0.u(this.B, 0L, i);
        d0 d0Var = this.A;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kotlin.jvm.internal.m.b(d0Var);
            int i5 = d0Var.c;
            int i6 = d0Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            d0Var = d0Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        d0 d0Var2 = this.A;
        int i7 = 0;
        while (i2 < i) {
            kotlin.jvm.internal.m.b(d0Var2);
            bArr[i7] = d0Var2.a;
            i2 += d0Var2.c - d0Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = d0Var2.b;
            d0Var2.d = true;
            i7++;
            d0Var2 = d0Var2.f;
        }
        return new f0(bArr, iArr);
    }

    @Override
    public final void flush() {
    }

    @Override
    public final j h0(long j) {
        r0(j);
        return this;
    }

    public final int hashCode() {
        d0 d0Var = this.A;
        if (d0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = d0Var.c;
            for (int i3 = d0Var.b; i3 < i2; i3++) {
                i = (i * 31) + d0Var.a[i3];
            }
            d0Var = d0Var.f;
            kotlin.jvm.internal.m.b(d0Var);
        } while (d0Var != this.A);
        return i;
    }

    @Override
    public final OutputStream i0() {
        return new h(this, 0);
    }

    @Override
    public final boolean isOpen() {
        return true;
    }

    @Override
    public final long j0() throws EOFException {
        int i;
        if (this.B == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            d0 d0Var = this.A;
            kotlin.jvm.internal.m.b(d0Var);
            byte[] bArr = d0Var.a;
            int i3 = d0Var.b;
            int i4 = d0Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = l50.b.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    i iVar = new i();
                    iVar.s0(j);
                    iVar.q0(b);
                    throw new NumberFormatException("Number too large: ".concat(iVar.b0()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.A = d0Var.a();
                e0.a(d0Var);
            } else {
                d0Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.A != null);
        this.B -= (long) i2;
        return j;
    }

    @Override
    public final InputStream l0() {
        return new g(this, 0);
    }

    @Override
    public final l m(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount: ").toString());
        }
        if (this.B < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new l(O(j));
        }
        l lVarF0 = f0((int) j);
        skip(j);
        return lVarF0;
    }

    @Override
    public final boolean m0(long j, l bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        int iD = bytes.d();
        if (j >= 0 && iD >= 0 && this.B - j >= iD && bytes.d() >= iD) {
            for (int i = 0; i < iD; i++) {
                if (F(((long) i) + j) == bytes.i(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final d0 n0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        d0 d0Var = this.A;
        if (d0Var == null) {
            d0 d0VarB = e0.b();
            this.A = d0VarB;
            d0VarB.g = d0VarB;
            d0VarB.f = d0VarB;
            return d0VarB;
        }
        d0 d0Var2 = d0Var.g;
        kotlin.jvm.internal.m.b(d0Var2);
        if (d0Var2.c + i <= 8192 && d0Var2.e) {
            return d0Var2;
        }
        d0 d0VarB2 = e0.b();
        d0Var2.b(d0VarB2);
        return d0VarB2;
    }

    public final void o0(l byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        byteString.r(this, byteString.d());
    }

    public final void p0(i0 source) {
        kotlin.jvm.internal.m.e(source, "source");
        while (source.s(this, 8192L) != -1) {
        }
    }

    public final void q0(int i) {
        d0 d0VarN0 = n0(1);
        byte[] bArr = d0VarN0.a;
        int i2 = d0VarN0.c;
        d0VarN0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.B++;
    }

    public final void r0(long j) {
        boolean z;
        if (j == 0) {
            q0(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                w0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        d0 d0VarN0 = n0(i);
        byte[] bArr = d0VarN0.a;
        int i2 = d0VarN0.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = l50.a.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        d0VarN0.c += i;
        this.B += (long) i;
    }

    @Override
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        d0 d0Var = this.A;
        if (d0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), d0Var.c - d0Var.b);
        sink.put(d0Var.a, d0Var.b, iMin);
        int i = d0Var.b + iMin;
        d0Var.b = i;
        this.B -= (long) iMin;
        if (i == d0Var.c) {
            this.A = d0Var.a();
            e0.a(d0Var);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i2) {
        ab.a0.u(bArr.length, i, i2);
        d0 d0Var = this.A;
        if (d0Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, d0Var.c - d0Var.b);
        byte[] bArr2 = d0Var.a;
        int i3 = d0Var.b;
        h00.n.r0(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = d0Var.b + iMin;
        d0Var.b = i4;
        this.B -= (long) iMin;
        if (i4 == d0Var.c) {
            this.A = d0Var.a();
            e0.a(d0Var);
        }
        return iMin;
    }

    @Override
    public final byte readByte() throws EOFException {
        if (this.B == 0) {
            throw new EOFException();
        }
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.b(d0Var);
        int i = d0Var.b;
        int i2 = d0Var.c;
        int i3 = i + 1;
        byte b = d0Var.a[i];
        this.B--;
        if (i3 != i2) {
            d0Var.b = i3;
            return b;
        }
        this.A = d0Var.a();
        e0.a(d0Var);
        return b;
    }

    @Override
    public final int readInt() throws EOFException {
        if (this.B < 4) {
            throw new EOFException();
        }
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.b(d0Var);
        int i = d0Var.b;
        int i2 = d0Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = d0Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.B -= 4;
        if (i5 != i2) {
            d0Var.b = i5;
            return i6;
        }
        this.A = d0Var.a();
        e0.a(d0Var);
        return i6;
    }

    @Override
    public final short readShort() throws EOFException {
        if (this.B < 2) {
            throw new EOFException();
        }
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.b(d0Var);
        int i = d0Var.b;
        int i2 = d0Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = d0Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.B -= 2;
        if (i5 == i2) {
            this.A = d0Var.a();
            e0.a(d0Var);
        } else {
            d0Var.b = i5;
        }
        return (short) i6;
    }

    @Override
    public final long s(i sink, long j) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        long j2 = this.B;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.c0(this, j);
        return j;
    }

    public final void s0(long j) {
        if (j == 0) {
            q0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j11 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        d0 d0VarN0 = n0(i);
        byte[] bArr = d0VarN0.a;
        int i2 = d0VarN0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = l50.a.a[(int) (15 & j)];
            j >>>= 4;
        }
        d0VarN0.c += i;
        this.B += (long) i;
    }

    @Override
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            d0 d0Var = this.A;
            if (d0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, d0Var.c - d0Var.b);
            long j2 = iMin;
            this.B -= j2;
            j -= j2;
            int i = d0Var.b + iMin;
            d0Var.b = i;
            if (i == d0Var.c) {
                this.A = d0Var.a();
                e0.a(d0Var);
            }
        }
    }

    @Override
    public final byte[] t() {
        return O(this.B);
    }

    public final void t0(int i) {
        d0 d0VarN0 = n0(4);
        byte[] bArr = d0VarN0.a;
        int i2 = d0VarN0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        d0VarN0.c = i2 + 4;
        this.B += 4;
    }

    public final String toString() {
        long j = this.B;
        if (j <= 2147483647L) {
            return f0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.B).toString());
    }

    public final void u0(int i) {
        d0 d0VarN0 = n0(2);
        byte[] bArr = d0VarN0.a;
        int i2 = d0VarN0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        d0VarN0.c = i2 + 2;
        this.B += 2;
    }

    public final long v() {
        long j = this.B;
        if (j == 0) {
            return 0L;
        }
        d0 d0Var = this.A;
        kotlin.jvm.internal.m.b(d0Var);
        d0 d0Var2 = d0Var.g;
        kotlin.jvm.internal.m.b(d0Var2);
        int i = d0Var2.c;
        return (i >= 8192 || !d0Var2.e) ? j : j - ((long) (i - d0Var2.b));
    }

    public final void v0(int i, String string, int i2) {
        char cCharAt;
        kotlin.jvm.internal.m.e(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.f(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(w.c.h(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbQ = oi.k.q("endIndex > string.length: ", i2, " > ");
            sbQ.append(string.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                d0 d0VarN0 = n0(1);
                byte[] bArr = d0VarN0.a;
                int i3 = d0VarN0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = d0VarN0.c;
                int i6 = (i3 + i) - i5;
                d0VarN0.c = i5 + i6;
                this.B += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    d0 d0VarN1 = n0(2);
                    byte[] bArr2 = d0VarN1.a;
                    int i7 = d0VarN1.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    d0VarN1.c = i7 + 2;
                    this.B += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    d0 d0VarN2 = n0(3);
                    byte[] bArr3 = d0VarN2.a;
                    int i8 = d0VarN2.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    d0VarN2.c = i8 + 3;
                    this.B += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        q0(63);
                        i = i9;
                    } else {
                        int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        d0 d0VarN3 = n0(4);
                        byte[] bArr4 = d0VarN3.a;
                        int i12 = d0VarN3.c;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        d0VarN3.c = i12 + 4;
                        this.B += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override
    public final long w(byte b, long j, long j2) {
        d0 d0Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.B + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.B;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (d0Var = this.A) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                d0Var = d0Var.g;
                kotlin.jvm.internal.m.b(d0Var);
                j6 -= (long) (d0Var.c - d0Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = d0Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(d0Var.c, (((long) d0Var.b) + j4) - j6);
                for (int i = (int) ((((long) d0Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - d0Var.b)) + j6;
                    }
                }
                j6 += (long) (d0Var.c - d0Var.b);
                d0Var = d0Var.f;
                kotlin.jvm.internal.m.b(d0Var);
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (d0Var.c - d0Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            d0Var = d0Var.f;
            kotlin.jvm.internal.m.b(d0Var);
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = d0Var.a;
            int iMin2 = (int) Math.min(d0Var.c, (((long) d0Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) d0Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - d0Var.b)) + j5;
                }
            }
            j5 += (long) (d0Var.c - d0Var.b);
            d0Var = d0Var.f;
            kotlin.jvm.internal.m.b(d0Var);
            j3 = j5;
        }
        return -1L;
    }

    public final void w0(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        v0(0, string, string.length());
    }

    @Override
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            d0 d0VarN0 = n0(1);
            int iMin = Math.min(i, 8192 - d0VarN0.c);
            source.get(d0VarN0.a, d0VarN0.c, iMin);
            i -= iMin;
            d0VarN0.c += iMin;
        }
        this.B += (long) iRemaining;
        return iRemaining;
    }

    @Override
    public final j write(byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        write(source, 0, source.length);
        return this;
    }

    public final void write(byte[] source, int i, int i2) {
        kotlin.jvm.internal.m.e(source, "source");
        long j = i2;
        ab.a0.u(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            d0 d0VarN0 = n0(1);
            int iMin = Math.min(i3 - i, 8192 - d0VarN0.c);
            int i4 = i + iMin;
            h00.n.r0(source, d0VarN0.c, d0VarN0.a, i, i4);
            d0VarN0.c += iMin;
            i = i4;
        }
        this.B += j;
    }

    @Override
    public final j writeByte(int i) {
        q0(i);
        return this;
    }

    @Override
    public final j writeInt(int i) {
        t0(i);
        return this;
    }

    @Override
    public final j writeShort(int i) {
        u0(i);
        return this;
    }

    public final void x(i out, long j, long j2) {
        kotlin.jvm.internal.m.e(out, "out");
        long j3 = j;
        ab.a0.u(this.B, j3, j2);
        if (j2 == 0) {
            return;
        }
        out.B += j2;
        d0 d0Var = this.A;
        while (true) {
            kotlin.jvm.internal.m.b(d0Var);
            long j4 = d0Var.c - d0Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            d0Var = d0Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            kotlin.jvm.internal.m.b(d0Var);
            d0 d0VarC = d0Var.c();
            int i = d0VarC.b + ((int) j3);
            d0VarC.b = i;
            d0VarC.c = Math.min(i + ((int) j5), d0VarC.c);
            d0 d0Var2 = out.A;
            if (d0Var2 == null) {
                d0VarC.g = d0VarC;
                d0VarC.f = d0VarC;
                out.A = d0VarC;
            } else {
                d0 d0Var3 = d0Var2.g;
                kotlin.jvm.internal.m.b(d0Var3);
                d0Var3.b(d0VarC);
            }
            j5 -= (long) (d0VarC.c - d0VarC.b);
            d0Var = d0Var.f;
            j3 = 0;
        }
    }

    public final void x0(int i) {
        String str;
        if (i < 128) {
            q0(i);
            return;
        }
        if (i < 2048) {
            d0 d0VarN0 = n0(2);
            byte[] bArr = d0VarN0.a;
            int i2 = d0VarN0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            d0VarN0.c = i2 + 2;
            this.B += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            q0(63);
            return;
        }
        if (i < 65536) {
            d0 d0VarN1 = n0(3);
            byte[] bArr2 = d0VarN1.a;
            int i3 = d0VarN1.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            d0VarN1.c = i3 + 3;
            this.B += 3;
            return;
        }
        if (i <= 1114111) {
            d0 d0VarN2 = n0(4);
            byte[] bArr3 = d0VarN2.a;
            int i4 = d0VarN2.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            d0VarN2.c = i4 + 4;
            this.B += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = l50.b.a;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException(g4.c.i("startIndex: ", i5, ", endIndex: 8, size: 8"));
            }
            if (i5 > 8) {
                throw new IllegalArgumentException(g4.c.i("startIndex: ", i5, " > endIndex: 8"));
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override
    public final String z(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jW = w((byte) 10, 0L, j2);
        if (jW != -1) {
            return l50.a.a(this, jW);
        }
        if (j2 < this.B && F(j2 - 1) == 13 && F(j2) == 10) {
            return l50.a.a(this, j2);
        }
        i iVar = new i();
        x(iVar, 0L, Math.min(32, this.B));
        throw new EOFException("\\n not found: limit=" + Math.min(this.B, j) + " content=" + iVar.m(iVar.B).e() + (char) 8230);
    }
}
