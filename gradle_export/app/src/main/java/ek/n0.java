package ek;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class n0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        try {
            String strR0 = aVar.r0();
            if (strR0.equals("null")) {
                return null;
            }
            return new URI(strR0);
        } catch (URISyntaxException e3) {
            throw new JsonIOException(e3);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        bVar.o0(uri == null ? null : uri.toASCIIString());
    }
}
