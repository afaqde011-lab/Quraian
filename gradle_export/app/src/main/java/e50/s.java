package e50;

import java.io.IOException;
import java.io.InterruptedIOException;
import k50.i0;
import k50.k0;
import okhttp3.internal.http2.StreamResetException;

public final class s implements i0 {
    public final long A;
    public boolean B;
    public final k50.i C = new k50.i();
    public final k50.i D = new k50.i();
    public boolean E;
    public final u F;

    public s(u uVar, long j, boolean z) {
        this.F = uVar;
        this.A = j;
        this.B = z;
    }

    @Override
    public final k0 c() {
        return this.F.k;
    }

    @Override
    public final void close() {
        long j;
        u uVar = this.F;
        synchronized (uVar) {
            this.E = true;
            k50.i iVar = this.D;
            j = iVar.B;
            iVar.a();
            uVar.notifyAll();
        }
        if (j > 0) {
            u uVar2 = this.F;
            byte[] bArr = y40.b.a;
            uVar2.b.v(j);
        }
        this.F.a();
    }

    @Override
    public final long s(k50.i sink, long j) throws Throwable {
        int i;
        Throwable streamResetException;
        boolean z;
        long jS;
        kotlin.jvm.internal.m.e(sink, "sink");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        while (true) {
            u uVar = this.F;
            synchronized (uVar) {
                uVar.k.h();
                try {
                    synchronized (uVar) {
                        i = uVar.m;
                    }
                    if (z) {
                        if (jS != -1) {
                            return jS;
                        }
                        if (streamResetException == null) {
                            return -1L;
                        }
                        throw streamResetException;
                    }
                    j2 = 0;
                } catch (Throwable th) {
                    uVar.k.k();
                    throw th;
                }
            }
            if (i != 0 && !this.B) {
                streamResetException = uVar.n;
                if (streamResetException == null) {
                    synchronized (uVar) {
                        int i2 = uVar.m;
                        g4.c.p(i2);
                        streamResetException = new StreamResetException(i2);
                    }
                }
                throw th;
            }
            streamResetException = null;
            if (this.E) {
                throw new IOException("stream closed");
            }
            k50.i iVar = this.D;
            long j3 = iVar.B;
            z = false;
            if (j3 > j2) {
                jS = iVar.s(sink, Math.min(j, j3));
                long j4 = uVar.c + jS;
                uVar.c = j4;
                long j5 = j4 - uVar.d;
                if (streamResetException == null && j5 >= uVar.b.P.a() / 2) {
                    uVar.b.F(uVar.a, j5);
                    uVar.d = uVar.c;
                }
            } else {
                if (!this.B && streamResetException == null) {
                    try {
                        uVar.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jS = -1;
            }
            uVar.k.k();
            if (z) {
                if (jS != -1) {
                    return jS;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j2 = 0;
        }
    }
}
