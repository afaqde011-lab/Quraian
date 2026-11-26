package b50;

import java.io.IOException;
import java.net.ProtocolException;
import k50.g0;
import k50.p;

public final class c extends p {
    public final long B;
    public boolean C;
    public long D;
    public boolean E;
    public final e F;

    public c(e eVar, g0 delegate, long j) {
        super(delegate);
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.F = eVar;
        this.B = j;
    }

    public final IOException a(IOException iOException) {
        if (this.C) {
            return iOException;
        }
        this.C = true;
        return this.F.a(false, true, iOException);
    }

    @Override
    public final void c0(k50.i iVar, long j) throws IOException {
        if (this.E) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.B;
        if (j2 != -1 && this.D + j > j2) {
            StringBuilder sbN = w.c.n("expected ", j2, " bytes but received ");
            sbN.append(this.D + j);
            throw new ProtocolException(sbN.toString());
        }
        try {
            super.c0(iVar, j);
            this.D += j;
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override
    public final void close() throws IOException {
        if (this.E) {
            return;
        }
        this.E = true;
        long j = this.B;
        if (j != -1 && this.D != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }
}
