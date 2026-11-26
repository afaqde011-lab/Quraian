package ek;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

public class s0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.r0(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (strNextToken2 == null && strNextToken3 == null) {
            return new Locale(strNextToken);
        }
        return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        bVar.o0(locale == null ? null : locale.toString());
    }
}
