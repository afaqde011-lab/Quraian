package uh;

import java.security.GeneralSecurityException;
import th.t;
import yh.q1;

public abstract class e {

    public static final th.k f15274a;

    public static final th.j f15275b;

    public static final th.c f15276c;

    public static final th.a f15277d;

    static {
        ai.a aVarB = t.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f15274a = new th.k(d.class);
        f15275b = new th.j(aVarB);
        f15276c = new th.c(a.class);
        f15277d = new th.a(aVarB, new oj.l(28));
    }

    public static c a(q1 q1Var) throws GeneralSecurityException {
        int iOrdinal = q1Var.ordinal();
        if (iOrdinal == 1) {
            return c.f15258c;
        }
        if (iOrdinal == 2) {
            return c.f15260e;
        }
        if (iOrdinal == 3) {
            return c.f15261f;
        }
        if (iOrdinal == 4) {
            return c.f15259d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var.getNumber());
    }
}
