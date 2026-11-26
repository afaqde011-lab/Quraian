package x40;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class e0 {
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public e0(a aVar, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "socketAddress");
        this.a = aVar;
        this.b = proxy;
        this.c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.m.a(e0Var.a, this.a) && kotlin.jvm.internal.m.a(e0Var.b, this.b) && kotlin.jvm.internal.m.a(e0Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
