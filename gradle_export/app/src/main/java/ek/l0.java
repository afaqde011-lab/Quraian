package ek;

import java.io.IOException;

public class l0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() != 9) {
            return new StringBuffer(aVar.r0());
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        bVar.o0(stringBuffer == null ? null : stringBuffer.toString());
    }
}
