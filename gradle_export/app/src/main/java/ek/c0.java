package ek;

import java.io.IOException;

public class c0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() != 9) {
            return Float.valueOf((float) aVar.Z());
        }
        aVar.p0();
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            bVar.G();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        bVar.n0(numberValueOf);
    }
}
