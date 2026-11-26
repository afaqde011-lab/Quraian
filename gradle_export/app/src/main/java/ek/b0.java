package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

public class b0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        try {
            return Long.valueOf(aVar.f0());
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.G();
        } else {
            bVar.f0(number.longValue());
        }
    }
}
