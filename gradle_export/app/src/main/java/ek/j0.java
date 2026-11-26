package ek;

import java.io.IOException;

public class j0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() != 9) {
            return new StringBuilder(aVar.r0());
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        StringBuilder sb2 = (StringBuilder) obj;
        bVar.o0(sb2 == null ? null : sb2.toString());
    }
}
