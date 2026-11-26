package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

public class y0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        try {
            int iB0 = aVar.b0();
            if (iB0 <= 255 && iB0 >= -128) {
                return Byte.valueOf((byte) iB0);
            }
            StringBuilder sbQ = oi.k.q("Lossy conversion from ", iB0, " to byte; at path ");
            sbQ.append(aVar.F(true));
            throw new JsonSyntaxException(sbQ.toString());
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
            bVar.f0(number.byteValue());
        }
    }
}
