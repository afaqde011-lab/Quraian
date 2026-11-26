package ek;

import java.io.IOException;
import java.net.InetAddress;

public class o0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() != 9) {
            return InetAddress.getByName(aVar.r0());
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.o0(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
