package e50;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import k50.b0;

public final class v implements Closeable {
    public static final Logger F = Logger.getLogger(e.class.getName());
    public final k50.j A;
    public final k50.i B;
    public int C;
    public boolean D;
    public final c E;

    public v(b0 sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.A = sink;
        k50.i iVar = new k50.i();
        this.B = iVar;
        this.C = 16384;
        this.E = new c(iVar);
    }

    public final synchronized void A(int i, int i2) {
        g4.c.q(i2, "errorCode");
        if (this.D) {
            throw new IOException("closed");
        }
        if (e4.f.b(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        l(i, 4, 3, 0);
        this.A.writeInt(e4.f.b(i2));
        this.A.flush();
    }

    public final synchronized void F(int i, long j) {
        if (this.D) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        l(i, 4, 8, 0);
        this.A.writeInt((int) j);
        this.A.flush();
    }

    public final synchronized void a(y peerSettings) {
        try {
            kotlin.jvm.internal.m.e(peerSettings, "peerSettings");
            if (this.D) {
                throw new IOException("closed");
            }
            int i = this.C;
            int i2 = peerSettings.a;
            if ((i2 & 32) != 0) {
                i = peerSettings.b[5];
            }
            this.C = i;
            if (((i2 & 2) != 0 ? peerSettings.b[1] : -1) != -1) {
                c cVar = this.E;
                int i3 = (i2 & 2) != 0 ? peerSettings.b[1] : -1;
                cVar.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = cVar.d;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        cVar.b = Math.min(cVar.b, iMin);
                    }
                    cVar.c = true;
                    cVar.d = iMin;
                    int i5 = cVar.h;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            a[] aVarArr = cVar.e;
                            h00.n.y0(0, aVarArr.length, null, aVarArr);
                            cVar.f = cVar.e.length - 1;
                            cVar.g = 0;
                            cVar.h = 0;
                        } else {
                            cVar.a(i5 - iMin);
                        }
                    }
                }
            }
            l(0, 0, 4, 1);
            this.A.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final synchronized void close() {
        this.D = true;
        this.A.close();
    }

    public final synchronized void flush() {
        if (this.D) {
            throw new IOException("closed");
        }
        this.A.flush();
    }

    public final synchronized void i(boolean z, int i, k50.i iVar, int i2) {
        if (this.D) {
            throw new IOException("closed");
        }
        l(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            k50.j jVar = this.A;
            kotlin.jvm.internal.m.b(iVar);
            jVar.c0(iVar, i2);
        }
    }

    public final void l(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = F;
        if (logger.isLoggable(level)) {
            logger.fine(e.a(false, i, i2, i3, i4));
        }
        if (i2 > this.C) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.C + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(g4.c.f(i, "reserved bit set: ").toString());
        }
        byte[] bArr = y40.b.a;
        k50.j jVar = this.A;
        kotlin.jvm.internal.m.e(jVar, "<this>");
        jVar.writeByte((i2 >>> 16) & 255);
        jVar.writeByte((i2 >>> 8) & 255);
        jVar.writeByte(i2 & 255);
        jVar.writeByte(i3 & 255);
        jVar.writeByte(i4 & 255);
        jVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void r(int i, int i2, byte[] bArr) {
        g4.c.q(i2, "errorCode");
        if (this.D) {
            throw new IOException("closed");
        }
        if (e4.f.b(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        l(0, bArr.length + 8, 7, 0);
        this.A.writeInt(i);
        this.A.writeInt(e4.f.b(i2));
        if (bArr.length != 0) {
            this.A.write(bArr);
        }
        this.A.flush();
    }

    public final synchronized void v(boolean z, int i, ArrayList arrayList) {
        if (this.D) {
            throw new IOException("closed");
        }
        this.E.d(arrayList);
        long j = this.B.B;
        long jMin = Math.min(this.C, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        l(i, (int) jMin, 1, i2);
        this.A.c0(this.B, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.C, j2);
                j2 -= jMin2;
                l(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.A.c0(this.B, jMin2);
            }
        }
    }

    public final synchronized void x(int i, int i2, boolean z) {
        if (this.D) {
            throw new IOException("closed");
        }
        l(0, 8, 6, z ? 1 : 0);
        this.A.writeInt(i);
        this.A.writeInt(i2);
        this.A.flush();
    }
}
