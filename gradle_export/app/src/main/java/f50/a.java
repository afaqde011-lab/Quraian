package f50;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import h00.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import ri.t1;

public final class a extends m {
    public static final boolean d = c.N();
    public final ArrayList c;

    public a() {
        List listC0 = n.C0(new g50.m[]{c.N() ? new g50.a() : null, new g50.l(g50.f.f), new g50.l(g50.j.a), new g50.l(g50.h.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listC0) {
            if (((g50.m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override
    public final t1 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        g50.b bVar = x509TrustManagerExtensions != null ? new g50.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new j50.a(c(x509TrustManager));
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object next;
        kotlin.jvm.internal.m.e(protocols, "protocols");
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((g50.m) next).a(sSLSocket));
        g50.m mVar = (g50.m) next;
        if (mVar != null) {
            mVar.d(sSLSocket, str, protocols);
        }
    }

    @Override
    public final String e(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((g50.m) next).a(sSLSocket));
        g50.m mVar = (g50.m) next;
        if (mVar != null) {
            return mVar.c(sSLSocket);
        }
        return null;
    }

    @Override
    public final boolean f(String hostname) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
