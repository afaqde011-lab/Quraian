package ek;

import java.io.IOException;

public class d0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() != 9) {
            return Double.valueOf(aVar.Z());
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.G();
        } else {
            bVar.b0(number.doubleValue());
        }
    }
}
