package d50;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import k50.i;
import kotlin.jvm.internal.m;

public final class d extends a {
    public long D;
    public final g E;

    public d(g gVar, long j) {
        super(gVar);
        this.E = gVar;
        this.D = j;
        if (j == 0) {
            a();
        }
    }

    @Override
    public final void close() {
        boolean zT;
        if (this.B) {
            return;
        }
        if (this.D != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = y40.b.a;
            m.e(timeUnit, "timeUnit");
            try {
                zT = y40.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((b50.m) this.E.d).k();
                a();
            }
        }
        this.B = true;
    }

    @Override
    public final long s(i sink, long j) throws IOException {
        m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        if (this.B) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.D;
        if (j2 == 0) {
            return -1L;
        }
        long jS = super.s(sink, Math.min(j2, j));
        if (jS == -1) {
            ((b50.m) this.E.d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j3 = this.D - jS;
        this.D = j3;
        if (j3 == 0) {
            a();
        }
        return jS;
    }
}
