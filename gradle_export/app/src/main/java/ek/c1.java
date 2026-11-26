package ek;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class c1 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        return new AtomicBoolean(aVar.S());
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        bVar.p0(((AtomicBoolean) obj).get());
    }
}
