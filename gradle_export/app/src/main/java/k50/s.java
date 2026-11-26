package k50;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class s implements i0 {
    public byte A;
    public final c0 B;
    public final Inflater C;
    public final t D;
    public final CRC32 E;

    public s(i0 source) {
        kotlin.jvm.internal.m.e(source, "source");
        c0 c0Var = new c0(source);
        this.B = c0Var;
        Inflater inflater = new Inflater(true);
        this.C = inflater;
        this.D = new t(c0Var, inflater);
        this.E = new CRC32();
    }

    public static void a(int i, String str, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override
    public final k0 c() {
        return this.B.A.c();
    }

    @Override
    public final void close() {
        this.D.close();
    }

    public final void i(i iVar, long j, long j2) {
        d0 d0Var = iVar.A;
        kotlin.jvm.internal.m.b(d0Var);
        while (true) {
            int i = d0Var.c;
            int i2 = d0Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            d0Var = d0Var.f;
            kotlin.jvm.internal.m.b(d0Var);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) d0Var.b) + j);
            int iMin = (int) Math.min(d0Var.c - i3, j2);
            this.E.update(d0Var.a, i3, iMin);
            j2 -= (long) iMin;
            d0Var = d0Var.f;
            kotlin.jvm.internal.m.b(d0Var);
            j = 0;
        }
    }

    @Override
    public final long s(i sink, long j) throws IOException {
        s sVar = this;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = sVar.A;
        CRC32 crc32 = sVar.E;
        c0 c0Var = sVar.B;
        if (b == 0) {
            c0Var.e0(10L);
            i iVar = c0Var.B;
            byte bF = iVar.F(3L);
            boolean z = ((bF >> 1) & 1) == 1;
            if (z) {
                sVar.i(iVar, 0L, 10L);
            }
            a(8075, "ID1ID2", c0Var.readShort());
            c0Var.skip(8L);
            if (((bF >> 2) & 1) == 1) {
                c0Var.e0(2L);
                if (z) {
                    i(iVar, 0L, 2L);
                }
                long jS = iVar.S() & 65535;
                c0Var.e0(jS);
                if (z) {
                    i(iVar, 0L, jS);
                }
                c0Var.skip(jS);
            }
            if (((bF >> 3) & 1) == 1) {
                long jW = c0Var.w((byte) 0, 0L, Long.MAX_VALUE);
                if (jW == -1) {
                    throw new EOFException();
                }
                if (z) {
                    i(iVar, 0L, jW + 1);
                }
                c0Var.skip(jW + 1);
            }
            if (((bF >> 4) & 1) == 1) {
                long jW2 = c0Var.w((byte) 0, 0L, Long.MAX_VALUE);
                if (jW2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    sVar = this;
                    sVar.i(iVar, 0L, jW2 + 1);
                } else {
                    sVar = this;
                }
                c0Var.skip(jW2 + 1);
            } else {
                sVar = this;
            }
            if (z) {
                a(c0Var.v(), "FHCRC", (short) crc32.getValue());
                crc32.reset();
            }
            sVar.A = (byte) 1;
        }
        if (sVar.A == 1) {
            long j2 = sink.B;
            long jS2 = sVar.D.s(sink, j);
            if (jS2 != -1) {
                sVar.i(sink, j2, jS2);
                return jS2;
            }
            sVar.A = (byte) 2;
        }
        if (sVar.A == 2) {
            a(c0Var.l(), "CRC", (int) crc32.getValue());
            a(c0Var.l(), "ISIZE", (int) sVar.C.getBytesWritten());
            sVar.A = (byte) 3;
            if (!c0Var.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
