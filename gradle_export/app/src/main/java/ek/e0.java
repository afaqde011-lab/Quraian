package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

public class e0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        String strR0 = aVar.r0();
        if (strR0.length() == 1) {
            return Character.valueOf(strR0.charAt(0));
        }
        StringBuilder sbN = g4.c.n("Expecting character, got: ", strR0, "; at ");
        sbN.append(aVar.F(true));
        throw new JsonSyntaxException(sbN.toString());
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Character ch2 = (Character) obj;
        bVar.o0(ch2 == null ? null : String.valueOf(ch2));
    }
}
