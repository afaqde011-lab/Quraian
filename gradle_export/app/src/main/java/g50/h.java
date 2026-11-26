package g50;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class h implements m {
    public static final g a = new g();

    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override
    public final boolean b() {
        boolean z = f50.d.d;
        return f50.d.d;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            f50.m mVar = f50.m.a;
            parameters.setApplicationProtocols((String[]) f50.c.m(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
