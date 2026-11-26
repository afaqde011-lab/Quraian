package e50;

import java.io.IOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

public final class u {
    public final int a;
    public final m b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final s i;
    public final r j;
    public final t k;
    public final t l;
    public int m;
    public IOException n;

    public u(int i, m connection, boolean z, boolean z2, x40.p pVar) {
        kotlin.jvm.internal.m.e(connection, "connection");
        this.a = i;
        this.b = connection;
        this.f = connection.Q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new s(this, connection.P.a(), z2);
        this.j = new r(this, z);
        this.k = new t(this);
        this.l = new t(this);
        if (pVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(pVar);
        }
    }

    public final void a() {
        boolean z;
        boolean zH;
        byte[] bArr = y40.b.a;
        synchronized (this) {
            try {
                s sVar = this.i;
                if (sVar.B || !sVar.E) {
                    z = false;
                } else {
                    r rVar = this.j;
                    if (rVar.A || rVar.C) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zH) {
                return;
            }
            this.b.l(this.a);
        }
    }

    public final void b() throws IOException {
        r rVar = this.j;
        if (rVar.C) {
            throw new IOException("stream closed");
        }
        if (rVar.A) {
            throw new IOException("stream finished");
        }
        if (this.m != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.m;
            g4.c.p(i);
            throw new StreamResetException(i);
        }
    }

    public final void c(int i, IOException iOException) {
        g4.c.q(i, "rstStatusCode");
        if (d(i, iOException)) {
            m mVar = this.b;
            mVar.getClass();
            g4.c.q(i, "statusCode");
            mVar.W.A(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = y40.b.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.B && this.j.A) {
                return false;
            }
            this.b.l(this.a);
            return true;
        }
    }

    public final void e(int i) {
        g4.c.q(i, "errorCode");
        if (d(i, null)) {
            this.b.A(this.a, i);
        }
    }

    public final r f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != 0) {
                return false;
            }
            s sVar = this.i;
            if (sVar.B || sVar.E) {
                r rVar = this.j;
                if ((rVar.A || rVar.C) && this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(x40.p headers, boolean z) {
        boolean zH;
        kotlin.jvm.internal.m.e(headers, "headers");
        byte[] bArr = y40.b.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(headers);
                }
                if (z) {
                    this.i.B = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.l(this.a);
    }

    public final synchronized void j(int i) {
        g4.c.q(i, "errorCode");
        if (this.m == 0) {
            this.m = i;
            notifyAll();
        }
    }
}
