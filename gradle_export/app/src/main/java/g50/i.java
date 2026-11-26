package g50;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class i implements k {
    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return f50.g.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}
