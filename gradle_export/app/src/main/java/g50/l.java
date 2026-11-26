package g50;

import java.util.List;
import javax.net.ssl.SSLSocket;

public final class l implements m {
    public final k a;
    public m b;

    public l(k kVar) {
        this.a = kVar;
    }

    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        m mVarE = e(sSLSocket);
        if (mVarE != null) {
            return mVarE.c(sSLSocket);
        }
        return null;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        m mVarE = e(sSLSocket);
        if (mVarE != null) {
            mVarE.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
