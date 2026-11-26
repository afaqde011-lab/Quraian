package ek;

import java.io.IOException;
import java.net.URL;

public class m0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        String strR0 = aVar.r0();
        if (strR0.equals("null")) {
            return null;
        }
        return new URL(strR0);
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        URL url = (URL) obj;
        bVar.o0(url == null ? null : url.toExternalForm());
    }
}
