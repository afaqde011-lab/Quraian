package e50;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k50.g0;
import k50.i0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import ta.c0;
import x40.a0;
import x40.b0;
import x40.z;

public final class n implements c50.d {
    public static final List g = y40.b.k("connection", DiagnosticsTracker.HOST_KEY, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = y40.b.k("connection", DiagnosticsTracker.HOST_KEY, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final b50.m a;
    public final c50.f b;
    public final m c;
    public volatile u d;
    public final x40.x e;
    public volatile boolean f;

    public n(x40.w wVar, b50.m mVar, c50.f fVar, m http2Connection) {
        kotlin.jvm.internal.m.e(http2Connection, "http2Connection");
        this.a = mVar;
        this.b = fVar;
        this.c = http2Connection;
        List list = wVar.R;
        x40.x xVar = x40.x.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(xVar) ? xVar : x40.x.HTTP_2;
    }

    @Override
    public final void a(th.o request) throws IOException {
        int i;
        u uVar;
        boolean z;
        kotlin.jvm.internal.m.e(request, "request");
        if (this.d != null) {
            return;
        }
        boolean z2 = ((z) request.E) != null;
        x40.p pVar = (x40.p) request.D;
        ArrayList arrayList = new ArrayList(pVar.size() + 4);
        arrayList.add(new a(a.f, (String) request.B));
        k50.l lVar = a.g;
        x40.q url = (x40.q) request.C;
        kotlin.jvm.internal.m.e(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new a(lVar, strB));
        String strA = ((x40.p) request.D).a("Host");
        if (strA != null) {
            arrayList.add(new a(a.i, strA));
        }
        arrayList.add(new a(a.h, url.a));
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strC = pVar.c(i2);
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = strC.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.m.a(pVar.h(i2), "trailers"))) {
                arrayList.add(new a(lowerCase, pVar.h(i2)));
            }
        }
        m mVar = this.c;
        mVar.getClass();
        boolean z3 = !z2;
        synchronized (mVar.W) {
            synchronized (mVar) {
                try {
                    if (mVar.E > 1073741823) {
                        mVar.r(8);
                    }
                    if (mVar.F) {
                        throw new ConnectionShutdownException();
                    }
                    i = mVar.E;
                    mVar.E = i + 2;
                    uVar = new u(i, mVar, z3, false, null);
                    z = !z2 || mVar.T >= mVar.U || uVar.e >= uVar.f;
                    if (uVar.h()) {
                        mVar.B.put(Integer.valueOf(i), uVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            mVar.W.v(z3, i, arrayList);
        }
        if (z) {
            mVar.W.flush();
        }
        this.d = uVar;
        if (this.f) {
            u uVar2 = this.d;
            kotlin.jvm.internal.m.b(uVar2);
            uVar2.e(9);
            throw new IOException("Canceled");
        }
        u uVar3 = this.d;
        kotlin.jvm.internal.m.b(uVar3);
        t tVar = uVar3.k;
        long j = this.b.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.g(j);
        u uVar4 = this.d;
        kotlin.jvm.internal.m.b(uVar4);
        uVar4.l.g(this.b.e);
    }

    @Override
    public final void b() {
        u uVar = this.d;
        kotlin.jvm.internal.m.b(uVar);
        uVar.f().close();
    }

    @Override
    public final g0 c(th.o request, long j) {
        kotlin.jvm.internal.m.e(request, "request");
        u uVar = this.d;
        kotlin.jvm.internal.m.b(uVar);
        return uVar.f();
    }

    @Override
    public final void cancel() {
        this.f = true;
        u uVar = this.d;
        if (uVar != null) {
            uVar.e(9);
        }
    }

    @Override
    public final a0 d(boolean z) throws IOException {
        x40.p pVar;
        u uVar = this.d;
        if (uVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (uVar) {
            uVar.k.h();
            while (uVar.g.isEmpty() && uVar.m == 0) {
                try {
                    try {
                        uVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    uVar.k.k();
                    throw th;
                }
            }
            uVar.k.k();
            if (uVar.g.isEmpty()) {
                IOException iOException = uVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = uVar.m;
                g4.c.p(i);
                throw new StreamResetException(i);
            }
            Object objRemoveFirst = uVar.g.removeFirst();
            kotlin.jvm.internal.m.d(objRemoveFirst, "headersQueue.removeFirst()");
            pVar = (x40.p) objRemoveFirst;
        }
        x40.x protocol = this.e;
        kotlin.jvm.internal.m.e(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = pVar.size();
        c50.h hVarQ = null;
        for (int i2 = 0; i2 < size; i2++) {
            String name = pVar.c(i2);
            String value = pVar.h(i2);
            if (kotlin.jvm.internal.m.a(name, ":status")) {
                hVarQ = c0.Q("HTTP/1.1 " + value);
            } else if (!h.contains(name)) {
                kotlin.jvm.internal.m.e(name, "name");
                kotlin.jvm.internal.m.e(value, "value");
                arrayList.add(name);
                arrayList.add(r30.k.j1(value).toString());
            }
        }
        if (hVarQ == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        a0 a0Var = new a0();
        a0Var.b = protocol;
        a0Var.c = hVarQ.B;
        a0Var.d = (String) hVarQ.D;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        db.g gVar = new db.g(9, (byte) 0);
        h00.v.v0(gVar.B, strArr);
        a0Var.f = gVar;
        if (z && a0Var.c == 100) {
            return null;
        }
        return a0Var;
    }

    @Override
    public final b50.m e() {
        return this.a;
    }

    @Override
    public final i0 f(b0 b0Var) {
        u uVar = this.d;
        kotlin.jvm.internal.m.b(uVar);
        return uVar.i;
    }

    @Override
    public final void g() {
        this.c.flush();
    }

    @Override
    public final long h(b0 b0Var) {
        if (c50.e.a(b0Var)) {
            return y40.b.j(b0Var);
        }
        return 0L;
    }
}
