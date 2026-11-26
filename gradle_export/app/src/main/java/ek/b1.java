package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class b1 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        try {
            return new AtomicInteger(aVar.b0());
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        bVar.f0(((AtomicInteger) obj).get());
    }
}
