package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.cast.Cast;
import java.util.logging.Logger;

public final class m extends w00.a {

    public static final Logger f4289f = Logger.getLogger(m.class.getName());

    public static final boolean f4290g = m1.f4299e;

    public k0 f4291b;

    public final byte[] f4292c;

    public final int f4293d;

    public int f4294e;

    public m(int i10, byte[] bArr) {
        super(4);
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f4292c = bArr;
        this.f4294e = 0;
        this.f4293d = i10;
    }

    public static int O(int i10, i iVar) {
        return P(iVar) + V(i10);
    }

    public static int P(i iVar) {
        int size = iVar.size();
        return W(size) + size;
    }

    public static int Q(int i10) {
        return V(i10) + 4;
    }

    public static int R(int i10) {
        return V(i10) + 8;
    }

    public static int S(int i10, a aVar, a1 a1Var) {
        return aVar.a(a1Var) + (V(i10) * 2);
    }

    public static int T(int i10) {
        if (i10 >= 0) {
            return W(i10);
        }
        return 10;
    }

    public static int U(String str) {
        int length;
        try {
            length = p1.b(str);
        } catch (o1 unused) {
            length = str.getBytes(b0.f4244a).length;
        }
        return W(length) + length;
    }

    public static int V(int i10) {
        return W(i10 << 3);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(long j9) {
        int i10;
        if (((-128) & j9) == 0) {
            return 1;
        }
        if (j9 < 0) {
            return 10;
        }
        if (((-34359738368L) & j9) != 0) {
            j9 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j9) != 0) {
            i10 += 2;
            j9 >>>= 14;
        }
        return (j9 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public final void Y(byte b7) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f4292c;
            int i10 = this.f4294e;
            this.f4294e = i10 + 1;
            bArr[i10] = b7;
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4294e), Integer.valueOf(this.f4293d), 1), e3);
        }
    }

    public final void Z(byte[] bArr, int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i10, this.f4292c, this.f4294e, i11);
            this.f4294e += i11;
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4294e), Integer.valueOf(this.f4293d), Integer.valueOf(i11)), e3);
        }
    }

    public final void a0(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        f0(i10, 5);
        b0(i11);
    }

    public final void b0(int i10) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f4292c;
            int i11 = this.f4294e;
            int i12 = i11 + 1;
            this.f4294e = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f4294e = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f4294e = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f4294e = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4294e), Integer.valueOf(this.f4293d), 1), e3);
        }
    }

    public final void c0(int i10, long j9) throws CodedOutputStream$OutOfSpaceException {
        f0(i10, 1);
        d0(j9);
    }

    public final void d0(long j9) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f4292c;
            int i10 = this.f4294e;
            int i11 = i10 + 1;
            this.f4294e = i11;
            bArr[i10] = (byte) (((int) j9) & 255);
            int i12 = i10 + 2;
            this.f4294e = i12;
            bArr[i11] = (byte) (((int) (j9 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f4294e = i13;
            bArr[i12] = (byte) (((int) (j9 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f4294e = i14;
            bArr[i13] = (byte) (((int) (j9 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f4294e = i15;
            bArr[i14] = (byte) (((int) (j9 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f4294e = i16;
            bArr[i15] = (byte) (((int) (j9 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f4294e = i17;
            bArr[i16] = (byte) (((int) (j9 >> 48)) & 255);
            this.f4294e = i10 + 8;
            bArr[i17] = (byte) (((int) (j9 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4294e), Integer.valueOf(this.f4293d), 1), e3);
        }
    }

    public final void e0(int i10) throws CodedOutputStream$OutOfSpaceException {
        if (i10 >= 0) {
            g0(i10);
        } else {
            i0(i10);
        }
    }

    public final void f0(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        g0((i10 << 3) | i11);
    }

    public final void g0(int i10) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f4292c;
            if (i11 == 0) {
                int i12 = this.f4294e;
                this.f4294e = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f4294e;
                    this.f4294e = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | Cast.MAX_NAMESPACE_LENGTH);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4294e), Integer.valueOf(this.f4293d), 1), e3);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4294e), Integer.valueOf(this.f4293d), 1), e3);
        }
    }

    public final void h0(int i10, long j9) throws CodedOutputStream$OutOfSpaceException {
        f0(i10, 0);
        i0(j9);
    }

    public final void i0(long j9) throws CodedOutputStream$OutOfSpaceException {
        boolean z10 = f4290g;
        int i10 = this.f4293d;
        byte[] bArr = this.f4292c;
        if (z10 && i10 - this.f4294e >= 10) {
            while ((j9 & (-128)) != 0) {
                int i11 = this.f4294e;
                this.f4294e = i11 + 1;
                m1.k(bArr, i11, (byte) ((((int) j9) & 127) | Cast.MAX_NAMESPACE_LENGTH));
                j9 >>>= 7;
            }
            int i12 = this.f4294e;
            this.f4294e = i12 + 1;
            m1.k(bArr, i12, (byte) j9);
            return;
        }
        while ((j9 & (-128)) != 0) {
            try {
                int i13 = this.f4294e;
                this.f4294e = i13 + 1;
                bArr[i13] = (byte) ((((int) j9) & 127) | Cast.MAX_NAMESPACE_LENGTH);
                j9 >>>= 7;
            } catch (IndexOutOfBoundsException e3) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4294e), Integer.valueOf(i10), 1), e3);
            }
        }
        int i14 = this.f4294e;
        this.f4294e = i14 + 1;
        bArr[i14] = (byte) j9;
    }
}
