package k50;

import com.google.android.gms.internal.measurement.z3;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class c0 implements k {
    public final i0 A;
    public final i B;
    public boolean C;

    public c0(i0 source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.A = source;
        this.B = new i();
    }

    @Override
    public final int M(y options) throws EOFException {
        i iVar;
        kotlin.jvm.internal.m.e(options, "options");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        do {
            iVar = this.B;
            int iB = l50.a.b(iVar, options, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                iVar.skip(options.A[iB].d());
                return iB;
            }
        } while (this.A.s(iVar, 8192L) != -1);
        return -1;
    }

    @Override
    public final String N(Charset charset) {
        i0 i0Var = this.A;
        i iVar = this.B;
        iVar.p0(i0Var);
        return iVar.Z(iVar.B, charset);
    }

    @Override
    public final boolean T(long j) {
        i iVar;
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        do {
            iVar = this.B;
            if (iVar.B >= j) {
                return true;
            }
        } while (this.A.s(iVar, 8192L) != -1);
        return false;
    }

    @Override
    public final String W() {
        return z(Long.MAX_VALUE);
    }

    public final boolean a() {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        i iVar = this.B;
        return iVar.A() && this.A.s(iVar, 8192L) == -1;
    }

    @Override
    public final long a0(j jVar) {
        i iVar;
        long j = 0;
        while (true) {
            i0 i0Var = this.A;
            iVar = this.B;
            if (i0Var.s(iVar, 8192L) == -1) {
                break;
            }
            long jV = iVar.v();
            if (jV > 0) {
                j += jV;
                jVar.c0(iVar, jV);
            }
        }
        long j2 = iVar.B;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        jVar.c0(iVar, j2);
        return j3;
    }

    @Override
    public final i b() {
        return this.B;
    }

    @Override
    public final k0 c() {
        return this.A.c();
    }

    @Override
    public final void close() {
        if (this.C) {
            return;
        }
        this.C = true;
        this.A.close();
        this.B.a();
    }

    @Override
    public final void e0(long j) {
        if (!T(j)) {
            throw new EOFException();
        }
    }

    public final long i(l targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            i iVar = this.B;
            long jG = iVar.G(jMax, targetBytes);
            if (jG != -1) {
                return jG;
            }
            long j = iVar.B;
            if (this.A.s(iVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override
    public final boolean isOpen() {
        return !this.C;
    }

    @Override
    public final long j0() {
        i iVar;
        e0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zT = T(i2);
            iVar = this.B;
            if (!zT) {
                break;
            }
            byte bF = iVar.F(i);
            if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                if (i != 0) {
                    break;
                }
                z3.r(16);
                String string = Integer.toString(bF, 16);
                kotlin.jvm.internal.m.d(string, "toString(...)");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return iVar.j0();
    }

    public final int l() {
        e0(4L);
        int i = this.B.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override
    public final InputStream l0() {
        return new g(this, 1);
    }

    @Override
    public final l m(long j) {
        e0(j);
        return this.B.m(j);
    }

    @Override
    public final boolean m0(long j, l bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        int iD = bytes.d();
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        if (j >= 0 && iD >= 0 && bytes.d() >= iD) {
            for (int i = 0; i < iD; i++) {
                long j2 = ((long) i) + j;
                if (T(1 + j2) && this.B.F(j2) == bytes.i(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final long r() throws EOFException {
        char c;
        char c2;
        long j;
        e0(8L);
        i iVar = this.B;
        if (iVar.B < 8) {
            throw new EOFException();
        }
        d0 d0Var = iVar.A;
        kotlin.jvm.internal.m.b(d0Var);
        int i = d0Var.b;
        int i2 = d0Var.c;
        if (i2 - i < 8) {
            j = ((((long) iVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) iVar.readInt()));
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = d0Var.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (((long) bArr[i3]) & 255);
            iVar.B -= 8;
            if (i4 == i2) {
                iVar.A = d0Var.a();
                e0.a(d0Var);
            } else {
                d0Var.b = i4;
            }
            j = j3;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    @Override
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        i iVar = this.B;
        if (iVar.B == 0 && this.A.s(iVar, 8192L) == -1) {
            return -1;
        }
        return iVar.read(sink);
    }

    @Override
    public final byte readByte() {
        e0(1L);
        return this.B.readByte();
    }

    @Override
    public final int readInt() {
        e0(4L);
        return this.B.readInt();
    }

    @Override
    public final short readShort() {
        e0(2L);
        return this.B.readShort();
    }

    @Override
    public final long s(i sink, long j) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        i iVar = this.B;
        if (iVar.B == 0 && this.A.s(iVar, 8192L) == -1) {
            return -1L;
        }
        return iVar.s(sink, Math.min(j, iVar.B));
    }

    @Override
    public final void skip(long j) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            i iVar = this.B;
            if (iVar.B == 0 && this.A.s(iVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, iVar.B);
            iVar.skip(jMin);
            j -= jMin;
        }
    }

    @Override
    public final byte[] t() {
        i0 i0Var = this.A;
        i iVar = this.B;
        iVar.p0(i0Var);
        return iVar.O(iVar.B);
    }

    public final String toString() {
        return "buffer(" + this.A + ')';
    }

    public final short v() {
        e0(2L);
        return this.B.S();
    }

    @Override
    public final long w(byte b, long j, long j2) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            StringBuilder sbN = w.c.n("fromIndex=", j, " toIndex=");
            sbN.append(j2);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        long jMax = j;
        while (jMax < j2) {
            i iVar = this.B;
            byte b2 = b;
            long j3 = j2;
            long jW = iVar.w(b2, jMax, j3);
            if (jW != -1) {
                return jW;
            }
            long j4 = iVar.B;
            if (j4 >= j3 || this.A.s(iVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public final String x(long j) {
        e0(j);
        i iVar = this.B;
        iVar.getClass();
        return iVar.Z(j, r30.a.a);
    }

    @Override
    public final String z(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jW = w((byte) 10, 0L, j2);
        i iVar = this.B;
        if (jW != -1) {
            return l50.a.a(iVar, jW);
        }
        if (j2 < Long.MAX_VALUE && T(j2) && iVar.F(j2 - 1) == 13 && T(j2 + 1) && iVar.F(j2) == 10) {
            return l50.a.a(iVar, j2);
        }
        i iVar2 = new i();
        iVar.x(iVar2, 0L, Math.min(32, iVar.B));
        throw new EOFException("\\n not found: limit=" + Math.min(iVar.B, j) + " content=" + iVar2.m(iVar2.B).e() + (char) 8230);
    }
}
