package b50;

import java.io.IOException;
import java.net.ProtocolException;
import k50.i0;
import k50.q;

public final class d extends q {
    public final long B;
    public long C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final e G;

    public d(e eVar, i0 delegate, long j) {
        super(delegate);
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.G = eVar;
        this.B = j;
        this.D = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.E) {
            return iOException;
        }
        this.E = true;
        if (iOException == null && this.D) {
            this.D = false;
        }
        return this.G.a(true, false, iOException);
    }

    @Override
    public final void close() throws IOException {
        if (this.F) {
            return;
        }
        this.F = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override
    public final long s(k50.i sink, long j) throws IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.F) {
            throw new IllegalStateException("closed");
        }
        try {
            long jS = this.A.s(sink, j);
            if (this.D) {
                this.D = false;
            }
            if (jS == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.C + jS;
            long j3 = this.B;
            if (j3 == -1 || j2 <= j3) {
                this.C = j2;
                if (j2 == j3) {
                    a(null);
                }
                return jS;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
