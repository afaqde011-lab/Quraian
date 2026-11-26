package c50;

import b3.i2;
import b50.j;
import b50.n;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h00.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import qd.s0;
import th.o;
import x40.a0;
import x40.b0;
import x40.d0;
import x40.e0;
import x40.m;
import x40.p;
import x40.q;
import x40.r;
import x40.s;
import x40.w;
import x40.z;

public final class a implements r {
    public final int b = 0;
    public final Object c;

    public a(m cookieJar) {
        kotlin.jvm.internal.m.e(cookieJar, "cookieJar");
        this.c = cookieJar;
    }

    public a(w wVar) {
        this.c = wVar;
    }

    public static int d(b0 b0Var, int i) {
        String strA = b0.a("Retry-After", b0Var);
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        kotlin.jvm.internal.m.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override
    public final b0 a(f fVar) {
        d0 d0Var;
        b0 b0VarF;
        SSLSocketFactory sSLSocketFactory;
        j50.c cVar;
        x40.h hVar;
        switch (this.b) {
            case 0:
                m mVar = (m) this.c;
                o oVar = (o) fVar.i;
                ce.c cVarJ = oVar.J();
                p pVar = (p) oVar.D;
                q url = (q) oVar.C;
                z zVar = (z) oVar.E;
                long j = -1;
                if (zVar != null) {
                    s sVarB = zVar.b();
                    if (sVarB != null) {
                        cVarJ.z("Content-Type", sVarB.a);
                    }
                    long jA = zVar.a();
                    if (jA != -1) {
                        cVarJ.z("Content-Length", String.valueOf(jA));
                        ((db.g) cVarJ.D).q("Transfer-Encoding");
                    } else {
                        cVarJ.z("Transfer-Encoding", "chunked");
                        ((db.g) cVarJ.D).q("Content-Length");
                    }
                }
                boolean z = false;
                if (pVar.a("Host") == null) {
                    cVarJ.z("Host", y40.b.v(url, false));
                }
                if (pVar.a("Connection") == null) {
                    cVarJ.z("Connection", "Keep-Alive");
                }
                if (pVar.a("Accept-Encoding") == null && pVar.a("Range") == null) {
                    cVarJ.z("Accept-Encoding", "gzip");
                    z = true;
                }
                mVar.getClass();
                kotlin.jvm.internal.m.e(url, "url");
                if (pVar.a("User-Agent") == null) {
                    cVarJ.z("User-Agent", "okhttp/4.12.0");
                }
                b0 b0VarF2 = fVar.f(cVarJ.r());
                p pVar2 = b0VarF2.F;
                e.b(mVar, url, pVar2);
                a0 a0VarL = b0VarF2.l();
                a0VarL.a = oVar;
                if (z && "gzip".equalsIgnoreCase(b0.a("Content-Encoding", b0VarF2)) && e.a(b0VarF2) && (d0Var = b0VarF2.G) != null) {
                    k50.s sVar = new k50.s(d0Var.v());
                    db.g gVarE = pVar2.e();
                    gVarE.q("Content-Encoding");
                    gVarE.q("Content-Length");
                    a0VarL.f = gVarE.j().e();
                    a0VarL.g = new g(b0.a("Content-Type", b0VarF2), j, bi.b.r(sVar), 0);
                }
                return a0VarL.a();
            default:
                o oVar2 = (o) fVar.i;
                j jVar = (j) fVar.g;
                List listZ0 = x.A;
                b0 b0Var = null;
                int i = 0;
                o request = oVar2;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        kotlin.jvm.internal.m.e(request, "request");
                        if (jVar.I != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar) {
                            try {
                                if (jVar.K) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.J) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z2) {
                            n nVar = jVar.C;
                            q qVar = (q) request.C;
                            w wVar = jVar.A;
                            if (qVar.j) {
                                SSLSocketFactory sSLSocketFactory2 = wVar.O;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                j50.c cVar2 = wVar.S;
                                hVar = wVar.T;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                hVar = null;
                            }
                            jVar.G = new b50.f(nVar, new x40.a(qVar.d, qVar.e, wVar.K, wVar.N, sSLSocketFactory, cVar, hVar, wVar.M, wVar.R, wVar.Q, wVar.L), jVar);
                        }
                        try {
                            if (jVar.M) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    b0VarF = fVar.f(request);
                                } catch (RouteException e) {
                                    if (!c(e.B, jVar, request, false)) {
                                        IOException iOException = e.A;
                                        kotlin.jvm.internal.m.e(iOException, "<this>");
                                        Iterator it = listZ0.iterator();
                                        while (it.hasNext()) {
                                            s0.V(iOException, (Exception) it.next());
                                        }
                                        throw iOException;
                                    }
                                    listZ0 = h00.q.Z0(e.A, listZ0);
                                    jVar.g(true);
                                    z2 = false;
                                }
                            } catch (IOException e2) {
                                if (!c(e2, jVar, request, !(e2 instanceof ConnectionShutdownException))) {
                                    Iterator it2 = listZ0.iterator();
                                    while (it2.hasNext()) {
                                        s0.V(e2, (Exception) it2.next());
                                    }
                                    throw e2;
                                }
                                listZ0 = h00.q.Z0(e2, listZ0);
                                jVar.g(true);
                                z2 = false;
                            }
                        } catch (Throwable th2) {
                            jVar.g(true);
                            throw th2;
                        }
                        break;
                    }
                    if (b0Var != null) {
                        a0 a0VarL2 = b0VarF.l();
                        a0 a0VarL3 = b0Var.l();
                        a0VarL3.g = null;
                        b0 b0VarA = a0VarL3.a();
                        if (b0VarA.G != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        a0VarL2.j = b0VarA;
                        b0VarF = a0VarL2.a();
                    }
                    b0Var = b0VarF;
                    request = b(b0Var, jVar.I);
                    if (request == null) {
                        jVar.g(false);
                        return b0Var;
                    }
                    d0 d0Var2 = b0Var.G;
                    if (d0Var2 != null) {
                        y40.b.d(d0Var2);
                    }
                    i++;
                    if (i > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i);
                    }
                    jVar.g(true);
                }
                break;
        }
    }

    public o b(b0 b0Var, b50.e eVar) throws ProtocolException {
        w wVar;
        String strA;
        o oVar;
        sg.x xVarF;
        q qVarB;
        ce.c cVarJ;
        boolean z;
        b0 b0Var2;
        b50.m mVar;
        e0 e0Var = (eVar == null || (mVar = (b50.m) eVar.e) == null) ? null : mVar.b;
        int i = b0Var.D;
        String str = (String) b0Var.A.B;
        if (i == 307 || i == 308) {
            wVar = (w) this.c;
            if (wVar.H) {
                strA = b0.a("Location", b0Var);
                oVar = b0Var.A;
                if (strA != null) {
                    q qVar = (q) oVar.C;
                    qVar.getClass();
                    xVarF = qVar.f(strA);
                    if (xVarF != null) {
                        qVarB = xVarF.b();
                    } else {
                        qVarB = null;
                    }
                    if (qVarB != null && (kotlin.jvm.internal.m.a(qVarB.a, ((q) oVar.C).a) || wVar.I)) {
                        cVarJ = oVar.J();
                        if (w50.c.Z(str)) {
                            int i2 = b0Var.D;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                cVarJ.B(str, z ? (z) oVar.E : null);
                            } else {
                                cVarJ.B("GET", (z) null);
                            }
                            if (!z) {
                                ((db.g) cVarJ.D).q("Transfer-Encoding");
                                ((db.g) cVarJ.D).q("Content-Length");
                                ((db.g) cVarJ.D).q("Content-Type");
                            }
                        }
                        if (!y40.b.a((q) oVar.C, qVarB)) {
                            ((db.g) cVarJ.D).q("Authorization");
                        }
                        cVarJ.B = qVarB;
                        return cVarJ.r();
                    }
                }
            }
        } else {
            if (i == 401) {
                return ((w) this.c).G.a(e0Var, b0Var);
            }
            if (i != 421) {
                if (i == 503) {
                    b0 b0Var3 = b0Var.J;
                    if ((b0Var3 == null || b0Var3.D != 503) && d(b0Var, Integer.MAX_VALUE) == 0) {
                        return b0Var.A;
                    }
                } else {
                    if (i == 407) {
                        kotlin.jvm.internal.m.b(e0Var);
                        if (e0Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((w) this.c).M.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case RCHTTPStatusCodes.UNSUCCESSFUL:
                            case 301:
                            case 302:
                            case 303:
                                wVar = (w) this.c;
                                if (wVar.H) {
                                    strA = b0.a("Location", b0Var);
                                    oVar = b0Var.A;
                                    if (strA != null) {
                                        q qVar2 = (q) oVar.C;
                                        qVar2.getClass();
                                        xVarF = qVar2.f(strA);
                                        if (xVarF != null) {
                                            qVarB = xVarF.b();
                                        } else {
                                            qVarB = null;
                                        }
                                        if (qVarB != null) {
                                            cVarJ = oVar.J();
                                            if (w50.c.Z(str)) {
                                                int i3 = b0Var.D;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    cVarJ.B(str, z ? (z) oVar.E : null);
                                                } else {
                                                    cVarJ.B(str, z ? (z) oVar.E : null);
                                                }
                                                if (!z) {
                                                    ((db.g) cVarJ.D).q("Transfer-Encoding");
                                                    ((db.g) cVarJ.D).q("Content-Length");
                                                    ((db.g) cVarJ.D).q("Content-Type");
                                                }
                                            }
                                            if (!y40.b.a((q) oVar.C, qVarB)) {
                                                ((db.g) cVarJ.D).q("Authorization");
                                            }
                                            cVarJ.B = qVarB;
                                            return cVarJ.r();
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((w) this.c).F && (((b0Var2 = b0Var.J) == null || b0Var2.D != 408) && d(b0Var, 0) <= 0)) {
                        return b0Var.A;
                    }
                }
            } else if (eVar != null && !kotlin.jvm.internal.m.a(((b50.f) eVar.c).b.h.d, ((b50.m) eVar.e).b.a.h.d)) {
                b50.m mVar2 = (b50.m) eVar.e;
                synchronized (mVar2) {
                    mVar2.k = true;
                }
                return b0Var.A;
            }
        }
        return null;
    }

    public boolean c(IOException iOException, j jVar, o oVar, boolean z) {
        b50.f fVar;
        int i;
        boolean zL;
        e0 e0Var;
        b50.o oVar2;
        i2 i2Var;
        b50.m mVar;
        if (!((w) this.c).F || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            fVar = jVar.G;
            kotlin.jvm.internal.m.b(fVar);
            i = fVar.f;
            if (i != 0) {
                if (fVar.i != null) {
                    zL = true;
                } else {
                    e0Var = null;
                    if (i <= 1) {
                        synchronized (mVar) {
                            if (mVar.l != 0) {
                                e0Var = mVar.b;
                            }
                        }
                    }
                    if (e0Var != null) {
                        fVar.i = e0Var;
                    } else {
                        oVar2 = fVar.d;
                        zL = oVar2 != null ? i2Var.l() : i2Var.l();
                    }
                    zL = true;
                }
            } else if (fVar.i != null) {
                zL = true;
            } else {
                e0Var = null;
                if (i <= 1) {
                    synchronized (mVar) {
                        if (mVar.l != 0) {
                            e0Var = mVar.b;
                        }
                    }
                }
                if (e0Var != null) {
                    fVar.i = e0Var;
                } else {
                    oVar2 = fVar.d;
                    if (oVar2 != null) {
                    }
                }
                zL = true;
            }
            if (!zL) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z) {
            fVar = jVar.G;
            kotlin.jvm.internal.m.b(fVar);
            i = fVar.f;
            if (i != 0 && fVar.g == 0 && fVar.h == 0) {
                zL = false;
            } else if (fVar.i != null) {
                zL = true;
            } else {
                e0Var = null;
                if (i <= 1 && fVar.g <= 1 && fVar.h <= 0 && (mVar = fVar.c.H) != null) {
                    synchronized (mVar) {
                        if (mVar.l != 0 && y40.b.a(mVar.b.a.h, fVar.b.h)) {
                            e0Var = mVar.b;
                        }
                    }
                }
                if (e0Var != null) {
                    fVar.i = e0Var;
                } else {
                    oVar2 = fVar.d;
                    if ((oVar2 != null || !oVar2.b()) && (i2Var = fVar.e) != null) {
                    }
                }
                zL = true;
            }
            if (!zL) {
                return true;
            }
        }
        return false;
    }
}
