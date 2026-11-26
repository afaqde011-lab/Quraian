package nf;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

public final class e1 implements Closeable {
    public final ByteArrayInputStream A;
    public d1 B;
    public final byte[] C = new byte[8];
    public final gi.c D = new gi.c(28);

    public e1(ByteArrayInputStream byteArrayInputStream) {
        this.A = byteArrayInputStream;
    }

    public final void A() {
        r();
        if (this.B.f11227b == 31) {
            throw new IllegalStateException(g4.c.f(this.B.f11227b, "expected definite length but found "));
        }
    }

    public final void F(byte b7) {
        r();
        if (this.B.f11226a != b7) {
            throw new IllegalStateException(w.c.h((b7 >> 5) & 7, (this.B.f11226a >> 5) & 7, "expected major type ", " but found "));
        }
    }

    public final void G(int i10, byte[] bArr) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int i12 = this.A.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        this.B = null;
    }

    public final byte[] I() {
        A();
        long jX = x();
        if (jX < 0 || jX > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.A.available() < jX) {
            throw new EOFException();
        }
        int i10 = (int) jX;
        byte[] bArr = new byte[i10];
        G(i10, bArr);
        return bArr;
    }

    public final long a() {
        F((byte) -128);
        A();
        long jX = x();
        if (jX < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jX > 0) {
            ((ArrayDeque) this.D.B).push(Long.valueOf(jX));
        }
        return jX;
    }

    @Override
    public final void close() throws IOException {
        this.A.close();
        this.D.w();
    }

    public final long i() {
        boolean z10;
        r();
        byte b7 = this.B.f11226a;
        if (b7 == 0) {
            z10 = true;
        } else {
            if (b7 != 32) {
                throw new IllegalStateException(g4.c.f((this.B.f11226a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z10 = false;
        }
        long jX = x();
        if (jX >= 0) {
            return z10 ? jX : ~jX;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long l() {
        F((byte) -96);
        A();
        long jX = x();
        if (jX < 0 || jX > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jX > 0) {
            ((ArrayDeque) this.D.B).push(Long.valueOf(jX + jX));
        }
        return jX;
    }

    public final nf.d1 r() {
        throw new UnsupportedOperationException("Method not decompiled: nf.e1.r():nf.d1");
    }

    public final boolean v() {
        F((byte) -32);
        if (this.B.f11227b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iX = (int) x();
        if (iX == 20) {
            return false;
        }
        if (iX == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long x() throws IOException {
        byte b7 = this.B.f11227b;
        if (b7 < 24) {
            long j9 = b7;
            this.B = null;
            return j9;
        }
        if (b7 == 24) {
            int i10 = this.A.read();
            if (i10 == -1) {
                throw new EOFException();
            }
            this.B = null;
            return ((long) i10) & 255;
        }
        byte[] bArr = this.C;
        if (b7 == 25) {
            G(2, bArr);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b7 == 26) {
            G(4, bArr);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b7 != 27) {
            d1 d1Var = this.B;
            throw new IOException(w.c.h(d1Var.f11227b, (d1Var.f11226a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        G(8, bArr);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3];
        long j14 = bArr[4];
        long j15 = bArr[5];
        return ((bArr[6] & 255) << 8) | ((j13 & 255) << 32) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (((long) bArr[7]) & 255);
    }
}
