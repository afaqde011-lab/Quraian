package x40;

import com.google.android.gms.internal.measurement.x5;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ri.t1;

public final class a {
    public final m a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final h e;
    public final c f;
    public final ProxySelector g;
    public final q h;
    public final List i;
    public final List j;

    public a(String uriHost, int i, m dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.m.e(uriHost, "uriHost");
        kotlin.jvm.internal.m.e(dns, "dns");
        kotlin.jvm.internal.m.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.m.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.m.e(protocols, "protocols");
        kotlin.jvm.internal.m.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.m.e(proxySelector, "proxySelector");
        this.a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = hVar;
        this.f = proxyAuthenticator;
        this.g = proxySelector;
        sg.x xVar = new sg.x(1);
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            xVar.c = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            xVar.c = "https";
        }
        String strP = t1.P(m.e(0, 0, 7, uriHost));
        if (strP == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        xVar.f = strP;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(g4.c.f(i, "unexpected port: ").toString());
        }
        xVar.b = i;
        this.h = xVar.b();
        this.i = y40.b.w(protocols);
        this.j = y40.b.w(connectionSpecs);
    }

    public final boolean a(a that) {
        kotlin.jvm.internal.m.e(that, "that");
        return kotlin.jvm.internal.m.a(this.a, that.a) && kotlin.jvm.internal.m.a(this.f, that.f) && kotlin.jvm.internal.m.a(this.i, that.i) && kotlin.jvm.internal.m.a(this.j, that.j) && kotlin.jvm.internal.m.a(this.g, that.g) && kotlin.jvm.internal.m.a(this.c, that.c) && kotlin.jvm.internal.m.a(this.d, that.d) && kotlin.jvm.internal.m.a(this.e, that.e) && this.h.e == that.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.h, aVar.h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + g4.c.a(g4.c.a((this.f.hashCode() + ((this.a.hashCode() + x5.e(527, this.h.i, 31)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        q qVar = this.h;
        sb.append(qVar.d);
        sb.append(':');
        sb.append(qVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
