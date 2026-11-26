package e50;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k50.i0;
import k50.k0;

public final class p implements i0 {
    public final k50.k A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;

    public p(k50.k source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.A = source;
    }

    @Override
    public final k0 c() {
        return this.A.c();
    }

    @Override
    public final void close() {
    }

    @Override
    public final long s(k50.i sink, long j) throws IOException {
        int i;
        int i2;
        kotlin.jvm.internal.m.e(sink, "sink");
        do {
            int i3 = this.E;
            k50.k kVar = this.A;
            if (i3 == 0) {
                kVar.skip(this.F);
                this.F = 0;
                if ((this.C & 4) == 0) {
                    i = this.D;
                    int iS = y40.b.s(kVar);
                    this.E = iS;
                    this.B = iS;
                    int i4 = kVar.readByte() & 255;
                    this.C = kVar.readByte() & 255;
                    Logger logger = q.D;
                    if (logger.isLoggable(Level.FINE)) {
                        k50.l lVar = e.a;
                        logger.fine(e.a(true, this.D, this.B, i4, this.C));
                    }
                    i2 = kVar.readInt() & Integer.MAX_VALUE;
                    this.D = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jS = kVar.s(sink, Math.min(j, i3));
                if (jS != -1) {
                    this.E -= (int) jS;
                    return jS;
                }
            }
            return -1L;
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
