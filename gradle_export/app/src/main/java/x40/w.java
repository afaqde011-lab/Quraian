package x40;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ri.t1;

public final class w implements Cloneable, e {
    public static final List Z = y40.b.k(x.HTTP_2, x.HTTP_1_1);
    public static final List a0 = y40.b.k(k.e, k.f);
    public final p10.a A;
    public final wi.b B;
    public final List C;
    public final List D;
    public final uh.k E;
    public final boolean F;
    public final c G;
    public final boolean H;
    public final boolean I;
    public final m J;
    public final m K;
    public final ProxySelector L;
    public final b M;
    public final SocketFactory N;
    public final SSLSocketFactory O;
    public final X509TrustManager P;
    public final List Q;
    public final List R;
    public final j50.c S;
    public final h T;
    public final t1 U;
    public final int V;
    public final int W;
    public final int X;
    public final qj.c Y;

    public w(v vVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.A = vVar.a;
        this.B = vVar.b;
        this.C = y40.b.w(vVar.c);
        this.D = y40.b.w(vVar.d);
        this.E = vVar.e;
        this.F = vVar.f;
        this.G = vVar.g;
        this.H = vVar.h;
        this.I = vVar.i;
        this.J = vVar.j;
        this.K = vVar.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.L = proxySelector == null ? h50.a.a : proxySelector;
        this.M = vVar.l;
        this.N = vVar.m;
        List list = vVar.n;
        this.Q = list;
        this.R = vVar.o;
        this.S = vVar.p;
        this.V = vVar.r;
        this.W = vVar.s;
        this.X = vVar.t;
        this.Y = new qj.c(7, (byte) 0);
        if (list != null && list.isEmpty()) {
            this.O = null;
            this.U = null;
            this.P = null;
            this.T = h.c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.O = null;
                this.U = null;
                this.P = null;
                this.T = h.c;
                break;
            }
            if (((k) it.next()).a) {
                f50.m mVar = f50.m.a;
                X509TrustManager x509TrustManagerJ = f50.m.a.j();
                this.P = x509TrustManagerJ;
                this.O = f50.m.a.i(x509TrustManagerJ);
                t1 t1VarB = f50.m.a.b(x509TrustManagerJ);
                this.U = t1VarB;
                h hVar = vVar.q;
                this.T = kotlin.jvm.internal.m.a(hVar.b, t1VarB) ? hVar : new h(hVar.a, t1VarB);
                break;
            }
        }
        X509TrustManager x509TrustManager = this.P;
        t1 t1Var = this.U;
        SSLSocketFactory sSLSocketFactory = this.O;
        List list2 = this.D;
        List list3 = this.C;
        kotlin.jvm.internal.m.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        kotlin.jvm.internal.m.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.Q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((k) it2.next()).a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (t1Var == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (t1Var != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.m.a(this.T, h.c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final b50.j a(th.o request) {
        kotlin.jvm.internal.m.e(request, "request");
        return new b50.j(this, request);
    }

    public final Object clone() {
        return super.clone();
    }
}
