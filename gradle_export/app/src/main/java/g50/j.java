package g50;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class j implements m {
    public static final i a = new i();

    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override
    public final boolean b() {
        boolean z = f50.g.d;
        return f50.g.d;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            f50.m mVar = f50.m.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) f50.c.m(protocols).toArray(new String[0]));
        }
    }
}
