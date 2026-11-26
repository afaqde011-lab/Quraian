package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.math.BigDecimal;

public class g0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        String strR0 = aVar.r0();
        try {
            return dk.h.i(strR0);
        } catch (NumberFormatException e3) {
            StringBuilder sbN = g4.c.n("Failed parsing '", strR0, "' as BigDecimal; at path ");
            sbN.append(aVar.F(true));
            throw new JsonSyntaxException(sbN.toString(), e3);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        bVar.n0((BigDecimal) obj);
    }
}
