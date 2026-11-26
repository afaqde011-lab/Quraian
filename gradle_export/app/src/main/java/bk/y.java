package bk;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;

public abstract class y {
    public static final u A;
    public static final v B;
    public static final y[] C;

    static {
        u uVar = new u();
        A = uVar;
        v vVar = new v();
        B = vVar;
        C = new y[]{uVar, vVar, new y() {
            public static Double b(String str, ik.a aVar) throws MalformedJsonException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (aVar.O != 1) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.F(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e3) {
                    StringBuilder sbN = g4.c.n("Cannot parse ", str, "; at path ");
                    sbN.append(aVar.F(true));
                    throw new JsonParseException(sbN.toString(), e3);
                }
            }

            @Override
            public final Number a(ik.a aVar) throws IOException {
                String strR0 = aVar.r0();
                if (strR0.indexOf(46) >= 0) {
                    return b(strR0, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strR0));
                } catch (NumberFormatException unused) {
                    return b(strR0, aVar);
                }
            }
        }, new y() {
            @Override
            public final Number a(ik.a aVar) throws IOException {
                String strR0 = aVar.r0();
                try {
                    return dk.h.i(strR0);
                } catch (NumberFormatException e3) {
                    StringBuilder sbN = g4.c.n("Cannot parse ", strR0, "; at path ");
                    sbN.append(aVar.F(true));
                    throw new JsonParseException(sbN.toString(), e3);
                }
            }
        }};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) C.clone();
    }

    public abstract Number a(ik.a aVar);
}
