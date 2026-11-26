package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Currency;

public class q0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        String strR0 = aVar.r0();
        try {
            return Currency.getInstance(strR0);
        } catch (IllegalArgumentException e3) {
            StringBuilder sbN = g4.c.n("Failed parsing '", strR0, "' as Currency; at path ");
            sbN.append(aVar.F(true));
            throw new JsonSyntaxException(sbN.toString(), e3);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        bVar.o0(((Currency) obj).getCurrencyCode());
    }
}
