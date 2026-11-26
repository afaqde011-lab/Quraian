package e50;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k50.b0;
import k50.c0;
import sd.y1;

public final class m implements Closeable {
    public static final y Z;
    public final g A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final String C;
    public int D;
    public int E;
    public boolean F;
    public final a50.e G;
    public final a50.c H;
    public final a50.c I;
    public final a50.c J;
    public final x K;
    public long L;
    public long M;
    public long N;
    public long O;
    public final y P;
    public y Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public final Socket V;
    public final v W;
    public final a20.a X;
    public final LinkedHashSet Y;

    static {
        y yVar = new y();
        yVar.c(7, 65535);
        yVar.c(5, 16384);
        Z = yVar;
    }

    public m(y1 y1Var) {
        this.A = (g) y1Var.f;
        String str = (String) y1Var.c;
        if (str == null) {
            kotlin.jvm.internal.m.k("connectionName");
            throw null;
        }
        this.C = str;
        this.E = 3;
        a50.e eVar = (a50.e) y1Var.a;
        this.G = eVar;
        this.H = eVar.e();
        this.I = eVar.e();
        this.J = eVar.e();
        this.K = x.a;
        y yVar = new y();
        yVar.c(7, 16777216);
        this.P = yVar;
        y yVar2 = Z;
        this.Q = yVar2;
        this.U = yVar2.a();
        Socket socket = (Socket) y1Var.b;
        if (socket == null) {
            kotlin.jvm.internal.m.k("socket");
            throw null;
        }
        this.V = socket;
        b0 b0Var = (b0) y1Var.e;
        if (b0Var == null) {
            kotlin.jvm.internal.m.k("sink");
            throw null;
        }
        this.W = new v(b0Var);
        c0 c0Var = (c0) y1Var.d;
        if (c0Var == null) {
            kotlin.jvm.internal.m.k("source");
            throw null;
        }
        this.X = new a20.a(17, this, new q(c0Var), false);
        this.Y = new LinkedHashSet();
    }

    public final void A(int i, int i2) {
        g4.c.q(i2, "errorCode");
        this.H.c(new i(this.C + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void F(int i, long j) {
        this.H.c(new l(this.C + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        g4.c.q(i, "connectionCode");
        g4.c.q(i2, "streamCode");
        byte[] bArr = y40.b.a;
        try {
            r(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.B.isEmpty()) {
                array = null;
            } else {
                array = this.B.values().toArray(new u[0]);
                this.B.clear();
            }
        }
        u[] uVarArr = (u[]) array;
        if (uVarArr != null) {
            for (u uVar : uVarArr) {
                try {
                    uVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.W.close();
        } catch (IOException unused3) {
        }
        try {
            this.V.close();
        } catch (IOException unused4) {
        }
        this.H.e();
        this.I.e();
        this.J.e();
    }

    @Override
    public final void close() {
        a(1, 9, null);
    }

    public final void flush() {
        this.W.flush();
    }

    public final synchronized u i(int i) {
        return (u) this.B.get(Integer.valueOf(i));
    }

    public final synchronized u l(int i) {
        u uVar;
        uVar = (u) this.B.remove(Integer.valueOf(i));
        notifyAll();
        return uVar;
    }

    public final void r(int i) {
        g4.c.q(i, "statusCode");
        synchronized (this.W) {
            synchronized (this) {
                if (this.F) {
                    return;
                }
                this.F = true;
                this.W.r(this.D, i, y40.b.a);
            }
        }
    }

    public final synchronized void v(long j) {
        long j2 = this.R + j;
        this.R = j2;
        long j3 = j2 - this.S;
        if (j3 >= this.P.a() / 2) {
            F(0, j3);
            this.S += j3;
        }
    }

    public final void x(int i, boolean z, k50.i iVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.W.i(z, i, iVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.T;
                            j3 = this.U;
                            if (j2 >= j3) {
                                if (!this.B.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.W.C);
                j4 = iMin;
                this.T += j4;
            }
            j -= j4;
            this.W.i(z && j == 0, i, iVar, iMin);
        }
    }
}
