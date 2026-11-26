package h50;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

public final class a extends ProxySelector {
    public static final a a = new a();

    @Override
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override
    public final List select(URI uri) {
        if (uri != null) {
            return va.a.R(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
