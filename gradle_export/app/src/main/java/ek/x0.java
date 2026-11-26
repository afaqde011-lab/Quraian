package ek;

import java.io.IOException;

public class x0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() != 9) {
            return Boolean.valueOf(aVar.r0());
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        bVar.o0(bool == null ? "null" : bool.toString());
    }
}
