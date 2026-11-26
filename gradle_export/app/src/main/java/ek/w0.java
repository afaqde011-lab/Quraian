package ek;

import java.io.IOException;

public class w0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        int iT0 = aVar.t0();
        if (iT0 != 9) {
            return iT0 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.r0())) : Boolean.valueOf(aVar.S());
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            bVar.G();
            return;
        }
        bVar.q0();
        bVar.a();
        bVar.A.write(bool.booleanValue() ? "true" : "false");
    }
}
