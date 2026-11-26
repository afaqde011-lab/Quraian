package b50;

import b3.j0;
import e50.u;
import e50.v;
import e50.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k50.b0;
import k50.c0;
import k50.k0;
import okhttp3.internal.connection.RouteException;
import qd.s0;
import sd.y1;
import x40.a0;
import x40.e0;
import x40.p;
import x40.q;
import x40.w;
import x40.x;
import x40.z;

public final class m extends e50.g {
    public final e0 b;
    public Socket c;
    public Socket d;
    public x40.o e;
    public x f;
    public e50.m g;
    public c0 h;
    public b0 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public m(n connectionPool, e0 route) {
        kotlin.jvm.internal.m.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.m.e(route, "route");
        this.b = route;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(w wVar, e0 failedRoute, IOException failure) {
        kotlin.jvm.internal.m.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.m.e(failure, "failure");
        if (failedRoute.b.type() != Proxy.Type.DIRECT) {
            x40.a aVar = failedRoute.a;
            aVar.g.connectFailed(aVar.h.h(), failedRoute.b.address(), failure);
        }
        qj.c cVar = wVar.Y;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.B).add(failedRoute);
        }
    }

    @Override
    public final synchronized void a(e50.m mVar, y settings) {
        kotlin.jvm.internal.m.e(settings, "settings");
        this.o = (settings.a & 16) != 0 ? settings.b[4] : Integer.MAX_VALUE;
    }

    @Override
    public final void b(u uVar) {
        uVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, j jVar) throws Throwable {
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.b.a.j;
        b bVar = new b(list);
        x40.a aVar = this.b.a;
        if (aVar.c == null) {
            if (!list.contains(x40.k.f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            f50.m mVar = f50.m.a;
            if (!f50.m.a.f(str)) {
                throw new RouteException(new UnknownServiceException(a1.b.p("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.i.contains(x.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                e0 e0Var = this.b;
                if (e0Var.a.c != null && e0Var.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i, i2, jVar);
                g(bVar, jVar);
                InetSocketAddress inetSocketAddress = this.b.c;
                kotlin.jvm.internal.m.e(inetSocketAddress, "inetSocketAddress");
                break;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    y40.b.e(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    y40.b.e(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                InetSocketAddress inetSocketAddress2 = this.b.c;
                kotlin.jvm.internal.m.e(inetSocketAddress2, "inetSocketAddress");
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    s0.V(routeException.A, e);
                    routeException.B = e;
                }
                if (!z) {
                    throw routeException;
                }
                bVar.c = true;
                if (!bVar.b) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
                if (!(e instanceof SSLException)) {
                    throw routeException;
                }
            }
        }
        e0 e0Var2 = this.b;
        if (e0Var2.a.c != null && e0Var2.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, j jVar) throws IOException {
        Socket socketCreateSocket;
        e0 e0Var = this.b;
        Proxy proxy = e0Var.b;
        x40.a aVar = e0Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = aVar.b.createSocket();
            kotlin.jvm.internal.m.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.b.c;
        kotlin.jvm.internal.m.e(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i2);
        try {
            f50.m mVar = f50.m.a;
            f50.m mVar2 = f50.m.a;
            InetSocketAddress address = this.b.c;
            mVar2.getClass();
            kotlin.jvm.internal.m.e(address, "address");
            socketCreateSocket.connect(address, i);
            try {
                this.h = bi.b.r(bi.b.T(socketCreateSocket));
                this.i = bi.b.q(bi.b.R(socketCreateSocket));
            } catch (NullPointerException e) {
                if (kotlin.jvm.internal.m.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) throws IOException {
        q qVar;
        ce.c cVar = new ce.c(18);
        e0 e0Var = this.b;
        q url = e0Var.a.h;
        kotlin.jvm.internal.m.e(url, "url");
        cVar.B = url;
        w wVar = null;
        cVar.B("CONNECT", (z) null);
        x40.a aVar = e0Var.a;
        boolean z = true;
        cVar.z("Host", y40.b.v(aVar.h, true));
        cVar.z("Proxy-Connection", "Keep-Alive");
        cVar.z("User-Agent", "okhttp/4.12.0");
        th.o oVarR = cVar.r();
        db.g gVar = new db.g(9, (byte) 0);
        c50.g gVar2 = y40.b.c;
        w00.a.m("Proxy-Authenticate");
        w00.a.n("OkHttp-Preemptive", "Proxy-Authenticate");
        gVar.q("Proxy-Authenticate");
        gVar.e("Proxy-Authenticate", "OkHttp-Preemptive");
        th.o oVarA = aVar.f.a(e0Var, new x40.b0(oVarR, x.HTTP_1_1, "Preemptive Authenticate", 407, null, gVar.j(), gVar2, null, null, null, -1L, -1L, null));
        if (oVarA != null) {
            oVarR = oVarA;
        }
        q qVar2 = (q) oVarR.C;
        int i4 = 0;
        while (i4 < 21) {
            e(i, i2, jVar);
            String str = "CONNECT " + y40.b.v(qVar2, z) + " HTTP/1.1";
            while (true) {
                c0 c0Var = this.h;
                kotlin.jvm.internal.m.b(c0Var);
                b0 b0Var = this.i;
                kotlin.jvm.internal.m.b(b0Var);
                d50.g gVar3 = new d50.g(wVar, this, c0Var, b0Var);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c0Var.A.c().g(i2);
                qVar = qVar2;
                b0Var.A.c().g(i3);
                gVar3.j((p) oVarR.D, str);
                gVar3.b();
                a0 a0VarD = gVar3.d(false);
                kotlin.jvm.internal.m.b(a0VarD);
                a0VarD.a = oVarR;
                x40.b0 b0VarA = a0VarD.a();
                int i5 = b0VarA.D;
                long j = y40.b.j(b0VarA);
                if (j != -1) {
                    d50.d dVarI = gVar3.i(j);
                    y40.b.t(dVarI, Integer.MAX_VALUE);
                    dVarI.close();
                }
                if (i5 == 200) {
                    if (!c0Var.B.A() || !b0Var.B.A()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    oVarR = null;
                    break;
                }
                if (i5 != 407) {
                    throw new IOException(g4.c.f(i5, "Unexpected response code for CONNECT: "));
                }
                th.o oVarA2 = aVar.f.a(e0Var, b0VarA);
                if (oVarA2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                oVarR = oVarA2;
                if ("close".equalsIgnoreCase(x40.b0.a("Connection", b0VarA))) {
                    break;
                }
                qVar2 = qVar;
                wVar = null;
                i2 = i2;
            }
            if (oVarR == null) {
                return;
            }
            Socket socket = this.c;
            if (socket != null) {
                y40.b.e(socket);
            }
            this.c = null;
            this.i = null;
            this.h = null;
            InetSocketAddress inetSocketAddress = e0Var.c;
            kotlin.jvm.internal.m.e(inetSocketAddress, "inetSocketAddress");
            i4++;
            wVar = null;
            qVar2 = qVar;
            z = true;
        }
    }

    public final void g(b bVar, j jVar) throws Throwable {
        x xVarE = x.HTTP_1_1;
        x40.a aVar = this.b.a;
        SSLSocketFactory sSLSocketFactory = aVar.c;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            x xVar = x.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(xVar)) {
                this.d = this.c;
                this.f = xVarE;
                return;
            } else {
                this.d = this.c;
                this.f = xVar;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strE = null;
        try {
            kotlin.jvm.internal.m.b(sSLSocketFactory);
            Socket socket = this.c;
            q qVar = aVar.h;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, qVar.d, qVar.e, true);
            kotlin.jvm.internal.m.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                x40.k kVarA = bVar.a(sSLSocket2);
                if (kVarA.b) {
                    f50.m mVar = f50.m.a;
                    f50.m.a.d(sSLSocket2, aVar.h.d, aVar.i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.m.d(sslSocketSession, "sslSocketSession");
                x40.o oVarK = va.a.K(sslSocketSession);
                HostnameVerifier hostnameVerifier = aVar.d;
                kotlin.jvm.internal.m.b(hostnameVerifier);
                int i = 0;
                if (hostnameVerifier.verify(aVar.h.d, sslSocketSession)) {
                    x40.h hVar = aVar.e;
                    kotlin.jvm.internal.m.b(hVar);
                    this.e = new x40.o(oVarK.a, oVarK.b, oVarK.c, new l(hVar, oVarK, aVar, i));
                    hVar.a(aVar.h.d, new j0(this, 2));
                    if (kVarA.b) {
                        f50.m mVar2 = f50.m.a;
                        strE = f50.m.a.e(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = bi.b.r(bi.b.T(sSLSocket2));
                    this.i = bi.b.q(bi.b.R(sSLSocket2));
                    if (strE != null) {
                        xVarE = ta.c0.E(strE);
                    }
                    this.f = xVarE;
                    f50.m mVar3 = f50.m.a;
                    f50.m.a.a(sSLSocket2);
                    if (this.f == x.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = oVarK.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.h.d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                x40.h hVar2 = x40.h.c;
                sb.append(rd.a.O(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(h00.q.Y0(j50.c.a(x509Certificate, 2), j50.c.a(x509Certificate, 7)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(r30.l.k0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    f50.m mVar4 = f50.m.a;
                    f50.m.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    y40.b.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(x40.a aVar, List list) throws NoSuchAlgorithmException {
        x40.o oVar;
        q qVar = aVar.h;
        byte[] bArr = y40.b.a;
        if (this.p.size() < this.o && !this.j) {
            e0 e0Var = this.b;
            x40.a aVar2 = e0Var.a;
            x40.a aVar3 = e0Var.a;
            if (aVar2.a(aVar)) {
                String str = qVar.d;
                String hostname = qVar.d;
                if (!kotlin.jvm.internal.m.a(str, aVar3.h.d)) {
                    if (this.g != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            e0 e0Var2 = (e0) it.next();
                            Proxy.Type type = e0Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && e0Var.b.type() == type2 && kotlin.jvm.internal.m.a(e0Var.c, e0Var2.c)) {
                                if (aVar.d != j50.c.a) {
                                    break;
                                }
                                byte[] bArr2 = y40.b.a;
                                q qVar2 = aVar3.h;
                                if (qVar.e != qVar2.e) {
                                    break;
                                }
                                if (!kotlin.jvm.internal.m.a(hostname, qVar2.d)) {
                                    if (!this.k && (oVar = this.e) != null) {
                                        List listA = oVar.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!j50.c.c(hostname, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    x40.h hVar = aVar.e;
                                    kotlin.jvm.internal.m.b(hVar);
                                    x40.o oVar2 = this.e;
                                    kotlin.jvm.internal.m.b(oVar2);
                                    List peerCertificates = oVar2.a();
                                    kotlin.jvm.internal.m.e(hostname, "hostname");
                                    kotlin.jvm.internal.m.e(peerCertificates, "peerCertificates");
                                    hVar.a(hostname, new l(hVar, peerCertificates, hostname, 5));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = y40.b.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        kotlin.jvm.internal.m.b(socket);
        Socket socket2 = this.d;
        kotlin.jvm.internal.m.b(socket2);
        c0 c0Var = this.h;
        kotlin.jvm.internal.m.b(c0Var);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        e50.m mVar = this.g;
        if (mVar != null) {
            synchronized (mVar) {
                if (mVar.F) {
                    return false;
                }
                return mVar.N >= mVar.M || jNanoTime < mVar.O;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !c0Var.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final c50.d j(w wVar, c50.f fVar) {
        int i = fVar.d;
        Socket socket = this.d;
        kotlin.jvm.internal.m.b(socket);
        c0 c0Var = this.h;
        kotlin.jvm.internal.m.b(c0Var);
        b0 b0Var = this.i;
        kotlin.jvm.internal.m.b(b0Var);
        e50.m mVar = this.g;
        if (mVar != null) {
            return new e50.n(wVar, this, fVar, mVar);
        }
        socket.setSoTimeout(i);
        k0 k0VarC = c0Var.A.c();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        k0VarC.g(j);
        b0Var.A.c().g(fVar.e);
        return new d50.g(wVar, this, c0Var, b0Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        int i;
        Socket socket = this.d;
        kotlin.jvm.internal.m.b(socket);
        c0 c0Var = this.h;
        kotlin.jvm.internal.m.b(c0Var);
        b0 b0Var = this.i;
        kotlin.jvm.internal.m.b(b0Var);
        socket.setSoTimeout(0);
        a50.e taskRunner = a50.e.h;
        kotlin.jvm.internal.m.e(taskRunner, "taskRunner");
        y1 y1Var = new y1();
        y1Var.a = taskRunner;
        y1Var.f = e50.g.a;
        String peerName = this.b.a.h.d;
        kotlin.jvm.internal.m.e(peerName, "peerName");
        y1Var.b = socket;
        String str = y40.b.g + ' ' + peerName;
        kotlin.jvm.internal.m.e(str, "<set-?>");
        y1Var.c = str;
        y1Var.d = c0Var;
        y1Var.e = b0Var;
        y1Var.f = this;
        e50.m mVar = new e50.m(y1Var);
        this.g = mVar;
        y yVar = e50.m.Z;
        this.o = (yVar.a & 16) != 0 ? yVar.b[4] : Integer.MAX_VALUE;
        v vVar = mVar.W;
        synchronized (vVar) {
            try {
                if (vVar.D) {
                    throw new IOException("closed");
                }
                Logger logger = v.F;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(y40.b.h(">> CONNECTION " + e50.e.a.e(), new Object[0]));
                }
                vVar.A.V(e50.e.a);
                vVar.A.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        v vVar2 = mVar.W;
        y settings = mVar.P;
        synchronized (vVar2) {
            try {
                kotlin.jvm.internal.m.e(settings, "settings");
                if (vVar2.D) {
                    throw new IOException("closed");
                }
                vVar2.l(0, Integer.bitCount(settings.a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z = true;
                    if (((1 << i2) & settings.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i2 != 4) {
                            i = i2 != 7 ? i2 : 4;
                        } else {
                            i = 3;
                        }
                        vVar2.A.writeShort(i);
                        vVar2.A.writeInt(settings.b[i2]);
                    }
                    i2++;
                }
                vVar2.A.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = mVar.P.a();
        if (iA != 65535) {
            mVar.W.F(0, iA - 65535);
        }
        taskRunner.e().c(new a50.b(0, mVar.X, mVar.C), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        e0 e0Var = this.b;
        sb.append(e0Var.a.h.d);
        sb.append(':');
        sb.append(e0Var.a.h.e);
        sb.append(", proxy=");
        sb.append(e0Var.b);
        sb.append(" hostAddress=");
        sb.append(e0Var.c);
        sb.append(" cipherSuite=");
        x40.o oVar = this.e;
        if (oVar == null || (obj = oVar.b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
