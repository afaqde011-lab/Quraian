package b50;

import h00.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import x40.b0;
import x40.q;
import x40.w;

public final class j implements Cloneable {
    public final w A;
    public final th.o B;
    public final n C;
    public final i D;
    public final AtomicBoolean E;
    public Throwable F;
    public f G;
    public m H;
    public e I;
    public boolean J;
    public boolean K;
    public boolean L;
    public volatile boolean M;
    public volatile e N;
    public volatile m O;

    public j(w wVar, th.o originalRequest) {
        kotlin.jvm.internal.m.e(originalRequest, "originalRequest");
        this.A = wVar;
        this.B = originalRequest;
        this.C = (n) wVar.B.B;
        wVar.E.getClass();
        i iVar = new i(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.g(0);
        this.D = iVar;
        this.E = new AtomicBoolean();
        this.L = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.M ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((q) jVar.B.C).g());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = y40.b.a;
        if (this.H != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.H = mVar;
        mVar.p.add(new h(this, this.F));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM;
        byte[] bArr = y40.b.a;
        m mVar = this.H;
        if (mVar != null) {
            synchronized (mVar) {
                socketM = m();
            }
            if (this.H == null) {
                if (socketM != null) {
                    y40.b.e(socketM);
                }
            } else if (socketM != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.D.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.m.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void cancel() {
        Socket socket;
        if (this.M) {
            return;
        }
        this.M = true;
        e eVar = this.N;
        if (eVar != null) {
            ((c50.d) eVar.d).cancel();
        }
        m mVar = this.O;
        if (mVar == null || (socket = mVar.c) == null) {
            return;
        }
        y40.b.e(socket);
    }

    public final Object clone() {
        return new j(this.A, this.B);
    }

    public final void d() {
        f50.m mVar = f50.m.a;
        f50.m.a.getClass();
        this.F = f50.m.b.isLoggable(Level.FINE) ? new Throwable("response.body().close()") : null;
    }

    public final void e(x40.f fVar) {
        g gVar;
        if (!this.E.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        d();
        p10.a aVar = this.A.A;
        g gVar2 = new g(this, fVar);
        aVar.getClass();
        synchronized (aVar) {
            ((ArrayDeque) aVar.B).add(gVar2);
            String str = ((q) this.B.C).d;
            Iterator it = ((ArrayDeque) aVar.C).iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) aVar.B).iterator();
                    do {
                        if (!it2.hasNext()) {
                            gVar = null;
                            break;
                        }
                        gVar = (g) it2.next();
                    } while (!kotlin.jvm.internal.m.a(((q) gVar.C.B.C).d, str));
                } else {
                    gVar = (g) it.next();
                }
            } while (!kotlin.jvm.internal.m.a(((q) gVar.C.B.C).d, str));
            if (gVar != null) {
                gVar2.B = gVar.B;
            }
        }
        aVar.s();
    }

    public final b0 f() {
        if (!this.E.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.D.h();
        d();
        try {
            p10.a aVar = this.A.A;
            synchronized (aVar) {
                ((ArrayDeque) aVar.D).add(this);
            }
            b0 b0VarH = h();
            p10.a aVar2 = this.A.A;
            aVar2.k((ArrayDeque) aVar2.D, this);
            return b0VarH;
        } catch (Throwable th) {
            p10.a aVar3 = this.A.A;
            aVar3.k((ArrayDeque) aVar3.D, this);
            throw th;
        }
    }

    public final void g(boolean z) {
        e eVar;
        synchronized (this) {
            if (!this.L) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (eVar = this.N) != null) {
            ((c50.d) eVar.d).cancel();
            ((j) eVar.b).j(eVar, true, true, null);
        }
        this.I = null;
    }

    public final b0 h() {
        ArrayList arrayList = new ArrayList();
        v.u0(this.A.C, arrayList);
        arrayList.add(new c50.a(this.A));
        arrayList.add(new c50.a(this.A.J));
        arrayList.add(new z40.b());
        arrayList.add(a.b);
        v.u0(this.A.D, arrayList);
        arrayList.add(new c50.b(0));
        th.o oVar = this.B;
        w wVar = this.A;
        try {
            try {
                b0 b0VarF = new c50.f(this, arrayList, 0, null, oVar, wVar.V, wVar.W, wVar.X).f(this.B);
                if (this.M) {
                    y40.b.d(b0VarF);
                    throw new IOException("Canceled");
                }
                k(null);
                return b0VarF;
            } catch (IOException e) {
                IOException iOExceptionK = k(e);
                kotlin.jvm.internal.m.c(iOExceptionK, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionK;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                k(null);
            }
            throw th;
        }
    }

    public final IOException j(e exchange, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kotlin.jvm.internal.m.e(exchange, "exchange");
        if (exchange.equals(this.N)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.J) {
                            if (z) {
                                this.J = false;
                            }
                            if (z2) {
                                this.K = false;
                            }
                            z5 = this.J;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.K) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.J = false;
                            }
                            if (z2) {
                                this.K = false;
                            }
                            z5 = this.J;
                            if (z5 || this.K) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.K && !this.L) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.N = null;
                m mVar = this.H;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.m++;
                    }
                }
            }
            if (z4) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException k(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.L) {
                this.L = false;
                if (!this.J && !this.K) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket m() {
        m mVar = this.H;
        kotlin.jvm.internal.m.b(mVar);
        byte[] bArr = y40.b.a;
        ArrayList arrayList = mVar.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.m.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.H = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        mVar.q = System.nanoTime();
        n nVar = this.C;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) nVar.e;
        a50.c cVar = (a50.c) nVar.c;
        byte[] bArr2 = y40.b.a;
        if (!mVar.j) {
            cVar.c((a50.b) nVar.d, 0L);
            return null;
        }
        mVar.j = true;
        concurrentLinkedQueue.remove(mVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = mVar.d;
        kotlin.jvm.internal.m.b(socket);
        return socket;
    }
}
